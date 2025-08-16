package net.ibizsys.central.plugin.util.res;

import java.util.Date;

import net.ibizsys.central.res.SysTranslatorRuntimeBase;
import net.ibizsys.runtime.util.DateUtils;

public class SysEndOfDayTranslatorRuntime extends SysTranslatorRuntimeBase{

	private static final org.apache.commons.logging.Log log = org.apache.commons.logging.LogFactory.getLog(SysEndOfDayTranslatorRuntime.class);
	
	@Override
	protected Object onTranslate(Object objValue, boolean bIn) throws Throwable {
		if(bIn && objValue!=null) {
			Date date = null;
			if(objValue instanceof String) {
				date = DateUtils.parse((String)objValue);
			}
			else
				if(objValue instanceof Date) {
					date = (Date)objValue;
				}
			if(date == null) {
				throw new Exception("传入值无效");
			}
			
			String strDateTime = DateUtils.toDateTimeString(date);
			String strDate = DateUtils.toDateString(date);
			if(strDateTime.replace(strDate, "").trim().equals("00:00:00")) {
				//时间未指定小时，自动附加 23:59:59
				strDateTime = String.format("%1$s 23:59:59", strDate);
			}
			return strDateTime;
		}
		return super.onTranslate(objValue, bIn);
	}
}
