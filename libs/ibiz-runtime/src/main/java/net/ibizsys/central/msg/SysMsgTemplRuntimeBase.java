package net.ibizsys.central.msg;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.springframework.util.ObjectUtils;
import org.springframework.util.StringUtils;

import net.ibizsys.central.ISystemRuntime;
import net.ibizsys.central.dataentity.IDataEntityRuntime;
import net.ibizsys.central.util.IEntityDTO;
import net.ibizsys.central.util.ISearchContextDTO;
import net.ibizsys.model.PSModelEnums.MsgTemplEngine;
import net.ibizsys.model.PSModelEnums.MsgTemplType;

public abstract class SysMsgTemplRuntimeBase extends net.ibizsys.runtime.msg.SysMsgTemplRuntime implements ISysMsgTemplRuntime {

	private static final org.apache.commons.logging.Log log = org.apache.commons.logging.LogFactory.getLog(SysMsgTemplRuntimeBase.class);
	private MsgTemplType msgTemplType = MsgTemplType.STATIC;
	private MsgTemplEngine msgTemplEngine = MsgTemplEngine.FREEMARKER;
	private Map<String, IEntityDTO > deMsgTemplMap = null;
	
	@Override
	protected void onInit() throws Exception {
		
		if(StringUtils.hasLength(this.getPSSysMsgTempl().getMsgTemplType())) {
			this.msgTemplType = MsgTemplType.from(this.getPSSysMsgTempl().getMsgTemplType());
		}
		
		if(StringUtils.hasLength(this.getPSSysMsgTempl().getTemplEngine())) {
			this.msgTemplEngine = MsgTemplEngine.from(this.getPSSysMsgTempl().getTemplEngine());
		}
		
		if(this.getMsgTemplType() == MsgTemplType.DE) {
			this.prepareDEMsgTempl();
		}
		
		super.onInit();
	}
	
	public MsgTemplType getMsgTemplType() {
		return this.msgTemplType;
	}
	
	public MsgTemplEngine getMsgTemplEngine() {
		return this.msgTemplEngine;
	}
	
	@Override
	public ISystemRuntime getSystemRuntime() {
		return (ISystemRuntime)super.getSystemRuntime();
	}
	
	protected void prepareDEMsgTempl() throws Exception {
		IDataEntityRuntime iDataEntityRuntime = this.getSystemRuntime().getDataEntityRuntime(this.getPSSysMsgTempl().getPSDataEntityMust().getId());
		ISearchContextDTO iSearchContextDTO = iDataEntityRuntime.createSearchContext().count(false).all();
		String strMsgTemplTag = this.getPSSysMsgTempl().getMsgTemplTag();
		if(ObjectUtils.isEmpty(strMsgTemplTag)) {
			strMsgTemplTag = this.getPSSysMsgTempl().getCodeName();
		}
		
		iSearchContextDTO.eq( this.getPSSysMsgTempl().getTemplTagPSDEFieldMust().getName(), strMsgTemplTag);

		List<IEntityDTO> list = null;
		if(this.getPSSysMsgTempl().getPSDEDataSet() != null) {
			list = iDataEntityRuntime.selectDataSet(this.getPSSysMsgTempl().getPSDEDataSet(), iSearchContextDTO);
		}
		else {
			list = iDataEntityRuntime.select(iSearchContextDTO);
		}
		
		if(ObjectUtils.isEmpty(list)) {
			throw new Exception(String.format("无法获取指定标记[%1$s]的模板数据", strMsgTemplTag));
		}
		
		this.deMsgTemplMap = new LinkedHashMap<String, IEntityDTO>();
		if(this.getPSSysMsgTempl().getLanPSDEField() != null) {
			String strLanFieldName = this.getPSSysMsgTempl().getLanPSDEField().getLowerCaseName();
			for(IEntityDTO iEntityDTO : list) {
				String strLan = iEntityDTO.getString(strLanFieldName, null);
				if(ObjectUtils.isEmpty(strLan)) {
					strLan = "";
				}
				if(this.deMsgTemplMap.containsKey(strLan)) {
					log.warn(String.format("语言[%1$s]模板已经定义，忽略", strLan));
					continue;
				}
				this.deMsgTemplMap.put(strLan, iEntityDTO);
			}
		}
		else {
			for(IEntityDTO iEntityDTO : list) {
				this.deMsgTemplMap.put("", iEntityDTO);
				break;
			}
		}
	}
	
	@Override
	protected String getContent() {
		if(this.deMsgTemplMap != null && this.getPSSysMsgTempl().getContentPSDEField() != null) {
			String strContent = this.getDEMsgTemplContent(this.getPSSysMsgTempl().getContentPSDEField().getLowerCaseName());
			if(StringUtils.hasLength(strContent)) {
				return strContent;
			}
		}
		return super.getContent();
	}
	
	@Override
	protected String getSubject() {
		if(this.deMsgTemplMap != null && this.getPSSysMsgTempl().getSubjectPSDEField() != null) {
			String strContent = this.getDEMsgTemplContent(this.getPSSysMsgTempl().getSubjectPSDEField().getLowerCaseName());
			if(StringUtils.hasLength(strContent)) {
				return strContent;
			}
		}
		return super.getSubject();
	}
	
	@Override
	protected String getDDContent() {
		if(this.deMsgTemplMap != null && this.getPSSysMsgTempl().getDDContentPSDEField() != null) {
			String strContent = this.getDEMsgTemplContent(this.getPSSysMsgTempl().getDDContentPSDEField().getLowerCaseName());
			if(StringUtils.hasLength(strContent)) {
				return strContent;
			}
		}
		return super.getDDContent();
	}
	
	@Override
	protected String getIMContent() {
		if(this.deMsgTemplMap != null && this.getPSSysMsgTempl().getIMContentPSDEField() != null) {
			String strContent = this.getDEMsgTemplContent(this.getPSSysMsgTempl().getIMContentPSDEField().getLowerCaseName());
			if(StringUtils.hasLength(strContent)) {
				return strContent;
			}
		}
		return super.getIMContent();
	}
	
	@Override
	protected String getSMSContent() {
		if(this.deMsgTemplMap != null && this.getPSSysMsgTempl().getSMSContentPSDEField() != null) {
			String strContent = this.getDEMsgTemplContent(this.getPSSysMsgTempl().getSMSContentPSDEField().getLowerCaseName());
			if(StringUtils.hasLength(strContent)) {
				return strContent;
			}
		}
		return super.getSMSContent();
	}
	
	@Override
	protected String getWXContent() {
		if(this.deMsgTemplMap != null && this.getPSSysMsgTempl().getWXContentPSDEField() != null) {
			String strContent = this.getDEMsgTemplContent(this.getPSSysMsgTempl().getWXContentPSDEField().getLowerCaseName());
			if(StringUtils.hasLength(strContent)) {
				return strContent;
			}
		}
		return super.getWXContent();
	}
	
	@Override
	protected String getUrl() {
		if(this.deMsgTemplMap != null && this.getPSSysMsgTempl().getTaskUrlPSDEField() != null) {
			String strContent = this.getDEMsgTemplContent(this.getPSSysMsgTempl().getTaskUrlPSDEField().getLowerCaseName());
			if(StringUtils.hasLength(strContent)) {
				return strContent;
			}
		}
		return super.getUrl();
	}
	
	@Override
	protected String getMobileUrl() {
		if(this.deMsgTemplMap != null && this.getPSSysMsgTempl().getMobTaskUrlPSDEField() != null) {
			String strContent = this.getDEMsgTemplContent(this.getPSSysMsgTempl().getMobTaskUrlPSDEField().getLowerCaseName());
			if(StringUtils.hasLength(strContent)) {
				return strContent;
			}
		}
		return super.getMobileUrl();
	}
	
	
	protected String getDEMsgTemplContent(String fieldName){
		//判断语言
		String strLan = "";
		
		//
		IEntityDTO iEntityDTO = deMsgTemplMap.get(strLan);
		if(iEntityDTO == null) {
			return null;
		}
		
		return iEntityDTO.getString(fieldName, null);
	}
	

	@Override
	public String getContent(Object data, Map<String, Object> params) {
		if(!StringUtils.hasLength(this.getContent())) {
			return null;
		}
		return getTemplContent(TEMPL_CONTENT, data, params);
	}

	@Override
	public String getSubject(Object data, Map<String, Object> params) {
		if(!StringUtils.hasLength(this.getSubject())) {
			return null;
		}
		return getTemplContent(TEMPL_SUBJECT, data, params);
	}

	@Override
	public String getSMSContent(Object data, Map<String, Object> params) {
		if(!StringUtils.hasLength(this.getSMSContent())) {
			return null;
		}
		return getTemplContent(TEMPL_SMSCONTENT, data, params);
	}

	@Override
	public String getWXContent(Object data, Map<String, Object> params) {
		if(!StringUtils.hasLength(this.getWXContent())) {
			return null;
		}
		return getTemplContent(TEMPL_WXCONTENT, data, params);
	}

	@Override
	public String getDDContent(Object data, Map<String, Object> params) {
		if(!StringUtils.hasLength(this.getDDContent())) {
			return null;
		}
		return getTemplContent(TEMPL_DDCONTENT, data, params);
	}

	@Override
	public String getIMContent(Object data, Map<String, Object> params) {
		if(!StringUtils.hasLength(this.getIMContent())) {
			return null;
		}
		return getTemplContent(TEMPL_IMCONTENT, data, params);
	}

	@Override
	public String getUrl(Object data, Map<String, Object> params) {
		if(!StringUtils.hasLength(this.getUrl())) {
			return null;
		}
		return getTemplContent(TEMPL_URL, data, params);
	}
	
	
	@Override
	public String getMobileUrl(Object data, Map<String, Object> params) {
		if(!StringUtils.hasLength(this.getMobileUrl())) {
			return null;
		}
		return getTemplContent(TEMPL_MOBILEURL, data, params);
	}

	@Override
	protected void onReset() throws Throwable {
		if(this.getMsgTemplType() == MsgTemplType.DE) {
			this.prepareDEMsgTempl();
		}
		super.onReset();
	}
}
