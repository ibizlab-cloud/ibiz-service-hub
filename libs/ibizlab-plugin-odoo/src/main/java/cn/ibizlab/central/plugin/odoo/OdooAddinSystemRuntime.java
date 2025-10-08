package cn.ibizlab.central.plugin.odoo;

import cn.ibizlab.central.plugin.odoo.security.OdooSystemAccessManager;
import net.ibizsys.central.security.ISystemAccessManager;
import org.apache.commons.logging.LogFactory;

import com.fasterxml.jackson.databind.node.ObjectNode;

import cn.ibizlab.central.plugin.odoo.bi.OdooSysBISchemeRuntime;
import cn.ibizlab.central.plugin.odoo.dataentity.OdooAbstractDERuntime;
import cn.ibizlab.central.plugin.odoo.dataentity.OdooDataEntityRuntime;
import net.ibizsys.central.bi.ISysBISchemeRuntime;
import net.ibizsys.central.dataentity.IDataEntityRuntime;
import net.ibizsys.model.IPSModelObjectRuntime;
import net.ibizsys.model.PSModelEnums.BIEngineType;
import net.ibizsys.model.PSModelEnums.DEType;
import net.ibizsys.model.bi.IPSSysBIScheme;
import net.ibizsys.model.bi.PSSysBISchemeImpl;
import net.ibizsys.model.dataentity.IPSDataEntity;
import net.ibizsys.runtime.util.JsonUtils;

/**
 * 插件系统运行时
 * 
 * @author lionlau
 *
 */
public class OdooAddinSystemRuntime extends net.ibizsys.central.plugin.extension.AddinSystemRuntime implements IOdooAddinSystemRuntime {

	private static final org.apache.commons.logging.Log log = LogFactory.getLog(OdooAddinSystemRuntime.class);

	private ISysBISchemeRuntime defaultSysBISchemeRuntime = null;

	@Override
	protected void onInit() throws Exception {
		super.onInit();

		ISysBISchemeRuntime defaultSysBISchemeRuntime = this.getSysBISchemeRuntime("default", true);
		if (defaultSysBISchemeRuntime == null) {
			ObjectNode psSysBISchemeNode = JsonUtils.createObjectNode();
			psSysBISchemeNode.put(PSSysBISchemeImpl.ATTR_GETID, "default");
			psSysBISchemeNode.put(PSSysBISchemeImpl.ATTR_GETNAME, "默认BI体系");
			psSysBISchemeNode.put(PSSysBISchemeImpl.ATTR_GETCODENAME, "default");
			psSysBISchemeNode.put(PSSysBISchemeImpl.ATTR_GETBIENGINETYPE, BIEngineType.USER.value);
			psSysBISchemeNode.put(PSSysBISchemeImpl.ATTR_GETUNIQUETAG, "default");
			IPSSysBIScheme iPSSysBIScheme = this.getPSSystemService().createAndInitPSModelObject((IPSModelObjectRuntime) this.getPSSystem(), IPSSysBIScheme.class, psSysBISchemeNode);
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
		if (iPSDataEntity.getDEType() == DEType.ABSTRACT.value) {
			return new OdooAbstractDERuntime();
		}
		return new OdooDataEntityRuntime();
	}

	protected ISysBISchemeRuntime createDefaultSysBISchemeRuntime(IPSSysBIScheme iPSSysBIScheme) {
		return new OdooSysBISchemeRuntime();
	}

	@Override
	protected ISystemAccessManager createDefaultSystemAccessManager() {
		return this.createObject(ISystemAccessManager.class, OdooSystemAccessManager.class);
	}

}
