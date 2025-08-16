package net.ibizsys.runtime.res;

import java.util.Map;

import net.ibizsys.model.dataentity.defield.IPSDEField;
import net.ibizsys.runtime.dataentity.IDataEntityRuntime;
import net.ibizsys.runtime.util.IEntityBase;

/**
 * 系统序列化转换器运行时对象
 * @author lionlau
 *
 */
public class SysMapSerializeTranslatorRuntime extends SysTranslatorRuntimeBase {

	private static final org.apache.commons.logging.Log log = org.apache.commons.logging.LogFactory.getLog(SysMapSerializeTranslatorRuntime.class);

	@Override
	public Object translate(Object objValue, boolean bIn, IEntityBase iEntityBase, IPSDEField iPSDEField, IDataEntityRuntime entityDataEntityRuntime) throws Throwable {
		
		if(objValue == null) {
			return null;
		}
		
		if(bIn) {
			return this.getSystemRuntime().serialize(objValue);
		}
		else {
			return this.getSystemRuntime().deserialize(objValue, Map.class);
		}
	}

}
