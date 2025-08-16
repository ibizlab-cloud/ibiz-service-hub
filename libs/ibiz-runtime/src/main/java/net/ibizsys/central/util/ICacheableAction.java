package net.ibizsys.central.util;

import com.fasterxml.jackson.core.type.TypeReference;

public interface ICacheableAction{

	
	<T> T get(Class<T> cls) throws Throwable;
	
	
	<T> T get(TypeReference<T> type) throws Throwable;
	

	<T> T get(Object[] args, Class<T> cls) throws Throwable;
	
	
	<T> T get(Object[] args, TypeReference<T> type) throws Throwable;
	
	
	<T> T save(Class<T> cls) throws Throwable;
	
	
	<T> T save(TypeReference<T> type) throws Throwable;
	

	<T> T save(Object[] args, Class<T> cls) throws Throwable;
	
	
	<T> T save(Object[] args, TypeReference<T> type) throws Throwable;
	
	
	void remove() throws Throwable;
	
	
	void remove(Object[] args) throws Throwable;
}
