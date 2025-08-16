package net.ibizsys.runtime.res;

import org.springframework.util.ObjectUtils;

import net.ibizsys.model.dataentity.defield.IPSDEField;
import net.ibizsys.runtime.dataentity.IDataEntityRuntime;
import net.ibizsys.runtime.util.IEntityBase;
import net.ibizsys.runtime.util.KeyValueUtils;

/**
 * 数据摘要值转换器运行时对象
 * @author lionlau
 *
 */
public class SysDigestTranslatorRuntime extends SysTranslatorRuntimeBase {

	public final static String RESULT = "__SRFDIGEST__";
	
	private static SysDigestTranslatorRuntime instance = new SysDigestTranslatorRuntime();
	
	
	/**
	 * 获取默认实例对象
	 * @return
	 */
	public static SysDigestTranslatorRuntime getInstance() {
		return SysDigestTranslatorRuntime.instance;
	}
	
	@Override
	public Object translate(Object objValue, boolean bIn, IEntityBase iEntityBase,  IPSDEField iPSDEField, IDataEntityRuntime entityDataEntityRuntime) throws Throwable {
		
		if(bIn) {
			
			if(ObjectUtils.isEmpty(objValue)) {
				//没有指定值
				return null;
			}
			
			//判断是否为保留值
			if(RESULT.equals(objValue)) {
				return "";
			}
			
			//进行摘要处理
			return KeyValueUtils.genUniqueId(new Object[] {objValue});
		}
		else {
			return RESULT;
		}
	}

}
