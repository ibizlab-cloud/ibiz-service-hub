package net.ibizsys.central.util;

import com.fasterxml.jackson.core.type.TypeReference;

/**
 * 用户上下文环境下行为操作
 * @author lionlau
 *
 */
public interface IUserContextAction{

	<T> T execute(Class<T> cls) throws Throwable;
	
	
	<T> T execute(TypeReference<T> type) throws Throwable;
	

	<T> T execute(Object[] args, Class<T> cls) throws Throwable;
	
	
	<T> T execute(Object[] args, TypeReference<T> type) throws Throwable;
	
	
	void execute() throws Throwable;
	
	
	void execute(Object[] args) throws Throwable;
}
