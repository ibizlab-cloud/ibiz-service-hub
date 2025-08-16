package net.ibizsys.central.plugin.extension.psmodel.service;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.data.domain.Page;
import org.springframework.util.ObjectUtils;
import org.springframework.util.StringUtils;

import com.fasterxml.jackson.databind.node.ObjectNode;

import net.ibizsys.central.cloud.core.util.domain.V2SystemExtensionForm;
import net.ibizsys.central.cloud.core.util.domain.V2SystemExtensionScopeType;
import net.ibizsys.central.plugin.extension.psmodel.util.ExtensionUtils;
import net.ibizsys.central.plugin.extension.psmodel.util.IExtensionPSModelRTServiceSession;
import net.ibizsys.central.util.SearchContextDTO;
import net.ibizsys.model.PSModelEnums.FormType;
import net.ibizsys.model.app.IPSApplication;
import net.ibizsys.model.control.form.IPSDEEditForm;
import net.ibizsys.model.util.DataTypes;
import net.ibizsys.psmodel.core.domain.PSDEForm;
import net.ibizsys.psmodel.core.domain.PSDataEntity;
import net.ibizsys.psmodel.core.domain.PSWFDE;
import net.ibizsys.psmodel.core.filter.PSDEFormFilter;
import net.ibizsys.psmodel.core.util.DataTypeUtils;
import net.ibizsys.psmodel.core.util.IPSModelFilter;
import net.ibizsys.psmodel.core.util.PSModels;
import net.ibizsys.runtime.util.JsonUtils;

public class PSDEFormRTService extends net.ibizsys.psmodel.runtime.service.PSDEFormRTService {

	private static final Log log = LogFactory.getLog(PSDEFormRTService.class);

	/**
	 * 行为：应用指定扩展表单
	 */
	final public static String METHOD_APPLY = "APPLY";

	/**
	 * 行为：应用指定扩展表单（仅应用，不通知）
	 */
	final public static String METHOD_APPLYONLY = "APPLYONLY";
	
	
	@Override
	protected Object doInvoke(String methodName, String key, Object params) throws Exception {

		if (METHOD_APPLY.equalsIgnoreCase(methodName)) {
			PSDEForm domain = this.getDomain(params);
			if (StringUtils.hasLength(key)) {
				domain.setId(key);
			}
			return this.apply(domain);
		}
		
		if (METHOD_APPLYONLY.equalsIgnoreCase(methodName)) {
			PSDEForm domain = this.getDomain(params);
			if (StringUtils.hasLength(key)) {
				domain.setId(key);
			}
			return this.applyOnly(domain);
		}

		return super.doInvoke(methodName, key, params);
	}
	
	@Override
	protected PSDEForm doGet(String key, boolean tryMode) throws Exception {
		IExtensionPSModelRTServiceSession iExtensionPSModelRTServiceSession = (IExtensionPSModelRTServiceSession)this.getPSModelRTServiceSession();
		if(StringUtils.hasLength(iExtensionPSModelRTServiceSession.getExtensionId())) {
			String strPSDEId = getParentId(key);
			
			SearchContextDTO searchContextDTO = new SearchContextDTO();
			searchContextDTO.all();
			
			if(strPSDEId.indexOf("@") == -1) {
				searchContextDTO.eq(V2SystemExtensionForm.FIELD_SCOPE_TYPE, V2SystemExtensionScopeType.DATAENTITY.value);
				searchContextDTO.eq(V2SystemExtensionForm.FIELD_DATA_ENTITY_TAG, strPSDEId);
			}
			else {
				searchContextDTO.eq(V2SystemExtensionForm.FIELD_SCOPE_TYPE, V2SystemExtensionScopeType.DATA.value);
				searchContextDTO.eq(V2SystemExtensionForm.FIELD_DATA_ENTITY_TAG, strPSDEId.split("[@]")[1]);
			}
			searchContextDTO.eq(V2SystemExtensionForm.FIELD_SCOPE_TAG, strPSDEId);
			searchContextDTO.eq(V2SystemExtensionForm.FIELD_FORM_TAG, key);
			
			Page<V2SystemExtensionForm> page = iExtensionPSModelRTServiceSession.getCloudExtensionClient().fetchSystemExtensionForms(iExtensionPSModelRTServiceSession.getExtensionId(), searchContextDTO);
			if(!ObjectUtils.isEmpty(page) && !ObjectUtils.isEmpty(page.getContent())) {
				List<PSDEForm> psDEFormList = ExtensionUtils.toPSModelList(page.getContent(), V2SystemExtensionForm.FIELD_FORM_TAG, PSDEForm.class);
				if(!ObjectUtils.isEmpty(psDEFormList)) {
					return psDEFormList.get(0);
				}
			}
			
			//没有找到，尝试
			if(key.indexOf("@") != -1) {
				//取默认
				PSDEForm psDEForm = this.doGet(key.split("[@]")[1], tryMode);
				if(psDEForm != null) {
					//重置动态实例
					psDEForm.set(ExtensionUtils.FIELD_PSDYNAINSTID, ExtensionUtils.DYNAINSTID_PARENT);
					psDEForm.setPSDEFormId(key);
					psDEForm.setPSDEId(getParentId(key));
					String strData = key.split("[@]")[0];
					if(strData.indexOf("WFDE__") == 0) {
						psDEForm.setPSWFDEId(strData.substring(6));
					}
					return psDEForm;
				}
			}
		}
		PSDEForm psDEForm = super.doGet(key, tryMode);
		
		return psDEForm;
	}
	
	@Override
	protected void doCreate(PSDEForm m) throws Exception {
		
		IExtensionPSModelRTServiceSession iExtensionPSModelRTServiceSession = (IExtensionPSModelRTServiceSession)this.getPSModelRTServiceSession();
		if(!StringUtils.hasLength(iExtensionPSModelRTServiceSession.getExtensionId())) {
			throw new Exception("未支持扩展");
		}
		
		PSDataEntity psDataEntity = (PSDataEntity)this.getPSModelRTServiceSession().getCachePSModel(PSModels.PSDATAENTITY, m.getPSDEId());
		
		V2SystemExtensionForm v2SystemExtensionForm = new V2SystemExtensionForm();
		if(m.getPSDEId().indexOf("@") == -1) {
			v2SystemExtensionForm.setScopeType(V2SystemExtensionScopeType.DATAENTITY.value);
		}
		else {
			v2SystemExtensionForm.setScopeType(V2SystemExtensionScopeType.DATA.value);
		}
		m.reset("psdynainstid");
		v2SystemExtensionForm.setName(m.getPSDEFormName());
		v2SystemExtensionForm.setScopeTag(m.getPSDEId());
		v2SystemExtensionForm.setFormTag(m.getId());
		v2SystemExtensionForm.setDataEntityTag(psDataEntity.getPSDataEntityId());
		v2SystemExtensionForm.setPendingExtensionModel(ExtensionUtils.toExtensionModel(m));
		v2SystemExtensionForm.setApplyFlag(0);
		
		iExtensionPSModelRTServiceSession.getCloudExtensionClient().createSystemExtensionForm(iExtensionPSModelRTServiceSession.getExtensionId(), v2SystemExtensionForm);
		m.set("applyflag", 0);
	}
	
	
	@Override
	protected List<PSDEForm> getDomainList(String strDataSetName, PSDEFormFilter f) throws Exception {
		List<PSDEForm> list = super.getDomainList(strDataSetName, f);
		IExtensionPSModelRTServiceSession iExtensionPSModelRTServiceSession = (IExtensionPSModelRTServiceSession)this.getPSModelRTServiceSession();
		if(!StringUtils.hasLength(iExtensionPSModelRTServiceSession.getExtensionId())) {
			return list;
		}
		
		Object objPSDEId = f.getFieldCond(PSDEForm.FIELD_PSDEID, IPSModelFilter.EQ);
		if(ObjectUtils.isEmpty(objPSDEId)) {
			Object objPSWFDEId = f.getFieldCond(PSDEForm.FIELD_PSWFDEID, IPSModelFilter.EQ);
			if(!ObjectUtils.isEmpty(objPSWFDEId)) {
				PSWFDE psWFDE = (PSWFDE)iExtensionPSModelRTServiceSession.getCachePSModel(PSModels.PSWFDE, objPSWFDEId.toString());
				//objPSDEId = psWFDE.getPSDEId();
				objPSDEId = String.format("WFDE__%1$s@%2$s", objPSWFDEId, psWFDE.getPSDEId());
			}
		}
		
			
		if(ObjectUtils.isEmpty(objPSDEId)) {
			return list;
		}
		
		String strPSDEId = objPSDEId.toString();
		
		if(true) {
			SearchContextDTO searchContextDTO = new SearchContextDTO();
			searchContextDTO.all();
			
			searchContextDTO.eq(V2SystemExtensionForm.FIELD_SCOPE_TYPE, V2SystemExtensionScopeType.DATAENTITY.value);
			if(strPSDEId.indexOf("@") == -1) {
				searchContextDTO.eq(V2SystemExtensionForm.FIELD_DATA_ENTITY_TAG, strPSDEId);
				searchContextDTO.eq(V2SystemExtensionForm.FIELD_SCOPE_TAG, strPSDEId);
			}
			else {
				searchContextDTO.eq(V2SystemExtensionForm.FIELD_DATA_ENTITY_TAG, strPSDEId.split("[@]")[1]);
				searchContextDTO.eq(V2SystemExtensionForm.FIELD_SCOPE_TAG, strPSDEId.split("[@]")[1]);
			}
			Page<V2SystemExtensionForm> page = iExtensionPSModelRTServiceSession.getCloudExtensionClient().fetchSystemExtensionForms(iExtensionPSModelRTServiceSession.getExtensionId(), searchContextDTO);
			if(!ObjectUtils.isEmpty(page) && !ObjectUtils.isEmpty(page.getContent())) {
				List<PSDEForm> psDEFormList = ExtensionUtils.toPSModelList(page.getContent(), V2SystemExtensionForm.FIELD_FORM_TAG, PSDEForm.class);
				list = ExtensionUtils.replacePSModelList(list, psDEFormList, PSDEForm.class);
			}
		}
		
		if(strPSDEId.indexOf("@") != -1) {
			SearchContextDTO searchContextDTO = new SearchContextDTO();
			searchContextDTO.all();
			
			searchContextDTO.eq(V2SystemExtensionForm.FIELD_SCOPE_TYPE, V2SystemExtensionScopeType.DATA.value);
			searchContextDTO.eq(V2SystemExtensionForm.FIELD_DATA_ENTITY_TAG, strPSDEId.split("[@]")[1]);
			searchContextDTO.eq(V2SystemExtensionForm.FIELD_SCOPE_TAG, strPSDEId);
			
			Page<V2SystemExtensionForm> page = iExtensionPSModelRTServiceSession.getCloudExtensionClient().fetchSystemExtensionForms(iExtensionPSModelRTServiceSession.getExtensionId(), searchContextDTO);
			if(!ObjectUtils.isEmpty(page) && !ObjectUtils.isEmpty(page.getContent())) {
				List<PSDEForm> psDEFormList = ExtensionUtils.toPSModelList(page.getContent(), V2SystemExtensionForm.FIELD_FORM_TAG, PSDEForm.class);
				list = ExtensionUtils.replacePSModelList(list, psDEFormList, PSDEForm.class);
			}
		}
		
		return this.filterDomainList(list, strDataSetName, f) ;		
	}
	
	
	@Override
	protected PSDEForm getLast(PSDEForm m) throws Exception {
		return this.get(m.getId(), false);
	}
	
	@Override
	protected void doMergeLast(PSDEForm m, PSDEForm last) throws Exception {
		m.resetPSDEId();
		m.resetPSDEName();
		m.resetCodeName();
		m.reset("psdynainstid");
		super.doMergeLast(m, last);
	}
	
	@Override
	protected void doUpdate(PSDEForm m) throws Exception {
		
		IExtensionPSModelRTServiceSession iExtensionPSModelRTServiceSession = (IExtensionPSModelRTServiceSession)this.getPSModelRTServiceSession();
		String strExtensionId = iExtensionPSModelRTServiceSession.getExtensionIdMust();
		
		String strPSDynaInstId = (String)m.get(ExtensionUtils.FIELD_PSDYNAINSTID);
		if(!StringUtils.hasLength(strPSDynaInstId)
				|| ExtensionUtils.DYNAINSTID_PARENT.equals(strPSDynaInstId)) {
			this.doCreate(m);
			return;
		}
		
		V2SystemExtensionForm v2SystemExtensionForm = new V2SystemExtensionForm();
		v2SystemExtensionForm.setPendingExtensionModel(ExtensionUtils.toExtensionModel(m));
		v2SystemExtensionForm.setApplyFlag(0);
		
		iExtensionPSModelRTServiceSession.getCloudExtensionClient().updateSystemExtensionForm(strExtensionId, strPSDynaInstId, v2SystemExtensionForm);
		m.set("applyflag", 0);
	}
	
	
	@Override
	protected List<PSDEForm> filterDomainList(List<PSDEForm> domainList, String strDataSetName, PSDEFormFilter f) throws Exception {
		
		if(!ObjectUtils.isEmpty(domainList)) {
			Object objPSWFDEId = f.getFieldCond(PSDEForm.FIELD_PSWFDEID, IPSModelFilter.EQ);
			if(!ObjectUtils.isEmpty(objPSWFDEId)) {
				
				IExtensionPSModelRTServiceSession iExtensionPSModelRTServiceSession = (IExtensionPSModelRTServiceSession)this.getPSModelRTServiceSession();
				PSWFDE psWFDE = (PSWFDE)iExtensionPSModelRTServiceSession.getCachePSModel(PSModels.PSWFDE, objPSWFDEId.toString());
				
				List<PSDEForm> domainList2 = new ArrayList<PSDEForm>();
				//指定了流程实体标识
				String strPSDEId = String.format("WFDE__%1$s@%2$s", objPSWFDEId, psWFDE.getPSDEId());
				for(PSDEForm psDEForm : domainList) {
					//先判断实体
					if((DataTypeUtils.compare(DataTypes.VARCHAR, psWFDE.getPSDEId(), psDEForm.getPSDEId())==0) 
							|| (DataTypeUtils.compare(DataTypes.VARCHAR, strPSDEId, psDEForm.getPSDEId())==0)){
						if(!FormType.EDITFORM.value.equals(psDEForm.getFormType())) {
							continue;
						}
						if(!StringUtils.hasLength(psDEForm.getPSWFDEId())
								&& !StringUtils.hasLength(ExtensionUtils.getApplyPSDynaInstId(psDEForm, true))) {
							psDEForm.setPSWFDEId((String)objPSWFDEId);
							psDEForm.setPSDEId(strPSDEId);
							psDEForm.setPSDEFormId(String.format("WFDE__%1$s@%2$s", objPSWFDEId, psDEForm.getPSDEFormId()));
//							//判断数据是否存在
//							if(StringUtils.hasLength(iExtensionPSModelRTServiceSession.getExtensionId())) {
//								//建立空数据
//								PSDEForm psDEForm2 = new PSDEForm();
//								psDEForm2.setPSWFDEId((String)objPSWFDEId);
//								psDEForm2.setPSDEId(psDEForm.getPSDEId());
//								psDEForm2.setPSDEName(psDEForm.getPSDEName());
//								psDEForm2.setCodeName(psDEForm.getCodeName());
//								psDEForm2.setPSDEFormName(psDEForm.getPSDEFormName());
//								psDEForm2.setFormType(psDEForm.getFormType());
//								psDEForm2.set("srfemptyflag", 1);
//
//								this.doCreate(psDEForm2);
//								continue;
//							}
//							else {
//								
//							}
						}
						
						domainList2.add(psDEForm);
					}
				}
				
				domainList.clear();
				domainList.addAll(domainList2);
			}
		}
		return super.filterDomainList(domainList, strDataSetName, f);
	}
	
	
	
	@Override
	protected void onBeforeRemove(PSDEForm m) throws Exception {
		// TODO Auto-generated method stub
		super.onBeforeRemove(m);
	}
	
	@Override
	protected void doRemove(PSDEForm m) throws Exception {
		IExtensionPSModelRTServiceSession iExtensionPSModelRTServiceSession = (IExtensionPSModelRTServiceSession)this.getPSModelRTServiceSession();
		String strExtensionId = iExtensionPSModelRTServiceSession.getExtensionIdMust();
		
		
		String strPSDynaInstId = (String)m.get(ExtensionUtils.FIELD_PSDYNAINSTID);
		if(!StringUtils.hasLength(strPSDynaInstId)
				|| ExtensionUtils.DYNAINSTID_PARENT.equals(strPSDynaInstId)) {
			throw new Exception(String.format("无法删除默认数据"));
		}
		iExtensionPSModelRTServiceSession.getCloudExtensionClient().removeSystemExtensionForm(strExtensionId, strPSDynaInstId);
		//通知
		ExtensionUtils.notifySystemExtensionChanged(strExtensionId, null);
	}
	
	
	public Object apply(PSDEForm m) throws Exception {
		return this.doApply(m, true);
	}

	public Object applyOnly(PSDEForm m) throws Exception {
		return this.doApply(m, false);
	}
	
	protected Object doApply(PSDEForm m, boolean bNotify) throws Exception {

		IExtensionPSModelRTServiceSession iExtensionPSModelRTServiceSession = (IExtensionPSModelRTServiceSession) this.getPSModelRTServiceSession();
		String strExtensionId = iExtensionPSModelRTServiceSession.getExtensionIdMust();
		PSDEForm psDEForm = this.get(m.getId(), false);
		String strPSDynaInstId = ExtensionUtils.getApplyPSDynaInstId(psDEForm, false);

		// 获取默认配置
		PSDEForm orginPSDEForm = super.doGet(m.getId(), true);
		if (orginPSDEForm != null) {
			// 放入默认配置
			psDEForm.setFormType(orginPSDEForm.getFormType());
			psDEForm.setMobFlag(orginPSDEForm.getMobFlag());

//			psDEForm.setPSSysSFPluginId(orginPSDEForm.getPSSysSFPluginId());
//			psDEForm.setPSSysSFPluginName(orginPSDEForm.getPSSysSFPluginName());
		}
		
		String strDataEntityTag = psDEForm.getPSDEId();
		if(strDataEntityTag.indexOf("@") != -1) {
			strDataEntityTag = strDataEntityTag.split("[@]")[1];
		}
		
		//计算实体归属的前端应用
		boolean bMobFlag = DataTypeUtils.getBooleanValue(psDEForm.getMobFlag(), false);
		
		IPSApplication iPSApplication = ExtensionUtils.getPSApplicationByDataEntityTag(iExtensionPSModelRTServiceSession, iExtensionPSModelRTServiceSession.getPSSystemService().getPSSystem()
				, strDataEntityTag, bMobFlag, false);
		
		ObjectNode objectNode = null;
		IPSApplication lastPSApplication = iExtensionPSModelRTServiceSession.getPSApplication();
		try {
			iExtensionPSModelRTServiceSession.setPSApplication(iPSApplication);
			objectNode = iExtensionPSModelRTServiceSession.getPSModelTranspiler(IPSDEEditForm.class, false).compile(iExtensionPSModelRTServiceSession, psDEForm, null);
		}
		catch (Exception ex) {
			throw ex;
		}
		finally {
			iExtensionPSModelRTServiceSession.setPSApplication(lastPSApplication);
		}
		
		//后续将模型中应用替换为为相关
		String strRuntimeModel = ExtensionUtils.replaceRuntimeModel(JsonUtils.toString(objectNode), iPSApplication, true);
		
//		IPSModelRTService iPSDataEntityService = (IPSModelRTService) this.getPSModelRTServiceSession().getPSModelService(PSModels.PSDATAENTITY);
//		IPSDataEntity iPSDataEntity = (IPSDataEntity) iPSDataEntityService.getPSModelObject(psDEForm.getPSDEId(), IPSDataEntity.class, false);
//		IPSDEForm iPSDEForm = iExtensionPSModelRTServiceSession.getPSSystemService().createAndInitPSModelObject((IPSModelObjectRuntime) iPSDataEntity, IPSDEForm.class, objectNode);
//		// 验证模型
//		PSModelMergeUtils.verify(iPSDEForm);

		// 获取当前模型
		// V2SystemExtensionField lastV2SystemExtensionField =
		// iExtensionPSModelRTServiceSession.getCloudExtensionClient().getSystemExtensionField(iExtensionPSModelRTServiceSession.getExtensionId(),
		// strPSDynaInstId);

		V2SystemExtensionForm v2SystemExtensionForm = new V2SystemExtensionForm();
		v2SystemExtensionForm.setExtensionModel(ExtensionUtils.toExtensionModel(psDEForm));
		v2SystemExtensionForm.setRuntimeModel(strRuntimeModel);
		v2SystemExtensionForm.setPendingExtensionModel(null);
		v2SystemExtensionForm.setApplyFlag(1);
		v2SystemExtensionForm.setName(psDEForm.getName());

	
		iExtensionPSModelRTServiceSession.getCloudExtensionClient().updateSystemExtensionForm(iExtensionPSModelRTServiceSession.getExtensionId(), strPSDynaInstId, v2SystemExtensionForm);

		if(bNotify) {
			ExtensionUtils.notifySystemExtensionChanged(strExtensionId, null);
		}
		
		return null;
	}
}
