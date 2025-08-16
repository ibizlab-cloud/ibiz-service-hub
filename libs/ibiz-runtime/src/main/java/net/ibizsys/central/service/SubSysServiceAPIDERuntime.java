package net.ibizsys.central.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.Pageable;
import org.springframework.util.Assert;
import org.springframework.util.ObjectUtils;
import org.springframework.util.StringUtils;

import net.ibizsys.central.ISystemRuntime;
import net.ibizsys.central.dataentity.IDataEntityRuntime;
import net.ibizsys.central.util.IEntityDTO;
import net.ibizsys.central.util.ISearchContext;
import net.ibizsys.central.util.Inflector;
import net.ibizsys.model.IPSModelObject;
import net.ibizsys.model.PSModelEnums.DEMethodReturnType;
import net.ibizsys.model.dataentity.action.IPSDEAction;
import net.ibizsys.model.dataentity.ds.IPSDEDataSet;
import net.ibizsys.model.dataentity.service.IPSDEMethodDTO;
import net.ibizsys.model.service.IPSSubSysServiceAPIDE;
import net.ibizsys.model.service.IPSSubSysServiceAPIDEMethod;
import net.ibizsys.model.service.IPSSubSysServiceAPIDERS;
import net.ibizsys.model.service.IPSSubSysServiceAPIMethodReturn;
import net.ibizsys.runtime.ISystemUtilRuntime;
import net.ibizsys.runtime.ModelRuntimeBase;
import net.ibizsys.runtime.security.UserContext;
import net.ibizsys.runtime.util.ActionSessionManager;
import net.ibizsys.runtime.util.DataTypeUtils;
import net.ibizsys.runtime.util.EntityBase;
import net.ibizsys.runtime.util.IAppContext;
import net.ibizsys.runtime.util.IEntity;
import net.ibizsys.runtime.util.script.ScriptUtils;

/**
 * 外部服务接口实体运行时对象接口
 * 
 * @author lionlau
 *
 */
public class SubSysServiceAPIDERuntime extends ModelRuntimeBase implements ISubSysServiceAPIDERuntime {

	private static final org.apache.commons.logging.Log log = org.apache.commons.logging.LogFactory.getLog(SubSysServiceAPIDERuntime.class);

	private ISubSysServiceAPIRuntimeContext iSubSysServiceAPIRuntimeContext = null;
	private IPSSubSysServiceAPIDE iPSSubSysServiceAPIDE = null;
	private Map<String, IPSSubSysServiceAPIDEMethod> psSubSysServiceAPIDEMethodMap = new HashMap<String, IPSSubSysServiceAPIDEMethod>();
	private List<IPSSubSysServiceAPIDERS> minorPSSubSysServiceAPIDERSList = null;
	private Map<String, ISubSysServiceAPIMethodRuntime> subSysServiceAPIMethodRuntimeMap = null;
	private ISubSysServiceAPIScriptLogicRuntime methodSubSysServiceAPIScriptLogicRuntime = null;
	private String strCodeName = null;
	private String strServiceCodeName = null;
	
	
	
	@Override
	public void init(ISubSysServiceAPIRuntimeContext iSubSysServiceAPIRuntimeContext, IPSSubSysServiceAPIDE iPSSubSysServiceAPIDE) throws Exception {
		Assert.notNull(iSubSysServiceAPIRuntimeContext, "传入外部服务接口运行时上下文对象无效");
		Assert.notNull(iPSSubSysServiceAPIDE, "传入外部服务接口实体模型对象无效");

		
		this.iSubSysServiceAPIRuntimeContext = iSubSysServiceAPIRuntimeContext;
		this.iPSSubSysServiceAPIDE = iPSSubSysServiceAPIDE;

		this.onInit();
	}
	
	@Override
	protected void onInit() throws Exception {

		this.setCodeName(this.getPSSubSysServiceAPIDE().getCodeName());
		String strServiceCodeName = this.getPSSubSysServiceAPIDE().getCodeName2();
		if(ObjectUtils.isEmpty(strServiceCodeName)) {
			strServiceCodeName = Inflector.getInstance().pluralize(this.getCodeName());
		}
		this.setServiceCodeName(strServiceCodeName);
		
		java.util.List<IPSSubSysServiceAPIDEMethod> psSubSysServiceAPIDEMethodList = this.getPSSubSysServiceAPIDE().getPSSubSysServiceAPIDEMethods();
		if(psSubSysServiceAPIDEMethodList != null) {
			for(IPSSubSysServiceAPIDEMethod iPSSubSysServiceAPIDEMethod : psSubSysServiceAPIDEMethodList) {
				
				ISubSysServiceAPIMethodRuntime iSubSysServiceAPIMethodRuntime = this.getSystemRuntime().getRuntimeObject(iPSSubSysServiceAPIDEMethod.getPSSysSFPlugin(), ISubSysServiceAPIMethodRuntime.class, true);
				if(iSubSysServiceAPIMethodRuntime != null) {
					try {
						iSubSysServiceAPIMethodRuntime.init(iSubSysServiceAPIRuntimeContext, this, iPSSubSysServiceAPIDEMethod);
					}
					catch (Exception ex) {
						throw new Exception(String.format("初始化方法[%1$s]发生异常，%2$s", iPSSubSysServiceAPIDEMethod.getName(), ex.getMessage()), ex);
					}
					
					if(this.subSysServiceAPIMethodRuntimeMap == null) {
						this.subSysServiceAPIMethodRuntimeMap = new HashMap<String, ISubSysServiceAPIMethodRuntime>();
					}
				}
				
				if(StringUtils.hasLength(iPSSubSysServiceAPIDEMethod.getCodeName())){
					this.psSubSysServiceAPIDEMethodMap.put(iPSSubSysServiceAPIDEMethod.getCodeName().toUpperCase(), iPSSubSysServiceAPIDEMethod);
					if(iSubSysServiceAPIMethodRuntime!=null) {
						this.subSysServiceAPIMethodRuntimeMap.put(iPSSubSysServiceAPIDEMethod.getCodeName(), iSubSysServiceAPIMethodRuntime);
					}
				}
				//处理标记，标记优先级低于代码
				if(StringUtils.hasLength(iPSSubSysServiceAPIDEMethod.getMethodTag())) {
					if(!this.psSubSysServiceAPIDEMethodMap.containsKey(iPSSubSysServiceAPIDEMethod.getMethodTag().toUpperCase())) {
						this.psSubSysServiceAPIDEMethodMap.put(iPSSubSysServiceAPIDEMethod.getMethodTag().toUpperCase(), iPSSubSysServiceAPIDEMethod);
//						
//						if(iSubSysServiceAPIMethodRuntime!=null) {
//							this.subSysServiceAPIMethodRuntimeMap.put(iPSSubSysServiceAPIDEMethod.getMethodTag().toUpperCase(), iSubSysServiceAPIMethodRuntime);
//						}
					}
				}
			}
		}
		
		java.util.List<IPSSubSysServiceAPIDERS> psSubSysServiceAPIDERSList = this.getSubSysServiceAPIRuntime().getPSSubSysServiceAPI().getAllPSSubSysServiceAPIDERSs();
		if(psSubSysServiceAPIDERSList!=null) {
			for(IPSSubSysServiceAPIDERS iPSSubSysServiceAPIDERS : psSubSysServiceAPIDERSList) {
				if(iPSSubSysServiceAPIDERS.getMinorPSSubSysServiceAPIDEMust().getId().equals(this.getPSSubSysServiceAPIDE().getId())) {
					if(this.minorPSSubSysServiceAPIDERSList == null) {
						this.minorPSSubSysServiceAPIDERSList = new ArrayList<IPSSubSysServiceAPIDERS>();
					}
					this.minorPSSubSysServiceAPIDERSList.add(iPSSubSysServiceAPIDERS);
				}
			}
		}
		
		super.onInit();

		this.prepareMethodScriptLogicRuntime();
//		if(StringUtils.hasLength(this.getPSSubSysServiceAPIDE().getMethodScriptCode())) {
//			ISubSysServiceAPIScriptLogicRuntime iSubSysServiceAPIScriptLogicRuntime = this.getSystemRuntime().createSubSysServiceAPIScriptLogicRuntime(ISubSysServiceAPIScriptLogicRuntime.LOGICMODE_METHOD);
//			iSubSysServiceAPIScriptLogicRuntime.init(this.getSystemRuntime(), this.getSubSysServiceAPIRuntime(), this.getPSSubSysServiceAPIDE().getMethodScriptCode(), ISubSysServiceAPIScriptLogicRuntime.LOGICMODE_METHOD);
//			setMethodSubSysServiceAPIScriptLogicRuntime(iSubSysServiceAPIScriptLogicRuntime);
//		}
	}
	
	
	protected void prepareMethodScriptLogicRuntime() throws Exception{
		if (!StringUtils.hasLength(this.getMethodScriptCode())) {
			return;
		}
				
		ISubSysServiceAPIScriptLogicRuntime iSubSysServiceAPIScriptLogicRuntime = this.getSystemRuntime().createSubSysServiceAPIScriptLogicRuntime(ISubSysServiceAPIScriptLogicRuntime.LOGICMODE_METHOD);
		iSubSysServiceAPIScriptLogicRuntime.init(this.getSystemRuntime(), this.getSubSysServiceAPIRuntime(), this.getMethodScriptCode(), ISubSysServiceAPIScriptLogicRuntime.LOGICMODE_METHOD);
		setMethodSubSysServiceAPIScriptLogicRuntime(iSubSysServiceAPIScriptLogicRuntime);
	}
	
	
	
	protected String getMethodScriptCode() {
		return this.getPSSubSysServiceAPIDE().getMethodScriptCode();
	}
	
	
	protected ISubSysServiceAPIMethodRuntime getSubSysServiceAPIMethodRuntime(IPSSubSysServiceAPIDEMethod iPSSubSysServiceAPIDEMethod) {
		if(this.subSysServiceAPIMethodRuntimeMap != null) {
			return this.subSysServiceAPIMethodRuntimeMap.get(iPSSubSysServiceAPIDEMethod.getCodeName());
		}
		return null;
	}

	@Override
	public IPSSubSysServiceAPIDE getPSSubSysServiceAPIDE() {
		return this.iPSSubSysServiceAPIDE;
	}

	@Override
	public IPSModelObject getPSModelObject() {
		return this.getPSSubSysServiceAPIDE();
	}



	protected ISubSysServiceAPIRuntimeContext getSubSysServiceAPIRuntimeContext() {
		return this.iSubSysServiceAPIRuntimeContext;
	}

	@Override
	public ISubSysServiceAPIRuntime getSubSysServiceAPIRuntime() {
		return this.getSubSysServiceAPIRuntimeContext().getSubSysServiceAPIRuntime();
	}
	
	protected ISystemRuntime getSystemRuntime() {
		return this.getSubSysServiceAPIRuntime().getSystemRuntime();
	}
	
	/**
	 * 获取当前外部服务接口实体从关系列表
	 * @return
	 */
	protected List<IPSSubSysServiceAPIDERS> getMinorPSSubSysServiceAPIDERSList(){
		return this.minorPSSubSysServiceAPIDERSList;
	}

	@Override
	public IPSSubSysServiceAPIDEMethod getPSSubSysServiceAPIDEMethod(String strMethodName, boolean bTryMode) {
		Assert.hasLength(strMethodName, "未传入调用方法");
		IPSSubSysServiceAPIDEMethod iPSSubSysServiceAPIDEMethod = this.psSubSysServiceAPIDEMethodMap.get(strMethodName.toUpperCase());
		if(iPSSubSysServiceAPIDEMethod != null || bTryMode) {
			return iPSSubSysServiceAPIDEMethod;
		}
		throw new SubSysServiceAPIDERuntimeException(this, String.format("无法获取指定外部服务接口实体方法[%1$s]", strMethodName));
	}


	@Override
	public Object invokeMethod(String strMethodName, Map<String, Object> context, Object objBody, Map<String, Object> params, Object objTag) throws Throwable {
		IPSSubSysServiceAPIDEMethod iPSSubSysServiceAPIDEMethod = this.getPSSubSysServiceAPIDEMethod(strMethodName, false);
		return this.invokeMethod(iPSSubSysServiceAPIDEMethod, context, objBody, params, objTag);
	}

	@Override
	public Object invokeMethod(IPSSubSysServiceAPIDEMethod iPSSubSysServiceAPIDEMethod, Map<String, Object> context, Object objBody, Map<String, Object> params, Object objTag) throws Throwable {
		return this.onInvokeMethod(iPSSubSysServiceAPIDEMethod, context, objBody, params, objTag);
	}
	
	protected Object onInvokeMethod(IPSSubSysServiceAPIDEMethod iPSSubSysServiceAPIDEMethod, Map<String, Object> context, Object objBody, Map<String, Object> params, Object objTag) throws Throwable {
		String strRequestPath = getMethodRequestPath(iPSSubSysServiceAPIDEMethod, context);
		if(ObjectUtils.isEmpty(strRequestPath)) {
			throw new SubSysServiceAPIDERuntimeException(this, String.format("接口方法[%1$s]未指定服务路径", iPSSubSysServiceAPIDEMethod.getName()));
		}
		
		Map map = params;
		
		Map<String, Object> uriParams = null;
		
		if(context != null && context.size() > 0) {
			if(map != null && map.size() > 0) {
				uriParams = new HashMap<>();
				uriParams.putAll(map);
				uriParams.putAll(context);
			}
			else {
				uriParams = context;
			}
		}
		else {
			uriParams = map;
		}
		
		
		return this.onWebClientExecute(iPSSubSysServiceAPIDEMethod, strRequestPath, uriParams, null, params, objBody, objTag);
	}

	
	
	@Override
	public Object invokeMethod(IPSSubSysServiceAPIDEMethod iPSSubSysServiceAPIDEMethod, IDataEntityRuntime iDataEntityRuntime, IPSDEAction iPSDEAction, Object[] args) throws Throwable {
		IAppContext iAppContext = getAppContext();
		return this.invokeMethod(iPSSubSysServiceAPIDEMethod,  (iAppContext == null)?null:iAppContext.any(), iDataEntityRuntime, iPSDEAction, args);
	}
	
	

	@Override
	public Object invokeMethod(IPSSubSysServiceAPIDEMethod iPSSubSysServiceAPIDEMethod, IDataEntityRuntime iDataEntityRuntime, IPSDEDataSet iPSDEDataSet, Object[] args) throws Throwable {
		IAppContext iAppContext = getAppContext();
		return this.invokeMethod(iPSSubSysServiceAPIDEMethod,  (iAppContext == null)?null:iAppContext.any(), iDataEntityRuntime, iPSDEDataSet, args);
	}


	
	@Override
	public Object invokeMethod(IPSSubSysServiceAPIDEMethod iPSSubSysServiceAPIDEMethod, Map<String, Object> context, IDataEntityRuntime iDataEntityRuntime, IPSDEAction iPSDEAction, Object[] args) throws Throwable {
		return this.onInvokeMethod(iPSSubSysServiceAPIDEMethod, context, iDataEntityRuntime, iPSDEAction, args);
	}
	
	protected Object onInvokeMethod(IPSSubSysServiceAPIDEMethod iPSSubSysServiceAPIDEMethod, Map<String, Object> context, IDataEntityRuntime iDataEntityRuntime, IPSDEAction iPSDEAction, Object[] args) throws Throwable {
		//判断是否转化参数
		if(args != null && args.length > 0) {
			if(!(args[0] instanceof IEntity)) {
				Map<String, Object> map = new HashMap<>();
				
//				if(iDataEntityRuntime != null && iDataEntityRuntime.getKeyPSDEField() != null) {
//					map.put(iDataEntityRuntime.getKeyPSDEField().getLowerCaseName(), args[0]);
//				}
//				else {
//					map.put(Entity.KEY, args[0]);
//				}
				
				if(iPSSubSysServiceAPIDEMethod.isNeedResourceKey()) {
					String strFieldName = iPSSubSysServiceAPIDEMethod.getRequestField();
					if(ObjectUtils.isEmpty(strFieldName)) {
						strFieldName = EntityBase.KEY;
					}
					map.put(strFieldName , args[0]);
				}
				
				Object[] args2 = new Object[args.length];
				args2[0] = map;
				for(int i = 1;i<args.length;i++) {
					args2[i] = args[i];
				}
				args = args2;
			}
			else {
				//判断行为模式
				String strRequestMethod = iPSSubSysServiceAPIDEMethod.getRequestMethod();
				if(RequestMethods.DELETE.equals(strRequestMethod)
						||RequestMethods.GET.equals(strRequestMethod)
						||RequestMethods.HEAD.equals(strRequestMethod)) {
					//优化请求参数，避免整个数据包以Url参数的形式提交
					if(iDataEntityRuntime != null && iDataEntityRuntime.getKeyPSDEField() != null) {
						Map<String, Object> map = new HashMap<>();
						Object objValue = iDataEntityRuntime.getFieldValue((IEntity)args[0], iDataEntityRuntime.getKeyPSDEField());

						//map.put(iDataEntityRuntime.getKeyPSDEField().getLowerCaseName(), objValue);
						if(iPSSubSysServiceAPIDEMethod.isNeedResourceKey()) {
							String strFieldName = iPSSubSysServiceAPIDEMethod.getRequestField();
							if(ObjectUtils.isEmpty(strFieldName)) {
								strFieldName = EntityBase.KEY;
							}
							map.put(strFieldName, objValue);
						}


						Object[] args2 = new Object[args.length];
						args2[0] = map;
						for(int i = 1;i<args.length;i++) {
							args2[i] = args[i];
						}
						args = args2;
					}
				}else {
					//补偿需要资源键时无法获取资源键属性的默认值
					if (iPSSubSysServiceAPIDEMethod.isNeedResourceKey()) {
						Object objValue = iDataEntityRuntime.getFieldValue((IEntity) args[0], iDataEntityRuntime.getKeyPSDEField());
						String strFieldName = iPSSubSysServiceAPIDEMethod.getRequestField();
						if (ObjectUtils.isEmpty(strFieldName)) {
							strFieldName = EntityBase.KEY;
							((IEntity) args[0]).set(strFieldName, objValue);
						}
					}
				}
			}
		}
		
		Object objRet = this.onInvokeMethod(iPSSubSysServiceAPIDEMethod, context, args);
		if(iDataEntityRuntime != null) {
			if(objRet instanceof IEntity) {
				IEntity iEntity = (IEntity)objRet;
				if(!(iEntity instanceof IEntityDTO)) {
					IEntityDTO iEntityDTO = iDataEntityRuntime.createEntity();
					iEntityDTO.reload(iEntity, isDTOData());
					return iEntityDTO;
				}
			}
			if(objRet instanceof List) {
				List list = (List)objRet;
				if(!ObjectUtils.isEmpty(list)) {
					if(list.get(0) instanceof IEntity) {
						List<IEntityDTO> ret = new ArrayList<IEntityDTO>();
						for(Object item : list) {
							IEntityDTO iEntityDTO = iDataEntityRuntime.createEntity();
							iEntityDTO.reload((IEntity)item, isDTOData());
							ret.add(iEntityDTO);
						}
						return ret;
					}
				}
				return list;
			}
		}
		return objRet;
	}

	@Override
	public Object invokeMethod(IPSSubSysServiceAPIDEMethod iPSSubSysServiceAPIDEMethod, Map<String, Object> context, IDataEntityRuntime iDataEntityRuntime, IPSDEDataSet iPSDEDataSet, Object[] args) throws Throwable {
		return this.onInvokeMethod(iPSSubSysServiceAPIDEMethod, context, iDataEntityRuntime, iPSDEDataSet, args);
	}
	
	protected Object onInvokeMethod(IPSSubSysServiceAPIDEMethod iPSSubSysServiceAPIDEMethod, Map<String, Object> context, IDataEntityRuntime iDataEntityRuntime, IPSDEDataSet iPSDEDataSet, Object[] args) throws Throwable {
		
		//转换搜索条件至Map
		
		Object objRet =  this.onInvokeMethod(iPSSubSysServiceAPIDEMethod, context, args);
		if(iDataEntityRuntime != null) {
			if(objRet instanceof Page && args!= null && args.length>0 &&  args[0] instanceof ISearchContext) {
				ISearchContext iSearchContext = (ISearchContext)args[0];
				return getEntityDTOPage((Page)objRet, iDataEntityRuntime, iPSDEDataSet, iSearchContext.getPageable());
			}
		}
		return objRet;
	}
	
	protected Page<IEntityDTO> getEntityDTOPage(Page page, IDataEntityRuntime iDataEntityRuntime, IPSDEDataSet iPSDEDataSet, Pageable pagable) throws Throwable{
		if(page == null || page.getNumberOfElements() == 0) {
			return page;
		}
		//判断是否需要进行DTO转化
		if(page.getContent().get(0) instanceof IEntityDTO) {
			return page;
		}
		
		IPSDEMethodDTO iPSDEMethodDTO = (iPSDEDataSet==null)?iDataEntityRuntime.getDefaultPSDEMethodDTO() : iPSDEDataSet.getPSDEDataSetReturnMust().getPSDEMethodDTOMust();
		List<IEntityDTO> entityDTOList = new ArrayList<IEntityDTO>();
		for(Object objItem : page.getContent()) {
			IEntityDTO iEntityDTO =  (IEntityDTO)iDataEntityRuntime.getDEMethodDTO(iPSDEMethodDTO, objItem, isDTOData());
			entityDTOList.add(iEntityDTO);
		}
		
		return new PageImpl<IEntityDTO>(entityDTOList, pagable, page.getTotalElements() );
	}
	
	
	@Override
	public Object invokeMethod(IPSSubSysServiceAPIDEMethod iPSSubSysServiceAPIDEMethod, Object[] args) throws Throwable {
		IAppContext iAppContext = getAppContext();
		return this.invokeMethod(iPSSubSysServiceAPIDEMethod, (iAppContext == null)?null:iAppContext.any(), args);
	}

	@Override
	public Object invokeMethod(IPSSubSysServiceAPIDEMethod iPSSubSysServiceAPIDEMethod, Map<String, Object> context, Object[] args) throws Throwable {
		Assert.notNull(iPSSubSysServiceAPIDEMethod, "未传入外部服务接口方法对象");
		return this.onInvokeMethod(iPSSubSysServiceAPIDEMethod, context, args);
	}
	
	protected Object onInvokeMethod(IPSSubSysServiceAPIDEMethod iPSSubSysServiceAPIDEMethod, Map<String, Object> context, Object[] args) throws Throwable {
	
		ISubSysServiceAPIMethodRuntime iSubSysServiceAPIMethodRuntime = this.getSubSysServiceAPIMethodRuntime(iPSSubSysServiceAPIDEMethod);
		if(iSubSysServiceAPIMethodRuntime != null) {
			return iSubSysServiceAPIMethodRuntime.execute(context, args);
		}
		
		String strRequestPath = getMethodRequestPath(iPSSubSysServiceAPIDEMethod, context);
		if(ObjectUtils.isEmpty(strRequestPath)) {
			throw new SubSysServiceAPIDERuntimeException(this, String.format("接口方法[%1$s]未指定服务路径", iPSSubSysServiceAPIDEMethod.getName()));
		}
		
		Object objParam = null;
		Object objTag = null;
		Map map = null;
		if(args != null) {
			if(args.length > 0) {
				objParam = args[0];
				if(objParam instanceof Map) {
					map = (Map)objParam;
				}
				else
					if(objParam instanceof IEntity) {
						map = ((IEntity)objParam).any();
						//补偿资源键以解决接口调用使用数据键名不一致问题
						if(iPSSubSysServiceAPIDEMethod.isNeedResourceKey()) {
							String strFieldName = iPSSubSysServiceAPIDEMethod.getRequestField();
							if (!ObjectUtils.isEmpty(strFieldName)) {
								Object objValue = ((IEntity) objParam).get(strFieldName);
								map.put(strFieldName, objValue);
							}
						}
					}

			}
			if(args.length > 1) {
				objTag = args[1];
			}
		}
		
		Map<String, Object> uriParams = null;
		
		if(context != null && context.size() > 0) {
			if(map != null && map.size() > 0) {
				uriParams = new HashMap<>();
				uriParams.putAll(map);
				uriParams.putAll(context);
			}
			else {
				uriParams = context;
			}
		}
		else {
			uriParams = map;
		}
		
		
		return this.onWebClientExecute(iPSSubSysServiceAPIDEMethod, strRequestPath, uriParams, null, null, objParam, objTag);
	}
	
	@SuppressWarnings("restriction")
	protected Object onWebClientExecute(IPSSubSysServiceAPIDEMethod iPSSubSysServiceAPIDEMethod, String strRequestPath, Map<String, ?> uriParams, Map<String, ?> headers, Map<String, ?> queries, Object objData, Object objTag) throws Throwable {
		
		ISubSysServiceAPIScriptLogicRuntime iSubSysServiceAPIScriptLogicRuntime = getMethodSubSysServiceAPIScriptLogicRuntime(iPSSubSysServiceAPIDEMethod);
		if(iSubSysServiceAPIScriptLogicRuntime != null) {
			if(ISystemUtilRuntime.SCRIPTENGINE_GROOVY.equals(iSubSysServiceAPIScriptLogicRuntime.getScriptEngine())) {
				Map<String, Object> scriptObjectMirror = new LinkedHashMap<String, Object>();
				scriptObjectMirror.put("uri", strRequestPath);
				if(objData != null) {
					scriptObjectMirror.put("body", objData);
				}
				String strContentType  = iPSSubSysServiceAPIDEMethod.getBodyContentType();
				if(StringUtils.hasLength(strContentType)) {
					scriptObjectMirror.put("contenttype", strContentType);
				}
				
				if(true) {
					Map scriptObject = new LinkedHashMap<String, Object>();
					scriptObjectMirror.put("param", scriptObject);
					if(uriParams != null) {
						for(java.util.Map.Entry<String, ?> entry : uriParams.entrySet()) {
							//转小写
							scriptObject.put(entry.getKey().toLowerCase(), entry.getValue());
						}
					}
				}
				
				if(true) {
					Map scriptObject = new LinkedHashMap<String, Object>();
					scriptObjectMirror.put("header", scriptObject);
					if(headers != null) {
						for(java.util.Map.Entry<String, ?> entry : headers.entrySet()) {
							//原始
							scriptObject.put(entry.getKey(), entry.getValue());
						}
					}
				}
				
				if(true) {
					Map scriptObject = new LinkedHashMap<String, Object>();
					scriptObjectMirror.put("query", scriptObject);
					if(queries != null) {
						for(java.util.Map.Entry<String, ?> entry : queries.entrySet()) {
							//原始
							scriptObject.put(entry.getKey(), entry.getValue());
						}
					}
				}
				
				Object objRet = iSubSysServiceAPIScriptLogicRuntime.execute(new Object[] {this, iPSSubSysServiceAPIDEMethod, scriptObjectMirror});
				return this.getResult(ScriptUtils.getReal(objRet), iPSSubSysServiceAPIDEMethod);
			}
			else {
				Object objParam = this.getSubSysServiceAPIRuntimeContext().createMethodParamScriptObject();
				if (objParam instanceof jdk.nashorn.api.scripting.ScriptObjectMirror) {
					jdk.nashorn.api.scripting.ScriptObjectMirror scriptObjectMirror = (jdk.nashorn.api.scripting.ScriptObjectMirror)objParam;
					scriptObjectMirror.put("uri", strRequestPath);
					if(objData != null) {
						scriptObjectMirror.put("body", this.getSystemRuntime().createScriptObject(objData));
					}
					String strContentType  = iPSSubSysServiceAPIDEMethod.getBodyContentType();
					if(StringUtils.hasLength(strContentType)) {
						scriptObjectMirror.put("contenttype", strContentType);
					}
					
					Object obj = scriptObjectMirror.get("param");
					if(obj instanceof jdk.nashorn.api.scripting.ScriptObjectMirror) {
						jdk.nashorn.api.scripting.ScriptObjectMirror scriptObject = (jdk.nashorn.api.scripting.ScriptObjectMirror)obj;
						if(uriParams != null) {
							for(java.util.Map.Entry<String, ?> entry : uriParams.entrySet()) {
								//转小写
								scriptObject.put(entry.getKey().toLowerCase(), entry.getValue());
							}
						}
					}
					
					obj = scriptObjectMirror.get("header");
					if(obj instanceof jdk.nashorn.api.scripting.ScriptObjectMirror) {
						jdk.nashorn.api.scripting.ScriptObjectMirror scriptObject = (jdk.nashorn.api.scripting.ScriptObjectMirror)obj;
						if(headers != null) {
							for(java.util.Map.Entry<String, ?> entry : headers.entrySet()) {
								//原始
								scriptObject.put(entry.getKey(), entry.getValue());
							}
						}
					}
					
					obj = scriptObjectMirror.get("query");
					if(obj instanceof jdk.nashorn.api.scripting.ScriptObjectMirror) {
						jdk.nashorn.api.scripting.ScriptObjectMirror scriptObject = (jdk.nashorn.api.scripting.ScriptObjectMirror)obj;
						if(queries != null) {
							for(java.util.Map.Entry<String, ?> entry : queries.entrySet()) {
								//原始
								scriptObject.put(entry.getKey(), entry.getValue());
							}
						}
					}
				}
				else {
					throw new SubSysServiceAPIDERuntimeException(this, String.format("方法脚本调用参数对象类型不正确"));
				}
				
				Object objRet = iSubSysServiceAPIScriptLogicRuntime.execute(new Object[] {new SubSysSADEMethodRTScriptContext(this, iPSSubSysServiceAPIDEMethod), objParam});
				return this.getResult(ScriptUtils.getReal(objRet), iPSSubSysServiceAPIDEMethod);
			}
			
		}		
		
		return this.getSubSysServiceAPIRuntime().getWebClient().execute(iPSSubSysServiceAPIDEMethod.getRequestMethod(), strRequestPath, uriParams, headers, queries, objData, iPSSubSysServiceAPIDEMethod.getBodyContentType(), String.class, objTag);
	}
	
	protected Object getResult(Object result, IPSSubSysServiceAPIDEMethod iPSSubSysServiceAPIDEMethod) throws Exception {
		if(!(result instanceof String)) {
			return result;
		}
		
		String strResult = (String)result;
		if(!StringUtils.hasLength(strResult)) {
			return null;
		}
		
		final IPSSubSysServiceAPIMethodReturn iPSSubSysServiceAPIMethodReturn =iPSSubSysServiceAPIDEMethod==null?null:iPSSubSysServiceAPIDEMethod.getPSSubSysServiceAPIMethodReturn();
		if(iPSSubSysServiceAPIMethodReturn == null) {
			//兼容早期脚本内容之方法
			try {
				Map map = this.getSystemRuntime().deserialize(strResult, Map.class);
				return this.getSystemRuntime().createEntity(map, false);
			}
			catch (Throwable ex) {
				return strResult;
			}
		}
		return this.getResult(strResult, DEMethodReturnType.from(iPSSubSysServiceAPIMethodReturn.getType()), iPSSubSysServiceAPIMethodReturn);
	}
	
	protected Object getResult(String strResult, DEMethodReturnType deMethodReturnType, IPSSubSysServiceAPIMethodReturn iPSSubSysServiceAPIMethodReturn) throws Exception{
		
		switch(deMethodReturnType) {
		case DTO:{
				Map map = this.getSystemRuntime().deserialize(strResult, Map.class);
				return this.getSystemRuntime().createEntity(map, false);
			}
		case DTOS:{
				List list = this.getSystemRuntime().deserialize(strResult, List.class);
				if(ObjectUtils.isEmpty(list)) {
					return list;
				}
				
				List<IEntity> ret = new ArrayList<IEntity>();
				for(Object item : list) {
					ret.add(this.getSystemRuntime().createEntity((Map)item, false));
				}
				return ret;
			}
		case SIMPLE:{
				return DataTypeUtils.parse(iPSSubSysServiceAPIMethodReturn.getStdDataType(), strResult);
			}
		case SIMPLES:{
				List list = this.getSystemRuntime().deserialize(strResult, List.class);
				if(ObjectUtils.isEmpty(list)) {
					return list;
				}
				
				List<Object> ret = new ArrayList<>();
				for(Object item : list) {
					ret.add(DataTypeUtils.convert(iPSSubSysServiceAPIMethodReturn.getStdDataType(), item));
				}
				return ret;
			}
		default:{
				try {
					Map map = this.getSystemRuntime().deserialize(strResult, Map.class);
					return this.getSystemRuntime().createEntity(map, false);
				}
				catch (Throwable ex) {
					return strResult;
				}
			}
		}
	}
	
	@Override
	public String getRequestPath(Map<String, ?> context) {
		return this.getRequestPath(context, true);
	}
	
	@Override
	public String getRequestPath(Map<String, ?> context, boolean bParent) {
		String strRequestPath = "";
		if(this.getMinorPSSubSysServiceAPIDERSList() != null && context!=null) {
			for(IPSSubSysServiceAPIDERS iPSSubSysServiceAPIDERS : this.getMinorPSSubSysServiceAPIDERSList()) {
				String strName = iPSSubSysServiceAPIDERS.getMajorPSSubSysServiceAPIDEMust().getName();
				if(context.containsKey(strName) || context.containsKey(strName.toLowerCase())) {
					strRequestPath = this.getSubSysServiceAPIRuntime().getSubSysServiceAPIDERuntime(iPSSubSysServiceAPIDERS.getMajorPSSubSysServiceAPIDEMust().getId(), false).getRequestPath(context, true);
					break;
				}
			}
		}
		if(bParent) {
			return String.format("%1$s/%2$s/{%3$s}", strRequestPath, this.getServiceCodeName(), this.getName()).toLowerCase();
		}
		else {
			return String.format("%1$s/%2$s", strRequestPath, this.getServiceCodeName()).toLowerCase();
		}
	}
	
	protected String getMethodRequestPath(IPSSubSysServiceAPIDEMethod iPSSubSysServiceAPIDEMethod, Map<String, Object> context) {
		String strRequestPath = iPSSubSysServiceAPIDEMethod.getRequestPath();
		if(StringUtils.hasLength(strRequestPath) && !iPSSubSysServiceAPIDEMethod.isAutoPath()) {
			return strRequestPath;
		}
		//判断接口模式
		strRequestPath = this.getRequestPath(context, false);
		
		if(iPSSubSysServiceAPIDEMethod.isNeedResourceKey()) {
			String strFieldName = iPSSubSysServiceAPIDEMethod.getRequestField();
			if(ObjectUtils.isEmpty(strFieldName)) {
				strFieldName = EntityBase.KEY;
			}
			strRequestPath = String.format("%1$s/{%2$s}", strRequestPath, strFieldName);
		}
		
		if(!iPSSubSysServiceAPIDEMethod.isNoServiceCodeName()) {
			String strServiceCode = iPSSubSysServiceAPIDEMethod.getCodeName2();
			if(ObjectUtils.isEmpty(strServiceCode)) {
				strServiceCode = iPSSubSysServiceAPIDEMethod.getCodeName();
			}
			strRequestPath = String.format("%1$s/%2$s", strRequestPath, strServiceCode);
		}
		
		return strRequestPath.toLowerCase();
	}
	
	protected IAppContext getAppContext() {
		if (ActionSessionManager.getCurrentSession() != null) {
			return ActionSessionManager.getCurrentSession().getAppContext();
		}
		else {
			return UserContext.getCurrentMust().getAppContext();
		}
	}
	
	protected ISubSysServiceAPIScriptLogicRuntime getMethodSubSysServiceAPIScriptLogicRuntime(IPSSubSysServiceAPIDEMethod iPSSubSysServiceAPIDEMethod) {
		String strMethodScriptCode = iPSSubSysServiceAPIDEMethod.getMethodScriptCode();
		if(StringUtils.hasLength(strMethodScriptCode)) {
			return this.getSubSysServiceAPIRuntimeContext().getMethodSubSysServiceAPIScriptLogicRuntime(strMethodScriptCode);
		}
		if(this.methodSubSysServiceAPIScriptLogicRuntime != null) {
			return methodSubSysServiceAPIScriptLogicRuntime;
		}
		return this.getSubSysServiceAPIRuntimeContext().getMethodSubSysServiceAPIScriptLogicRuntime();
	}

	protected ISubSysServiceAPIScriptLogicRuntime getMethodSubSysServiceAPIScriptLogicRuntime() {
		return methodSubSysServiceAPIScriptLogicRuntime;
	}
	
	protected void setMethodSubSysServiceAPIScriptLogicRuntime(ISubSysServiceAPIScriptLogicRuntime methodSubSysServiceAPIScriptLogicRuntime) {
		this.methodSubSysServiceAPIScriptLogicRuntime = methodSubSysServiceAPIScriptLogicRuntime;
	}
	
	protected ISubSysServiceAPIScriptLogicRuntime getMethodScriptLogicRuntime() {
		return this.getMethodSubSysServiceAPIScriptLogicRuntime();
	}
	
	protected void setMethodScriptLogicRuntime(ISubSysServiceAPIScriptLogicRuntime methodSubSysServiceAPIScriptLogicRuntime) {
		this.setMethodSubSysServiceAPIScriptLogicRuntime(methodSubSysServiceAPIScriptLogicRuntime);
	}
	

	@Override
	public String getCodeName() {
		return this.strCodeName;
	}
	
	protected void setCodeName(String strCodeName) {
		this.strCodeName = strCodeName;
	}

	@Override
	public String getServiceCodeName() {
		return this.strServiceCodeName;
	}
	
	protected void setServiceCodeName(String strServiceCodeName) {
		this.strServiceCodeName = strServiceCodeName;
	}
	
	/**
	 * 获取接口数据是否为DTO数据形式
	 * @return
	 */
	protected boolean isDTOData() {
		return false;
	}
}
