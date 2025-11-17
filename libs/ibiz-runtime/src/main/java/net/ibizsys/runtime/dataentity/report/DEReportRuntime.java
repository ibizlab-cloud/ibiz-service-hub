package net.ibizsys.runtime.dataentity.report;

import java.io.OutputStream;
import java.util.List;

import org.springframework.util.Assert;
import org.springframework.util.StringUtils;

import net.ibizsys.model.IPSModelObject;
import net.ibizsys.model.PSModelEnums.ReportContentType;
import net.ibizsys.model.dataentity.ds.IPSDEDataSet;
import net.ibizsys.model.dataentity.report.IPSDEReport;
import net.ibizsys.runtime.dataentity.DataEntityModelRuntimeBase;
import net.ibizsys.runtime.dataentity.DataEntityRuntimeException;
import net.ibizsys.runtime.dataentity.IDataEntityRuntimeBase;
import net.ibizsys.runtime.security.IUserContext;
import net.ibizsys.runtime.security.UserContext;
import net.ibizsys.runtime.util.Errors;
import net.ibizsys.runtime.util.IEntityBase;
import net.ibizsys.runtime.util.ISearchContext;
import net.ibizsys.runtime.util.ISearchContextBase;

/**
 * 实体报表运行时对象接口
 * 
 * @author lionlau
 *
 */
public class DEReportRuntime extends DataEntityModelRuntimeBase implements IDEReportRuntime {

	private static final org.apache.commons.logging.Log log = org.apache.commons.logging.LogFactory.getLog(DEReportRuntime.class);

	private IPSDEReport iPSDEReport = null;
	

	@Override
	public void init(IDataEntityRuntimeBase iDataEntityRuntimeBase, IPSDEReport iPSDEReport) throws Exception {
		Assert.notNull(iDataEntityRuntimeBase, "传入实体运行时对象无效");
		Assert.notNull(iPSDEReport, "传入实体报表模型对象无效");

		this.setDataEntityRuntimeBase(iDataEntityRuntimeBase);

		this.iPSDEReport = iPSDEReport;
		

		this.onInit();
	}


	
	@Override
	public IPSDEReport getPSDEReport() {
		return this.iPSDEReport;
	}

	@Override
	public IPSModelObject getPSModelObject() {
		return getPSDEReport();
	}
	
	
	@Override
	public String getId() {
		if (getPSDEReport() != null) {
			return getPSDEReport().getId();
		}
		return null;
	}

	@Override
	public String getName() {
		if (getPSDEReport() != null) {
			return getPSDEReport().getName();
		}
		return null;
	}

	@Override
	protected void onInit() throws Exception {
		super.onInit();
	}

	/**
	 * 获取默认内容类型
	 * @return
	 */
	protected String getDefaultContentType() {
		return ReportContentType.PDF.value;
	}
	
	@Override
	public void output(OutputStream outputStream, ISearchContextBase iSearchContextBase, String strType, boolean bTestPriv) throws Throwable {
		
		//进行权限判断
		if(bTestPriv && !testPermission()) {
			throw new DataEntityRuntimeException(this.getDataEntityRuntimeBase(), String.format("没有授权访问指定报表"), Errors.ACCESSDENY);
		}
		
		//设置最大记录数
		this.getDataEntityRuntime().setSearchPaging(iSearchContextBase, ISearchContext.STARTPAGE, getMaxRowCount(), null);
		//去除计数查询
		this.getDataEntityRuntime().setSearchMode(iSearchContextBase, true, false);
		
		
		List<? extends IEntityBase> data = null;
		if(this.getPSDEReport().getPSDEDataSet()!=null) {
			data = searchDataSet(this.getPSDEReport().getPSDEDataSet(), iSearchContextBase);
		}
		data = this.onBeforeOutput(data, iSearchContextBase, strType, bTestPriv);
		onOutput(outputStream, data, iSearchContextBase, strType, bTestPriv);
	}
	
	protected List<? extends IEntityBase> onBeforeOutput(List<? extends IEntityBase> data, ISearchContextBase iSearchContextBase, String strType, boolean bTestPriv) throws Throwable {
		return this.onBeforeOutput(data, iSearchContextBase, strType);
	}
	
	protected List<? extends IEntityBase> onBeforeOutput(List<? extends IEntityBase> data, ISearchContextBase iSearchContextBase, String strType) throws Throwable {
		return data;
	}
	
	/**
	 * 搜索指定数据
	 * @param iPSDEDataSet
	 * @param iSearchContextBase
	 * @return
	 */
	protected List<? extends IEntityBase> searchDataSet(IPSDEDataSet iPSDEDataSet,ISearchContextBase iSearchContextBase){
		org.springframework.data.domain.Page<? extends IEntityBase> page = this.getDataEntityRuntime().searchDataSet(iPSDEDataSet, iSearchContextBase);
		return page.getContent();
	}

	protected boolean testPermission() {
		String strUniResCode = null;
		try {
			if(this.getPSDEReport().getPSSysUniRes()!=null) {
				strUniResCode = this.getPSDEReport().getPSSysUniRes().getResCode();
			}
		} catch (Exception e) {
			throw new DataEntityRuntimeException(this.getDataEntityRuntimeBase(), this, String.format("获取报表[%1$s]统一资源标识发生异常，%2$s",this.getName(), e.getMessage()),Errors.MODELERROR, e);
		}
		if(StringUtils.hasLength(strUniResCode)) {
			return this.getSystemRuntime().testUniRes(strUniResCode);
		}
		return true;
	}
	
	protected int getMaxRowCount() {
		return 1000000;
		//return Integer.MAX_VALUE;
	}
	
	protected void onOutput(OutputStream outputStream, Object data, ISearchContextBase iSearchContextBase, String strType, boolean bTestPriv) throws Throwable {
		this.onOutput(outputStream, data, iSearchContextBase, strType);
	}
	
	protected void onOutput(OutputStream outputStream, Object data, ISearchContextBase iSearchContextBase, String strType) throws Throwable {
		throw new Exception("没有实现");
	}
	
	
	/**
	 * 获取当前用户上下文
	 * 
	 * @return
	 */
	protected IUserContext getUserContext() {
		return UserContext.getCurrent();
	}
	
	

	
	/**
	 * 获取报表模型
	 * @return
	 */
	protected String getReportModel() {
		return this.getPSDEReport().getReportModel();
	}
	
	/**
	 * 获取报表文件路径
	 * @return
	 */
	protected String getReportFilePath() {
		return this.getPSDEReport().getReportFile();
	}
	
}
