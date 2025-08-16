package net.ibizsys.central.cloud.devops.core.addin;

import java.util.Collection;
import java.util.Map;

import net.ibizsys.central.cloud.core.util.domain.DCSystem;
import net.ibizsys.centralstudio.dto.PSSysTestPrjDTO;
import net.ibizsys.model.IPSSystemService;

/**
 * DevOps 测试工具对象接口
 * @author lionlau
 *
 */
public interface IDevOpsTestTool extends ICloudDevOpsUtilRTAddin {

	/**
	 * 测试项目类型：单元测试
	 */
	public final static String TESTPRJTYPE_UNITTEST = "UNITTEST";

	/**
	 * 测试项目类型：模型测试
	 */
	public final static String TESTPRJTYPE_MODELTEST = "MODELTEST";
	
	
	/**
	 * 测试项目类型：工作流测试
	 */
	public final static String TESTPRJTYPE_WFTEST = "WFTEST";
	
	
	/**
	 * 初始化测试项目集合
	 * @param dcSystem 机构系统
	 * @param iPSSystemService
	 * @param params
	 * @return
	 */
	Collection<PSSysTestPrjDTO> initTestProjects(DCSystem dcSystem, IPSSystemService iPSSystemService, Map<String, Object> params);
	
	
	
	
	
	
	/**
	 * 运行测试计划
	 * @param dcSystem
	 * @param iPSSystemService
	 * @param params
	 * @return
	 */
	PSSysTestPrjDTO runTestProject(DCSystem dcSystem, IPSSystemService iPSSystemService, Map<String, Object> params);
	
}
