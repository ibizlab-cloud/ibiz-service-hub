package net.ibizsys.runtime.res;

import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.springframework.util.StringUtils;

import net.ibizsys.model.dataentity.defield.IPSDEField;
import net.ibizsys.runtime.SystemRuntimeException;
import net.ibizsys.runtime.dataentity.IDataEntityRuntimeBase;
import net.ibizsys.runtime.util.IEntityBase;

/**
 * 正则式值规则运行时对象
 * 
 * @author lionlau
 *
 */
public class SysRegExValueRuleRuntime extends SysValueRuleRuntimeBase {

	private static final org.apache.commons.logging.Log log = org.apache.commons.logging.LogFactory.getLog(SysRegExValueRuleRuntime.class);

	private final static Map<String, Pattern> regExPatternMap = new HashMap<String, Pattern>();
	public final static int PATTERN_MAXCACHE = 2000;

	private Pattern p = null;

	/**
	 * 获取正则式模式
	 * 
	 * @param strRegEx
	 * @return
	 */
	public static Pattern getPattern(String strRegEx) {
		Pattern p = regExPatternMap.get(strRegEx);
		if (p == null) {
			p = Pattern.compile(strRegEx);
			if (regExPatternMap.size() > PATTERN_MAXCACHE) {
				regExPatternMap.clear();
			}
			regExPatternMap.put(strRegEx, p);
		}
		return p;
	}

	@Override
	protected void onInit() throws Exception {
		if (StringUtils.hasLength(this.getPSSysValueRule().getRegExCode())) {
			p = SysRegExValueRuleRuntime.getPattern(this.getPSSysValueRule().getRegExCode());
		} else {
			throw new SystemRuntimeException(this.getSystemRuntimeBase(), String.format("系统值规则[%1$s]没有指定正则式内容", this.getName()));
		}
		super.onInit();
	}

	@Override
	public boolean test(Object objValue, IEntityBase iEntityBase, IPSDEField iPSDEField, IDataEntityRuntimeBase iDataEntityRuntimeBase) throws Throwable{

		String strValue = null;
		if (objValue != null) {
			strValue = (String) objValue;
		}

		if (!StringUtils.hasLength(strValue))
			return true;

		Matcher m = p.matcher(strValue);
		return m.matches();
	}

}
