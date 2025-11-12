package net.ibizsys.runtime.dataentity;

import java.util.List;

import net.ibizsys.model.dataentity.IPSDataEntity;
import net.ibizsys.model.dataentity.action.IPSDEAction;
import net.ibizsys.model.dataentity.dataexport.IPSDEDataExport;
import net.ibizsys.model.dataentity.dataimport.IPSDEDataImport;
import net.ibizsys.model.dataentity.datasync.IPSDEDataSync;
import net.ibizsys.model.dataentity.defield.IPSDEField;
import net.ibizsys.model.dataentity.dts.IPSDEDTSQueue;
import net.ibizsys.model.dataentity.logic.IPSDELogic;
import net.ibizsys.model.dataentity.logic.IPSDEMSLogic;
import net.ibizsys.model.dataentity.notify.IPSDENotify;
import net.ibizsys.model.dataentity.print.IPSDEPrint;
import net.ibizsys.model.dataentity.report.IPSDEReport;
import net.ibizsys.runtime.IModelRuntime;
import net.ibizsys.runtime.dataentity.action.IDEScriptLogicRuntime;
import net.ibizsys.runtime.dataentity.dataexport.IDEDataExportRuntime;
import net.ibizsys.runtime.dataentity.dataimport.IDEDataImportRuntime;
import net.ibizsys.runtime.dataentity.datasync.IDEDataSyncOutRuntime;
import net.ibizsys.runtime.dataentity.dts.IDEDTSQueueRuntime;
import net.ibizsys.runtime.dataentity.logic.IDELogicRuntime;
import net.ibizsys.runtime.dataentity.logic.IDEMSLogicRuntime;
import net.ibizsys.runtime.dataentity.notify.IDENotifyRuntime;
import net.ibizsys.runtime.dataentity.print.IDEPrintRuntime;
import net.ibizsys.runtime.dataentity.report.IDEReportRuntime;

/**
 * 实体运行时对象基类
 * @author lionlau
 *
 */
public interface IDataEntityRuntimeBase extends IModelRuntime{

	/**
	 * 消息：检查主键状态，数据已经被删除
	 */
	public final static String MSG_CHECKKEYSTATE_DELETE = "DATAENTITY_CHECKKEYSTATE_DELETE"; // 数据已经被删除，无法再次建立

	/**
	 * 消息：检查主键状态，数据已经存在，无法再次建立
	 */
	public final static String MSG_CHECKKEYSTATE_EXIST = "DATAENTITY_CHECKKEYSTATE_EXIST"; // 数据已经存在，无法再次建立

	/**
	 * 消息：保存失败，数据已经被删除
	 */
	public final static String MSG_SAVE_DATADELETE = "DATAENTITY_SAVE_DATADELETE"; // 数据已经被逻辑删除，无法保存

	/**
	 * 消息：获取更新前数据失败，数据未删除
	 */
	public final static String MSG_GETLAST_NOTCACHED = "DATAENTITY_GETLAST_NOTCACHED"; // 变更之前数据无效，没有在数据变更之前进行缓存

	/**
	 * 消息：检查基本值规则信息
	 */
	public final static String MSG_CHECKFIELDSIMPLERULE_INFO = "DATAENTITY_CHECKFIELDSIMPLERULE_INFO"; // 内容必须符合值规则

	/**
	 * 消息：检查数据值范围值规则信息
	 */
	public final static String MSG_CHECKFIELDDATASETRULE_INFO = "DATAENTITY_CHECKFIELDDATASETRULE_INFO"; // 值必须符合数据集合范围规则

	/**
	 * 消息 检查属性字符长度规则信息
	 */
	public final static String MSG_CHECKFIELDSTRINGLENGTHRULE_INFO = "DATAENTITY_CHECKFIELDSTRINGLENGTHRULE_INFO"; // 内容长度必须符合范围规则

	/**
	 * 消息 检查属性字符长度，值无效
	 */
	public final static String MSG_CHECKFIELDSTRINGLENGTHRULE_INVALIDVALUE = "DATAENTITY_CHECKFIELDSTRINGLENGTHRULE_INVALIDVALUE"; // 属性[%1$s]值不是字符类型

	/**
	 * 消息 检查属性值范围规则信息
	 */
	public final static String MSG_CHECKFIELDVALUERANGERULE_INFO = "DATAENTITY_CHECKFIELDVALUERANGERULE_INFO"; // 值必须符合值范围规则

	/**
	 * 消息：检查数据值引用出现递归关系
	 */
	public final static String MSG_CHECKFIELDRECURSIONRULE_INFO = "DATAENTITY_CHECKFIELDRECURSIONRULE_INFO"; // 值引用出现递归关系

	/**
	 * 消息 检查属性正则式规则信息
	 */
	public final static String MSG_CHECKFIELDREGEXRULE_INVALIDVALUE = "DATAENTITY_CHECKFIELDREGEXRULE_INVALIDVALUE"; // 属性[%1$s]值不是字符类型

	/**
	 * 消息 检查属性重复值规则，值无效
	 */
	public final static String MSG_CHECKFIELDDUPRULE_EMPTYVALUE = "DATAENTITY_CHECKFIELDDUPRULE_EMPTYVALUE"; // 属性[%1$s]没有值，不能检查

	/**
	 * 消息 检查属性重复值规则信息
	 */
	public final static String MSG_CHECKFIELDDUPRULE_INFO = "DATAENTITY_CHECKFIELDDUPRULE_INFO"; // 值重复

	/**
	 * 消息 导入模型失败，数据已经被删除
	 */
	public final static String MSG_IMPORTMODEL_DATADELETE = "DATAENTITY_IMPORTMODEL_DATADELETE"; // [%1$s]数据[%2$s]已经被删除，无法导入

	/**
	 * 消息 获取删除拒绝消息
	 */
	public final static String MSG_GETREMOVEREJECTMSG_INFO = "DATAENTITY_GETREMOVEREJECTMSG_INFO"; // %1$s[%2$s]存在关系数据[%3$s]，无法删除！
	
	
	/**
	 * 获取实体模型对象
	 * @return
	 */
	IPSDataEntity getPSDataEntity() throws Exception;
	
	
	/**
	 * 获取指定标识实体属性
	 * @param strName
	 * @return
	 */
	IPSDEField getPSDEField(String strName);
	
	
	/**
	 * 获取指定标识实体行为
	 * @param strName
	 * @return
	 */
	IPSDEAction getPSDEAction(String strName);
	
	
	/**
	 * 获取指定标识实体处理逻辑
	 * @param strName
	 * @return
	 */
	IPSDELogic getPSDELogic(String strName);
	
	
	/**
	 * 获取脚本逻辑运行时对象
	 * @param strLogicMode 逻辑模式
	 * @param strScriptCode
	 * @return
	 */
	IDEScriptLogicRuntime getDEScriptLogicRuntime(String strLogicMode, String strScriptCode);
	
	
	/**
	 * 获取实体数据同步（输出）运行时对象集合
	 * @return
	 */
	List<IDEDataSyncOutRuntime> getDEDataSyncOutRuntimes();
	
	
	/**
	 * 获取指定实体数据同步（输出）运行时对象
	 * @param iPSDEDataSync
	 * @return
	 */
	IDEDataSyncOutRuntime getDEDataSyncOutRuntime(IPSDEDataSync iPSDEDataSync);
	
	
	/**
	 * 获取实体通知运行时对象
	 * @param iPSDENotify
	 * @return
	 */
	IDENotifyRuntime getDENotifyRuntime(IPSDENotify iPSDENotify);
	
	
	/**
	 * 获取实体打印运行时对象
	 * @param iPSDEPrint
	 * @return
	 */
	IDEPrintRuntime getDEPrintRuntime(IPSDEPrint iPSDEPrint);
	
	
	
	/**
	 * 获取实体打印运行时对象
	 * @param strId
	 * @return
	 */
	IDEPrintRuntime getDEPrintRuntime(String strId);
	
	
	/**
	 * 获取实体打印运行时对象
	 * @param strId
	 * @param bTryMode
	 * @return
	 */
	IDEPrintRuntime getDEPrintRuntime(String strId, boolean bTryMode);
	
	
	/**
	 * 获取实体报表运行时对象
	 * @param iPSDEReport
	 * @return
	 */
	IDEReportRuntime getDEReportRuntime(IPSDEReport iPSDEReport);
	
	
	/**
	 * 获取实体报表运行时对象
	 * @param strId
	 * @return
	 */
	IDEReportRuntime getDEReportRuntime(String strId);
	
	
	/**
	 * 获取实体报表运行时对象
	 * @param strId
	 * @param bTryMode
	 * @return
	 */
	IDEReportRuntime getDEReportRuntime(String strId, boolean bTryMode);
	
	
	
	/**
	 * 获取实体逻辑运行时对象
	 * @param strId
	 * @return
	 */
	IDELogicRuntime getDELogicRuntime(String strId);
	
	
	/**
	 * 获取实体逻辑运行时对象
	 * @param strId
	 * @param bTryMode
	 * @return
	 */
	IDELogicRuntime getDELogicRuntime(String strId, boolean bTryMode);
	
	
	/**
	 * 获取实体逻辑运行时对象
	 * @param iPSDELogic
	 * @return
	 */
	IDELogicRuntime getDELogicRuntime(IPSDELogic iPSDELogic);
	
	
	
	/**
	 * 获取实体主状态逻辑运行时对象
	 * @param strId
	 * @return
	 */
	IDEMSLogicRuntime getDEMSLogicRuntime(String strId);
	
	
	/**
	 * 获取实体主状态逻辑运行时对象
	 * @param strId
	 * @param bTryMode
	 * @return
	 */
	IDEMSLogicRuntime getDEMSLogicRuntime(String strId, boolean bTryMode);
	
	
	/**
	 * 获取实体主状态逻辑运行时对象
	 * @param iPSDEMSLogic
	 * @return
	 */
	IDEMSLogicRuntime getDEMSLogicRuntime(IPSDEMSLogic iPSDEMSLogic);
	
	
	
	/**
	 * 获取实体数据导入运行时对象
	 * @param iPSDEDataImport
	 * @return
	 */
	IDEDataImportRuntime getDEDataImportRuntime(IPSDEDataImport iPSDEDataImport);
	
	
	
	/**
	 * 获取实体数据导入运行时对象
	 * @param strId
	 * @return
	 */
	IDEDataImportRuntime getDEDataImportRuntime(String strId);
	
	
	
	/**
	 * 获取实体数据导出运行时对象
	 * @param iPSDEDataExport
	 * @return
	 */
	IDEDataExportRuntime getDEDataExportRuntime(IPSDEDataExport iPSDEDataExport);
	
	
	
	/**
	 * 获取实体数据导出运行时对象
	 * @param strId
	 * @return
	 */
	IDEDataExportRuntime getDEDataExportRuntime(String strId);
	
	
	/**
	 * 获取实体数据同步运行时对象
	 * @param iPSDEDTSQueue
	 * @return
	 */
	IDEDTSQueueRuntime getDEDTSQueueRuntime(IPSDEDTSQueue iPSDEDTSQueue);
	
	
	/**
	 * 获取实体数据同步运行时对象
	 * @param strId
	 * @return
	 */
	IDEDTSQueueRuntime getDEDTSQueueRuntime(String strId);
	
	
	
	

}