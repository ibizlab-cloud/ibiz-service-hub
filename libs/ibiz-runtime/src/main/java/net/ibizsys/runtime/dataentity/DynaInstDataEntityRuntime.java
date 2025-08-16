package net.ibizsys.runtime.dataentity;

import net.ibizsys.model.dataentity.IPSDataEntity;
import net.ibizsys.model.dataentity.dataexport.IPSDEDataExport;
import net.ibizsys.model.dataentity.dataimport.IPSDEDataImport;
import net.ibizsys.model.dataentity.logic.IPSDELogic;
import net.ibizsys.model.dataentity.logic.IPSDEMSLogic;
import net.ibizsys.runtime.IDynaInstRuntime;
import net.ibizsys.runtime.ISystemRuntime;
import net.ibizsys.runtime.dataentity.action.IDEScriptLogicRuntime;
import net.ibizsys.runtime.dataentity.dataexport.IDEDataExportRuntime;
import net.ibizsys.runtime.dataentity.dataimport.IDEDataImportRuntime;
import net.ibizsys.runtime.dataentity.logic.IDELogicRuntime;
import net.ibizsys.runtime.dataentity.logic.IDEMSLogicRuntime;
import net.ibizsys.runtime.util.Errors;

/**
 * 动态实例实体运行时对象默认实现
 * 
 * @author lionlau
 *
 */
public class DynaInstDataEntityRuntime extends DataEntityRuntimeBaseBase implements IDynaInstDataEntityRuntime {

	private static final org.apache.commons.logging.Log log = org.apache.commons.logging.LogFactory.getLog(DynaInstDataEntityRuntime.class);

	private IDynaInstRuntime iDynaInstRuntime = null;
	private IDataEntityRuntimeContext iDataEntityRuntimeContext = null;
	private IPSDataEntity iPSDataEntity = null;
	private ISystemRuntime iSystemRuntime = null;

	private IDynaInstDataEntityRuntimeContext iDynaInstDataEntityRuntimeContext = new IDynaInstDataEntityRuntimeContext() {

		@Override
		public IDynaInstDataEntityRuntime getDataEntityRuntime() {
			return getSelf();
		}

	};

	@Override
	public void init(IDynaInstRuntime iDynaInstRuntime, IDataEntityRuntimeContext iDataEntityRuntimeContext) throws Exception {
		this.iDynaInstRuntime = iDynaInstRuntime;
		this.iDataEntityRuntimeContext = iDataEntityRuntimeContext;
		this.iPSDataEntity = this.iDynaInstRuntime.getPSDynaInstService().getPSDataEntity(iDataEntityRuntimeContext.getDataEntityRuntime().getId(), false);
		this.iSystemRuntime = this.getDataEntityRuntimeContext().getDataEntityRuntime().getSystemRuntime();

		this.onInit();
	}

	protected void onInit() throws Exception {
		super.onInit();
	}

	private DynaInstDataEntityRuntime getSelf() {
		return this;
	}

	@Override
	protected void prepare() {

	}

	protected IDataEntityRuntimeContext getDataEntityRuntimeContext() {
		return this.iDataEntityRuntimeContext;
	}

	protected IDynaInstDataEntityRuntimeContext getDynaInstDataEntityRuntimeContext() {
		return this.iDynaInstDataEntityRuntimeContext;
	}

	@Override
	protected IDataEntityRuntimeBaseContext getDataEntityRuntimeBaseContext() {
		return getDynaInstDataEntityRuntimeContext();
	}

	@Override
	final public IPSDataEntity getPSDataEntity() throws Exception {
		return this.iPSDataEntity;
	}

	@Override
	public IDynaInstRuntime getDynaInstRuntime() {
		return this.iDynaInstRuntime;
	}

	@Override
	public ISystemRuntime getSystemRuntime() {
		return this.iSystemRuntime;
	}

	@Override
	public String getId() {
		return getDataEntityRuntime().getId();
	}

	@Override
	public String getName() {
		return getDataEntityRuntime().getName();
	}

	@Override
	public IDEScriptLogicRuntime createDEScriptLogicRuntime(String strLogicMode, String strScriptCode) {
		return getDataEntityRuntime().createDEScriptLogicRuntime(strLogicMode, strScriptCode);
	}

	@Override
	public IDataEntityRuntime getDataEntityRuntime() {
		return getDataEntityRuntimeContext().getDataEntityRuntime();
	}

	@Override
	public IDELogicRuntime createDELogicRuntime(IPSDELogic iPSDELogic) {
		return getDataEntityRuntime().createDELogicRuntime(iPSDELogic);
	}

	@Override
	public IDEMSLogicRuntime createDEMSLogicRuntime(IPSDEMSLogic iPSDEMSLogic) {
		return getDataEntityRuntime().createDEMSLogicRuntime(iPSDEMSLogic);
	}
	
	@Override
	public IDEDataImportRuntime createDEDataImportRuntime(IPSDEDataImport iPSDEDataImport) {
		return getDataEntityRuntime().createDEDataImportRuntime(iPSDEDataImport);
	}

	@Override
	public IDEDataExportRuntime createDEDataExportRuntime(IPSDEDataExport iPSDEDataExport) {
		return getDataEntityRuntime().createDEDataExportRuntime(iPSDEDataExport);
	}
	
	

}
