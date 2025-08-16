package net.ibizsys.central.plugin.extension.psmodel.service;

import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.data.domain.Page;
import org.springframework.util.ObjectUtils;
import org.springframework.util.StringUtils;

import com.fasterxml.jackson.databind.node.ObjectNode;

import net.ibizsys.central.cloud.core.security.EmployeeContext;
import net.ibizsys.central.cloud.core.security.IEmployeeContext;
import net.ibizsys.central.cloud.core.util.domain.V2SystemExtensionNotify;
import net.ibizsys.central.cloud.core.util.domain.V2SystemExtensionScopeType;
import net.ibizsys.central.plugin.extension.psmodel.util.ExtensionUtils;
import net.ibizsys.central.plugin.extension.psmodel.util.IExtensionPSModelRTServiceSession;
import net.ibizsys.central.util.SearchContextDTO;
import net.ibizsys.model.IPSModelObjectRuntime;
import net.ibizsys.model.dataentity.IPSDataEntity;
import net.ibizsys.model.dataentity.notify.IPSDENotify;
import net.ibizsys.model.util.PSModelMergeUtils;
import net.ibizsys.psmodel.core.domain.PSDENotify;
import net.ibizsys.psmodel.core.domain.PSDataEntity;
import net.ibizsys.psmodel.core.filter.PSDENotifyFilter;
import net.ibizsys.psmodel.core.util.IPSModelFilter;
import net.ibizsys.psmodel.core.util.PSModels;
import net.ibizsys.psmodel.runtime.util.IPSModelRTService;
import net.ibizsys.runtime.util.JsonUtils;

public class PSDENotifyRTService extends net.ibizsys.psmodel.runtime.service.PSDENotifyRTService {

	private static final Log log = LogFactory.getLog(PSDENotifyRTService.class);

	/**
	 * 行为：应用指定扩展通知逻辑
	 */
	final public static String METHOD_APPLY = "APPLY";
	
	/**
	 * 行为：启用指定扩展通知逻辑
	 */
	final public static String METHOD_ENABLE = "ENABLE";

	/**
	 * 行为：禁用指定扩展通知逻辑
	 */
	final public static String METHOD_DISABLE = "DISABLE";

	@Override
	protected Object doInvoke(String methodName, String key, Object params) throws Exception {

		if (METHOD_APPLY.equalsIgnoreCase(methodName)) {
			PSDENotify domain = this.getDomain(params);
			if (StringUtils.hasLength(key)) {
				domain.setId(key);
			}
			return this.apply(domain);
		}
		
		if (METHOD_ENABLE.equalsIgnoreCase(methodName)) {
			PSDENotify domain = this.getDomain(params);
			if (StringUtils.hasLength(key)) {
				domain.setId(key);
			}
			return this.enable(domain);
		}

		if (METHOD_DISABLE.equalsIgnoreCase(methodName)) {
			PSDENotify domain = this.getDomain(params);
			if (StringUtils.hasLength(key)) {
				domain.setId(key);
			}
			return this.disable(domain);
		}

		return super.doInvoke(methodName, key, params);
	}

	@Override
	protected PSDENotify doGet(String key, boolean tryMode) throws Exception {
		IExtensionPSModelRTServiceSession iExtensionPSModelRTServiceSession = (IExtensionPSModelRTServiceSession) this.getPSModelRTServiceSession();
		if (StringUtils.hasLength(iExtensionPSModelRTServiceSession.getExtensionId())) {
			String strPSDEId = getParentId(key);

			SearchContextDTO searchContextDTO = new SearchContextDTO();
			searchContextDTO.all();

			if (strPSDEId.indexOf("@") == -1) {
				searchContextDTO.eq(V2SystemExtensionNotify.FIELD_SCOPE_TYPE, V2SystemExtensionScopeType.DATAENTITY.value);
				searchContextDTO.eq(V2SystemExtensionNotify.FIELD_DATA_ENTITY_TAG, strPSDEId);
			} else {
				searchContextDTO.eq(V2SystemExtensionNotify.FIELD_SCOPE_TYPE, V2SystemExtensionScopeType.DATA.value);
				searchContextDTO.eq(V2SystemExtensionNotify.FIELD_DATA_ENTITY_TAG, strPSDEId.split("[@]")[1]);
			}
			searchContextDTO.eq(V2SystemExtensionNotify.FIELD_SCOPE_TAG, strPSDEId);
			searchContextDTO.eq(V2SystemExtensionNotify.FIELD_NOTIFY_TAG, key);

			Page<V2SystemExtensionNotify> page = iExtensionPSModelRTServiceSession.getCloudExtensionClient().fetchSystemExtensionNotifies(iExtensionPSModelRTServiceSession.getExtensionId(), searchContextDTO);
			if (!ObjectUtils.isEmpty(page) && !ObjectUtils.isEmpty(page.getContent())) {
				List<PSDENotify> psDENotifyList = ExtensionUtils.toPSModelList(page.getContent(), V2SystemExtensionNotify.FIELD_NOTIFY_TAG, PSDENotify.class);
				if (!ObjectUtils.isEmpty(psDENotifyList)) {
					return psDENotifyList.get(0);
				}
			}

			// 没有找到，尝试
			if (key.indexOf("@") != -1) {
				// 取默认
				PSDENotify psDENotify = this.doGet(key.split("[@]")[1], tryMode);
				if (psDENotify != null) {
					// 重置动态实例
					psDENotify.set(ExtensionUtils.FIELD_PSDYNAINSTID, ExtensionUtils.DYNAINSTID_PARENT);
					psDENotify.setPSDENotifyId(key);
					psDENotify.setPSDEId(getParentId(key));
					return psDENotify;
				}
			}
		}
		return super.doGet(key, tryMode);
	}

	@Override
	protected void onBeforeCreate(PSDENotify m) throws Exception {
		m.reset("psdynainstid");
		super.onBeforeCreate(m);
	}

	@Override
	protected void doCreate(PSDENotify m) throws Exception {

		IExtensionPSModelRTServiceSession iExtensionPSModelRTServiceSession = (IExtensionPSModelRTServiceSession) this.getPSModelRTServiceSession();
		if (!StringUtils.hasLength(iExtensionPSModelRTServiceSession.getExtensionId())) {
			throw new Exception("未支持扩展");
		}

		PSDataEntity psDataEntity = (PSDataEntity) this.getPSModelRTServiceSession().getCachePSModel(PSModels.PSDATAENTITY, m.getPSDEId());

		V2SystemExtensionNotify v2SystemExtensionNotify = new V2SystemExtensionNotify();
		if (m.getPSDEId().indexOf("@") == -1) {
			v2SystemExtensionNotify.setScopeType(V2SystemExtensionScopeType.DATAENTITY.value);
		} else {
			v2SystemExtensionNotify.setScopeType(V2SystemExtensionScopeType.DATA.value);
		}
		v2SystemExtensionNotify.setScopeTag(m.getPSDEId());
		v2SystemExtensionNotify.setNotifyTag(m.getId());
		v2SystemExtensionNotify.setDataEntityTag(psDataEntity.getPSDataEntityId());
		v2SystemExtensionNotify.setPendingExtensionModel(ExtensionUtils.toExtensionModel(m));
		v2SystemExtensionNotify.setApplyFlag(0);
		v2SystemExtensionNotify.setName(m.getName());

		iExtensionPSModelRTServiceSession.getCloudExtensionClient().createSystemExtensionNotify(iExtensionPSModelRTServiceSession.getExtensionId(), v2SystemExtensionNotify);
		m.set("applyflag", 0);
	}

	@Override
	protected List<PSDENotify> getDomainList(String strDataSetName, PSDENotifyFilter f) throws Exception {
		List<PSDENotify> list = super.getDomainList(strDataSetName, f);
		IExtensionPSModelRTServiceSession iExtensionPSModelRTServiceSession = (IExtensionPSModelRTServiceSession) this.getPSModelRTServiceSession();
		if (!StringUtils.hasLength(iExtensionPSModelRTServiceSession.getExtensionId())) {
			return list;
		}

		Object objPSDEId = f.getFieldCond(PSDENotify.FIELD_PSDEID, IPSModelFilter.EQ);
		if (ObjectUtils.isEmpty(objPSDEId)) {
			return list;
		}

		String strPSDEId = objPSDEId.toString();

		if (true) {
			SearchContextDTO searchContextDTO = new SearchContextDTO();
			searchContextDTO.all();

			searchContextDTO.eq(V2SystemExtensionNotify.FIELD_SCOPE_TYPE, V2SystemExtensionScopeType.DATAENTITY.value);
			if (strPSDEId.indexOf("@") == -1) {
				searchContextDTO.eq(V2SystemExtensionNotify.FIELD_DATA_ENTITY_TAG, strPSDEId);
				searchContextDTO.eq(V2SystemExtensionNotify.FIELD_SCOPE_TAG, strPSDEId);
			} else {
				searchContextDTO.eq(V2SystemExtensionNotify.FIELD_DATA_ENTITY_TAG, strPSDEId.split("[@]")[1]);
				searchContextDTO.eq(V2SystemExtensionNotify.FIELD_SCOPE_TAG, strPSDEId.split("[@]")[1]);
			}
			Page<V2SystemExtensionNotify> page = iExtensionPSModelRTServiceSession.getCloudExtensionClient().fetchSystemExtensionNotifies(iExtensionPSModelRTServiceSession.getExtensionId(), searchContextDTO);
			if (!ObjectUtils.isEmpty(page) && !ObjectUtils.isEmpty(page.getContent())) {
				List<PSDENotify> psDENotifyList = ExtensionUtils.toPSModelList(page.getContent(), V2SystemExtensionNotify.FIELD_NOTIFY_TAG, PSDENotify.class);
				list = ExtensionUtils.replacePSModelList(list, psDENotifyList, PSDENotify.class);
			}
		}

		if (strPSDEId.indexOf("@") != -1) {
			SearchContextDTO searchContextDTO = new SearchContextDTO();
			searchContextDTO.all();

			searchContextDTO.eq(V2SystemExtensionNotify.FIELD_SCOPE_TYPE, V2SystemExtensionScopeType.DATA.value);
			searchContextDTO.eq(V2SystemExtensionNotify.FIELD_DATA_ENTITY_TAG, strPSDEId.split("[@]")[1]);
			searchContextDTO.eq(V2SystemExtensionNotify.FIELD_SCOPE_TAG, strPSDEId);

			Page<V2SystemExtensionNotify> page = iExtensionPSModelRTServiceSession.getCloudExtensionClient().fetchSystemExtensionNotifies(iExtensionPSModelRTServiceSession.getExtensionId(), searchContextDTO);
			if (!ObjectUtils.isEmpty(page) && !ObjectUtils.isEmpty(page.getContent())) {
				List<PSDENotify> psDENotifyList = ExtensionUtils.toPSModelList(page.getContent(), V2SystemExtensionNotify.FIELD_NOTIFY_TAG, PSDENotify.class);
				list = ExtensionUtils.replacePSModelList(list, psDENotifyList, PSDENotify.class);
			}
		}

		return this.filterDomainList(list, strDataSetName, f);
	}

	@Override
	protected PSDENotify getLast(PSDENotify m) throws Exception {
		return this.get(m.getId(), false);
	}

	@Override
	protected void doMergeLast(PSDENotify m, PSDENotify last) throws Exception {
		m.resetPSDEId();
		m.resetPSDEName();
		m.resetCodeName();
		m.reset("psdynainstid");
		m.reset("notifysubtype");
		super.doMergeLast(m, last);
	}

	@Override
	protected void doUpdate(PSDENotify m) throws Exception {

		IExtensionPSModelRTServiceSession iExtensionPSModelRTServiceSession = (IExtensionPSModelRTServiceSession) this.getPSModelRTServiceSession();
		String strExtensionId = iExtensionPSModelRTServiceSession.getExtensionIdMust();

		String strPSDynaInstId = (String) m.get(ExtensionUtils.FIELD_PSDYNAINSTID);
		if (!StringUtils.hasLength(strPSDynaInstId) || ExtensionUtils.DYNAINSTID_PARENT.equals(strPSDynaInstId)) {
			this.doCreate(m);
			return;
		}

		V2SystemExtensionNotify v2SystemExtensionNotify = new V2SystemExtensionNotify();
		v2SystemExtensionNotify.setPendingExtensionModel(ExtensionUtils.toExtensionModel(m));
		v2SystemExtensionNotify.setApplyFlag(0);
		v2SystemExtensionNotify.setName(m.getName());

		iExtensionPSModelRTServiceSession.getCloudExtensionClient().updateSystemExtensionNotify(strExtensionId, strPSDynaInstId, v2SystemExtensionNotify);
		m.set("applyflag", 0);
	}

	@Override
	protected List<PSDENotify> filterDomainList(List<PSDENotify> domainList, String strDataSetName, PSDENotifyFilter f) throws Exception {

		
		return super.filterDomainList(domainList, strDataSetName, f);
	}

	@Override
	protected void onBeforeRemove(PSDENotify m) throws Exception {
		// TODO Auto-generated method stub
		super.onBeforeRemove(m);
	}

	@Override
	protected void doRemove(PSDENotify m) throws Exception {
		IExtensionPSModelRTServiceSession iExtensionPSModelRTServiceSession = (IExtensionPSModelRTServiceSession) this.getPSModelRTServiceSession();
		String strExtensionId = iExtensionPSModelRTServiceSession.getExtensionIdMust();

		String strPSDynaInstId = (String) m.get(ExtensionUtils.FIELD_PSDYNAINSTID);
		if (!StringUtils.hasLength(strPSDynaInstId) || ExtensionUtils.DYNAINSTID_PARENT.equals(strPSDynaInstId)) {
			throw new Exception(String.format("无法删除默认数据"));
		}
		iExtensionPSModelRTServiceSession.getCloudExtensionClient().removeSystemExtensionNotify(strExtensionId, strPSDynaInstId);
		// 通知
		ExtensionUtils.notifySystemExtensionChanged(strExtensionId, null);
	}

	public Object apply(PSDENotify m) throws Exception {
		return this.doApply(m, null);
	}

	protected Object doApply(PSDENotify m, Boolean enable) throws Exception {

		IExtensionPSModelRTServiceSession iExtensionPSModelRTServiceSession = (IExtensionPSModelRTServiceSession) this.getPSModelRTServiceSession();
		String strExtensionId = iExtensionPSModelRTServiceSession.getExtensionIdMust();
		PSDENotify psDENotify = this.get(m.getId(), false);
		String strPSDynaInstId = ExtensionUtils.getApplyPSDynaInstId(psDENotify, false);

		// 获取默认配置
		PSDENotify orginPSDENotify = super.doGet(m.getId(), true);
		if (orginPSDENotify != null) {
			// 放入默认配置
			psDENotify.setPSSysSFPluginId(orginPSDENotify.getPSSysSFPluginId());
			psDENotify.setPSSysSFPluginName(orginPSDENotify.getPSSysSFPluginName());
			
			psDENotify.setPSSysMsgQueueId(orginPSDENotify.getPSSysMsgQueueId());
			psDENotify.setPSSysMsgQueueName(orginPSDENotify.getPSSysMsgQueueName());
			
			if(!StringUtils.hasLength(psDENotify.getPSSysMsgTemplId())) {
				psDENotify.setPSSysMsgTemplId(orginPSDENotify.getPSSysMsgTemplId());
				psDENotify.setPSSysMsgTemplName(orginPSDENotify.getPSSysMsgTemplName());
			}
		}
		
		//设置有效标记
		if(enable!=null) {
			psDENotify.set("validflag", enable?1:0);
		}
		
		IPSModelRTService iPSDataEntityService = (IPSModelRTService) this.getPSModelRTServiceSession().getPSModelService(PSModels.PSDATAENTITY);
		IPSDataEntity iPSDataEntity = (IPSDataEntity) iPSDataEntityService.getPSModelObject(psDENotify.getPSDEId(), IPSDataEntity.class, false);
		
		
		ObjectNode objectNode = iExtensionPSModelRTServiceSession.getPSModelTranspiler(IPSDENotify.class, false).compile(iExtensionPSModelRTServiceSession, psDENotify, null);

		
		IPSDENotify iPSDENotify = iExtensionPSModelRTServiceSession.getPSSystemService().createAndInitPSModelObject((IPSModelObjectRuntime) iPSDataEntity, IPSDENotify.class, objectNode);
		// 验证模型
		PSModelMergeUtils.verify(iPSDENotify, true);

		// 获取当前模型
		// V2SystemExtensionField lastV2SystemExtensionField =
		// iExtensionPSModelRTServiceSession.getCloudExtensionClient().getSystemExtensionField(iExtensionPSModelRTServiceSession.getExtensionId(),
		// strPSDynaInstId);

		V2SystemExtensionNotify v2SystemExtensionNotify = new V2SystemExtensionNotify();
		v2SystemExtensionNotify.setExtensionModel(ExtensionUtils.toExtensionModel(psDENotify));
		v2SystemExtensionNotify.setRuntimeModel(JsonUtils.toString(objectNode));
		v2SystemExtensionNotify.setPendingExtensionModel(null);
		v2SystemExtensionNotify.setApplyFlag(1);
		v2SystemExtensionNotify.setName(psDENotify.getName());

		if(enable!=null) {
			v2SystemExtensionNotify.setValidFlag(enable?1:0);
		}
		
		IEmployeeContext iEmployeeContext = EmployeeContext.getCurrent();
		if (iEmployeeContext != null) {
			v2SystemExtensionNotify.setExtensionTag(iEmployeeContext.getDcsystemid());
			v2SystemExtensionNotify.setExtensionTag2(iEmployeeContext.getTenant());
		}

		v2SystemExtensionNotify.setExtensionTag4(iPSDENotify.getNotifySubType());
		iExtensionPSModelRTServiceSession.getCloudExtensionClient().updateSystemExtensionNotify(iExtensionPSModelRTServiceSession.getExtensionId(), strPSDynaInstId, v2SystemExtensionNotify);

		ExtensionUtils.notifySystemExtensionChanged(strExtensionId, null);
		return null;
	}
	
	public Object enable(PSDENotify m) throws Exception {
		return this.doEnable(m);
	}

	protected Object doEnable(PSDENotify m) throws Exception {
		return this.doApply(m, true);
	}

	public Object disable(PSDENotify m) throws Exception {
		return this.doDisable(m);
	}

	protected Object doDisable(PSDENotify m) throws Exception {
		return this.doApply(m, false);
	}
	
}
