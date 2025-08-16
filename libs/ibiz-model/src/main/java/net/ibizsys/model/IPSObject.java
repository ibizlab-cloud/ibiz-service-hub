package net.ibizsys.model;

import com.fasterxml.jackson.databind.node.ObjectNode;

public interface IPSObject{

	java.lang.String getId();
	
	java.lang.String getName();
	
	java.lang.String getLogicName();
	
	java.lang.String getMemo();
	
	ObjectNode getObjectNode();
	
	<T> T getParentPSModelObject(Class<T> cls, boolean bTryMode);
	
	<T> T getParentPSModelObject(Class<T> cls);
	
	IPSModelObjectRuntime getParentPSModelObject();
	
	
	<T> T getPSModelObject(Class<T> cls, boolean bTryMode);
}