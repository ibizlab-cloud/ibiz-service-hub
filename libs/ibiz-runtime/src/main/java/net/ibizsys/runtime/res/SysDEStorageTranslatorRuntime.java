package net.ibizsys.runtime.res;

import net.ibizsys.model.dataentity.defield.IPSDEField;
import net.ibizsys.runtime.dataentity.IDataEntityRuntime;
import net.ibizsys.runtime.util.IEntityBase;

/**
 * 系统实体存储转换器运行时对象
 * 
 * @author lionlau
 *
 */
public class SysDEStorageTranslatorRuntime extends SysTranslatorRuntimeBase {

	private static final org.apache.commons.logging.Log log = org.apache.commons.logging.LogFactory.getLog(SysDEStorageTranslatorRuntime.class);

	@Override
	protected void onInit() throws Exception {

		this.getPSSysTranslator().getPSDataEntityMust();
		this.getPSSysTranslator().getKeyPSDEFieldMust();
		this.getPSSysTranslator().getValuePSDEFieldMust();

		super.onInit();
	}

	@Override
	protected Object onTranslate(Object objValue, boolean bIn, IEntityBase iEntityBase, IPSDEField iPSDEField, IDataEntityRuntime entityDataEntityRuntime) throws Throwable {
		// TODO Auto-generated method stub
		return super.onTranslate(objValue, bIn, iEntityBase, iPSDEField, entityDataEntityRuntime);
	}

}
