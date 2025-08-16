package net.ibizsys.central.dataentity.logic;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.util.ObjectUtils;
import org.springframework.util.StringUtils;

import net.ibizsys.central.dataentity.DataEntityModelRuntimeBase;
import net.ibizsys.model.IPSModelObject;
import net.ibizsys.model.PSModelEnums.DEFVRParamType;
import net.ibizsys.model.dataentity.defield.IPSDEField;
import net.ibizsys.model.dataentity.logic.IPSDEMSLogic;
import net.ibizsys.model.dataentity.logic.IPSDEMSLogicLink;
import net.ibizsys.model.dataentity.logic.IPSDEMSLogicLinkCond;
import net.ibizsys.model.dataentity.logic.IPSDEMSLogicLinkGroupCond;
import net.ibizsys.model.dataentity.logic.IPSDEMSLogicLinkSingleCond;
import net.ibizsys.model.dataentity.logic.IPSDEMSLogicNode;
import net.ibizsys.runtime.dataentity.DataEntityRuntimeException;
import net.ibizsys.runtime.dataentity.IDataEntityRuntimeBaseContext;
import net.ibizsys.runtime.util.Conditions;
import net.ibizsys.runtime.util.DataTypeUtils;
import net.ibizsys.runtime.util.IEntity;

public abstract class DEMSLogicRuntimeBase extends DataEntityModelRuntimeBase implements IDEMSLogicRuntime {

	private static final Log log = LogFactory.getLog(DEMSLogicRuntimeBase.class);

	private IPSDEMSLogic iPSDEMSLogic = null; 
	private int nDebugMode = DELogicDebugModes.NONE;
	private IDataEntityRuntimeBaseContext iDataEntityRuntimeBaseContext = null;
	private IPSDEField statePSDEField = null;
	private Map<String, IPSDEMSLogicNode> psDEMSLogicNodeMap = new LinkedHashMap<String, IPSDEMSLogicNode>();
	
	
	@Override
	public void init(IDataEntityRuntimeBaseContext iDataEntityRuntimeBaseContext, IPSDEMSLogic iPSDEMSLogic) throws Exception {
		
		this.setDataEntityRuntimeBase(iDataEntityRuntimeBaseContext.getDataEntityRuntime());
		this.iDataEntityRuntimeBaseContext = iDataEntityRuntimeBaseContext;
		this.iPSDEMSLogic = iPSDEMSLogic;
		//this.setDebugMode(this.getPSDEMSLogic().getDebugMode());
		this.onInit();
	}
	
	@Override
	protected void onInit() throws Exception {
		
		List<IPSDEField> mainStatePSDEFieldList = this.getDataEntityRuntime().getPSDataEntity().getMainStatePSDEFields();
		if(ObjectUtils.isEmpty(mainStatePSDEFieldList)) {
			throw new Exception("实体未定义主状态属性");
		}
		
		if(StringUtils.hasLength(this.getPSDEMSLogic().getLogicTag2())) {
			//取第三个属性
			if(this.getDataEntityRuntime().getPSDataEntity().getMainStatePSDEFields().size()<=2) {
				throw new Exception(String.format("实体未提供第三个主状态属性"));
			}
			this.statePSDEField = mainStatePSDEFieldList.get(2);
			
		}
		else
			if(StringUtils.hasLength(this.getPSDEMSLogic().getLogicTag())) {
				//取第三个属性
				if(this.getDataEntityRuntime().getPSDataEntity().getMainStatePSDEFields().size()<=1) {
					throw new Exception(String.format("实体未提供第二个主状态属性"));
				}
				this.statePSDEField = mainStatePSDEFieldList.get(1);
			}
			else {
				this.statePSDEField = mainStatePSDEFieldList.get(0);
			}
		
		java.util.List<IPSDEMSLogicNode> psDEMSLogicNodes = this.getPSDEMSLogic().getPSDEMSLogicNodes();
		if(!ObjectUtils.isEmpty(psDEMSLogicNodes)) {
			for(IPSDEMSLogicNode iPSDEMSLogicNode : psDEMSLogicNodes) {
				String strState = iPSDEMSLogicNode.getStateValue();
				if(!StringUtils.hasLength(strState)) {
					strState = iPSDEMSLogicNode.getCodeName();
				}
				
				if(!StringUtils.hasLength(strState)) {
					throw new Exception(String.format("状态节点[%1$s]未定义状态值", iPSDEMSLogicNode.getName()));
				}
				
				if(psDEMSLogicNodeMap.containsKey(strState)) {
					IPSDEMSLogicNode lastPSDEMSLogicNode = psDEMSLogicNodeMap.get(strState);
					throw new Exception(String.format("状态节点[%2$s]状态值[%1$s]已在状态节点[%3$s]定义", strState, iPSDEMSLogicNode.getName(), lastPSDEMSLogicNode.getName()));
				}
				
				psDEMSLogicNodeMap.put(strState, iPSDEMSLogicNode);
				if(iPSDEMSLogicNode.isDefaultMode()){
					if(psDEMSLogicNodeMap.containsKey("")) {
						throw new Exception(String.format("出现重复的默认状态节点[%1$s]", iPSDEMSLogicNode.getName()));
					}
					psDEMSLogicNodeMap.put("", iPSDEMSLogicNode);
				}
			}
		}
		
		super.onInit();
	}
	
	
	protected IDataEntityRuntimeBaseContext getDataEntityRuntimeContext() {
		return iDataEntityRuntimeBaseContext;
	}
	
	
	private DEMSLogicRuntimeBase getSelf() {
		return this;
	}
	
	protected IPSDEField getStatePSDEField() {
		return this.statePSDEField;
	}
	
	@Override
	public IPSDEMSLogic getPSDEMSLogic() {
		return this.iPSDEMSLogic;
	}
	
	@Override
	public IPSModelObject getPSModelObject() {
		return this.getPSDEMSLogic();
	}
	
	@Override
	public int getDebugMode() {
		return this.nDebugMode;
	}
	
	protected void setDebugMode(int nDebugMode) {
		this.nDebugMode = nDebugMode;
	}
	
	@Override
	public boolean isOutputDebugInfo() {
		return getDebugMode() == DELogicDebugModes.INFO;
	}

	@Override
	public List<IPSDEMSLogicNode> getNextPSDEMSLogicNodes(IEntity iEntity) {
		try {
			return this.onGetNextPSDEMSLogicNodes(iEntity);
		}
		catch (Throwable ex) {
			throw new DataEntityRuntimeException(this.getDataEntityRuntimeBase(), this, String.format("计算主状态逻辑下一步节点发生异常，%1$s", ex.getMessage()), ex);
		}
	}
	
	protected List<IPSDEMSLogicNode> onGetNextPSDEMSLogicNodes(IEntity iEntity) throws Throwable{
		
		List<IPSDEMSLogicNode> list = new ArrayList<IPSDEMSLogicNode>();
		
		String strState = DataTypeUtils.getStringValue(this.getDataEntityRuntime().getFieldValue(iEntity, this.getStatePSDEField()), "");
		IPSDEMSLogicNode iPSDEMSLogicNode = this.getPSDEMSLogicNodeByState(strState, false);
		if(!ObjectUtils.isEmpty(iPSDEMSLogicNode.getPSDEMSLogicLinks())) {
			for(IPSDEMSLogicLink iPSDEMSLogicLink : iPSDEMSLogicNode.getPSDEMSLogicLinks()) {
				//判断链接条件
				if(iPSDEMSLogicLink.getPSDEMSLogicLinkGroupCond()!=null) {
					try {
						if(!this.testPSDEMSLogicLinkCond(iEntity, iPSDEMSLogicLink.getPSDEMSLogicLinkGroupCond())) {
							continue;
						}
					}
					catch (Throwable ex) {
						throw new Exception(String.format("判断节点[%1$s]路由条件发生异常，%2$s", iPSDEMSLogicNode.getName(), ex.getMessage()), ex);
					}
				}
				
				list.add(iPSDEMSLogicLink.getDstPSDEMSLogicNodeMust());
			}
		}
		return list;
	}
	
	protected IPSDEMSLogicNode getPSDEMSLogicNodeByState(String strState, boolean bTryMode) throws Exception {
		IPSDEMSLogicNode iPSDEMSLogicNode = this.psDEMSLogicNodeMap.get(strState);
		if(iPSDEMSLogicNode != null || bTryMode) {
			return iPSDEMSLogicNode;
		}
		if(StringUtils.hasLength(strState)) {
			throw new Exception(String.format("无法获取指定值[%1$s]状态节点", strState));
		}
		else {
			throw new Exception(String.format("无法获取默认状态节点"));
		}
	}
	
	
	protected boolean testPSDEMSLogicLinkCond(IEntity iEntity, IPSDEMSLogicLinkCond iPSDEMSLogicLinkCond) throws Exception{
		if(iPSDEMSLogicLinkCond instanceof IPSDEMSLogicLinkGroupCond) {
			IPSDEMSLogicLinkGroupCond iPSDEMSLogicLinkGroupCond = (IPSDEMSLogicLinkGroupCond)iPSDEMSLogicLinkCond;
			boolean bRet = true;
			if(iPSDEMSLogicLinkGroupCond.getGroupOP().equals(Conditions.AND)) {
				if(iPSDEMSLogicLinkGroupCond.getPSDEMSLogicLinkConds() != null && iPSDEMSLogicLinkGroupCond.getPSDEMSLogicLinkConds().size()>0) {
					bRet = true;
					for(IPSDEMSLogicLinkCond childPSDEMSLogicLinkCond : iPSDEMSLogicLinkGroupCond.getPSDEMSLogicLinkConds()) {
						if(!testPSDEMSLogicLinkCond(iEntity, childPSDEMSLogicLinkCond)) {
							bRet = false;
							break;
						}
					}
				}
			}
			else
				if(iPSDEMSLogicLinkGroupCond.getGroupOP().equals(Conditions.OR)) {
					if(iPSDEMSLogicLinkGroupCond.getPSDEMSLogicLinkConds() != null && iPSDEMSLogicLinkGroupCond.getPSDEMSLogicLinkConds().size()>0) {
						bRet = false;
						for(IPSDEMSLogicLinkCond childPSDEMSLogicLinkCond : iPSDEMSLogicLinkGroupCond.getPSDEMSLogicLinkConds()) {
							if(testPSDEMSLogicLinkCond(iEntity, childPSDEMSLogicLinkCond)) {
								bRet = true;
								break;
							}
						}
					}
				}
				else
					throw new Exception(String.format("路由条件[%1$s]组逻辑操作[%2$s]无效", iPSDEMSLogicLinkCond.getName(), iPSDEMSLogicLinkGroupCond.getGroupOP()));
			
			if(iPSDEMSLogicLinkGroupCond.isNotMode()) {
				bRet = !bRet;
			}
			return bRet;
		}
		if(iPSDEMSLogicLinkCond instanceof IPSDEMSLogicLinkSingleCond) {
			IPSDEMSLogicLinkSingleCond iPSDEMSLogicLinkSingleCond = (IPSDEMSLogicLinkSingleCond)iPSDEMSLogicLinkCond;
			Object objValue = null;
			String strDstFieldName = iPSDEMSLogicLinkSingleCond.getDstFieldName();
			if(ObjectUtils.isEmpty(strDstFieldName)) {
				throw new Exception(String.format("单项条件[%1$s]未指定目标属性", iPSDEMSLogicLinkSingleCond.getName()));
			}
			objValue =  iEntity.get(strDstFieldName.toLowerCase());
			
			Object dstValue = iPSDEMSLogicLinkSingleCond.getParamValue();
			String strParamType = iPSDEMSLogicLinkSingleCond.getParamType();
			if(StringUtils.hasLength(strParamType)) {
				if(ObjectUtils.isEmpty(dstValue)) {
					throw new Exception(String.format("单项条件[%1$s]未指定参数项名称", iPSDEMSLogicLinkCond.getName()));
				}
				if(strParamType.equals(DEFVRParamType.ENTITYFIELD.value)) {
					//dstValue = iEntity.get(((String)dstValue).toLowerCase());
					dstValue =  iEntity.get( ((String)dstValue).toLowerCase());
				}
				else
					if(strParamType.equals(DEFVRParamType.CURTIME.value)) {
						dstValue = new java.sql.Timestamp(System.currentTimeMillis());
					}
					else
						throw new Exception(String.format("单项条件[%1$s]参数类型[%2$s]未支持", iPSDEMSLogicLinkCond.getName(), strParamType));
			}
			return testValueCond(objValue, iPSDEMSLogicLinkSingleCond.getCondOP(), dstValue);
		}
		
		throw new Exception(String.format("无法识别路由条件[%1$s][%2$s]", iPSDEMSLogicLinkCond.getName(), iPSDEMSLogicLinkCond.getLogicType()));
	}
	
	/**
	 * 测试条件是否成立
	 * 
	 * @param objSrcValue
	 * @param strOP
	 * @param strDstValue
	 * @return
	 * @throws Exception
	 */
	protected boolean testValueCond(Object objSrcValue, String strOP, Object objDstValue) throws Exception {
		return DataTypeUtils.testCond(objSrcValue, strOP, objDstValue);
	}
	
	/**
	 * 测试条件是否成立，等同testValueCond
	 * @param objSrcValue
	 * @param strOP
	 * @param objDstValue
	 * @return
	 * @throws Exception
	 */
	protected boolean test(Object objSrcValue, String strOP, Object objDstValue) throws Exception {
		return testValueCond(objSrcValue, strOP, objDstValue);
	}

	@Override
	public boolean canTransition(IEntity srcEntity, IEntity dstEntity, boolean tryMode) {
		try {
			return this.onCanTransition(srcEntity, dstEntity, tryMode);
		}
		catch (Throwable ex) {
			DataEntityRuntimeException.rethrow(this, ex);
			throw new DataEntityRuntimeException(this.getDataEntityRuntimeBase(), this, String.format("判断主状态逻辑路由发生异常，%1$s", ex.getMessage()), ex);
		}
	}
	
	
	protected boolean onCanTransition(IEntity srcEntity, IEntity dstEntity, boolean tryMode) throws Throwable{
		
		String strState = DataTypeUtils.getStringValue(this.getDataEntityRuntime().getFieldValue(dstEntity, this.getStatePSDEField()), "");
		IPSDEMSLogicNode iPSDEMSLogicNode = this.getPSDEMSLogicNodeByState(strState, false);
		
		List<IPSDEMSLogicNode> list = getNextPSDEMSLogicNodes(srcEntity);
		if(!ObjectUtils.isEmpty(list)) {
			for(IPSDEMSLogicNode dstPSDEMSLogicNode : list) {
				if(dstPSDEMSLogicNode.getId().equals(iPSDEMSLogicNode.getId())) {
					return true;
				}					
			}
		}
		
		if(tryMode) {
			return false;
		}
		
		String strSrcState = DataTypeUtils.getStringValue(this.getDataEntityRuntime().getFieldValue(srcEntity, this.getStatePSDEField()), "");
		IPSDEMSLogicNode srcPSDEMSLogicNode2 = this.getPSDEMSLogicNodeByState(strSrcState, false);
		
		throw new DataEntityRuntimeException(this.getDataEntityRuntimeBase(), this, String.format("状态[%1$s]无法迁移至[%2$s]", srcPSDEMSLogicNode2.getName(), iPSDEMSLogicNode.getName()));
	}
	
	
	
}
