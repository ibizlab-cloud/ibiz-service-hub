package net.ibizsys.central.cloud.core.util.groovy;

import java.util.HashMap;
import java.util.Map;

import org.apache.commons.logging.LogFactory;
import org.springframework.util.ObjectUtils;
import org.springframework.util.StringUtils;

import net.ibizsys.central.ISystemRuntimeContext;
import net.ibizsys.central.cloud.core.IServiceSystemRuntime;
import net.ibizsys.central.cloud.core.ai.ISysAIFactoryRuntime;
import net.ibizsys.central.cloud.core.dataentity.IDataEntityRuntime;
import net.ibizsys.central.cloud.core.dataentity.service.IProxyDEService;
import net.ibizsys.central.cloud.core.security.EmployeeContext;
import net.ibizsys.central.dataentity.service.IDEService;
import net.ibizsys.model.PSModelUtils;
import net.ibizsys.model.dataentity.IPSDataEntity;
import net.ibizsys.runtime.security.IUserContext;

public class SystemRTGroovyContext extends net.ibizsys.central.util.groovy.SystemRTGroovyContext implements ISystemRTGroovyContext{

	private static final org.apache.commons.logging.Log log = LogFactory.getLog(SystemRTGroovyContext.class);
	
	private Map<String, String> modelRuntimeTagMap = new HashMap<String, String>();
	
	public SystemRTGroovyContext(ISystemRuntimeContext systemRuntimeContext) {
		super(systemRuntimeContext);
		
		prepareModelRuntimeTagMap();
	}

	protected void prepareModelRuntimeTagMap() {
		
		if(this.getSystemRuntime() instanceof IServiceSystemRuntime) {
			IServiceSystemRuntime iServiceSystemRuntime = (IServiceSystemRuntime)this.getSystemRuntime();
			java.util.List<IPSDataEntity> psDataEntityList = this.getSystemRuntime().getPSSystem().getAllPSDataEntities();
			if(!ObjectUtils.isEmpty(psDataEntityList)) {
				for(IPSDataEntity iPSDataEntity : psDataEntityList) {
					try {
						String strDEServiceObjectName = iServiceSystemRuntime.getRTCodeUtils().getDEServiceObjectName(iPSDataEntity);
						if(StringUtils.hasLength(strDEServiceObjectName)) {
							String strKey = String.format("%1$s|%2$s", MODELTYPE_DESERVICE, strDEServiceObjectName);
							modelRuntimeTagMap.put(strKey, PSModelUtils.calcUniqueTag(iPSDataEntity.getPSSystemModule(), iPSDataEntity.getName()));
						}
					}
					catch (Exception ex) {
						log.error(ex);
					}
				}
			}
		}
	}
	
	@Override
	public IUserContext user() {
		return EmployeeContext.getCurrentMust();
	}
	
	
	@Override
	public ISystemRTGroovyContext main() {
		return ((IServiceSystemRuntime)this.getSystemRuntime()).getMainSystemRuntime(false).getSystemRTGroovyContext();
	}
	
	@Override
	public ISysAIFactoryRuntime aifactory(String tag) {
		return ((IServiceSystemRuntime)this.getSystemRuntime()).getSysAIFactoryRuntime(tag, false);
	}

	@Override
	public Object getModelRuntime(Class<?> theClass, String tag) {
		if (IProxyDEService.class.isAssignableFrom(theClass)) {
			if(theClass.isInterface()) {
				//Object dataEntityRuntime = this.getModelRuntime(MODELTYPE_DATAENTITY, tag);
				Object dataEntityRuntime = this.getSystemRuntime().getDataEntityRuntime(tag, true);
				if(dataEntityRuntime != null) {
					if(dataEntityRuntime instanceof IDataEntityRuntime) {
						return ((IDataEntityRuntime)dataEntityRuntime).getProxyDEService(theClass);
					}
					throw new RuntimeException(String.format("实体运行时对象[%1$s][%2$s]类型不支持", dataEntityRuntime, tag));
				}
				else
					if(this.getSystemRuntime() instanceof IServiceSystemRuntime) {
						IServiceSystemRuntime iServiceSystemRuntime = (IServiceSystemRuntime)this.getSystemRuntime();
						IServiceSystemRuntime mainSystemRuntime = iServiceSystemRuntime.getMainSystemRuntime(true);
						if(mainSystemRuntime != null) {
							return mainSystemRuntime.getSystemRTGroovyContext().getModelRuntime(theClass, tag);
						}
					}
				
				return this.getSystemRuntime().getDataEntityRuntime(tag, false);
			}
		}
		
		if (IDEService.class.isAssignableFrom(theClass)) {
			if(theClass.isInterface()) {
				String strKey = String.format("%1$s|%2$s", MODELTYPE_DESERVICE, theClass.getCanonicalName());
				String strTag = modelRuntimeTagMap.get(strKey);
				if(StringUtils.hasLength(strTag)) {
					return getModelRuntime(MODELTYPE_DESERVICE, strTag);
				}
			}
			return getModelRuntime(MODELTYPE_DESERVICE, tag);
		}
		
		if(ISysAIFactoryRuntime.class.isAssignableFrom(theClass)) {
			return this.getModelRuntime(MODELTYPE_AIFACTORY, tag);
		}
		
		return super.getModelRuntime(theClass, tag);
	}
	
	
	@Override
	public Object getModelRuntime(String type, String tag) {
		if(MODELTYPE_AIFACTORY.equalsIgnoreCase(type)) {
			return this.aifactory(tag);
		}
		return super.getModelRuntime(type, tag);
	}
}
