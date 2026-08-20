package net.ibizsys.central.plugin.poi.dataentity.dataimport;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.InputStream;
import java.nio.file.Files;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.springframework.util.FileCopyUtils;
import org.springframework.util.ObjectUtils;

import net.ibizsys.central.cloud.core.util.domain.V2ImportSchema;
import net.ibizsys.central.dataentity.IDataEntityRuntime;
import net.ibizsys.central.sysutil.ISysOSSUtilRuntime;
import net.ibizsys.central.util.domain.ImportDataResult;
import net.ibizsys.runtime.sysutil.ISysFileUtilRuntime;
import net.ibizsys.runtime.util.EntityError;
import net.ibizsys.runtime.util.IEntity;

public class CsvDEDataImportRuntime extends net.ibizsys.central.cloud.core.dataentity.dataimport.CsvDEDataImportRuntime {

	@Override
	protected ImportDataResult onImportStream2(IEntity baseEntity, List<?> list, V2ImportSchema importSchema, boolean bTestPriv, IDataEntityRuntime parentDataEntityRuntime, String strParentKey) throws Throwable {

		ImportDataResult dataImportResult = new ImportDataResult();

		List<Map<String, Object>> data = this.doResolveData(baseEntity, list, importSchema);

		Map<Integer, EntityError> ret = importData(baseEntity, data, bTestPriv, parentDataEntityRuntime, strParentKey);

		
		int totalRow = data.size();
		dataImportResult.setTotal(Long.valueOf(totalRow));
		dataImportResult.setSuccess(Long.valueOf(totalRow));
		
		if (!ObjectUtils.isEmpty(ret)) {

			int nMaxCount = 50;
			if (ret.size() > nMaxCount) {
				Map<Integer, EntityError> realRet = new LinkedHashMap<Integer, EntityError>();
				int nTemp = nMaxCount;
				for (java.util.Map.Entry<Integer, EntityError> entry : ret.entrySet()) {
					realRet.put(entry.getKey(), entry.getValue());
					nTemp--;
					if (nTemp <= 0) {
						break;
					}
				}
				dataImportResult.setErrorInfo(realRet);
			} else {
				dataImportResult.setErrorInfo(ret);
			}

			dataImportResult.setSuccess(Long.valueOf(totalRow - ret.size()));
			// //临时缓冲区
			ByteArrayOutputStream out = new ByteArrayOutputStream();

			String strHead = "错误信息";
			Workbook errorWorkbook = WorkbookFactory.create(true);
			Sheet errorSheet = errorWorkbook.createSheet("错误数据");
			Row errorHeadRow = errorSheet.createRow(0);
			
			Cell indexCell = errorHeadRow.createCell(0);
			indexCell.setCellValue("index");
			errorSheet.setColumnWidth(0, "index".getBytes().length * 5 * 256);
			
			short errorIndex = 1;
			Cell errorHeadCell = errorHeadRow.createCell(errorIndex);
			errorHeadCell.setCellValue(strHead);
			errorSheet.setColumnWidth(errorHeadCell.getColumnIndex(), strHead.getBytes().length * 5 * 256);
			
			int nErrorRow = 1;
			for (Map.Entry<Integer, EntityError> entry : ret.entrySet()) {
				Row errorRow = errorSheet.createRow(nErrorRow);
				Cell cell = errorRow.createCell(0);
				cell.setCellValue(String.valueOf(entry.getKey()));
				Cell errorInfoCell = errorRow.createCell(errorIndex);
				errorInfoCell.setCellValue(entry.getValue().getErrorInfo());
				nErrorRow++;
			}
			errorWorkbook.write(out);

			File tempFile = File.createTempFile("导入错误", ".xlsx");
			byte[] bookByteAry = out.toByteArray();
			InputStream errorInputStream = new ByteArrayInputStream(bookByteAry);
			FileCopyUtils.copy(errorInputStream, Files.newOutputStream(tempFile.toPath()));

			ISysOSSUtilRuntime iSysOSSUtilRuntime = (ISysOSSUtilRuntime) this.getSystemRuntime().getSysUtilRuntime(ISysOSSUtilRuntime.class, false);

			// 指定临时文件上传分类
			net.ibizsys.runtime.util.domain.File ossFile = iSysOSSUtilRuntime.createOSSFile(tempFile, ISysFileUtilRuntime.FILECAT_TEMP);
			dataImportResult.setErrorFile(ossFile);
		}
		return dataImportResult;
	}
}
