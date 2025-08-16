package net.ibizsys.central.plugin.poi.dataentity.dataimport;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.file.Files;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.CellValue;
import org.apache.poi.ss.usermodel.DataFormat;
import org.apache.poi.ss.usermodel.DataValidation;
import org.apache.poi.ss.usermodel.DataValidationConstraint;
import org.apache.poi.ss.usermodel.DataValidationHelper;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.FormulaEvaluator;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.ss.util.CellRangeAddressList;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.util.FileCopyUtils;
import org.springframework.util.ObjectUtils;
import org.springframework.util.StringUtils;

import net.ibizsys.central.cloud.core.dataentity.dataimport.DEDataImportRuntimeBase;
import net.ibizsys.central.cloud.core.util.domain.V2ImportSchema;
import net.ibizsys.central.cloud.core.util.domain.V2ImportSchemaField;
import net.ibizsys.central.codelist.IDynamicCodeListRuntime;
import net.ibizsys.central.dataentity.IDataEntityRuntime;
import net.ibizsys.central.sysutil.ISysOSSUtilRuntime;
import net.ibizsys.central.util.domain.ImportDataResult;
import net.ibizsys.model.codelist.IPSCodeItem;
import net.ibizsys.model.codelist.IPSCodeList;
import net.ibizsys.model.dataentity.dataimport.IPSDEDataImportItem;
import net.ibizsys.runtime.codelist.ICodeListRuntime;
import net.ibizsys.runtime.dataentity.DataEntityRuntimeException;
import net.ibizsys.runtime.security.IUserContext;
import net.ibizsys.runtime.sysutil.ISysFileUtilRuntime;
import net.ibizsys.runtime.util.EntityError;
import net.ibizsys.runtime.util.IEntity;

public class POIDEDataImportRuntime extends DEDataImportRuntimeBase  {

	private static final Log log = LogFactory.getLog(POIDEDataImportRuntime.class);

	@Override
	public void getImportTemplate(String strImportTag, OutputStream outputStream, boolean bTestPriv, IDataEntityRuntime parentDataEntityRuntime, String strParentKey) throws Throwable {
		try {
			IUserContext iUserContext = this.getUserContext();
			Map<String, IPSDEDataImportItem> importItemMap = this.getPSDEDataImportItems();
			if (ObjectUtils.isEmpty(importItemMap)) {
				throw new RuntimeException("未配置导入列信息");
			}
			List <IPSDEDataImportItem> importItems  = importItemMap.values().stream().sorted(java.util.Comparator.comparing(IPSDEDataImportItem::getOrderValue)).collect(Collectors.toList());
			//移除隐藏导入项
			Iterator<IPSDEDataImportItem> iterator = importItems.iterator();
			while (iterator.hasNext()) {
				IPSDEDataImportItem importItem = iterator.next();
				if(importItem.isHiddenDataItem()){
					iterator.remove();
				}
			}
			Map<String, Object> activeDataMap = null;
			if(parentDataEntityRuntime!=null && StringUtils.hasLength(strParentKey)) {
				activeDataMap = new LinkedHashMap<String, Object>();
				activeDataMap.put(parentDataEntityRuntime.getLowerCaseName(), strParentKey);
			}
			try(Workbook workbook = new XSSFWorkbook()) {
				// 创建数据sheet
				Sheet sheet = workbook.createSheet(this.getDataEntityRuntime().getPSDataEntity().getLogicName());
				// 创建单元格样式 文本
				CellStyle style = workbook.createCellStyle();
				DataFormat format = workbook.createDataFormat();
				style.setDataFormat(format.getFormat("@"));
				// 准备代码表sheet 隐藏
				for (IPSDEDataImportItem importItem : importItems) {
					IPSCodeList iPSCodeList = importItem.getPSCodeList();
					if (iPSCodeList == null)
						continue;
					
					boolean bInlineMode = false;
					if(importItem.getPSDEField() != null && importItem.getPSDEField().getInlinePSCodeList()!=null) {
						bInlineMode = true;
					}
					String strSheetTag = iPSCodeList.getCodeName();
					if(bInlineMode || !StringUtils.hasLength(strSheetTag)) {
						strSheetTag = String.format("%1$s输入值", importItem.getCaption());
					}
					if (workbook.getSheet(strSheetTag) != null)
						continue;
					// 创建 隐藏 下拉数据的sheet页
					Sheet codelistSheet = workbook.createSheet(strSheetTag);
					workbook.setSheetHidden(workbook.getSheetIndex(codelistSheet), true);
					sheet.setDefaultColumnStyle(0, style);
					
					List<IPSCodeItem> iPSCodeItems = null;
					if(!bInlineMode) {
						ICodeListRuntime codeListRuntime = this.getSystemRuntime().getCodeListRuntime(iPSCodeList);
						if(!ObjectUtils.isEmpty(activeDataMap)) {
							if(codeListRuntime instanceof IDynamicCodeListRuntime) {
								codeListRuntime = ((IDynamicCodeListRuntime)codeListRuntime).getInstance(activeDataMap);
							}
						}
						iPSCodeItems = codeListRuntime.getPSCodeItems();
					}
					else {
						iPSCodeItems = iPSCodeList.getPSCodeItems();
					}
					
					if(!ObjectUtils.isEmpty(iPSCodeItems)) {
						for (int i = 0; i < iPSCodeItems.size(); i++) {
							IPSCodeItem iPSCodeItem = iPSCodeItems.get(i);
							Row row = codelistSheet.createRow(i);
							Cell cell = row.createCell(0);
							cell.setCellValue(iPSCodeItem.getText());
						}
					}
				}
				Row row = sheet.createRow(0);
				for (int i = 0; i < importItems.size(); i++) {
					IPSDEDataImportItem iPSDEDataImportItem = importItems.get(i);
					Cell cell0 = row.createCell(i);
					String strCaption = iPSDEDataImportItem.getCaption();
					if (iPSDEDataImportItem.getCapPSLanguageRes() != null) {
						strCaption = iUserContext.getLocalization(iPSDEDataImportItem.getCapPSLanguageRes().getLanResTag(), iPSDEDataImportItem.getCaption());
					}
					cell0.setCellValue(strCaption);
					// 标题长度
					sheet.setColumnWidth(cell0.getColumnIndex(), strCaption.getBytes().length * 256);
					sheet.setDefaultColumnStyle(i, style);
					// 设置代码表源
					if (iPSDEDataImportItem.getPSCodeList() != null) {
						boolean bInlineMode = false;
						if(iPSDEDataImportItem.getPSDEField() != null && iPSDEDataImportItem.getPSDEField().getInlinePSCodeList()!=null) {
							bInlineMode = true;
						}
						String strSheetTag = iPSDEDataImportItem.getPSCodeList().getCodeName();
						if(bInlineMode || !StringUtils.hasLength(strSheetTag)) {
							strSheetTag = String.format("%1$s输入值", iPSDEDataImportItem.getCaption());
						}
						
						DataValidationHelper dataValidationHelper = sheet.getDataValidationHelper();
						String strFormula = strSheetTag + "!$A$1:$A$65535";
						DataValidationConstraint dataValidationConstraint = dataValidationHelper.createFormulaListConstraint(strFormula);
						CellRangeAddressList regions = new CellRangeAddressList(1, 65535, i, i);
						DataValidation dataValidation = dataValidationHelper.createValidation(dataValidationConstraint, regions);
						sheet.addValidationData(dataValidation);
					}
				}
				workbook.write(outputStream);
			}
		} catch (Exception ex) {
			log.error(ex.getMessage());
			DataEntityRuntimeException.rethrow(this, ex);
			throw new DataEntityRuntimeException(this.getDataEntityRuntime(), this, String.format("生成导入模板发生异常：%s", ex.getMessage()), ex);
		}
	}
	
	

	@Override
	public Map<Integer, EntityError> importStream(IEntity baseEntity, InputStream inputStream, boolean bTestPriv, IDataEntityRuntime parentDataEntityRuntime, String strParentKey) throws Throwable {
		List<Map<String, Object>> data = resolveData(baseEntity, inputStream);
		return importData(baseEntity, data, bTestPriv, parentDataEntityRuntime, strParentKey);
	}

	protected List<Map<String, Object>> resolveData(IEntity baseEntity, InputStream inputStream) {
		try (Workbook workbook = WorkbookFactory.create(inputStream)) {
			return this.doResolveData(baseEntity, workbook);
		} catch (Throwable ex) {
			DataEntityRuntimeException.rethrow(this, ex);
			throw new DataEntityRuntimeException(this.getDataEntityRuntime(), String.format("解析导入Excel发生异常：%s", ex.getMessage()), ex);
		}
	}
	
	protected List<Map<String, Object>> doResolveData(IEntity baseEntity, Workbook wb) throws Throwable {
		return this.doResolveData(baseEntity, wb, null);
	}

	protected List<Map<String, Object>> doResolveData(IEntity baseEntity, Workbook wb, V2ImportSchema importSchema) throws Throwable {
		List<Map<String, Object>> importDataList = new ArrayList<>();
		// 根据页面index 获取sheet页
		FormulaEvaluator evaluator = wb.getCreationHelper().createFormulaEvaluator();
		Sheet sheet = wb.getSheetAt(0);
		if (sheet.getPhysicalNumberOfRows() == 0) {
			throw new Exception( String.format("未定义导入标识"));
		}
		// 获取导入标题
		Map<Integer, String> captionMap = new HashMap<>();
		Row captionRow = sheet.getRow(0);
		for (int i = 0; i < captionRow.getPhysicalNumberOfCells(); i++) {
			captionMap.put(i, captionRow.getCell(i).getStringCellValue());
		}
		
		if(importSchema != null && !ObjectUtils.isEmpty(importSchema.getFields())) {
			
			Map<String, IPSDEDataImportItem> map = this.getPSDEDataImportItems();
			
			Map<String, String> realCaptionMap = new LinkedHashMap<String, String>();
			if(!ObjectUtils.isEmpty(map)) {
				for(java.util.Map.Entry<String, IPSDEDataImportItem> entry : map.entrySet()) {
					if(entry.getValue().getPSDEField() == null) {
						continue;
					}
					realCaptionMap.put(entry.getValue().getPSDEField().getName().toUpperCase(), entry.getKey());
				}
			}
			
			for(V2ImportSchemaField field : importSchema.getFields()) {
				if(!StringUtils.hasLength(field.getName())) {
					continue;
				}
				
				String strRealCaption = realCaptionMap.get(field.getName().toUpperCase());
				if(!StringUtils.hasLength(strRealCaption)) {
					continue;
				}
				
				int i = -1;
				if(StringUtils.hasLength(field.getCaption())) {
					for(java.util.Map.Entry<Integer, String> entry : captionMap.entrySet()) {
						if(field.getCaption().equals(entry.getValue())) {
							i = entry.getKey();
							break;
						}
					}
				}
				else {
					if(field.getIndex() != null) {
						i = field.getIndex();
					}
				}
				if(i <= -1) {
					continue;
				}
				
				captionMap.put(i, strRealCaption);
			}
		}
		
		// 循环sesheet页中数据从第二行开始，第一行是标题
		for (int i = 1; i < sheet.getPhysicalNumberOfRows(); i++) {
			// 获取每一行数据
			Row row = sheet.getRow(i);
			if (row == null)
				continue;
			Map<String, Object> data = new HashMap<>();
			boolean bEmptyRow = true;
			for (int j = 0; j < captionMap.size(); j++) {
				String cellValue = getCellValue(row.getCell(j), evaluator);
				if (bEmptyRow && !ObjectUtils.isEmpty(cellValue)) {
					bEmptyRow = false;
				}
				data.put(captionMap.get(j), cellValue);
			}
			if (!bEmptyRow) {
				importDataList.add(data);
			}
		}
		return importDataList;
	}

	/**
	 * 获取单元格内容
	 *
	 * @param cell
	 * @param eva
	 * @return
	 */
	protected String getCellValue(Cell cell, FormulaEvaluator eva) {
		if (cell == null)
			return null;
		switch (cell.getCellType()) {
		case STRING:
			return cell.getStringCellValue();
		case BOOLEAN:
			return String.valueOf(cell.getBooleanCellValue());
		case FORMULA:
			if (eva == null)
				return cell.getCellFormula();
			else {
				CellValue cellVal = eva.evaluate(cell);// 获取单元格的值

				if (cellVal.getCellType() == CellType.NUMERIC) {
					return String.valueOf(cellVal.getNumberValue());
				} else {
					return cellVal.getStringValue();
				}
			}
		case NUMERIC: {
			boolean b = DateUtil.isCellDateFormatted(cell);
			if (b) {
				Date date = cell.getDateCellValue();
				SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
				return df.format(date);
			}
			cell.setCellType(CellType.STRING);
			return cell.getStringCellValue();
			// return String.valueOf(cell.getNumericCellValue());
		}
		default:
			return null;
		}
	}

	@Override
	public ImportDataResult importStream2(IEntity baseEntity, InputStream inputStream, boolean bTestPriv, IDataEntityRuntime parentDataEntityRuntime, String strParentKey) throws Throwable {

		try (Workbook workbook = WorkbookFactory.create(inputStream)) {
			return this.onImportStream2(baseEntity, workbook, null, bTestPriv, parentDataEntityRuntime, strParentKey);
		} catch (Throwable ex) {
			DataEntityRuntimeException.rethrow(this, ex);
			throw new DataEntityRuntimeException(this.getDataEntityRuntimeBase(), this, String.format("导入数据流发生异常，%1$s", ex.getMessage()), ex);
		}
	}

	protected ImportDataResult onImportStream2(IEntity baseEntity, Workbook workbook, V2ImportSchema importSchema, boolean bTestPriv, IDataEntityRuntime parentDataEntityRuntime, String strParentKey) throws Throwable {

		ImportDataResult dataImportResult = new ImportDataResult();

		List<Map<String, Object>> data = this.doResolveData(baseEntity, workbook, importSchema);

		Map<Integer, EntityError> ret = importData(baseEntity, data, bTestPriv, parentDataEntityRuntime, strParentKey);

		// Workbook workbook = WorkbookFactory.create(inputStream);
		Sheet sheet = workbook.getSheetAt(0);
		//int totalRow = sheet.getLastRowNum();
		//存在空行以及标题行忽略,以实际数据数为准
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

			Row row = sheet.getRow(0);

			String strHead = "错误信息";
			FormulaEvaluator evaluator = workbook.getCreationHelper().createFormulaEvaluator();
			// 忽略错误时只保留错误行
			if (this.isIgnoreError()) {
				Workbook errorWorkbook = WorkbookFactory.create(true);
				Sheet errorSheet = errorWorkbook.createSheet(sheet.getSheetName());
				Row errorHeadRow = errorSheet.createRow(0);
				for (int i = 0; i < row.getLastCellNum(); i++) {
					Cell headCell = errorHeadRow.createCell(i);
					// headCell.setCellValue(row.getCell(i,
					// Row.MissingCellPolicy.CREATE_NULL_AS_BLANK).getStringCellValue());
					headCell.setCellValue(getCellValue(row.getCell(i), evaluator));
					errorSheet.setColumnWidth(i, sheet.getColumnWidth(i));
				}
				short errorIndex = row.getLastCellNum();
				Cell errorHeadCell = errorHeadRow.createCell(errorIndex);
				errorHeadCell.setCellValue(strHead);
				errorSheet.setColumnWidth(errorHeadCell.getColumnIndex(), strHead.getBytes().length * 5 * 256);
				int nErrorRow = 1;
				for (Map.Entry<Integer, EntityError> entry : ret.entrySet()) {
					Row dataRow = sheet.getRow(entry.getKey() + 1);
					Row errorRow = errorSheet.createRow(nErrorRow);
					for (int i = 0; i < row.getLastCellNum(); i++) {
						Cell cell = errorRow.createCell(i);
						// cell.setCellValue(dataRow.getCell(i,
						// Row.MissingCellPolicy.CREATE_NULL_AS_BLANK).getStringCellValue());
						cell.setCellValue(getCellValue(dataRow.getCell(i), evaluator));
					}
					Cell errorInfoCell = errorRow.createCell(errorIndex);
					errorInfoCell.setCellValue(entry.getValue().getErrorInfo());
					nErrorRow++;
				}
				errorWorkbook.write(out);
			} else {
				// 源文件附加
				short errorIndex = row.getLastCellNum();
				Cell errorHeadCell = row.createCell(errorIndex);
				errorHeadCell.setCellValue(strHead);
				sheet.setColumnWidth(errorHeadCell.getColumnIndex(), strHead.getBytes().length * 5 * 256);
				for (Map.Entry<Integer, EntityError> entry : ret.entrySet()) {
					Cell errorInfoCell = sheet.getRow(entry.getKey() + 1).createCell(errorIndex);
					errorInfoCell.setCellValue(entry.getValue().getErrorInfo());
				}
				workbook.write(out);
			}

			File tempFile = File.createTempFile("导入错误", ".xlsx");
			byte[] bookByteAry = out.toByteArray();
			InputStream errorInputStream = new ByteArrayInputStream(bookByteAry);
			FileCopyUtils.copy(errorInputStream, Files.newOutputStream(tempFile.toPath()));

			ISysOSSUtilRuntime iSysOSSUtilRuntime = (ISysOSSUtilRuntime) this.getSystemRuntime().getSysUtilRuntime(ISysOSSUtilRuntime.class, false);

			// ISysFileUtilRuntime iSysFileUtilRuntime =
			// this.getSystemRuntime().getSysFileUtilRuntime();

			// 指定临时文件上传分类
			net.ibizsys.runtime.util.domain.File ossFile = iSysOSSUtilRuntime.createOSSFile(tempFile, ISysFileUtilRuntime.FILECAT_TEMP);
			dataImportResult.setErrorFile(ossFile);


		}
		return dataImportResult;
	}
	
	@Override
	protected ImportDataResult onImportStream2(IEntity baseEntity, InputStream inputStream, V2ImportSchema v2ImportSchema, boolean bTestPriv, IDataEntityRuntime parentDataEntityRuntime, String strParentKey) throws Throwable {
		try (Workbook workbook = WorkbookFactory.create(inputStream)) {
			return this.onImportStream2(baseEntity, workbook, v2ImportSchema, bTestPriv, parentDataEntityRuntime, strParentKey);
		} 
	}
	
	@Override
	protected Map<Integer, EntityError> onImportStream(IEntity baseEntity, InputStream inputStream, V2ImportSchema v2ImportSchema, boolean bTestPriv, IDataEntityRuntime parentDataEntityRuntime, String strParentKey) throws Throwable {
		try (Workbook workbook = WorkbookFactory.create(inputStream)) {
			List<Map<String, Object>> data = doResolveData(baseEntity, workbook, v2ImportSchema);
			return importData(baseEntity, data, bTestPriv, parentDataEntityRuntime, strParentKey);
		}
	}
}
