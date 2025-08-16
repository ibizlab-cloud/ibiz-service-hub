package net.ibizsys.model;

import com.fasterxml.jackson.databind.node.ObjectNode;

public interface IPSModelObjectRuntime extends IPSModelObject{

	void init(IPSModelService iPSModelService,IPSModelObjectRuntime parentModel,ObjectNode objectNode);
	<T> T getChildPSModelObject(Class<T> cls, ObjectNode objNode, String strTag, boolean bTryMode);
	<T> T getChildPSModelObject(Class<T> cls, ObjectNode objNode, String strTag);
	String getCodeName();
	String getName();
	String getDynaModelFilePath();
	<T> T getParentPSModelObject(Class<T> cls, boolean bTryMode);
	<T> T getParentPSModelObject(Class<T> cls);
	IPSModelObjectRuntime getParentPSModelObject();
	String getId();
	<T> T getPSModelObject(Class<T> cls, boolean bTryMode);
}