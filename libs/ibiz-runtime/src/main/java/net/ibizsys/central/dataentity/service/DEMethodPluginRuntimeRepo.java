package net.ibizsys.central.dataentity.service;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.util.Assert;
import org.springframework.util.ObjectUtils;

import net.ibizsys.central.ISystemRuntime;
import net.ibizsys.central.dataentity.IDataEntityExtendLogic;
import net.ibizsys.central.dataentity.IDataEntityInheritLogic;
import net.ibizsys.central.dataentity.IDataEntityRuntime;
import net.ibizsys.central.dataentity.action.DEActionLogicRuntimeBase;
import net.ibizsys.central.dataentity.action.IDEActionLogicRuntimeBase;
import net.ibizsys.central.dataentity.datasync.IDEDataSyncOutRuntimeBase;
import net.ibizsys.central.dataentity.defield.IDEFValueRuleRuntimeBase;
import net.ibizsys.central.dataentity.der.DER11RuntimeBaseBase;
import net.ibizsys.central.dataentity.der.DER1NRuntimeBaseBase;
import net.ibizsys.central.dataentity.der.DERCustom11RuntimeBaseBase;
import net.ibizsys.central.dataentity.der.DERCustom1NRuntimeBaseBase;
import net.ibizsys.central.dataentity.der.DERInheritRuntimeBaseBase;
import net.ibizsys.central.dataentity.der.DERMultiInheritRuntimeBaseBase;
import net.ibizsys.central.dataentity.der.IDERRuntimeBase;
import net.ibizsys.central.dataentity.ds.IDEDataSetLogicRuntimeBase;
import net.ibizsys.central.dataentity.state.IDEUniStateRuntimeBase;
import net.ibizsys.model.IPSModelObject;
import net.ibizsys.model.PSModelEnums.DERSubType;
import net.ibizsys.model.PSModelEnums.DERType;
import net.ibizsys.model.dataentity.action.IPSDEAction;
import net.ibizsys.model.dataentity.action.IPSDEActionLogic;
import net.ibizsys.model.dataentity.defield.IPSDEField;
import net.ibizsys.model.dataentity.der.IPSDER11;
import net.ibizsys.model.dataentity.der.IPSDER1N;
import net.ibizsys.model.dataentity.der.IPSDERBase;
import net.ibizsys.model.dataentity.der.IPSDERCustom;
import net.ibizsys.model.dataentity.der.IPSDERInherit;
import net.ibizsys.model.dataentity.der.IPSDERMultiInherit;
import net.ibizsys.model.dataentity.ds.IPSDEDataSet;
import net.ibizsys.runtime.IModelRuntimeShutdownable;
import net.ibizsys.runtime.dataentity.action.IDEActionLogicRuntime;
import net.ibizsys.runtime.dataentity.action.IDEActionPluginRuntime;
import net.ibizsys.runtime.dataentity.ds.IDEDataSetPluginRuntime;
import net.ibizsys.runtime.util.IAction;
import net.ibizsys.runtime.util.IEntityBase;
import net.ibizsys.runtime.util.INamedAction;
import net.ibizsys.runtime.util.KeyValueUtils;

/**
 * 实体行为插件运行时仓库
 * @author lionlau
 *
 */
public class DEMethodPluginRuntimeRepo implements IModelRuntimeShutdownable{

	private static final Log log = LogFactory.getLog(DEMethodPluginRuntimeRepo.class);
	
	private ISystemRuntime iSystemRuntime = null;
	private List<Runnable> unregisterActionList = new ArrayList<Runnable>();
	private boolean bUnregisterWhenShutdown = false;
	
	public void init(ISystemRuntime iSystemRuntime, boolean bUnregisterWhenShutdown) throws Exception {
		Assert.notNull(iSystemRuntime, "传入系统运行时对象无效");
		this.iSystemRuntime = iSystemRuntime;
		this.bUnregisterWhenShutdown = bUnregisterWhenShutdown;
		this.onInit();
		if(this.bUnregisterWhenShutdown) {
			this.iSystemRuntime.unregisterModelRuntimeShutdownable(this);
		}
	}
	
	
	protected void onInit() throws Exception {
		
	}
	
	public ISystemRuntime getSystemRuntime() {
		return this.iSystemRuntime;
	}

	protected boolean isUnregisterWhenShutdown() {
		return this.bUnregisterWhenShutdown;
	}

	@Override
	public synchronized void shutdown() throws Exception {
		if(!ObjectUtils.isEmpty(this.unregisterActionList)) {
			for(Runnable runnable : this.unregisterActionList) {
				try {
					runnable.run();
				}
				catch (Throwable ex) {
					log.error(ex);
				}
			}
			this.unregisterActionList.clear();
		}
	}
	
	public synchronized void registerDEActionPluginRuntime(String strDataEntityTag, String strActionTag, IDEActionPluginRuntime iDEActionPluginRuntime) throws Exception {
		Assert.hasLength(strDataEntityTag, "未传入实体标记");
		IDataEntityRuntime iDataEntityRuntime = this.getSystemRuntime().getDataEntityRuntime(strDataEntityTag, true);
		if(iDataEntityRuntime == null) {
			throw new Exception(String.format("无法获取指定实体[%1$s]运行时对象", strDataEntityTag));
		}
		registerDEActionPluginRuntime(iDataEntityRuntime, strActionTag, iDEActionPluginRuntime);
	}
	
	public synchronized void registerDEActionPluginRuntime(IDataEntityRuntime iDataEntityRuntime, String strActionTag, IDEActionPluginRuntime iDEActionPluginRuntime) throws Exception {
		Assert.notNull(iDataEntityRuntime, "未传入实体运行时模型对象");
		Assert.hasLength(strActionTag, "未传入实体行为标记");
		
		IPSDEAction iPSDEAction = iDataEntityRuntime.getPSDEAction(strActionTag);
		if(iPSDEAction == null) {
			throw new Exception(String.format("无法获取指定实体行为[%1$s.%2$s]模型对象", iDataEntityRuntime.getFullUniqueTag(), strActionTag));
		}
		
		final String strRealActionTag = iPSDEAction.getName();
		iDataEntityRuntime.registerDEActionPluginRuntime(iPSDEAction.getName(), iDEActionPluginRuntime);
		if(isUnregisterWhenShutdown()) {
			this.unregisterActionList.add(new Runnable() {
				@Override
				public void run() {
					iDataEntityRuntime.unregisterDEActionPluginRuntime(strRealActionTag, iDEActionPluginRuntime);
				}
			});
		}
	}
	
	public synchronized boolean registerDEActionPluginRuntimeIf(String strDataEntityTag, String strActionTag, IDEActionPluginRuntime iDEActionPluginRuntime) throws Exception {
		Assert.hasLength(strDataEntityTag, "未传入实体标记");
		IDataEntityRuntime iDataEntityRuntime = this.getSystemRuntime().getDataEntityRuntime(strDataEntityTag, true);
		if(iDataEntityRuntime == null) {
			throw new Exception(String.format("无法获取指定实体[%1$s]运行时对象", strDataEntityTag));
		}
		return registerDEActionPluginRuntimeIf(iDataEntityRuntime, strActionTag, iDEActionPluginRuntime);
		
	}
	/**
	 * 注册实体行为运行时
	 * @param strFullActionTag
	 * @param iDEActionRuntime
	 * @throws Exception
	 */
	public synchronized boolean registerDEActionPluginRuntimeIf(IDataEntityRuntime iDataEntityRuntime, String strActionTag, IDEActionPluginRuntime iDEActionPluginRuntime) throws Exception {
		Assert.notNull(iDataEntityRuntime, "未传入实体运行时模型对象");
		Assert.hasLength(strActionTag, "未传入实体行为标记");
		Assert.notNull(iDEActionPluginRuntime, "未传入实体行为插件运行时对象");
		
		IPSDEAction iPSDEAction = iDataEntityRuntime.getPSDEAction(strActionTag);
		if(iPSDEAction == null) {
			log.warn(String.format("无法获取指定实体行为[%1$s.%2$s]模型对象，忽略注册插件", iDataEntityRuntime.getFullUniqueTag(), strActionTag));
			return false;
		}
		
		if(iPSDEAction.getPSSysSFPlugin() != null) {
			log.warn(String.format("指定实体行为[%1$s.%2$s]已经绑定插件，忽略注册插件", iDataEntityRuntime.getFullUniqueTag(), strActionTag));
			return false;
		}
		
		//需要进一步判断行为的类型及是否已经绑定插件
//		if(!DEActionTypes.USERCUSTOM.equalsIgnoreCase(iPSDEAction.getActionType())) {
//			log.warn(String.format("实体行为[%1$s.%2$s]类型不是[用户自定义]，忽略注册插件", iDataEntityRuntime.getFullUniqueTag(), strActionTag));
//			return false;
//		}
		
		final String strRealActionTag = iPSDEAction.getName();
		iDataEntityRuntime.registerDEActionPluginRuntime(iPSDEAction.getName(), iDEActionPluginRuntime);
		if(isUnregisterWhenShutdown()) {
			this.unregisterActionList.add(new Runnable() {
				@Override
				public void run() {
					iDataEntityRuntime.unregisterDEActionPluginRuntime(strRealActionTag, iDEActionPluginRuntime);
				}
			});
		}
		return true;
	}
	
	public synchronized boolean registerDEActionLogicRuntimeIf(String strDataEntityTag, String strActionTag, String strAttachMode, IAction iAction) throws Exception {
		Assert.hasLength(strDataEntityTag, "未传入实体标记");
		IDataEntityRuntime iDataEntityRuntime = this.getSystemRuntime().getDataEntityRuntime(strDataEntityTag, true);
		if(iDataEntityRuntime == null) {
			throw new Exception(String.format("无法获取指定实体[%1$s]运行时对象", strDataEntityTag));
		}
		return registerDEActionLogicRuntimeIf(iDataEntityRuntime, strActionTag, strAttachMode, iAction);
	}
	
	/**
	 * 注册实体行为逻辑运行时
	 * @param strFullActionTag
	 * @param iDEActionRuntime
	 * @throws Exception
	 */
	public synchronized boolean registerDEActionLogicRuntimeIf(IDataEntityRuntime iDataEntityRuntime, String strActionTag, String strAttachMode, IAction iAction) throws Exception {
		Assert.notNull(iDataEntityRuntime, "未传入实体运行时模型对象");
		Assert.hasLength(strActionTag, "未传入实体行为标记");
		Assert.hasLength(strAttachMode, "未传入实体行为逻辑附加模式");
		Assert.notNull(iAction, "未传入实体行为逻辑行为对象");
		
		IPSDEAction iPSDEAction = iDataEntityRuntime.getPSDEAction(strActionTag);
		if(iPSDEAction == null) {
			log.warn(String.format("无法获取指定实体行为[%1$s.%2$s]模型对象", iDataEntityRuntime.getFullUniqueTag(), strActionTag));
			return false;
		}
		
		IDEActionLogicRuntime iDEActionLogicRuntime = new DEActionLogicRuntimeBase() {

			@Override
			public String getId() {
				return KeyValueUtils.genGuidEx();
			}
			
			@Override
			public String getName() {
				if(iAction instanceof INamedAction) {
					return ((INamedAction)iAction).getName();
				}
				return "行为附加逻辑";
			}
			
			@Override
			public IPSDEActionLogic getPSDEActionLogic() {
				throw new RuntimeException("未支持");
			}
			
			@Override
			public IPSModelObject getPSModelObject() {
				throw new RuntimeException("未支持");
			}
			
			@Override
			public String getAttachMode() {
				return strAttachMode;
			}

			@Override
			public Object execute(IEntityBase iEntityBase) throws Throwable {
				return iAction.execute(new Object[] {iEntityBase});
			}
			
		};
		
		final String strRealActionTag = iPSDEAction.getName();
		iDataEntityRuntime.registerDEActionLogicRuntime(iPSDEAction.getName(), iDEActionLogicRuntime);
		if(isUnregisterWhenShutdown()) {
			this.unregisterActionList.add(new Runnable() {
				@Override
				public void run() {
					iDataEntityRuntime.unregisterDEActionLogicRuntime(strRealActionTag, iDEActionLogicRuntime);
				}
			});
		}
		return true;
	}
	
	
	public synchronized void registerDEDataSetPluginRuntime(String strDataEntityTag, String strDataSetTag, IDEDataSetPluginRuntime iDEDataSetPluginRuntime) throws Exception {
		Assert.hasLength(strDataEntityTag, "未传入实体标记");
		IDataEntityRuntime iDataEntityRuntime = this.getSystemRuntime().getDataEntityRuntime(strDataEntityTag, true);
		if(iDataEntityRuntime == null) {
			throw new Exception(String.format("无法获取指定实体[%1$s]运行时对象", strDataEntityTag));
		}
		registerDEDataSetPluginRuntime(iDataEntityRuntime, strDataSetTag, iDEDataSetPluginRuntime);
	}
	
	public synchronized void registerDEDataSetPluginRuntime(IDataEntityRuntime iDataEntityRuntime, String strDataSetTag, IDEDataSetPluginRuntime iDEDataSetPluginRuntime) throws Exception {
		Assert.notNull(iDataEntityRuntime, "未传入实体运行时模型对象");
		Assert.hasLength(strDataSetTag, "未传入实体数据集标记");
		
		IPSDEDataSet iPSDEDataSet = iDataEntityRuntime.getPSDEDataSet(strDataSetTag);
		if(iPSDEDataSet == null) {
			throw new Exception(String.format("无法获取指定实体数据集[%1$s.%2$s]模型对象", iDataEntityRuntime.getFullUniqueTag(), strDataSetTag));
		}
		
		final String strRealDataSetTag = iPSDEDataSet.getName();
		iDataEntityRuntime.registerDEDataSetPluginRuntime(iPSDEDataSet.getName(), iDEDataSetPluginRuntime);
		if(isUnregisterWhenShutdown()) {
			this.unregisterActionList.add(new Runnable() {
				@Override
				public void run() {
					iDataEntityRuntime.unregisterDEDataSetPluginRuntime(strRealDataSetTag, iDEDataSetPluginRuntime);
				}
			});
		}
	}
	
	public synchronized boolean registerDEDataSetPluginRuntimeIf(String strDataEntityTag, String strDataSetTag, IDEDataSetPluginRuntime iDEDataSetPluginRuntime) throws Exception {
		Assert.hasLength(strDataEntityTag, "未传入实体标记");
		IDataEntityRuntime iDataEntityRuntime = this.getSystemRuntime().getDataEntityRuntime(strDataEntityTag, true);
		if(iDataEntityRuntime == null) {
			throw new Exception(String.format("无法获取指定实体[%1$s]运行时对象", strDataEntityTag));
		}
		return registerDEDataSetPluginRuntimeIf(iDataEntityRuntime, strDataSetTag, iDEDataSetPluginRuntime);
		
	}
	/**
	 * 注册实体数据集运行时
	 * @param strFullDataSetTag
	 * @param iDEDataSetRuntime
	 * @throws Exception
	 */
	public synchronized boolean registerDEDataSetPluginRuntimeIf(IDataEntityRuntime iDataEntityRuntime, String strDataSetTag, IDEDataSetPluginRuntime iDEDataSetPluginRuntime) throws Exception {
		Assert.notNull(iDataEntityRuntime, "未传入实体运行时模型对象");
		Assert.hasLength(strDataSetTag, "未传入实体数据集标记");
		Assert.notNull(iDEDataSetPluginRuntime, "未传入实体数据集插件运行时对象");
		
		IPSDEDataSet iPSDEDataSet = iDataEntityRuntime.getPSDEDataSet(strDataSetTag);
		if(iPSDEDataSet == null) {
			//throw new Exception();
			log.warn(String.format("无法获取指定实体数据集[%1$s.%2$s]模型对象，忽略注册插件", iDataEntityRuntime.getFullUniqueTag(), strDataSetTag));
			return false;
		}
		
		if(iPSDEDataSet.getPSSysSFPlugin() != null) {
			log.warn(String.format("指定实体数据集[%1$s.%2$s]已经绑定插件，忽略注册插件", iDataEntityRuntime.getFullUniqueTag(), strDataSetTag));
			return false;
		}
		
		//需要进一步判断数据集的类型及是否已经绑定插件
//		if(!DEDataSetTypes.USERCUSTOM.equalsIgnoreCase(iPSDEDataSet.getDataSetType())) {
//			log.warn(String.format("实体数据集[%1$s.%2$s]类型不是[用户自定义]，忽略注册插件", iDataEntityRuntime.getFullUniqueTag(), strDataSetTag));
//			return false;
//		}
		
		final String strRealDataSetTag = iPSDEDataSet.getName();
		iDataEntityRuntime.registerDEDataSetPluginRuntime(iPSDEDataSet.getName(), iDEDataSetPluginRuntime);
		if(isUnregisterWhenShutdown()) {
			this.unregisterActionList.add(new Runnable() {
				@Override
				public void run() {
					iDataEntityRuntime.unregisterDEDataSetPluginRuntime(strRealDataSetTag, iDEDataSetPluginRuntime);
				}
			});
		}
		return true;
	}
	
	
	/**
	 * 注册实体数据集逻辑运行时
	 * @param strFullDataSetTag
	 * @param iDEDataSetRuntime
	 * @throws Exception
	 */
	public synchronized boolean registerDEDataSetLogicRuntimeBaseIf(String strDataEntityTag, String strDataSetTag, IDEDataSetLogicRuntimeBase iDEDataSetLogicRuntimeBase) throws Exception {
		Assert.hasLength(strDataEntityTag, "未传入实体标记");
		IDataEntityRuntime iDataEntityRuntime = this.getSystemRuntime().getDataEntityRuntime(strDataEntityTag, true);
		if(iDataEntityRuntime == null) {
			throw new Exception(String.format("无法获取指定实体[%1$s]运行时对象", strDataEntityTag));
		}
		return this.registerDEDataSetLogicRuntimeBaseIf(iDataEntityRuntime, strDataSetTag, iDEDataSetLogicRuntimeBase);
	}
	
	/**
	 * 注册实体数据集逻辑运行时
	 * @param strFullDataSetTag
	 * @param iDEDataSetRuntime
	 * @throws Exception
	 */
	public synchronized boolean registerDEDataSetLogicRuntimeBaseIf(IDataEntityRuntime iDataEntityRuntime, String strDataSetTag, IDEDataSetLogicRuntimeBase iDEDataSetLogicRuntimeBase) throws Exception {
		Assert.notNull(iDataEntityRuntime, "未传入实体运行时模型对象");
		Assert.hasLength(strDataSetTag, "未传入实体数据集标记");
		Assert.notNull(iDEDataSetLogicRuntimeBase, "未传入实体数据集逻辑运行时对象");
		
		IPSDEDataSet iPSDEDataSet = iDataEntityRuntime.getPSDEDataSet(strDataSetTag);
		if(iPSDEDataSet == null) {
			log.warn(String.format("无法获取指定实体数据集[%1$s.%2$s]模型对象", iDataEntityRuntime.getFullUniqueTag(), strDataSetTag));
			return false;
		}
		
		final String strRealDataSetTag = iPSDEDataSet.getName();
		iDataEntityRuntime.registerDEDataSetLogicRuntimeBase(iPSDEDataSet.getName(), iDEDataSetLogicRuntimeBase);
		if(isUnregisterWhenShutdown()) {
			this.unregisterActionList.add(new Runnable() {
				@Override
				public void run() {
					iDataEntityRuntime.unregisterDEDataSetLogicRuntimeBase(strRealDataSetTag, iDEDataSetLogicRuntimeBase);
				}
			});
		}
		return true;
	}
	
	/**
	 * 注册实体行为逻辑运行时
	 * @param strFullActionTag
	 * @param iDEActionRuntime
	 * @throws Exception
	 */
	public synchronized boolean registerDEActionLogicRuntimeBaseIf(String strDataEntityTag, String strActionTag, IDEActionLogicRuntimeBase iDEActionLogicRuntimeBase) throws Exception {
		Assert.hasLength(strDataEntityTag, "未传入实体标记");
		
		IDataEntityRuntime iDataEntityRuntime = this.getSystemRuntime().getDataEntityRuntime(strDataEntityTag, true);
		if(iDataEntityRuntime == null) {
			throw new Exception(String.format("无法获取指定实体[%1$s]运行时对象", strDataEntityTag));
		}
		
		return this.registerDEActionLogicRuntimeBaseIf(iDataEntityRuntime, strActionTag, iDEActionLogicRuntimeBase);
	}
	
	/**
	 * 注册实体行为逻辑运行时
	 * @param iDataEntityRuntime
	 * @param strActionTag
	 * @param iDEActionLogicRuntimeBase
	 * @return
	 * @throws Exception
	 */
	public synchronized boolean registerDEActionLogicRuntimeBaseIf(IDataEntityRuntime iDataEntityRuntime, String strActionTag, IDEActionLogicRuntimeBase iDEActionLogicRuntimeBase) throws Exception {
		Assert.notNull(iDataEntityRuntime, "未传入实体运行时模型对象");
		Assert.hasLength(strActionTag, "未传入实体行为标记");
		Assert.notNull(iDEActionLogicRuntimeBase, "未传入实体行为逻辑运行时对象");
		
		
		IPSDEAction iPSDEAction = iDataEntityRuntime.getPSDEAction(strActionTag);
		if(iPSDEAction == null) {
			log.warn(String.format("无法获取指定实体行为[%1$s.%2$s]模型对象", iDataEntityRuntime.getFullUniqueTag(), strActionTag));
			return false;
		}
		
		final String strRealActionTag = iPSDEAction.getName();
		iDataEntityRuntime.registerDEActionLogicRuntimeBase(iPSDEAction.getName(), iDEActionLogicRuntimeBase);
		if(isUnregisterWhenShutdown()) {
			this.unregisterActionList.add(new Runnable() {
				@Override
				public void run() {
					iDataEntityRuntime.unregisterDEActionLogicRuntimeBase(strRealActionTag, iDEActionLogicRuntimeBase);
				}
			});
		}
		return true;
	}
	
	/**
	 * 注册实体数据同步运行时
	 * @param strFullDataSyncOutTag
	 * @param iDEDataSyncOutRuntime
	 * @throws Exception
	 */
	public synchronized boolean registerDEDataSyncOutRuntimeBase(String strDataEntityTag, IDEDataSyncOutRuntimeBase iDEDataSyncOutRuntimeBase) throws Exception {
		Assert.hasLength(strDataEntityTag, "未传入实体标记");
		IDataEntityRuntime iDataEntityRuntime = this.getSystemRuntime().getDataEntityRuntime(strDataEntityTag, true);
		if(iDataEntityRuntime == null) {
			throw new Exception(String.format("无法获取指定实体[%1$s]运行时对象", strDataEntityTag));
		}
		return this.registerDEDataSyncOutRuntimeBase(iDataEntityRuntime, iDEDataSyncOutRuntimeBase);
	}
	
	/**
	 * 注册实体数据同步运行时
	 * @param strFullDataSyncOutTag
	 * @param iDEDataSyncOutRuntime
	 * @throws Exception
	 */
	public synchronized boolean registerDEDataSyncOutRuntimeBase(IDataEntityRuntime iDataEntityRuntime, IDEDataSyncOutRuntimeBase iDEDataSyncOutRuntimeBase) throws Exception {
		Assert.notNull(iDataEntityRuntime, "未传入实体运行时模型对象");
		Assert.notNull(iDEDataSyncOutRuntimeBase, "未传入实体数据同步运行时对象");
		
		iDataEntityRuntime.registerDEDataSyncOutRuntimeBase(iDEDataSyncOutRuntimeBase);
		if(isUnregisterWhenShutdown()) {
			this.unregisterActionList.add(new Runnable() {
				@Override
				public void run() {
					iDataEntityRuntime.unregisterDEDataSyncOutRuntimeBase(iDEDataSyncOutRuntimeBase);
				}
			});
		}
		return true;
	}
	
	/**
	 * 注册实体统一状态运行时
	 * @param strFullUniStateTag
	 * @param iDEUniStateRuntime
	 * @throws Exception
	 */
	public synchronized boolean registerDEUniStateRuntimeBase(String strDataEntityTag, IDEUniStateRuntimeBase iDEUniStateRuntimeBase) throws Exception {
		Assert.hasLength(strDataEntityTag, "未传入实体标记");
		IDataEntityRuntime iDataEntityRuntime = this.getSystemRuntime().getDataEntityRuntime(strDataEntityTag, true);
		if(iDataEntityRuntime == null) {
			throw new Exception(String.format("无法获取指定实体[%1$s]运行时对象", strDataEntityTag));
		}
		return this.registerDEUniStateRuntimeBase(iDataEntityRuntime, iDEUniStateRuntimeBase);
	}
	
	/**
	 * 注册实体统一状态运行时
	 * @param strFullUniStateTag
	 * @param iDEUniStateRuntime
	 * @throws Exception
	 */
	public synchronized boolean registerDEUniStateRuntimeBase(IDataEntityRuntime iDataEntityRuntime, IDEUniStateRuntimeBase iDEUniStateRuntimeBase) throws Exception {
		Assert.notNull(iDataEntityRuntime, "未传入实体运行时模型对象");
		Assert.notNull(iDEUniStateRuntimeBase, "未传入实体统一状态运行时对象");
		
		iDataEntityRuntime.registerDEUniStateRuntimeBase(iDEUniStateRuntimeBase);
		if(isUnregisterWhenShutdown()) {
			this.unregisterActionList.add(new Runnable() {
				@Override
				public void run() {
					iDataEntityRuntime.unregisterDEUniStateRuntimeBase(iDEUniStateRuntimeBase);
				}
			});
		}
		return true;
	}
	
	/**
	 * 注册实体继承逻辑
	 * @param strDataEntityTag
	 * @param iDataEntityInheritLogic
	 * @throws Exception
	 */
	public synchronized boolean registerDataEntityInheritLogic(String strDataEntityTag, IDataEntityInheritLogic iDataEntityInheritLogic) throws Exception {
		Assert.hasLength(strDataEntityTag, "未传入实体标记");
		IDataEntityRuntime iDataEntityRuntime = this.getSystemRuntime().getDataEntityRuntime(strDataEntityTag, true);
		if(iDataEntityRuntime == null) {
			throw new Exception(String.format("无法获取指定实体[%1$s]运行时对象", strDataEntityTag));
		}
		return this.registerDataEntityInheritLogic(iDataEntityRuntime, iDataEntityInheritLogic);
	}
	
	/**
	 * 注册实体继承逻辑
	 * @param iDataEntityRuntime
	 * @param iDataEntityInheritLogic
	 * @throws Exception
	 */
	public synchronized boolean registerDataEntityInheritLogic(IDataEntityRuntime iDataEntityRuntime, IDataEntityInheritLogic iDataEntityInheritLogic) throws Exception {
		Assert.notNull(iDataEntityRuntime, "未传入实体运行时模型对象");
		Assert.notNull(iDataEntityInheritLogic, "未传入实体继承逻辑对象");
		
		iDataEntityRuntime.registerDataEntityInheritLogic(iDataEntityInheritLogic);
		if(isUnregisterWhenShutdown()) {
			this.unregisterActionList.add(new Runnable() {
				@Override
				public void run() {
					iDataEntityRuntime.unregisterDataEntityInheritLogic(iDataEntityInheritLogic);
				}
			});
		}
		return true;
	}
	
	/**
	 * 注册实体扩展逻辑
	 * @param strDataEntityTag
	 * @param iDataEntityExtendLogic
	 * @throws Exception
	 */
	public synchronized boolean registerDataEntityExtendLogic(String strDataEntityTag, IDataEntityExtendLogic iDataEntityExtendLogic) throws Exception {
		Assert.hasLength(strDataEntityTag, "未传入实体标记");
		IDataEntityRuntime iDataEntityRuntime = this.getSystemRuntime().getDataEntityRuntime(strDataEntityTag, true);
		if(iDataEntityRuntime == null) {
			throw new Exception(String.format("无法获取指定实体[%1$s]运行时对象", strDataEntityTag));
		}
		return this.registerDataEntityExtendLogic(iDataEntityRuntime, iDataEntityExtendLogic);
	}
	
	/**
	 * 注册实体扩展逻辑
	 * @param iDataEntityRuntime
	 * @param iDataEntityExtendLogic
	 * @throws Exception
	 */
	public synchronized boolean registerDataEntityExtendLogic(IDataEntityRuntime iDataEntityRuntime, IDataEntityExtendLogic iDataEntityExtendLogic) throws Exception {
		Assert.notNull(iDataEntityRuntime, "未传入实体运行时模型对象");
		Assert.notNull(iDataEntityExtendLogic, "未传入实体继承逻辑对象");
		
		iDataEntityRuntime.registerDataEntityExtendLogic(iDataEntityExtendLogic);
		if(isUnregisterWhenShutdown()) {
			this.unregisterActionList.add(new Runnable() {
				@Override
				public void run() {
					iDataEntityRuntime.unregisterDataEntityExtendLogic(iDataEntityExtendLogic);
				}
			});
		}
		return true;
	}
	
	
	/**
	 * 注册实体属性值规则运行时
	 * @param iDataEntityRuntime
	 * @param strFieldName
	 * @param iDEFValueRuleRuntimeBase
	 * @return
	 * @throws Exception
	 */
	public synchronized boolean registerDEFValueRuleRuntimeBaseIf(IDataEntityRuntime iDataEntityRuntime, String strFieldName, IDEFValueRuleRuntimeBase iDEFValueRuleRuntimeBase) throws Exception {
		Assert.notNull(iDataEntityRuntime, "未传入实体运行时模型对象");
		Assert.hasLength(strFieldName, "未传入实体属性标记");
		Assert.notNull(iDEFValueRuleRuntimeBase, "未传入实体属性值规则运行时对象");
		
		
		IPSDEField iPSDEField = iDataEntityRuntime.getPSDEField(strFieldName);
		if(iPSDEField == null) {
			log.warn(String.format("无法获取指定实体属性[%1$s.%2$s]模型对象", iDataEntityRuntime.getFullUniqueTag(), iPSDEField));
			return false;
		}
		
		final String strRealFieldTag = iPSDEField.getName();
		iDataEntityRuntime.registerDEFValueRuleRuntimeBase(strRealFieldTag, iDEFValueRuleRuntimeBase);
		if(isUnregisterWhenShutdown()) {
			this.unregisterActionList.add(new Runnable() {
				@Override
				public void run() {
					iDataEntityRuntime.unregisterDEFValueRuleRuntimeBase(strRealFieldTag, iDEFValueRuleRuntimeBase);
				}
			});
		}
		return true;
	}
	
	/**
	 * 注册实体关系运行时
	 * @param iPSDERBase
	 * @throws Exception
	 */
	public synchronized boolean registerDERRuntimeBaseIf(IPSDERBase iPSDERBase) throws Exception {
		Assert.notNull(iPSDERBase, "未传入实体关系模型对象");
		IDataEntityRuntime iDataEntityRuntime = this.getSystemRuntime().getDataEntityRuntime(iPSDERBase.getMajorPSDataEntityMust().getId(), true);
		if(iDataEntityRuntime == null) {
			throw new Exception(String.format("无法获取指定关系主实体[%1$s]运行时对象", iPSDERBase.getMajorPSDataEntityMust().getId()));
		}
		
		IDataEntityRuntime minorDataEntityRuntime = this.getSystemRuntime().getDataEntityRuntime(iPSDERBase.getMinorPSDataEntityMust().getId(), true);
		if(minorDataEntityRuntime == null) {
			throw new Exception(String.format("无法获取指定关系从实体[%1$s]运行时对象", iPSDERBase.getMinorPSDataEntityMust().getId()));
		}
		
		IDERRuntimeBase iDERRuntimeBase = null;
		switch(DERType.from(iPSDERBase.getDERType())) {
		case DER1N:
			iDERRuntimeBase = new DER1NRuntimeBaseBase(minorDataEntityRuntime, (IPSDER1N)iPSDERBase) {
			};
			break;
		case DER11:
			iDERRuntimeBase = new DER11RuntimeBaseBase(minorDataEntityRuntime, (IPSDER11)iPSDERBase) {
			};
			break;
		case DERCUSTOM:
			IPSDERCustom iPSDERCustom = (IPSDERCustom)iPSDERBase;
			if(DERSubType.DER1N.value.equals(iPSDERCustom.getDERSubType())) {
				iDERRuntimeBase = new DERCustom1NRuntimeBaseBase(minorDataEntityRuntime, iPSDERCustom) {
				};
			}
			else
				if(DERSubType.DER11.value.equals(iPSDERCustom.getDERSubType())) {
					iDERRuntimeBase = new DERCustom11RuntimeBaseBase(minorDataEntityRuntime, iPSDERCustom) {
					};
				}
				else {
					log.warn(String.format("未支持关系类型[%1$s][%2$s]", iPSDERCustom.getDERType(), iPSDERCustom.getDERSubType()));
					return false;
				}
			
			break;
	//	case DERINDEX:
		case DERINHERIT:
			iDERRuntimeBase = new DERInheritRuntimeBaseBase(minorDataEntityRuntime, (IPSDERInherit)iPSDERBase) {
			};
			break;
		case DERMULINH:
			iDERRuntimeBase = new DERMultiInheritRuntimeBaseBase(minorDataEntityRuntime, (IPSDERMultiInherit)iPSDERBase) {
			};
			break;
		default:
			log.warn(String.format("未支持关系类型[%1$s]", iPSDERBase.getDERType()));
			return false;
		}
		
		return this.registerDERRuntimeBase(iDataEntityRuntime, iDERRuntimeBase);
	}
	
	/**
	 * 注册实体关系运行时
	 * @param strDataEntityTag
	 * @param iDERRuntime
	 * @throws Exception
	 */
	public synchronized boolean registerDERRuntimeBase(String strDataEntityTag, IDERRuntimeBase iDERRuntimeBase) throws Exception {
		Assert.hasLength(strDataEntityTag, "未传入实体标记");
		IDataEntityRuntime iDataEntityRuntime = this.getSystemRuntime().getDataEntityRuntime(strDataEntityTag, true);
		if(iDataEntityRuntime == null) {
			throw new Exception(String.format("无法获取指定实体[%1$s]运行时对象", strDataEntityTag));
		}
		return this.registerDERRuntimeBase(iDataEntityRuntime, iDERRuntimeBase);
	}
	
	/**
	 * 注册实体关系运行时
	 * @param iDataEntityRuntime
	 * @param iDERRuntime
	 * @throws Exception
	 */
	public synchronized boolean registerDERRuntimeBase(IDataEntityRuntime iDataEntityRuntime, IDERRuntimeBase iDERRuntimeBase) throws Exception {
		Assert.notNull(iDataEntityRuntime, "未传入实体运行时模型对象");
		Assert.notNull(iDERRuntimeBase, "未传入实体关系运行时对象");
		
		iDataEntityRuntime.registerDERRuntimeBase(iDERRuntimeBase);
		if(isUnregisterWhenShutdown()) {
			this.unregisterActionList.add(new Runnable() {
				@Override
				public void run() {
					iDataEntityRuntime.unregisterDERRuntimeBase(iDERRuntimeBase);
				}
			});
		}
		return true;
	}
	
}
