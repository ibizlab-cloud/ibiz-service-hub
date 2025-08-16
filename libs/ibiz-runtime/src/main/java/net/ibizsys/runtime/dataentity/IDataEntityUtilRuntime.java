package net.ibizsys.runtime.dataentity;

import java.util.List;

import net.ibizsys.model.dataentity.action.IPSDEAction;
import net.ibizsys.model.dataentity.dataexport.IPSDEDataExport;
import net.ibizsys.model.dataentity.dataimport.IPSDEDataImport;
import net.ibizsys.model.dataentity.datasync.IPSDEDataSync;
import net.ibizsys.model.dataentity.defield.IPSDEField;
import net.ibizsys.model.dataentity.ds.IPSDEDataQuery;
import net.ibizsys.model.dataentity.ds.IPSDEDataSet;
import net.ibizsys.model.dataentity.logic.IPSDELogic;
import net.ibizsys.model.dataentity.logic.IPSDEMSLogic;
import net.ibizsys.model.dataentity.notify.IPSDENotify;
import net.ibizsys.model.dataentity.print.IPSDEPrint;
import net.ibizsys.model.dataentity.report.IPSDEReport;
import net.ibizsys.model.dataentity.util.IPSDEUtil;
import net.ibizsys.runtime.IDynaInstRuntime;
import net.ibizsys.runtime.dataentity.action.IDEActionRuntime;
import net.ibizsys.runtime.dataentity.action.IDEScriptLogicRuntime;
import net.ibizsys.runtime.dataentity.dataexport.IDEDataExportRuntime;
import net.ibizsys.runtime.dataentity.dataimport.IDEDataImportRuntime;
import net.ibizsys.runtime.dataentity.datasync.IDEDataSyncInRuntime;
import net.ibizsys.runtime.dataentity.datasync.IDEDataSyncOutRuntime;
import net.ibizsys.runtime.dataentity.ds.IDEDataSetRuntime;
import net.ibizsys.runtime.dataentity.logic.IDELogicRuntime;
import net.ibizsys.runtime.dataentity.logic.IDEMSLogicRuntime;
import net.ibizsys.runtime.dataentity.notify.IDENotifyRuntime;
import net.ibizsys.runtime.dataentity.print.IDEPrintRuntime;
import net.ibizsys.runtime.dataentity.report.IDEReportRuntime;
import net.ibizsys.runtime.dataentity.util.IDEUtilRuntime;
import net.ibizsys.runtime.util.IEntityBase;

/**
 * 实体运行时辅助功能接口
 * @author lionlau
 *
 */
public interface IDataEntityUtilRuntime {

	/**
	 * 转化实际值
	 * @param nDataType
	 * @param strValue
	 * @return
	 * @throws Exception
	 */
	Object convertValue(int nDataType, String strValue) throws Exception;
	
	
	/**
	 * 测试值条件
	 * @param objSrcValue
	 * @param strOp
	 * @param objDstValue
	 * @param nValueDataType
	 * @return
	 */
	boolean testValueCond(Object objSrcValue, String strOp, Object objDstValue, int nValueDataType);
	
	
	
	/**
	 * 对比值
	 * @param objSrcValue
	 * @param objDstValue
	 * @param nValueDataType
	 * @return
	 */
	long compareValue(Object objSrcValue, Object objDstValue, int nValueDataType);
	
	
	/**
	 * 建立当前实体的动态实例运行时对象
	 * @param iDynaInstRuntime
	 * @return
	 * @throws Exception
	 */
	IDynaInstDataEntityRuntime createDynaInstDataEntityRuntime(IDynaInstRuntime iDynaInstRuntime);
	
	
	/**
	 *建立 实体脚本逻辑运行时对象
	 * @param strLogicMode 逻辑模式
	 * @param strScriptCode
	 * @return
	 */
	IDEScriptLogicRuntime createDEScriptLogicRuntime(String strLogicMode, String strScriptCode);

	
	/**
	 * 建立实体同步（输出）运行时对象
	 * @param iPSDEDataSync
	 * @return
	 */
	IDEDataSyncOutRuntime createDEDataSyncOutRuntime(IPSDEDataSync iPSDEDataSync);
	
	
	/**
	 * 建立实体同步（输入）运行时对象
	 * @param iPSDEDataSync
	 * @return
	 */
	IDEDataSyncInRuntime createDEDataSyncInRuntime(IPSDEDataSync iPSDEDataSync);

	
	/**
	 * 建立实体功能运行时对象
	 * @param iPSDEUtil
	 * @return
	 */
	IDEUtilRuntime createDEUtilRuntime(IPSDEUtil iPSDEUtil);
	
	
	
	/**
	 * 建立实体通知运行时对象
	 * @param iPSDENotify
	 * @return
	 */
	IDENotifyRuntime createDENotifyRuntime(IPSDENotify iPSDENotify);
	
	
	/**
	 * 建立实体打印运行时对象
	 * @param iPSDEPrint
	 * @return
	 */
	IDEPrintRuntime createDEPrintRuntime(IPSDEPrint iPSDEPrint);
	
	
	/**
	 * 建立实体报表运行时对象
	 * @param iPSDEReport
	 * @return
	 */
	IDEReportRuntime createDEReportRuntime(IPSDEReport iPSDEReport);
	
	
	
	/**
	 * 建立实体逻辑运行时对象
	 * @param iPSDELogic
	 * @return
	 */
	IDELogicRuntime createDELogicRuntime(IPSDELogic iPSDELogic);
	
	
	
	/**
	 * 建立实体主状态逻辑运行时对象
	 * @param iPSDEMSLogic
	 * @return
	 */
	IDEMSLogicRuntime createDEMSLogicRuntime(IPSDEMSLogic iPSDEMSLogic);
	
	
	/**
	 * 建立实体数据集运行时对象
	 * @param iPSDELogic
	 * @return
	 */
	IDEDataSetRuntime createDEDataSetRuntime(IPSDEDataSet iPSDEDataSet);
	
	
	/**
	 * 建立实体行为运行时对象
	 * @param iPSDELogic
	 * @return
	 */
	IDEActionRuntime createDEActionRuntime(IPSDEAction iPSDEAction);
	
	/**
	 * 建立实体数据导入运行时对象
	 * @param iPSDEDataImport
	 * @return
	 */
	IDEDataImportRuntime createDEDataImportRuntime(IPSDEDataImport iPSDEDataImport);
	
	
	/**
	 * 建立实体数据导出运行时对象
	 * @param iPSDEDataExport
	 * @return
	 */
	IDEDataExportRuntime createDEDataExportRuntime(IPSDEDataExport iPSDEDataExport);
	
	
	
	/**
	 * 获取传入数据查询相关的属性集合
	 * @param iPSDEDataQuery
	 * @return
	 */
	List<IPSDEField> getPSDEFields(IPSDEDataQuery iPSDEDataQuery);
	
	
	
	
	/**
	 * 计算默认值
	 * @param strDefaultValueType
	 * @param strDefaultValue
     * @param iEntityBase
	 * @return
	 * @throws Exception
	 */
	Object getDefaultValue(String strDefaultValueType, String strDefaultValue, IEntityBase iEntityBase) throws Exception;
	
	/**
	 * 计算默认值
	 * @param strDefaultValueType
	 * @param strDefaultValue
	 * @param iEntityBase
	 * @param nDataType
	 * @return
	 * @throws Exception
	 */
	Object getDefaultValue( String strDefaultValueType, String strDefaultValue, IEntityBase iEntityBase, int nDataType) throws Exception;
}
