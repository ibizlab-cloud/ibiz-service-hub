package net.ibizsys.runtime.dataentity.mainstate;

import org.springframework.util.StringUtils;

import net.ibizsys.model.dataentity.mainstate.IPSDEMainState;
import net.ibizsys.runtime.dataentity.DataEntityRuntimeException;
import net.ibizsys.runtime.dataentity.IDataEntityRuntimeBase;

/**
 * 实体主状态拒绝异常
 * 
 * @author lionlau
 *
 */
public class DEMainStateActionDenyException extends DataEntityRuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private IPSDEMainState iPSDEMainState = null;
	
	public DEMainStateActionDenyException(IDataEntityRuntimeBase iDataEntityRuntimeBase, IPSDEMainState iPSDEMainState, String strInfo) {
		super(iDataEntityRuntimeBase, strInfo);
		this.iPSDEMainState = iPSDEMainState;
	}

	/**
	 * 获取拒绝的实体主状态
	 * @return
	 */
	public IPSDEMainState getPSDEMainState() {
		return iPSDEMainState;
	}
	

	
	@Override
	public String getMessage() {
		String strMessage =  super.getMessage();
		if(StringUtils.hasLength(strMessage)) {
			return strMessage;
		}
		
		strMessage = getPSDEMainState().getActionDenyMsg();
		if(StringUtils.hasLength(strMessage)) {
			return strMessage;
		}
		
		return String.format("实体主状态[%1$s]限制此操作",this.getPSDEMainState().getName());
	}
}
