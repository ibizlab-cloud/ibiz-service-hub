package net.ibizsys.model.util.merger.dataentity;



import com.fasterxml.jackson.databind.node.ObjectNode;
import net.ibizsys.model.util.merger.IPSModelListMerger;
import net.ibizsys.model.util.merger.IPSModelMergeContext;
import net.ibizsys.model.util.merger.PSModelMergerFactory;
import static net.ibizsys.model.dataentity.PSDataEntityImpl.*;



public class PSDataEntityMerger extends net.ibizsys.model.util.merger.PSModelMergerBase{


	@Override
	protected boolean isEnableMergeChild(IPSModelMergeContext iPSModelMergeContext, String strFieldName) {
		Boolean ret = iPSModelMergeContext.isEnableMergeChild(net.ibizsys.model.dataentity.PSDataEntityImpl.class, strFieldName);
		return (ret != null)?ret:super.isEnableMergeChild(iPSModelMergeContext, strFieldName);
	}

	@Override
	protected void onMerge(IPSModelMergeContext iPSModelMergeContext, ObjectNode objectNode, ObjectNode mergeObjectNode) throws Exception {

		if(isEnableMergeChild(iPSModelMergeContext, ATTR_GETALLPSDEACMODES)){
			IPSModelListMerger iPSModelListMerger = iPSModelMergeContext.getPSModelListMerger(net.ibizsys.model.dataentity.ac.IPSDEACMode.class, true);
			if(iPSModelListMerger != null){
				iPSModelListMerger.merge(iPSModelMergeContext, objectNode, mergeObjectNode, ATTR_GETALLPSDEACMODES);
			}
		}

		if(isEnableMergeChild(iPSModelMergeContext, ATTR_GETALLPSDEACTIONGROUPS)){
			IPSModelListMerger iPSModelListMerger = iPSModelMergeContext.getPSModelListMerger(net.ibizsys.model.dataentity.action.IPSDEActionGroup.class, true);
			if(iPSModelListMerger != null){
				iPSModelListMerger.merge(iPSModelMergeContext, objectNode, mergeObjectNode, ATTR_GETALLPSDEACTIONGROUPS);
			}
		}

		if(isEnableMergeChild(iPSModelMergeContext, ATTR_GETALLPSDEACTIONS)){
			IPSModelListMerger iPSModelListMerger = iPSModelMergeContext.getPSModelListMerger(net.ibizsys.model.dataentity.action.IPSDEAction.class, true);
			if(iPSModelListMerger != null){
				iPSModelListMerger.merge(iPSModelMergeContext, objectNode, mergeObjectNode, ATTR_GETALLPSDEACTIONS);
			}
		}

		if(isEnableMergeChild(iPSModelMergeContext, ATTR_GETALLPSDEDBCONFIGS)){
			IPSModelListMerger iPSModelListMerger = iPSModelMergeContext.getPSModelListMerger(net.ibizsys.model.database.IPSDEDBConfig.class, true);
			if(iPSModelListMerger != null){
				iPSModelListMerger.merge(iPSModelMergeContext, objectNode, mergeObjectNode, ATTR_GETALLPSDEDBCONFIGS);
			}
		}

		if(isEnableMergeChild(iPSModelMergeContext, ATTR_GETALLPSDEDBINDICES)){
			IPSModelListMerger iPSModelListMerger = iPSModelMergeContext.getPSModelListMerger(net.ibizsys.model.database.IPSDEDBIndex.class, true);
			if(iPSModelListMerger != null){
				iPSModelListMerger.merge(iPSModelMergeContext, objectNode, mergeObjectNode, ATTR_GETALLPSDEDBINDICES);
			}
		}

		if(isEnableMergeChild(iPSModelMergeContext, ATTR_GETALLPSDEDBTABLES)){
			IPSModelListMerger iPSModelListMerger = iPSModelMergeContext.getPSModelListMerger(net.ibizsys.model.database.IPSDEDBTable.class, true);
			if(iPSModelListMerger != null){
				iPSModelListMerger.merge(iPSModelMergeContext, objectNode, mergeObjectNode, ATTR_GETALLPSDEDBTABLES);
			}
		}

		if(isEnableMergeChild(iPSModelMergeContext, ATTR_GETALLPSDEDRGROUPS)){
			IPSModelListMerger iPSModelListMerger = iPSModelMergeContext.getPSModelListMerger(net.ibizsys.model.dataentity.dr.IPSDEDRGroup.class, true);
			if(iPSModelListMerger != null){
				iPSModelListMerger.merge(iPSModelMergeContext, objectNode, mergeObjectNode, ATTR_GETALLPSDEDRGROUPS);
			}
		}

		if(isEnableMergeChild(iPSModelMergeContext, ATTR_GETALLPSDEDRITEMS)){
			IPSModelListMerger iPSModelListMerger = iPSModelMergeContext.getPSModelListMerger(net.ibizsys.model.dataentity.dr.IPSDEDRItem.class, true);
			if(iPSModelListMerger != null){
				iPSModelListMerger.merge(iPSModelMergeContext, objectNode, mergeObjectNode, ATTR_GETALLPSDEDRITEMS);
			}
		}

		if(isEnableMergeChild(iPSModelMergeContext, ATTR_GETALLPSDEDTSQUEUES)){
			IPSModelListMerger iPSModelListMerger = iPSModelMergeContext.getPSModelListMerger(net.ibizsys.model.dataentity.dts.IPSDEDTSQueue.class, true);
			if(iPSModelListMerger != null){
				iPSModelListMerger.merge(iPSModelMergeContext, objectNode, mergeObjectNode, ATTR_GETALLPSDEDTSQUEUES);
			}
		}

		if(isEnableMergeChild(iPSModelMergeContext, ATTR_GETALLPSDEDATAEXPORTS)){
			IPSModelListMerger iPSModelListMerger = iPSModelMergeContext.getPSModelListMerger(net.ibizsys.model.dataentity.dataexport.IPSDEDataExport.class, true);
			if(iPSModelListMerger != null){
				iPSModelListMerger.merge(iPSModelMergeContext, objectNode, mergeObjectNode, ATTR_GETALLPSDEDATAEXPORTS);
			}
		}

		if(isEnableMergeChild(iPSModelMergeContext, ATTR_GETALLPSDEDATAFLOWS)){
			IPSModelListMerger iPSModelListMerger = iPSModelMergeContext.getPSModelListMerger(net.ibizsys.model.dataentity.dataflow.IPSDEDataFlow.class, true);
			if(iPSModelListMerger != null){
				iPSModelListMerger.merge(iPSModelMergeContext, objectNode, mergeObjectNode, ATTR_GETALLPSDEDATAFLOWS);
			}
		}

		if(isEnableMergeChild(iPSModelMergeContext, ATTR_GETALLPSDEDATAIMPORTS)){
			IPSModelListMerger iPSModelListMerger = iPSModelMergeContext.getPSModelListMerger(net.ibizsys.model.dataentity.dataimport.IPSDEDataImport.class, true);
			if(iPSModelListMerger != null){
				iPSModelListMerger.merge(iPSModelMergeContext, objectNode, mergeObjectNode, ATTR_GETALLPSDEDATAIMPORTS);
			}
		}

		if(isEnableMergeChild(iPSModelMergeContext, ATTR_GETALLPSDEDATAQUERIES)){
			IPSModelListMerger iPSModelListMerger = iPSModelMergeContext.getPSModelListMerger(net.ibizsys.model.dataentity.ds.IPSDEDataQuery.class, true);
			if(iPSModelListMerger != null){
				iPSModelListMerger.merge(iPSModelMergeContext, objectNode, mergeObjectNode, ATTR_GETALLPSDEDATAQUERIES);
			}
		}

		if(isEnableMergeChild(iPSModelMergeContext, ATTR_GETALLPSDEDATARELATIONS)){
			IPSModelListMerger iPSModelListMerger = iPSModelMergeContext.getPSModelListMerger(net.ibizsys.model.dataentity.dr.IPSDEDataRelation.class, true);
			if(iPSModelListMerger != null){
				iPSModelListMerger.merge(iPSModelMergeContext, objectNode, mergeObjectNode, ATTR_GETALLPSDEDATARELATIONS);
			}
		}

		if(isEnableMergeChild(iPSModelMergeContext, ATTR_GETALLPSDEDATASETS)){
			IPSModelListMerger iPSModelListMerger = iPSModelMergeContext.getPSModelListMerger(net.ibizsys.model.dataentity.ds.IPSDEDataSet.class, true);
			if(iPSModelListMerger != null){
				iPSModelListMerger.merge(iPSModelMergeContext, objectNode, mergeObjectNode, ATTR_GETALLPSDEDATASETS);
			}
		}

		if(isEnableMergeChild(iPSModelMergeContext, ATTR_GETALLPSDEDATASYNCS)){
			IPSModelListMerger iPSModelListMerger = iPSModelMergeContext.getPSModelListMerger(net.ibizsys.model.dataentity.datasync.IPSDEDataSync.class, true);
			if(iPSModelListMerger != null){
				iPSModelListMerger.merge(iPSModelMergeContext, objectNode, mergeObjectNode, ATTR_GETALLPSDEDATASYNCS);
			}
		}

		if(isEnableMergeChild(iPSModelMergeContext, ATTR_GETALLPSDEFGROUPS)){
			IPSModelListMerger iPSModelListMerger = iPSModelMergeContext.getPSModelListMerger(net.ibizsys.model.dataentity.defield.IPSDEFGroup.class, true);
			if(iPSModelListMerger != null){
				iPSModelListMerger.merge(iPSModelMergeContext, objectNode, mergeObjectNode, ATTR_GETALLPSDEFGROUPS);
			}
		}

		if(isEnableMergeChild(iPSModelMergeContext, ATTR_GETALLPSDEFIELDS)){
			IPSModelListMerger iPSModelListMerger = iPSModelMergeContext.getPSModelListMerger(net.ibizsys.model.dataentity.defield.IPSDEField.class, true);
			if(iPSModelListMerger != null){
				iPSModelListMerger.merge(iPSModelMergeContext, objectNode, mergeObjectNode, ATTR_GETALLPSDEFIELDS);
			}
		}

		if(isEnableMergeChild(iPSModelMergeContext, ATTR_GETALLPSDEGROUPS)){
			IPSModelListMerger iPSModelListMerger = iPSModelMergeContext.getPSModelListMerger(net.ibizsys.model.dataentity.IPSDEGroup.class, true);
			if(iPSModelListMerger != null){
				iPSModelListMerger.merge(iPSModelMergeContext, objectNode, mergeObjectNode, ATTR_GETALLPSDEGROUPS);
			}
		}

		if(isEnableMergeChild(iPSModelMergeContext, ATTR_GETALLPSDELOGICS)){
			IPSModelListMerger iPSModelListMerger = iPSModelMergeContext.getPSModelListMerger(net.ibizsys.model.dataentity.logic.IPSDELogic.class, true);
			if(iPSModelListMerger != null){
				iPSModelListMerger.merge(iPSModelMergeContext, objectNode, mergeObjectNode, ATTR_GETALLPSDELOGICS);
			}
		}

		if(isEnableMergeChild(iPSModelMergeContext, ATTR_GETALLPSDEMSLOGICS)){
			IPSModelListMerger iPSModelListMerger = iPSModelMergeContext.getPSModelListMerger(net.ibizsys.model.dataentity.logic.IPSDEMSLogic.class, true);
			if(iPSModelListMerger != null){
				iPSModelListMerger.merge(iPSModelMergeContext, objectNode, mergeObjectNode, ATTR_GETALLPSDEMSLOGICS);
			}
		}

		if(isEnableMergeChild(iPSModelMergeContext, ATTR_GETALLPSDEMAINSTATES)){
			IPSModelListMerger iPSModelListMerger = iPSModelMergeContext.getPSModelListMerger(net.ibizsys.model.dataentity.mainstate.IPSDEMainState.class, true);
			if(iPSModelListMerger != null){
				iPSModelListMerger.merge(iPSModelMergeContext, objectNode, mergeObjectNode, ATTR_GETALLPSDEMAINSTATES);
			}
		}

		if(isEnableMergeChild(iPSModelMergeContext, ATTR_GETALLPSDEMAPS)){
			IPSModelListMerger iPSModelListMerger = iPSModelMergeContext.getPSModelListMerger(net.ibizsys.model.dataentity.datamap.IPSDEMap.class, true);
			if(iPSModelListMerger != null){
				iPSModelListMerger.merge(iPSModelMergeContext, objectNode, mergeObjectNode, ATTR_GETALLPSDEMAPS);
			}
		}

		if(isEnableMergeChild(iPSModelMergeContext, ATTR_GETALLPSDEMETHODDTOS)){
			IPSModelListMerger iPSModelListMerger = iPSModelMergeContext.getPSModelListMerger(net.ibizsys.model.dataentity.service.IPSDEMethodDTO.class, true);
			if(iPSModelListMerger != null){
				iPSModelListMerger.merge(iPSModelMergeContext, objectNode, mergeObjectNode, ATTR_GETALLPSDEMETHODDTOS);
			}
		}

		if(isEnableMergeChild(iPSModelMergeContext, ATTR_GETALLPSDENOTIFIES)){
			IPSModelListMerger iPSModelListMerger = iPSModelMergeContext.getPSModelListMerger(net.ibizsys.model.dataentity.notify.IPSDENotify.class, true);
			if(iPSModelListMerger != null){
				iPSModelListMerger.merge(iPSModelMergeContext, objectNode, mergeObjectNode, ATTR_GETALLPSDENOTIFIES);
			}
		}

		if(isEnableMergeChild(iPSModelMergeContext, ATTR_GETALLPSDEOPPRIVS)){
			IPSModelListMerger iPSModelListMerger = iPSModelMergeContext.getPSModelListMerger(net.ibizsys.model.dataentity.priv.IPSDEOPPriv.class, true);
			if(iPSModelListMerger != null){
				iPSModelListMerger.merge(iPSModelMergeContext, objectNode, mergeObjectNode, ATTR_GETALLPSDEOPPRIVS);
			}
		}

		if(isEnableMergeChild(iPSModelMergeContext, ATTR_GETALLPSDEPRINTS)){
			IPSModelListMerger iPSModelListMerger = iPSModelMergeContext.getPSModelListMerger(net.ibizsys.model.dataentity.print.IPSDEPrint.class, true);
			if(iPSModelListMerger != null){
				iPSModelListMerger.merge(iPSModelMergeContext, objectNode, mergeObjectNode, ATTR_GETALLPSDEPRINTS);
			}
		}

		if(isEnableMergeChild(iPSModelMergeContext, ATTR_GETALLPSDERGROUPS)){
			IPSModelListMerger iPSModelListMerger = iPSModelMergeContext.getPSModelListMerger(net.ibizsys.model.dataentity.der.IPSDERGroup.class, true);
			if(iPSModelListMerger != null){
				iPSModelListMerger.merge(iPSModelMergeContext, objectNode, mergeObjectNode, ATTR_GETALLPSDERGROUPS);
			}
		}

		if(isEnableMergeChild(iPSModelMergeContext, ATTR_GETALLPSDEREPORTS)){
			IPSModelListMerger iPSModelListMerger = iPSModelMergeContext.getPSModelListMerger(net.ibizsys.model.dataentity.report.IPSDEReport.class, true);
			if(iPSModelListMerger != null){
				iPSModelListMerger.merge(iPSModelMergeContext, objectNode, mergeObjectNode, ATTR_GETALLPSDEREPORTS);
			}
		}

		if(isEnableMergeChild(iPSModelMergeContext, ATTR_GETALLPSDESEARCHES)){
			IPSModelListMerger iPSModelListMerger = iPSModelMergeContext.getPSModelListMerger(net.ibizsys.model.dataentity.search.IPSDESearch.class, true);
			if(iPSModelListMerger != null){
				iPSModelListMerger.merge(iPSModelMergeContext, objectNode, mergeObjectNode, ATTR_GETALLPSDESEARCHES);
			}
		}

		if(isEnableMergeChild(iPSModelMergeContext, ATTR_GETALLPSDEUNISTATES)){
			IPSModelListMerger iPSModelListMerger = iPSModelMergeContext.getPSModelListMerger(net.ibizsys.model.dataentity.unistate.IPSDEUniState.class, true);
			if(iPSModelListMerger != null){
				iPSModelListMerger.merge(iPSModelMergeContext, objectNode, mergeObjectNode, ATTR_GETALLPSDEUNISTATES);
			}
		}

		if(isEnableMergeChild(iPSModelMergeContext, ATTR_GETALLPSDEUSERROLES)){
			IPSModelListMerger iPSModelListMerger = iPSModelMergeContext.getPSModelListMerger(net.ibizsys.model.dataentity.priv.IPSDEUserRole.class, true);
			if(iPSModelListMerger != null){
				iPSModelListMerger.merge(iPSModelMergeContext, objectNode, mergeObjectNode, ATTR_GETALLPSDEUSERROLES);
			}
		}

		if(isEnableMergeChild(iPSModelMergeContext, ATTR_GETALLPSDEUTILS)){
			IPSModelListMerger iPSModelListMerger = iPSModelMergeContext.getPSModelListMerger(net.ibizsys.model.dataentity.util.IPSDEUtil.class, true);
			if(iPSModelListMerger != null){
				iPSModelListMerger.merge(iPSModelMergeContext, objectNode, mergeObjectNode, ATTR_GETALLPSDEUTILS);
			}
		}

		if(isEnableMergeChild(iPSModelMergeContext, ATTR_GETALLPSDEWFS)){
			IPSModelListMerger iPSModelListMerger = iPSModelMergeContext.getPSModelListMerger(net.ibizsys.model.dataentity.wf.IPSDEWF.class, true);
			if(iPSModelListMerger != null){
				iPSModelListMerger.merge(iPSModelMergeContext, objectNode, mergeObjectNode, ATTR_GETALLPSDEWFS);
			}
		}

		if(isEnableMergeChild(iPSModelMergeContext, ATTR_GETALLPSMODELDATAS)){
			IPSModelListMerger iPSModelListMerger = iPSModelMergeContext.getPSModelListMerger(net.ibizsys.model.IPSModelData.class, true);
			if(iPSModelListMerger != null){
				iPSModelListMerger.merge(iPSModelMergeContext, objectNode, mergeObjectNode, ATTR_GETALLPSMODELDATAS);
			}
		}

		if(isEnableMergeChild(iPSModelMergeContext, ATTR_GETALLPSSYSTESTCASES)){
			IPSModelListMerger iPSModelListMerger = iPSModelMergeContext.getPSModelListMerger(net.ibizsys.model.testing.IPSSysTestCase.class, true);
			if(iPSModelListMerger != null){
				iPSModelListMerger.merge(iPSModelMergeContext, objectNode, mergeObjectNode, ATTR_GETALLPSSYSTESTCASES);
			}
		}

		if(isEnableMergeChild(iPSModelMergeContext, ATTR_GETALLPSSYSTESTDATAS)){
			IPSModelListMerger iPSModelListMerger = iPSModelMergeContext.getPSModelListMerger(net.ibizsys.model.testing.IPSSysTestData.class, true);
			if(iPSModelListMerger != null){
				iPSModelListMerger.merge(iPSModelMergeContext, objectNode, mergeObjectNode, ATTR_GETALLPSSYSTESTDATAS);
			}
		}

		if(isEnableMergeChild(iPSModelMergeContext, ATTR_GETMAINSTATEPSDEFIELDS)){
			IPSModelListMerger iPSModelListMerger = iPSModelMergeContext.getPSModelListMerger(net.ibizsys.model.dataentity.defield.IPSDEField.class, true);
			if(iPSModelListMerger != null){
				iPSModelListMerger.merge(iPSModelMergeContext, objectNode, mergeObjectNode, ATTR_GETMAINSTATEPSDEFIELDS);
			}
		}

		if(isEnableMergeChild(iPSModelMergeContext, ATTR_GETMAJORPSDERS)){
			IPSModelListMerger iPSModelListMerger = iPSModelMergeContext.getPSModelListMerger(net.ibizsys.model.dataentity.der.IPSDERBase.class, true);
			if(iPSModelListMerger != null){
				iPSModelListMerger.merge(iPSModelMergeContext, objectNode, mergeObjectNode, ATTR_GETMAJORPSDERS);
			}
		}

		if(isEnableMergeChild(iPSModelMergeContext, ATTR_GETMINORPSDERS)){
			IPSModelListMerger iPSModelListMerger = iPSModelMergeContext.getPSModelListMerger(net.ibizsys.model.dataentity.der.IPSDERBase.class, true);
			if(iPSModelListMerger != null){
				iPSModelListMerger.merge(iPSModelMergeContext, objectNode, mergeObjectNode, ATTR_GETMINORPSDERS);
			}
		}

		if(isEnableMergeChild(iPSModelMergeContext, ATTR_GETUNIONKEYVALUEPSDEFIELDS)){
			IPSModelListMerger iPSModelListMerger = iPSModelMergeContext.getPSModelListMerger(net.ibizsys.model.dataentity.defield.IPSDEField.class, true);
			if(iPSModelListMerger != null){
				iPSModelListMerger.merge(iPSModelMergeContext, objectNode, mergeObjectNode, ATTR_GETUNIONKEYVALUEPSDEFIELDS);
			}
		}
		super.onMerge(iPSModelMergeContext, objectNode, mergeObjectNode);
	}
}