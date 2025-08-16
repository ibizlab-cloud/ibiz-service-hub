package net.ibizsys.model.util.merger;



import com.fasterxml.jackson.databind.node.ObjectNode;
import net.ibizsys.model.util.merger.IPSModelListMerger;
import net.ibizsys.model.util.merger.IPSModelMergeContext;
import net.ibizsys.model.util.merger.PSModelMergerFactory;
import static net.ibizsys.model.PSSystemImpl.*;



public class PSSystemMerger extends net.ibizsys.model.util.merger.PSModelMergerBase{


	@Override
	protected boolean isEnableMergeChild(IPSModelMergeContext iPSModelMergeContext, String strFieldName) {
		Boolean ret = iPSModelMergeContext.isEnableMergeChild(net.ibizsys.model.PSSystemImpl.class, strFieldName);
		return (ret != null)?ret:super.isEnableMergeChild(iPSModelMergeContext, strFieldName);
	}

	@Override
	protected void onMerge(IPSModelMergeContext iPSModelMergeContext, ObjectNode objectNode, ObjectNode mergeObjectNode) throws Exception {

		if(isEnableMergeChild(iPSModelMergeContext, ATTR_GETALLPSAPPS)){
			IPSModelListMerger iPSModelListMerger = iPSModelMergeContext.getPSModelListMerger(net.ibizsys.model.app.IPSApplication.class, true);
			if(iPSModelListMerger != null){
				iPSModelListMerger.merge(iPSModelMergeContext, objectNode, mergeObjectNode, ATTR_GETALLPSAPPS);
			}
		}

		if(isEnableMergeChild(iPSModelMergeContext, ATTR_GETALLPSCODELISTS)){
			IPSModelListMerger iPSModelListMerger = iPSModelMergeContext.getPSModelListMerger(net.ibizsys.model.codelist.IPSCodeList.class, true);
			if(iPSModelListMerger != null){
				iPSModelListMerger.merge(iPSModelMergeContext, objectNode, mergeObjectNode, ATTR_GETALLPSCODELISTS);
			}
		}

		if(isEnableMergeChild(iPSModelMergeContext, ATTR_GETALLPSDEOPPRIVS)){
			IPSModelListMerger iPSModelListMerger = iPSModelMergeContext.getPSModelListMerger(net.ibizsys.model.dataentity.priv.IPSSysDEOPPriv.class, true);
			if(iPSModelListMerger != null){
				iPSModelListMerger.merge(iPSModelMergeContext, objectNode, mergeObjectNode, ATTR_GETALLPSDEOPPRIVS);
			}
		}

		if(isEnableMergeChild(iPSModelMergeContext, ATTR_GETALLPSDATAENTITIES)){
			IPSModelListMerger iPSModelListMerger = iPSModelMergeContext.getPSModelListMerger(net.ibizsys.model.dataentity.IPSDataEntity.class, true);
			if(iPSModelListMerger != null){
				iPSModelListMerger.merge(iPSModelMergeContext, objectNode, mergeObjectNode, ATTR_GETALLPSDATAENTITIES);
			}
		}

		if(isEnableMergeChild(iPSModelMergeContext, ATTR_GETALLPSSUBSYSSERVICEAPIS)){
			IPSModelListMerger iPSModelListMerger = iPSModelMergeContext.getPSModelListMerger(net.ibizsys.model.service.IPSSubSysServiceAPI.class, true);
			if(iPSModelListMerger != null){
				iPSModelListMerger.merge(iPSModelMergeContext, objectNode, mergeObjectNode, ATTR_GETALLPSSUBSYSSERVICEAPIS);
			}
		}

		if(isEnableMergeChild(iPSModelMergeContext, ATTR_GETALLPSSYSAIFACTORIES)){
			IPSModelListMerger iPSModelListMerger = iPSModelMergeContext.getPSModelListMerger(net.ibizsys.model.ai.IPSSysAIFactory.class, true);
			if(iPSModelListMerger != null){
				iPSModelListMerger.merge(iPSModelMergeContext, objectNode, mergeObjectNode, ATTR_GETALLPSSYSAIFACTORIES);
			}
		}

		if(isEnableMergeChild(iPSModelMergeContext, ATTR_GETALLPSSYSACTORS)){
			IPSModelListMerger iPSModelListMerger = iPSModelMergeContext.getPSModelListMerger(net.ibizsys.model.uml.IPSSysActor.class, true);
			if(iPSModelListMerger != null){
				iPSModelListMerger.merge(iPSModelMergeContext, objectNode, mergeObjectNode, ATTR_GETALLPSSYSACTORS);
			}
		}

		if(isEnableMergeChild(iPSModelMergeContext, ATTR_GETALLPSSYSBDSCHEMES)){
			IPSModelListMerger iPSModelListMerger = iPSModelMergeContext.getPSModelListMerger(net.ibizsys.model.ba.IPSSysBDScheme.class, true);
			if(iPSModelListMerger != null){
				iPSModelListMerger.merge(iPSModelMergeContext, objectNode, mergeObjectNode, ATTR_GETALLPSSYSBDSCHEMES);
			}
		}

		if(isEnableMergeChild(iPSModelMergeContext, ATTR_GETALLPSSYSBISCHEMES)){
			IPSModelListMerger iPSModelListMerger = iPSModelMergeContext.getPSModelListMerger(net.ibizsys.model.bi.IPSSysBIScheme.class, true);
			if(iPSModelListMerger != null){
				iPSModelListMerger.merge(iPSModelMergeContext, objectNode, mergeObjectNode, ATTR_GETALLPSSYSBISCHEMES);
			}
		}

		if(isEnableMergeChild(iPSModelMergeContext, ATTR_GETALLPSSYSBACKSERVICES)){
			IPSModelListMerger iPSModelListMerger = iPSModelMergeContext.getPSModelListMerger(net.ibizsys.model.backservice.IPSSysBackService.class, true);
			if(iPSModelListMerger != null){
				iPSModelListMerger.merge(iPSModelMergeContext, objectNode, mergeObjectNode, ATTR_GETALLPSSYSBACKSERVICES);
			}
		}

		if(isEnableMergeChild(iPSModelMergeContext, ATTR_GETALLPSSYSCONTENTCATS)){
			IPSModelListMerger iPSModelListMerger = iPSModelMergeContext.getPSModelListMerger(net.ibizsys.model.res.IPSSysContentCat.class, true);
			if(iPSModelListMerger != null){
				iPSModelListMerger.merge(iPSModelMergeContext, objectNode, mergeObjectNode, ATTR_GETALLPSSYSCONTENTCATS);
			}
		}

		if(isEnableMergeChild(iPSModelMergeContext, ATTR_GETALLPSSYSCOUNTERS)){
			IPSModelListMerger iPSModelListMerger = iPSModelMergeContext.getPSModelListMerger(net.ibizsys.model.control.counter.IPSSysCounter.class, true);
			if(iPSModelListMerger != null){
				iPSModelListMerger.merge(iPSModelMergeContext, objectNode, mergeObjectNode, ATTR_GETALLPSSYSCOUNTERS);
			}
		}

		if(isEnableMergeChild(iPSModelMergeContext, ATTR_GETALLPSSYSDBSCHEMES)){
			IPSModelListMerger iPSModelListMerger = iPSModelMergeContext.getPSModelListMerger(net.ibizsys.model.database.IPSSysDBScheme.class, true);
			if(iPSModelListMerger != null){
				iPSModelListMerger.merge(iPSModelMergeContext, objectNode, mergeObjectNode, ATTR_GETALLPSSYSDBSCHEMES);
			}
		}

		if(isEnableMergeChild(iPSModelMergeContext, ATTR_GETALLPSSYSDBVALUEFUNCS)){
			IPSModelListMerger iPSModelListMerger = iPSModelMergeContext.getPSModelListMerger(net.ibizsys.model.database.IPSSysDBValueFunc.class, true);
			if(iPSModelListMerger != null){
				iPSModelListMerger.merge(iPSModelMergeContext, objectNode, mergeObjectNode, ATTR_GETALLPSSYSDBVALUEFUNCS);
			}
		}

		if(isEnableMergeChild(iPSModelMergeContext, ATTR_GETALLPSSYSDEGROUPS)){
			IPSModelListMerger iPSModelListMerger = iPSModelMergeContext.getPSModelListMerger(net.ibizsys.model.dataentity.IPSSysDEGroup.class, true);
			if(iPSModelListMerger != null){
				iPSModelListMerger.merge(iPSModelMergeContext, objectNode, mergeObjectNode, ATTR_GETALLPSSYSDEGROUPS);
			}
		}

		if(isEnableMergeChild(iPSModelMergeContext, ATTR_GETALLPSSYSDERGROUPS)){
			IPSModelListMerger iPSModelListMerger = iPSModelMergeContext.getPSModelListMerger(net.ibizsys.model.dataentity.der.IPSSysDERGroup.class, true);
			if(iPSModelListMerger != null){
				iPSModelListMerger.merge(iPSModelMergeContext, objectNode, mergeObjectNode, ATTR_GETALLPSSYSDERGROUPS);
			}
		}

		if(isEnableMergeChild(iPSModelMergeContext, ATTR_GETALLPSSYSDTSQUEUES)){
			IPSModelListMerger iPSModelListMerger = iPSModelMergeContext.getPSModelListMerger(net.ibizsys.model.dts.IPSSysDTSQueue.class, true);
			if(iPSModelListMerger != null){
				iPSModelListMerger.merge(iPSModelMergeContext, objectNode, mergeObjectNode, ATTR_GETALLPSSYSDTSQUEUES);
			}
		}

		if(isEnableMergeChild(iPSModelMergeContext, ATTR_GETALLPSSYSDATASYNCAGENTS)){
			IPSModelListMerger iPSModelListMerger = iPSModelMergeContext.getPSModelListMerger(net.ibizsys.model.res.IPSSysDataSyncAgent.class, true);
			if(iPSModelListMerger != null){
				iPSModelListMerger.merge(iPSModelMergeContext, objectNode, mergeObjectNode, ATTR_GETALLPSSYSDATASYNCAGENTS);
			}
		}

		if(isEnableMergeChild(iPSModelMergeContext, ATTR_GETALLPSSYSDYNAMODELS)){
			IPSModelListMerger iPSModelListMerger = iPSModelMergeContext.getPSModelListMerger(net.ibizsys.model.dynamodel.IPSSysDynaModel.class, true);
			if(iPSModelListMerger != null){
				iPSModelListMerger.merge(iPSModelMergeContext, objectNode, mergeObjectNode, ATTR_GETALLPSSYSDYNAMODELS);
			}
		}

		if(isEnableMergeChild(iPSModelMergeContext, ATTR_GETALLPSSYSERMAPS)){
			IPSModelListMerger iPSModelListMerger = iPSModelMergeContext.getPSModelListMerger(net.ibizsys.model.er.IPSSysERMap.class, true);
			if(iPSModelListMerger != null){
				iPSModelListMerger.merge(iPSModelMergeContext, objectNode, mergeObjectNode, ATTR_GETALLPSSYSERMAPS);
			}
		}

		if(isEnableMergeChild(iPSModelMergeContext, ATTR_GETALLPSSYSEDITORSTYLES)){
			IPSModelListMerger iPSModelListMerger = iPSModelMergeContext.getPSModelListMerger(net.ibizsys.model.res.IPSSysEditorStyle.class, true);
			if(iPSModelListMerger != null){
				iPSModelListMerger.merge(iPSModelMergeContext, objectNode, mergeObjectNode, ATTR_GETALLPSSYSEDITORSTYLES);
			}
		}

		if(isEnableMergeChild(iPSModelMergeContext, ATTR_GETALLPSSYSI18NS)){
			IPSModelListMerger iPSModelListMerger = iPSModelMergeContext.getPSModelListMerger(net.ibizsys.model.res.IPSSysI18N.class, true);
			if(iPSModelListMerger != null){
				iPSModelListMerger.merge(iPSModelMergeContext, objectNode, mergeObjectNode, ATTR_GETALLPSSYSI18NS);
			}
		}

		if(isEnableMergeChild(iPSModelMergeContext, ATTR_GETALLPSSYSLOGICS)){
			IPSModelListMerger iPSModelListMerger = iPSModelMergeContext.getPSModelListMerger(net.ibizsys.model.res.IPSSysLogic.class, true);
			if(iPSModelListMerger != null){
				iPSModelListMerger.merge(iPSModelMergeContext, objectNode, mergeObjectNode, ATTR_GETALLPSSYSLOGICS);
			}
		}

		if(isEnableMergeChild(iPSModelMergeContext, ATTR_GETALLPSSYSMETHODDTOS)){
			IPSModelListMerger iPSModelListMerger = iPSModelMergeContext.getPSModelListMerger(net.ibizsys.model.service.IPSSysMethodDTO.class, true);
			if(iPSModelListMerger != null){
				iPSModelListMerger.merge(iPSModelMergeContext, objectNode, mergeObjectNode, ATTR_GETALLPSSYSMETHODDTOS);
			}
		}

		if(isEnableMergeChild(iPSModelMergeContext, ATTR_GETALLPSSYSMODELGROUPS)){
			IPSModelListMerger iPSModelListMerger = iPSModelMergeContext.getPSModelListMerger(net.ibizsys.model.system.IPSSysModelGroup.class, true);
			if(iPSModelListMerger != null){
				iPSModelListMerger.merge(iPSModelMergeContext, objectNode, mergeObjectNode, ATTR_GETALLPSSYSMODELGROUPS);
			}
		}

		if(isEnableMergeChild(iPSModelMergeContext, ATTR_GETALLPSSYSMSGQUEUES)){
			IPSModelListMerger iPSModelListMerger = iPSModelMergeContext.getPSModelListMerger(net.ibizsys.model.msg.IPSSysMsgQueue.class, true);
			if(iPSModelListMerger != null){
				iPSModelListMerger.merge(iPSModelMergeContext, objectNode, mergeObjectNode, ATTR_GETALLPSSYSMSGQUEUES);
			}
		}

		if(isEnableMergeChild(iPSModelMergeContext, ATTR_GETALLPSSYSMSGTARGETS)){
			IPSModelListMerger iPSModelListMerger = iPSModelMergeContext.getPSModelListMerger(net.ibizsys.model.msg.IPSSysMsgTarget.class, true);
			if(iPSModelListMerger != null){
				iPSModelListMerger.merge(iPSModelMergeContext, objectNode, mergeObjectNode, ATTR_GETALLPSSYSMSGTARGETS);
			}
		}

		if(isEnableMergeChild(iPSModelMergeContext, ATTR_GETALLPSSYSMSGTEMPLS)){
			IPSModelListMerger iPSModelListMerger = iPSModelMergeContext.getPSModelListMerger(net.ibizsys.model.msg.IPSSysMsgTempl.class, true);
			if(iPSModelListMerger != null){
				iPSModelListMerger.merge(iPSModelMergeContext, objectNode, mergeObjectNode, ATTR_GETALLPSSYSMSGTEMPLS);
			}
		}

		if(isEnableMergeChild(iPSModelMergeContext, ATTR_GETALLPSSYSPDTVIEWS)){
			IPSModelListMerger iPSModelListMerger = iPSModelMergeContext.getPSModelListMerger(net.ibizsys.model.res.IPSSysPDTView.class, true);
			if(iPSModelListMerger != null){
				iPSModelListMerger.merge(iPSModelMergeContext, objectNode, mergeObjectNode, ATTR_GETALLPSSYSPDTVIEWS);
			}
		}

		if(isEnableMergeChild(iPSModelMergeContext, ATTR_GETALLPSSYSREFS)){
			IPSModelListMerger iPSModelListMerger = iPSModelMergeContext.getPSModelListMerger(net.ibizsys.model.system.IPSSysRef.class, true);
			if(iPSModelListMerger != null){
				iPSModelListMerger.merge(iPSModelMergeContext, objectNode, mergeObjectNode, ATTR_GETALLPSSYSREFS);
			}
		}

		if(isEnableMergeChild(iPSModelMergeContext, ATTR_GETALLPSSYSREQITEMS)){
			IPSModelListMerger iPSModelListMerger = iPSModelMergeContext.getPSModelListMerger(net.ibizsys.model.requirement.IPSSysReqItem.class, true);
			if(iPSModelListMerger != null){
				iPSModelListMerger.merge(iPSModelMergeContext, objectNode, mergeObjectNode, ATTR_GETALLPSSYSREQITEMS);
			}
		}

		if(isEnableMergeChild(iPSModelMergeContext, ATTR_GETALLPSSYSRESOURCES)){
			IPSModelListMerger iPSModelListMerger = iPSModelMergeContext.getPSModelListMerger(net.ibizsys.model.res.IPSSysResource.class, true);
			if(iPSModelListMerger != null){
				iPSModelListMerger.merge(iPSModelMergeContext, objectNode, mergeObjectNode, ATTR_GETALLPSSYSRESOURCES);
			}
		}

		if(isEnableMergeChild(iPSModelMergeContext, ATTR_GETALLPSSYSSFPLUGINS)){
			IPSModelListMerger iPSModelListMerger = iPSModelMergeContext.getPSModelListMerger(net.ibizsys.model.res.IPSSysSFPlugin.class, true);
			if(iPSModelListMerger != null){
				iPSModelListMerger.merge(iPSModelMergeContext, objectNode, mergeObjectNode, ATTR_GETALLPSSYSSFPLUGINS);
			}
		}

		if(isEnableMergeChild(iPSModelMergeContext, ATTR_GETALLPSSYSSFPUBS)){
			IPSModelListMerger iPSModelListMerger = iPSModelMergeContext.getPSModelListMerger(net.ibizsys.model.pub.IPSSysSFPub.class, true);
			if(iPSModelListMerger != null){
				iPSModelListMerger.merge(iPSModelMergeContext, objectNode, mergeObjectNode, ATTR_GETALLPSSYSSFPUBS);
			}
		}

		if(isEnableMergeChild(iPSModelMergeContext, ATTR_GETALLPSSYSSAMPLEVALUES)){
			IPSModelListMerger iPSModelListMerger = iPSModelMergeContext.getPSModelListMerger(net.ibizsys.model.res.IPSSysSampleValue.class, true);
			if(iPSModelListMerger != null){
				iPSModelListMerger.merge(iPSModelMergeContext, objectNode, mergeObjectNode, ATTR_GETALLPSSYSSAMPLEVALUES);
			}
		}

		if(isEnableMergeChild(iPSModelMergeContext, ATTR_GETALLPSSYSSEARCHSCHEMES)){
			IPSModelListMerger iPSModelListMerger = iPSModelMergeContext.getPSModelListMerger(net.ibizsys.model.search.IPSSysSearchScheme.class, true);
			if(iPSModelListMerger != null){
				iPSModelListMerger.merge(iPSModelMergeContext, objectNode, mergeObjectNode, ATTR_GETALLPSSYSSEARCHSCHEMES);
			}
		}

		if(isEnableMergeChild(iPSModelMergeContext, ATTR_GETALLPSSYSSEQUENCES)){
			IPSModelListMerger iPSModelListMerger = iPSModelMergeContext.getPSModelListMerger(net.ibizsys.model.res.IPSSysSequence.class, true);
			if(iPSModelListMerger != null){
				iPSModelListMerger.merge(iPSModelMergeContext, objectNode, mergeObjectNode, ATTR_GETALLPSSYSSEQUENCES);
			}
		}

		if(isEnableMergeChild(iPSModelMergeContext, ATTR_GETALLPSSYSSERVICEAPIS)){
			IPSModelListMerger iPSModelListMerger = iPSModelMergeContext.getPSModelListMerger(net.ibizsys.model.service.IPSSysServiceAPI.class, true);
			if(iPSModelListMerger != null){
				iPSModelListMerger.merge(iPSModelMergeContext, objectNode, mergeObjectNode, ATTR_GETALLPSSYSSERVICEAPIS);
			}
		}

		if(isEnableMergeChild(iPSModelMergeContext, ATTR_GETALLPSSYSTESTDATAS)){
			IPSModelListMerger iPSModelListMerger = iPSModelMergeContext.getPSModelListMerger(net.ibizsys.model.testing.IPSSysTestData.class, true);
			if(iPSModelListMerger != null){
				iPSModelListMerger.merge(iPSModelMergeContext, objectNode, mergeObjectNode, ATTR_GETALLPSSYSTESTDATAS);
			}
		}

		if(isEnableMergeChild(iPSModelMergeContext, ATTR_GETALLPSSYSTESTPRJS)){
			IPSModelListMerger iPSModelListMerger = iPSModelMergeContext.getPSModelListMerger(net.ibizsys.model.testing.IPSSysTestPrj.class, true);
			if(iPSModelListMerger != null){
				iPSModelListMerger.merge(iPSModelMergeContext, objectNode, mergeObjectNode, ATTR_GETALLPSSYSTESTPRJS);
			}
		}

		if(isEnableMergeChild(iPSModelMergeContext, ATTR_GETALLPSSYSTRANSLATORS)){
			IPSModelListMerger iPSModelListMerger = iPSModelMergeContext.getPSModelListMerger(net.ibizsys.model.res.IPSSysTranslator.class, true);
			if(iPSModelListMerger != null){
				iPSModelListMerger.merge(iPSModelMergeContext, objectNode, mergeObjectNode, ATTR_GETALLPSSYSTRANSLATORS);
			}
		}

		if(isEnableMergeChild(iPSModelMergeContext, ATTR_GETALLPSSYSUCMAPS)){
			IPSModelListMerger iPSModelListMerger = iPSModelMergeContext.getPSModelListMerger(net.ibizsys.model.uml.IPSSysUCMap.class, true);
			if(iPSModelListMerger != null){
				iPSModelListMerger.merge(iPSModelMergeContext, objectNode, mergeObjectNode, ATTR_GETALLPSSYSUCMAPS);
			}
		}

		if(isEnableMergeChild(iPSModelMergeContext, ATTR_GETALLPSSYSUNIRESES)){
			IPSModelListMerger iPSModelListMerger = iPSModelMergeContext.getPSModelListMerger(net.ibizsys.model.security.IPSSysUniRes.class, true);
			if(iPSModelListMerger != null){
				iPSModelListMerger.merge(iPSModelMergeContext, objectNode, mergeObjectNode, ATTR_GETALLPSSYSUNIRESES);
			}
		}

		if(isEnableMergeChild(iPSModelMergeContext, ATTR_GETALLPSSYSUNISTATES)){
			IPSModelListMerger iPSModelListMerger = iPSModelMergeContext.getPSModelListMerger(net.ibizsys.model.res.IPSSysUniState.class, true);
			if(iPSModelListMerger != null){
				iPSModelListMerger.merge(iPSModelMergeContext, objectNode, mergeObjectNode, ATTR_GETALLPSSYSUNISTATES);
			}
		}

		if(isEnableMergeChild(iPSModelMergeContext, ATTR_GETALLPSSYSUSECASES)){
			IPSModelListMerger iPSModelListMerger = iPSModelMergeContext.getPSModelListMerger(net.ibizsys.model.uml.IPSSysUseCase.class, true);
			if(iPSModelListMerger != null){
				iPSModelListMerger.merge(iPSModelMergeContext, objectNode, mergeObjectNode, ATTR_GETALLPSSYSUSECASES);
			}
		}

		if(isEnableMergeChild(iPSModelMergeContext, ATTR_GETALLPSSYSUSERDRS)){
			IPSModelListMerger iPSModelListMerger = iPSModelMergeContext.getPSModelListMerger(net.ibizsys.model.security.IPSSysUserDR.class, true);
			if(iPSModelListMerger != null){
				iPSModelListMerger.merge(iPSModelMergeContext, objectNode, mergeObjectNode, ATTR_GETALLPSSYSUSERDRS);
			}
		}

		if(isEnableMergeChild(iPSModelMergeContext, ATTR_GETALLPSSYSUSERMODES)){
			IPSModelListMerger iPSModelListMerger = iPSModelMergeContext.getPSModelListMerger(net.ibizsys.model.security.IPSSysUserMode.class, true);
			if(iPSModelListMerger != null){
				iPSModelListMerger.merge(iPSModelMergeContext, objectNode, mergeObjectNode, ATTR_GETALLPSSYSUSERMODES);
			}
		}

		if(isEnableMergeChild(iPSModelMergeContext, ATTR_GETALLPSSYSUSERROLES)){
			IPSModelListMerger iPSModelListMerger = iPSModelMergeContext.getPSModelListMerger(net.ibizsys.model.security.IPSSysUserRole.class, true);
			if(iPSModelListMerger != null){
				iPSModelListMerger.merge(iPSModelMergeContext, objectNode, mergeObjectNode, ATTR_GETALLPSSYSUSERROLES);
			}
		}

		if(isEnableMergeChild(iPSModelMergeContext, ATTR_GETALLPSSYSUTILS)){
			IPSModelListMerger iPSModelListMerger = iPSModelMergeContext.getPSModelListMerger(net.ibizsys.model.res.IPSSysUtil.class, true);
			if(iPSModelListMerger != null){
				iPSModelListMerger.merge(iPSModelMergeContext, objectNode, mergeObjectNode, ATTR_GETALLPSSYSUTILS);
			}
		}

		if(isEnableMergeChild(iPSModelMergeContext, ATTR_GETALLPSSYSVALUERULES)){
			IPSModelListMerger iPSModelListMerger = iPSModelMergeContext.getPSModelListMerger(net.ibizsys.model.valuerule.IPSSysValueRule.class, true);
			if(iPSModelListMerger != null){
				iPSModelListMerger.merge(iPSModelMergeContext, objectNode, mergeObjectNode, ATTR_GETALLPSSYSVALUERULES);
			}
		}

		if(isEnableMergeChild(iPSModelMergeContext, ATTR_GETALLPSSYSTEMDBCONFIGS)){
			IPSModelListMerger iPSModelListMerger = iPSModelMergeContext.getPSModelListMerger(net.ibizsys.model.database.IPSSystemDBConfig.class, true);
			if(iPSModelListMerger != null){
				iPSModelListMerger.merge(iPSModelMergeContext, objectNode, mergeObjectNode, ATTR_GETALLPSSYSTEMDBCONFIGS);
			}
		}

		if(isEnableMergeChild(iPSModelMergeContext, ATTR_GETALLPSSYSTEMMODULES)){
			IPSModelListMerger iPSModelListMerger = iPSModelMergeContext.getPSModelListMerger(net.ibizsys.model.system.IPSSystemModule.class, true);
			if(iPSModelListMerger != null){
				iPSModelListMerger.merge(iPSModelMergeContext, objectNode, mergeObjectNode, ATTR_GETALLPSSYSTEMMODULES);
			}
		}

		if(isEnableMergeChild(iPSModelMergeContext, ATTR_GETALLPSWFROLES)){
			IPSModelListMerger iPSModelListMerger = iPSModelMergeContext.getPSModelListMerger(net.ibizsys.model.wf.IPSWFRole.class, true);
			if(iPSModelListMerger != null){
				iPSModelListMerger.merge(iPSModelMergeContext, objectNode, mergeObjectNode, ATTR_GETALLPSWFROLES);
			}
		}

		if(isEnableMergeChild(iPSModelMergeContext, ATTR_GETALLPSWFWORKTIMES)){
			IPSModelListMerger iPSModelListMerger = iPSModelMergeContext.getPSModelListMerger(net.ibizsys.model.wf.IPSWFWorkTime.class, true);
			if(iPSModelListMerger != null){
				iPSModelListMerger.merge(iPSModelMergeContext, objectNode, mergeObjectNode, ATTR_GETALLPSWFWORKTIMES);
			}
		}

		if(isEnableMergeChild(iPSModelMergeContext, ATTR_GETALLPSWXACCOUNTS)){
			IPSModelListMerger iPSModelListMerger = iPSModelMergeContext.getPSModelListMerger(net.ibizsys.model.wx.IPSWXAccount.class, true);
			if(iPSModelListMerger != null){
				iPSModelListMerger.merge(iPSModelMergeContext, objectNode, mergeObjectNode, ATTR_GETALLPSWXACCOUNTS);
			}
		}

		if(isEnableMergeChild(iPSModelMergeContext, ATTR_GETALLPSWORKFLOWS)){
			IPSModelListMerger iPSModelListMerger = iPSModelMergeContext.getPSModelListMerger(net.ibizsys.model.wf.IPSWorkflow.class, true);
			if(iPSModelListMerger != null){
				iPSModelListMerger.merge(iPSModelMergeContext, objectNode, mergeObjectNode, ATTR_GETALLPSWORKFLOWS);
			}
		}

		if(isEnableMergeChild(iPSModelMergeContext, ATTR_GETDEFAULTPSSYSSFPUB)){
			IPSModelListMerger iPSModelListMerger = iPSModelMergeContext.getPSModelListMerger(net.ibizsys.model.pub.IPSSysSFPub.class, true);
			if(iPSModelListMerger != null){
				iPSModelListMerger.mergeSingle(iPSModelMergeContext, objectNode, mergeObjectNode, ATTR_GETDEFAULTPSSYSSFPUB);
			}
		}

		if(isEnableMergeChild(iPSModelMergeContext, ATTR_GETINITPSSYSCONTENTS)){
			IPSModelListMerger iPSModelListMerger = iPSModelMergeContext.getPSModelListMerger(net.ibizsys.model.res.IPSSysContent.class, true);
			if(iPSModelListMerger != null){
				iPSModelListMerger.merge(iPSModelMergeContext, objectNode, mergeObjectNode, ATTR_GETINITPSSYSCONTENTS);
			}
		}

		if(isEnableMergeChild(iPSModelMergeContext, ATTR_GETROOTPSSYSREQMODULES)){
			IPSModelListMerger iPSModelListMerger = iPSModelMergeContext.getPSModelListMerger(net.ibizsys.model.requirement.IPSSysReqModule.class, true);
			if(iPSModelListMerger != null){
				iPSModelListMerger.merge(iPSModelMergeContext, objectNode, mergeObjectNode, ATTR_GETROOTPSSYSREQMODULES);
			}
		}

		if(isEnableMergeChild(iPSModelMergeContext, ATTR_GETSAMPLEPSSYSCONTENTS)){
			IPSModelListMerger iPSModelListMerger = iPSModelMergeContext.getPSModelListMerger(net.ibizsys.model.res.IPSSysContent.class, true);
			if(iPSModelListMerger != null){
				iPSModelListMerger.merge(iPSModelMergeContext, objectNode, mergeObjectNode, ATTR_GETSAMPLEPSSYSCONTENTS);
			}
		}

		if(isEnableMergeChild(iPSModelMergeContext, ATTR_GETTESTPSSYSCONTENTS)){
			IPSModelListMerger iPSModelListMerger = iPSModelMergeContext.getPSModelListMerger(net.ibizsys.model.res.IPSSysContent.class, true);
			if(iPSModelListMerger != null){
				iPSModelListMerger.merge(iPSModelMergeContext, objectNode, mergeObjectNode, ATTR_GETTESTPSSYSCONTENTS);
			}
		}
		super.onMerge(iPSModelMergeContext, objectNode, mergeObjectNode);
	}
}