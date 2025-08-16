package net.ibizsys.central.database;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.util.StringUtils;

import net.ibizsys.central.dataentity.IDataEntityRuntime;
import net.ibizsys.model.IPSModelObject;
import net.ibizsys.model.database.IPSSysDBColumn;
import net.ibizsys.model.database.IPSSysDBTable;
import net.ibizsys.runtime.ModelRuntimeBase;
import net.ibizsys.runtime.dataentity.DESaaSModes;

public class SysDBTableRuntime extends ModelRuntimeBase implements ISysDBTableRuntime{
	private static final org.apache.commons.logging.Log log = org.apache.commons.logging.LogFactory.getLog(SysDBTableRuntime.class);
	
	private ISysDBSchemeRuntimeContext iSysDBSchemeRuntimeContext = null;
	private IPSSysDBTable iPSSysDBTable = null;
	private List<ISysDBColumnRuntime> sysDBColumnRuntimeList = new ArrayList<ISysDBColumnRuntime>();
	private Map<String, ISysDBColumnRuntime> sysDBColumnRuntimeMap = new HashMap<String, ISysDBColumnRuntime>();
	private IDataEntityRuntime iDataEntityRuntime = null;
	private boolean bTenantMode = false;
	private String strTenantColumnName = null;
	private String strStandardName = null;
	
	
	@Override
	public void init(ISysDBSchemeRuntimeContext iSysDBSchemeRuntimeContext, IPSSysDBTable iPSSysDBTable) throws Exception {
		this.iSysDBSchemeRuntimeContext = iSysDBSchemeRuntimeContext;
		this.iPSSysDBTable = iPSSysDBTable;
		this.onInit();
	}
	
	@Override
	protected void onInit() throws Exception {
		List<IPSSysDBColumn> psSysDBColumnList = this.getPSSysDBTable().getAllPSSysDBColumns();
		if(psSysDBColumnList != null) {
			for(IPSSysDBColumn iPSSysDBColumn : psSysDBColumnList) {
				SysDBColumnRuntime sysDBColumnRuntime = new SysDBColumnRuntime();
				sysDBColumnRuntime.init(iSysDBSchemeRuntimeContext, this, iPSSysDBColumn);
				this.sysDBColumnRuntimeList.add(sysDBColumnRuntime);
				this.sysDBColumnRuntimeMap.put(sysDBColumnRuntime.getName(), sysDBColumnRuntime);
			}
		}
		super.onInit();
	}
	
	protected ISysDBSchemeRuntimeContext getSysDBSchemeRuntimeContext() {
		return this.iSysDBSchemeRuntimeContext;
	}
	
	@Override
	public IPSSysDBTable getPSSysDBTable() {
		return this.iPSSysDBTable;
	}
	
	@Override
	public IPSModelObject getPSModelObject() {
		return this.getPSSysDBTable();
	}

	@Override
	public String getId() {
		return this.getPSSysDBTable().getId();
	}

	@Override
	public String getName() {
		return this.getPSSysDBTable().getName();
	}

	@Override
	public List<ISysDBColumnRuntime> getSysDBColumnRuntimes() {
		if(this.sysDBColumnRuntimeList == null || this.sysDBColumnRuntimeList.size() == 0) {
			return null;
		}
		return this.sysDBColumnRuntimeList;
	}

	@Override
	public Map<String, ISysDBColumnRuntime> getColumns() {
		return this.sysDBColumnRuntimeMap;
	}

	@Override
	public String getStandardName() {
		if(!StringUtils.hasLength(this.strStandardName)) {
			try {
				this.strStandardName = this.getSysDBSchemeRuntimeContext().getSysDBSchemeRuntime().getDBDialect().getDBObjStandardName(this.getName());
			} catch (Throwable ex) {
				log.error(ex);
				this.strStandardName = this.getName();
			}
		}
		return this.strStandardName;
	}

	@Override
	public boolean isTenantMode() {
		return this.bTenantMode;
	}

	@Override
	public String getTenantColumnName() {
		return this.strTenantColumnName;
	}

	@Override
	public IDataEntityRuntime getDataEntityRuntime() {
		return this.iDataEntityRuntime;
	}

	@Override
	public void setDataEntityRuntime(IDataEntityRuntime iDataEntityRuntime) {
		
		this.iDataEntityRuntime = iDataEntityRuntime;
		if(this.iDataEntityRuntime == null) {
			this.bTenantMode = false;
			this.strTenantColumnName = null;
		}
		else {
			try {
				boolean bLastTenantMode = this.bTenantMode;
				this.bTenantMode = this.getDataEntityRuntime().getPSDataEntity().getSaaSMode()!=DESaaSModes.NONE;
//				if(bLastTenantMode) {
//					if(!this.bTenantMode) {
//						this.getSysDBSchemeRuntimeContext().getSysDBSchemeRuntime().getSystemRuntime().log(LogLevels.WARN, this.getClass().getName(), String.format("数据表[%1$s]
//						log.warn(String.format("数据表[", args));
//					}
//				}
				this.strTenantColumnName = this.getDataEntityRuntime().getPSDataEntity().getSaaSDCIdColumnName();
			}
			catch(Exception ex) {
				log.error(String.format("获取实体SaaS信息发生异常，%1$s", ex.getMessage()), ex);
			}
		}
	}

	@Override
	public ISysDBSchemeRuntime getSysDBSchemeRuntime() {
		return this.getSysDBSchemeRuntimeContext().getSysDBSchemeRuntime();
	}

	@Override
	public ISysDBSchemeRuntime getSchema() {
		return this.getSysDBSchemeRuntime();
	}

	@Override
	public void setTenantMode(boolean bTenantMode) {
		this.bTenantMode = bTenantMode;
	}

	@Override
	public void setTenantColumnName(String strTenantColumnName) {
		this.strTenantColumnName = strTenantColumnName;
	}

	
}
