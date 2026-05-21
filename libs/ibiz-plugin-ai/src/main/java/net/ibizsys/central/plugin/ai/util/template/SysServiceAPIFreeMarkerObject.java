package net.ibizsys.central.plugin.ai.util.template;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;

import org.springframework.data.domain.Page;
import org.springframework.util.AntPathMatcher;
import org.springframework.util.ObjectUtils;
import org.springframework.util.PathMatcher;
import org.springframework.util.StringUtils;

import net.ibizsys.central.ISystemRuntime;
import net.ibizsys.central.cloud.core.IServiceSystemRuntime;
import net.ibizsys.central.cloud.core.ai.ISysAIAgentRuntimeContext;
import net.ibizsys.central.cloud.core.service.ISysServiceAPIRuntime;
import net.ibizsys.central.cloud.core.spring.rt.ServiceHub;
import net.ibizsys.central.cloud.core.system.IExtensionSysRefRuntime;
import net.ibizsys.central.cloud.core.util.domain.DeploySystem;
import net.ibizsys.central.dataentity.service.IDEServiceAPIRuntime;
import net.ibizsys.central.service.SysServiceAPILevels;
import net.ibizsys.central.util.IEntityDTO;
import net.ibizsys.central.util.Inflector;
import net.ibizsys.central.util.SysServiceAPIRuntimeHolder;
import net.ibizsys.central.util.script.IScriptEntity;
import net.ibizsys.model.IPSSystemService;
import net.ibizsys.runtime.security.UserContext;
import net.ibizsys.runtime.util.ExceptionUtils;
import net.ibizsys.runtime.util.IAppContext;
import net.ibizsys.runtime.util.JsonUtils;

public class SysServiceAPIFreeMarkerObject {

	private static final org.apache.commons.logging.Log log = org.apache.commons.logging.LogFactory.getLog(SysServiceAPIFreeMarkerObject.class);
	protected final static PathMatcher UriActionMatcher = new AntPathMatcher();
	protected final static String[] patterns = new String[] { "/{dename}/{method}", "/{dename}/{key}/{method}", "/{pdename}/{pkey}/{dename}/{method}", "/{pdename}/{pkey}/{dename}/{key}/{method}", "/**/{pdename}/{pkey}/{dename}/{method}/", "/**/{pdename}/{pkey}/{dename}/{key}/{method}" };

	final ISysServiceAPIRuntime iSysServiceAPIRuntime;
	final IServiceSystemRuntime iSystemRuntime;

	private ISysAIAgentRuntimeContext iSysAIAgentRuntimeContext = null;

	public SysServiceAPIFreeMarkerObject(ISysAIAgentRuntimeContext iSysAIAgentRuntimeContext, ISysServiceAPIRuntime iSysServiceAPIRuntime) {
		this.iSysAIAgentRuntimeContext = iSysAIAgentRuntimeContext;
		this.iSystemRuntime = (IServiceSystemRuntime)iSysAIAgentRuntimeContext.getModelRuntime().getAIFactoryRuntime().getSystemRuntime();
		this.iSysServiceAPIRuntime = iSysServiceAPIRuntime;
	}

	public SysServiceAPIFreeMarkerObject(ISystemRuntime iSystemRuntime, ISysServiceAPIRuntime iSysServiceAPIRuntime) {
		this.iSystemRuntime = (IServiceSystemRuntime)iSystemRuntime;
		this.iSysServiceAPIRuntime = iSysServiceAPIRuntime;
	}
	
	public Object invoke(String strUrl, String strBody) {
		return this.invoke(this.getSysServiceAPIRuntime(), strUrl, strBody);
	}
	
	public Object invoke(String strSubSysTag, String strUrl, String strBody) {
		ISysServiceAPIRuntime iSysServiceAPIRuntime = this.getSysServiceAPIRuntime(strSubSysTag, null, false);
		return this.invoke(iSysServiceAPIRuntime, strUrl, strBody);
	}
	
	public Object invoke(String strSubSysTag, String strAPICodeName, String strUrl, String strBody) {
		ISysServiceAPIRuntime iSysServiceAPIRuntime = this.getSysServiceAPIRuntime(strSubSysTag, strAPICodeName, false);
		return this.invoke(iSysServiceAPIRuntime, strUrl, strBody);
	}
			
	protected ISysServiceAPIRuntime getSysServiceAPIRuntime(String strSubSysTag, String strAPICodeName, boolean bTryMode){
		IServiceSystemRuntime mainServiceSystemRuntime = StringUtils.hasLength(iSystemRuntime.getMainSystemId())? iSystemRuntime.getMainSystemRuntime(false):iSystemRuntime;
		if(StringUtils.hasLength(strSubSysTag)) {
			final Collection<IExtensionSysRefRuntime> last = mainServiceSystemRuntime.getExtensionSysRefRuntimes(false);
			if(!ObjectUtils.isEmpty(last)) {
				for(IExtensionSysRefRuntime iExtensionSysRefRuntime : last) {
					DeploySystem deploySystem = iExtensionSysRefRuntime.getDeploySystem();
					if(deploySystem == null) {
						continue;
					}
					
					IPSSystemService iPSSystemService = iExtensionSysRefRuntime.getPSSystemService();
					if(strSubSysTag.equalsIgnoreCase(iPSSystemService.getPSSystem().getCodeName())) {
						ISystemRuntime loadedSystemRuntime = ServiceHub.getInstance().getLoadedSystemRuntime(deploySystem.getDeploySystemId());
						if(StringUtils.hasLength(strAPICodeName)) {
							ISysServiceAPIRuntime iSysServiceAPIRuntime = (ISysServiceAPIRuntime)loadedSystemRuntime.getSysServiceAPIRuntime(strAPICodeName, true);
							if(iSysServiceAPIRuntime != null) {
								if(iSysServiceAPIRuntime.getPSSysServiceAPI().getCodeName().indexOf("_") != 0
										&& iSysServiceAPIRuntime.getAPILevel() == SysServiceAPILevels.USER) {
									return iSysServiceAPIRuntime;	
								}
							}
						}
						else {
							return ((IServiceSystemRuntime)loadedSystemRuntime).getDefaultSysServiceAPIRuntime(false);
						}
					}
				}
			}
			throw new RuntimeException(String.format("指定子系统[%1$s]服务接口[%2$s]不存在", strSubSysTag, strAPICodeName));
		}
		else {
			if(StringUtils.hasLength(strAPICodeName)) {
				ISysServiceAPIRuntime iSysServiceAPIRuntime = (ISysServiceAPIRuntime)mainServiceSystemRuntime.getSysServiceAPIRuntime(strAPICodeName, true);
				if(iSysServiceAPIRuntime != null) {
					if(iSysServiceAPIRuntime.getPSSysServiceAPI().getCodeName().indexOf("_") != 0
							&& iSysServiceAPIRuntime.getAPILevel() == SysServiceAPILevels.USER) {
						return iSysServiceAPIRuntime;	
					}
				}
			}
			else {
				return mainServiceSystemRuntime.getDefaultSysServiceAPIRuntime(false);
			}
			throw new RuntimeException(String.format("指定主系统服务接口[%1$s]不存在", strAPICodeName));
		}
	}
	
	protected Object invoke(ISysServiceAPIRuntime iSysServiceRuntime ,String strUrl, String strBody) {
		Map<String, String> pathVariables = null;
		for (String strPattern : patterns) {
			if (UriActionMatcher.match(strPattern, strUrl)) {
				pathVariables = UriActionMatcher.extractUriTemplateVariables(strPattern, strUrl);
				log.debug(String.format("%1$s ==> %2$s", strUrl, pathVariables));
				break;
			}
		}
		if (ObjectUtils.isEmpty(pathVariables)) {
			throw new RuntimeException(String.format("无法识别的请求路径[%1$s]", strUrl));
		}

		String strPModel = pathVariables.get("pdename");
		String strModel = pathVariables.get("dename");
		String strPModel2 = StringUtils.hasLength(strPModel) ? Inflector.getInstance().singularize(strPModel).toUpperCase() : null;
		String strModel2 = StringUtils.hasLength(strModel) ? Inflector.getInstance().singularize(strModel).toUpperCase() : null;
		
		if(StringUtils.hasLength(strPModel2)) {
			IDEServiceAPIRuntime iDEServiceAPIRuntime = iSysServiceRuntime.getDEServiceAPIRuntime(strPModel2, true);
			if(iDEServiceAPIRuntime != null) {
				strPModel2 = iDEServiceAPIRuntime.getName();
			}
		}

		if(StringUtils.hasLength(strModel2)) {
			IDEServiceAPIRuntime iDEServiceAPIRuntime = iSysServiceRuntime.getDEServiceAPIRuntime(strModel2, true);
			if(iDEServiceAPIRuntime != null) {
				strModel2 = iDEServiceAPIRuntime.getName();
			}
		}
		
		Map objBody = null;
		if (StringUtils.hasLength(strBody)) {
			objBody = JsonUtils.asMap(strBody);
		}

		IAppContext iAppContext = UserContext.getCurrentMust().getAppContext();

		try {
			UserContext.getCurrentMust().setAppContext(null);
			SysServiceAPIRuntimeHolder.pushUrl(strUrl);
			Object ret = iSysServiceRuntime.invokeDEMethod(null, strPModel2, pathVariables.get("pkey"), strModel2, pathVariables.get("method"), objBody, pathVariables.get("key"), null);
			if (ret == null) {
				return true;
			}
			return convertReturnValue(ret, iSysServiceRuntime);

		} catch (Throwable ex) {
			ex = ExceptionUtils.unwrapThrowable(ex);
			log.error(String.format("请求服务接口[%1$s]发生异常，%2$s", strUrl, ex.getMessage()), ex);
			ExceptionUtils.rethrowRuntimeException(ex);
		} finally {
			SysServiceAPIRuntimeHolder.pollUrl();
			UserContext.getCurrentMust().setAppContext(iAppContext);
		}
		return false;
	}

	protected Object convertReturnValue(Object value, ISysServiceAPIRuntime iSysServiceRuntime) {
		if (value instanceof IEntityDTO) {
			IEntityDTO iEntityDTO = (IEntityDTO) value;
			if (iEntityDTO.getDEMethodDTORuntime() != null) {
				//填充代码表文本
				iEntityDTO.getDEMethodDTORuntime().getDataEntityRuntime().fillEntityCodeListTexts(iEntityDTO, getCodeItemTextSuffix());
				net.ibizsys.runtime.util.script.IScriptEntity iScriptEntity = iEntityDTO.getDEMethodDTORuntime().getDataEntityRuntime().createScriptEntity(iEntityDTO);
				return new TemplateEntity((IScriptEntity)iScriptEntity);
				
			}
			else {
				net.ibizsys.runtime.util.script.IScriptEntity iScriptEntity = iSysServiceRuntime.getSystemRuntime().createScriptEntity(iEntityDTO);
				return new TemplateEntity((IScriptEntity) iScriptEntity);
			}
		}

		if (value instanceof Page) {
			value = ((Page)value).getContent();
		}

		if (value instanceof List) {
			List list = (List) value;
			if (list.size() > 0 && list.get(0) instanceof IEntityDTO) {
				List<TemplateEntity> templateEntityList = new ArrayList<TemplateEntity>();
				IEntityDTO iEntityDTO = (IEntityDTO) list.get(0);
				if (iEntityDTO.getDEMethodDTORuntime() != null) {
					for (Object item : list) {
						iEntityDTO.getDEMethodDTORuntime().getDataEntityRuntime().fillEntityCodeListTexts((IEntityDTO) item, getCodeItemTextSuffix());
						net.ibizsys.runtime.util.script.IScriptEntity iScriptEntity = iEntityDTO.getDEMethodDTORuntime().getDataEntityRuntime().createScriptEntity((IEntityDTO) item);
						TemplateEntity templateEntity = new TemplateEntity((IScriptEntity) iScriptEntity);
						templateEntityList.add(templateEntity);
					}
				} else {
					for (Object item : list) {
						net.ibizsys.runtime.util.script.IScriptEntity iScriptEntity = iSysServiceRuntime.getSystemRuntime().createScriptEntity((IEntityDTO) item);
						TemplateEntity templateEntity = new TemplateEntity((IScriptEntity) iScriptEntity);
						templateEntityList.add(templateEntity);
					}
				}
				return templateEntityList;
			}
		}
		return value;
	}
	
	
	/**
	 * 获取代码项文本后缀
	 * @return
	 */
	protected String getCodeItemTextSuffix() {
		return "text";
	}

	protected ISysServiceAPIRuntime getSysServiceAPIRuntime() {
		if (this.iSysServiceAPIRuntime == null) {
			ISysServiceAPIRuntime defaultSysServiceAPIRuntime = this.iSystemRuntime.getDefaultSysServiceAPIRuntime(true);
			if(defaultSysServiceAPIRuntime != null) {
				if(SysServiceAPIRuntimeHolder.peek() == null) {
					return defaultSysServiceAPIRuntime;
				}
			}
			return (ISysServiceAPIRuntime)SysServiceAPIRuntimeHolder.peekMust();
		}
		return this.iSysServiceAPIRuntime;
	}
}
