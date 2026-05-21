package net.ibizsys.central.cloud.portal.ebsx.cloudutil;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Random;

import org.apache.commons.logging.LogFactory;
import org.springframework.data.domain.Page;
import org.springframework.util.ObjectUtils;
import org.springframework.util.StringUtils;

import net.ibizsys.central.cloud.core.security.EmployeeContext;
import net.ibizsys.central.cloud.core.security.IEmployeeContext;
import net.ibizsys.central.cloud.core.util.CloudCacheTagUtils;
import net.ibizsys.central.cloud.core.util.domain.PortalAsyncAction;
import net.ibizsys.central.cloud.core.util.domain.PortalAsyncActionType;
import net.ibizsys.central.cloud.portal.core.cloudutil.CloudPortalUtilRuntimeBase;
import net.ibizsys.central.cloud.saas.ebsx.EBSXSystemRuntime;
import net.ibizsys.central.cloud.saas.ebsx.spring.core.portal.dto.PTAsyncActionDTO;
import net.ibizsys.central.cloud.saas.ebsx.util.StaticDict.BackendActionState;
import net.ibizsys.central.util.ISearchContextDTO;
import net.ibizsys.central.util.SearchContextDTO;
import net.ibizsys.runtime.util.DataTypeUtils;
import net.ibizsys.runtime.util.UnicodeUtils;

public class EBSXCloudPortalUtilRuntime extends CloudPortalUtilRuntimeBase {

	private static final org.apache.commons.logging.Log log = LogFactory.getLog(EBSXCloudPortalUtilRuntime.class);
	
	public final static String[] UTF8MB4_FIELDS = new String[] {PTAsyncActionDTO.FIELD_ACTIONRESULT, PTAsyncActionDTO.FIELD_FULLRESULT, PTAsyncActionDTO.FIELD_STEPINFO, PTAsyncActionDTO.FIELD_FULLSTEPINFO};
	
	public final static String ACTIONTYPE_ASYNCCHATCOMPLETION = "ASYNCCHATCOMPLETION"; 
	
	private final static Random random = new Random();
	
	@Override
	protected PortalAsyncAction onCreateAsyncAction(Map params) throws Throwable {
		
		IEmployeeContext iEmployeeContext = EmployeeContext.getCurrentMust();
		
		PTAsyncActionDTO ptAsyncActionDTO  = new PTAsyncActionDTO();
		ptAsyncActionDTO.reload(params, true, true);
		ptAsyncActionDTO.setSrfdcid(iEmployeeContext.getTenant());
		ptAsyncActionDTO.setDCSystemId(iEmployeeContext.getDcsystemid());
		ptAsyncActionDTO.setActionState(BackendActionState.NOTCREATED.getValue());
		if(!ptAsyncActionDTO.containsFullTopicTag()) {
			ptAsyncActionDTO.setFullTopicTag(iEmployeeContext.getMqtttopic());
		}
		
		UnicodeUtils.from4ByteChars(ptAsyncActionDTO, UTF8MB4_FIELDS);
		
		EBSXSystemRuntime.getInstance().getPTAsyncActionService().create(ptAsyncActionDTO);
		
		UnicodeUtils.to4ByteChars(ptAsyncActionDTO, UTF8MB4_FIELDS);
		
		PortalAsyncAction portalAsyncAction = new PortalAsyncAction();
		ptAsyncActionDTO.copyTo(portalAsyncAction, true);
		
		String strFullResult = ptAsyncActionDTO.getFullResult();
		if(StringUtils.hasLength(strFullResult)) {
			portalAsyncAction.reset(PTAsyncActionDTO.FIELD_FULLRESULT);
			portalAsyncAction.setActionResult(strFullResult);
		}
		
		return portalAsyncAction;
	}
	
	@Override
	protected PortalAsyncAction onExecuteAsyncAction(String strId, Map params) throws Throwable {
		int nActionState = BackendActionState.CREATING.getValue();
		String strActionType = null;
		PortalAsyncAction lastPortalAsyncAction = getSysCacheUtilRuntime().get(CloudCacheTagUtils.getPortalAsyncActionCat(strId), PortalAsyncAction.class);
		if(lastPortalAsyncAction != null) {
			nActionState = DataTypeUtils.getIntegerValue(lastPortalAsyncAction.getActionState(), BackendActionState.CREATING.getValue());
			if(nActionState >= BackendActionState.CREATED.getValue() ) {
				throw new Exception("作业已结束");
			}
			strActionType = lastPortalAsyncAction.getActionType();
		}
		else {
			PTAsyncActionDTO lastPTAsyncActionDTO = EBSXSystemRuntime.getInstance().getPTAsyncActionService().get(strId);
			nActionState = DataTypeUtils.getIntegerValue(lastPTAsyncActionDTO.getActionState(), BackendActionState.CREATING.getValue());
			if(nActionState >= BackendActionState.CREATED.getValue() ) {
				throw new Exception("作业已结束");
			}
			//要求执行保存，并返回完整数据至备份数据对象
			//strActionType = lastPTAsyncActionDTO.getActionType();
		}
		
		boolean bRandomSave = PortalAsyncActionType.ASYNCCHATCOMPLETION.getValue().equals(strActionType);
		
		PTAsyncActionDTO paramPTAsyncActionDTO  = new PTAsyncActionDTO();
		paramPTAsyncActionDTO.reload(params, true, true);
		
		PTAsyncActionDTO ptAsyncActionDTO = new PTAsyncActionDTO();
		ptAsyncActionDTO.setAsyncAcitonId(strId);
		if(nActionState != BackendActionState.CREATING.getValue()) {
			ptAsyncActionDTO.setActionState(BackendActionState.CREATING.getValue());
			ptAsyncActionDTO.setBeginTime(new java.sql.Timestamp(System.currentTimeMillis()));
			bRandomSave = false;
		}
		
		String strStepInfo = paramPTAsyncActionDTO.getStepInfo();
		if(StringUtils.hasLength(strStepInfo)) {
			if(strStepInfo.length()>240) {
				int nPos = strStepInfo.length() - 240;
				strStepInfo = "..." + strStepInfo.substring(nPos);
			}
		}
		ptAsyncActionDTO.setStepInfo(strStepInfo);
		ptAsyncActionDTO.setFullStepInfo(paramPTAsyncActionDTO.getFullStepInfo());
		ptAsyncActionDTO.setCompletionRate(paramPTAsyncActionDTO.getCompletionRate());
		
		if(paramPTAsyncActionDTO.containsActionResult()) {
			String strActionResult = paramPTAsyncActionDTO.getActionResult();
			if(StringUtils.hasLength(strActionResult)) {
				if(strActionResult.length()> 2000 || UnicodeUtils.has4ByteChars(strActionResult)) {
					ptAsyncActionDTO.setFullResult(strActionResult);
					ptAsyncActionDTO.setActionResult(null);
				}
				else {
					ptAsyncActionDTO.setActionResult(strActionResult);
					ptAsyncActionDTO.setFullResult(null);
				}
			}
			else {
				ptAsyncActionDTO.setActionResult(null);
				ptAsyncActionDTO.setFullResult(null);
			}
		}
		else {
			bRandomSave = false;
		}
		
		//if(!bRandomSave || (random.nextInt(1000)%150 == 0)) {
		if(!bRandomSave) {
			UnicodeUtils.from4ByteChars(ptAsyncActionDTO, UTF8MB4_FIELDS);
			EBSXSystemRuntime.getInstance().getPTAsyncActionService().update(ptAsyncActionDTO);
			UnicodeUtils.to4ByteChars(ptAsyncActionDTO, UTF8MB4_FIELDS);
		}
		
		PortalAsyncAction portalAsyncAction = new PortalAsyncAction();
		if(bRandomSave && lastPortalAsyncAction != null) {
			lastPortalAsyncAction.copyTo(portalAsyncAction);
		}
		ptAsyncActionDTO.copyTo(portalAsyncAction, true);
		
		String strFullResult = ptAsyncActionDTO.getFullResult();
		if(StringUtils.hasLength(strFullResult)) {
			portalAsyncAction.reset(PTAsyncActionDTO.FIELD_FULLRESULT);
			portalAsyncAction.setActionResult(strFullResult);
		}
		return portalAsyncAction;
	}
	
	@Override
	protected PortalAsyncAction onFinishAsyncAction(String strId, Map params) throws Throwable {
		PTAsyncActionDTO lastPTAsyncActionDTO = EBSXSystemRuntime.getInstance().getPTAsyncActionService().get(strId);
		int nActionState = DataTypeUtils.getIntegerValue(lastPTAsyncActionDTO.getActionState(), BackendActionState.CREATING.getValue());
	//if(nActionState == BackendActionState.CREATED.getValue() || nActionState == BackendActionState.FAILED.getValue()) {
		if(nActionState >= BackendActionState.CREATED.getValue() ) {
			throw new Exception("作业已结束");
		}
		
		PTAsyncActionDTO paramPTAsyncActionDTO  = new PTAsyncActionDTO();
		paramPTAsyncActionDTO.reload(params, true, true);
		
		PTAsyncActionDTO ptAsyncActionDTO = new PTAsyncActionDTO();
		ptAsyncActionDTO.setAsyncAcitonId(strId);
		ptAsyncActionDTO.setActionState(BackendActionState.CREATED.getValue());
		ptAsyncActionDTO.setEndTime(new java.sql.Timestamp(System.currentTimeMillis()));
		ptAsyncActionDTO.setStepInfo(null);
		ptAsyncActionDTO.setCompletionRate(null);
		ptAsyncActionDTO.setFullStepInfo(paramPTAsyncActionDTO.getFullStepInfo());
		
		if(paramPTAsyncActionDTO.containsActionResult()) {
			String strActionResult = paramPTAsyncActionDTO.getActionResult();
			if(StringUtils.hasLength(strActionResult)) {
				if(strActionResult.length()>2000 || UnicodeUtils.has4ByteChars(strActionResult)) {
					ptAsyncActionDTO.setFullResult(strActionResult);
					ptAsyncActionDTO.setActionResult(null);
				}
				else {
					ptAsyncActionDTO.setActionResult(strActionResult);
					ptAsyncActionDTO.setFullResult(null);
				}
			}
			else {
				ptAsyncActionDTO.setActionResult(null);
				ptAsyncActionDTO.setFullResult(null);
			}
		}
		
		
		ptAsyncActionDTO.setAsyncResultDownloadUrl(paramPTAsyncActionDTO.getAsyncResultDownloadUrl());
		
		UnicodeUtils.from4ByteChars(ptAsyncActionDTO, UTF8MB4_FIELDS);
		
		EBSXSystemRuntime.getInstance().getPTAsyncActionService().update(ptAsyncActionDTO);
		
		UnicodeUtils.to4ByteChars(ptAsyncActionDTO, UTF8MB4_FIELDS);
		
		PortalAsyncAction portalAsyncAction = new PortalAsyncAction();
		ptAsyncActionDTO.copyTo(portalAsyncAction, true);
		
		String strFullResult = ptAsyncActionDTO.getFullResult();
		if(StringUtils.hasLength(strFullResult)) {
			portalAsyncAction.reset(PTAsyncActionDTO.FIELD_FULLRESULT);
			portalAsyncAction.setActionResult(strFullResult);
		}
		
		return portalAsyncAction;
	}
	
	
	@Override
	protected PortalAsyncAction onErrorAsyncAction(String strId, Map params) throws Throwable {
		PTAsyncActionDTO lastPTAsyncActionDTO = EBSXSystemRuntime.getInstance().getPTAsyncActionService().get(strId);
		int nActionState = DataTypeUtils.getIntegerValue(lastPTAsyncActionDTO.getActionState(), BackendActionState.CREATING.getValue());
		if(nActionState >= BackendActionState.CREATED.getValue()) {
			throw new Exception("作业已结束");
		}
		
		PTAsyncActionDTO paramPTAsyncActionDTO  = new PTAsyncActionDTO();
		paramPTAsyncActionDTO.reload(params, true, true);
		
		PTAsyncActionDTO ptAsyncActionDTO = new PTAsyncActionDTO();
		ptAsyncActionDTO.setAsyncAcitonId(strId);
		ptAsyncActionDTO.setActionState(BackendActionState.FAILED.getValue());
		ptAsyncActionDTO.setEndTime(new java.sql.Timestamp(System.currentTimeMillis()));
		ptAsyncActionDTO.setStepInfo(null);
		ptAsyncActionDTO.setFullStepInfo(paramPTAsyncActionDTO.getFullStepInfo());
		
		if(paramPTAsyncActionDTO.containsActionResult()) {
			String strActionResult = paramPTAsyncActionDTO.getActionResult();
			if(StringUtils.hasLength(strActionResult)) {
				if(strActionResult.length()>2000 || UnicodeUtils.has4ByteChars(strActionResult)) {
					ptAsyncActionDTO.setFullResult(strActionResult);
					ptAsyncActionDTO.setActionResult(null);
				}
				else {
					ptAsyncActionDTO.setActionResult(strActionResult);
					ptAsyncActionDTO.setFullResult(null);
				}
			}
			else {
				ptAsyncActionDTO.setActionResult(null);
				ptAsyncActionDTO.setFullResult(null);
			}
		}
		
		
		ptAsyncActionDTO.setAsyncResultDownloadUrl(paramPTAsyncActionDTO.getAsyncResultDownloadUrl());
		
		UnicodeUtils.from4ByteChars(ptAsyncActionDTO, UTF8MB4_FIELDS);
		
		EBSXSystemRuntime.getInstance().getPTAsyncActionService().update(ptAsyncActionDTO);
		
		UnicodeUtils.to4ByteChars(ptAsyncActionDTO, UTF8MB4_FIELDS);
		
		
		PortalAsyncAction portalAsyncAction = new PortalAsyncAction();
		ptAsyncActionDTO.copyTo(portalAsyncAction, true);
		
		String strFullResult = ptAsyncActionDTO.getFullResult();
		if(StringUtils.hasLength(strFullResult)) {
			portalAsyncAction.reset(PTAsyncActionDTO.FIELD_FULLRESULT);
			portalAsyncAction.setActionResult(strFullResult);
		}
		
		return portalAsyncAction;
	}
	
	@Override
	protected PortalAsyncAction onCancelAsyncAction(String strId, Map params) throws Throwable {
		PTAsyncActionDTO lastPTAsyncActionDTO = EBSXSystemRuntime.getInstance().getPTAsyncActionService().get(strId);
		int nActionState = DataTypeUtils.getIntegerValue(lastPTAsyncActionDTO.getActionState(), BackendActionState.CREATING.getValue());
		if(nActionState >= BackendActionState.CREATED.getValue()) {
			throw new Exception("作业已结束");
		}
		
		PTAsyncActionDTO paramPTAsyncActionDTO  = new PTAsyncActionDTO();
		paramPTAsyncActionDTO.reload(params, true, true);
		
		PTAsyncActionDTO ptAsyncActionDTO = new PTAsyncActionDTO();
		ptAsyncActionDTO.setAsyncAcitonId(strId);
		ptAsyncActionDTO.setActionState(BackendActionState.CANCELED.getValue());
		ptAsyncActionDTO.setEndTime(new java.sql.Timestamp(System.currentTimeMillis()));
		ptAsyncActionDTO.setStepInfo(null);
		ptAsyncActionDTO.setFullStepInfo(paramPTAsyncActionDTO.getFullStepInfo());
		
		if(paramPTAsyncActionDTO.containsActionResult()) {
			String strActionResult = paramPTAsyncActionDTO.getActionResult();
			if(StringUtils.hasLength(strActionResult)) {
				if(strActionResult.length()>2000 || UnicodeUtils.has4ByteChars(strActionResult)) {
					ptAsyncActionDTO.setFullResult(strActionResult);
					ptAsyncActionDTO.setActionResult(null);
				}
				else {
					ptAsyncActionDTO.setActionResult(strActionResult);
					ptAsyncActionDTO.setFullResult(null);
				}
			}
			else {
				ptAsyncActionDTO.setActionResult(null);
				ptAsyncActionDTO.setFullResult(null);
			}
		}
		
		
		ptAsyncActionDTO.setAsyncResultDownloadUrl(paramPTAsyncActionDTO.getAsyncResultDownloadUrl());
		
		UnicodeUtils.from4ByteChars(ptAsyncActionDTO, UTF8MB4_FIELDS);
		
		EBSXSystemRuntime.getInstance().getPTAsyncActionService().update(ptAsyncActionDTO);
		
		UnicodeUtils.to4ByteChars(ptAsyncActionDTO, UTF8MB4_FIELDS);
		
		
		PortalAsyncAction portalAsyncAction = new PortalAsyncAction();
		ptAsyncActionDTO.copyTo(portalAsyncAction, true);
		
		String strFullResult = ptAsyncActionDTO.getFullResult();
		if(StringUtils.hasLength(strFullResult)) {
			portalAsyncAction.reset(PTAsyncActionDTO.FIELD_FULLRESULT);
			portalAsyncAction.setActionResult(strFullResult);
		}
		
		return portalAsyncAction;
	}
	
	@Override
	protected PortalAsyncAction onGetAsyncAction(String strId) throws Throwable {
		
		PTAsyncActionDTO ptAsyncActionDTO  = EBSXSystemRuntime.getInstance().getPTAsyncActionService().get(strId);
		
		UnicodeUtils.to4ByteChars(ptAsyncActionDTO, UTF8MB4_FIELDS);
		
		PortalAsyncAction portalAsyncAction = new PortalAsyncAction();
		ptAsyncActionDTO.copyTo(portalAsyncAction, true);
		
		String strFullResult = ptAsyncActionDTO.getFullResult();
		if(StringUtils.hasLength(strFullResult)) {
			portalAsyncAction.reset(PTAsyncActionDTO.FIELD_FULLRESULT);
			portalAsyncAction.setActionResult(strFullResult);
		}
		
		return portalAsyncAction;
	}

	@Override
	protected List<PortalAsyncAction> onSelectExecutingAsyncActions(Map params) throws Throwable {
		
		IEmployeeContext iEmployeeContext = EmployeeContext.getCurrentMust();
		
		ISearchContextDTO iSearchContextDTO = null;
		if(params!=null) {
			if(!params.containsKey(ISearchContextDTO.PARAM_SIZE)) {
				params.put(ISearchContextDTO.PARAM_SIZE, getSelectAsyncActionsSize());
			}
			iSearchContextDTO = EBSXSystemRuntime.getInstance().getPTAsyncActionService().getDataEntityRuntime().createSearchContext(params);
		}
		else {
			iSearchContextDTO = new SearchContextDTO();
			iSearchContextDTO.limit(getSelectAsyncActionsSize());
		}
		
		iSearchContextDTO.setCount(false);
		iSearchContextDTO.sort("CREATEDATE,DESC");
		iSearchContextDTO
			.eq(PTAsyncActionDTO.FIELD_DCSYSTEMID, iEmployeeContext.getDcsystemid())
			.eq(PTAsyncActionDTO.FIELD_CREATEMAN, iEmployeeContext.getUserid())
			.or()
				.eq(PTAsyncActionDTO.FIELD_ACTIONSTATE, BackendActionState.NOTCREATED.getValue())
				.eq(PTAsyncActionDTO.FIELD_ACTIONSTATE, BackendActionState.CREATING.getValue());
		
		
		return this.doSelectAsyncActions(iSearchContextDTO);
	}
	
	protected List<PortalAsyncAction> doSelectAsyncActions(ISearchContextDTO iSearchContextDTO) throws Throwable{
		Page<PTAsyncActionDTO> page = EBSXSystemRuntime.getInstance().getPTAsyncActionService().fetchDefault(iSearchContextDTO);
		
		List<PortalAsyncAction> list = new ArrayList<PortalAsyncAction>();
		if(!ObjectUtils.isEmpty(page.getContent())) {
			for(PTAsyncActionDTO ptAsyncActionDTO : page.getContent()){
				
				UnicodeUtils.to4ByteChars(ptAsyncActionDTO, UTF8MB4_FIELDS);
				
				PortalAsyncAction portalAsyncAction = new PortalAsyncAction();
				ptAsyncActionDTO.copyTo(portalAsyncAction, true);
				
				String strFullResult = ptAsyncActionDTO.getFullResult();
				if(StringUtils.hasLength(strFullResult)) {
					portalAsyncAction.reset(PTAsyncActionDTO.FIELD_FULLRESULT);
					portalAsyncAction.setActionResult(strFullResult);
				}
				
				list.add(portalAsyncAction);
			}
		}
		
		return list;
	}
	

	@Override
	protected List<PortalAsyncAction> onSelectFinishedAsyncActions(Map params) throws Throwable {
		IEmployeeContext iEmployeeContext = EmployeeContext.getCurrentMust();
		
		ISearchContextDTO iSearchContextDTO = null;
		if(params!=null) {
			if(!params.containsKey(ISearchContextDTO.PARAM_SIZE)) {
				params.put(ISearchContextDTO.PARAM_SIZE, getSelectAsyncActionsSize());
			}
			iSearchContextDTO = EBSXSystemRuntime.getInstance().getPTAsyncActionService().getDataEntityRuntime().createSearchContext(params);
		}
		else {
			iSearchContextDTO = new SearchContextDTO();
			iSearchContextDTO.limit(getSelectAsyncActionsSize());
		}
		
		iSearchContextDTO.setCount(false);
		iSearchContextDTO.sort("CREATEDATE,DESC");
		iSearchContextDTO
			.eq(PTAsyncActionDTO.FIELD_DCSYSTEMID, iEmployeeContext.getDcsystemid())
			.eq(PTAsyncActionDTO.FIELD_CREATEMAN, iEmployeeContext.getUserid())
			.eq(PTAsyncActionDTO.FIELD_ACTIONSTATE, BackendActionState.CREATED.getValue());
		
		
		return this.doSelectAsyncActions(iSearchContextDTO);
	}

	@Override
	protected List<PortalAsyncAction> onSelectErrorAsyncActions(Map params) throws Throwable {

		IEmployeeContext iEmployeeContext = EmployeeContext.getCurrentMust();
		
		ISearchContextDTO iSearchContextDTO = null;
		if(params!=null) {
			if(!params.containsKey(ISearchContextDTO.PARAM_SIZE)) {
				params.put(ISearchContextDTO.PARAM_SIZE, getSelectAsyncActionsSize());
			}
			iSearchContextDTO = EBSXSystemRuntime.getInstance().getPTAsyncActionService().getDataEntityRuntime().createSearchContext(params);
		}
		else {
			iSearchContextDTO = new SearchContextDTO();
			iSearchContextDTO.limit(getSelectAsyncActionsSize());
		}
		
		iSearchContextDTO.setCount(false);
		
		iSearchContextDTO.sort("CREATEDATE,DESC");
		iSearchContextDTO
			.eq(PTAsyncActionDTO.FIELD_DCSYSTEMID, iEmployeeContext.getDcsystemid())
			.eq(PTAsyncActionDTO.FIELD_CREATEMAN, iEmployeeContext.getUserid())
			.eq(PTAsyncActionDTO.FIELD_ACTIONSTATE, BackendActionState.FAILED.getValue());
		
		
		return this.doSelectAsyncActions(iSearchContextDTO);
	}
	
	@Override
	protected List<PortalAsyncAction> onSelectAllAsyncActions(Map params) throws Throwable {

		IEmployeeContext iEmployeeContext = EmployeeContext.getCurrentMust();
		
		ISearchContextDTO iSearchContextDTO = null;
		if(params!=null) {
			if(!params.containsKey(ISearchContextDTO.PARAM_SIZE)) {
				params.put(ISearchContextDTO.PARAM_SIZE, getSelectAsyncActionsSize());
			}
			iSearchContextDTO = EBSXSystemRuntime.getInstance().getPTAsyncActionService().getDataEntityRuntime().createSearchContext(params);
		}
		else {
			iSearchContextDTO = new SearchContextDTO();
			iSearchContextDTO.limit(getSelectAsyncActionsSize());
		}
		
		iSearchContextDTO.setCount(false);
		
		iSearchContextDTO.sort("CREATEDATE,DESC");
		iSearchContextDTO
			.eq(PTAsyncActionDTO.FIELD_DCSYSTEMID, iEmployeeContext.getDcsystemid())
			.eq(PTAsyncActionDTO.FIELD_CREATEMAN, iEmployeeContext.getUserid());
		
		
		return this.doSelectAsyncActions(iSearchContextDTO);
	}
	
	
}
