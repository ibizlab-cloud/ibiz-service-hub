package net.ibizsys.central.dataentity.report;

import java.io.OutputStream;
import java.util.List;

import org.springframework.util.StringUtils;

import net.ibizsys.central.bi.ISysBICubeRuntime;
import net.ibizsys.central.bi.ISysBISchemeRuntime;
import net.ibizsys.central.bi.util.BISearchContext;
import net.ibizsys.central.service.client.WebClientBase;
import net.ibizsys.central.util.ISearchContext;
import net.ibizsys.model.dataentity.ds.IPSDEDataSet;
import net.ibizsys.runtime.dataentity.DataEntityRuntimeException;
import net.ibizsys.runtime.security.UserContext;
import net.ibizsys.runtime.util.ErrorException;
import net.ibizsys.runtime.util.Errors;
import net.ibizsys.runtime.util.IEntityBase;
import net.ibizsys.runtime.util.ISearchContextBase;

/**
 * 实体智能报表运行时对象基类
 * 
 * @author lionlau
 *
 */
public abstract class DEBIReportRuntimeBase extends DEReportRuntimeBase implements IDEBIReportRuntime {

	private static final org.apache.commons.logging.Log log = org.apache.commons.logging.LogFactory.getLog(DEBIReportRuntimeBase.class);

	private ISysBISchemeRuntime iSysBISchemeRuntime = null;

	@Override
	protected void onInit() throws Exception {
		if (this.getSysBISchemeRuntime(true) == null) {
			this.prepareSysBISchemeRuntime();
			this.getSysBISchemeRuntime(false);
		}
		super.onInit();
	}

	public ISysBISchemeRuntime getSysBISchemeRuntime() {
		try {
			return this.getSysBISchemeRuntime(false);
		} catch (Exception ex) {
			throw new DataEntityRuntimeException(this.getDataEntityRuntime(), this, ex.getMessage(), ex);
		}
	}

	protected ISysBISchemeRuntime getSysBISchemeRuntime(boolean bTryMode) throws Exception {
		if (this.iSysBISchemeRuntime != null || bTryMode) {
			return this.iSysBISchemeRuntime;
		}
		throw new Exception("系统智能报表体系运行时对象无效");
	}

	protected void setSysBISchemeRuntime(ISysBISchemeRuntime iSysBISchemeRuntime) {
		this.iSysBISchemeRuntime = iSysBISchemeRuntime;
	}

	protected void prepareSysBISchemeRuntime() throws Exception {
		this.setSysBISchemeRuntime(this.getSystemRuntime().getSysBISchemeRuntime(this.getPSDEReport().getPSSysBISchemeMust()));
	}

	@Override
	protected void prepareReportFilePath() throws Exception {
		//super.prepareReportFilePath();
	}

	
	@Override
	protected List<? extends IEntityBase> searchDataSet(IPSDEDataSet iPSDEDataSet, ISearchContextBase iSearchContextBase) {
		return null;
	}
	

	@Override
	protected void onOutput(OutputStream outputStream, Object data, ISearchContext iSearchContext, String strType, boolean bTestPriv) throws Throwable {
		
		BISearchContext biSearchContext = new BISearchContext(iSearchContext);
		if(!StringUtils.hasLength(biSearchContext.getBICubeTag())) {
			throw new Exception("未传入智能立方体标记");
		}
		
		ISysBICubeRuntime iSysBICubeRuntime = this.getSysBISchemeRuntime().getSysBICubeRuntime(biSearchContext.getBICubeTag(), true);
		if(iSysBICubeRuntime == null) {
			throw new Exception(String.format("无法获取指定智能立方体[%1$s]", biSearchContext.getBICubeTag()));
		}
		
		if(bTestPriv && StringUtils.hasLength(iSysBICubeRuntime.getAccessKey())) {
			if(!this.getSystemRuntime().getSystemAccessManager().testSysUniRes(UserContext.getCurrent(), iSysBICubeRuntime.getAccessKey())) {
				throw new ErrorException( String.format("智能报表立方体[%1$s]不具备访问控制资源[%2$s]", iSysBICubeRuntime.getName(), iSysBICubeRuntime.getAccessKey()), Errors.ACCESSDENY);
			}
		}
		
		List list =	iSysBICubeRuntime.fetch(biSearchContext);
		
		WebClientBase.MAPPER.writeValue(outputStream, list);
	}
	
	
	
}
