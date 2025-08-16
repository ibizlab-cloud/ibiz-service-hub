package net.ibizsys.runtime;

import net.ibizsys.model.IPSModelObject;

/**
 * 模型异常
 * @author lionlau
 *
 */
public class ModelException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private IPSModelObject iPSModelObject = null;
	

	public ModelException(IPSModelObject iPSModelObject,String strInfo) {
		super(strInfo);
		this.iPSModelObject = iPSModelObject;
	}
	
	public IPSModelObject getPSModelObject() {
		return this.iPSModelObject;
	}
	
}
