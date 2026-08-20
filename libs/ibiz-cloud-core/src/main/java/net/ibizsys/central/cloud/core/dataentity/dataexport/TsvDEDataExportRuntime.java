package net.ibizsys.central.cloud.core.dataentity.dataexport;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * TSV (Tab-Separated Values) 数据导出运行时
 * 使用制表符(\t)作为分隔符
 */
public class TsvDEDataExportRuntime extends CsvDEDataExportRuntime {

    private static final Log log = LogFactory.getLog(TsvDEDataExportRuntime.class);

    @Override
    protected char getSeparator() {
        return '\t';  // 制表符
    }
    
    @Override
    protected String getDefaultFileName() {
    	return "数据导出.tsv";
    }
    
}