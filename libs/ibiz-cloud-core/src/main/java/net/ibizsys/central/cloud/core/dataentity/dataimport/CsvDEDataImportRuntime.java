package net.ibizsys.central.cloud.core.dataentity.dataimport;

import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.opencsv.CSVParser;
import com.opencsv.CSVParserBuilder;
import com.opencsv.CSVReader;
import com.opencsv.CSVReaderBuilder;

import net.ibizsys.central.cloud.core.util.domain.V2ImportSchema;
import net.ibizsys.central.dataentity.IDataEntityRuntime;
import net.ibizsys.central.util.domain.ImportDataResult;
import net.ibizsys.runtime.dataentity.DataEntityRuntimeException;
import net.ibizsys.runtime.util.EntityError;
import net.ibizsys.runtime.util.IEntity;
import net.ibizsys.runtime.util.JsonUtils;

/**
 * 基于 OpenCSV 的 CSV 数据导入运行时
 */
public class CsvDEDataImportRuntime extends DEDataImportRuntimeBase {

	private static final Log log = LogFactory.getLog(CsvDEDataImportRuntime.class);

	// ========== 可配置参数（子类可重写） ==========

	protected char getDelimiter() {
		return ',';
	}

	protected boolean hasHeader() {
		return true;
	}

	protected Charset getCharset() {
		return Charset.forName("UTF-8");
	}

	protected char getQuoteChar() {
		return '"';
	}

	protected char getEscapeChar() {
		return '\\';
	}

	protected boolean isIgnoreEmptyLines() {
		return true;
	}

	@Override
	public Map<Integer, EntityError> importStream(IEntity baseEntity, InputStream inputStream, boolean bTestPriv, IDataEntityRuntime parentDataEntityRuntime, String strParentKey) throws Throwable {
		List<Map<String, Object>> data = resolveData(baseEntity, inputStream);
		return importData(baseEntity, data, bTestPriv, parentDataEntityRuntime, strParentKey);
	}

	@Override
	public ImportDataResult importStream2(IEntity baseEntity, InputStream inputStream, boolean bTestPriv, IDataEntityRuntime parentDataEntityRuntime, String strParentKey) throws Throwable {

		try {
			List<?> list = JsonUtils.asList(inputStream);
			return this.onImportStream2(baseEntity, list, null, bTestPriv, parentDataEntityRuntime, strParentKey);
		} catch (Throwable ex) {
			DataEntityRuntimeException.rethrow(this, ex);
			throw new DataEntityRuntimeException(this.getDataEntityRuntimeBase(), this, String.format("导入数据流发生异常，%1$s", ex.getMessage()), ex);
		}
	}

	protected ImportDataResult onImportStream2(IEntity baseEntity, List<?> list, V2ImportSchema importSchema, boolean bTestPriv, IDataEntityRuntime parentDataEntityRuntime, String strParentKey) throws Throwable {
		throw new Exception("没有实现");
	}

	/**
	 * 解析输入流为 List<Map<String, Object>>，用于 importStream
	 */
	protected List<Map<String, Object>> resolveData(IEntity baseEntity, InputStream inputStream) {
		try {
			return doResolveData(baseEntity, inputStream, null);
		} catch (Throwable ex) {
			DataEntityRuntimeException.rethrow(this, ex);
			throw new DataEntityRuntimeException(this.getDataEntityRuntime(), String.format("解析导入CSV发生异常：%s", ex.getMessage()), ex);
		}
	}

	/**
	 * 核心解析方法，支持 V2ImportSchema
	 */
	protected List<Map<String, Object>> doResolveData(IEntity baseEntity, InputStream inputStream, V2ImportSchema importSchema) throws Throwable {
		List<Map<String, Object>> result = new ArrayList<>();

		// 构建 CSVParser
		CSVParser parser = new CSVParserBuilder().withSeparator(getDelimiter()).withQuoteChar(getQuoteChar()).withEscapeChar(getEscapeChar()).build();

		// 构建 CSVReader
		try (InputStreamReader reader = new InputStreamReader(inputStream, getCharset());
				CSVReader csvReader = new CSVReaderBuilder(reader).withCSVParser(parser).withSkipLines(0) // 不跳过任何行，手动处理标题
						// .withIgnoreEmptyLines(isIgnoreEmptyLines())
						.build()) {

			//逐行读取首行处理，避免内存一次性加载
			String[] firstLine = csvReader.readNext();
			if (firstLine == null || firstLine.length == 0) {
				return result;
			}
			// 手动处理BOM（防止首行解析异常）
			if (firstLine[0] != null && firstLine[0].startsWith("\uFEFF")) {
				firstLine[0] = firstLine[0].substring(1); // 移除BOM
			}

			// 处理标题行
			String[] headers = null;
			if (hasHeader()) {
				headers = firstLine;
			} else {
				// 无标题行：首行作为数据
				Map<String, Object> rowMap = new LinkedHashMap<>();
				for (int j = 0; j < firstLine.length; j++) {
					rowMap.put(String.valueOf(j), firstLine[j]);
				}
				result.add(rowMap);
			}

			// 流式读取
			String[] row;
			while ((row = csvReader.readNext()) != null) {
				Map<String, Object> rowMap = new LinkedHashMap<>();

				if (headers != null && headers.length > 0) {
					// 有标题行：用列名映射
					for (int j = 0; j < Math.min(headers.length, row.length); j++) {
						rowMap.put(headers[j], row[j]);
					}
					// 如果行有额外列（超出标题数），用索引作为键
					if (row.length > headers.length) {
						for (int j = headers.length; j < row.length; j++) {
							rowMap.put(String.valueOf(j), row[j]);
						}
					}
				} else {
					// 无标题行：用列索引作为键
					for (int j = 0; j < row.length; j++) {
						rowMap.put(String.valueOf(j), row[j]);
					}
				}
				result.add(rowMap);
			}
		}
		return result;
	}

	/**
	 * 重载：从 InputStream 直接解析并导入（使用 V2ImportSchema）
	 */
	@Override
	protected ImportDataResult onImportStream2(IEntity baseEntity, InputStream inputStream, V2ImportSchema v2ImportSchema, boolean bTestPriv, IDataEntityRuntime parentDataEntityRuntime, String strParentKey) throws Throwable {
		List<Map<String, Object>> data = doResolveData(baseEntity, inputStream, v2ImportSchema);
		return onImportStream2(baseEntity, data, v2ImportSchema, bTestPriv, parentDataEntityRuntime, strParentKey);
	}

	/**
	 * 重载：从 InputStream 直接解析并导入（返回 Map<Integer, EntityError>）
	 */
	@Override
	protected Map<Integer, EntityError> onImportStream(IEntity baseEntity, InputStream inputStream, V2ImportSchema v2ImportSchema, boolean bTestPriv, IDataEntityRuntime parentDataEntityRuntime, String strParentKey) throws Throwable {
		List<Map<String, Object>> data = doResolveData(baseEntity, inputStream, v2ImportSchema);
		return importData(baseEntity, data, bTestPriv, parentDataEntityRuntime, strParentKey);
	}

	
	/**
	 * 将 List<?> 转换为 List<Map<String, Object>>，用于 importStream2 的 list 参数 注：在
	 * CSV 中，我们通常直接从流解析，但为保持接口一致，提供此方法
	 */
	protected List<Map<String, Object>> doResolveData(IEntity baseEntity, List<?> list) throws Throwable {
		List<Map<String, Object>> result = new ArrayList<>();
		for (Object obj : list) {
			if (obj instanceof Map) {
				result.add((Map<String, Object>) obj);
			}
		}
		return result;
	}

	protected List<Map<String, Object>> doResolveData(IEntity baseEntity, List<?> list, V2ImportSchema importSchema) throws Throwable {
		return doResolveData(baseEntity, list);
	}

}