package net.ibizsys.runtime.wf;

/**
 * 工作流角色类型
 * @author lionlau
 *
 */
public class WFRoleTypes {

	  /**
     *  用户组，注意：值为对象值，不能直接用于 == 比较
     */
    public final static String USERGROUP = "USERGROUP";
    
    /**
     *  系统角色，注意：值为对象值，不能直接用于 == 比较
     */
    public final static String SYSUSERROLE = "SYSUSERROLE";
    
    /**
     *  自定义，注意：值为对象值，不能直接用于 == 比较
     */
    public final static String CUSTOM = "CUSTOM";
    /**
     *  实体数据集合，注意：值为对象值，不能直接用于 == 比较
     */
    public final static String DEDATASET = "DEDATASET";
    /**
     *  当前组织，注意：值为对象值，不能直接用于 == 比较
     */
    public final static String ORG = "ORG";
    /**
     *  当前组织父组织，注意：值为对象值，不能直接用于 == 比较
     */
    public final static String PORG = "PORG";
    /**
     *  当前部门，注意：值为对象值，不能直接用于 == 比较
     */
    public final static String ORGSECTOR = "ORGSECTOR";
    /**
     *  当前部门父部门，注意：值为对象值，不能直接用于 == 比较
     */
    public final static String PORGSECTOR = "PORGSECTOR";
    /**
     *  机构组，注意：值为对象值，不能直接用于 == 比较
     */
    public final static String ORGGROUP = "ORGGROUP";
    /**
     *  部门组，注意：值为对象值，不能直接用于 == 比较
     */
    public final static String ORGSECTORGROUP = "ORGSECTORGROUP";
    /**
     *  机构人员组，注意：值为对象值，不能直接用于 == 比较
     */
    public final static String ORGUSERGROUP = "ORGUSERGROUP";
    /**
     *  部门人员组，注意：值为对象值，不能直接用于 == 比较
     */
    public final static String ORGSECTORUSERGROUP = "ORGSECTORUSERGROUP";
    /**
     *  当前组织管理员，注意：值为对象值，不能直接用于 == 比较
     */
    public final static String ORGADMIN = "ORGADMIN";
    /**
     *  当前部门管理员，注意：值为对象值，不能直接用于 == 比较
     */
    public final static String ORGSECTORADMIN = "ORGSECTORADMIN";
}
