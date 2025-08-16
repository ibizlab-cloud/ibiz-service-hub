package net.ibizsys.central;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.util.StringUtils;

import net.ibizsys.runtime.util.LogLevels;

public class SimpleSystemLogAdapter extends SystemLogAdapterBase  {

	private static final Log log = LogFactory.getLog(SimpleSystemLogAdapter.class);
	
	@Override
	public void log(int nLogLevel, String strCat, String strInfo, Object objData) {
		if(StringUtils.hasLength(strCat)) {
			switch(nLogLevel) {
			case LogLevels.TRACE:
				log.trace(String.format("[%1$s] %2$s", strCat, strInfo));
				break;
			case LogLevels.DEBUG:
				log.debug(String.format("[%1$s] %2$s", strCat, strInfo));
				break;
			case LogLevels.WARN:
				log.warn(String.format("[%1$s] %2$s", strCat, strInfo));
				break;
			case LogLevels.ERROR:
				log.error(String.format("[%1$s] %2$s", strCat, strInfo));
				break;
			case LogLevels.FATAL:
				log.fatal(String.format("[%1$s] %2$s", strCat, strInfo));
				break;
			case LogLevels.INFO:
				log.info(String.format("[%1$s] %2$s", strCat, strInfo));
			default:
				break;
			}
		}
		else {
			switch(nLogLevel) {
			case LogLevels.TRACE:
				log.trace(strInfo);
				break;
			case LogLevels.DEBUG:
				log.debug(strInfo);
				break;
			case LogLevels.WARN:
				log.warn(strInfo);
				break;
			case LogLevels.ERROR:
				log.error(strInfo);
				break;
			case LogLevels.FATAL:
				log.fatal(strInfo);
				break;
			case LogLevels.INFO:
				log.info(strInfo);
			default:
				break;
			}
		}
	}

	@Override
	public void logAudit(int nLogLevel, String strCat, String strInfo, String strPersonId, String strAddress, Object objData) {
		if(StringUtils.hasLength(strCat)) {
			switch(nLogLevel) {
			case LogLevels.TRACE:
				log.trace(String.format("[%1$s] %2$s", strCat, strInfo));
				break;
			case LogLevels.DEBUG:
				log.debug(String.format("[%1$s] %2$s", strCat, strInfo));
				break;
			case LogLevels.WARN:
				log.warn(String.format("[%1$s] %2$s", strCat, strInfo));
				break;
			case LogLevels.ERROR:
				log.error(String.format("[%1$s] %2$s", strCat, strInfo));
				break;
			case LogLevels.FATAL:
				log.fatal(String.format("[%1$s] %2$s", strCat, strInfo));
				break;
			case LogLevels.INFO:
				log.info(String.format("[%1$s] %2$s", strCat, strInfo));
			default:
				break;
			}
		}
		else {
			switch(nLogLevel) {
			case LogLevels.TRACE:
				log.trace(strInfo);
				break;
			case LogLevels.DEBUG:
				log.debug(strInfo);
				break;
			case LogLevels.WARN:
				log.warn(strInfo);
				break;
			case LogLevels.ERROR:
				log.error(strInfo);
				break;
			case LogLevels.FATAL:
				log.fatal(strInfo);
				break;
			case LogLevels.INFO:
				log.info(strInfo);
			default:
				break;
			}
		}
	}

	@Override
	public void logEvent(int nLogLevel, String strCat, String strInfo, Object objData) {
		if(StringUtils.hasLength(strCat)) {
			switch(nLogLevel) {
			case LogLevels.TRACE:
				log.trace(String.format("[%1$s] %2$s", strCat, strInfo));
				break;
			case LogLevels.DEBUG:
				log.debug(String.format("[%1$s] %2$s", strCat, strInfo));
				break;
			case LogLevels.WARN:
				log.warn(String.format("[%1$s] %2$s", strCat, strInfo));
				break;
			case LogLevels.ERROR:
				log.error(String.format("[%1$s] %2$s", strCat, strInfo));
				break;
			case LogLevels.FATAL:
				log.fatal(String.format("[%1$s] %2$s", strCat, strInfo));
				break;
			case LogLevels.INFO:
				log.info(String.format("[%1$s] %2$s", strCat, strInfo));
			default:
				break;
			}
		}
		else {
			switch(nLogLevel) {
			case LogLevels.TRACE:
				log.trace(strInfo);
				break;
			case LogLevels.DEBUG:
				log.debug(strInfo);
				break;
			case LogLevels.WARN:
				log.warn(strInfo);
				break;
			case LogLevels.ERROR:
				log.error(strInfo);
				break;
			case LogLevels.FATAL:
				log.fatal(strInfo);
				break;
			case LogLevels.INFO:
				log.info(strInfo);
			default:
				break;
			}
		}
	}

	@Override
	public void logPO(int nLogLevel, String strCat, String strInfo, String strDEName, String strAction, long nTime, Object objData) {
		if(StringUtils.hasLength(strCat)) {
			switch(nLogLevel) {
			case LogLevels.TRACE:
				log.trace(String.format("[%1$s] %2$s", strCat, strInfo));
				break;
			case LogLevels.DEBUG:
				log.debug(String.format("[%1$s] %2$s", strCat, strInfo));
				break;
			case LogLevels.WARN:
				log.warn(String.format("[%1$s] %2$s", strCat, strInfo));
				break;
			case LogLevels.ERROR:
				log.error(String.format("[%1$s] %2$s", strCat, strInfo));
				break;
			case LogLevels.FATAL:
				log.fatal(String.format("[%1$s] %2$s", strCat, strInfo));
				break;
			case LogLevels.INFO:
				log.info(String.format("[%1$s] %2$s", strCat, strInfo));
			default:
				break;
			}
		}
		else {
			switch(nLogLevel) {
			case LogLevels.TRACE:
				log.trace(strInfo);
				break;
			case LogLevels.DEBUG:
				log.debug(strInfo);
				break;
			case LogLevels.WARN:
				log.warn(strInfo);
				break;
			case LogLevels.ERROR:
				log.error(strInfo);
				break;
			case LogLevels.FATAL:
				log.fatal(strInfo);
				break;
			case LogLevels.INFO:
				log.info(strInfo);
			default:
				break;
			}
		}
	}



}
