package net.ibizsys.central.cloud.core.database;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.lang3.ObjectUtils;

import net.ibizsys.central.cloud.core.security.EmployeeContext;
import net.ibizsys.central.cloud.core.security.IEmployeeContext;
import net.ibizsys.central.dataentity.IDataEntityRuntime;
import net.ibizsys.central.util.IEntity;
import net.ibizsys.model.dataentity.defield.IPSDEField;
import net.ibizsys.runtime.dataentity.defield.DEFPredefinedTypes;
import net.ibizsys.runtime.util.SqlParam;

public class SysDBPersistentAdapter extends net.ibizsys.central.database.SysDBPersistentAdapter {

    @Override
    protected Object executeInsert(String strTableName, Map<String, Object> arg, Map<String, Object> extParamMap, IDataEntityRuntime iDataEntityRuntime, IEntity iEntity, boolean bSysMode) throws Throwable {
    	if(!bSysMode) {
    		if (extParamMap == null) {
                extParamMap = new HashMap<String, Object>();
            }
    	}
    	fillInsertParams(iDataEntityRuntime, arg, extParamMap, bSysMode);
        return super.executeInsert(strTableName, arg, extParamMap, iDataEntityRuntime, iEntity, bSysMode);
    }

    @Override
    protected Object executeInsert(String strTableName, List<Map<String, Object>> args, Map<String, Object> extParamMap, IDataEntityRuntime iDataEntityRuntime, List<? extends IEntity> datas, boolean bSysMode) throws Throwable {
    	if (!ObjectUtils.isEmpty(args)) {
    		if(!bSysMode) {
        		if (extParamMap == null) {
                    extParamMap = new HashMap<String, Object>();
                }
        	}
        	Map<String, Object> extParamMap2 = extParamMap;
            args.forEach(arg -> fillInsertParams(iDataEntityRuntime, arg, extParamMap2, bSysMode));
        }
        return super.executeInsert(strTableName, args, extParamMap, iDataEntityRuntime, datas, bSysMode);
    }

    @Override
    protected Object executeUpdate(String strTableName, Map<String, Object> arg, Map<String, Object> extParamMap, IDataEntityRuntime iDataEntityRuntime, IEntity iEntity, boolean bSysMode) throws Throwable {
    	if(!bSysMode) {
    		if (extParamMap == null) {
                extParamMap = new HashMap<String, Object>();
            }
    	}
    	fillUpdateParams(iDataEntityRuntime, arg, extParamMap, bSysMode);
        return super.executeUpdate(strTableName, arg, extParamMap, iDataEntityRuntime, iEntity, bSysMode);
    }

    @Override
    protected Object executeUpdate(String strTableName, List<Map<String, Object>> args, Map<String, Object> extParamMap, IDataEntityRuntime iDataEntityRuntime, List<? extends IEntity> datas, boolean bSysMode) throws Throwable {
    	if (!ObjectUtils.isEmpty(args)) {
    		if(!bSysMode) {
        		if (extParamMap == null) {
                    extParamMap = new HashMap<String, Object>();
                }
        	}
    		Map<String, Object> extParamMap2 = extParamMap;
        	 args.forEach(arg -> fillUpdateParams(iDataEntityRuntime, arg, extParamMap2, bSysMode));
        }
        return super.executeUpdate(strTableName, args, extParamMap, iDataEntityRuntime, datas, bSysMode);
    }

    /**
     * 插入时数据填充
     *
     * @param iDataEntityRuntime
     * @param extParamMap
     * @param bSysMode
     */
    protected void fillInsertParams(IDataEntityRuntime iDataEntityRuntime, Map<String, Object> arg, Map<String, Object> extParamMap, boolean bSysMode) {
        if (!bSysMode && extParamMap!=null) {

            IEmployeeContext employeeContext = EmployeeContext.getCurrentMust();
            IPSDEField iPSDEField = iDataEntityRuntime.getPSDEFieldByPredefinedType(DEFPredefinedTypes.CREATEMAN, true);
            if (iPSDEField != null) {
                extParamMap.put(iPSDEField.getLowerCaseName(), SqlParam.value(employeeContext.getUserid()));
            }

            iPSDEField = iDataEntityRuntime.getPSDEFieldByPredefinedType(DEFPredefinedTypes.CREATEMANNAME, true);
            if (iPSDEField != null) {
                extParamMap.put(iPSDEField.getLowerCaseName(), SqlParam.value(employeeContext.getUsername()));
            }

            iPSDEField = iDataEntityRuntime.getPSDEFieldByPredefinedType(DEFPredefinedTypes.UPDATEMAN, true);
            if (iPSDEField != null) {
                extParamMap.put(iPSDEField.getLowerCaseName(), SqlParam.value(employeeContext.getUserid()));
            }

            iPSDEField = iDataEntityRuntime.getPSDEFieldByPredefinedType(DEFPredefinedTypes.UPDATEMANNAME, true);
            if (iPSDEField != null) {
                extParamMap.put(iPSDEField.getLowerCaseName(), SqlParam.value(employeeContext.getUsername()));
            }

            iPSDEField = iDataEntityRuntime.getPSDEFieldByPredefinedType(DEFPredefinedTypes.ORGID, true);
            if (iPSDEField != null && ObjectUtils.isEmpty(arg.get(iPSDEField.getLowerCaseName()))) {
                extParamMap.put(iPSDEField.getLowerCaseName(), SqlParam.value(employeeContext.getOrgid()));
            }

            iPSDEField = iDataEntityRuntime.getPSDEFieldByPredefinedType(DEFPredefinedTypes.ORGNAME, true);
            if (iPSDEField != null && ObjectUtils.isEmpty(arg.get(iPSDEField.getLowerCaseName()))) {
                extParamMap.put(iPSDEField.getLowerCaseName(), SqlParam.value(employeeContext.getOrgname()));
            }

            iPSDEField = iDataEntityRuntime.getPSDEFieldByPredefinedType(DEFPredefinedTypes.ORGSECTORID, true);
            if (iPSDEField != null && ObjectUtils.isEmpty(arg.get(iPSDEField.getLowerCaseName()))) {
                extParamMap.put(iPSDEField.getLowerCaseName(), SqlParam.value(employeeContext.getDeptid()));
            }

            iPSDEField = iDataEntityRuntime.getPSDEFieldByPredefinedType(DEFPredefinedTypes.ORGSECTORNAME, true);
            if (iPSDEField != null && ObjectUtils.isEmpty(arg.get(iPSDEField.getLowerCaseName()))) {
                extParamMap.put(iPSDEField.getLowerCaseName(), SqlParam.value(employeeContext.getDeptname()));
            }
        }
    }

    /**
     * 插入时数据填充
     *
     * @param iDataEntityRuntime
     * @param extParamMap
     * @param bSysMode
     */
    protected void fillUpdateParams(IDataEntityRuntime iDataEntityRuntime, Map<String, Object> arg, Map<String, Object> extParamMap, boolean bSysMode) {
        if (!bSysMode && extParamMap!=null) {
            IEmployeeContext employeeContext = EmployeeContext.getCurrentMust();
            IPSDEField iPSDEField = iDataEntityRuntime.getPSDEFieldByPredefinedType(DEFPredefinedTypes.UPDATEMAN, true);
            if (iPSDEField != null) {
                extParamMap.put(iPSDEField.getLowerCaseName(), SqlParam.value(employeeContext.getUserid()));
            }

            iPSDEField = iDataEntityRuntime.getPSDEFieldByPredefinedType(DEFPredefinedTypes.UPDATEMANNAME, true);
            if (iPSDEField != null) {
                extParamMap.put(iPSDEField.getLowerCaseName(), SqlParam.value(employeeContext.getUsername()));
            }
        }
    }
    
}
