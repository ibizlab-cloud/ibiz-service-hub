package net.ibizsys.central.dataentity.logic;

import org.springframework.util.StringUtils;

import net.ibizsys.runtime.util.ActionSessionManager;
import net.ibizsys.runtime.util.SimpleEntity;

/**
 * 处理逻辑会话参数对象
 * 
 * @author lionlau
 *
 */
public class DELogicSessionParamRuntime extends DELogicParamRuntimeBase {

	private String strSessionTag = null;

	@Override
	protected void onInit() throws Exception {
		String strParamTag = this.getPSDELogicParam().getParamTag();
		if(StringUtils.isEmpty(strParamTag)) {
			strParamTag = this.getCodeName();
		}
		this.strSessionTag = String.format("DELOGIC_%1$s", strParamTag);
		super.onInit();
	}

	public String getSessionTag() {
		return this.strSessionTag;
	}
	
	@Override
	public Object getParamObject(IDELogicSession iDELogicSession) throws Throwable {
		Object object = ActionSessionManager.getCurrentSessionMust().getActionParam(getSessionTag());
		if (object == null) {
			if (this.getDataEntityRuntime() == null) {
				object = new SimpleEntity();
			} else {
				object = this.getDataEntityRuntime().createEntity();
			}
			ActionSessionManager.getCurrentSessionMust().setActionParam(getSessionTag(), object);
		}
		return object;
	}

	@Override
	public void bind(IDELogicSession iDELogicSession, Object paramObject) throws Throwable {
		ActionSessionManager.getCurrentSessionMust().setActionParam(getSessionTag(), paramObject);
	}
	

}
