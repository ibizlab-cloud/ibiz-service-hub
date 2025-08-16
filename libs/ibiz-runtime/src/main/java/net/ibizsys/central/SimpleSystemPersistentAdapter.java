package net.ibizsys.central;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

import org.springframework.data.domain.Page;

import net.ibizsys.central.dataentity.IDataEntityRuntime;
import net.ibizsys.central.util.IEntity;
import net.ibizsys.central.util.ISearchContext;
import net.ibizsys.model.dataentity.action.IPSDEAction;
import net.ibizsys.model.dataentity.ds.IPSDEDataQuery;
import net.ibizsys.model.dataentity.ds.IPSDEDataSet;

/**
 * 简单系统持久化适配器实现
 * 
 * @author lionlau
 *
 */
public class SimpleSystemPersistentAdapter extends SystemPersistentAdapterBase {

	@Override
	public Object create(IDataEntityRuntime iDataEntityRuntime, IPSDEAction iPSDEAction, IEntity iEntity, String[] inputFields, boolean bGet, String[] outputFields, boolean bSysMode) throws Throwable {

		Map<String, Object> retData = new HashMap<String, Object>();
		retData.putAll(iEntity.any());

		if (!retData.containsKey(iDataEntityRuntime.getKeyPSDEField().getName().toLowerCase())) {
			retData.put(iDataEntityRuntime.getKeyPSDEField().getName().toLowerCase(), UUID.randomUUID().toString());
		}
		return retData;
	}

	@Override
	public Object update(IDataEntityRuntime iDataEntityRuntime, IPSDEAction iPSDEAction, IEntity iEntity, String[] inputFields, boolean bGet, String[] outputFields, boolean bSysMode) throws Throwable {

		Map<String, Object> retData = new HashMap<String, Object>();
		retData.putAll(iEntity.any());

		return retData;
	}

	@Override
	public Object get(IDataEntityRuntime iDataEntityRuntime, IPSDEAction iPSDEAction, Object key, String[] outputFields, boolean bTryMode) throws Throwable {
		Map<String, Object> retData = new HashMap<String, Object>();
		retData.put(iDataEntityRuntime.getKeyPSDEField().getName().toLowerCase(), key);
		return retData;
	}

	@Override
	public Object get(IDataEntityRuntime iDataEntityRuntime, IPSDEDataQuery iPSDEDataQuery, Object key, String[] outputFields, boolean bTryMode) throws Throwable {
		Map<String, Object> retData = new HashMap<String, Object>();
		retData.put(iDataEntityRuntime.getKeyPSDEField().getName().toLowerCase(), key);
		return retData;
	}

	@Override
	public void remove(IDataEntityRuntime iDataEntityRuntime, IPSDEAction iPSDEAction, Object key, boolean bSysMode) throws Throwable {

	}

	@Override
	public Object create(IDataEntityRuntime iDataEntityRuntime, IPSDEAction iPSDEAction, List<? extends IEntity> datas, String[] inputFields, boolean bGet, String[] outputFields, boolean bSysMode) throws Throwable {
		return null;
	}

	@Override
	public Object update(IDataEntityRuntime iDataEntityRuntime, IPSDEAction iPSDEAction, List<? extends IEntity> datas, String[] inputFields, boolean bGet, String[] outputFields, boolean bSysMode) throws Throwable {
		return null;
	}

	@Override
	public List get(IDataEntityRuntime iDataEntityRuntime, IPSDEAction iPSDEAction, List<Object> keys, String[] outputFields) throws Throwable {
		return null;
	}

	@Override
	public void remove(IDataEntityRuntime iDataEntityRuntime, IPSDEAction iPSDEAction, List<Object> keys, boolean bSysMode) throws Throwable {

	}

	@Override
	public int checkKeyState(IDataEntityRuntime iDataEntityRuntime, IPSDEAction iPSDEAction, Object objKey) throws Throwable {
		return 0;
	}

	@Override
	public List query(IDataEntityRuntime iDataEntityRuntime, IPSDEDataQuery iPSDEDataQuery, ISearchContext iSearchContext, String[] outputFields) throws Throwable {
		return null;
	}
	
	

	@Override
	public Page query2(IDataEntityRuntime iDataEntityRuntime, IPSDEDataQuery iPSDEDataQuery, ISearchContext iSearchContext, String[] outputFields) throws Throwable {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Page fetchDataSet(IDataEntityRuntime iDataEntityRuntime, IPSDEDataSet iPSDEDataSet, ISearchContext iSearchContext, String[] outputFields) throws Throwable {
		return null;
	}

}
