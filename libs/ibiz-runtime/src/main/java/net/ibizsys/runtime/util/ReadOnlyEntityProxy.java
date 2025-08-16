package net.ibizsys.runtime.util;

import net.ibizsys.model.dataentity.defield.IPSDEField;
import net.ibizsys.runtime.dataentity.IDataEntityRuntime;

/**
 * 只读数据对象代理
 * @author lionlau
 *
 */
public class ReadOnlyEntityProxy implements IReadOnlyEntity{

	private static final org.apache.commons.logging.Log log = org.apache.commons.logging.LogFactory.getLog(ReadOnlyEntityProxy.class);
	
	private IEntityBase iEntityBase = null;
	private IDataEntityRuntime iDataEntityRuntime = null;
	private IReadOnlyEntity iReadOnlyEntity = null;
	
	public ReadOnlyEntityProxy(IEntityBase iEntityBase, IDataEntityRuntime iDataEntityRuntime) {
		this.iEntityBase = iEntityBase;
		this.iDataEntityRuntime = iDataEntityRuntime;
		this.iReadOnlyEntity = null;
		if(iEntityBase instanceof IReadOnlyEntity) {
			this.iReadOnlyEntity = (IReadOnlyEntity)iEntityBase;
		}
	}
	
	@Override
	public Object get(String strName) {
		IPSDEField iPSDEField = this.getDataEntityRuntime().getPSDEField(strName);
		if (iPSDEField != null) {
			return this.getDataEntityRuntime().getFieldValue(this.getProxyEntity(), iPSDEField);
		} else {
			log.warn(String.format("实体[%1$s]无法获取指定属性[%2$s]", this.getDataEntityRuntime().getName(), strName));
			if (this.iReadOnlyEntity != null) {
				return this.iReadOnlyEntity.get(strName);
			}
			return null;
		}
	}

	@Override
	public boolean contains(String strName) {
		IPSDEField iPSDEField = this.getDataEntityRuntime().getPSDEField(strName);
		if (iPSDEField != null) {
			return this.getDataEntityRuntime().containsFieldValue(this.getProxyEntity(), iPSDEField);
		} else {
			log.warn(String.format("实体[%1$s]无法获取指定属性[%2$s]", this.getDataEntityRuntime().getName(), strName));
			if (this.iReadOnlyEntity != null) {
				return this.iReadOnlyEntity.contains(strName);
			}
			return false;
		}
	}

	
	
	/**
	 * 获取代理的数据对象
	 * @return
	 */
	public IEntityBase getProxyEntity() {
		return this.iEntityBase;
	}

	/**
	 * 获取实体运行时对象
	 * @return
	 */
	protected IDataEntityRuntime getDataEntityRuntime() {
		return this.iDataEntityRuntime;
	}
	
	
}
