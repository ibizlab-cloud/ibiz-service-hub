package net.ibizsys.central.plugin.util.dataentity.ds;


import net.ibizsys.central.plugin.util.dataentity.ds.util.PSDEDQSQLCodeGenEngine;
import net.ibizsys.model.dataentity.ds.IPSDEDataQueryCode;

public class RealtimeDEDataQueryCodeRuntime extends net.ibizsys.central.dataentity.ds.DEDataQueryCodeRuntime{

	private static final org.apache.commons.logging.Log log = org.apache.commons.logging.LogFactory.getLog(RealtimeDEDataQueryCodeRuntime.class);
	
	private IPSDEDataQueryCode extendedPSDEDataQueryCode = null;
	private boolean bRealtimePSDEDataQueryCode = false;
	private boolean bInit = false;
	
	@Override
	protected void onInit() throws Exception {
		
		//判断当前实体是否支持扩展
		//if(this.getDataEntityRuntime().isEnableDynaStorage()) {
//		if(!this.getPSDEDataQuery().isCustomCode() && this.getPSDEDataQuery().getPSDEDQMain()!=null) {
//			if(this.getRealtimePSDEDataQueryCode(true) == null) {
//				this.preparePSDEDataQueryCode();
//				this.getRealtimePSDEDataQueryCode(false);
//			}
//		}
		
		super.onInit();
		this.bInit = true;
	}
	
	@Override
	public IPSDEDataQueryCode getPSDEDataQueryCode() {
		IPSDEDataQueryCode iPSDEDataQueryCode;
		try {
			iPSDEDataQueryCode = getRealtimePSDEDataQueryCode(true);
			if(iPSDEDataQueryCode != null) {
				return iPSDEDataQueryCode;
			}
		} catch (Exception ex) {
			log.error(ex);
		}
		return super.getPSDEDataQueryCode();
	}
	
	protected IPSDEDataQueryCode getRealtimePSDEDataQueryCode(boolean tryMode) throws Exception {
		if(bInit && !this.bRealtimePSDEDataQueryCode) {
			if(!this.getPSDEDataQuery().isCustomCode() && this.getPSDEDataQuery().getPSDEDQMain()!=null) {
				if(this.extendedPSDEDataQueryCode == null) {
					try {
						this.preparePSDEDataQueryCode();
					}
					catch (Exception ex) {
						log.error(ex);
					}
				}
			}
			this.bRealtimePSDEDataQueryCode = true;
		}
		
		if(this.extendedPSDEDataQueryCode != null || tryMode) {
			return this.extendedPSDEDataQueryCode;
		}
		throw new Exception("扩展实体数据查询代码对象无效");
	}
	
	protected void setRealtimePSDEDataQueryCode(IPSDEDataQueryCode extendedPSDEDataQueryCode) {
		this.extendedPSDEDataQueryCode = extendedPSDEDataQueryCode;
	}
	
	protected IPSDEDataQueryCode getOriginalPSDEDataQueryCode() {
		return super.getPSDEDataQueryCode();
	}
	
	/**
	 * 准备实体数据查询代码模型对象
	 * @throws Exception
	 */
	protected void preparePSDEDataQueryCode() throws Exception {
		PSDEDQSQLCodeGenEngine psDEDQSQLCodeGenEngine = new PSDEDQSQLCodeGenEngine(this.getDataEntityRuntime(), this.getDBDialect());
		
		IPSDEDataQueryCode iPSDEDataQueryCode;
		try {
			iPSDEDataQueryCode = psDEDQSQLCodeGenEngine.generatePSDEDataQueryCode(this.getPSDEDataQuery(), null);
		} catch (Throwable ex) {
			throw new Exception(ex.getMessage(), ex);
		}
		this.setRealtimePSDEDataQueryCode(iPSDEDataQueryCode);
	}
	
}
