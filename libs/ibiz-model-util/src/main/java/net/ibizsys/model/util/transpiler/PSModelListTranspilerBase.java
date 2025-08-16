package net.ibizsys.model.util.transpiler;

import java.util.Collection;
import java.util.List;

import org.springframework.util.StringUtils;

import com.fasterxml.jackson.databind.node.ArrayNode;
import com.fasterxml.jackson.databind.node.ObjectNode;

import net.ibizsys.model.IPSModelObject;
import net.ibizsys.model.PSObjectImpl;
import net.ibizsys.model.util.JsonUtils;
import net.ibizsys.psmodel.core.util.IPSModel;

public abstract class PSModelListTranspilerBase extends PSModelTranspilerBase implements IPSModelListTranspiler{

	@Override
	public void decompile(IPSModelTranspileContext iPSModelTranspileContext, Collection<? extends IPSModelObject> psModelList, Collection<? extends IPSModel> domainList, boolean bFullMode) throws Exception {
		this.onDecompile(iPSModelTranspileContext, psModelList, domainList, bFullMode);
	} 
	
	protected void onDecompile(IPSModelTranspileContext iPSModelTranspileContext, Collection<? extends IPSModelObject> psModelList, Collection<? extends IPSModel> domainList, boolean bFullMode) throws Exception {
		for(IPSModelObject iPSModelObject : psModelList) {
			IPSModel domain = this.createDomain(iPSModelObject);
			this.decompile(iPSModelTranspileContext, iPSModelObject, domain, bFullMode);
			((List)domainList).add(domain);
		}
	}
	
	@Override
	public IPSModel decompile(IPSModelTranspileContext iPSModelDecompileContext, IPSModelObject iPSModelObject, IPSModel domain, boolean bFullMode) throws Exception {
		if(domain == null) {
			domain = this.createDomain(iPSModelObject);
		}
		return super.decompile(iPSModelDecompileContext, iPSModelObject, domain, bFullMode);
	}
	
	@Override
	protected void onDecompile(IPSModelTranspileContext iPSModelTranspileContext, IPSModelObject iPSModelObject, IPSModel domain, boolean bFullMode) throws Exception {
		String strId = iPSModelTranspileContext.getPSModelUniqueTag(iPSModelObject);
		if(StringUtils.hasLength(strId)) {
			domain.setId(strId);
		}
		
		this.getPSModelTranspiler(iPSModelTranspileContext, iPSModelObject).decompile(iPSModelTranspileContext, iPSModelObject, domain, bFullMode);
	}
	
	
	protected abstract IPSModel createDomain(IPSModelObject iPSModelObject) throws Exception;

	
	//protected abstract IPSModelTranspiler getPSModelTranspiler(IPSModelTranspileContext iPSModelTranspileContext, IPSModel iPSModel) throws Exception;
	
	
	protected abstract IPSModelTranspiler getPSModelTranspiler(IPSModelTranspileContext iPSModelTranspileContext, IPSModelObject iPSModelObject) throws Exception;
	
	
	@Override
	public ObjectNode compile(IPSModelTranspileContext iPSModelTranspileContext, IPSModel domain, ObjectNode objectNode) throws Exception {
		if(objectNode == null) {
			objectNode = JsonUtils.createObjectNode();
		}
		return super.compile(iPSModelTranspileContext, domain, objectNode);
	}
	
	@Override
	protected void onCompile(IPSModelTranspileContext iPSModelTranspileContext, IPSModel domain, ObjectNode objectNode) throws Exception {
		this.getPSModelTranspiler(iPSModelTranspileContext, domain).compile(iPSModelTranspileContext, domain, objectNode);
		
		if(StringUtils.hasLength(domain.getId())) {
			String strRealId = getRealModelId(iPSModelTranspileContext, domain.getId());
			if(StringUtils.hasLength(strRealId)) {
				if(strRealId.indexOf(".json") == -1) {
					objectNode.put(PSObjectImpl.ATTR_GETID, strRealId);
				}
				else {
					objectNode.put(PSObjectImpl.ATTR_GETDYNAMODELFILEPATH, strRealId);
				}
			}
		}
		
	}
	
	protected abstract IPSModelTranspiler getPSModelTranspiler(IPSModelTranspileContext iPSModelTranspileContext, IPSModel domain) throws Exception;
	
	
	
	@Override
	public void compile(IPSModelTranspileContext iPSModelTranspileContext, Collection<? extends IPSModel> domainList, ArrayNode arrayNode) throws Exception {
		this.onCompile(iPSModelTranspileContext, domainList, arrayNode);
	}
	
	protected void onCompile(IPSModelTranspileContext iPSModelTranspileContext, Collection<? extends IPSModel> domainList, ArrayNode arrayNode) throws Exception {
		for(IPSModel iPSModel : domainList) {
			arrayNode.add(this.compile(iPSModelTranspileContext, iPSModel, null));
		}
	}
	
	@Override
	public ObjectNode getModelRef(IPSModelTranspileContext iPSModelTranspileContext, String fullId, boolean childMode, ObjectNode objectNode) throws Exception {
		if(objectNode == null) {
			objectNode = JsonUtils.createObjectNode();
		}
		this.onGetModelRef(iPSModelTranspileContext, fullId, childMode, objectNode);
		return objectNode;
	}
	
	protected void onGetModelRef(IPSModelTranspileContext iPSModelTranspileContext, String fullId, boolean childMode, ObjectNode objectNode) throws Exception {
		if(childMode) {
			throw new Exception("不支持子数据模型");
		}
		else {
			String id = getRealModelId(iPSModelTranspileContext, fullId);
			objectNode.put("modelref", true);
			if(id.indexOf(".json")==-1) {
				objectNode.put("id", id);
			}
			else {
				objectNode.put("path", id);
			}
			return ;
		}
	}
	
	protected String getRealModelId(IPSModelTranspileContext iPSModelTranspileContext, String fullId) throws Exception {
		String[] items = fullId.split("[.]");
		String[] folders = getModelFolders();
		if(folders == null || folders.length == 0) {
			return items[items.length-1];
		}
		if(items.length> folders.length) {
			throw new Exception(String.format("项[%1$s]有误", fullId));
		}
		
		StringBuilder sb = new StringBuilder();
		int offset = folders.length - items.length;
		for(int i = 0;i<items.length;i++) {
			if(i!=0) {
				sb.append("/");
			}
			sb.append(folders[i+offset]);
			sb.append("/");
			sb.append(items[i]);
		}
		sb.append(".json");
		return sb.toString();
	}
	
	protected String[] getModelFolders() {
		return null;
	}
	
	public static String[] getSysModelGroupModelFolder(String modelName) {
		return new String[] { "PSSYSMODELGROUPS", modelName};
	}
	
	public static String[] getSystemModelFolder(String modelName) {
		return new String[] { "PSSYSMODELGROUPS", "PSMODULES", modelName};
	}
	
	public static String[] getDataEntityModelFolder(String modelName) {
		return new String[] { "PSSYSMODELGROUPS", "PSMODULES", "PSDATAENTITIES", modelName};
	}
	
	public static String[] getWorkflowModelFolder(String modelName) {
		return new String[] { "PSSYSMODELGROUPS", "PSMODULES", "PSWORKFLOWS", modelName};
	}
}
