package net.ibizsys.central.dataentity.logic;

import java.util.LinkedHashMap;
import java.util.Map;

import net.ibizsys.runtime.dataentity.DataEntityRuntimeException;
import net.ibizsys.runtime.util.EntityUtils;
import net.ibizsys.runtime.util.IEntity;

/**
 * 数据对象MAP参数运行时对象实现
 * 
 * @author lionlau
 *
 */
public class DELogicEntityMapParamRuntime extends DELogicParamRuntimeBase {

	private static final org.apache.commons.logging.Log log = org.apache.commons.logging.LogFactory.getLog(DELogicEntityMapParamRuntime.class);
	
	@Override
	public Object getParamObject(IDELogicSession iDELogicSession) throws Throwable {
		Object object = iDELogicSession.getParamObject(this.getCodeName(), true);
		if (object != null) {
			// 检查类型是否正确
			if (!(object instanceof Map)) {
				throw new DataEntityRuntimeException(this.getDELogicRuntimeContext().getDataEntityRuntime(), getDELogicRuntimeContext().getDELogicRuntime(), String.format("逻辑参数[%1$s]不是数据对象Map类型", getCodeName()));
			}
			return object;
		}
		// 新建
		if (this.getDataEntityRuntime() == null) {
			object = new LinkedHashMap<Object, IEntity>();
		} else {
			object = new LinkedHashMap<Object, IEntity>();
		}
		iDELogicSession.setParamObject(this.getCodeName(), object);
		return object;
	}

	@Override
	public void bind(IDELogicSession iDELogicSession, Object paramObject) throws Throwable {
		Map srcMap = null;
		if (paramObject != null) {
			// 检查类型是否正确
			srcMap = asMap(paramObject);
			if (srcMap == null) {
				try {
					Map map = this.getSystemRuntime().deserialize(paramObject, Map.class);
					srcMap = new LinkedHashMap<Object, IEntity>();
					for(Object key : map.keySet()) {
						srcMap.put(key, EntityUtils.getValue(map.get(key), !this.getPSDELogicParam().isOriginEntity(), this.getSystemRuntime()));
					}
				}
				catch(Throwable ex) {
					throw new DataEntityRuntimeException(this.getDELogicRuntimeContext().getDataEntityRuntime(), getDELogicRuntimeContext().getDELogicRuntime(), String.format("逻辑参数[%1$s]无法绑定非数据对象Map类型参数", getCodeName()));
				}
			}
		}
		super.bind(iDELogicSession, srcMap);
	}

	@Override
	public int count(IDELogicSession iDELogicSession) throws Throwable {
		Object obj = iDELogicSession.getParamObject(this.getCodeName(), true);
		if (obj == null) {
			return 0;
		}

		obj = this.getParamObject(iDELogicSession);
		if (obj instanceof Map) {
			return ((Map) obj).size();
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
		if (obj instanceof Map) {
			((Map)obj).clear();
			return;
		}
		
		super.resetAll(iDELogicSession);
	}

	@Override
	public void set(IDELogicSession iDELogicSession, String strName, Object objValue) throws Throwable {
		// TODO Auto-generated method stub
		super.set(iDELogicSession, strName, objValue);
	}

	@Override
	public Object get(IDELogicSession iDELogicSession, String strName) throws Throwable {
		// TODO Auto-generated method stub
		return super.get(iDELogicSession, strName);
	}

	@Override
	public boolean contains(IDELogicSession iDELogicSession, String strName) throws Throwable {
		// TODO Auto-generated method stub
		return super.contains(iDELogicSession, strName);
	}
	
	
}
