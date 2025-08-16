package net.ibizsys.central.dataentity.logic;

/**
 * 最后调用返回参数对象
 * 
 * @author lionlau
 *
 */
public class DELogicLastReturnParamRuntime extends DELogicParamRuntimeBase{

	@Override
	public Object getParamObject(IDELogicSession iDELogicSession) throws Throwable {
		return iDELogicSession.getLastReturn();
	}

	@Override
	public void bind(IDELogicSession iDELogicSession, Object paramObject) throws Throwable {
		iDELogicSession.setLastReturn(paramObject);
	}

	
	
}
