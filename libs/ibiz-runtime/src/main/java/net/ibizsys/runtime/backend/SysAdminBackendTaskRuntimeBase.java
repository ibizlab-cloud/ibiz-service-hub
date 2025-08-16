package net.ibizsys.runtime.backend;

import org.aspectj.lang.ProceedingJoinPoint;

/**
 * 系统管理后台任务运行时对象
 * @author lionlau
 *
 */
public abstract class SysAdminBackendTaskRuntimeBase extends SysBackendTaskRuntimeBase{

	private static final org.apache.commons.logging.Log log = org.apache.commons.logging.LogFactory.getLog(SysAdminBackendTaskRuntimeBase.class);
	
	/**
	 * 安装基础数据
	 */
	public final String ADMINCMD_INSTALLBASEDATA = "INSTALLBASEDATA";
	
	
	/**
	 * 安装示例数据
	 */
	public final String ADMINCMD_INSTALLSAMPLEDATA = "INSTALLSAMPLEDATA";
	
	
	/**
	 * 安装测试数据
	 */
	public final String ADMINCMD_INSTALLTESTDATA = "INSTALLTESTDATA";
	
	
	@Override
	protected Object onExecute(String strDynaInstId, String strParam, ProceedingJoinPoint joinPoint) throws Throwable {
		
		if(ADMINCMD_INSTALLBASEDATA.equals(strParam)) {
			//安装基础数据
			this.getSystemRuntime().installBaseDatas(null);
		}
		else
			if(ADMINCMD_INSTALLSAMPLEDATA.equals(strParam)) {
				//安装示例数据
				this.getSystemRuntime().installSampleDatas(null);
			}
			else
				if(ADMINCMD_INSTALLTESTDATA.equals(strParam)) {
					//安装测试数据
					this.getSystemRuntime().installTestDatas(null);
				}
		
		if(joinPoint != null) {
			return joinPoint.proceed();
		}
		return null;
	}
}
