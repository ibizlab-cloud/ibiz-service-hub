package net.ibizsys.central;

import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.data.domain.Page;
import org.springframework.util.Assert;

import net.ibizsys.central.ba.ISysBDPersistentAdapter;
import net.ibizsys.central.ba.ISysBDSchemeRuntime;
import net.ibizsys.central.ba.SysBDPersistentAdapter;
import net.ibizsys.central.database.ISysDBPersistentAdapter;
import net.ibizsys.central.database.ISysDBSchemeRuntime;
import net.ibizsys.central.database.SysDBPersistentAdapter;
import net.ibizsys.central.dataentity.IDataEntityRuntime;
import net.ibizsys.central.util.IEntity;
import net.ibizsys.central.util.ISearchContext;
import net.ibizsys.model.dataentity.action.IPSDEAction;
import net.ibizsys.model.dataentity.der.IPSDERBase;
import net.ibizsys.model.dataentity.ds.IPSDEDataQuery;
import net.ibizsys.model.dataentity.ds.IPSDEDataSet;
import net.ibizsys.runtime.SystemRuntimeException;
import net.ibizsys.runtime.dataentity.DEStorageModes;
import net.ibizsys.runtime.dataentity.DEVirtualModes;
import net.ibizsys.runtime.dataentity.der.DERTypes;


public class SystemPersistentAdapter implements ISystemPersistentAdapter{

	private static final Log log = LogFactory.getLog(SystemPersistentAdapter.class);

	private ISystemRuntimeContext iSystemRuntimeContext = null;
	
	private Map<String, ISystemPersistentAdapter > dbPersistentAdapterMap = new ConcurrentHashMap<>();
	private Map<String, ISystemPersistentAdapter > bdPersistentAdapterMap = new ConcurrentHashMap<>();
	//实体的持久化适配层
	private Map<String, ISystemPersistentAdapter > dePersistentAdapterMap = new ConcurrentHashMap<>();
	
	
	public void init(ISystemRuntimeContext iSystemRuntimeContext) throws Exception{
		this.iSystemRuntimeContext = iSystemRuntimeContext;
	}
	
	protected ISystemRuntimeContext getSystemRuntimeContext() {
		return this.iSystemRuntimeContext;
	}
	
	@Override
	public ISystemRuntime getSystemRuntime() {
		return this.getSystemRuntimeContext().getSystemRuntime();
	}
	
	protected ISystemPersistentAdapter getSystemPersistentAdapter(IDataEntityRuntime iDataEntityRuntime) {
		ISystemPersistentAdapter iSystemPersistentAdapter = dePersistentAdapterMap.get(iDataEntityRuntime.getId());
		if(iSystemPersistentAdapter == null) {
			iSystemPersistentAdapter = this.internalGetSystemPersistentAdapter(iDataEntityRuntime);
			dePersistentAdapterMap.put(iDataEntityRuntime.getId(), iSystemPersistentAdapter);
		}
		return iSystemPersistentAdapter;
	}
	
	protected ISystemPersistentAdapter internalGetSystemPersistentAdapter(IDataEntityRuntime iDataEntityRuntime) {
		switch(iDataEntityRuntime.getStorageMode()) {
		case DEStorageModes.SQL:
			ISysDBSchemeRuntime iSysDBSchemeRuntime = iDataEntityRuntime.getSysDBSchemeRuntime();
			if(iSysDBSchemeRuntime == null) {
				throw new SystemRuntimeException(getSystemRuntimeContext().getSystemRuntime(), String.format("实体[%1$s]没有指定系统数据库体系",iDataEntityRuntime.getName()));
			}
			else {
				ISystemPersistentAdapter iSystemPersistentAdapter = dbPersistentAdapterMap.get(iSysDBSchemeRuntime.getId());
				if(iSystemPersistentAdapter == null) {
					ISysDBPersistentAdapter iSysDBPersistentAdapter = this.createSysDBPersistentAdapter(iSysDBSchemeRuntime);
					Assert.notNull(iSysDBPersistentAdapter,"系统数据库持久化适配器无效");
					try {
						iSysDBPersistentAdapter.init(this.getSystemRuntimeContext(), iSysDBSchemeRuntime);
					} catch (Exception ex) {
						throw new SystemRuntimeException(getSystemRuntimeContext().getSystemRuntime(), String.format("初始化系统数据库[%1$s]持久化适配器发生异常, %2$s",
								iSysDBSchemeRuntime.getName(), ex.getMessage()), ex);
					}
					dbPersistentAdapterMap.put(iSysDBSchemeRuntime.getId(), iSysDBPersistentAdapter);
					return iSysDBPersistentAdapter;
				}
				return iSystemPersistentAdapter;
			}
		case DEStorageModes.NOSQL:
			ISysBDSchemeRuntime iSysBDSchemeRuntime = iDataEntityRuntime.getSysBDSchemeRuntime();
			if(iSysBDSchemeRuntime == null) {
				throw new SystemRuntimeException(getSystemRuntimeContext().getSystemRuntime(), String.format("实体[%1$s]没有指定系统大数据体系",iDataEntityRuntime.getName()));
			}
			else {
				ISystemPersistentAdapter iSystemPersistentAdapter = bdPersistentAdapterMap.get(iSysBDSchemeRuntime.getId());
				if(iSystemPersistentAdapter == null) {
					ISysBDPersistentAdapter iSysBDPersistentAdapter = this.createSysBDPersistentAdapter(iSysBDSchemeRuntime);
					Assert.notNull(iSysBDPersistentAdapter,"系统大数据持久化适配器无效");
					try {
						iSysBDPersistentAdapter.init(this.getSystemRuntimeContext(), iSysBDSchemeRuntime);
					} catch (Exception ex) {
						throw new SystemRuntimeException(getSystemRuntimeContext().getSystemRuntime(), String.format("初始化系统大数据[%1$s]持久化适配器发生异常, %2$s",
								iSysBDSchemeRuntime.getName(), ex.getMessage()), ex);
					}
					bdPersistentAdapterMap.put(iSysBDSchemeRuntime.getId(), iSysBDPersistentAdapter);
					return iSysBDPersistentAdapter;
				}
				return iSystemPersistentAdapter;
			}	
		case DEStorageModes.NONE:
			if(iDataEntityRuntime.isVirtual()) {
				if(iDataEntityRuntime.getVirtualMode() == DEVirtualModes.MINHERIT) {
					if(iDataEntityRuntime.getPSDERMultiInherits()!=null && iDataEntityRuntime.getPSDERMultiInherits().size() > 0) {
						IDataEntityRuntime majorDataEntityRuntime = this.getSystemRuntimeContext().getSystemRuntime().getDataEntityRuntime(iDataEntityRuntime.getPSDERMultiInherits().get(0).getMajorPSDataEntityMust().getId());
						return getSystemPersistentAdapter(majorDataEntityRuntime);
					}
				}
				else
					if(iDataEntityRuntime.getVirtualMode() == DEVirtualModes.INDEXMAJOR) {
						try {
							if (iDataEntityRuntime.getPSDataEntity().getMajorPSDERs() != null && iDataEntityRuntime.getPSDataEntity().getMajorPSDERs().size() > 0) {
								for(IPSDERBase iPSDERBase : iDataEntityRuntime.getPSDataEntity().getMajorPSDERs()) {
									if(DERTypes.DERINDEX.equals(iPSDERBase.getDERType())) {
										IDataEntityRuntime minorDataEntityRuntime = this.getSystemRuntime().getDataEntityRuntime(iPSDERBase.getMinorPSDataEntityMust().getId());
										if(minorDataEntityRuntime.getSystemPersistentAdapter()!=null) {
											ISysDBSchemeRuntime minorSysDBSchemeRuntime = minorDataEntityRuntime.getSysDBSchemeRuntime();
											if(minorSysDBSchemeRuntime != null) {
												ISystemPersistentAdapter iSystemPersistentAdapter = dbPersistentAdapterMap.get(minorSysDBSchemeRuntime.getId());
												if(iSystemPersistentAdapter != null) {
													return iSystemPersistentAdapter;
												}else {
													ISysDBPersistentAdapter iSysDBPersistentAdapter = this.createSysDBPersistentAdapter(minorSysDBSchemeRuntime);
													Assert.notNull(iSysDBPersistentAdapter,"系统数据库持久化适配器无效");
													try {
														iSysDBPersistentAdapter.init(this.getSystemRuntimeContext(), minorSysDBSchemeRuntime);
													} catch (Exception ex) {
														throw new SystemRuntimeException(getSystemRuntimeContext().getSystemRuntime(), String.format("初始化系统数据库[%1$s]持久化适配器发生异常, %2$s",
																minorSysDBSchemeRuntime.getName(), ex.getMessage()), ex);
													}
													dbPersistentAdapterMap.put(minorSysDBSchemeRuntime.getId(), iSysDBPersistentAdapter);
													return iSysDBPersistentAdapter;
												}
											}
										}
									}
								}
							}
						}
						catch (Throwable ex) {
							log.error(String.format("计算虚拟索引实体持久化对象发生异常，%1$s", ex.getMessage()), ex);
						}
						
					}
				
			}
			break;
		}
		
		throw new SystemRuntimeException(this.getSystemRuntimeContext().getSystemRuntime()
				,String.format("无法识别的实体[%1$s]存储模式[%2$s]",iDataEntityRuntime.getName(), iDataEntityRuntime.getStorageMode()));
	}
	
	protected ISysDBPersistentAdapter createSysDBPersistentAdapter(ISysDBSchemeRuntime iSysDBSchemeRuntime) {
		
		ISysDBPersistentAdapter iSysDBPersistentAdapter = this.getSystemRuntime().getRuntimeObject(ISystemRuntime.GLOBALPLUGIN_DBPERSISTENTADAPTER, ISysDBPersistentAdapter.class, true, true);
		if (iSysDBPersistentAdapter != null) {
			return iSysDBPersistentAdapter;
		}
		
		iSysDBPersistentAdapter = this.getSystemRuntime().getRuntimeObject(ISysDBPersistentAdapter.class, null);
		if (iSysDBPersistentAdapter != null) {
			return iSysDBPersistentAdapter;
		}
		return this.createDefaultSysDBPersistentAdapter();
	}
	
	protected ISysDBPersistentAdapter createDefaultSysDBPersistentAdapter() {
		return new SysDBPersistentAdapter();
	}
	
	protected ISysBDPersistentAdapter createSysBDPersistentAdapter(ISysBDSchemeRuntime iSysBDSchemeRuntime) {
		ISysBDPersistentAdapter iSysBDPersistentAdapter = this.getSystemRuntime().getRuntimeObject(ISystemRuntime.GLOBALPLUGIN_BDPERSISTENTADAPTER, ISysBDPersistentAdapter.class, true, true);
		if (iSysBDPersistentAdapter != null) {
			return iSysBDPersistentAdapter;
		}
		
		iSysBDPersistentAdapter = this.getSystemRuntime().getRuntimeObject(ISysBDPersistentAdapter.class, null);
		if (iSysBDPersistentAdapter != null) {
			return iSysBDPersistentAdapter;
		}
		return this.createDefaultSysBDPersistentAdapter();
	}
	
	protected ISysBDPersistentAdapter createDefaultSysBDPersistentAdapter() {
		return new SysBDPersistentAdapter();
	}
	
	
	@Override
	public Object create(IDataEntityRuntime iDataEntityRuntime, IPSDEAction iPSDEAction, IEntity iEntity, String[] inputFields, boolean bGet, String[] outputFields, boolean bSysMode) throws Throwable {
		return this.getSystemPersistentAdapter(iDataEntityRuntime).create(iDataEntityRuntime, iPSDEAction, iEntity, inputFields, bGet, outputFields, bSysMode);
	}

	@Override
	public Object update(IDataEntityRuntime iDataEntityRuntime, IPSDEAction iPSDEAction, IEntity iEntity, String[] inputFields, boolean bGet, String[] outputFields, boolean bSysMode) throws Throwable {
		return this.getSystemPersistentAdapter(iDataEntityRuntime).update(iDataEntityRuntime, iPSDEAction, iEntity, inputFields, bGet, outputFields, bSysMode);
	}

	@Override
	public Object get(IDataEntityRuntime iDataEntityRuntime, IPSDEAction iPSDEAction, Object key, String[] outputFields, boolean bTryMode) throws Throwable {
		return this.getSystemPersistentAdapter(iDataEntityRuntime).get(iDataEntityRuntime, iPSDEAction, key, outputFields, bTryMode);
	}
	
	@Override
	public Object get(IDataEntityRuntime iDataEntityRuntime, IPSDEDataQuery iPSDEDataQuery, Object key, String[] outputFields, boolean bTryMode) throws Throwable {
		return this.getSystemPersistentAdapter(iDataEntityRuntime).get(iDataEntityRuntime, iPSDEDataQuery, key, outputFields, bTryMode);
	}

	@Override
	public void remove(IDataEntityRuntime iDataEntityRuntime, IPSDEAction iPSDEAction, Object key, boolean bSysMode) throws Throwable {
		this.getSystemPersistentAdapter(iDataEntityRuntime).remove(iDataEntityRuntime, iPSDEAction, key, bSysMode);
	}
	
	
	@Override
	public Object create(IDataEntityRuntime iDataEntityRuntime, IPSDEAction iPSDEAction, List<? extends IEntity> datas, String[] inputFields, boolean bGet, String[] outputFields, boolean bSysMode) throws Throwable {
		return this.getSystemPersistentAdapter(iDataEntityRuntime).create(iDataEntityRuntime, iPSDEAction, datas, inputFields, bGet, outputFields, bSysMode);
	}

	@Override
	public Object update(IDataEntityRuntime iDataEntityRuntime, IPSDEAction iPSDEAction, List<? extends IEntity> datas, String[] inputFields, boolean bGet, String[] outputFields, boolean bSysMode) throws Throwable {
		return this.getSystemPersistentAdapter(iDataEntityRuntime).update(iDataEntityRuntime, iPSDEAction, datas, inputFields, bGet, outputFields, bSysMode);
	}

	@Override
	public List get(IDataEntityRuntime iDataEntityRuntime, IPSDEAction iPSDEAction, List<Object> keys, String[] outputFields) throws Throwable {
		return this.getSystemPersistentAdapter(iDataEntityRuntime).get(iDataEntityRuntime, iPSDEAction, keys, outputFields);
	}

	@Override
	public void remove(IDataEntityRuntime iDataEntityRuntime, IPSDEAction iPSDEAction, List<Object> keys, boolean bSysMode) throws Throwable {
		this.getSystemPersistentAdapter(iDataEntityRuntime).remove(iDataEntityRuntime, iPSDEAction, keys, bSysMode);
		
	}

	@Override
	public int checkKeyState(IDataEntityRuntime iDataEntityRuntime, IPSDEAction iPSDEAction, Object objKey) throws Throwable {
		return this.getSystemPersistentAdapter(iDataEntityRuntime).checkKeyState(iDataEntityRuntime, iPSDEAction, objKey);
	}

	@Override
	public List query(IDataEntityRuntime iDataEntityRuntime, IPSDEDataQuery iPSDEDataQuery, ISearchContext iSearchContext, String[] outputFields) throws Throwable {
		return this.getSystemPersistentAdapter(iDataEntityRuntime).query(iDataEntityRuntime, iPSDEDataQuery, iSearchContext, outputFields);
	}
	
	

	@Override
	public Page query2(IDataEntityRuntime iDataEntityRuntime, IPSDEDataQuery iPSDEDataQuery, ISearchContext iSearchContext, String[] outputFields) throws Throwable {
		return this.getSystemPersistentAdapter(iDataEntityRuntime).query2(iDataEntityRuntime, iPSDEDataQuery, iSearchContext, outputFields);
	}

	@Override
	public Page fetchDataSet(IDataEntityRuntime iDataEntityRuntime, IPSDEDataSet iPSDEDataSet, ISearchContext iSearchContext, String[] outputFields) throws Throwable {
		return this.getSystemPersistentAdapter(iDataEntityRuntime).fetchDataSet(iDataEntityRuntime, iPSDEDataSet, iSearchContext, outputFields);
	}


}
