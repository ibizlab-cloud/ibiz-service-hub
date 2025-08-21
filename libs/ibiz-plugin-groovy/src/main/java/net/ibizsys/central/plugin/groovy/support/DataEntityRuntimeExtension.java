package net.ibizsys.central.plugin.groovy.support;

import java.util.List;

import com.fasterxml.jackson.databind.node.ObjectNode;

import groovy.lang.Closure;
import net.ibizsys.central.dataentity.IDataEntityRuntime;
import net.ibizsys.central.dataentity.logic.IDEMSLogicRuntime;
import net.ibizsys.central.util.IEntityDTO;
import net.ibizsys.central.util.ISearchContextDTO;
import net.ibizsys.codegen.groovy.support.PSDataEntityExtension;
import net.ibizsys.runtime.dataentity.DataEntityRuntimeException;
import net.ibizsys.runtime.util.IAction;
import net.ibizsys.runtime.util.ITransactionalUtil;
import net.ibizsys.runtime.util.JsonUtils;

/**
 * @author lionlau
 *
 */
public class DataEntityRuntimeExtension {

	private static final org.apache.commons.logging.Log log = org.apache.commons.logging.LogFactory.getLog(DataEntityRuntimeExtension.class);
	
	/**
	 * 建立数据对象
	 * @param iDataEntityRuntime
	 * @return
	 */
	public static IEntityDTO entity(IDataEntityRuntime iDataEntityRuntime) {
		return iDataEntityRuntime.createEntity();
	}
	
	
	/**
	 * 建立数据对象列表
	 * @param iDataEntityRuntime
	 * @return
	 */
	public static List<IEntityDTO> list(IDataEntityRuntime iDataEntityRuntime){
		return iDataEntityRuntime.createEntityList();
	}
	
	
	/**
	 * 建立数据对象列表
	 * @param iDataEntityRuntime
	 * @return
	 */
	public static List<IEntityDTO> entities(IDataEntityRuntime iDataEntityRuntime){
		return iDataEntityRuntime.createEntityList();
	}
	
	/**
	 * 建立过滤器对象
	 * @param iDataEntityRuntime
	 * @return
	 */
	public static ISearchContextDTO filter(IDataEntityRuntime iDataEntityRuntime) {
		return iDataEntityRuntime.createSearchContext();
	}
	
//	Object mandatory(IAction iAction, Object[] args) throws Throwable;
//	
//	
//	Object nested(IAction iAction, Object[] args) throws Throwable;
//	
//	
//	Object never(IAction iAction, Object[] args) throws Throwable;
//	
//	
//	Object not_supported(IAction iAction, Object[] args) throws Throwable;
	
	
//	Object required(IAction iAction, Object[] args) throws Throwable;
	
	
	/**
	 * 要求新开事务执行操作
	 * @param iDataEntityRuntime
	 * @param closure
	 * @return
	 * @throws Throwable
	 */
	public static Object requiredNew(IDataEntityRuntime iDataEntityRuntime, Closure<?> closure) throws Throwable {
		return iDataEntityRuntime.execute(new IAction() {
			@Override
			public Object execute(Object[] args) throws Throwable {
				return closure.call();
			}
		}, null, ITransactionalUtil.PROPAGATION_REQUIRES_NEW);
	}
	
	
	/**
	 * 实体运行时执行闭包，开始新会话
	 * @param iDataEntityRuntime
	 * @param closure
	 * @return
	 * @throws Throwable
	 */
	public static Object execute(IDataEntityRuntime iDataEntityRuntime, Closure<?> closure) throws Throwable {
		return iDataEntityRuntime.execute(new IAction() {
			@Override
			public Object execute(Object[] args) throws Throwable {
				return closure.call();
			}
		}, null);
	}
	
	/**
	 * 获取传入数据的主状态迁移对象
	 * @param iDataEntityRuntime
	 * @param iEntityDTO
	 * @param tryMode
	 * @return
	 */
	public static IDEMSLogicRuntime mslogic(IDataEntityRuntime iDataEntityRuntime, IEntityDTO iEntityDTO, boolean tryMode) {
		return iDataEntityRuntime.getDEMSLogicRuntime(iEntityDTO, tryMode);
	}
	
	
	public static ObjectNode getJsonSchemaModel(net.ibizsys.central.cloud.core.dataentity.IDataEntityRuntime iDataEntityRuntime) {
		if(iDataEntityRuntime.isEnableExtension() && iDataEntityRuntime.getDEExtensionUtilRuntime() != null) {
			return iDataEntityRuntime.getDEExtensionUtilRuntime().getJsonSchemaModel(null);
		}
		try {
			return JsonUtils.toObjectNode(PSDataEntityExtension.getJsonSchema(iDataEntityRuntime.getPSDataEntity()));
		} catch (Exception ex) {
			throw new DataEntityRuntimeException(iDataEntityRuntime, String.format("获取JsonSchema发生异常，%1$s", ex.getMessage()), ex);
		}
	}
	
//	Object supports(IAction iAction, Object[] args) throws Throwable;
	
	/**
	 * 下面代码无法解决闭包混淆问题
	 */
//	public static IEntityDTO create(IDataEntityRuntime iDataEntityRuntime, @DelegatesTo(IEntityDTO.class) Closure<?> closure) {
//		Assert.notNull(closure, "传入闭包对象无效");
//		IEntityDTO iEntityDTO = iDataEntityRuntime.createEntity();
//		closure.setDelegate(iEntityDTO);	
//		closure.setResolveStrategy(Closure.DELEGATE_FIRST);
//		closure.call();
//		try {
//			iDataEntityRuntime.executeAction(DEActions.CREATE, null, new Object[] { iEntityDTO });
//			return iEntityDTO;
//		} catch (Throwable ex) {
//			DataEntityRuntimeException.rethrow(iDataEntityRuntime, ex);
//			log.error(String.format("实体[%1$s]建立数据发生异常，%2$s", iDataEntityRuntime.getName(), ex.getMessage()), ex);
//			throw new DataEntityRuntimeException(iDataEntityRuntime, String.format("建立数据发生异常，%1$s", ex.getMessage()), ex);
//		}
//	}
//	
//	public static IEntityDTO update(IDataEntityRuntime iDataEntityRuntime, @DelegatesTo(IEntityDTO.class) Closure<?> closure) {
//		Assert.notNull(closure, "传入闭包对象无效");
//		IEntityDTO iEntityDTO = iDataEntityRuntime.createEntity();
//		closure.setDelegate(iEntityDTO);
//		closure.setResolveStrategy(Closure.DELEGATE_FIRST);
//		closure.call();
//		
//		try {
//			iDataEntityRuntime.executeAction(DEActions.UPDATE, null, new Object[] { iEntityDTO });
//			return iEntityDTO;
//		} catch (Throwable ex) {
//			DataEntityRuntimeException.rethrow(iDataEntityRuntime, ex);
//			log.error(String.format("实体[%1$s]更新数据发生异常，%2$s", iDataEntityRuntime.getName(), ex.getMessage()), ex);
//			throw new DataEntityRuntimeException(iDataEntityRuntime, String.format("更新数据发生异常，%1$s", ex.getMessage()), ex);
//		}
//	}
//	
}
