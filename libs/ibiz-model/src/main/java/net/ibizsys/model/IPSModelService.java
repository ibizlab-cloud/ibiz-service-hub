package net.ibizsys.model;

import com.fasterxml.jackson.databind.node.ObjectNode;

/**
 * 默认服务对象
 * @author lionlau
 *
 */
public interface IPSModelService {

	
	
	ObjectNode getRealObjectNode(ObjectNode objectNode);
	
	<T> T getPSModelObject(IPSModelObjectRuntime relatedPSModelObject, Class<T> cls,ObjectNode objNode,String strTag);
	
	<T> T getPSModelObject(IPSModelObjectRuntime relatedPSModelObject, Class<T> cls,java.util.List<T> it,Object objKey, boolean bTryMode) ;
	
	<T> T getChildPSModelObject(IPSModelObjectRuntime relatedPSModelObject, Class<T> cls, ObjectNode objNode, String strTag, boolean bTryMode);
	
	<T> T getParentPSModelObject(IPSModelObjectRuntime relatedPSModelObject, Class<T> cls, boolean bTryMode);
	
	//<T> T createPSModelObject(IPSModelObjectRuntime parentPSModelObject, Class<T> cls, ObjectNode objNode);
	
	<T> T getPSModelObject(IPSModelObjectRuntime relatedPSModelObject, Class<T> cls, boolean bTryMode);
	
}
