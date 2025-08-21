package net.ibizsys.central.plugin.util.dataentity;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.util.ObjectUtils;

import net.ibizsys.central.cloud.core.dataentity.DataEntityRuntime;
import net.ibizsys.central.dataentity.IDataEntityInheritLogic;
import net.ibizsys.central.dataentity.IDataEntityRuntime;
import net.ibizsys.central.dataentity.IDataEntityRuntimeContext;
import net.ibizsys.central.dataentity.der.IDER1NRuntimeBase;
import net.ibizsys.central.dataentity.der.IDERMultiInheritRuntimeBase;
import net.ibizsys.central.dataentity.der.IDERRuntimeBase;
import net.ibizsys.central.util.IEntityDTO;
import net.ibizsys.central.util.ISearchContextDTO;
import net.ibizsys.model.IPSModelObject;
import net.ibizsys.model.PSModelEnums.DEActionLogicAttachMode;
import net.ibizsys.model.PSModelEnums.DEActionMode;
import net.ibizsys.model.PSModelEnums.DER1NMasterRS;
import net.ibizsys.model.PSModelEnums.DEVirtualMode;
import net.ibizsys.model.dataentity.action.IPSDEAction;
import net.ibizsys.model.dataentity.ds.IPSDEDataSet;
import net.ibizsys.model.dataentity.defield.IPSDEField;
import net.ibizsys.model.dataentity.defield.IPSLinkDEField;
import net.ibizsys.model.dataentity.der.IPSDER1N;
import net.ibizsys.model.dataentity.der.IPSDER1NBase;
import net.ibizsys.model.dataentity.der.IPSDERBase;
import net.ibizsys.model.dataentity.der.IPSDERMultiInherit;
import net.ibizsys.runtime.dataentity.action.CheckKeyStates;
import net.ibizsys.runtime.util.ActionSession;
import net.ibizsys.runtime.util.ActionSessionManager;

public abstract class InheritLogicDataEntityRuntimeBase extends DataEntityRuntime implements IDataEntityInheritLogic {

	private static final org.apache.commons.logging.Log log = org.apache.commons.logging.LogFactory.getLog(InheritLogicDataEntityRuntimeBase.class);
	
	/**
	 * 子实体名称
	 */
	public final static String ENTITYFIELD_CHILDDENAME = "srfchilddename";
	
	/**
	 * 子实体名称
	 */
	public final static String ENTITYFIELD_CHILDDEUNIQUEID = "srfchilddeuniqueid";
	
	/**
	 * 子实体键值
	 */
	public final static String ENTITYFIELD_CHILDKEY = "srfchildkey";
	

	protected boolean isInheritPSDEFieldOnly() {
		return true;
	}
	
	
	@Override
	protected void onInit() throws Exception {
		
		super.onInit();
		
		List<IPSDERBase> psDERBaseList = this.getPSDERBases();
		if(!ObjectUtils.isEmpty(psDERBaseList)) {
			if(this.getVirtualMode() == DEVirtualMode.MIXMINHERITMERGE.value) {
				for(IPSDERBase iPSDERBase : psDERBaseList) {
					if(!(iPSDERBase instanceof IPSDERMultiInherit)){
						continue;
					}
					
					IPSDERMultiInherit iPSDERMultiInherit = (IPSDERMultiInherit)iPSDERBase;
					IDataEntityRuntime iDataEntityRuntime = this.getSystemRuntime().getDataEntityRuntime(iPSDERMultiInherit.getMajorPSDataEntityMust().getId(), false);
					if(iDataEntityRuntime instanceof IDataEntityInheritLogic) {
						this.registerDataEntityInheritLogic((IDataEntityInheritLogic)iDataEntityRuntime);
					}
					continue;
				}
			}
			
			
			for(IPSDERBase iPSDERBase : psDERBaseList) {
				if(!(iPSDERBase instanceof IPSDER1N)){
					continue;
				}
				
				IPSDER1N iPSDER1N = (IPSDER1N)iPSDERBase;
				if((iPSDER1N.getMasterRS() & DER1NMasterRS.INHERIT.value) == DER1NMasterRS.INHERIT.value) {
					IDataEntityRuntime iDataEntityRuntime = this.getSystemRuntime().getDataEntityRuntime(iPSDER1N.getMajorPSDataEntityMust().getId(), false);
					if(iDataEntityRuntime instanceof IDataEntityInheritLogic) {
						this.registerDataEntityInheritLogic((IDataEntityInheritLogic)iDataEntityRuntime);
					}
					continue;
				}
				
				continue;
			}
		}
	}
	
	protected IPSDERBase getInheritPSDER(IDataEntityRuntimeContext iDataEntityRuntimeContext, boolean bTryMode) throws Exception {
		
		ActionSession actionSession = ActionSessionManager.getCurrentSessionMust();
		String strTag = String.format("__getInheritPSDER__%1$s", iDataEntityRuntimeContext.getDataEntityRuntime().getId());
		Object value = actionSession.getActionParam(strTag);
		if(value == null) {
			value = doGetInheritPSDER(iDataEntityRuntimeContext, bTryMode);
			if(value != null) {
				actionSession.setActionParam(strTag, value);
			}
		}
		
		return (IPSDERBase)value;
	}
	
	protected IPSDERBase doGetInheritPSDER(IDataEntityRuntimeContext iDataEntityRuntimeContext, boolean bTryMode) throws Exception {
		
		List<IDERRuntimeBase> derRuntimeBaseList = this.getDERRuntimeBases();
		if(!ObjectUtils.isEmpty(derRuntimeBaseList)) {
			if(iDataEntityRuntimeContext.getDataEntityRuntime().getVirtualMode() == DEVirtualMode.MIXMINHERITMERGE.value) {
				for(IDERRuntimeBase iDERRuntimeBase : derRuntimeBaseList) {
					if(!(iDERRuntimeBase instanceof IDERMultiInheritRuntimeBase)){
						continue;
					}
					
					if(!iDERRuntimeBase.getPSDER().getMinorPSDataEntityMust().getId().equals(iDataEntityRuntimeContext.getDataEntityRuntime().getId())) {
						continue;
					}
					
					return iDERRuntimeBase.getPSDER();
				}
			}
			
			
			
			for(IDERRuntimeBase iDERRuntimeBase : derRuntimeBaseList) {
				if(!(iDERRuntimeBase instanceof IDER1NRuntimeBase)){
					continue;
				}
				
				IPSDER1N iPSDER1N = (IPSDER1N)iDERRuntimeBase.getPSDER();
				if(!iPSDER1N.getMinorPSDataEntityMust().getId().equals(iDataEntityRuntimeContext.getDataEntityRuntime().getId())) {
					continue;
				}
				
				if((iPSDER1N.getMasterRS() & DER1NMasterRS.INHERIT.value) != DER1NMasterRS.INHERIT.value) {
					continue;
				}
				
				return iPSDER1N;
			}
		}
		
		
		List<IPSDERBase> psDERBaseList = this.getPSDataEntity().getMajorPSDERs();
		if(!ObjectUtils.isEmpty(psDERBaseList)) {
			
			if(iDataEntityRuntimeContext.getDataEntityRuntime().getVirtualMode() == DEVirtualMode.MIXMINHERITMERGE.value) {
				for(IPSDERBase iPSDERBase : psDERBaseList) {
					if(!(iPSDERBase instanceof IPSDERMultiInherit)){
						continue;
					}
					
					if(!iPSDERBase.getMinorPSDataEntityMust().getId().equals(iDataEntityRuntimeContext.getDataEntityRuntime().getId())) {
						continue;
					}
					
					return iPSDERBase;
				}
			}
			
			for(IPSDERBase iPSDERBase : psDERBaseList) {
				if(!(iPSDERBase instanceof IPSDER1N)){
					continue;
				}
				
				IPSDER1N iPSDER1N = (IPSDER1N)iPSDERBase;
				if(!iPSDERBase.getMinorPSDataEntityMust().getId().equals(iDataEntityRuntimeContext.getDataEntityRuntime().getId())) {
					continue;
				}
				
				if((iPSDER1N.getMasterRS() & DER1NMasterRS.INHERIT.value) != DER1NMasterRS.INHERIT.value) {
					continue;
				}
				
				return iPSDER1N;
			}
		}
		
		if(bTryMode) {
			return null;
		}
		
		throw new Exception(String.format("无法获取实体[%1$s]到当前实体的继承关系", iDataEntityRuntimeContext.getDataEntityRuntime().getName()));
	}
	
	protected IEntityDTO toParentEntity(IDataEntityRuntimeContext iDataEntityRuntimeContext, IPSDERBase iPSDERBase, IEntityDTO iEntityDTO, IPSModelObject iPSModelObject) throws Exception {
		IEntityDTO current = null;
		if(iPSDERBase instanceof IPSDER1NBase) {
			current = this.createEntity();
			if(isInheritPSDEFieldOnly()) {
				List<IPSDEField> psDEFieldList = iDataEntityRuntimeContext.getDataEntityRuntime().getPSDEFields();
				if(!ObjectUtils.isEmpty(psDEFieldList)) {
					for(IPSDEField iPSDEField : psDEFieldList) {
						if(!(iPSDEField instanceof IPSLinkDEField)){
							continue;
						}
						
						IPSLinkDEField iPSLinkDEField = (IPSLinkDEField)iPSDEField;
						if(!iPSDERBase.getId().equals(iPSLinkDEField.getPSDERMust().getId())) {
							continue;
						}
						
						if(!iEntityDTO.contains(iPSLinkDEField.getLowerCaseName()) ) {
							continue;
						}
						
						current.set(iPSLinkDEField.getRelatedPSDEFieldMust().getLowerCaseName(), iEntityDTO.get(iPSLinkDEField.getLowerCaseName()));
					}
				}
			}
			else {
				List<IPSDEField> psDEFieldList = this.getPSDEFields();
				if(!ObjectUtils.isEmpty(psDEFieldList)) {
					for(IPSDEField iPSDEField : psDEFieldList) {
						
						if(iPSDEField.isKeyDEField()) {
							continue;
						}
						
						if(!iEntityDTO.contains(iPSDEField.getLowerCaseName()) ) {
							continue;
						}
						
						current.set(iPSDEField.getLowerCaseName(), iEntityDTO.get(iPSDEField.getLowerCaseName()));
					}
				}
			}
			current.set(this.getKeyPSDEField().getLowerCaseName(), iEntityDTO.get(((IPSDER1NBase)iPSDERBase).getPickupPSDEFieldMust().getLowerCaseName()));
		}
		else {
			current = iEntityDTO;
			current.set(this.getKeyPSDEField().getLowerCaseName(), iEntityDTO.get(iDataEntityRuntimeContext.getDataEntityRuntime().getKeyPSDEField().getLowerCaseName()));
		}
		
		current.set(ENTITYFIELD_CHILDDENAME, iDataEntityRuntimeContext.getDataEntityRuntime().getName());
		current.set(ENTITYFIELD_CHILDDEUNIQUEID, iDataEntityRuntimeContext.getDataEntityRuntime().getFullUniqueTag());
		current.set(ENTITYFIELD_CHILDKEY, iEntityDTO.get(iDataEntityRuntimeContext.getDataEntityRuntime().getKeyPSDEField().getLowerCaseName()));
		
		return current;
	}
	
	protected void fillChildEntity(IDataEntityRuntimeContext iDataEntityRuntimeContext, IPSDERBase iPSDERBase, IEntityDTO iEntityDTO, IEntityDTO current, IPSModelObject iPSModelObject) throws Exception {

		if(iPSDERBase instanceof IPSDER1NBase) {
			if(isInheritPSDEFieldOnly()) {
				List<IPSDEField> psDEFieldList = iDataEntityRuntimeContext.getDataEntityRuntime().getPSDEFields();
				if(!ObjectUtils.isEmpty(psDEFieldList)) {
					for(IPSDEField iPSDEField : psDEFieldList) {
						if(!(iPSDEField instanceof IPSLinkDEField)){
							continue;
						}
						
						IPSLinkDEField iPSLinkDEField = (IPSLinkDEField)iPSDEField;
						if(!iPSDERBase.getId().equals(iPSLinkDEField.getPSDERMust().getId())) {
							continue;
						}
						
						if(!current.contains(iPSLinkDEField.getRelatedPSDEFieldMust().getLowerCaseName()) ) {
							continue;
						}
						
						iEntityDTO.set(iPSLinkDEField.getLowerCaseName(), current.get(iPSLinkDEField.getRelatedPSDEFieldMust().getLowerCaseName()));
					}
				}
				
			}
			else {
				List<IPSDEField> psDEFieldList = this.getPSDEFields();
				if(!ObjectUtils.isEmpty(psDEFieldList)) {
					for(IPSDEField iPSDEField : psDEFieldList) {
						
						if(iPSDEField.isKeyDEField()) {
							continue;
						}
						
						if(!current.contains(iPSDEField.getLowerCaseName()) ) {
							continue;
						}
						
						iEntityDTO.set(iPSDEField.getLowerCaseName(), current.get(iPSDEField.getLowerCaseName()));
					}
				}
			}
			Object key = current.get(this.getKeyPSDEField().getLowerCaseName());
			if(!ObjectUtils.isEmpty(key)) {
				iEntityDTO.set(((IPSDER1NBase)iPSDERBase).getPickupPSDEFieldMust().getLowerCaseName(), key);
			}
		}
		else {
			
		}

		iEntityDTO.reset(ENTITYFIELD_CHILDDENAME);
		iEntityDTO.reset(ENTITYFIELD_CHILDDEUNIQUEID);
		iEntityDTO.reset(ENTITYFIELD_CHILDKEY);
	}
	
	@Override
	public Object executeActionLogics(IDataEntityRuntimeContext iDataEntityRuntimeContext, Object[] args, Object ret, IPSDEAction iPSDEAction, String strAttachMode) throws Throwable {
		if(strAttachMode.equals(DEActionLogicAttachMode.PREPARE.value)) {
			String strActionMode = iPSDEAction.getActionMode();
			if(DEActionMode.GETDRAFT.value.equals(strActionMode)) {
				IPSDERBase iPSDERBase = this.getInheritPSDER(iDataEntityRuntimeContext, true);
				if(iPSDERBase == null) {
					return ret;
				}
				IEntityDTO current = this.toParentEntity(iDataEntityRuntimeContext, iPSDERBase, (IEntityDTO)args[0], iPSDEAction);
				if(current == null) {
					return ret;
				}
				
				IEntityDTO current2 = this.getDraft(current);
				if(current2 != null) {
					current = current2;
				}
				//回填
				this.fillChildEntity(iDataEntityRuntimeContext, iPSDERBase, (IEntityDTO)args[0], current, iPSDEAction);
				return ret;
			}
			
			if(DEActionMode.CREATE.value.equals(strActionMode)) {
				IPSDERBase iPSDERBase = this.getInheritPSDER(iDataEntityRuntimeContext, true);
				if(iPSDERBase == null) {
					return ret;
				}

				IEntityDTO current = this.toParentEntity(iDataEntityRuntimeContext, iPSDERBase, (IEntityDTO)args[0], iPSDEAction);
				//判断建立或更新模式
				 if(iPSDERBase instanceof IPSDER1NBase && this.checkKeyState(current) == CheckKeyStates.EXIST) {
					 this.update(current);
				 }else {
					 this.create(current);
				 }
				
				//回填
				this.fillChildEntity(iDataEntityRuntimeContext, iPSDERBase, (IEntityDTO)args[0], current, iPSDEAction);
				return ret;
			}
		}
		
		IPSDEAction currentPSDEAction = this.getPSDEAction(iPSDEAction.getName());
		if(currentPSDEAction != null) {
			if(this.isEnableActionLogic(currentPSDEAction, strAttachMode)) {
				IPSDERBase iPSDERBase = this.getInheritPSDER(iDataEntityRuntimeContext, true);
				if(iPSDERBase instanceof IPSDERMultiInherit) {
					Object[] currentArgs =  args;
					Object currentRet = ret;
					if(args[0] instanceof IEntityDTO) {
						IEntityDTO current = this.toParentEntity(iDataEntityRuntimeContext, iPSDERBase, (IEntityDTO)args[0], iPSDEAction);
						currentArgs = new Object[]{current};
					}
					if(ret instanceof IEntityDTO) {
						currentRet = this.toParentEntity(iDataEntityRuntimeContext, iPSDERBase, (IEntityDTO)ret, iPSDEAction);
					}
					currentRet = this.executeActionLogics(currentArgs, currentRet, currentPSDEAction, strAttachMode, null, null, null);

					//回填
					if(args[0] instanceof IEntityDTO && currentArgs[0] instanceof IEntityDTO) {
						this.fillChildEntity(iDataEntityRuntimeContext, iPSDERBase, (IEntityDTO) args[0], (IEntityDTO) currentArgs[0], iPSDEAction);
					}
					if(ret instanceof IEntityDTO && currentRet instanceof IEntityDTO) {
						this.fillChildEntity(iDataEntityRuntimeContext, iPSDERBase, (IEntityDTO) ret, (IEntityDTO) currentRet, iPSDEAction);
					}
				}
			}
		}
		
		return ret;
	}

	@Override
	public void translateEntityNestedDERsAfterProceed(IDataEntityRuntimeContext iDataEntityRuntimeContext, IEntityDTO iEntityDTO, String strActionName, IPSDEAction iPSDEAction) throws Throwable {
		IPSDERBase iPSDERBase = this.getInheritPSDER(iDataEntityRuntimeContext, true);
		if(iPSDERBase == null) {
			return;
		}
		
		IEntityDTO current = this.toParentEntity(iDataEntityRuntimeContext, iPSDERBase, iEntityDTO, iPSDEAction);
		if(current == null) {
			return;
		}
		
		this.translateEntityNestedDERsAfterProceed(current, strActionName, iPSDEAction, this.getPSDataEntity(), null, null);
		this.fillChildEntity(iDataEntityRuntimeContext, iPSDERBase, iEntityDTO, current, iPSDEAction);
	}
	
	@Override
	public void translateEntityAfterProceed(IDataEntityRuntimeContext iDataEntityRuntimeContext, IEntityDTO iEntityDTO, String strActionName, IPSDEAction iPSDEAction) throws Throwable {
		IPSDERBase iPSDERBase = this.getInheritPSDER(iDataEntityRuntimeContext, true);
		if(iPSDERBase == null) {
			return;
		}
		
		IEntityDTO current = this.toParentEntity(iDataEntityRuntimeContext, iPSDERBase, iEntityDTO, iPSDEAction);
		if(current == null) {
			return;
		}
		
		this.translateEntityAfterProceed(null, current, strActionName, iPSDEAction, this.getPSDataEntity(), null, null);
		this.fillChildEntity(iDataEntityRuntimeContext, iPSDERBase, iEntityDTO, current, iPSDEAction);
	}

	@Override
	public void translateEntitiesAfterProceed(IDataEntityRuntimeContext iDataEntityRuntimeContext, ISearchContextDTO iSearchContextDTO, List<? extends IEntityDTO> entityDTOList, String strDataSetName, IPSDEDataSet iPSDEDataSet) throws Throwable {
		IPSDERBase iPSDERBase = this.getInheritPSDER(iDataEntityRuntimeContext, true);
		if(iPSDERBase == null) {
			return;
		}
		List<IEntityDTO> currentList = this.createEntityList();
		Map<Object,IEntityDTO> originMap = new HashMap<Object,IEntityDTO>();
		for(IEntityDTO origin : entityDTOList) {
			IEntityDTO current = this.toParentEntity(iDataEntityRuntimeContext, iPSDERBase, origin, iPSDEDataSet);
			if(current == null) {
				continue;
			}
			currentList.add(current);
			Object currentKey = current.get(this.getKeyPSDEField().getCodeName());
			if(currentKey != null){
				originMap.put(currentKey,origin);
			}
		}

		this.translateEntitiesAfterProceed(iSearchContextDTO,currentList, strDataSetName, iPSDEDataSet, this.getPSDataEntity(), null, null);

		if (iSearchContextDTO.isFillNestedFields()) {
			IPSDEDataSet parentDataSet =  this.getPSDEDataSet(iPSDEDataSet.getName());
			if(parentDataSet == null) {
				parentDataSet = this.getDefaultPSDEDataSet();
			}
			this.fillEntityDTONestedFields(currentList, parentDataSet);
		}

		for(IEntityDTO current : currentList){
			Object currentKey = current.get(this.getKeyPSDEField().getCodeName());
			if(currentKey != null) {
				IEntityDTO origin = originMap.get(current.get(this.getKeyPSDEField().getCodeName()));
				this.fillChildEntity(iDataEntityRuntimeContext, iPSDERBase, origin, current, iPSDEDataSet);
			}
		}
	}
	
//	@Override
//	public void fillEntityDefaultValues(IDataEntityRuntimeContext iDataEntityRuntimeContext, IEntityDTO iEntityDTO, String strActionName, IPSDEAction iPSDEAction) throws Throwable {
//		
//		String strActionMode = (iPSDEAction!=null)?iPSDEAction.getActionMode():strActionName;
//		if(DEActionMode.GETDRAFT.value.equals(strActionMode)) {
//			IEntityDTO current = this.toParentEntity(iDataEntityRuntimeContext, iEntityDTO, strActionName, iPSDEAction);
//			if(current == null) {
//				return;
//			}
//			
//			current = this.getDraft(current);
//			//回填
//			this.fillChildEntity(iDataEntityRuntimeContext, iEntityDTO, current, strActionName, iPSDEAction);
//			return;
//		}
//		
//		if(DEActionMode.CREATE.value.equals(strActionMode)) {
//			//建立模式
//			IEntityDTO current = this.toParentEntity(iDataEntityRuntimeContext, iEntityDTO, strActionName, iPSDEAction);
//			this.create(current);
//			
//			//回填
//			this.fillChildEntity(iDataEntityRuntimeContext, iEntityDTO, current, strActionName, iPSDEAction);
//			return;
//		}
//		
//		
//		
//		//IDataEntityInheritLogic.super.fillEntityDefaultValues(iDataEntityRuntimeContext, iEntityDTO, strActionName, iPSDEAction);
//		
//	}
//	
	@Override
	public void fillEntityFullInfo(IDataEntityRuntimeContext iDataEntityRuntimeContext, IEntityDTO iEntityDTO, String strActionName, IPSDEAction iPSDEAction) throws Throwable {
		
		//IDataEntityInheritLogic.super.fillEntityFullInfo(iDataEntityRuntimeContext, iEntityDTO, strActionName, iPSDEAction);
	}
	
	@Override
	public boolean isEnableAction(IDataEntityRuntimeContext iDataEntityRuntimeContext, String strActionName, IPSDEAction iPSDEAction, Object[] args) {
		return this.getPSDEAction(strActionName)!=null;
	}
	
	@Override
	public Object executeAction(IDataEntityRuntimeContext iDataEntityRuntimeContext, String strActionName, IPSDEAction iPSDEAction, Object[] args) throws Throwable {
		IPSDEAction realPSDEAction = this.getPSDEAction(strActionName);
		if(realPSDEAction == null) {
			throw new Exception(String.format("无法获取指定实体行为[%1$s]", strActionName));
		}
		
		return this.onExecuteAction(iDataEntityRuntimeContext, strActionName, realPSDEAction, args);
	}
	
	protected Object onExecuteAction(IDataEntityRuntimeContext iDataEntityRuntimeContext, String strActionName, IPSDEAction iPSDEAction, Object[] args) throws Throwable {
		return this.executeAction(strActionName, iPSDEAction, args);
	}
	
	
	
}
