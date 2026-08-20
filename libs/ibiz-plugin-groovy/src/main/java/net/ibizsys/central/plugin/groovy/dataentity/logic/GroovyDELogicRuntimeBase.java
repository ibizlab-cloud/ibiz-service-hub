package net.ibizsys.central.plugin.groovy.dataentity.logic;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

import org.springframework.util.ObjectUtils;
import org.springframework.util.StringUtils;

import groovy.lang.Closure;
import net.ibizsys.central.cloud.core.dataentity.logic.DELogicRuntime;
import net.ibizsys.central.cloud.core.util.annotation.DELogicNode;
import net.ibizsys.central.cloud.core.util.annotation.DELogicParam;
import net.ibizsys.central.dataentity.logic.IDELogicNodeRuntime;
import net.ibizsys.central.dataentity.logic.IDELogicParamRuntime;
import net.ibizsys.central.dataentity.logic.IDELogicRuntimeContext;
import net.ibizsys.central.dataentity.logic.IDELogicSession;
import net.ibizsys.model.dataentity.logic.IPSDELogicNode;
import net.ibizsys.model.dataentity.logic.IPSDELogicParam;
import net.ibizsys.model.dataentity.logic.IPSDERawCodeLogic;
import net.ibizsys.runtime.util.ExceptionUtils;

public abstract class GroovyDELogicRuntimeBase extends DELogicRuntime {

	private static final org.apache.commons.logging.Log log = org.apache.commons.logging.LogFactory.getLog(GroovyDELogicRuntimeBase.class);

	private Map<String, IDELogicNodeRuntime> deLogicNodeRuntimeMap = new HashMap<String, IDELogicNodeRuntime>();

	@Override
	protected void onInit() throws Exception {

		super.onInit();

		this.prepareMethods();
		this.prepareFields();
	}

	protected void prepareMethods() throws Exception {

		Method[] methods = this.getClass().getDeclaredMethods();
		if (ObjectUtils.isEmpty(methods)) {
			return;
		}

		for (Method method : methods) {
			DELogicNode deLogicNode = method.getAnnotation(DELogicNode.class);
			if (deLogicNode != null) {
				String name = deLogicNode.value();

				if (!StringUtils.hasLength(name)) {
					throw new Exception(String.format("代码方法[%1$s]逻辑节点注解未指定节点标识", method.getName()));
				}

				IPSDELogicNode iPSDELogicNode = getPSDELogicNode(name, true);
				if (iPSDELogicNode == null) {
					log.error(String.format("代码方法[%1$s]逻辑节点注解节点[%2$s]不存在", method.getName(), name));
					continue;
				}
				if (!method.isAccessible()) {
					method.setAccessible(true);
				}
				
				IDELogicNodeRuntime iDELogicNodeRuntime = new IDELogicNodeRuntime() {
					@Override
					public void execute(IDELogicRuntimeContext iDELogicRuntimeContext, IDELogicSession iDELogicSession, IPSDELogicNode iPSDELogicNode) throws Throwable {
						try {
							method.invoke(this, new Object[] { iDELogicSession, iPSDELogicNode });
						} catch (InvocationTargetException e) {
							Throwable ex = ExceptionUtils.unwrapThrowable(e);
							throw ex;
						}
					}
				};
				
				deLogicNodeRuntimeMap.put(name.toUpperCase(), iDELogicNodeRuntime);
			}
		}
	}

	protected void prepareFields() throws Exception {
		Field[] fields = this.getClass().getDeclaredFields();
		if (ObjectUtils.isEmpty(fields)) {
			return;
		}

		for (Field field : fields) {
			DELogicParam deLogicParam = field.getAnnotation(DELogicParam.class);
			if (deLogicParam != null) {
				String name = deLogicParam.value();

				if (!StringUtils.hasLength(name)) {
					throw new Exception(String.format("属性[%1$s]逻辑参数注解未指定参数标识", field.getName()));
				}

				try {
					Object value = this.getLogicParamValue(field.getName());
					if (value == null) {
						continue;
					}

					if (!field.isAccessible()) {
						field.setAccessible(true);
					}

					field.set(this, value);
				} catch (Throwable ex) {
					throw new Exception(String.format("属性[%1$s]绑定逻辑参数发生异常，%2$s", field.getName(), ex.getMessage()), ex);
				}
			}
		}
	}


	@Override
	public IDELogicNodeRuntime getDELogicNodeRuntime(String strName, boolean bTryMode) throws Throwable {
		IDELogicNodeRuntime iDELogicNodeRuntime =  deLogicNodeRuntimeMap.get(strName.toUpperCase());
		if(iDELogicNodeRuntime != null) {
			return iDELogicNodeRuntime;
		}
		return super.getDELogicNodeRuntime(strName, bTryMode);
	}

	/**
	 * 调用基类关于该节点的实现逻辑
	 * @param iDELogicSession
	 * @param iPSDELogicNode
	 * @throws Throwable
	 */
	protected void superExecute(IDELogicSession iDELogicSession, IPSDELogicNode iPSDELogicNode) throws Throwable {
		//获取原始执行逻辑
		IDELogicNodeRuntime iDELogicNodeRuntime = super.getDELogicNodeRuntime(iPSDELogicNode);
		iDELogicNodeRuntime.execute(this.getDELogicRuntimeContext(), iDELogicSession, iPSDELogicNode);
	}
	
	
	/**
	 * 执行直接Groovy代码，仿真Raw代码逻辑
	 * @param iDELogicSession
	 * @param iPSDELogicNode
	 * @param closure
	 * @return
	 * @throws Throwable
	 */
	protected Object executeRawGroovyCode(IDELogicSession iDELogicSession, IPSDELogicNode iPSDELogicNode, Closure<?> closure) throws Throwable {
		Object scriptObject = null;
		Object realObject = null;
		IPSDERawCodeLogic iPSDERawCodeLogic = null;
		if(iPSDELogicNode instanceof IPSDERawCodeLogic) {
			iPSDERawCodeLogic = (IPSDERawCodeLogic)iPSDELogicNode;
			IPSDELogicParam iPSDELogicParam = iPSDERawCodeLogic.getDstPSDELogicParam();
			if(iPSDELogicParam != null) {
				scriptObject =	getDELogicParamRuntime(iPSDELogicParam.getCodeName(), false);
				realObject = getDELogicParamRuntime(iPSDELogicParam.getCodeName(), false).getReal(iDELogicSession);
			}
		}
		Object objRet = closure.call(getSystemRuntime(), this, realObject, realObject, scriptObject);
		iDELogicSession.setLastReturn(objRet);
		if(iPSDERawCodeLogic != null && iPSDERawCodeLogic.getRetPSDELogicParam() != null) {
			IDELogicParamRuntime retDELogicParamRuntime = getDELogicParamRuntime(iPSDERawCodeLogic.getRetPSDELogicParam().getCodeName(), false);
			retDELogicParamRuntime.bind(iDELogicSession, objRet);
		}
		return objRet;
	}

}
