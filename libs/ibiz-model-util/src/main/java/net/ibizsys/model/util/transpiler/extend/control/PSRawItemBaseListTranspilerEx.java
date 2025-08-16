package net.ibizsys.model.util.transpiler.extend.control;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Properties;

import org.springframework.util.ObjectUtils;
import org.springframework.util.StringUtils;

import com.fasterxml.jackson.databind.node.ObjectNode;

import net.ibizsys.model.IPSModelObject;
import net.ibizsys.model.control.IPSRawItemBase;
import net.ibizsys.model.control.PSRawItemImpl;
import net.ibizsys.model.control.rawitem.IPSHtmlItem;
import net.ibizsys.model.control.rawitem.IPSMarkdownItem;
import net.ibizsys.model.control.rawitem.IPSTextItem;
import net.ibizsys.model.control.rawitem.PSHtmlItemImpl;
import net.ibizsys.model.control.rawitem.PSTextItemImpl;
import net.ibizsys.model.util.DataTypeUtils;
import net.ibizsys.model.util.transpiler.IPSModelTranspileContext;
import net.ibizsys.psmodel.core.domain.PSDEFormDetail;
import net.ibizsys.psmodel.core.util.IPSModel;

public class PSRawItemBaseListTranspilerEx extends net.ibizsys.model.util.transpiler.control.PSRawItemBaseListTranspiler {

	/**
	 * 编辑器参数：换行模式
	 */
	final static String PARAM_WRAPMODE = "WRAPMODE";

	/**
	 * 编辑器参数：内容垂直对齐方式
	 */
	final static String PARAM_VALIGN = "VALIGN";

	/**
	 * 编辑器参数：内容水平对齐方式
	 */
	final static String PARAM_HALIGN = "HALIGN";

	@Override
	protected void onDecompile(IPSModelTranspileContext iPSModelTranspileContext, IPSModelObject iPSModelObject, IPSModel domain, boolean bFullMode) throws Exception {
		super.onDecompile(iPSModelTranspileContext, iPSModelObject, domain, bFullMode);

		if (domain instanceof PSDEFormDetail) {
			PSDEFormDetail psDEFormDetail = (PSDEFormDetail)domain;
			if(iPSModelObject instanceof IPSRawItemBase) {
				IPSRawItemBase iPSRawItemBase = (IPSRawItemBase)iPSModelObject;
				psDEFormDetail.setContentType(iPSRawItemBase.getContentType());
				
				if(StringUtils.hasLength(iPSRawItemBase.getPredefinedType())) {
					psDEFormDetail.setPredefinedType(iPSRawItemBase.getPredefinedType());
				}
				
				if(StringUtils.hasLength(iPSRawItemBase.getCssStyle())) {
					psDEFormDetail.setRawCssStyle(iPSRawItemBase.getCssStyle());
				}
				
				if(StringUtils.hasLength(iPSRawItemBase.getDynaClass())) {
					psDEFormDetail.setDynaClass(iPSRawItemBase.getDynaClass());
				}
				
				if(iPSRawItemBase.getRawItemWidth() > 0) {
					psDEFormDetail.setCtrlWidth((int)iPSRawItemBase.getRawItemWidth());
				}
				
				if(iPSRawItemBase.getRawItemHeight() > 0) {
					psDEFormDetail.setCtrlHeight((int)iPSRawItemBase.getRawItemHeight());
				}
				
				if(iPSRawItemBase.isTemplateMode()) {
					psDEFormDetail.setTemplateMode(1);
				}
				
			}
			
			if(iPSModelObject instanceof IPSHtmlItem) {
				IPSHtmlItem iPSHtmlItem = (IPSHtmlItem)iPSModelObject;
				psDEFormDetail.setHtmlContent(iPSHtmlItem.getContent());
			}
			
			if(iPSModelObject instanceof IPSMarkdownItem) {
				IPSMarkdownItem iPSMarkdownItem = (IPSMarkdownItem)iPSModelObject;
				psDEFormDetail.setRawContent(iPSMarkdownItem.getContent());
			}
			
			if(iPSModelObject instanceof IPSTextItem) {
				IPSTextItem iPSTextItem = (IPSTextItem)iPSModelObject;
				psDEFormDetail.setRawContent(iPSTextItem.getCaption());
			}
			
			
			String strRawParams = getPSRawItemParams(iPSModelTranspileContext, iPSModelObject);
			if(StringUtils.hasLength(strRawParams)) {
				psDEFormDetail.setEditorParams(strRawParams);
			}
		}
	}

	public static String getPSRawItemParams(IPSModelTranspileContext iPSModelTranspileContext, IPSModelObject iPSModelObject) throws Exception {
		Map<String, String> params = new LinkedHashMap<String, String>();

		if (iPSModelObject instanceof IPSTextItem) {

			IPSTextItem iPSTextItem = (IPSTextItem) iPSModelObject;
			if (StringUtils.hasLength(iPSTextItem.getWrapMode())) {
				params.put(PARAM_WRAPMODE, iPSTextItem.getWrapMode());
			}

			if (StringUtils.hasLength(iPSTextItem.getVAlign())) {
				params.put(PARAM_VALIGN, iPSTextItem.getVAlign());
			}

			if (StringUtils.hasLength(iPSTextItem.getHAlign())) {
				params.put(PARAM_HALIGN, iPSTextItem.getHAlign());
			}
		}

		if (ObjectUtils.isEmpty(params)) {
			return null;
		}
		StringBuilder sb = new StringBuilder();
		boolean bFirst = true;
		for (java.util.Map.Entry<String, String> entry : params.entrySet()) {
			if (bFirst) {
				bFirst = false;
			} else {
				sb.append("\r\n");
			}

			sb.append(String.format("%1$s=%2$s", entry.getKey(), entry.getValue()));

		}

		return sb.toString();
	}

	@Override
	protected void onCompile(IPSModelTranspileContext iPSModelTranspileContext, IPSModel domain, ObjectNode objectNode) throws Exception {
		super.onCompile(iPSModelTranspileContext, domain, objectNode);

		objectNode.remove(PSRawItemImpl.ATTR_GETID);
		objectNode.remove(PSRawItemImpl.ATTR_GETCODENAME);

		String strContentType = (String) domain.get("contenttype");

		objectNode.put(PSRawItemImpl.ATTR_GETCONTENTTYPE, strContentType);

		if (domain instanceof PSDEFormDetail) {
			PSDEFormDetail psDEFormDetail = (PSDEFormDetail) domain;
			if (StringUtils.hasLength(psDEFormDetail.getPredefinedType())) {
				objectNode.put(PSRawItemImpl.ATTR_GETPREDEFINEDTYPE, psDEFormDetail.getPredefinedType());
			}
			if (StringUtils.hasLength(psDEFormDetail.getRawCssStyle())) {
				objectNode.put(PSRawItemImpl.ATTR_GETCSSSTYLE, psDEFormDetail.getRawCssStyle());
			}
			if (StringUtils.hasLength(psDEFormDetail.getDynaClass())) {
				objectNode.put(PSRawItemImpl.ATTR_GETDYNACLASS, psDEFormDetail.getDynaClass());
			}

			if (DataTypeUtils.getIntegerValue(psDEFormDetail.getCtrlWidth(), 0) > 0) {
				objectNode.put(PSRawItemImpl.ATTR_GETRAWITEMWIDTH, psDEFormDetail.getCtrlWidth());
			}

			if (DataTypeUtils.getIntegerValue(psDEFormDetail.getCtrlHeight(), 0) > 0) {
				objectNode.put(PSRawItemImpl.ATTR_GETRAWITEMHEIGHT, psDEFormDetail.getCtrlHeight());
			}

			if (DataTypeUtils.getBooleanValue(psDEFormDetail.getTemplateMode(), false)) {
				objectNode.put(PSRawItemImpl.ATTR_ISTEMPLATEMODE, true);
			}

			// 缺参数集合
			String strContent = psDEFormDetail.getRawContent();
			if (!StringUtils.hasLength(strContent)) {
				strContent = psDEFormDetail.getHtmlContent();
			}
			// 根据类型进一步设置
			switch (strContentType) {
			case "HTML": {

				objectNode.put(PSHtmlItemImpl.ATTR_GETCONTENT, strContent);
			}
				break;
			case "IMAGE":
				break;
			case "MARKDOWN": {
				objectNode.put(PSHtmlItemImpl.ATTR_GETCONTENT, strContent);
			}
				break;
			case "PLACEHOLDER":
				break;
			case "RAW": {
				objectNode.put(PSTextItemImpl.ATTR_GETCAPTION, strContent);
				
				//解出内容
				if(StringUtils.hasLength(psDEFormDetail.getEditorParams())) {
					setPSRawItemParams(iPSModelTranspileContext, domain, objectNode, psDEFormDetail.getEditorParams()); 
				}
				
			}
				break;
			case "VIDEO":
				break;
			default:
				break;
			}
		}

		//
		// @Override
		// @PSModelRTMeta(description="系统样式表")
		// public IPSSysCss getPSSysCss() {
		// return this.getPSRawItemContainer().getPSSysCss();
		// }

	}
	
	
	public static void setPSRawItemParams(IPSModelTranspileContext iPSModelTranspileContext, IPSModel domain, ObjectNode objectNode, String strPSRawItemParams) throws Exception {
		Map<String, String> params = new LinkedHashMap<String, String>();
		
		InputStream inputStream = new ByteArrayInputStream(strPSRawItemParams.getBytes("utf8"));
		Properties properties = new Properties();
		properties.load(inputStream);
		
		for(Object key : properties.keySet()) {
			String strValue = (String)properties.get(key);
			if(!StringUtils.hasLength(strValue)) {
				continue;
			}
			params.put((String)key, new String(strValue.getBytes("ISO-8859-1"), "utf8"));
		}
		
		if(params.containsKey(PARAM_WRAPMODE)) {
			objectNode.put(PSTextItemImpl.ATTR_GETWRAPMODE, params.get(PARAM_WRAPMODE));
		}
		
		if(params.containsKey(PARAM_VALIGN)) {
			objectNode.put(PSTextItemImpl.ATTR_GETVALIGN, params.get(PARAM_VALIGN));
		}
		
		if(params.containsKey(PARAM_HALIGN)) {
			objectNode.put(PSTextItemImpl.ATTR_GETHALIGN, params.get(PARAM_HALIGN));
		}
		
	}
}