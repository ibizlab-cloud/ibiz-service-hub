package net.ibizsys.central.dataentity.logic;

import java.util.List;
import java.util.Map;

import org.springframework.util.Assert;
import org.springframework.util.ObjectUtils;
import org.springframework.util.StringUtils;

import net.ibizsys.central.dataentity.ds.DEDQJoinTypes;
import net.ibizsys.central.util.IEntityDTO;
import net.ibizsys.model.dataentity.der.IPSDER1N;
import net.ibizsys.model.dataentity.der.IPSDERBase;
import net.ibizsys.model.dataentity.der.IPSDERCustom;
import net.ibizsys.model.dataentity.ds.IPSDEDQCondition;
import net.ibizsys.model.dataentity.ds.IPSDEDQFieldCondition;
import net.ibizsys.model.dataentity.ds.IPSDEDQGroupCondition;
import net.ibizsys.model.dataentity.ds.IPSDEDQJoin;
import net.ibizsys.model.dataentity.service.IPSDEMethodDTOField;
import net.ibizsys.runtime.util.Conditions;
import net.ibizsys.runtime.util.DataTypeUtils;
import net.ibizsys.runtime.util.IEntity;

/**
 * 过滤参数节点运行时基类
 * @author lionlau
 *
 */
public abstract class DELogicFilterParamNodeRuntimeBase extends DELogicNodeRuntimeBase{

	private static final org.apache.commons.logging.Log log = org.apache.commons.logging.LogFactory.getLog(DELogicFilterParamNodeRuntimeBase.class);
	
	protected boolean testPSDEDQJoin(IDELogicRuntimeContext iDELogicRuntimeContext, Object data, IPSDEDQJoin iPSDEDQJoin) throws Exception{
		Assert.notNull(data, String.format("传入数据无效"));
		Assert.notNull(iPSDEDQJoin, String.format("传入数据查询连接无效"));
		
		if(iPSDEDQJoin.getPSDEDQGroupCondition() != null) {
			if(!testPSDEDQCondition(data, iPSDEDQJoin.getPSDEDQGroupCondition())) {
				return false;
			}
		}
		
		List<IPSDEDQJoin> psDEDQJoinList = iPSDEDQJoin.getChildPSDEDQJoins();
		if(psDEDQJoinList != null) {
			for(IPSDEDQJoin childPSDEDQJoin : psDEDQJoinList) {
				String strJoinType = childPSDEDQJoin.getJoinType();
				if(DEDQJoinTypes.TYPE_1N.equals(strJoinType)
						|| DEDQJoinTypes.TYPE_1NNOT.equals(strJoinType)) {
					boolean bNot = false;
					if(DEDQJoinTypes.TYPE_1NNOT.equals(strJoinType)) {
						bNot = true;
					}
					
					String strFieldCodeName = null;
					
					IPSDERBase iPSDERBase = childPSDEDQJoin.getJoinPSDERMust();
					if(data instanceof IEntityDTO) {
						IEntityDTO iEntityDTO = (IEntityDTO)data;
						if(iEntityDTO.getDEMethodDTORuntime() != null) {
							IPSDEMethodDTOField iPSDEMethodDTOField = iEntityDTO.getDEMethodDTORuntime().getPSDEMethodDTOFieldByDER(iPSDERBase.getId(), true);
							if(iPSDEMethodDTOField != null) {
								strFieldCodeName = iPSDEMethodDTOField.getName();
							}
						}
					}
					if(!StringUtils.hasLength(strFieldCodeName)) {
						if(iPSDERBase instanceof IPSDER1N) {
							strFieldCodeName = ((IPSDER1N)iPSDERBase).getMinorCodeName();
						}
						else
							if(iPSDERBase instanceof IPSDERCustom) {
								strFieldCodeName = ((IPSDERCustom)iPSDERBase).getMinorCodeName();
							}
					}
					
					if(!StringUtils.hasLength(strFieldCodeName)) {
						throw new Exception(String.format("无法识别的查询连接[%1$s][%2$s]", strJoinType, iPSDERBase.getDERType()));
					}
					
					
					Object childItem = null;
					 
					if(data instanceof IEntity) {
						IEntity iEntity = (IEntity)data;
						childItem = iEntity.get(strFieldCodeName.toLowerCase());
					}
					else
						if(data instanceof Map) {
							Map map = (Map)data;
							childItem = map.get(strFieldCodeName.toLowerCase());
						}
						else
							throw new Exception(String.format("数据对象[%1$s]类型不正确", data));
					
					List childItemList = null;
					if(childItem instanceof List) {
						childItemList = (List)childItem;
					}
					else
						if(childItem!=null) {
							throw new Exception(String.format("属性[%1$s]类型不正确", strFieldCodeName));
						}
					
					if(ObjectUtils.isEmpty(childItemList)) {
						if(!bNot) {
							return false;
						}
						continue;
					}
					
					boolean bItemOk = false;
					for(Object childData : childItemList) {
						boolean bRet = this.testPSDEDQJoin(iDELogicRuntimeContext, childData, childPSDEDQJoin);
						if(bRet && !bNot) {
							bItemOk = true;
							break;
						}
						if(!bRet && bNot) {
							bItemOk = true;
							break;
						}
					}
					if(!bItemOk) {
						return false;
					}
				}
			}
		}
		
		return true;
	}
	
	protected boolean testPSDEDQCondition(Object data, IPSDEDQCondition iPSDEDQCondition) throws Exception {
		
		if(iPSDEDQCondition instanceof IPSDEDQGroupCondition) {
			IPSDEDQGroupCondition iPSDEDQGroupCondition = (IPSDEDQGroupCondition)iPSDEDQCondition;
			boolean bRet = true;
			if(iPSDEDQGroupCondition.getCondOp().equals(Conditions.AND)) {
				if(iPSDEDQGroupCondition.getPSDEDQConditions() != null && iPSDEDQGroupCondition.getPSDEDQConditions().size()>0) {
					bRet = true;
					for(IPSDEDQCondition childPSDEDQCondition : iPSDEDQGroupCondition.getPSDEDQConditions()) {
						if(!testPSDEDQCondition(data, childPSDEDQCondition)) {
							bRet = false;
							break;
						}
					}
				}
			}
			else
				if(iPSDEDQGroupCondition.getCondOp().equals(Conditions.OR)) {
					if(iPSDEDQGroupCondition.getPSDEDQConditions() != null && iPSDEDQGroupCondition.getPSDEDQConditions().size()>0) {
						bRet = false;
						for(IPSDEDQCondition childPSDEDQCondition : iPSDEDQGroupCondition.getPSDEDQConditions()) {
							if(testPSDEDQCondition(data, childPSDEDQCondition)) {
								bRet = true;
								break;
							}
						}
					}
				}
			if(iPSDEDQGroupCondition.isNotMode()) {
				bRet = !bRet;
			}
			return bRet;
		}
		if(iPSDEDQCondition instanceof IPSDEDQFieldCondition) {
			IPSDEDQFieldCondition iPSDEDQFieldCondition = (IPSDEDQFieldCondition)iPSDEDQCondition;
			
			String strDstFieldName = iPSDEDQFieldCondition.getPSDEFieldMust().getLowerCaseName();
//			if(StringUtils.isEmpty(strDstFieldName)) {
//				throw new DataEntityRuntimeException(this.getDataEntityRuntimeBase(), this, String.format("连接条件[%1$s]指定目标参数属性无效", iPSDEDQCondition.getName()));
//			}
			
			Object objValue= null;
			 
			if(data instanceof IEntity) {
				IEntity iEntity = (IEntity)data;
				objValue = iEntity.get(strDstFieldName.toLowerCase());
			}
			else
				if(data instanceof Map) {
					Map map = (Map)data;
					objValue = map.get(strDstFieldName.toLowerCase());
				}
				else
					throw new Exception(String.format("数据对象[%1$s]类型不正确", data));
			
			if(StringUtils.hasLength(iPSDEDQFieldCondition.getValueFunc())) {
				objValue = calcValueFunc(objValue, iPSDEDQFieldCondition.getValueFunc());
			}
			Object dstValue = iPSDEDQFieldCondition.getCondValue();
			if(StringUtils.hasLength(iPSDEDQFieldCondition.getPSVARTypeId())) {
				dstValue = calcValueType(dstValue, iPSDEDQFieldCondition.getPSVARTypeId());
			}
			return testValueCond(objValue, iPSDEDQFieldCondition.getCondOp(), dstValue);
		}
		
		throw new Exception(String.format("无法识别连接条件[%1$s][%2$s]", iPSDEDQCondition.getName(), iPSDEDQCondition.getCondType()));
	}
	
	protected Object calcValueFunc(Object objValue, String strFuncName)throws Exception{
		throw new Exception(String.format("无法识别值处理方法[%1$s]", strFuncName));
	}
	
	protected Object calcValueType(Object objValue, String strVarType)throws Exception{
		throw new Exception(String.format("无法识别值变量类型[%1$s]", strVarType));
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
	
	
}
