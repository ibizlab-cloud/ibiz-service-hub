package net.ibizsys.central.cloud.oss.poi.addin;

import java.io.File;
import java.io.FileInputStream;

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

import com.fasterxml.jackson.databind.node.ArrayNode;

import net.ibizsys.central.cloud.oss.core.util.domain.FileItem;
import net.ibizsys.runtime.util.JsonUtils;

public class XlsxPOIOSSPreviewProvider extends POIOSSPreviewProviderBase {

	@Override
	protected void onFillPreviewInfo(FileItem fileItem, File file) throws Throwable {
		try (Workbook workbook = WorkbookFactory.create(new FileInputStream(file))) {
			String strPreviewInfo = getPreviewInfo(workbook);
			fileItem.setPreviewType(FileItem.PREVIEWTYPE_EXCEL);
			fileItem.setPreviewInfo(strPreviewInfo);
		} catch (Exception ex) {
			throw new Exception(String.format("解析导入Excel发生异常：%1$s", ex.getMessage()), ex);
		}
	}

	protected String getPreviewInfo(Workbook workbook) throws Throwable {

		Sheet sheet = workbook.getSheetAt(0);
		FormulaEvaluator evaluator = workbook.getCreationHelper().createFormulaEvaluator();

		int nMaxRow = sheet.getPhysicalNumberOfRows();
		if (nMaxRow > 20) {
			nMaxRow = 20;
		}

		ArrayNode rows = JsonUtils.createArrayNode();

		for (int i = 0; i < nMaxRow; i++) {
			// 获取每一行数据
			Row row = sheet.getRow(i);
			if (row == null)
				continue;

			ArrayNode rowNode = rows.addArray();
			for (int j = 0; j < row.getPhysicalNumberOfCells(); j++) {
				rowNode.add(getCellValue(row.getCell(j), evaluator));
			}
		}

		return rows.toPrettyString();
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
