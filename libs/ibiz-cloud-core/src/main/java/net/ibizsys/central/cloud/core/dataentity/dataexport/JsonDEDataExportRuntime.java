package net.ibizsys.central.cloud.core.dataentity.dataexport;

import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.data.domain.Page;
import org.springframework.util.ObjectUtils;

import net.ibizsys.central.dataentity.IDataEntityRuntime;
import net.ibizsys.central.util.IEntityDTO;
import net.ibizsys.central.util.domain.ExportDataResult;
import net.ibizsys.model.dataentity.dataexport.IPSDEDataExportItem;
import net.ibizsys.runtime.dataentity.DataEntityRuntimeException;
import net.ibizsys.runtime.util.JsonUtils;

public class JsonDEDataExportRuntime extends DEDataExportRuntimeBase {

	private static final Log log = LogFactory.getLog(JsonDEDataExportRuntime.class);

	@Override
	public File exportFile(Object objData, String strMethodName, Object objBody, String strKey, Object objTag, boolean bTestPriv, IDataEntityRuntime parentDataEntityRuntime, String strParentKey) {
		try {

			List<IPSDEDataExportItem> exportItems = this.getPSDEDataExportItems();
			if (ObjectUtils.isEmpty(exportItems)) {
				throw new RuntimeException("未指定导出列");
			}

			List<Map<String, Object>> rowList = new ArrayList<Map<String, Object>>();

			// 数据信息
			if (objData instanceof Page) {
				List<IEntityDTO> data = ((Page<IEntityDTO>) objData).getContent();
				for (int i = 0; i < data.size(); i++) {
					IEntityDTO entityDTO = data.get(i);
					Map<String, Object> dataRow = new LinkedHashMap<String, Object>();
					for (int k = 0; k < exportItems.size(); k++) {
						IPSDEDataExportItem iPSDEDataExportItem = exportItems.get(k);
						Object objValue = entityDTO.get(iPSDEDataExportItem.getName());
						dataRow.put(iPSDEDataExportItem.getName().toLowerCase(), objValue);
					}
					rowList.add(dataRow);
				}
			} else if (objData instanceof IEntityDTO) {
				IEntityDTO entityDTO = (IEntityDTO) objData;
				// Row dataRow = sheet.createRow(1);
				Map<String, Object> dataRow = new LinkedHashMap<String, Object>();
				for (int k = 0; k < exportItems.size(); k++) {
					IPSDEDataExportItem iPSDEDataExportItem = exportItems.get(k);
					Object objValue = entityDTO.get(iPSDEDataExportItem.getName());
					dataRow.put(iPSDEDataExportItem.getName().toLowerCase(), objValue);
				}
				rowList.add(dataRow);
			} else {
				throw new Exception(String.format("无法识别的数据对象[%1$s]", objData));
			}
			File file = File.createTempFile("EXPORTDATA", ".json");
			try (FileOutputStream fos = new FileOutputStream(file)) {
				fos.write(JsonUtils.toString(rowList).getBytes("UTF-8"));
			}
			return file;
		} catch (Throwable e) {
			throw new DataEntityRuntimeException(this.getDataEntityRuntime(), String.format("导出数据发生异常：%s", e.getMessage()));
		}
	}

	@Override
	protected void onExportStream(Object objData, OutputStream outputStram) throws Throwable {
		List<IPSDEDataExportItem> exportItems = this.getPSDEDataExportItems();
		if (ObjectUtils.isEmpty(exportItems)) {
			throw new Exception("未指定导出列");
		}

		List<Map<String, Object>> rowList = new ArrayList<Map<String, Object>>();

		// 数据信息
		if (objData instanceof Page) {
			List<IEntityDTO> data = ((Page<IEntityDTO>) objData).getContent();
			for (int i = 0; i < data.size(); i++) {
				IEntityDTO entityDTO = data.get(i);
				Map<String, Object> dataRow = new LinkedHashMap<String, Object>();
				for (int k = 0; k < exportItems.size(); k++) {
					IPSDEDataExportItem iPSDEDataExportItem = exportItems.get(k);
					Object objValue = entityDTO.get(iPSDEDataExportItem.getName());
					dataRow.put(iPSDEDataExportItem.getName().toLowerCase(), objValue);
				}
				rowList.add(dataRow);
			}
		} else if (objData instanceof IEntityDTO) {
			IEntityDTO entityDTO = (IEntityDTO) objData;
			Map<String, Object> dataRow = new LinkedHashMap<String, Object>();
			for (int k = 0; k < exportItems.size(); k++) {
				IPSDEDataExportItem iPSDEDataExportItem = exportItems.get(k);
				Object objValue = entityDTO.get(iPSDEDataExportItem.getName());
				dataRow.put(iPSDEDataExportItem.getName().toLowerCase(), objValue);
			}
			rowList.add(dataRow);
		} else {
			throw new Exception(String.format("无法识别的数据对象[%1$s]", objData));
		}

		outputStram.write(JsonUtils.toString(rowList).getBytes("UTF-8"));
	}

	@Override
	protected ExportDataResult onExportStream2(Object objData, OutputStream outputStram) throws Throwable {
		ExportDataResult exportDataResult = super.onExportStream2(objData, outputStram);
		exportDataResult.setFileName("数据导出.json");
		return exportDataResult;
	}
}
