package net.ibizsys.central.dataentity.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.util.ObjectUtils;

import net.ibizsys.central.ISystemRuntime;
import net.ibizsys.central.database.ISysDBSchemeRuntime;
import net.ibizsys.central.dataentity.IDataEntityRuntime;
import net.ibizsys.central.util.IEntityDTO;
import net.ibizsys.central.util.ISearchContextDTO;
import net.ibizsys.model.dataentity.ds.IPSDEDataQuery;
import net.ibizsys.model.dataentity.service.IPSDEMethodDTO;
import net.ibizsys.model.dataentity.wf.IPSDEWF;
import net.ibizsys.runtime.SystemRuntimeException;
import net.ibizsys.runtime.dataentity.DataEntityRuntimeException;
import net.ibizsys.runtime.dataentity.action.IDEActionPluginRuntime;
import net.ibizsys.runtime.util.ActionSessionManager;
import net.ibizsys.runtime.util.IAction;
import net.ibizsys.runtime.util.IEntity;
import net.ibizsys.runtime.util.IEntityBase;
import net.ibizsys.runtime.util.ITransactionalUtil;

public abstract class DEServiceBase<T extends IEntityDTO, F extends ISearchContextDTO> implements IDEService<T, F> {

	private static final org.apache.commons.logging.Log log = org.apache.commons.logging.LogFactory.getLog(DEServiceBase.class);
	
	private ISystemRuntime iSystemRuntime = null;
	//private String strDataEntityId = null;
	private IDataEntityRuntime iDataEntityRuntime = null;
	private boolean bPrepare = false;
	private boolean bPreparing = false;
//	private IDataEntityRuntimeContext iDataEntityRuntimeContext = null;

	@Override
	public void init(ISystemRuntime iSystemRuntime, IDataEntityRuntime iDataEntityRuntime) throws Exception {
		this.setDataEntityRuntime(iDataEntityRuntime);
		this.setSystemRuntime(iSystemRuntime);
		this.onInit();
		this.prepare();
	}
	
//	@Override
//	public void init(ISystemRuntime iSystemRuntime, IDataEntityRuntimeContext iDataEntityRuntimeContext) throws Exception {
//		Assert.notNull(iDataEntityRuntimeContext, "传入实体运行时上下文对象无效");
//		this.iDataEntityRuntimeContext = iDataEntityRuntimeContext;
//		this.init(iSystemRuntime, this.iDataEntityRuntimeContext.getDataEntityRuntime());
//	}
	
	protected void onInit()throws Exception {
		
	}
	
	
	@Override
	public void prepare() {
		if(this.bPrepare) {
			return;
		}
		synchronized (this) {
			if(!this.bPrepare && !this.bPreparing) {
				this.bPreparing = true;
				onPrepare();
				this.bPrepare = true;
				this.bPreparing = false;
			}
		}
	}
	
	protected void onPrepare() {
		
	}
	
	protected void registerDEActionPluginRuntime(String strAction, IDEActionPluginRuntime iDEActionPluginRuntime) {
		try {
			this.getDataEntityRuntime().registerDEActionPluginRuntime(strAction, iDEActionPluginRuntime);
		} catch (Throwable ex) {
			throw new SystemRuntimeException(this.getSystemRuntime(), String.format("注册实体行为插件发生异常，%1$s", ex.getMessage()), ex);
		}
	}
	

	@Override
	public ISystemRuntime getSystemRuntime(){
		return this.iSystemRuntime;
	}
	
	protected void setSystemRuntime(ISystemRuntime iSystemRuntime) {
		this.iSystemRuntime = iSystemRuntime;
	}

	@Override
	public IDataEntityRuntime getDataEntityRuntime(){
		if(this.iDataEntityRuntime == null) {
			ISystemRuntime iSystemRuntime = getSystemRuntime();
			if(iSystemRuntime == null) {
				throw new RuntimeException("系统运行时对象无效");
			}
			this.iDataEntityRuntime = iSystemRuntime.getDataEntityRuntime(getDataEntityId());
		}
		return this.iDataEntityRuntime;
	}
	
	protected void setDataEntityRuntime(IDataEntityRuntime iDataEntityRuntime) {
		this.iDataEntityRuntime = iDataEntityRuntime;
	}
	
	@Override
	public void wfStart(IEntityBase iEntityBase, IPSDEWF iPSDEWF) throws Throwable {
		this.getDataEntityRuntime().wfStart(iEntityBase, iPSDEWF, true);
	}

	@Override
	public T selectOne(F f, boolean bTryMode) throws Throwable{
		return (T) this.getDataEntityRuntime().selectOne(f, bTryMode);
	}
	
	@Override
	public boolean existsData(F iSearchContextBase) throws Throwable {
		return this.getDataEntityRuntime().existsData(iSearchContextBase);
	}

	@Override
	public List<T> executeSelectSQL(String strSQL, List<Object> params) throws Throwable {
		ISysDBSchemeRuntime iSysDBSchemeRuntime = this.getDataEntityRuntime().getSysDBSchemeRuntime();
		if(iSysDBSchemeRuntime == null) {
			throw new DataEntityRuntimeException(this.getDataEntityRuntime(), String.format("实体[%1$s]运行时未提供SQL支持", getDataEntityRuntime().getName()));
		}
		return (List<T>)this.getDataEntityRuntime().execute(new IAction() {
			@Override
			public Object execute(Object[] args) throws Throwable {
				List list = iSysDBSchemeRuntime.executeSelectSQL(strSQL, params);
				if(list != null) {
					List<T> ret  = new ArrayList<T>();
					for(Object item: list) {
						IEntityDTO iEntityDTO = getDataEntityRuntime().createEntity();
						iEntityDTO.reload(item, false);
						ret.add((T)iEntityDTO);
					}
					return ret;
				}
				return null;
			}
		}, null);
	}

	@Override
	public int executeSQL(String strSQL, List<Object> params) throws Throwable {
		ISysDBSchemeRuntime iSysDBSchemeRuntime = this.getDataEntityRuntime().getSysDBSchemeRuntime();
		if(iSysDBSchemeRuntime == null) {
			throw new DataEntityRuntimeException(this.getDataEntityRuntime(), String.format("实体[%1$s]运行时未提供SQL支持", getDataEntityRuntime().getName()));
		}
		return (int)this.getDataEntityRuntime().execute(new IAction() {
			@Override
			public Object execute(Object[] args) throws Throwable {
				return iSysDBSchemeRuntime.executeSQL(strSQL, params);
			}
		}, null);
	}
	
	
	@Override
	public boolean get(T t, boolean bTryMode) throws Throwable {
		T t2 = (T)this.getDataEntityRuntime().get(this.getDataEntityRuntime().getFieldValue(t, this.getDataEntityRuntime().getKeyPSDEField()), bTryMode);
		if(t2 == null) {
			return false;
		}
		t.reload(t2, true);
		return true;
	}
	
	@Override
	public T get(Object key, boolean bTryMode) throws Throwable {
		return (T)this.getDataEntityRuntime().get(key, bTryMode);	
	}

	
	@Override
	public void rawCreate(List<T>list, boolean bSysMode) throws Throwable {
		this.getDataEntityRuntime().rawCreate(list, bSysMode);
		
	}
	
	@Override
	public void rawCreate(List<T> list) throws Throwable {
		this.rawCreate(list, true);
	}

	@Override
	public void rawUpdate(List<T> list, boolean bSysMode) throws Throwable {
		this.getDataEntityRuntime().rawUpdate(list, bSysMode);
	}
	
	@Override
	public void rawUpdate(List<T> list) throws Throwable {
		rawUpdate(list, true);
	}

	@Override
	public void rawSave(List<T> list, boolean bSysMode) throws Throwable {
		this.getDataEntityRuntime().rawSave(list, bSysMode);
	}
	
	@Override
	public void rawSave(List<T> list) throws Throwable {
		this.rawSave(list,  true);
	}

	@Override
	public void rawRemove(List<Object> list, boolean bSysMode) throws Throwable {
		this.getDataEntityRuntime().rawRemove(list, bSysMode);
	}
	
	@Override
	public void rawRemove(List<Object> list) throws Throwable {
		this.rawRemove(list, true);
	}
	
	@Override
	public List<T> update(F f, Object data) throws Throwable {
		IEntity srcEntity = null;
		Map srcMap = null;
		if(data instanceof IEntity) {
			srcEntity = (IEntity)data;
		}
		else
			if(data instanceof Map) {
				srcMap = (Map)data;
			}
			else {
				throw new DataEntityRuntimeException(this.getDataEntityRuntime(), String.format("无法识别的更新数据[%1$s]", data));
			}
		
		IPSDEDataQuery defaultPSDEDataQuery = this.getDataEntityRuntime().getDefaultPSDEDataQuery();
		List<T> list = null;
		if(defaultPSDEDataQuery != null) {
			list = (List<T>)this.getDataEntityRuntime().selectDataQuery(defaultPSDEDataQuery, f);
		}
		else {
			list = (List<T>)this.getDataEntityRuntime().select(f);
		}
		if(!ObjectUtils.isEmpty(list)) {
			for(int i = 0;i<list.size();i++) {
				try {
					IEntityDTO iEntityDTO = list.get(i);
					if(srcEntity != null) {
						srcEntity.copyTo(iEntityDTO);
					}
					else
					{
						iEntityDTO.putAll(srcMap);
					}
					
					this.getDataEntityRuntime().update(iEntityDTO);
				}
				catch(Throwable ex) {
					throw new DataEntityRuntimeException(this.getDataEntityRuntime(), String.format("更新数据[%1$s]发生异常，%2$s", this.getDataEntityRuntime().getKeyFieldValue(list.get(i)), ex.getMessage()), ex);
				}
			}
		}
		return list;
	}
	
	
	@Override
	public List<T> rawUpdate(F f, Object objData) throws Throwable {
		return this.rawUpdate(f, objData, true);
	}
	
	@Override
	public List<T> rawUpdate(F f, Object data, boolean bSysMode) throws Throwable {
		IEntity srcEntity = null;
		Map srcMap = null;
		if(data instanceof IEntity) {
			srcEntity = (IEntity)data;
		}
		else
			if(data instanceof Map) {
				srcMap = (Map)data;
			}
			else {
				throw new DataEntityRuntimeException(this.getDataEntityRuntime(), String.format("无法识别的更新数据[%1$s]", data));
			}
		
		IPSDEDataQuery defaultPSDEDataQuery = this.getDataEntityRuntime().getDefaultPSDEDataQuery();
		List<T> list = null;
		if(defaultPSDEDataQuery != null) {
			list = (List<T>)this.getDataEntityRuntime().selectDataQuery(defaultPSDEDataQuery, f);
		}
		else {
			list = (List<T>)this.getDataEntityRuntime().select(f);
		}
		if(!ObjectUtils.isEmpty(list)) {
			for(int i = 0;i<list.size();i++) {
				IEntityDTO iEntityDTO = list.get(i);
				if(srcEntity != null) {
					srcEntity.copyTo(iEntityDTO);
				}
				else
				{
					iEntityDTO.putAll(srcMap);
				}
			}
			this.rawUpdate(list, bSysMode);
		}
		return list;
	}
	
	@Override
	public Object rawExecute(IAction iAction, Object[] args) throws Throwable {
		return this.rawExecute(iAction, args, ITransactionalUtil.PROPAGATION_REQUIRED);
	}

	@Override
	public Object rawExecute(IAction iAction, Object[] args, int nTransactionalPropagation) throws Throwable {
		return this.getDataEntityRuntime().rawExecute(iAction, args, nTransactionalPropagation);
	}
	
	@Override
	public int remove(F f) throws Throwable {
		IPSDEDataQuery defaultPSDEDataQuery = this.getDataEntityRuntime().getDefaultPSDEDataQuery();
		List<IEntityDTO> list = null;
		if(defaultPSDEDataQuery != null) {
			list = this.getDataEntityRuntime().selectDataQuery(defaultPSDEDataQuery, f);
		}
		else {
			list = this.getDataEntityRuntime().select(f);
		}
		if(!ObjectUtils.isEmpty(list)) {
			for(IEntityDTO iEntityDTO : list) {
				this.getDataEntityRuntime().remove( this.getDataEntityRuntime().getKeyFieldValue(iEntityDTO));
			}
			return list.size();
		}
		return 0;
	}
	
	@Override
	public int rawRemove(F f, boolean bSysMode) throws Throwable {
		IPSDEDataQuery defaultPSDEDataQuery = this.getDataEntityRuntime().getDefaultPSDEDataQuery();
		List<IEntityDTO> list = null;
		if(defaultPSDEDataQuery != null) {
			list = this.getDataEntityRuntime().selectDataQuery(defaultPSDEDataQuery, f);
		}
		else {
			list = this.getDataEntityRuntime().select(f);
		}
		if(!ObjectUtils.isEmpty(list)) {
			List<Object> keyList = new ArrayList<Object>();
			for(IEntityDTO iEntityDTO : list) {
				keyList.add(this.getDataEntityRuntime().getKeyFieldValue(iEntityDTO));
			}
			this.getDataEntityRuntime().rawRemove(keyList, bSysMode);
			return list.size();
		}
		return 0;
	}
	
	
	

	@Override
	public List<IEntityDTO> createEntityDTOList(IPSDEMethodDTO iPSDEMethodDTO) {
		return null;
	}
	
	@Override
	public ISearchContextDTO createSearchContextDTO(Map<String, Object> params) {
		try {
			return this.getDataEntityRuntime().createSearchContext(params);
		} catch (Throwable ex) {
			throw new DataEntityRuntimeException(this.getDataEntityRuntime(), String.format("建立实体默认查询上下文对象发生异常，%1$s", ex.getMessage()), ex);
		}
	}
	
	/**
	 * 获取事务功能组件
	 * @return
	 */
	protected ITransactionalUtil getTransactionalUtil() {
		return getTransactionalUtil(false);
	}
	
	/**
	 * 获取事务功能组件（尝试模式）
	 * @return
	 */
	protected ITransactionalUtil getTransactionalUtil(boolean bTryMode) {
		ITransactionalUtil iTransactionalUtil = ActionSessionManager.getTransactionalUtil();
		if(iTransactionalUtil != null || bTryMode) {
			return iTransactionalUtil;
		}
		throw new DataEntityRuntimeException(this.getDataEntityRuntime(), String.format("未定义事务功能组件"));
	}

	

	
	
	
//	@Override
//	public Page<IEntityDTO> createEntityDTOPage(IPSDEMethodDTO iPSDEMethodDTO) {
//		return null;
//	}

//	@Override
//	public IEntityDTO createEntityDTO(IPSDEMethodDTO iPSDEMethodDTO) {
//		return null;
//	}
//
//	@Override
//	public ISearchContextDTO createSearchContextDTO(IPSDEMethodDTO iPSDEMethodDTO) {
//		return null;
//	}
//
//	@Override
//	public Object executeAction(IDataEntityRuntime iDataEntityRuntime, String strActionName, IPSDEAction iPSDEAction, Object[] args) throws Throwable {
//		return iDataEntityRuntime.executeAction(strActionName, iPSDEAction, args, true);
//	}
//
//	@Override
//	public Object fetchDataSet(IDataEntityRuntime iDataEntityRuntime, String strDataSetName, IPSDEDataSet iPSDEDataSet, Object[] args) throws Throwable {
//		return iDataEntityRuntime.fetchDataSet(strDataSetName, iPSDEDataSet, args, true);
//	}

}
