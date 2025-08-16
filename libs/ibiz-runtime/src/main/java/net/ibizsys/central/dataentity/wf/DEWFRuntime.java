package net.ibizsys.central.dataentity.wf;

import java.util.Map;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.util.ObjectUtils;
import org.springframework.util.StringUtils;

import net.ibizsys.central.dataentity.DataEntityModelRuntimeBase;
import net.ibizsys.central.dataentity.IDataEntityRuntimeContext;
import net.ibizsys.central.util.IEntityDTO;
import net.ibizsys.model.IPSModelObject;
import net.ibizsys.model.dataentity.action.IPSDEAction;
import net.ibizsys.model.dataentity.wf.IPSDEWF;
import net.ibizsys.runtime.IDynaInstRuntime;
import net.ibizsys.runtime.dataentity.DataEntityRuntimeException;

/**
 * 默认实体方法DTO运行时对象实现
 *
 * @author lionlau
 *
 */
@SuppressWarnings("serial")
public class DEWFRuntime extends DataEntityModelRuntimeBase implements IDEWFRuntime {

	private static final Log log = LogFactory.getLog(DEWFRuntime.class);

	private IDataEntityRuntimeContext iDataEntityRuntimeContext = null;
	private IPSDEWF iPSDEWF = null;

	@Override
	public void init(IDataEntityRuntimeContext iDataEntityRuntimeContext, IPSDEWF iPSDEWF) throws Exception {
		this.iDataEntityRuntimeContext = iDataEntityRuntimeContext;
		this.setDataEntityRuntimeBase(getDataEntityRuntimeContext().getDataEntityRuntime());
		this.iPSDEWF = iPSDEWF;

		onInit();
	}

	@Override
	protected void onInit() throws Exception {
		super.onInit();
	}

	protected IDataEntityRuntimeContext getDataEntityRuntimeContext() {
		return iDataEntityRuntimeContext;
	}

	@Override
	public IPSDEWF getPSDEWF() {
		return this.iPSDEWF;
	}

	@Override
	public IPSModelObject getPSModelObject() {
		return getPSDEWF();
	}

	@Override
	public void init(Object arg0, IPSDEAction iPSDEAction, Object actionData) throws Throwable {
		if (!(arg0 instanceof IEntityDTO)) {
			throw new DataEntityRuntimeException(this.getDataEntityRuntimeBase(), this, String.format("传入参数[%1$s]无法识别", arg0));
		}
		IEntityDTO iEntityDTO = (IEntityDTO) arg0;
		if (iPSDEWF.getUDStatePSDEField() != null && StringUtils.hasLength(iPSDEWF.getEntityWFState())) {
			Object lastValue = getDataEntityRuntime().getFieldValue(iEntityDTO, iPSDEWF.getUDStatePSDEField());
			if (lastValue == null) {
				getDataEntityRuntime().setFieldValue(iEntityDTO, iPSDEWF.getUDStatePSDEField(), this.getSystemRuntime().convertValue(iPSDEWF.getUDStatePSDEField().getStdDataType(), iPSDEWF.getEntityWFState()));
			}
		}
		this.getDataEntityRuntime().sysUpdate(iEntityDTO);
	}

	@Override
	public void start(Object arg0, IPSDEAction iPSDEAction, IDynaInstRuntime iDynaInstRuntime, Object actionData) throws Throwable {
		throw new Exception("没有实现");
	}

	@Override
	public Object submit(Object arg0, String wfAction, Map<String, Object> params, IPSDEAction iPSDEAction, IDynaInstRuntime iDynaInstRuntime, Object actionData) throws Throwable {
		throw new Exception("没有实现");
	}

	@Override
	public void error(Object arg0, IPSDEAction iPSDEAction, Object actionData) throws Throwable {
		if (!(arg0 instanceof IEntityDTO)) {
			throw new DataEntityRuntimeException(this.getDataEntityRuntimeBase(), this, String.format("传入参数[%1$s]无法识别", arg0));
		}

		IEntityDTO iEntityDTO = (IEntityDTO) arg0;
		if (iPSDEWF.getUDStatePSDEField() != null && StringUtils.hasLength(iPSDEWF.getEntityWFErrorState())) {
			this.getDataEntityRuntime().setFieldValue((IEntityDTO) arg0, iPSDEWF.getUDStatePSDEField(), this.getSystemRuntime().convertValue(iPSDEWF.getUDStatePSDEField().getStdDataType(), iPSDEWF.getEntityWFErrorState()));
		}
		this.getDataEntityRuntime().sysUpdate(iEntityDTO);
	}

	@Override
	public void finish(Object arg0, IPSDEAction iPSDEAction, Object actionData) throws Throwable {
		if (!(arg0 instanceof IEntityDTO)) {
			throw new DataEntityRuntimeException(this.getDataEntityRuntimeBase(), this, String.format("传入参数[%1$s]无法识别", arg0));
		}

		IEntityDTO iEntityDTO = (IEntityDTO) arg0;
		if (iPSDEWF.getUDStatePSDEField() != null && StringUtils.hasLength(iPSDEWF.getEntityWFFinishState())) {
			if (ObjectUtils.isEmpty(this.getDataEntityRuntime().getFieldValue(iEntityDTO, iPSDEWF.getUDStatePSDEField()))) {
				this.getDataEntityRuntime().setFieldValue(iEntityDTO, iPSDEWF.getUDStatePSDEField(), this.getSystemRuntime().convertValue(iPSDEWF.getUDStatePSDEField().getStdDataType(), iPSDEWF.getEntityWFFinishState()));
			}
		}
		this.getDataEntityRuntime().sysUpdate(iEntityDTO);
	}

	public void cancel(Object arg0, IPSDEAction iPSDEAction, IDynaInstRuntime iDynaInstRuntime, Object actionData) throws Throwable {

	}

	@Override
	public void update(Object arg0, IPSDEAction iPSDEAction, Object actionData) throws Throwable {
		if (!(arg0 instanceof IEntityDTO)) {
			throw new DataEntityRuntimeException(this.getDataEntityRuntimeBase(), this, String.format("传入参数[%1$s]无法识别", arg0));
		}
		IEntityDTO iEntityDTO = (IEntityDTO) arg0;
		this.getDataEntityRuntime().sysUpdate(iEntityDTO);
	}

	@Override
	public void rollback(Object arg0, IPSDEAction iPSDEAction, Object actionData) throws Throwable {

	}

	@Override
	public void register(Object arg0, IPSDEAction iPSDEAction, IDynaInstRuntime iDynaInstRuntime, Object actionData) throws Throwable {
		// TODO Auto-generated method stub

	}

	@Override
	public void unregister(Object arg0, IPSDEAction iPSDEAction, IDynaInstRuntime iDynaInstRuntime, Object actionData) throws Throwable {
		// TODO Auto-generated method stub

	}

	@Override
	public void fillWFTag(Object arg0, IPSDEAction iPSDEAction, IDynaInstRuntime iDynaInstRuntime, Object actionData) throws Throwable {
		// TODO Auto-generated method stub

	}

	@Override
	public int getAccessMode(Object arg0, Object actionData) throws Throwable {
		return ACCESSMODE_DENY;
	}

}
