package net.ibizsys.model;

import com.fasterxml.jackson.databind.node.ObjectNode;

public abstract class PSModelServiceProxyImplBase implements IPSModelServiceProxy {

	private IPSModelService iPSModelService = null;

	@Override
	public void init(IPSModelService iPSModelService, Object tag){
		this.iPSModelService = iPSModelService;
		this.onInit();
	}
	
	protected void onInit(){
		
	}
	
	public IPSModelService getRealPSModelService() {
		return this.iPSModelService;
	}
	
	@Override
	public ObjectNode getRealObjectNode(ObjectNode objectNode) {
		return getRealPSModelService().getRealObjectNode(objectNode);
	}
	
	@Override
	public <T> T getPSModelObject(IPSModelObjectRuntime relatedPSModelObject, Class<T> cls, ObjectNode objNode, String strTag) {
		return getRealPSModelService().getPSModelObject(relatedPSModelObject, cls, objNode, strTag);
	}

	@Override
	public <T> T getPSModelObject(IPSModelObjectRuntime relatedPSModelObject, Class<T> cls, java.util.List<T> list, Object objKey, boolean bTryMode){
		return getRealPSModelService().getPSModelObject(relatedPSModelObject, cls, list, objKey, bTryMode);
	}
	
	

	@Override
	public <T> T getChildPSModelObject(IPSModelObjectRuntime relatedPSModelObject, Class<T> cls, ObjectNode objNode, String strTag, boolean bTryMode){
		return this.getRealPSModelService().getChildPSModelObject(relatedPSModelObject, cls, objNode, strTag, bTryMode);
	}

	@Override
	public <T> T getParentPSModelObject(IPSModelObjectRuntime relatedPSModelObject, Class<T> cls, boolean bTryMode){
		return this.getRealPSModelService().getParentPSModelObject(relatedPSModelObject, cls, bTryMode);
	}

	@Override
	public <T> T getPSModelObject(IPSModelObjectRuntime relatedPSModelObject, Class<T> cls, boolean bTryMode) {
		return this.getRealPSModelService().getPSModelObject(relatedPSModelObject, cls, bTryMode);
	}

	
	
}
