package net.ibizsys.central.cloud.core.dataentity.print;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.ServletResponse;

import org.apache.commons.io.IOUtils;
import org.springframework.util.ObjectUtils;
import org.springframework.util.StringUtils;

import com.fasterxml.jackson.databind.node.ObjectNode;

import net.ibizsys.central.cloud.core.IServiceSystemRuntime;
import net.ibizsys.central.cloud.core.spring.configuration.NacosServiceHubSettingBase;
import net.ibizsys.central.cloud.core.spring.rt.ServiceHub;
import net.ibizsys.central.cloud.core.sysutil.ISysOSSUtilRuntime;
import net.ibizsys.central.cloud.core.util.IConfigListener;
import net.ibizsys.central.dataentity.IDataEntityRuntime;
import net.ibizsys.central.util.IEntityDTO;
import net.ibizsys.central.util.ISearchContextDTO;
import net.ibizsys.model.PSModelEnums.DEPrintDynamicMode;
import net.ibizsys.model.PSModelEnums.ReportContentType;
import net.ibizsys.model.dataentity.defield.IPSDEField;
import net.ibizsys.model.dataentity.print.IPSDEPrint;
import net.ibizsys.model.dataentity.print.PSDEPrintImpl;
import net.ibizsys.runtime.ISystemEventListener;
import net.ibizsys.runtime.dataentity.DataEntityRuntimeException;
import net.ibizsys.runtime.sysutil.ISysFileUtilRuntime;
import net.ibizsys.runtime.util.DataTypeUtils;
import net.ibizsys.runtime.util.DateUtils;
import net.ibizsys.runtime.util.ExceptionUtils;

public abstract class DEPrintRuntimeBase extends net.ibizsys.central.dataentity.print.DEPrintRuntimeBase implements IDEPrintRuntime {

	private static final org.apache.commons.logging.Log log = org.apache.commons.logging.LogFactory.getLog(DEPrintRuntimeBase.class);
	private net.ibizsys.model.PSModelEnums.DEPrintDynamicMode dynamicMode = DEPrintDynamicMode.STATIC;
	private Map<String, net.ibizsys.central.dataentity.print.IDEPrintRuntime> realDEPrintRuntimeMap = null;
	private IDataEntityRuntime sourceDataEntityRuntime = null;

	/**
	 * 文件分类：临时文件
	 */
	public final static String CAT_TEMP = "temp";

	@Override
	protected void onInit() throws Exception {
		this.dynamicMode = DEPrintDynamicMode.from(this.getPSDEPrint().getDynamicMode());
		if (this.getDynamicMode() == DEPrintDynamicMode.DEDATASET) {
			this.realDEPrintRuntimeMap = new HashMap<String, net.ibizsys.central.dataentity.print.IDEPrintRuntime>();
			this.getPSDEPrint().getSourcePSDataEntityMust();
			this.getPSDEPrint().getSourcePSDEDataSetMust();
			this.getPSDEPrint().getUniqueTagPSDEFieldMust();
			this.getPSDEPrint().getReportModelPSDEFieldMust();
		}
		super.onInit();

		if (this.getDynamicMode() == DEPrintDynamicMode.DEDATASET) {
			this.getSystemRuntime().registerSystemLoadEventListener(new ISystemEventListener() {
				@Override
				public void receiveEvent(String event, Object[] params) {
					try {
						reloadRealDEPrintRuntimes();
						listenReloadSignal();
					} catch (Throwable ex) {
						log.error(String.format("加载运行时数据发生异常，%1$s", ex.getMessage()), ex);
					}
				}
			});
		}
	}

	@Override
	public DEPrintDynamicMode getDynamicMode() {
		return this.dynamicMode;
	}

	protected IDataEntityRuntime getSourceDataEntityRuntimeMust() throws Exception {
		if (this.sourceDataEntityRuntime == null) {
			if (this.getPSDEPrint().getSourcePSDataEntity() != null) {
				this.sourceDataEntityRuntime = this.getSystemRuntime().getDataEntityRuntime(this.getPSDEPrint().getSourcePSDataEntityMust().getId());
			} else
				throw new Exception("数据源实体运行时对象无效");
		}
		return this.sourceDataEntityRuntime;
	}

	protected synchronized void reloadRealDEPrintRuntimes() throws Exception {
		this.realDEPrintRuntimeMap.clear();
		ISearchContextDTO iSearchContextDTO = this.getSourceDataEntityRuntimeMust().createSearchContext().all().count(false);
		List<IEntityDTO> agentEntityDTOList = this.getSourceDataEntityRuntimeMust().selectDataSet(this.getPSDEPrint().getSourcePSDEDataSetMust(), iSearchContextDTO);
		if (ObjectUtils.isEmpty(agentEntityDTOList)) {
			log.warn(String.format("动态实体打印[%1$s]未包含任何数据", this.getPSDEPrint().getName()));
			return;
		}

		IPSDEField namePSDEField = this.getPSDEPrint().getNamePSDEField();
		if (namePSDEField == null) {
			namePSDEField = this.getDataEntityRuntime().getMajorPSDEField();
		}

		IPSDEField keyPSDEField = this.getDataEntityRuntime().getKeyPSDEField();

		IPSDEField reportModelPSDEField = this.getPSDEPrint().getReportModelPSDEFieldMust();
		IPSDEField reportTypePSDEField = this.getPSDEPrint().getReportTypePSDEField();
		IPSDEField contentTypePSDEField = this.getPSDEPrint().getContentTypePSDEField();

		for (IEntityDTO agentEntityDTO : agentEntityDTOList) {
			ObjectNode agentObjectNode = this.getPSDEPrint().getObjectNode().deepCopy();
			// 关闭动态模式
			agentObjectNode.put(PSDEPrintImpl.ATTR_GETDYNAMICMODE, 0);

			if (keyPSDEField != null) {
				Object key = agentEntityDTO.get(keyPSDEField.getLowerCaseName());
				if (!ObjectUtils.isEmpty(key)) {
					agentObjectNode.put(PSDEPrintImpl.ATTR_GETPRINTCONTEXTID, String.valueOf(key));
				}
			}

			if (namePSDEField != null) {
				Object name = agentEntityDTO.get(namePSDEField.getLowerCaseName());
				if (!ObjectUtils.isEmpty(name)) {
					agentObjectNode.put(PSDEPrintImpl.ATTR_GETNAME, String.valueOf(name));
				}
			}

			Object uniqueTag = agentEntityDTO.get(this.getPSDEPrint().getUniqueTagPSDEFieldMust().getLowerCaseName());
			if (ObjectUtils.isEmpty(uniqueTag)) {
				log.error(String.format("未定义标记值，忽略"));
				continue;
			}
			agentObjectNode.put(PSDEPrintImpl.ATTR_GETCODENAME, String.valueOf(uniqueTag));

			if (reportTypePSDEField != null) {
				String reportType = DataTypeUtils.asString(agentEntityDTO.get(reportTypePSDEField.getLowerCaseName()), this.getPSDEPrint().getReportType());
				if (reportType != null) {
					agentObjectNode.put(PSDEPrintImpl.ATTR_GETREPORTTYPE, reportType);
				}
			}

			if (reportModelPSDEField != null) {
				String reportModel = DataTypeUtils.asString(agentEntityDTO.get(reportModelPSDEField.getLowerCaseName()), this.getPSDEPrint().getReportModel());
				if (reportModel != null) {
					agentObjectNode.put(PSDEPrintImpl.ATTR_GETREPORTMODEL, reportModel);
				}
			}

			if (contentTypePSDEField != null) {
				String contentType = DataTypeUtils.asString(agentEntityDTO.get(contentTypePSDEField.getLowerCaseName()), this.getPSDEPrint().getContentType());
				if (contentType != null) {
					agentObjectNode.put(PSDEPrintImpl.ATTR_GETCONTENTTYPE, contentType);
				}
			}

			this.onFillRealPrintObjectNode(agentObjectNode, agentEntityDTO);

			IPSDEPrint subPSDEPrint = this.getSystemRuntime().getPSSystemService().createAndInitPSModelObject(this.getPSDEPrint().getParentPSModelObject(), IPSDEPrint.class, agentObjectNode);
			net.ibizsys.central.dataentity.print.IDEPrintRuntime subDEPrintRuntime = this.createDEPrintRuntime(subPSDEPrint);
			try {
				subDEPrintRuntime.init(this.getDataEntityRuntime(), subPSDEPrint);
				realDEPrintRuntimeMap.put(subPSDEPrint.getCodeName().toUpperCase(), subDEPrintRuntime);
			} catch (Throwable ex) {
				log.error(String.format("初始化打印代理运行时[%1$s]发生异常，%2$s", subPSDEPrint.getName(), ex.getMessage()));
			}
		}
	}

	protected void onFillRealPrintObjectNode(ObjectNode printObjectNode, IEntityDTO printEntityDTO) {

	}

	protected net.ibizsys.central.dataentity.print.IDEPrintRuntime createDEPrintRuntime(IPSDEPrint subPSDEPrint) throws Exception {
		return (net.ibizsys.central.dataentity.print.IDEPrintRuntime) this.getDataEntityRuntime().createDEPrintRuntime(subPSDEPrint);
	}

	@Override
	public void reload() {
		if (this.getDynamicMode() == DEPrintDynamicMode.DEDATASET) {
			String strReloadSignalId = getReloadSignalId();
			Map<String, String> map = new LinkedHashMap<String, String>();
			map.put("reloaddate", DateUtils.getCurTimeString2());
			ServiceHub.getInstance().publishConfig(strReloadSignalId, map);
			return;
		}

		try {
			this.onReload();
		} catch (Throwable ex) {
			ex = ExceptionUtils.unwrapThrowable(ex);
			DataEntityRuntimeException.rethrow(this, ex);
			throw new DataEntityRuntimeException(this.getDataEntityRuntime(), this, String.format("重新加载发生异常，%1$s", ex.getMessage()), ex);
		}
	}

	public void localReload() {
		try {
			this.onReload();
		} catch (Throwable ex) {
			ex = ExceptionUtils.unwrapThrowable(ex);
			DataEntityRuntimeException.rethrow(this, ex);
			throw new DataEntityRuntimeException(this.getDataEntityRuntime(), this, String.format("重新加载发生异常，%1$s", ex.getMessage()), ex);
		}
	}

	protected void onReload() throws Throwable {
		reloadRealDEPrintRuntimes();
	}

	protected String getReloadSignalId() {
		return String.format("%1$s%2$s-%3$s", NacosServiceHubSettingBase.DATAID_RELOADSIGNAL_PREFIX, this.getSystemRuntime().getDeploySystemId(), getConfigFolder().replace(".", "-")).toLowerCase();
	}

	protected String getConfigFolder() {
		return String.format("deprint-%1$s", this.getFullUniqueTag());
	}

	protected void listenReloadSignal() throws Exception {
		if (!(this.getSystemRuntime() instanceof IServiceSystemRuntime)) {
			return;
		}

		String strConfigFolder = getConfigFolder();
		String strReloadSignalId = getReloadSignalId();
		log.debug(String.format("动态实体打印[%1$s]监控重载配置[%2$s]", this.getName(), strReloadSignalId));
		((IServiceSystemRuntime) this.getSystemRuntime()).getConfigListenerRepo().addConfigListener(strReloadSignalId, new IConfigListener() {
			@Override
			public void receiveConfigInfo(String configInfo) {
				log.debug(String.format("%1$s接收到重载信号", strConfigFolder));
				localReload();
			}
		});
	}

	protected net.ibizsys.central.dataentity.print.IDEPrintRuntime getRealDEPrintRuntime(String strSubPrintTag, boolean bTryMode) throws Exception {
		net.ibizsys.central.dataentity.print.IDEPrintRuntime realDEPrintRuntime = realDEPrintRuntimeMap != null ? this.realDEPrintRuntimeMap.get(strSubPrintTag.toUpperCase()) : null;
		if (realDEPrintRuntime != null || bTryMode) {
			return realDEPrintRuntime;
		}
		throw new Exception(String.format("无法获取实体打印[%1$s]", strSubPrintTag));
	}

	@Override
	public void output(String strSubPrintTag, ServletResponse servletResponse, Object[] keys, String strType, boolean bTestPriv) throws Throwable {
		if (this.getDynamicMode() == DEPrintDynamicMode.DEDATASET) {
			net.ibizsys.central.dataentity.print.IDEPrintRuntime realDEPrintRuntime = this.getRealDEPrintRuntime(strSubPrintTag, true);
			if (realDEPrintRuntime != null) {
				realDEPrintRuntime.output(servletResponse, keys, strType, bTestPriv);
				return;
			}
		}

		this.output(servletResponse, keys, strType, bTestPriv);
	}

	@Override
	public void output(String strSubPrintTag, OutputStream outputStream, Object[] keys, String strType, boolean bTestPriv) throws Throwable {
		if (this.getDynamicMode() == DEPrintDynamicMode.DEDATASET) {
			net.ibizsys.central.dataentity.print.IDEPrintRuntime realDEPrintRuntime = this.getRealDEPrintRuntime(strSubPrintTag, true);
			if (realDEPrintRuntime != null) {
				realDEPrintRuntime.output(outputStream, keys, strType, bTestPriv);
				return;
			}
		}
		this.output(outputStream, keys, strType, bTestPriv);
	}
	
	
	@Override
	public void output(OutputStream outputStream, Object[] keys, String strType, boolean bTestPriv) throws Throwable {
		if (!StringUtils.hasLength(strType)) {
			strType = this.getDefaultContentType();
		}

		if (this.isEnableOSSPDFMode() && ReportContentType.PDF.value.equalsIgnoreCase(strType)) {
			ISysFileUtilRuntime iSysFileUtilRuntime = this.getSystemRuntime().getSysFileUtilRuntime(false);
			if (iSysFileUtilRuntime instanceof ISysOSSUtilRuntime) {
				ISysOSSUtilRuntime iSysOSSUtilRuntime = (ISysOSSUtilRuntime) iSysFileUtilRuntime;
				// 生成原始内容文件
				File tempFile = File.createTempFile("deprint", this.getDefaultReportFileSuffix());

				try (FileOutputStream os = new FileOutputStream(tempFile)) {
					this.output(os, keys, this.getOriginalContentType(), bTestPriv);
				}

				// 上传至OSS
				net.ibizsys.runtime.util.domain.File file = null;
				try {
					file = iSysFileUtilRuntime.createOSSFile(tempFile, CAT_TEMP);
				} catch (Throwable ex) {
					throw new DataEntityRuntimeException(this.getDataEntityRuntimeBase(), this, String.format("上传文件发生异常"));
				}

				try {
					file = iSysOSSUtilRuntime.getOSSPdfFile(file.getFileId(), CAT_TEMP, false);
					try (FileInputStream fis = new FileInputStream(new File(file.getLocalPath()))) {
						IOUtils.copy(fis, outputStream);
						outputStream.flush();
					}
					return;
				} catch (Throwable ex) {
					throw new DataEntityRuntimeException(this.getDataEntityRuntimeBase(), this, String.format("下载PDF文件发生异常"));
				}
			} else {
				log.warn("OSS文件组件无效，忽略在线PDF转换模式");
			}
		}

		super.output(outputStream, keys, strType, bTestPriv);
	}
	
	@Override
	public void output(ServletResponse servletResponse, Object[] keys, String strType, boolean bTestPriv) throws Throwable {
		if (!StringUtils.hasLength(strType)) {
			strType = this.getDefaultContentType();
		}
		
		if (this.isEnableOSSPDFMode() && ReportContentType.PDF.value.equalsIgnoreCase(strType)) {
			ISysFileUtilRuntime iSysFileUtilRuntime = this.getSystemRuntime().getSysFileUtilRuntime(false);
			if (iSysFileUtilRuntime instanceof ISysOSSUtilRuntime) {
				ISysOSSUtilRuntime iSysOSSUtilRuntime = (ISysOSSUtilRuntime) iSysFileUtilRuntime;
				// 生成原始内容文件
				File tempFile = File.createTempFile("deprint", this.getDefaultReportFileSuffix());

				try (FileOutputStream os = new FileOutputStream(tempFile)) {
					this.output(os, keys, this.getOriginalContentType(), bTestPriv);
				}

				// 上传至OSS
				net.ibizsys.runtime.util.domain.File file = null;
				try {
					file = iSysFileUtilRuntime.createOSSFile(tempFile, CAT_TEMP);
				} catch (Throwable ex) {
					throw new DataEntityRuntimeException(this.getDataEntityRuntimeBase(), this, String.format("上传文件发生异常"));
				}

				try {
					file = iSysOSSUtilRuntime.getOSSPdfFile(file.getFileId(), CAT_TEMP, false);
					this.outputContentType(servletResponse, strType, null);
					try (FileInputStream fis = new FileInputStream(new File(file.getLocalPath()))) {
						IOUtils.copy(fis, servletResponse.getOutputStream());
						servletResponse.getOutputStream().flush();
					}
					return;
				} catch (Throwable ex) {
					throw new DataEntityRuntimeException(this.getDataEntityRuntimeBase(), this, String.format("下载PDF文件发生异常"));
				}
			} else {
				log.warn("OSS文件组件无效，忽略在线PDF转换模式");
			}
		}

		super.output(servletResponse, keys, strType, bTestPriv);
	}
	

	/**
	 * 获取原始内容格式
	 * 
	 * @return
	 */
	protected String getOriginalContentType() {
		return this.getDefaultContentType();
	}

	/**
	 * 是否启用OSSPDF转化模式
	 * 
	 * @return
	 */
	protected boolean isEnableOSSPDFMode() {
		return false;
	}

}
