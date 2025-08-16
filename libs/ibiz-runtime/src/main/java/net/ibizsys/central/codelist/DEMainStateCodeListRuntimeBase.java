package net.ibizsys.central.codelist;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.util.ObjectUtils;
import org.springframework.util.StringUtils;

import com.fasterxml.jackson.databind.node.ObjectNode;

import net.ibizsys.central.dataentity.IDataEntityRuntime;
import net.ibizsys.central.dataentity.logic.IDEMSLogicRuntime;
import net.ibizsys.central.util.IEntityDTO;
import net.ibizsys.model.IPSModelObjectRuntime;
import net.ibizsys.model.codelist.IPSCodeItem;
import net.ibizsys.model.codelist.PSCodeItemImpl;
import net.ibizsys.model.dataentity.logic.IPSDEMSLogic;
import net.ibizsys.model.dataentity.logic.IPSDEMSLogicNode;
import net.ibizsys.runtime.SystemRuntimeException;
import net.ibizsys.runtime.util.DataTypeUtils;
import net.ibizsys.runtime.util.IEntity;
import net.ibizsys.runtime.util.JsonUtils;

public abstract class DEMainStateCodeListRuntimeBase extends DynamicCodeListRuntimeBase implements IDEMainStateCodeListRuntime{
	
	private static final Log log = LogFactory.getLog(DEMainStateCodeListRuntimeBase.class);
	private IDEMSLogicRuntime iDEMSLogicRuntime = null;
	private IDataEntityRuntime iDataEntityRuntime = null;

	@Override
	protected void onInit() throws Exception {
		if(this.getPSCodeList().getPSDataEntity() == null) {
			throw new Exception(String.format("未指定实体对象"));
		}
		super.onInit();
	}
	
	@Override
	public IDataEntityRuntime getDataEntityRuntime() {
		if(this.iDataEntityRuntime == null) {
			this.iDataEntityRuntime = this.getSystemRuntime().getDataEntityRuntime(this.getPSCodeList().getPSDataEntityMust().getId());
		}
		return this.iDataEntityRuntime;
	}
	
	public IDEMSLogicRuntime getDEMSLogicRuntime(boolean bTryMode) {
		if(this.iDEMSLogicRuntime == null) {
			IPSDEMSLogic iPSDEMSLogic = this.getPSCodeList().getPSDEMSLogic();
			if(iPSDEMSLogic!=null) {
				this.iDEMSLogicRuntime = (IDEMSLogicRuntime)this.getSystemRuntime().getDataEntityRuntime(this.getPSCodeList().getPSDataEntityMust().getId()).getDEMSLogicRuntime(iPSDEMSLogic);
			}
		}
		if(this.iDEMSLogicRuntime != null || bTryMode) {
			return this.iDEMSLogicRuntime;
		}
		
		throw new SystemRuntimeException(this.getSystemRuntimeBase(), this, String.format("未指定实体主状态逻辑"));
	}
	

	@Override
	public List<IPSCodeItem> getPSCodeItems(Object dataOrKey) {
		try {
			IEntity iEntity = getEntity(dataOrKey);
			IDEMSLogicRuntime iDEMSLogicRuntime = (iEntity!=null)?this.getDEMSLogicRuntime(iEntity):null;
			if(iDEMSLogicRuntime != null) {
				java.util.List<IPSCodeItem> psCodeItemList = new ArrayList<IPSCodeItem>();
				List<IPSDEMSLogicNode> nextPSDEMSLogicNodeList = iDEMSLogicRuntime.getNextPSDEMSLogicNodes(iEntity);
				if(!ObjectUtils.isEmpty(nextPSDEMSLogicNodeList)) {
					for(IPSDEMSLogicNode iPSDEMSLogicNode : nextPSDEMSLogicNodeList) {
						IPSCodeItem iPSCodeItem = getPSCodeItem(iPSDEMSLogicNode, false);
						psCodeItemList.add(iPSCodeItem);
					}
				}
				//输出禁用项
				List<IPSDEMSLogicNode> psDEMSLogicNodeList = iDEMSLogicRuntime.getPSDEMSLogic().getPSDEMSLogicNodes();
				if(!ObjectUtils.isEmpty(psDEMSLogicNodeList)) {
					for(IPSDEMSLogicNode iPSDEMSLogicNode : psDEMSLogicNodeList) {
						if(nextPSDEMSLogicNodeList!=null) {
							if(nextPSDEMSLogicNodeList.contains(iPSDEMSLogicNode)) {
								continue;
							}
						}
						IPSCodeItem iPSCodeItem = getPSCodeItem(iPSDEMSLogicNode, true);
						psCodeItemList.add(iPSCodeItem);
					}
				}
				
				return psCodeItemList;
			}
		}
		catch (Throwable ex) {
			throw new SystemRuntimeException(this.getSystemRuntimeBase(), this, String.format("获取代码项发生异常，%1$s", ex.getMessage()), ex);
		}
		
		return super.getPSCodeItems(dataOrKey);
	}
	
	protected IDEMSLogicRuntime getDEMSLogicRuntime(IEntity iEntity) throws Throwable {
		IDEMSLogicRuntime iDEMSLogicRuntime = this.getDataEntityRuntime().getDEMSLogicRuntime(iEntity, true);
		if(iDEMSLogicRuntime != null) {
			return iDEMSLogicRuntime;
		}
		return getDEMSLogicRuntime(true);
	}
	
	
	protected IPSCodeItem getPSCodeItem(IPSDEMSLogicNode iPSDEMSLogicNode, boolean bDisabled) {
		//构建代码项
		String strValue = StringUtils.hasLength(iPSDEMSLogicNode.getStateValue())?iPSDEMSLogicNode.getStateValue():iPSDEMSLogicNode.getCodeName();
		
		ObjectNode objNode = JsonUtils.createObjectNode();
		objNode.put(PSCodeItemImpl.ATTR_GETCODENAME, iPSDEMSLogicNode.getCodeName());
		objNode.put(PSCodeItemImpl.ATTR_GETNAME,  iPSDEMSLogicNode.getName());
		objNode.put(PSCodeItemImpl.ATTR_GETVALUE,  strValue);
		objNode.put(PSCodeItemImpl.ATTR_GETTEXT,  iPSDEMSLogicNode.getName());
		
		if(StringUtils.hasLength(iPSDEMSLogicNode.getBKColor())) {
			objNode.put(PSCodeItemImpl.ATTR_GETBKCOLOR,  iPSDEMSLogicNode.getBKColor());
		}
		if(StringUtils.hasLength(iPSDEMSLogicNode.getColor())) {
			objNode.put(PSCodeItemImpl.ATTR_GETCOLOR,  iPSDEMSLogicNode.getColor());
		}
		if(StringUtils.hasLength(iPSDEMSLogicNode.getCssClass())) {
			objNode.put(PSCodeItemImpl.ATTR_GETTEXTCLS,  iPSDEMSLogicNode.getCssClass());
		}
		if(StringUtils.hasLength(iPSDEMSLogicNode.getMemo())) {
			objNode.put(PSCodeItemImpl.ATTR_GETTOOLTIP,  iPSDEMSLogicNode.getMemo());
		}
		
		if(iPSDEMSLogicNode.isDefaultMode()) {
			objNode.put(PSCodeItemImpl.ATTR_ISDEFAULT, true);
		}
		
		if(bDisabled) {
			objNode.put(PSCodeItemImpl.ATTR_ISDISABLESELECT, bDisabled);
		}
		
		
		return this.getSystemRuntimeBaseContext().getPSSystemService().createAndInitPSModelObject((IPSModelObjectRuntime)this.getPSCodeList(), 
				IPSCodeItem.class, objNode);
	}
	
	
	protected IEntity getEntity(Object keyOrData) throws Throwable {
		if(keyOrData instanceof IEntity) {
			return (IEntity)keyOrData;
		}
		if(keyOrData instanceof Map) {
			return this.getDataEntityRuntime().createEntity((Map)keyOrData, false);
		}
		
		
		Object objKeyValue = DataTypeUtils.asSimple(keyOrData);
		IEntityDTO iEntityDTO = this.getDataEntityRuntime().createEntity();
		iEntityDTO.set( this.getDataEntityRuntime().getKeyPSDEField().getLowerCaseName(), objKeyValue);
		return iEntityDTO;
	}
}
