package net.ibizsys.central.database;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.util.StringUtils;

import net.ibizsys.model.IPSModelObject;
import net.ibizsys.model.database.IPSSysDBColumn;
import net.ibizsys.runtime.ModelRuntimeBase;

public class SysDBColumnRuntime extends ModelRuntimeBase implements ISysDBColumnRuntime{

	private static final Log log = LogFactory.getLog(SysDBColumnRuntime.class);
	
	private ISysDBSchemeRuntimeContext iSysDBSchemeRuntimeContext = null;
	private IPSSysDBColumn iPSSysDBColumn = null;
	private String strDataItemName = null;
	private String strStandardName = null;
	
	
	
	@Override
	public void init(ISysDBSchemeRuntimeContext iSysDBSchemeRuntimeContext,ISysDBTableRuntime iSysDBTableRuntime, IPSSysDBColumn iPSSysDBColumn) throws Exception {
		this.iSysDBSchemeRuntimeContext = iSysDBSchemeRuntimeContext;
		this.iPSSysDBColumn = iPSSysDBColumn;
		this.onInit();
	}
	
	@Override
	protected void onInit() throws Exception {
		this.strDataItemName = this.getName().toLowerCase();
		
		super.onInit();
	}
	
	protected ISysDBSchemeRuntimeContext getSysDBSchemeRuntimeContext() {
		return this.iSysDBSchemeRuntimeContext;
	}
	
	@Override
	public IPSSysDBColumn getPSSysDBColumn() {
		return this.iPSSysDBColumn;
	}
	
	@Override
	public IPSModelObject getPSModelObject() {
		return this.getPSSysDBColumn();
	}

	@Override
	public String getId() {
		return this.getPSSysDBColumn().getId();
	}

	@Override
	public String getName() {
		return this.getPSSysDBColumn().getName();
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
	public int getLength() {
		return this.getPSSysDBColumn().getLength();
	}

	@Override
	public String getLogicName() {
		return this.getPSSysDBColumn().getLogicName();
	}

	@Override
	public int getPrecision() {
		return this.getPSSysDBColumn().getPrecision();
	}

	@Override
	public int getStdDataType() {
		return this.getPSSysDBColumn().getStdDataType();
	}

	@Override
	public boolean isAutoIncrement() {
		return this.getPSSysDBColumn().isAutoIncrement();
	}

	@Override
	public boolean isFKey() {
		return this.getPSSysDBColumn().isFKey();
	}

	@Override
	public boolean isNullable() {
		return this.getPSSysDBColumn().isNullable();
	}

	@Override
	public boolean isPKey() {
		return this.getPSSysDBColumn().isPKey();
	}

	@Override
	public boolean isUnsigned() {
		return this.getPSSysDBColumn().isUnsigned();
	}

	@Override
	public String getDataItemName() {
		return this.strDataItemName;
	}

}
