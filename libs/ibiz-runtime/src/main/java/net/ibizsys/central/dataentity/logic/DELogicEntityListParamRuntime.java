package net.ibizsys.central.dataentity.logic;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import net.ibizsys.runtime.dataentity.DataEntityRuntimeException;
import net.ibizsys.runtime.util.EntityUtils;
import net.ibizsys.runtime.util.IEntity;

/**
 * 数据对象列表参数运行时对象实现
 * 
 * @author lionlau
 *
 */
public class DELogicEntityListParamRuntime extends DELogicParamRuntimeBase {

	private static final org.apache.commons.logging.Log log = org.apache.commons.logging.LogFactory.getLog(DELogicEntityListParamRuntime.class);
	
	@Override
	public Object getScriptObject(IDELogicSession iDELogicSession) throws Throwable {
		Object objParam = getParamObject(iDELogicSession);
		if (objParam instanceof List) {
			return this.getSystemRuntime().createScriptList((List) objParam, !this.getPSDELogicParam().isOriginEntity());
		}
		return super.getScriptObject(iDELogicSession);
	}
	

	@Override
	public Object getParamObject(IDELogicSession iDELogicSession) throws Throwable {
		Object object = iDELogicSession.getParamObject(this.getCodeName(), true);
		if (object != null) {
			// 检查类型是否正确
			if (!(object instanceof List)) {
				throw new DataEntityRuntimeException(this.getDELogicRuntimeContext().getDataEntityRuntime(), getDELogicRuntimeContext().getDELogicRuntime(), String.format("逻辑参数[%1$s]不是数据对象列表类型", getCodeName()));
			}
			return object;
		}
		// 新建
		if (this.getDataEntityRuntime() == null) {
			object = new ArrayList<IEntity>();
		} else {
			object = this.getDataEntityRuntime().createEntityList();
		}
		iDELogicSession.setParamObject(this.getCodeName(), object);
		return object;
	}
	
	@Override
	public void append(IDELogicSession iDELogicSession, int nPos, Object paramObject, int nSrcPos, int nSrcLength) throws Throwable {
		// TODO Auto-generated method stub
		super.append(iDELogicSession, nPos, paramObject, nSrcPos, nSrcLength);
	}

	@Override
	public void bind(IDELogicSession iDELogicSession, Object paramObject) throws Throwable {
		List srcList = null;
		if (paramObject != null) {
			// 检查类型是否正确
			srcList = asList(paramObject);
			if (srcList == null) {
				try {
					List list = this.getSystemRuntime().deserialize(paramObject, List.class);
					if (this.getDataEntityRuntime() == null) {
						srcList = (List)EntityUtils.getValue(list, !this.getPSDELogicParam().isOriginEntity(), this.getSystemRuntime());
					}
					else {
						srcList = this.getDataEntityRuntime().createEntityList();
						for(Object item : list) {
							Map map = null;
							if(item instanceof Map) {
								map = (Map)item;
							}
							else {
								map = this.getSystemRuntime().deserialize(item, Map.class);
							}
							srcList.add(this.getDataEntityRuntime().createEntity(map));
						}
					}
				}
				catch(Throwable ex) {
					throw new DataEntityRuntimeException(this.getDELogicRuntimeContext().getDataEntityRuntime(), getDELogicRuntimeContext().getDELogicRuntime(), String.format("逻辑参数[%1$s]无法绑定非数据对象列表类型参数", getCodeName()));
				}
			}
		}
		super.bind(iDELogicSession, srcList);
	}

	@Override
	public int count(IDELogicSession iDELogicSession) throws Throwable {
		Object obj = iDELogicSession.getParamObject(this.getCodeName(), true);
		if (obj == null) {
			return 0;
		}

		obj = this.getParamObject(iDELogicSession);
		if (obj instanceof List) {
			return ((List) obj).size();
		}
		return super.count(iDELogicSession);
	}

	@Override
	public void resetAll(IDELogicSession iDELogicSession) throws Throwable {
		Object obj = iDELogicSession.getParamObject(this.getCodeName(), true);
		if (obj == null) {
			return;
		}
		
		obj = this.getParamObject(iDELogicSession);
		if (obj instanceof List) {
			((List)obj).clear();
			return;
		}
		
		super.resetAll(iDELogicSession);
	}
	
	
}
