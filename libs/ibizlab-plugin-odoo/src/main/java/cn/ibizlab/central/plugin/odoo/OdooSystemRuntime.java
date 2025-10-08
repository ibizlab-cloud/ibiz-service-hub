package cn.ibizlab.central.plugin.odoo;

import java.util.HashMap;
import java.util.Map;

import org.apache.commons.logging.LogFactory;

import com.fasterxml.jackson.databind.node.ObjectNode;

import cn.ibizlab.central.plugin.odoo.bi.OdooSysBISchemeRuntime;
import cn.ibizlab.central.plugin.odoo.dataentity.FavFavoriteMixinDERuntime;
import cn.ibizlab.central.plugin.odoo.dataentity.MailThreadDERuntime;
import cn.ibizlab.central.plugin.odoo.dataentity.OdooAbstractDERuntime;
import cn.ibizlab.central.plugin.odoo.dataentity.OdooDataEntityRuntime;
import cn.ibizlab.central.plugin.odoo.dataentity.ResUsersDERuntime;
import cn.ibizlab.central.plugin.odoo.dataentity.ResGroupsDERuntime;
import cn.ibizlab.central.plugin.odoo.dataentity.ResourceMixinDERuntime;
import cn.ibizlab.central.plugin.odoo.security.OdooSystemAccessManager;
import cn.ibizlab.central.plugin.odoo.service.OdooSubSysServiceAPIRuntime;
import cn.ibizlab.central.plugin.odoo.util.OdooModels;
import net.ibizsys.central.bi.ISysBISchemeRuntime;
import net.ibizsys.central.cloud.core.IServiceSystemRuntime;
import net.ibizsys.central.cloud.core.ServiceSystemRuntime;
import net.ibizsys.central.cloud.core.util.domain.DeploySystem;
import net.ibizsys.central.dataentity.IDataEntityRuntime;
import net.ibizsys.central.security.ISystemAccessManager;
import net.ibizsys.central.service.ISubSysServiceAPIRuntime;
import net.ibizsys.model.PSModelEnums.BIEngineType;
import net.ibizsys.model.PSModelEnums.DEType;
import net.ibizsys.model.IPSModelObjectRuntime;
import net.ibizsys.model.PSModelUtils;
import net.ibizsys.model.bi.IPSSysBIScheme;
import net.ibizsys.model.bi.PSSysBISchemeImpl;
import net.ibizsys.model.dataentity.IPSDataEntity;
import net.ibizsys.model.service.IPSSubSysServiceAPI;
import net.ibizsys.runtime.util.JsonUtils;

public class OdooSystemRuntime extends ServiceSystemRuntime implements IOdooSystemRuntime{

	private static final org.apache.commons.logging.Log log = LogFactory.getLog(OdooSystemRuntime.class);
	private static final Map<String, Class<?>> dataEntityClsMap = new HashMap<>();
	static {
		dataEntityClsMap.put(OdooModels.RES_USERS, ResUsersDERuntime.class);
		dataEntityClsMap.put(OdooModels.MAIL_THREAD, MailThreadDERuntime.class);
		dataEntityClsMap.put(OdooModels.RESOURCE_MIXIN, ResourceMixinDERuntime.class);
		dataEntityClsMap.put(OdooModels.FAV_FAVORITE_MIXIN, FavFavoriteMixinDERuntime.class);
		dataEntityClsMap.put(OdooModels.RES_GROUPS, ResGroupsDERuntime.class);
	}
	
	private ISysBISchemeRuntime defaultSysBISchemeRuntime = null;
	
	@Override
	protected void onInit() throws Exception {
		
		super.onInit();
		
		ISysBISchemeRuntime defaultSysBISchemeRuntime = this.getSysBISchemeRuntime("default", true);
		if(defaultSysBISchemeRuntime == null) {
			ObjectNode psSysBISchemeNode = JsonUtils.createObjectNode();
			psSysBISchemeNode.put(PSSysBISchemeImpl.ATTR_GETID, "default");
			psSysBISchemeNode.put(PSSysBISchemeImpl.ATTR_GETNAME, "默认BI体系");
			psSysBISchemeNode.put(PSSysBISchemeImpl.ATTR_GETCODENAME, "default");
			psSysBISchemeNode.put(PSSysBISchemeImpl.ATTR_GETBIENGINETYPE, BIEngineType.USER.value);
			psSysBISchemeNode.put(PSSysBISchemeImpl.ATTR_GETUNIQUETAG, "default");
			IPSSysBIScheme iPSSysBIScheme = this.getPSSystemService().createAndInitPSModelObject((IPSModelObjectRuntime)this.getPSSystem(), IPSSysBIScheme.class, psSysBISchemeNode);
			defaultSysBISchemeRuntime = this.createDefaultSysBISchemeRuntime(iPSSysBIScheme);
			defaultSysBISchemeRuntime.init(this.getSystemRuntimeContext(), iPSSysBIScheme);
		}
		this.defaultSysBISchemeRuntime = defaultSysBISchemeRuntime;
		
	}
	
	@Override
	public ISysBISchemeRuntime getDefaultSysBISchemeRuntime() {
		return this.defaultSysBISchemeRuntime;
	}
	
	@Override
	protected IDataEntityRuntime createDefaultDataEntityRuntime(IPSDataEntity iPSDataEntity) {
		
		Class<?> cls = dataEntityClsMap.get(PSModelUtils.calcFullUniqueTag(iPSDataEntity));
		if(cls != null) {
			return this.createObject(IDataEntityRuntime.class, cls);
		}
		
		if(iPSDataEntity.getDEType() == DEType.ABSTRACT.value) {
			return new OdooAbstractDERuntime();
		}
		return new OdooDataEntityRuntime();
	}
	
	@Override
	protected ISystemAccessManager createDefaultSystemAccessManager() {
		return this.createObject(ISystemAccessManager.class, OdooSystemAccessManager.class);
	}
	
	
	@Override
	public ISubSysServiceAPIRuntime createSubSysServiceAPIRuntime(IPSSubSysServiceAPI iPSSubSysServiceAPI) {
		
		if(OdooSubSysServiceAPIRuntime.APITAG_ODOOCLIENT.equalsIgnoreCase(iPSSubSysServiceAPI.getAPITag())
				|| OdooSubSysServiceAPIRuntime.APITAG_ODOOCLIENT.equalsIgnoreCase(iPSSubSysServiceAPI.getCodeName())) {
			ISubSysServiceAPIRuntime iSubSysServiceAPIRuntime = this.getRuntimeObject(iPSSubSysServiceAPI.getPSSysSFPlugin(), ISubSysServiceAPIRuntime.class, true);
			if (iSubSysServiceAPIRuntime != null) {
				return iSubSysServiceAPIRuntime;
			}
			return new OdooSubSysServiceAPIRuntime();
		}
		
		
		return super.createSubSysServiceAPIRuntime(iPSSubSysServiceAPI);
	}
	
	@Override
	public IServiceSystemRuntime createAddinSystemRuntime(DeploySystem deploySystem) {
		return new OdooAddinSystemRuntime();
	}
	

	protected ISysBISchemeRuntime createDefaultSysBISchemeRuntime(IPSSysBIScheme iPSSysBIScheme) {
		return new OdooSysBISchemeRuntime();
	}
	
	
	
}
