package net.ibizsys.runtime.res;

import net.ibizsys.model.codelist.IPSCodeItem;
import net.ibizsys.model.dataentity.defield.IPSDEField;
import net.ibizsys.runtime.codelist.ICodeListRuntime;
import net.ibizsys.runtime.dataentity.IDataEntityRuntime;
import net.ibizsys.runtime.util.IEntityBase;

/**
 * 系统代码表转换器运行时对象
 * @author lionlau
 *
 */
public class SysCodeListTranslatorRuntime extends SysTranslatorRuntimeBase {
	
	private static final org.apache.commons.logging.Log log = org.apache.commons.logging.LogFactory.getLog(SysCodeListTranslatorRuntime.class);
	
	private ICodeListRuntime iCodeListRuntime = null;
	
	@Override
	protected void onInit() throws Exception {
		this.getPSSysTranslator().getPSCodeListMust();
		super.onInit();
	}
	
	protected ICodeListRuntime getCodeListRuntime() throws Throwable {
		if(this.iCodeListRuntime == null) {
			this.iCodeListRuntime = this.getSystemRuntime().getCodeListRuntime(this.getPSSysTranslator().getPSCodeListMust());
		}
		return this.iCodeListRuntime;
	}
	

	protected Object onTranslate(Object objValue, boolean bIn, IEntityBase iEntityBase, IPSDEField iPSDEField, IDataEntityRuntime entityDataEntityRuntime) throws Throwable {
		ICodeListRuntime iCodeListRuntime = this.getCodeListRuntime();
		if(bIn) {
			return iCodeListRuntime.getText(objValue);						
		}
		else {
			if(objValue == null) {
				return null;
			}
			IPSCodeItem iPSCodeItem = iCodeListRuntime.getPSCodeItemByText(String.valueOf(objValue), false);	
			return iPSCodeItem.getValue();
		}
	}
}
