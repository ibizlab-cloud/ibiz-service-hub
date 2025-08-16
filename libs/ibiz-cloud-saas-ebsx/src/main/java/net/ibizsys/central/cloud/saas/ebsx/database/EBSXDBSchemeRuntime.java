package net.ibizsys.central.cloud.saas.ebsx.database;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.lang3.ObjectUtils;
import org.springframework.util.StringUtils;

import net.ibizsys.central.cloud.core.security.EmployeeContext;
import net.ibizsys.central.cloud.core.security.IEmployeeContext;
import net.ibizsys.central.cloud.core.util.CloudCacheTagUtils;
import net.ibizsys.central.cloud.core.util.domain.Application;
import net.ibizsys.central.cloud.core.util.domain.CodeList;
import net.ibizsys.central.cloud.core.util.domain.Config;
import net.ibizsys.central.cloud.core.util.domain.DCSystem;
import net.ibizsys.central.cloud.core.util.domain.DepCenter;
import net.ibizsys.central.cloud.core.util.domain.Department;
import net.ibizsys.central.cloud.core.util.domain.DeptMember;
import net.ibizsys.central.cloud.core.util.domain.Employee;
import net.ibizsys.central.cloud.core.util.domain.MetaDynaModel;
import net.ibizsys.central.cloud.core.util.domain.MsgTemplate;
import net.ibizsys.central.cloud.core.util.domain.OpenAccess;
import net.ibizsys.central.cloud.core.util.domain.OpenDept;
import net.ibizsys.central.cloud.core.util.domain.OpenUser;
import net.ibizsys.central.cloud.core.util.domain.Organization;
import net.ibizsys.central.cloud.core.util.domain.Report;
import net.ibizsys.central.cloud.core.util.domain.Role;
import net.ibizsys.central.cloud.core.util.domain.Team;
import net.ibizsys.central.cloud.core.util.domain.TeamMember;
import net.ibizsys.central.cloud.core.util.domain.UserRole;
import net.ibizsys.central.cloud.core.util.domain.WFDefinition;
import net.ibizsys.central.cloud.core.util.domain.WFGroup;
import net.ibizsys.central.cloud.core.util.domain.WFMember;
import net.ibizsys.central.database.SysDBSchemeRuntime;
import net.ibizsys.central.sysutil.ISysCacheUtilRuntime;
import net.ibizsys.runtime.util.LogLevels;

public class EBSXDBSchemeRuntime extends SysDBSchemeRuntime {

	private static final org.apache.commons.logging.Log log = org.apache.commons.logging.LogFactory.getLog(EBSXDBSchemeRuntime.class);
	
	private static Map<String, String[]> AllDataCacheTagMap = new HashMap<String, String[]>();
	private static Map<String, String[]> AllDataCacheTagMap2 = new HashMap<String, String[]>();
	private static Map<String, String[]> UserDataCacheTagMap = new HashMap<String, String[]>();
	
	static {
		
		AllDataCacheTagMap.put("IBZORG", new String[] {Organization.class.getSimpleName()});//组织
		AllDataCacheTagMap.put("IBZDEPT", new String[] {Department.class.getSimpleName()});//部门
		AllDataCacheTagMap.put("IBZEMP", new String[] {Employee.class.getSimpleName(), WFMember.class.getSimpleName()});//雇员
		AllDataCacheTagMap.put("IBZDEPTMEMBER", new String[] {DeptMember.class.getSimpleName()});//部门成员
		AllDataCacheTagMap.put("IBZTEAM", new String[] {Team.class.getSimpleName()});//组
		AllDataCacheTagMap.put("IBZTEAMMEMBER", new String[] {TeamMember.class.getSimpleName()});//组成员
		
		
		AllDataCacheTagMap.put("IBZROLE", new String[] {Role.class.getSimpleName()});//系统角色
		AllDataCacheTagMap.put("IBZUSER_ROLE", new String[] {UserRole.class.getSimpleName()});//用户角色成员
		
		
		AllDataCacheTagMap.put("IBZWFGROUP", new String[] {WFGroup.class.getSimpleName()});//工作流组
		AllDataCacheTagMap.put("IBZWFMEMBER", new String[] {WFMember.class.getSimpleName()});//工作流组成员
		AllDataCacheTagMap.put("IBZWFDEFINITION", new String[] {WFDefinition.class.getSimpleName()});//工作流定义
		
		
		AllDataCacheTagMap.put("IBZCENTER", new String[] {DepCenter.class.getSimpleName()});//部署中心
		AllDataCacheTagMap.put("IBZPSSYSTEM", new String[] {net.ibizsys.central.cloud.core.util.domain.System.class.getSimpleName()});//平台系统
		AllDataCacheTagMap.put("IBZPSSYSTEMAPP", new String[] {Application.class.getSimpleName()});//平台应用
		AllDataCacheTagMap.put("IBZDCSYSTEM", new String[] {DCSystem.class.getSimpleName()});//平台租户系统
		
		
		AllDataCacheTagMap.put("IBZOPENACCESS", new String[] {OpenAccess.class.getSimpleName()});//开放平台访问
		AllDataCacheTagMap.put("IBZOPENDEPT", new String[] {OpenDept.class.getSimpleName()});//开放部门访问
		AllDataCacheTagMap.put("IBZOPENUSER", new String[] {OpenUser.class.getSimpleName()});//开放用户访问
		
		AllDataCacheTagMap.put("IBZDICTCATALOG", new String[] {CodeList.class.getSimpleName()});//代码表
		AllDataCacheTagMap.put("IBZDICTOPTION", new String[] {CodeList.class.getSimpleName()});//代码项
		AllDataCacheTagMap.put("IBZCFG", new String[] {Config.class.getSimpleName()});//配置
		
		AllDataCacheTagMap.put("IBZMSGTEMPL", new String[] {MsgTemplate.class.getSimpleName()});//消息模板
		AllDataCacheTagMap.put("IBZREPORT", new String[] {Report.class.getSimpleName()});//报表
		
		
		AllDataCacheTagMap.put("IBZDYNAMICMODEL", new String[] {MetaDynaModel.class.getSimpleName()});//动态模型配置
		
		
		//用户配置
		UserDataCacheTagMap.put("IBZCFG", new String[] {Config.class.getSimpleName()});//配置
		
		//全局存在配置
		AllDataCacheTagMap2.put("IBZDCSYSTEM", new String[] {DCSystem.class.getSimpleName()});//平台租户系统
		
	}
	
	private ISysCacheUtilRuntime iSysCacheUtilRuntime = null;

	protected ISysCacheUtilRuntime getSysCacheUtilRuntime() {
		if(this.iSysCacheUtilRuntime == null) {
			this.iSysCacheUtilRuntime = this.getSystemRuntime().getSysCacheUtilRuntime(false);
		}
		return this.iSysCacheUtilRuntime;
	}
	
	@Override
	public Object insert(String strTableName, List<Map<String, Object>> args, Map<String, Object> extParamMap) throws Throwable {
		Object ret = super.insert(strTableName, args, extParamMap);
		resetCloudCache(strTableName);
		return ret;
	}

	@Override
	public Object update(String strTableName, List<Map<String, Object>> args, Map<String, Object> extParamMap) throws Throwable {
		Object ret = super.update(strTableName, args, extParamMap);
		resetCloudCache(strTableName);
		return ret;
	}

	@Override
	public Object insert(String strTableName, Map<String, Object> paramMap, Map<String, Object> extParamMap) throws Throwable {
		Object ret = super.insert(strTableName, paramMap, extParamMap);
		resetCloudCache(strTableName);
		return ret;
	}

	@Override
	public Object update(String strTableName, Map<String, Object> paramMap, Map<String, Object> extParamMap) throws Throwable {
		Object ret = super.update(strTableName, paramMap, extParamMap);
		resetCloudCache(strTableName);
		return ret;
	}

	@Override
	public Object delete(String strTableName, Map<String, Object> paramMap, Map<String, Object> extParamMap) throws Throwable {
		Object ret = super.delete(strTableName, paramMap, extParamMap);
		resetCloudCache(strTableName);
		return ret;
	}

	@Override
	public Object delete(String strTableName, List<Map<String, Object>> args, Map<String, Object> extParamMap) throws Throwable {
		Object ret = super.delete(strTableName, args, extParamMap);
		resetCloudCache(strTableName);
		return ret;
	}

	@Override
	public int executeSQL(String strSQL, List<Object> params) throws Throwable {
		int nRet = super.executeSQL(strSQL, params);
		return nRet;
	}
	
	
	protected void resetCloudCache(String strTableName) {
		
		IEmployeeContext iEmployeeContext = EmployeeContext.getCurrent();
		if(iEmployeeContext == null) {
			return;
		}
		
		String[] tags = AllDataCacheTagMap.get(strTableName);
		if(!ObjectUtils.isEmpty(tags)) {
			boolean bGlobal = AllDataCacheTagMap2.containsKey(strTableName);
			try {
				String strDCId = iEmployeeContext.getTenant();
				
				for(String strTag : tags) {
					if(StringUtils.hasLength(strDCId)) {
						this.getSysCacheUtilRuntime().reset(CloudCacheTagUtils.getCloudDataCat(strDCId, strTag));
						log.debug(String.format("重置Cloud数据缓存[%1$s]", CloudCacheTagUtils.getCloudDataCat(strDCId, strTag)));
						//判断在租户的情况下进一步清除全局配置
						if(bGlobal) {
							this.getSysCacheUtilRuntime().reset(CloudCacheTagUtils.getCloudDataCat(CloudCacheTagUtils.GLOBALTAG, strTag));
							log.debug(String.format("重置Cloud数据缓存[%1$s]", CloudCacheTagUtils.getCloudDataCat(CloudCacheTagUtils.GLOBALTAG, strTag)));
						}
					}
					else {
						this.getSysCacheUtilRuntime().reset(CloudCacheTagUtils.getCloudDataCat(CloudCacheTagUtils.GLOBALTAG, strTag));
						log.debug(String.format("重置Cloud数据缓存[%1$s]", CloudCacheTagUtils.getCloudDataCat(CloudCacheTagUtils.GLOBALTAG, strTag)));
					}
				}
			}
			catch (Throwable ex) {
				log.error(String.format("重置Cloud缓存数据[%1$s]发生异常，%2$s", tags, ex.getMessage()), ex);
				this.getSystemRuntime().log(LogLevels.ERROR, this.getClass().getName(), String.format("重置Cloud缓存数据[%1$s]发生异常，%2$s", tags, ex.getMessage()), null);
			}
		}
		
		tags = UserDataCacheTagMap.get(strTableName);
		if(!ObjectUtils.isEmpty(tags)) {
			try {
				String strDCId = iEmployeeContext.getTenant();
				String strUserId = iEmployeeContext.getUserid();
				for(String strTag : tags) {
					if(StringUtils.hasLength(strDCId)) {
						this.getSysCacheUtilRuntime().reset(CloudCacheTagUtils.getCloudDataCat(strDCId, strUserId, strTag));
						log.debug(String.format("重置Cloud数据缓存[%1$s]", CloudCacheTagUtils.getCloudDataCat(strDCId, strUserId, strTag)));
					}
					else {
						this.getSysCacheUtilRuntime().reset(CloudCacheTagUtils.getCloudDataCat(CloudCacheTagUtils.GLOBALTAG, strUserId, strTag));
						log.debug(String.format("重置Cloud数据缓存[%1$s]", CloudCacheTagUtils.getCloudDataCat(CloudCacheTagUtils.GLOBALTAG, strUserId, strTag)));
					}
				}
			}
			catch (Throwable ex) {
				log.error(String.format("重置Cloud缓存数据[%1$s]发生异常，%2$s", tags, ex.getMessage()), ex);
				this.getSystemRuntime().log(LogLevels.ERROR, this.getClass().getName(), String.format("重置Cloud缓存数据[%1$s]发生异常，%2$s", tags, ex.getMessage()), null);
			}
		}
		
	}
	
	
}
