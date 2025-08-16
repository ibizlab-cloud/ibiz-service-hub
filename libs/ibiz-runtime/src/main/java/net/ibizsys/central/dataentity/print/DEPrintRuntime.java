package net.ibizsys.central.dataentity.print;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.net.URLEncoder;
import java.util.List;

import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletResponse;

import org.springframework.util.ObjectUtils;
import org.springframework.util.StringUtils;

import net.ibizsys.central.IDynaInstRuntime;
import net.ibizsys.central.ISystemRuntime;
import net.ibizsys.central.dataentity.IDataEntityRuntime;
import net.ibizsys.central.dataentity.IDynaInstDataEntityRuntime;
import net.ibizsys.central.dataentity.report.DEReportRuntime;
import net.ibizsys.central.util.IEntityDTO;
import net.ibizsys.central.util.ISearchContextDTO;
import net.ibizsys.central.util.SearchContextDTO;
import net.ibizsys.model.PSModelEnums.ReportContentType;
import net.ibizsys.model.dataentity.der.IPSDER1N;
import net.ibizsys.model.dataentity.der.IPSDERBase;
import net.ibizsys.model.dataentity.ds.IPSDEDataSet;
import net.ibizsys.runtime.dataentity.DataEntityRuntimeException;
import net.ibizsys.runtime.dataentity.der.DER1NMasterRSTypes;
import net.ibizsys.runtime.dataentity.der.DERTypes;
import net.ibizsys.runtime.util.Conditions;
import net.ibizsys.runtime.util.IEntity;
import net.ibizsys.runtime.util.IEntityBase;

public class DEPrintRuntime extends net.ibizsys.runtime.dataentity.print.DEPrintRuntime implements IDEPrintRuntime {

	private static final org.apache.commons.logging.Log log = org.apache.commons.logging.LogFactory.getLog(DEPrintRuntime.class);
	
	private String strReportFilePath = null;
	
	
	@Override
	protected void onInit() throws Exception {
		
		super.onInit();
		
		//准备本地报表文件
		if(!StringUtils.hasLength(getReportFilePath())) {
			prepareReportFilePath();
		}
	}
	
	@Override
	protected String getReportFilePath() {
		return this.strReportFilePath;
	}
	
	protected void setReportFilePath(String strReportFilePath) {
		this.strReportFilePath = strReportFilePath;
	}
	
	protected void prepareReportFilePath() throws Exception{
		String strReportFilePath = this.getPSDEPrint().getReportFile();
		if(!StringUtils.hasLength(strReportFilePath)) {
			return;
		}
		
		//判断文件路径类型
		String strReportFilePath2 = strReportFilePath.toLowerCase();
		if((strReportFilePath2.indexOf("http://") == 0)
				|| (strReportFilePath2.indexOf("https://") == 0)) {
			//进行文件下载
			File tempFile = File.createTempFile("deprint", getDefaultReportFileSuffix());
			try {
				this.getSystemRuntime().getDefaultWebClient().download(strReportFilePath, null, null, null, tempFile, null);
			}
			catch (Throwable ex) {
				throw new Exception(String.format("下载远程报表文件发生异常，%1$s", ex.getMessage()), ex);
			}
			this.setReportFilePath(tempFile.getCanonicalPath());
		}
		else {
			if(!StringUtils.hasLength(this.getSystemRuntime().getReportFolder())) {
				if(StringUtils.hasLength(this.getReportModel())) {
					return;
				}
				throw new Exception(String.format("系统未定义报表存储文件夹"));
			}
			File file = new File(this.getSystemRuntime().getReportFolder() + strReportFilePath);
			if(!file.exists()) {
				if(StringUtils.hasLength(this.getReportModel())) {
					return;
				}
				throw new Exception(String.format("指定报表文件不存在"));
			}
			this.setReportFilePath(file.getCanonicalPath());
		}
	}
	
	
	
	
	@Override
	public IDataEntityRuntime getDataEntityRuntime() {
		return (IDataEntityRuntime)super.getDataEntityRuntime();
	}
	
	@Override
	public IDynaInstDataEntityRuntime getDynaInstDataEntityRuntime() {
		return (IDynaInstDataEntityRuntime)super.getDynaInstDataEntityRuntime();
	}
	
	
	@Override
	public ISystemRuntime getSystemRuntime() {
		return (ISystemRuntime)super.getSystemRuntime();
	}
	
	
	
	@Override
	public IDynaInstRuntime getDynaInstRuntime() {
		return (IDynaInstRuntime)super.getDynaInstRuntime();
	}
	
	/**
	 * 获取默认报表文件后缀
	 * @return
	 */
	protected String getDefaultReportFileSuffix() {
		return null;
	}
	
	/**
	 * 获取代码项文本后缀
	 * @return
	 */
	protected String getCodeItemTextSuffix() {
		return "text";
	}
	
	
	protected List<? extends IEntity> selectDetails(IEntity iEntity) throws Throwable{
		if(this.getPSDEPrint().getDetailPSDE() == null ) {
			return null;
		}
		
		Object objValue = this.getDataEntityRuntime().getKeyFieldValue(iEntity);
		if (ObjectUtils.isEmpty(objValue)) {
			return null;
		}

		IDataEntityRuntime childDataEntityRuntime = this.getSystemRuntime().getDataEntityRuntime(this.getPSDEPrint().getDetailPSDE().getId());
		ISearchContextDTO iSearchContextDTO = childDataEntityRuntime.createSearchContext();
		
		//将当前实体作为上下文数据变量放入
		iSearchContextDTO.set(this.getDataEntityRuntime().getKeyPSDEField().getLowerCaseName(), objValue);
		
		//尝试放入关系数据过滤条件
		java.util.List<IPSDERBase> psDERBases = this.getDataEntityRuntime().getPSDataEntity().getMajorPSDERs();
		if (!ObjectUtils.isEmpty(psDERBases)) {
			
			String strMinorDEId = this.getPSDEPrint().getDetailPSDE().getId();
			// 判断存在关联关系的关系实体
			IPSDERBase filterPSDERBase = null;
			for (IPSDERBase psDERBase : psDERBases) {
				if (DERTypes.DER1N.equals(psDERBase.getDERType())) {
					IPSDER1N iPSDER1N = (IPSDER1N) psDERBase;
					if ((iPSDER1N.getMasterRS() & DER1NMasterRSTypes.RELATED) == DER1NMasterRSTypes.RELATED) {
						if (strMinorDEId.equalsIgnoreCase(psDERBase.getMinorPSDataEntity().getId())) {
							if(filterPSDERBase == null) {
								filterPSDERBase = iPSDER1N;
							}
							else {
								log.warn(String.format("实体[%1$s]存在多个附属实体[%2$s]的关系，忽略过滤处理", this.getDataEntityRuntime().getName(),  this.getPSDEPrint().getDetailPSDE().getName()));
								filterPSDERBase = null;
								break;
							}
						}
					}
				} else {
					continue;
				}
			}
			
			if (filterPSDERBase instanceof IPSDER1N) {
				SearchContextDTO.addSearchFieldCond(iSearchContextDTO, ((IPSDER1N) filterPSDERBase).getPSPickupDEFieldMust().getLowerCaseName(), Conditions.EQ, objValue, null);
			}
		}

		IPSDEDataSet detailPSDEDataSet = this.getPSDEPrint().getDetailPSDEDataSet();
		if(detailPSDEDataSet == null) {
			detailPSDEDataSet = childDataEntityRuntime.getDefaultPSDEDataSet();
		}
					
		if(detailPSDEDataSet == null) {
			throw new Exception("明细数据数据集无效");
		}
		
		List<IEntityDTO> list = childDataEntityRuntime.selectDataSet(detailPSDEDataSet, iSearchContextDTO);
		if (!ObjectUtils.isEmpty(list)) {
			for(IEntityDTO iEntityDTO : list) {
				childDataEntityRuntime.fillEntityCodeListTexts(iEntityDTO, getCodeItemTextSuffix());
			}
		}
		
		return list;
	}
	
	@Override
	protected IEntityBase[] onBeforeOutput(IEntityBase[] list, String strType) throws Throwable {
		if(list != null) {
			for(IEntityBase iEntityBase : list) {
				if(iEntityBase instanceof IEntity) {
					this.getDataEntityRuntime().fillEntityCodeListTexts((IEntity)iEntityBase, getCodeItemTextSuffix());
				}
			}
		}
		return super.onBeforeOutput(list, strType);
	}

	@Override
	public void output(ServletResponse servletResponse, Object[] keys, String strType, boolean bTestPriv) throws Throwable {
		
		if(!StringUtils.hasLength(strType)) {
			strType = this.getDefaultContentType();
		}
		
		try {
			
			this.onOutput(servletResponse, keys, strType, bTestPriv);
		}
		catch (Throwable ex) {
			if(ex instanceof DataEntityRuntimeException) {
				DataEntityRuntimeException dataEntityRuntimeException = (DataEntityRuntimeException)ex;
				if(dataEntityRuntimeException.getModelRuntime() == this) {
					throw dataEntityRuntimeException;
				}
			}
			throw new DataEntityRuntimeException(this.getDataEntityRuntimeBase(), this, String.format("输出打印发生异常，%1$s", ex.getMessage()), ex);
		}
	}
	
	/**
	 * 输出打印
	 * @param servletResponse
	 * @param keys
	 * @param strType
	 * @param bTestPriv
	 * @throws Throwable
	 */
	protected void onOutput(ServletResponse servletResponse, Object[] keys, String strType, boolean bTestPriv) throws Throwable {
		ByteArrayOutputStream bos = new ByteArrayOutputStream();
		this.output(bos, keys, strType, bTestPriv);
		this.outputContentType(servletResponse, strType, null);
		bos.writeTo(servletResponse.getOutputStream());
	}
	
	/**
	 * 输出内容类型
	 * @param servletResponse
	 * @param strType
	 * @param strFileName
	 * @throws Exception
	 */
	protected void outputContentType(ServletResponse servletResponse, String strType, String strFileName) throws Exception{
		
		if(StringUtils.hasLength(strType)) {
			ReportContentType reportContentType = ReportContentType.from(strType);
			DEReportRuntime.outputContentType(servletResponse, reportContentType);
			if(!StringUtils.hasLength(strFileName)) {
				switch(reportContentType) {
				case DOCX:
					strFileName = "print.docx";
					break;
				case PDF:
					strFileName = "print.pdf";
					break;
				default:
					break;
				}
			}
		}
		
		if(!StringUtils.hasLength(strFileName)) {
			return;
		}
		
		if(servletResponse instanceof HttpServletResponse) {
			
			String strFileName2 = new String(URLEncoder.encode(strFileName, "utf-8").getBytes("utf-8"), "iso8859-1");
			
			HttpServletResponse httpServletResponse = (HttpServletResponse)servletResponse;
			httpServletResponse.setHeader("Cache-Control", "no-cache, no-store, must-revalidate");
			httpServletResponse.setHeader("Pragma", "no-cache");
			httpServletResponse.setHeader("Expires", "0");
			httpServletResponse.setHeader("charset", "utf-8");
			if(StringUtils.hasLength(strFileName)) {
				httpServletResponse.setHeader("Content-Disposition", String.format("attachment;filename=%s;filename*=utf-8''%s", strFileName2, URLEncoder.encode(strFileName, "utf-8")));
			}
		}
	}
	
}
