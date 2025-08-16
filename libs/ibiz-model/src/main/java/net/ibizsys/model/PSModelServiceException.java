package net.ibizsys.model;

/**
 * 模型服务异常
 * @author lionlau
 *
 */
public class PSModelServiceException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private IPSModelService iPSModelService = null;
	
	private IPSModelObject iPSModelObject = null;

	public PSModelServiceException(IPSModelService iPSModelService, String strInfo) {
		super(strInfo);
		this.iPSModelService = iPSModelService;
	}

	public PSModelServiceException(IPSModelService iPSModelService, String strInfo, Throwable throwable) {
		super(strInfo, throwable);
		this.iPSModelService = iPSModelService;
	}
	
	public PSModelServiceException(IPSModelService iPSModelService, String strInfo, IPSModelObject iPSModelObject) {
		super(strInfo);
		this.iPSModelService = iPSModelService;
		this.iPSModelObject = iPSModelObject;
	}
	
	/**
	 * 获取相关模型服务对象
	 * @return
	 */
	public IPSModelService getPSModelService() {
		return this.iPSModelService;
	}
	
	/**
	 * 获取相关模型对象
	 * @return
	 */
	public IPSModelObject getPSModelObject() {
		return this.iPSModelObject;
	}
}
