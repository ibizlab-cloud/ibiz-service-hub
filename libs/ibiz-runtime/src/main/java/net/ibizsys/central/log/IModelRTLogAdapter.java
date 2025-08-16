package net.ibizsys.central.log;

import net.ibizsys.runtime.plugin.IModelRTAddin;

public interface IModelRTLogAdapter extends IModelRTAddin{

	public final static String LOG_PREDEFINEDFIELD_OWNER_TYPE = "OWNER_TYPE";
	
	public final static String LOG_PREDEFINEDFIELD_OWNER_SUBTYPE = "OWNER_SUBTYPE";
	
	public final static String LOG_PREDEFINEDFIELD_OWNER_ID = "OWNER_ID";
	
	public final static String LOG_PREDEFINEDFIELD_END_AT = "END_AT";
	
	public final static String LOG_PREDEFINEDFIELD_START_AT = "START_AT";
	
	public final static String LOG_PREDEFINEDFIELD_INFO = "INFO";
	public final static String LOG_PREDEFINEDFIELD_LEVEL = "LEVEL";
	
	
	public final static String LOG_PREDEFINEDFIELD_STATE = "STATE";
	
	public final static String LOG_PREDEFINEDFIELD_CATEGORY = "CATEGORY";
	
	public final static String LOG_PREDEFINEDFIELD_ELAPSED_TIME = "ELAPSED_TIME";
	
	
	
	public final static String LOG_LEVEL_INFO = "INFO";
	public final static String LOG_LEVEL_WARN = "WARN";
	public final static String LOG_LEVEL_ERROR = "ERROR";
	
	
	public final static String LOG_STATE_SUCCESS = "SUCCESS";
	public final static String LOG_STATE_FAILURE = "FAILURE";
	
	
	
	
}
