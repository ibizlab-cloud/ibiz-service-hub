package net.ibizsys.runtime;

import net.ibizsys.model.IPSModelObject;
import net.ibizsys.model.PSModelUtils;

/**
 * 模型运行时实现基类对象
 * 
 * @author lionlau
 *
 */
public abstract class ModelRuntimeBase implements IModelRuntime {

	private String strLowerCaseName = null;
	private String strFullUniqueTag = null;
	private String strLowerCaseFullUniqueTag = null;

	@Override
	public String getId() {
		return getPSModelObject().getId();
	}

	@Override
	public String getName() {
		return getPSModelObject().getName();
	}

	@Override
	public String getLowerCaseName() {
		if (this.strLowerCaseName == null && this.getName() != null) {
			this.strLowerCaseName = this.getName().toLowerCase();
		}
		return this.strLowerCaseName;
	}

	@Override
	public String getFullUniqueTag() {
		if (this.strFullUniqueTag == null && this.getPSModelObject() != null) {
			this.strFullUniqueTag = PSModelUtils.calcFullUniqueTag2(this.getPSModelObject(), true);
		}
		return this.strFullUniqueTag;
	}

	@Override
	public String getLowerCaseFullUniqueTag() {
		if (this.strLowerCaseFullUniqueTag == null && this.getPSModelObject() != null) {
			this.strLowerCaseFullUniqueTag = PSModelUtils.calcFullUniqueTag(this.getPSModelObject(), true);
		}
		return this.strLowerCaseFullUniqueTag;
	}

	@Override
	public String getLogicName() {
		return this.getName();
	}

	/**
	 * 初始化
	 * 
	 * @throws Exception
	 */
	protected void onInit() throws Exception {

	}

	/**
	 * 获取相关的模型对象
	 * 
	 * @return
	 */
	public abstract IPSModelObject getPSModelObject();

}
