package net.ibizsys.model.proxy.app;

import com.fasterxml.jackson.databind.node.ObjectNode;

import net.ibizsys.model.PSModelServiceProxyImplBase;
import net.ibizsys.model.app.PSApplicationImpl;

public class PSApplicationServiceProxyImpl extends PSModelServiceProxyImplBase {
	
	@Override
	public ObjectNode getRealObjectNode(ObjectNode objectNode){
		
		com.fasterxml.jackson.databind.JsonNode value = objectNode.get(PSApplicationImpl.ATTR_GETALLPSAPPVIEWS);
		if(value != null){
			com.fasterxml.jackson.databind.node.ArrayNode arrayNode = (com.fasterxml.jackson.databind.node.ArrayNode)value;
			for(int i = 0;i<arrayNode.size();i++) {
				ObjectNode childNode = (com.fasterxml.jackson.databind.node.ObjectNode)arrayNode.get(i);
				childNode.put("modelref", true);
			}
		}
		
		
		return super.getRealObjectNode(objectNode);
	}
}
