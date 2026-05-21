package net.ibizsys.central.cloud.core.dataentity.dataimport;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import net.ibizsys.central.cloud.core.util.domain.V2ImportSchema;
import net.ibizsys.central.dataentity.IDataEntityRuntime;
import net.ibizsys.central.util.domain.ImportDataResult;
import net.ibizsys.runtime.dataentity.DataEntityRuntimeException;
import net.ibizsys.runtime.util.EntityError;
import net.ibizsys.runtime.util.IEntity;
import net.ibizsys.runtime.util.JsonUtils;

public class JsonDEDataImportRuntime extends DEDataImportRuntimeBase {

	private static final Log log = LogFactory.getLog(JsonDEDataImportRuntime.class);

	@Override
	public Map<Integer, EntityError> importStream(IEntity baseEntity, InputStream inputStream, boolean bTestPriv, IDataEntityRuntime parentDataEntityRuntime, String strParentKey) throws Throwable {
		List<Map<String, Object>> data = resolveData(baseEntity, inputStream);
		return importData(baseEntity, data, bTestPriv, parentDataEntityRuntime, strParentKey);
	}

	protected List<Map<String, Object>> resolveData(IEntity baseEntity, InputStream inputStream) {
		try {
			List<?> list = JsonUtils.asList(inputStream);
			return this.doResolveData(baseEntity, list);
		} catch (Throwable ex) {
			DataEntityRuntimeException.rethrow(this, ex);
			throw new DataEntityRuntimeException(this.getDataEntityRuntime(), String.format("解析导入Json发生异常：%s", ex.getMessage()), ex);
		}
	}
	
	protected List<Map<String, Object>> doResolveData(IEntity baseEntity, List<?> list) throws Throwable {
		return this.doResolveData(baseEntity, list, null);
	}

	protected List<Map<String, Object>> doResolveData(IEntity baseEntity, List<?> list, V2ImportSchema importSchema) throws Throwable {
		List<Map<String, Object>> importDataList = new ArrayList<>();
		
		for (int i = 0; i < list.size(); i++) {
			// 获取每一行数据
			Object row = list.get(i);
			if (!(row instanceof Map))
				continue;
			
			importDataList.add((Map)row);
			
		}
		return importDataList;
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
	
	@Override
	protected ImportDataResult onImportStream2(IEntity baseEntity, InputStream inputStream, V2ImportSchema v2ImportSchema, boolean bTestPriv, IDataEntityRuntime parentDataEntityRuntime, String strParentKey) throws Throwable {
		List<?> list = JsonUtils.asList(inputStream);
		return this.onImportStream2(baseEntity, list, v2ImportSchema, bTestPriv, parentDataEntityRuntime, strParentKey);
	}
	
	@Override
	protected Map<Integer, EntityError> onImportStream(IEntity baseEntity, InputStream inputStream, V2ImportSchema v2ImportSchema, boolean bTestPriv, IDataEntityRuntime parentDataEntityRuntime, String strParentKey) throws Throwable {
		List<?> list = JsonUtils.asList(inputStream);
		List<Map<String, Object>> data = doResolveData(baseEntity, list, v2ImportSchema);
		return importData(baseEntity, data, bTestPriv, parentDataEntityRuntime, strParentKey);
	}
}
