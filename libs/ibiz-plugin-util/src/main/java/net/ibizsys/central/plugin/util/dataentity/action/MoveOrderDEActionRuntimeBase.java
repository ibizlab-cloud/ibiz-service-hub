package net.ibizsys.central.plugin.util.dataentity.action;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.springframework.util.ObjectUtils;
import org.springframework.util.StringUtils;

import net.ibizsys.central.util.IEntityDTO;
import net.ibizsys.central.util.ISearchContextDTO;
import net.ibizsys.central.util.SearchContextDTO;
import net.ibizsys.model.dataentity.action.IPSDEUserCustomAction;
import net.ibizsys.model.dataentity.defield.IPSDEField;
import net.ibizsys.model.dataentity.ds.IPSDEDataSet;
import net.ibizsys.runtime.dataentity.action.DEActionModes;

public abstract class MoveOrderDEActionRuntimeBase extends DEActionRuntimeBase {

	private static final org.apache.commons.logging.Log log = org.apache.commons.logging.LogFactory.getLog(MoveOrderDEActionRuntimeBase.class);
	
	@Override
	protected Object onExecute(IEntityDTO iEntityDTO) throws Throwable {
		
		IPSDEField orderValuePSDEField = this.getOrderValuePSDEField();
		if(orderValuePSDEField == null) {
			throw new Exception("未定义排序值属性");
		}
		
		IPSDEField keyPSDEField = this.getDataEntityRuntime().getKeyPSDEField();

		String strCurrentKey = iEntityDTO.getString(keyPSDEField.getLowerCaseName(), null);
		if(!StringUtils.hasLength(strCurrentKey)) {
			throw new Exception("未指定移动操作的数据");
		}
		
		String strTargetKey = iEntityDTO.getString(DEActionModes.PARAM_MOVEORDER_TARGETKEY, null);
		if(!StringUtils.hasLength(strTargetKey)) {
			throw new Exception("未指定移动操作的目标数据");
		}
		
		if(strCurrentKey.equals(strTargetKey)) {
			throw new Exception("指定移动操作的数据与目标数据不能一致");
		}
		
		String strMoveType = iEntityDTO.getString(DEActionModes.PARAM_MOVEORDER_MOVETYPE, null);
		if(!StringUtils.hasLength(strMoveType)) {
			throw new Exception("未指定移动操作的类型");
		}
		
		if(!DEActionModes.MOVETYPE_MOVEAFTER.equalsIgnoreCase(strMoveType)
				&& !DEActionModes.MOVETYPE_MOVEBEFORE.equalsIgnoreCase(strMoveType)
				&& !DEActionModes.MOVETYPE_SWITCHPOS.equalsIgnoreCase(strMoveType)){
			throw new Exception(String.format("无法识别的移动操作类型[%1$s]", strMoveType));
		}
	
		IPSDEDataSet iPSDEDataSet =	null;
		if(this.getPSDEAction() instanceof IPSDEUserCustomAction) {
			IPSDEUserCustomAction iPSDEUserCustomAction = (IPSDEUserCustomAction)this.getPSDEAction();
			 iPSDEDataSet =	iPSDEUserCustomAction.getPSDEDataSet();
		}
		if(iPSDEDataSet == null) {
			iPSDEDataSet = this.getOrderScopePSDEDataSet();
		}
		if(iPSDEDataSet == null) {
			throw new Exception("未指定移动操作的相关数据集");
		}
		
		ISearchContextDTO iSearchContextDTO = this.getDataEntityRuntime().createSearchContext();
		iSearchContextDTO.putAll(iEntityDTO.any());
		iSearchContextDTO.count(false).all();
		
		this.getDataEntityRuntime().setSearchSort(iSearchContextDTO, orderValuePSDEField, "ASC");
		
		//查出数据
		List<IEntityDTO> list = this.getDataEntityRuntime().selectDataSet(iPSDEDataSet, iSearchContextDTO);
		if(ObjectUtils.isEmpty(list) ) {
			throw new Exception("无法获取移动的数据集");
		}
		
		Map<String, Integer> map = new LinkedHashMap<String, Integer>();
		for(IEntityDTO item : list) {
			map.put(item.getString(keyPSDEField.getLowerCaseName(), null), item.getInteger(orderValuePSDEField.getLowerCaseName(), Integer.MAX_VALUE));
		}
		
		if(!map.containsKey(strCurrentKey)) {
			throw new Exception("未指定移动操作的数据");
		}
		
		if(!map.containsKey(strTargetKey)) {
			throw new Exception("未指定移动操作的目标数据");
		}
		
		List<String> keyList = new ArrayList<String>();
		keyList.addAll(map.keySet());
		
		int nTargetPos = keyList.indexOf(strTargetKey);
		int nCurrentPos = keyList.indexOf(strCurrentKey);
		
		List<IEntityDTO> changedList = new ArrayList<IEntityDTO>();
		
		if(DEActionModes.MOVETYPE_MOVEAFTER.equalsIgnoreCase(strMoveType)) {
			if(nTargetPos + 1 == nCurrentPos) {
				return changedList;
			}
			
			keyList.remove(strCurrentKey);
			nTargetPos = keyList.indexOf(strTargetKey);
			keyList.add(nTargetPos + 1, strCurrentKey);
		}
		else
			if(DEActionModes.MOVETYPE_MOVEBEFORE.equalsIgnoreCase(strMoveType)) {
				if(nTargetPos - 1 == nCurrentPos) {
					return changedList;
				}
				
				keyList.remove(strCurrentKey);
				nTargetPos = keyList.indexOf(strTargetKey);
				keyList.add(nTargetPos, strCurrentKey);
			}
			else
				if(DEActionModes.MOVETYPE_SWITCHPOS.equalsIgnoreCase(strMoveType)) {
					keyList.remove(strCurrentKey);
					keyList.remove(strTargetKey);
					if(nCurrentPos < nTargetPos) {
						//之前
						keyList.add(nCurrentPos, strTargetKey);
						keyList.add(nTargetPos, strCurrentKey);
					}
					else {
						keyList.add(nTargetPos, strCurrentKey);
						keyList.add(nCurrentPos, strTargetKey);
					}
				}
		
		//重新排序
		
		for(int i =0;i<keyList.size();i++) {
			String strKey = keyList.get(i);
			int nNewOrder = this.getOrderInitialValue(1) +  i * this.getOrderStepValue(1);
			int nLastOrder = map.get(strKey);
			if(nNewOrder == nLastOrder) {
				continue;
			}
			
			IEntityDTO item = this.getDataEntityRuntime().createEntity();
			item.set(keyPSDEField.getLowerCaseName(), strKey);
			item.set(orderValuePSDEField.getLowerCaseName(), nNewOrder);
			changedList.add(item);
		}
				
		if(!ObjectUtils.isEmpty(changedList)) {
			//执行批更新
			this.getDataEntityRuntime().rawUpdate(changedList, false);
//			for(IEntityDTO item : changedList) {
//				this.syncEntityAfterProceed(DEDataSyncEvents.UPDATE, item, null, DEActions.SYSUPDATE, null, null, null, null);
//			}
		}	
		
		if(changedList.size() > SearchContextDTO.getMaxSize() * 10) {
			return null;
		}
		
		return changedList;
	}
	
	protected IPSDEField getOrderValuePSDEField() {
		return this.getDataEntityRuntime().getOrderValuePSDEField();
	}
	
	protected IPSDEDataSet getOrderScopePSDEDataSet() {
		return this.getDataEntityRuntime().getOrderScopePSDEDataSet();
	}
	
	protected int getOrderInitialValue(int nDefaultVale) {
		return this.getDataEntityRuntime().getOrderInitialValue(nDefaultVale);
	}
	
	protected int getOrderStepValue(int nDefaultVale) {
		return this.getDataEntityRuntime().getOrderStepValue(nDefaultVale);
	}
}
