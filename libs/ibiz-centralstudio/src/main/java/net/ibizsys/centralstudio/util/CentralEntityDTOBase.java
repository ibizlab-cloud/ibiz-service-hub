package net.ibizsys.centralstudio.util;

import java.util.Map;

import org.springframework.util.ObjectUtils;

import com.fasterxml.jackson.annotation.JsonAnyGetter;

/**
 * CentralStudio 数据对象实现基类
 * 
 * @author lionlau
 *
 */
public abstract class CentralEntityDTOBase extends EntityBase implements ICentralEntityDTO {

	@JsonAnyGetter
	public Map<String, Object> any() {
		return this.prepareAny();
	}
	
	protected Map<String, Object> prepareAny() {
		final Map<String, Object> map = super.any();
		if(ObjectUtils.isEmpty(map)) {
			return null;
		}
		
		Map<String, Object> any = this.createAny();
		any.putAll(map);
		return any;
	}
}
