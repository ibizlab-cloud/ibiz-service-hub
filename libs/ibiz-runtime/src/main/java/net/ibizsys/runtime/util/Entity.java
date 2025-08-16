package net.ibizsys.runtime.util;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.springframework.util.ObjectUtils;

import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * 常规数据对象，大多用于序列化场景（会将Map转化为IEntity对象）
 * @author lionlau
 *
 */
public class Entity extends EntityBase{

	@JsonIgnore
	private boolean bLowerCaseName = true;

	public Entity() {
		
	}
	public Entity(Object source) {
		if(source!=null) {
			reload(source);
		}
	}
	public Entity(Object source, boolean bLowerCaseName) {
		this.bLowerCaseName = bLowerCaseName;
		if(source!=null) {
			reload(source);
		}
	}
	
	@Override
	@JsonIgnore
	protected Map<String, Object> createAny() {
		return new LinkedHashMap<String, Object>();
	}

	@Override
	@JsonIgnore
	protected boolean isLowerCaseName() {
		return this.bLowerCaseName;
	}
	
	/**
	 * 用在序列化场合
	 * @param strName
	 * @param objValue
	 */
	@JsonAnySetter
	public void anySet(String strName, Object objValue) {
		if(objValue != null) {
			objValue = getRealValue(objValue);
		}
		this.set(strName, objValue);
	}
	
	
	@Override
	@JsonAnySetter(enabled=false)
	public void set(String strName, Object objValue) {
		super.set(strName, objValue);
	}
	
	@JsonIgnore
	public void reload(Object objData){ 
		if (objData instanceof Map) {
			Map<String,Object> map = (Map<String,Object>)objData;
			if(!ObjectUtils.isEmpty(map)) {
				for(java.util.Map.Entry<String ,Object> entry:map.entrySet()) {
					//anySet 会进行值转换
					anySet(entry.getKey(), entry.getValue());
				}
			}
		}
//		else if(objData instanceof IEntity) {
//			Map<String,Object> map = ((IEntity)objData).any();
//			if(!ObjectUtils.isEmpty(map)) {
//				for(java.util.Map.Entry<String ,Object> entry:map.entrySet()) {
//					//anySet 会进行值转换
//					anySet(entry.getKey(), entry.getValue());
//				}
//			}
//		}
		else {
			throw new RuntimeException("无法识别的数据对象");
		}
	}

	protected IEntity createEntity(Object objData) {
		return new Entity(objData, this.isLowerCaseName());
	}
	
	protected Object getRealValue(Object objValue) {
		if(objValue instanceof Map) {
			//构建对象
			return createEntity(objValue);
		}
		
		if(objValue instanceof List) {
			//构建对象
			List list = (List)objValue;
			List entityList = new ArrayList();
			for(Object objItem : list) {
				Object real = getRealValue(objItem);
				entityList.add(real);
			}
			return entityList;
		}
		
		return objValue;
	}
}
