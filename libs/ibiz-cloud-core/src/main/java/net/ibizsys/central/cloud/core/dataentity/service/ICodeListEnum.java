package net.ibizsys.central.cloud.core.dataentity.service;

public interface ICodeListEnum {

	String name();
	
	default Object value() {
		return name();
	}
	
	
	String text();
}
