package net.ibizsys.central.plugin.poi.dataentity.print;

import java.io.*;
import java.util.ArrayList;
import java.util.Base64;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.apache.poi.xwpf.usermodel.*;
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
			// ;
			
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
//		return new IFontProvider() {
//
//			@Override
//			public Font getFont(String familyName, String encoding, float size, int style, Color color) {
//				try {
//					BaseFont bfChinese = BaseFont.createFont("C:/Windows/Fonts/simsun.ttc,1", BaseFont.IDENTITY_H, BaseFont.NOT_EMBEDDED);
//					Font fontChinese = new Font(bfChinese, size, style, color);
//					if (familyName != null) {
//						fontChinese.setFamily(familyName);
//					}
//					return fontChinese;
//				} catch (Exception ex) {
//					log.error(ex);
//					return null;
//				}
//			}
//		};
		return FontProviderHolder.getFontProvider();
	}
	
	public static void main(String[] args) {
		
		try {
			
			FontProviderHolder.setFontFolder("C:/Windows/Fonts");
			
			
			XWPFTemplate template = null;
//			String strReportModel = "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";
//			byte[] bytes = Base64.getDecoder().decode(strReportModel);
//			
//			File tempFile2 = java.io.File.createTempFile("aaa",".docx");
			
			File tempFile2 = new File("d:\\att_template1.1.docx"); 
			
//			
//			try(OutputStream os = new FileOutputStream(tempFile2)){
//				os.write(bytes);
//			}
			
			InputStream sbs = new FileInputStream(tempFile2);

			

			Map<String, Object> model = new HashMap<String, Object>();
			
			model.put("ormdeptname", "部门名称2");
			
			LoopRowTableRenderPolicy policy = new LoopRowTableRenderPolicy();

			Configure config = Configure.builder()
			        .bind("details", policy).bind("labors", policy).build(); 

			template = XWPFTemplate.compile(sbs, config);
//			
//			XWPFTemplate template = XWPFTemplate.compile(resource, config).render(
//			  new HashMap<String, Object>() {{
//			      put("goods", goods);
//			      put("labors", labors);
//			    }}
//			);
			
			
			List<Map<String, Object>> list = new ArrayList<Map<String,Object>>();
			for(int i =0;i<2;i++) {
				Map<String, Object> item = new HashMap<String, Object>();
				item.put("pimpersonname", String.format("名称%1$s", i));
				item.put("personno", String.format("N%1$s", i));
				list.add(item);
			}
			
			model.put("details", list);
			
			
			
			template.render(model);
			

			PdfOptions options = PdfOptions.create();
			options.fontProvider(FontProviderHolder.getFontProvider());
			options.fontEncoding(PdfOptions.getDefault().getFontEncoding());
			//options.setConfiguration(configuration);
			
			File tempFile = java.io.File.createTempFile("bbb",".pdf");
			File tempFile3 = java.io.File.createTempFile("ccc",".docx");
			
			
			template.getXWPFDocument().write(new FileOutputStream(tempFile3));

			PdfConverterEx.getInstance().convert(template.getXWPFDocument(), new FileOutputStream(tempFile), options);
			
			System.out.print("测试");
		}
		catch(Exception ex) {
			ex.printStackTrace();
		}
		
	}
	
}
