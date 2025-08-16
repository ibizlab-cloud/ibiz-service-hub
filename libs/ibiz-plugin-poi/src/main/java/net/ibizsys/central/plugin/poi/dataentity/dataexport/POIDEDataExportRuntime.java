package net.ibizsys.central.plugin.poi.dataentity.dataexport;

import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.util.CellRangeAddress;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.data.domain.Page;
import org.springframework.util.ObjectUtils;

import net.ibizsys.central.dataentity.IDataEntityRuntime;
import net.ibizsys.central.dataentity.dataexport.DEDataExportRuntime;
import net.ibizsys.central.util.IEntityDTO;
import net.ibizsys.model.dataentity.dataexport.IPSDEDataExportGroup;
import net.ibizsys.model.dataentity.dataexport.IPSDEDataExportItem;
import net.ibizsys.model.dataentity.defield.IPSDEField;
import net.ibizsys.runtime.codelist.ICodeListRuntime;
import net.ibizsys.runtime.dataentity.DataEntityRuntimeException;
import net.ibizsys.runtime.dataentity.defield.DEFDataTypes;
import net.ibizsys.runtime.util.DataTypeUtils;

public class POIDEDataExportRuntime extends DEDataExportRuntime {

	private static final Log log = LogFactory.getLog(POIDEDataExportRuntime.class);
	
	protected final static SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
	protected final static SimpleDateFormat timeFormat = new SimpleDateFormat("HH:mm:ss");
	protected final static SimpleDateFormat dateTimeFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

	
	@Override
	public File exportFile(Object objData, String strMethodName, Object objBody, String strKey, Object objTag, boolean bTestPriv, IDataEntityRuntime parentDataEntityRuntime, String strParentKey) {
		try (Workbook workbook = new XSSFWorkbook();) {
			
			List<IPSDEDataExportItem> exportItems = this.getPSDEDataExportItems();
			if (ObjectUtils.isEmpty(exportItems)) {
				throw new RuntimeException("未指定导出列");
			}
			
			Sheet sheet = workbook.createSheet();
			
			int nGroupLevel = this.getGroupLevel();
			for(int i =0;i<nGroupLevel;i++) {
				sheet.createRow(i);
			}
			
			
			Row row = sheet.createRow(nGroupLevel);
			
			Map<String, List<Cell>> mergedCellMap = new HashMap<String, List<Cell>>();
			// 列信息
			for (int i = 0; i < exportItems.size(); i++) {
				IPSDEDataExportItem iPSDEDataExportItem = exportItems.get(i);
				Cell cell0 = row.createCell(i);
				cell0.setCellValue(iPSDEDataExportItem.getCaption());
				
				if(nGroupLevel > 0) {
					this.fillMergedCellMap(mergedCellMap, iPSDEDataExportItem.getName(), cell0, iPSDEDataExportItem, null);
				}
			}
			
			if(mergedCellMap.size() > 0) {
				this.addMergedRegions(sheet, mergedCellMap);
			}
			
			// 数据信息
			if (objData instanceof Page) {
				List<IEntityDTO> data = ((Page<IEntityDTO>) objData).getContent();
				for (int i = 0; i < data.size(); i++) {
					IEntityDTO entityDTO = data.get(i);
					Row dataRow = sheet.createRow(i + 1 + nGroupLevel);
					for (int k = 0; k < exportItems.size(); k++) {
						IPSDEDataExportItem iPSDEDataExportItem = exportItems.get(k);
						Object objValue = entityDTO.get(iPSDEDataExportItem.getName());
						Cell cell0 = dataRow.createCell(k);
						if (objValue != null) {
							cell0.setCellValue(convertValue(iPSDEDataExportItem, objValue));
						}
					}
				}
			} else if (objData instanceof IEntityDTO) {
				IEntityDTO entityDTO = (IEntityDTO) objData;
				//Row dataRow = sheet.createRow(1);
				Row dataRow = sheet.createRow(1 + nGroupLevel);
				for (int k = 0; k < exportItems.size(); k++) {
					IPSDEDataExportItem iPSDEDataExportItem = exportItems.get(k);
					Object objValue = entityDTO.get(iPSDEDataExportItem.getName());
					Cell cell0 = dataRow.createCell(k);
					if (objValue != null) {
						cell0.setCellValue(convertValue(iPSDEDataExportItem, objValue));
					}
				}
			}
			else {
				throw new Exception(String.format("无法识别的数据对象[%1$s]", objData));
			}
			File file = File.createTempFile("EXPORTDATA", ".xlsx");
			FileOutputStream fos = new FileOutputStream(file);
			workbook.write(fos);

			return file;
		} catch (Throwable e) {
			throw new DataEntityRuntimeException(this.getDataEntityRuntime(), String.format("导出数据发生异常：%s", e.getMessage()));
		}
	}
	
	
	
	@Override
	protected void onExportStream(Object objData, OutputStream outputStram) throws Throwable {
		try (Workbook workbook = new XSSFWorkbook();) {
			
			List<IPSDEDataExportItem> exportItems = this.getPSDEDataExportItems();
			if (ObjectUtils.isEmpty(exportItems)) {
				throw new Exception("未指定导出列");
			}
			
			Sheet sheet = workbook.createSheet();
			
			int nGroupLevel = this.getGroupLevel();
			for(int i =0;i<nGroupLevel;i++) {
				sheet.createRow(i);
			}
			
			Row row = sheet.createRow(nGroupLevel);
			
			Map<String, List<Cell>> mergedCellMap = new HashMap<String, List<Cell>>();
			// 列信息
			for (int i = 0; i < exportItems.size(); i++) {
				IPSDEDataExportItem iPSDEDataExportItem = exportItems.get(i);
				Cell cell0 = row.createCell(i);
				cell0.setCellValue(iPSDEDataExportItem.getCaption());
				
				if(nGroupLevel > 0) {
					this.fillMergedCellMap(mergedCellMap, iPSDEDataExportItem.getName(), cell0, iPSDEDataExportItem, null);
				}
			}
			
			if(mergedCellMap.size() > 0) {
				this.addMergedRegions(sheet, mergedCellMap);
			}
			
			// 数据信息
			if (objData instanceof Page) {
				List<IEntityDTO> data = ((Page<IEntityDTO>) objData).getContent();
				for (int i = 0; i < data.size(); i++) {
					IEntityDTO entityDTO = data.get(i);
					//Row dataRow = sheet.createRow(i + 1);
					Row dataRow = sheet.createRow(i + 1 + nGroupLevel);
					for (int k = 0; k < exportItems.size(); k++) {
						IPSDEDataExportItem iPSDEDataExportItem = exportItems.get(k);
						Object objValue = entityDTO.get(iPSDEDataExportItem.getName());
						Cell cell0 = dataRow.createCell(k);
						if (objValue != null) {
							cell0.setCellValue(convertValue(iPSDEDataExportItem, objValue));
						}
					}
				}
			} else if (objData instanceof IEntityDTO) {
				IEntityDTO entityDTO = (IEntityDTO) objData;
				//Row dataRow = sheet.createRow(1);
				Row dataRow = sheet.createRow(1 + nGroupLevel);
				for (int k = 0; k < exportItems.size(); k++) {
					IPSDEDataExportItem iPSDEDataExportItem = exportItems.get(k);
					Object objValue = entityDTO.get(iPSDEDataExportItem.getName());
					Cell cell0 = dataRow.createCell(k);
					if (objValue != null) {
						cell0.setCellValue(convertValue(iPSDEDataExportItem, objValue));
					}
				}
			}
			else {
				throw new Exception(String.format("无法识别的数据对象[%1$s]", objData));
			}
			workbook.write(outputStram);
		}
	}

	/**
	 * 填充合并单元格Map对象
	 * @param mergedCellMap
	 * @param strGroupTag
	 * @param cell
	 * @param iPSDEDataExportItem
	 * @param iPSDEDataExportGroup
	 * @throws Throwable
	 */
	protected void fillMergedCellMap(Map<String, List<Cell>> mergedCellMap, String strGroupTag, Cell cell, IPSDEDataExportItem iPSDEDataExportItem, IPSDEDataExportGroup iPSDEDataExportGroup) throws Throwable{
		
		List<Cell> list = mergedCellMap.get(strGroupTag);
		if(list == null) {
			list = new ArrayList<Cell>();
			mergedCellMap.put(strGroupTag, list);
		}
		list.add(cell);
		
		int nRowIndex = cell.getRowIndex();
		
		nRowIndex --;
		if(nRowIndex < 0) {
			return;
		}
		
		int nColumnIndex = cell.getColumnIndex();
		
		IPSDEDataExportGroup parentPSDEDataExportGroup = null;
		if(iPSDEDataExportGroup != null) {
			parentPSDEDataExportGroup = iPSDEDataExportGroup.getParentPSDEDataExportGroup();
		}
		else
			if(iPSDEDataExportItem != null) {
				parentPSDEDataExportGroup = iPSDEDataExportItem.getPSDEDataExportGroup();
			}
		
		Cell groupCell = cell.getRow().getSheet().getRow(nRowIndex).createCell(nColumnIndex);
		if(parentPSDEDataExportGroup != null) {
			strGroupTag = parentPSDEDataExportGroup.getName();
			groupCell.setCellValue(parentPSDEDataExportGroup.getCaption());
		}
		else {
			groupCell.setCellValue(cell.getStringCellValue());
		}
		
		this.fillMergedCellMap(mergedCellMap, strGroupTag, groupCell, null, parentPSDEDataExportGroup);
	}
	
	/**
	 * 增加合并区域
	 * @param sheet
	 * @param mergedCellMap
	 * @throws Throwable
	 */
	protected void addMergedRegions(Sheet sheet, Map<String, List<Cell>> mergedCellMap) throws Throwable{
		
		for(List<Cell> list : mergedCellMap.values()) {
			if(list.size() <= 1) {
				continue;
			}
			
			int firstRow = -1;
			int lastRow = -1;
			int firstCol = -1;
			int lastCol = -1;
			
			for(Cell cell : list) {
				if(firstRow == -1 || cell.getRowIndex() < firstRow)  {
					firstRow = cell.getRowIndex();
				}
				if(lastRow == -1 || cell.getRowIndex() > lastRow)  {
					lastRow = cell.getRowIndex();
				}
				
				if(firstCol == -1 || cell.getColumnIndex() < firstCol)  {
					firstCol = cell.getColumnIndex();
				}
				
				if(lastCol == -1 || cell.getColumnIndex() > lastCol)  {
					lastCol = cell.getColumnIndex();
				}
			}
			
			if(firstRow != -1 && lastRow != -1 && firstCol != -1 && lastCol != -1) {
				CellRangeAddress region = new CellRangeAddress(firstRow, lastRow, firstCol, lastCol);
				sheet.addMergedRegion(region);
			}
		}
		
	}
	
	/**
	 * 数据转换
	 *
	 * @param iPSDEDataExportItem
	 * @param objValue
	 * @return
	 */
	protected String convertValue(IPSDEDataExportItem iPSDEDataExportItem, Object objValue) {
		IPSDEField iPSDEField = iPSDEDataExportItem.getPSDEField();
		if (iPSDEField == null) {
			// 尝试根据ItemName获取属性
			iPSDEField = this.getDataEntityRuntime().getPSDEField(iPSDEDataExportItem.getName(), true);
		}
		if (objValue != null) {
			if (iPSDEDataExportItem.getPSCodeList() != null) {
				ICodeListRuntime iCodeListRuntime = this.getSystemRuntime().getCodeListRuntime(iPSDEDataExportItem.getPSCodeList());
				String strText = null;
				try {
					strText = iCodeListRuntime.getText(objValue);
					return strText;
				} catch (Exception e) {
					log.error(e);
				}
			} else {
				if (iPSDEField == null) {
					return String.valueOf(objValue);
				}
				switch (iPSDEField.getDataType()) {
				case DEFDataTypes.DATE: {
					if (objValue instanceof Date) {
						return dateFormat.format(objValue);
					} else {
						return String.valueOf(objValue);
					}
				}
				case DEFDataTypes.TIME: {
					if (objValue instanceof Date) {
						return timeFormat.format(objValue);
					} else {
						return String.valueOf(objValue);
					}
				}
				case DEFDataTypes.DATETIME: {
					if (objValue instanceof Date) {
						return dateTimeFormat.format(objValue);
					} else {
						return String.valueOf(objValue);
					}
				}
				case DEFDataTypes.YESNO: {
					try {
						return DataTypeUtils.getIntegerValue(objValue, 0) == 1 ? "是" : "否";
					} catch (Exception e) {
						log.error(e);
					}
				}
				}
			}
		}
		return String.valueOf(objValue);
	}
	
	
	public static void main(String[] args) {
		
		try {
			try (Workbook workbook = new XSSFWorkbook();) {
				
				Sheet sheet = workbook.createSheet();
				Row row0 = sheet.createRow(0);
				Row row1 = sheet.createRow(1);
				
				for(int i = 0;i<10;i++) {
					Cell cell0 = row0.createCell(i);
					cell0.setCellValue(String.format("lie[%1$s]", i + 1));
					
					Cell cell1 = row1.createCell(i);
					cell1.setCellValue(String.format("列[%1$s]", i + 1));
				}
				
				for(int i = 0;i<10;i++) {
					CellRangeAddress region = new CellRangeAddress(0, 1, i, i);
					sheet.addMergedRegion(region);
				}
				
				
				File file = File.createTempFile("EXPORTDATA", ".xlsx");
				FileOutputStream fos = new FileOutputStream(file);
				workbook.write(fos);

			}
		}
		catch (Exception ex) {
			log.error(ex);
		}
	}
}
