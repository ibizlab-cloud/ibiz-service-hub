package net.ibizsys.central.cloud.core.dataentity.dataexport;

import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.data.domain.Page;
import org.springframework.util.ObjectUtils;

import com.opencsv.CSVWriter;

import net.ibizsys.central.dataentity.IDataEntityRuntime;
import net.ibizsys.central.util.IEntityDTO;
import net.ibizsys.model.dataentity.dataexport.IPSDEDataExportItem;
import net.ibizsys.runtime.dataentity.DataEntityRuntimeException;

/**
 * CSV 数据导出运行时
 */
public class CsvDEDataExportRuntime extends DEDataExportRuntimeBase {

    private static final Log log = LogFactory.getLog(CsvDEDataExportRuntime.class);

    // ========== 可重写的 CSV 配置 ==========
    protected char getSeparator() {
        return CSVWriter.DEFAULT_SEPARATOR;  // 默认逗号
    }

    protected char getQuoteChar() {
        return CSVWriter.NO_QUOTE_CHARACTER; // 不加引号，可根据需要改为 '"'
    }

    protected char getEscapeChar() {
        return CSVWriter.DEFAULT_ESCAPE_CHARACTER;
    }

    protected String getLineEnd() {
        return CSVWriter.DEFAULT_LINE_END;
    }

    protected String getCharsetName() {
        return "UTF-8";
    }

    @Override
    public File exportFile(Object objData, String strMethodName, Object objBody, String strKey,
            Object objTag, boolean bTestPriv, IDataEntityRuntime parentDataEntityRuntime,
            String strParentKey) {
        try {
            List<IPSDEDataExportItem> exportItems = this.getPSDEDataExportItems();
            if (ObjectUtils.isEmpty(exportItems)) {
                throw new RuntimeException("未指定导出列");
            }

            List<Map<String, Object>> rowList = buildDataRows(objData, exportItems);

            File file = File.createTempFile("EXPORTDATA", ".csv");
            try (FileOutputStream fos = new FileOutputStream(file)) {
                writeCsv(rowList, exportItems, fos);
            }
            return file;
        } catch (Throwable e) {
            throw new DataEntityRuntimeException(this.getDataEntityRuntime(),
                    String.format("导出CSV数据发生异常：%s", e.getMessage()), e);
        }
    }

    @Override
    protected void onExportStream(Object objData, OutputStream outputStream) throws Throwable {
        List<IPSDEDataExportItem> exportItems = this.getPSDEDataExportItems();
        if (ObjectUtils.isEmpty(exportItems)) {
            throw new Exception("未指定导出列");
        }

        List<Map<String, Object>> rowList = buildDataRows(objData, exportItems);
        writeCsv(rowList, exportItems, outputStream);
    }

    
    @Override
    protected String getDefaultFileName() {
    	return "数据导出.csv";
    }

    // ========== 辅助方法 ==========

    /**
     * 构建数据行列表
     */
    private List<Map<String, Object>> buildDataRows(Object objData, List<IPSDEDataExportItem> exportItems)
            throws Exception {
        List<Map<String, Object>> rowList = new ArrayList<>();

        if (objData instanceof Page) {
            @SuppressWarnings("unchecked")
            List<IEntityDTO> data = ((Page<IEntityDTO>) objData).getContent();
            for (IEntityDTO entityDTO : data) {
                rowList.add(extractRow(entityDTO, exportItems));
            }
        } else if (objData instanceof IEntityDTO) {
            IEntityDTO entityDTO = (IEntityDTO) objData;
            rowList.add(extractRow(entityDTO, exportItems));
        } else {
            throw new Exception(String.format("无法识别的数据对象[%1$s]", objData));
        }
        return rowList;
    }

    /**
     * 从单个实体提取一行数据
     */
    private Map<String, Object> extractRow(IEntityDTO entityDTO, List<IPSDEDataExportItem> exportItems) {
        Map<String, Object> row = new LinkedHashMap<>();
        for (IPSDEDataExportItem item : exportItems) {
            String key = item.getName().toLowerCase();
            Object value = entityDTO.get(item.getName());
            row.put(key, value);
        }
        return row;
    }

    /**
     * 将数据写入 CSV 输出流
     */
    private void writeCsv(List<Map<String, Object>> rowList, List<IPSDEDataExportItem> exportItems,
            OutputStream outputStream) throws Exception {
        try (Writer writer = new OutputStreamWriter(outputStream, getCharsetName());
             CSVWriter csvWriter = new CSVWriter(writer, getSeparator(), getQuoteChar(),
                     getEscapeChar(), getLineEnd())) {

            // 写入标题行（按导出项顺序）
            String[] headers = exportItems.stream()
                    .map(item -> item.getName().toLowerCase())
                    .toArray(String[]::new);
            csvWriter.writeNext(headers);

            // 写入数据行
            for (Map<String, Object> row : rowList) {
                String[] rowData = new String[headers.length];
                for (int i = 0; i < headers.length; i++) {
                    Object value = row.get(headers[i]);
                    rowData[i] = value != null ? value.toString() : "";
                }
                csvWriter.writeNext(rowData);
            }
        }
    }
}