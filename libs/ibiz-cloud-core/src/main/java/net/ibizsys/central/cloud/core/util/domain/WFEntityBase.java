package net.ibizsys.central.cloud.core.util.domain;

import net.ibizsys.runtime.util.EntityBase;

/**
 * 工作流数据对象基类，设置时同时为小写
 * 
 * @author lionlau
 *
 */
public abstract class WFEntityBase extends EntityBase {


	@Override
	public void set(String strName, Object objValue) {
		super.set(strName, objValue);
		if(!isLowerCaseName()) {
			super.set(strName.toLowerCase(), objValue);
		}
		
	}

	@Override
	public void reset(String strName) {
		super.reset(strName);
		if(!isLowerCaseName()) {
			super.reset(strName.toLowerCase());
		}
	}

}
