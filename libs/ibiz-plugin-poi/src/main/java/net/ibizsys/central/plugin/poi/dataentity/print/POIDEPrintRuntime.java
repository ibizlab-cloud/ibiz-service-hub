package net.ibizsys.central.plugin.poi.dataentity.print;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Base64;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.springframework.util.ObjectUtils;
import org.springframework.util.StringUtils;

import com.deepoove.poi.XWPFTemplate;
import com.deepoove.poi.config.Configure;
import com.deepoove.poi.config.ConfigureBuilder;
import com.deepoove.poi.plugin.table.LoopRowTableRenderPolicy;

import fr.opensagres.poi.xwpf.converter.pdf.PdfOptions;
import fr.opensagres.xdocreport.itext.extension.font.IFontProvider;
import net.ibizsys.central.dataentity.IDataEntityRuntime;
import net.ibizsys.central.dataentity.print.DEPrintRuntime;
import net.ibizsys.central.plugin.poi.util.FontProviderHolder;
import net.ibizsys.central.plugin.poi.util.PdfConverterEx;
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

public class POIDEPrintRuntime extends DEPrintRuntime {

	private static final org.apache.commons.logging.Log log = org.apache.commons.logging.LogFactory.getLog(POIDEPrintRuntime.class);
	
	public final static String PARAM_DETAILS = "details";
	
	public final static String PARAM_ROWNO = "srfrowno";
	
	@Override
	protected void onInit() throws Exception {
		super.onInit();

//		if (!StringUtils.hasLength(this.getReportFilePath()) && !StringUtils.hasLength(this.getReportModel())) {
//			throw new Exception(String.format("未定义报表路径或模型"));
//		}
	}

	@Override
	protected void onOutput(OutputStream outputStream, IEntityBase[] list, String strType) throws Throwable {

		//设置字体目录
		if(!StringUtils.hasLength(FontProviderHolder.getFontFolder())) {
			FontProviderHolder.setFontFolder(this.getSystemRuntime().getFontFolder());
		}

		List<XWPFTemplate> templates = new ArrayList<>();
		List<ByteArrayOutputStream> pdfStreams = new ArrayList<>();
		PdfOptions options = PdfOptions.create()
				.fontProvider(getFontProvider())
				.fontEncoding(PdfOptions.getDefault().getFontEncoding());


		for (IEntityBase iEntityBase : list) {
			IEntity iEntity = null;
			if (iEntityBase instanceof IEntityDTO) {
				iEntity = new Entity();
				((IEntityDTO) iEntityBase).copyTo(iEntity);
			} else if (iEntityBase instanceof IEntity) {
				iEntity = (IEntity) iEntityBase;
			} else {
				throw new Exception(String.format("无法识别的数据对象"));
			}

			Map<String, Object> model = new HashMap<String, Object>();
			
		
			Map<String, Object> map = iEntity.any();
			if (map != null) {
				for (java.util.Map.Entry<String, Object> entry : map.entrySet()) {
					Object objValue = entry.getValue();
					model.put(entry.getKey(), objValue);
				}
			}

			if(!model.containsKey(PARAM_DETAILS)) {
				// 获取明细数据，后续考虑通过自定义行为直接填充对象，解决代码表等问题
				List<? extends IEntity> detailList = this.selectDetails(iEntity);
				if(detailList != null) {
					List<Map<String, Object>> mapList = new ArrayList<Map<String,Object>>();
					int nRowNo = 1;
					for(IEntity detailEntity : detailList) {
						Entity temp = new Entity();
						detailEntity.copyTo(temp);
						
						Map<String, Object> detailMap = new HashMap<String, Object>();
						if(temp.any() != null) {
							detailMap.putAll(temp.any());
						}
						
						if(!detailMap.containsKey(PARAM_ROWNO)){
							detailMap.put(PARAM_ROWNO, nRowNo);
						}
						
						mapList.add(detailMap);
						nRowNo++;
					}
					
					model.put(PARAM_DETAILS, mapList);
				}
			}
			
			Map<String, Object> detailsMap = new LinkedHashMap<String, Object>();
			
			IPSDataEntity iPSDataEntity = this.getPSDEPrint().getParentPSModelObject(IPSDataEntity.class);
			//循环属性
			java.util.List<IPSDEField> psDEFieldList = iPSDataEntity.getAllPSDEFields();
			if(!ObjectUtils.isEmpty(psDEFieldList)) {
				for(IPSDEField iPSDEField : psDEFieldList) {
					Object value = model.get(iPSDEField.getLowerCaseName());
					if(value == null) {
						continue;
					}
					
					if(DEFDataType.ONE2MANYDATA.value.equalsIgnoreCase(iPSDEField.getDataType())
							|| DEFDataType.ONE2MANYDATA_MAP.value.equalsIgnoreCase(iPSDEField.getDataType())) {
						IPSOne2ManyDataDEField iPSOne2ManyDataDEField = (IPSOne2ManyDataDEField)iPSDEField;
						
						List dtoList = null;
						if(!iPSOne2ManyDataDEField.isMap()) {
							dtoList = (List)value;
						}
						else {
							Map dtoMap = (Map)value;
							dtoList = new ArrayList<>();
							dtoList.addAll(dtoMap.values());
						}
						
						if(ObjectUtils.isEmpty(dtoList)) {
							continue;
						}
						
						IPSDataEntity minorPSDataEntity = iPSOne2ManyDataDEField.getPSDERMust().getMinorPSDataEntityMust();
						IDataEntityRuntime minorDataEntityRuntime = this.getSystemRuntime().getDataEntityRuntime(minorPSDataEntity.getId(), false);
						
						List<Map<String, Object>> mapList = new ArrayList<Map<String,Object>>();
						int nRowNo = 1;
						for(Object dto  : dtoList) {
							IEntity detailEntity = (IEntity)dto;
							
							minorDataEntityRuntime.fillEntityCodeListTexts(detailEntity, this.getCodeItemTextSuffix());
							
							Entity temp = new Entity();
							detailEntity.copyTo(temp);
							
							Map<String, Object> detailMap = new HashMap<String, Object>();
							if(temp.any() != null) {
								detailMap.putAll(temp.any());
							}
							
							if(!detailMap.containsKey(PARAM_ROWNO)){
								detailMap.put(PARAM_ROWNO, nRowNo);
							}
							
							mapList.add(detailMap);
							nRowNo++;
						}
						
						model.put(iPSDEField.getLowerCaseName(), mapList);
						detailsMap.put(iPSDEField.getLowerCaseName(), mapList);
						continue;
					}
					
					if(DEFDataType.ONE2MANYOBJ.value.equalsIgnoreCase(iPSDEField.getDataType())
							|| DEFDataType.ONE2MANYOBJ_MAP.value.equalsIgnoreCase(iPSDEField.getDataType())) {
						IPSOne2ManyObjDEField iPSOne2ManyObjDEField = (IPSOne2ManyObjDEField)iPSDEField;
						
						List dtoList = null;
						if(!iPSOne2ManyObjDEField.isMap()) {
							dtoList = (List)value;
						}
						else {
							Map dtoMap = (Map)value;
							dtoList = new ArrayList<>();
							dtoList.addAll(dtoMap.values());
						}
						
						if(ObjectUtils.isEmpty(dtoList)) {
							continue;
						}
						
						
						List<Map<String, Object>> mapList = new ArrayList<Map<String,Object>>();
						int nRowNo = 1;
						for(Object dto  : dtoList) {
							IEntity detailEntity = (IEntity)dto;
							
							Entity temp = new Entity();
							detailEntity.copyTo(temp);
							
							Map<String, Object> detailMap = new HashMap<String, Object>();
							if(temp.any() != null) {
								detailMap.putAll(temp.any());
							}
							
							if(!detailMap.containsKey(PARAM_ROWNO)){
								detailMap.put(PARAM_ROWNO, nRowNo);
							}
							
							mapList.add(detailMap);
							nRowNo++;
						}
						
						model.put(iPSDEField.getLowerCaseName(), mapList);
						detailsMap.put(iPSDEField.getLowerCaseName(), mapList);
						continue;
					}
				}
			}
			
			
			LoopRowTableRenderPolicy policy = new LoopRowTableRenderPolicy();
			
			ConfigureBuilder builer = Configure.builder();
			builer.bind("details", policy).bind("details2", policy).bind("details3", policy).bind("details4", policy);
			for(java.util.Map.Entry<String, Object> entry : detailsMap.entrySet()) {
				builer.bind(entry.getKey(), policy);
			}
			        
			Configure config = builer.build(); 

			XWPFTemplate template = null;
			String strReportModel = this.getReportModel();
			if (StringUtils.hasLength(strReportModel)) {
				byte[] bytes = Base64.getDecoder().decode(strReportModel);
				InputStream sbs = new ByteArrayInputStream(bytes);

				template = XWPFTemplate.compile(sbs, config);
			} else {
				template = XWPFTemplate.compile(this.getReportFilePath(), config);
			}

			templates.add(template);
			template.render(model);

			if (list.length == 1) {
				if (ReportContentType.DOCX.value.equalsIgnoreCase(strType))
					template.write(outputStream);
				else
					PdfConverterEx.getInstance().convert(template.getXWPFDocument(), outputStream, options);
			}
			else {

				ByteArrayOutputStream tempPdf = new ByteArrayOutputStream();
				PdfConverterEx.getInstance().convert(template.getXWPFDocument(), tempPdf, options);
				pdfStreams.add(tempPdf);
			}
		}
		if (list.length > 1) {

			org.apache.pdfbox.multipdf.PDFMergerUtility merger = new org.apache.pdfbox.multipdf.PDFMergerUtility();
			merger.setDestinationStream(outputStream);

			for (ByteArrayOutputStream pdfStream : pdfStreams) {
				merger.addSource(new ByteArrayInputStream(pdfStream.toByteArray()));
			}

			merger.mergeDocuments(org.apache.pdfbox.io.MemoryUsageSetting.setupMainMemoryOnly());
		}

		templates.forEach(template ->{
			// 清理资源
			try {
				if (template != null) template.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		});
	}

	@Override
	protected String getDefaultReportFileSuffix() {
		return ".docx";
	}

	protected IFontProvider getFontProvider() {
		return FontProviderHolder.getFontProvider();
	}
	
}
