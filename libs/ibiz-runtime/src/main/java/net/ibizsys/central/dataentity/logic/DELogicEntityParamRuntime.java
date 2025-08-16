package net.ibizsys.central.dataentity.logic;


import java.util.Map;

import net.ibizsys.runtime.dataentity.DataEntityRuntimeException;
import net.ibizsys.runtime.util.IEntity;
import net.ibizsys.runtime.util.IEntityBase;

public class DELogicEntityParamRuntime extends DELogicParamRuntimeBase {

	@Override
	public Object getScriptObject(IDELogicSession iDELogicSession) throws Throwable {
		Object objParam = getParamObject(iDELogicSession);
		if(objParam instanceof IEntityBase) {
			if(this.getDataEntityRuntime()!=null) {
				return this.getDataEntityRuntime().createScriptEntity((IEntityBase)objParam);
			}
		}
		return super.getScriptObject(iDELogicSession);
	}
	
	
	@Override
	public Object getParamObject(IDELogicSession iDELogicSession) throws Throwable {
		Object object = iDELogicSession.getParamObject(this.getCodeName(), true);
		if (object != null) {
			// 检查类型是否正确
			if (!(object instanceof IEntity)) {
				throw new DataEntityRuntimeException(this.getDELogicRuntimeContext().getDataEntityRuntime(), getDELogicRuntimeContext().getDELogicRuntime(), String.format("逻辑参数[%1$s]不是数据对象类型", getCodeName()));
			}
			return object;
		}
		// 新建
		object = this.createEntity();
		iDELogicSession.setParamObject(this.getCodeName(), object);
		return object;
	}
	
	protected IEntity createEntity() throws Throwable {
		if (this.getDataEntityRuntime() == null) {
			return this.getDELogicRuntimeContext().getSystemRuntime().createEntity(null, !this.getPSDELogicParam().isOriginEntity());
		} else {
			return this.getDataEntityRuntime().createEntity();
		}
	}

	@Override
	public void bind(IDELogicSession iDELogicSession, Object paramObject) throws Throwable {
		IEntity srcEntity = null;
		if (paramObject != null) {
			if(paramObject instanceof IEntity) {
				srcEntity = (IEntity)paramObject;
			}
			else{
				try {
					Map map = null;
					if(paramObject instanceof Map) {
						map = (Map)paramObject;
					}
					else {
						map = this.getSystemRuntime().deserialize(paramObject, Map.class);
					}
					if (this.getDataEntityRuntime() == null) {
						srcEntity = this.getSystemRuntime().createEntity(map, !this.getPSDELogicParam().isOriginEntity());
					}
					else {
						srcEntity = this.getDataEntityRuntime().createEntity(map);
					}
				}
				catch(Throwable ex) {
					throw new DataEntityRuntimeException(this.getDELogicRuntimeContext().getDataEntityRuntime(), getDELogicRuntimeContext().getDELogicRuntime(), String.format("逻辑参数[%1$s]无法绑定非数据对象类型值[%2$s]", getCodeName(), paramObject), ex);
				}
			}
		}
		super.bind(iDELogicSession, srcEntity);
	}
	
}
