package net.ibizsys.central.cloud.core.dataentity.service;

import java.util.List;

import org.springframework.util.ObjectUtils;

import net.ibizsys.central.dataentity.service.IDEService;
import net.ibizsys.central.util.IEntityDTO;
import net.ibizsys.central.util.ISearchContextDTO;
import net.ibizsys.model.dataentity.defield.IPSDEField;
import net.ibizsys.runtime.dataentity.action.DEActions;

/**
 * 代理实体服务接口对象
 * @author lionlau
 *
 * @param <T>
 * @param <F>
 */
public interface IProxyDEService<T extends IEntityDTO, F extends ISearchContextDTO> extends IDEService<T, F>{

	/**
	 * 建立默认的实体数据对象
	 * @return
	 */
	default T createEntityDTO() {
		return (T)this.getDataEntityRuntime().createEntity();
	}
	
	/**
	 * 建立默认的实体数据过滤对象
	 * @return
	 */
	default F createSearchContextDTO() {
		return (F)this.getDataEntityRuntime().createSearchContext();
	}
	
	
	default void create(T t) throws Throwable {
		this.getDataEntityRuntime().create(t);
	}
	
	
	default void update(T t) throws Throwable {
		this.getDataEntityRuntime().update(t);
	}
	
	
	default void save(T t) throws Throwable {
		this.getDataEntityRuntime().save(t);
	}
	
	
	default void remove(Object key) throws Throwable {
		this.getDataEntityRuntime().remove(key);
	}
	
	default void remove(List<?> keys) throws Throwable {
		this.getDataEntityRuntime().executeAction(DEActions.REMOVE, null, new Object[] {keys});
	}
	
	default T getDraft(T t) throws Throwable {
		return (T)this.getDataEntityRuntime().getDraft(t);
	}
	
	
	default T get(Object key)throws Throwable {
		return (T)this.getDataEntityRuntime().get(key);
	}
	
	default List<T> select(F f) {
		return (List<T>)this.getDataEntityRuntime().select(f);
	}
	
	default int checkKeyState(Object key) throws Throwable {
		return this.getDataEntityRuntime().checkKeyState(key);
	}
	
	default boolean fillEntityKeyValue(T t) {
		return this.getDataEntityRuntime().fillEntityKeyValue(t);
	}
	
	
	default boolean select(T t, boolean tryMode) throws Throwable{
		java.util.List<IPSDEField> psDEFieldList = this.getDataEntityRuntime().getPSDEFields(false);
		F iSearchContextDTO = this.createSearchContextDTO();
		if(!ObjectUtils.isEmpty(psDEFieldList)) {
			for(IPSDEField iPSDEField : psDEFieldList) {
				if(!t.contains(iPSDEField.getLowerCaseName())) {
					continue;
				}
				Object value = t.get(iPSDEField.getLowerCaseName());
				if(ObjectUtils.isEmpty(value)) {
					iSearchContextDTO.nvl(iPSDEField.getLowerCaseName());
				}
				else {
					iSearchContextDTO.eq(iPSDEField.getLowerCaseName(), value);
				}
			}
		}
		
		IEntityDTO iEntityDTO = this.getDataEntityRuntime().selectOne(iSearchContextDTO, tryMode);
		if(iEntityDTO == null) {
			return false;
		}
		t.reload(iEntityDTO, true);
		return true;
	}
}
