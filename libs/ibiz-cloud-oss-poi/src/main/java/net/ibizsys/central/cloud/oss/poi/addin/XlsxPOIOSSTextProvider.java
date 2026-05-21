package net.ibizsys.central.cloud.oss.poi.addin;

import java.io.File;
import java.io.FileInputStream;
import java.util.Map;

import org.apache.commons.logging.LogFactory;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.CellValue;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.FormulaEvaluator;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.springframework.util.StringUtils;

import com.fasterxml.jackson.databind.node.ArrayNode;
import com.fasterxml.jackson.databind.node.ObjectNode;

import net.ibizsys.runtime.util.JsonUtils;

public class XlsxPOIOSSTextProvider extends POIOSSTextProviderBase {

	private static final org.apache.commons.logging.Log log = LogFactory.getLog(XlsxPOIOSSTextProvider.class);

	@Override
	protected Object doGetText(String cat, String fileId, File file, String type, Map<String, Object> params, File textFile) throws Throwable {
		if (type.equals(TYPE_JSON)) {
			try (Workbook workbook = WorkbookFactory.create(new FileInputStream(file))) {
				return this.getWorkbookNode(workbook).toPrettyString();
			} catch (Throwable ex) {
				log.error(ex);
				throw new Exception(String.format("解析Excel文件发生异常：%1$s", ex.getMessage()), ex);
			}
		}
		return super.doGetText(cat, fileId, file, type, params, textFile);
	}
	
	protected ObjectNode getWorkbookNode(Workbook workbook) throws Throwable {
		FormulaEvaluator evaluator = workbook.getCreationHelper().createFormulaEvaluator();
		int nSheetCount = workbook.getNumberOfSheets();
		ObjectNode workBookNode = JsonUtils.createObjectNode();
		for(int i = 0;i<nSheetCount;i++) {
			Sheet sheet = workbook.getSheetAt(i);
			String strSheetName = sheet.getSheetName();
			if(!StringUtils.hasLength(strSheetName)) {
				strSheetName = String.valueOf(i);
			}
			ArrayNode sheetArray =  workBookNode.putArray(strSheetName);
 			int nMaxRow = sheet.getPhysicalNumberOfRows();
 			for (int k = 0; k < nMaxRow; k++) {
 				// 获取每一行数据
 				Row row = sheet.getRow(k);
 				if (row == null)
 					continue;

 				ArrayNode rowNode = sheetArray.addArray();
 				int nMaxCells = row.getPhysicalNumberOfCells();
 				if(nMaxCells > 255) {
 					nMaxCells = 255;
 				}
 				for (int j = 0; j < nMaxCells; j++) {
 					try {
 						rowNode.add(getCellValue(row.getCell(j), evaluator));
 					}
 					catch (Throwable ex) {
 						rowNode.add(ex.getMessage());
					}
 				}
 			}
		}
		
		return workBookNode;
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
//				Date date = cell.getDateCellValue();
//				SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
//				return df.format(date);
				//优化预览输出时显示正确的时间文本
				DataFormatter dataFormatter = new DataFormatter();
				return dataFormatter.formatCellValue(cell);
			}
			cell.setCellType(CellType.STRING);
			return cell.getStringCellValue();
			// return String.valueOf(cell.getNumericCellValue());
		}
		default:
			return null;
		}
	}
	
}
