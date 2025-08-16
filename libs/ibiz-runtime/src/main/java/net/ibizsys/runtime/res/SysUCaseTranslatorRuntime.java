package net.ibizsys.runtime.res;

import org.springframework.util.ObjectUtils;

import net.ibizsys.model.dataentity.defield.IPSDEField;
import net.ibizsys.runtime.dataentity.IDataEntityRuntime;
import net.ibizsys.runtime.util.IEntityBase;

/**
 * 数据大写转换器运行时对象
 * @author lionlau
 *
 */
public class SysUCaseTranslatorRuntime extends SysTranslatorRuntimeBase {

	private static SysUCaseTranslatorRuntime instance = new SysUCaseTranslatorRuntime();
	
	
	/**
	 * 获取默认实例对象
	 * @return
	 */
	public static SysUCaseTranslatorRuntime getInstance() {
		return SysUCaseTranslatorRuntime.instance;
	}
	
	@Override
	public Object translate(Object objValue, boolean bIn, IEntityBase iEntityBase,  IPSDEField iPSDEField, IDataEntityRuntime entityDataEntityRuntime) throws Throwable {
		
		if(bIn) {
			if(ObjectUtils.isEmpty(objValue)) {
				//没有指定值
				return null;
			}

			return objValue.toString().toUpperCase();
			
		}
		else {
			return objValue;
		}
	}

}
