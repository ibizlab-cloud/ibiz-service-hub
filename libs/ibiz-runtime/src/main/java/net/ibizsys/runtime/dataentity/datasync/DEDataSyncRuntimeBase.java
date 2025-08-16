package net.ibizsys.runtime.dataentity.datasync;

import org.springframework.util.Assert;

import net.ibizsys.model.IPSModelObject;
import net.ibizsys.model.dataentity.datasync.IPSDEDataSync;
import net.ibizsys.runtime.IDynaInstRuntime;
import net.ibizsys.runtime.ISystemRuntime;
import net.ibizsys.runtime.ModelRuntimeBase;
import net.ibizsys.runtime.dataentity.IDataEntityRuntime;
import net.ibizsys.runtime.dataentity.IDataEntityRuntimeBase;
import net.ibizsys.runtime.dataentity.IDynaInstDataEntityRuntime;

/**
 * 实体数据同步运行时对象接口
 * 
 * @author lionlau
 *
 */
public abstract class DEDataSyncRuntimeBase extends ModelRuntimeBase implements IDEDataSyncRuntime {

	private IPSDEDataSync iPSDEDataSync = null;
	private IDynaInstRuntime iDynaInstRuntime = null;
	private ISystemRuntime iSystemRuntime = null;
	private IDataEntityRuntime iDataEntityRuntime = null;
	private IDynaInstDataEntityRuntime iDynaInstDataEntityRuntime = null;
	private int nEventType = DEDataSyncEvents.NONE;

	@Override
	public void init(IDataEntityRuntimeBase iDataEntityRuntimeBase, IPSDEDataSync iPSDEDataSync) throws Exception {
		Assert.notNull(iDataEntityRuntimeBase, "传入实体运行时对象无效");
		Assert.notNull(iPSDEDataSync, "传入实体数据同步模型对象无效");

		if (iDataEntityRuntimeBase instanceof IDataEntityRuntime) {
			this.iDataEntityRuntime = (IDataEntityRuntime) iDataEntityRuntimeBase;
			this.iSystemRuntime = this.iDataEntityRuntime.getSystemRuntime();

		} else if (iDataEntityRuntimeBase instanceof IDynaInstDataEntityRuntime) {
			this.iDynaInstDataEntityRuntime = (IDynaInstDataEntityRuntime) iDataEntityRuntimeBase;
			this.iDataEntityRuntime = this.iDynaInstDataEntityRuntime.getDataEntityRuntime();
			this.iSystemRuntime = this.iDataEntityRuntime.getSystemRuntime();
			this.iDynaInstRuntime = this.iDynaInstDataEntityRuntime.getDynaInstRuntime();
		}

		this.iPSDEDataSync = iPSDEDataSync;
		this.nEventType = this.getPSDEDataSync().getEventType();
		this.onInit();
	}

	@Override
	public IDataEntityRuntime getDataEntityRuntime() {
		return this.iDataEntityRuntime;
	}

	@Override
	public IPSDEDataSync getPSDEDataSync() {
		return this.iPSDEDataSync;
	}

	@Override
	public IPSModelObject getPSModelObject() {
		return getPSDEDataSync();
	}

	public IDynaInstRuntime getDynaInstRuntime() {
		return this.iDynaInstRuntime;
	}

	public ISystemRuntime getSystemRuntime() {
		return this.iSystemRuntime;
	}

	@Override
	public String getId() {
		if (getPSDEDataSync() != null) {
			return getPSDEDataSync().getDynaModelFilePath();
		}
		return null;
	}

	@Override
	public String getName() {
		if (getPSDEDataSync() != null) {
			return getPSDEDataSync().getName();
		}
		return null;
	}

	public int getEventType() {
		return this.nEventType;
	}
}
