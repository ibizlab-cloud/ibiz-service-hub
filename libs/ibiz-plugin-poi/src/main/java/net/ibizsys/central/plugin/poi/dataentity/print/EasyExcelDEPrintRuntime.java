package net.ibizsys.central.plugin.poi.dataentity.print;

import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Base64;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.poi.ss.usermodel.Workbook;
import org.springframework.util.ObjectUtils;
import org.springframework.util.StringUtils;

import com.alibaba.excel.EasyExcel;
import com.alibaba.excel.ExcelWriter;
import com.alibaba.excel.write.metadata.WriteSheet;
import com.alibaba.excel.write.metadata.fill.FillConfig;
import com.alibaba.excel.write.metadata.fill.FillWrapper;

import net.ibizsys.central.cloud.core.dataentity.print.DEPrintRuntimeBase;
import net.ibizsys.central.util.IEntityDTO;
import net.ibizsys.model.PSModelEnums.DEFDataType;
import net.ibizsys.model.PSModelEnums.ReportContentType;
import net.ibizsys.model.dataentity.IPSDataEntity;
import net.ibizsys.model.dataentity.defield.IPSDEField;
import net.ibizsys.model.dataentity.defield.IPSOne2ManyDataDEField;
import net.ibizsys.model.dataentity.defield.IPSOne2ManyObjDEField;
import net.ibizsys.runtime.util.Entity;
import net.ibizsys.runtime.util.IEntity;
import net.ibizsys.runtime.util.IEntityBase;

/**
 * 基于 EasyExcel 的 Excel 打印实现 支持 .xlsx 模板填充，每个主数据生成一个 Sheet
 */
public class EasyExcelDEPrintRuntime extends DEPrintRuntimeBase {

	private static final Log log = LogFactory.getLog(EasyExcelDEPrintRuntime.class);

	public static final String PARAM_DETAILS = "details";
	public static final String PARAM_ROWNO = "srfrowno";

	@Override
	protected void onInit() throws Exception {
		super.onInit();
		// 可选：初始化配置
	}

	@Override
	protected void onOutput(OutputStream outputStream, IEntityBase[] list, String strType) throws Throwable {
		// 只支持 Excel 格式，若要求 PDF 可在此扩展转换（此处仅输出 xlsx）
		if (!ReportContentType.XLSX.value.equalsIgnoreCase(strType) && !"xls".equalsIgnoreCase(strType)) {
			log.warn("当前实现仅支持 xlsx/xls 输出，指定类型 " + strType + " 将被忽略，默认输出 xlsx");
		}

		// 获取模板输入流
		try (InputStream templateStream = getTemplateStream()) {
			if (templateStream == null) {
				throw new Exception("未定义报表模板（reportModel 或 reportFilePath 为空）");
			}

			// 创建 ExcelWriter，使用模板
			ExcelWriter excelWriter = EasyExcel.write(outputStream).withTemplate(templateStream).inMemory(Boolean.TRUE).build();
			Workbook workbook = excelWriter.writeContext().writeWorkbookHolder().getWorkbook();

			try {
				// 填充数据，每个 IEntityBase 作为一个独立 Sheet
				int sheetIndex = 0;
				//动态生成 Sheet,复制原始sheet
				for (int i = 1; i < list.length; i++) {
					workbook.cloneSheet(0);
				}

				for (IEntityBase entityBase : list) {
					String sheetName = "数据" + (sheetIndex + 1);
					WriteSheet writeSheet = EasyExcel.writerSheet(sheetIndex, sheetName).build();

					// 构建数据模型（主数据 + 明细）
					Map<String, Object> model = buildModel(entityBase,excelWriter,writeSheet);
					// 填充当前 Sheet
					// FillConfig.forceNewRow(true) 保证每次填充从新行开始，避免覆盖
					excelWriter.fill(model, FillConfig.builder().forceNewRow(Boolean.TRUE).build(), writeSheet);

					sheetIndex++;
				}
			} finally {
				if (excelWriter != null) {
					excelWriter.finish();
				}
			}
		}
	}

	/**
	 * 获取模板输入流（优先使用 Base64 编码的模型，否则从文件路径读取）
	 */
	protected InputStream getTemplateStream() throws Exception {
		String strReportModel = this.getReportModel();
		if (StringUtils.hasLength(strReportModel)) {
			byte[] bytes = Base64.getDecoder().decode(strReportModel);
			return new ByteArrayInputStream(bytes);
		}

		String filePath = this.getReportFilePath();
		if (StringUtils.hasLength(filePath)) {
			return new FileInputStream(new File(filePath));
		}

		return null;
	}

	/**
	 * 构建用于 EasyExcel 填充的模型数据 与原 POI 实现逻辑一致： 1. 复制主数据字段 2. 处理一对多关系（One2ManyData
	 * 和 One2ManyObj），将子集合转换为 List<Map<String, Object>> 3. 自动添加行号 (srfrowno)
	 */
	protected Map<String, Object> buildModel(IEntityBase entityBase,ExcelWriter excelWriter,WriteSheet writeSheet) throws Throwable {
		// 1. 转换为 IEntity
		IEntity iEntity;
		if (entityBase instanceof IEntityDTO) {
			iEntity = new Entity();
			((IEntityDTO) entityBase).copyTo(iEntity);
		} else if (entityBase instanceof IEntity) {
			iEntity = (IEntity) entityBase;
		} else {
			throw new Exception("无法识别的数据对象类型");
		}

		// 2. 主数据字段复制
		Map<String, Object> model = new HashMap<>();
		Map<String, Object> anyMap = iEntity.any();
		if (anyMap != null) {
			model.putAll(anyMap);
		}

		// 3. 处理明细数据（如果模型中没有预先填充 details）
		if (!model.containsKey(PARAM_DETAILS)) {
			List<? extends IEntity> detailList = selectDetails(iEntity); // 父类方法，获取默认明细
			if (detailList != null && !detailList.isEmpty()) {
				List<Map<String, Object>> detailMapList = convertEntityListToMapList(detailList);
				model.put(PARAM_DETAILS, detailMapList);
				excelWriter.fill(new FillWrapper(PARAM_DETAILS,detailMapList),writeSheet);
			}
		}else {
			if(model.get(PARAM_DETAILS) instanceof List) {
				List<Map<String, Object>> detailMapList = convertEntityListToMapList((List<? extends IEntity>) model.get(PARAM_DETAILS));
				excelWriter.fill(new FillWrapper(PARAM_DETAILS, detailMapList),writeSheet);
			}
		}

		// 4. 根据实体定义，处理所有一对多属性（支持 One2ManyData 和 One2ManyObj）
		IPSDataEntity dataEntity = this.getPSDEPrint().getParentPSModelObject(IPSDataEntity.class);
		java.util.List<IPSDEField> allFields = dataEntity.getAllPSDEFields();
		if (!ObjectUtils.isEmpty(allFields)) {
			for (IPSDEField field : allFields) {
				String dataType = field.getDataType();
				Object value = model.get(field.getLowerCaseName());
				if (value == null)
					continue;

				// 处理 One2ManyData 类型
				if (DEFDataType.ONE2MANYDATA.value.equalsIgnoreCase(dataType) || DEFDataType.ONE2MANYDATA_MAP.value.equalsIgnoreCase(dataType)) {
					processOne2ManyData(field, value, model);
					excelWriter.fill(new FillWrapper(field.getLowerCaseName(), (List) model.get(field.getLowerCaseName())),writeSheet);
				}
				// 处理 One2ManyObj 类型
				else if (DEFDataType.ONE2MANYOBJ.value.equalsIgnoreCase(dataType) || DEFDataType.ONE2MANYOBJ_MAP.value.equalsIgnoreCase(dataType)) {
					processOne2ManyObj(field, value, model);
					excelWriter.fill(new FillWrapper(field.getLowerCaseName(), (List) model.get(field.getLowerCaseName())),writeSheet);
				}
			}
		}

		//5. 填充默认参数
		//主数据编号
		model.put(PARAM_ROWNO, writeSheet.getSheetNo()+1);
		return model;
	}

	/**
	 * 处理 One2ManyData 字段：将 DTO 集合转为 Map 列表，并更新模型
	 */
	protected void processOne2ManyData(IPSDEField field, Object value, Map<String, Object> model) throws Exception {
		IPSOne2ManyDataDEField defField = (IPSOne2ManyDataDEField) field;
		List dtoList;
		if (!defField.isMap()) {
			dtoList = (List) value;
		} else {
			Map dtoMap = (Map) value;
			dtoList = new ArrayList<>(dtoMap.values());
		}
		if (ObjectUtils.isEmpty(dtoList)) {
			return;
		}

		// 获取子实体运行时，用于填充代码表文本（如需要）
		IPSDataEntity minorEntity = defField.getPSDERMust().getMinorPSDataEntityMust();
		// 可选：这里可以调用 minorDataEntityRuntime.fillEntityCodeListTexts(...) 处理

		List<Map<String, Object>> mapList = convertDtoListToMapList(dtoList);
		model.put(field.getLowerCaseName(), mapList);
	}

	/**
	 * 处理 One2ManyObj 字段：将 DTO 集合转为 Map 列表
	 */
	protected void processOne2ManyObj(IPSDEField field, Object value, Map<String, Object> model) throws Exception {
		IPSOne2ManyObjDEField defField = (IPSOne2ManyObjDEField) field;
		List dtoList;
		if (!defField.isMap()) {
			dtoList = (List) value;
		} else {
			Map dtoMap = (Map) value;
			dtoList = new ArrayList<>(dtoMap.values());
		}
		if (ObjectUtils.isEmpty(dtoList)) {
			return;
		}

		List<Map<String, Object>> mapList = convertDtoListToMapList(dtoList);
		model.put(field.getLowerCaseName(), mapList);
	}

	/**
	 * 将实体集合转换为 Map 列表，自动添加行号
	 */
	protected List<Map<String, Object>> convertEntityListToMapList(List<? extends IEntity> entityList) throws Exception {
		List<Map<String, Object>> result = new ArrayList<>();
		int rowNo = 1;
		for (IEntity entity : entityList) {
			Entity temp = new Entity();
			entity.copyTo(temp);
			Map<String, Object> itemMap = new HashMap<>();
			if (temp.any() != null) {
				itemMap.putAll(temp.any());
			}
			// 添加行号（若原数据没有）
			if (!itemMap.containsKey(PARAM_ROWNO)) {
				itemMap.put(PARAM_ROWNO, rowNo++);
			}
			result.add(itemMap);
		}
		return result;
	}

	/**
	 * 将 DTO 对象集合转为 Map 列表（DTO 均为 IEntity 子类）
	 */
	protected List<Map<String, Object>> convertDtoListToMapList(List<?> dtoList) throws Exception {
		List<Map<String, Object>> result = new ArrayList<>();
		int rowNo = 1;
		for (Object dto : dtoList) {
			if (!(dto instanceof IEntity)) {
				continue;
			}
			IEntity entity = (IEntity) dto;
			Entity temp = new Entity();
			entity.copyTo(temp);
			Map<String, Object> itemMap = new HashMap<>();
			if (temp.any() != null) {
				itemMap.putAll(temp.any());
			}
			if (!itemMap.containsKey(PARAM_ROWNO)) {
				itemMap.put(PARAM_ROWNO, rowNo++);
			}
			result.add(itemMap);
		}
		return result;
	}

	/**
	 * 默认报告文件后缀（.xlsx）
	 */
	@Override
	protected String getDefaultReportFileSuffix() {
		return ".xlsx";
	}

	@Override
	protected String getOriginalContentType() {
		return ReportContentType.XLSX.value;
	}

	@Override
	protected boolean isEnableOSSPDFMode() {
		return true;
	}
}