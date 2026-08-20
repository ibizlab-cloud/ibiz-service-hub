package net.ibizsys.central.plugin.groovy.dataentity;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import org.springframework.util.ObjectUtils;
import org.springframework.util.StringUtils;

import net.ibizsys.central.cloud.core.dataentity.DataEntityRTAddinBase;
import net.ibizsys.central.dataentity.IDataEntityRuntimeContext;
import net.ibizsys.central.dataentity.action.DEActionPluginRuntimeBase;
import net.ibizsys.central.dataentity.action.IDEActionLogicRuntimeBase;
import net.ibizsys.central.dataentity.ds.DEDataSetPluginRuntimeBase;
import net.ibizsys.central.dataentity.ds.IDEDataSetLogicRuntimeBase;
import net.ibizsys.central.dataentity.service.DEMethodPluginRuntimeRepo;
import net.ibizsys.central.util.annotation.DEAction;
import net.ibizsys.central.util.annotation.DEActionLogic;
import net.ibizsys.central.util.annotation.DEDataSet;
import net.ibizsys.central.util.annotation.DEDataSetLogic;
import net.ibizsys.model.dataentity.action.IPSDEAction;
import net.ibizsys.model.dataentity.ds.IPSDEDataSet;
import net.ibizsys.runtime.dataentity.action.DEActionLogicAttachModes;
import net.ibizsys.runtime.dataentity.action.IDEActionPluginRuntime;
import net.ibizsys.runtime.dataentity.ds.IDEDataSetPluginRuntime;
import net.ibizsys.runtime.util.ExceptionUtils;
import net.ibizsys.runtime.util.IAction;

public abstract class GroovyDataEntityRTAddinBase extends DataEntityRTAddinBase {

	private static final org.apache.commons.logging.Log log = org.apache.commons.logging.LogFactory.getLog(GroovyDataEntityRTAddinBase.class);
	
	private DEMethodPluginRuntimeRepo deMethodPluginRuntimeRepo = new DEMethodPluginRuntimeRepo();
	
	@Override
	protected void onInit() throws Exception {
		this.deMethodPluginRuntimeRepo.init(this.getDataEntityRuntimeContext().getDataEntityRuntime().getSystemRuntime(), true, false);
		
		super.onInit();
	}
	
	protected DEMethodPluginRuntimeRepo getDEMethodPluginRuntimeRepo() {
		return this.deMethodPluginRuntimeRepo;
	}
	
	private GroovyDataEntityRTAddinBase getSelf() {
		return this;
	}
	
	@Override
	protected void onInstall() throws Exception {
		
		prepareDEMethods();
		
		super.onInstall();
	}
	
	protected void prepareDEMethods() throws Exception {

		Method[] methods = this.getClass().getDeclaredMethods();
		if (ObjectUtils.isEmpty(methods)) {
			return;
		}

		for (Method method : methods) {
			if(true) {
				DEAction deAction = method.getAnnotation(DEAction.class);
				if (deAction != null) {
					String name = deAction.name();
					if (!StringUtils.hasLength(name)) {
						name = deAction.value();
					}

					if (!StringUtils.hasLength(name)) {
						throw new Exception(String.format("代码方法[%1$s]实体行为注解未指定行为标识", method.getName()));
					}

					IPSDEAction iPSDEAction = this.getDataEntityRuntime().getPSDEAction(name);
					if (iPSDEAction == null) {
						log.error(String.format("代码方法[%1$s]实体行为注解行为[%2$s]不存在", method.getName(), name));
						continue;
					}
					
					IAction iAction = new IAction() {
						@Override
						public Object execute(Object[] args) throws Throwable {
							if (!method.isAccessible()) {
								method.setAccessible(true);
							}
							try {
								return method.invoke(getSelf(), args);
							} catch (InvocationTargetException e) {
								Throwable ex = ExceptionUtils.unwrapThrowable(e);
								throw ex;
							}
						}
					};
					
					IDEActionPluginRuntime iDEActionPluginRuntime = new DEActionPluginRuntimeBase() {
						@Override
						protected Object onExecute(Object[] args) throws Throwable {
							return iAction.execute(args);
						}
					};

					this.getDEMethodPluginRuntimeRepo().registerDEActionPluginRuntime(this.getDataEntityRuntime(), iPSDEAction.getName(), iDEActionPluginRuntime);
					continue;
				}
			}
			
			if(true) {
				DEDataSet deDataSet = method.getAnnotation(DEDataSet.class);
				if (deDataSet != null) {
					String name = deDataSet.name();
					if (!StringUtils.hasLength(name)) {
						name = deDataSet.value();
					}
	
					if (!StringUtils.hasLength(name)) {
						throw new Exception(String.format("代码方法[%1$s]实体数据集注解未指定数据集标识", method.getName()));
					}
	
					IPSDEDataSet iPSDEDataSet = this.getDataEntityRuntime().getPSDEDataSet(name);
					if (iPSDEDataSet == null) {
						log.error(String.format("代码方法[%1$s]实体数据集注解数据集[%2$s]不存在", method.getName(), name));
						continue;
					}
					
					IAction iAction = new IAction() {
						@Override
						public Object execute(Object[] args) throws Throwable {
							if (!method.isAccessible()) {
								method.setAccessible(true);
							}
							try {
								return method.invoke(getSelf(), args);
							} catch (InvocationTargetException e) {
								Throwable ex = ExceptionUtils.unwrapThrowable(e);
								throw ex;
							}
						}
					};
					
					IDEDataSetPluginRuntime iDEDataSetPluginRuntime = new DEDataSetPluginRuntimeBase() {
						@Override
						protected Object onFetch(Object[] args) throws Throwable {
							return iAction.execute(args);
						}
					};
	
					this.getDEMethodPluginRuntimeRepo().registerDEDataSetPluginRuntime(this.getDataEntityRuntime(), iPSDEDataSet.getName(), iDEDataSetPluginRuntime);
	
					continue;
				}
			}
			
			if(true) {
				DEActionLogic deActionLogic = method.getAnnotation(DEActionLogic.class);
				if (deActionLogic != null) {
					String name = deActionLogic.name();
					if (!StringUtils.hasLength(name)) {
						throw new Exception(String.format("代码方法[%1$s]实体行为逻辑注解未指定行为标识", method.getName()));
					}

					String mode = deActionLogic.mode();
					if (!StringUtils.hasLength(mode)) {
						throw new Exception(String.format("代码方法[%1$s]实体行为逻辑注解未指定附加模式", method.getName()));
					}
					
					IPSDEAction iPSDEAction = this.getDataEntityRuntime().getPSDEAction(name);
					if (iPSDEAction == null) {
						log.error(String.format("代码方法[%1$s]实体行为注解行为[%2$s]不存在", method.getName(), name));
						continue;
					}
					
					IDEActionLogicRuntimeBase iDEActionLogicRuntimeBase = new IDEActionLogicRuntimeBase() {
						@Override
						public Object execute(IDataEntityRuntimeContext iDataEntityRuntimeContext, IPSDEAction iPSDEAction, Object[] args, Object ret) throws Throwable {
							if (!method.isAccessible()) {
								method.setAccessible(true);
							}
							if(DEActionLogicAttachModes.AFTER.equalsIgnoreCase(mode)) {
								Class<?> returnType = method.getReturnType();
								Object realRet = null;
								if(method.getParameterCount() == 2) {
									try {
										realRet = method.invoke(getSelf(), new Object[] {args[0], ret});
									} catch (InvocationTargetException e) {
										Throwable ex = ExceptionUtils.unwrapThrowable(e);
										throw ex;
									}
								}
								else {
									try {
										realRet = method.invoke(getSelf(), new Object[] {args[0]});
									} catch (InvocationTargetException e) {
										Throwable ex = ExceptionUtils.unwrapThrowable(e);
										throw ex;
									}
								}
								if (returnType.equals(Void.TYPE)) {
									//没有返回值
									return ret;
								}
								return realRet;
							}
							else {
								try {
									return method.invoke(getSelf(), new Object[] {args[0]});
								} catch (InvocationTargetException e) {
									Throwable ex = ExceptionUtils.unwrapThrowable(e);
									throw ex;
								}
							}
						}

						@Override
						public String getAttachMode() {
							return mode;
						}
					};
					
					this.getDEMethodPluginRuntimeRepo().registerDEActionLogicRuntimeBaseIf(this.getDataEntityRuntime(), iPSDEAction.getName(), iDEActionLogicRuntimeBase);
					continue;
				}
			}
			
			if(true) {
				DEDataSetLogic deDataSetLogic = method.getAnnotation(DEDataSetLogic.class);
				if (deDataSetLogic != null) {
					String name = deDataSetLogic.name();
					if (!StringUtils.hasLength(name)) {
						throw new Exception(String.format("代码方法[%1$s]实体数据集逻辑注解未指定行为标识", method.getName()));
					}

					String mode = deDataSetLogic.mode();
					if (!StringUtils.hasLength(mode)) {
						throw new Exception(String.format("代码方法[%1$s]实体数据集逻辑注解未指定附加模式", method.getName()));
					}
					
					IPSDEDataSet iPSDEDataSet = this.getDataEntityRuntime().getPSDEDataSet(name);
					if (iPSDEDataSet == null) {
						log.error(String.format("代码方法[%1$s]实体数据集注解数据集[%2$s]不存在", method.getName(), name));
						continue;
					}
					
					IDEDataSetLogicRuntimeBase iDEDataSetLogicRuntimeBase = new IDEDataSetLogicRuntimeBase() {
						@Override
						public Object execute(IDataEntityRuntimeContext iDataEntityRuntimeContext, IPSDEDataSet iPSDEDataSet, Object[] args, Object ret) throws Throwable {
							if (!method.isAccessible()) {
								method.setAccessible(true);
							}
							if(DEActionLogicAttachModes.AFTER.equalsIgnoreCase(mode)) {
								Class<?> returnType = method.getReturnType();
								Object realRet = null;
								if(method.getParameterCount() == 2) {
									try {
										realRet = method.invoke(getSelf(), new Object[] {args[0], ret});
									} catch (InvocationTargetException e) {
										Throwable ex = ExceptionUtils.unwrapThrowable(e);
										throw ex;
									}
								}
								else {
									try {
										realRet = method.invoke(getSelf(), new Object[] {args[0]});
									} catch (InvocationTargetException e) {
										Throwable ex = ExceptionUtils.unwrapThrowable(e);
										throw ex;
									}
								}
								if (returnType.equals(Void.TYPE)) {
									//没有返回值
									return ret;
								}
								return realRet;
							}
							else {
								try {
									return method.invoke(getSelf(), new Object[] {args[0]});
								} catch (InvocationTargetException e) {
									Throwable ex = ExceptionUtils.unwrapThrowable(e);
									throw ex;
								}
							}
						}

						@Override
						public String getAttachMode() {
							return mode;
						}
					};
					
					this.getDEMethodPluginRuntimeRepo().registerDEDataSetLogicRuntimeBaseIf(this.getDataEntityRuntime(), iPSDEDataSet.getName(), iDEDataSetLogicRuntimeBase);
					continue;
				}
			}
			

		}
		
		
	}
	
	@Override
	protected void onUninstall() throws Throwable {
		super.onUninstall();
		
		try {
			this.deMethodPluginRuntimeRepo.shutdown();
		} catch (Throwable ex) {
			log.error(String.format("关闭实体方法插件运行时仓库发生异常，%1$s", ex.getMessage()), ex);
		}
	}
}
