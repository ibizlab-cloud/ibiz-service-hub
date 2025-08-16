package net.ibizsys.model;

/**
 * 模型分析器异常
 * @author lionlau
 *
 */
public class PSModelException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private IPSModelObject iPSModelObject = null;
	

	public PSModelException(IPSModelObject iPSModelObject,String strInfo) {
		super(strInfo);
		this.iPSModelObject = iPSModelObject;
	}
	
	public IPSModelObject getPSModelObject() {
		return this.iPSModelObject;
	}
	
}
