package net.ibizsys.central.dataentity.dataexport;

import java.io.File;
import java.io.OutputStream;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.fasterxml.jackson.databind.JsonNode;

import net.ibizsys.central.dataentity.DataEntityModelRuntimeBase;
import net.ibizsys.central.dataentity.IDataEntityRuntime;
import net.ibizsys.model.IPSModelObject;
import net.ibizsys.model.dataentity.dataexport.IPSDEDataExport;
import net.ibizsys.model.dataentity.dataexport.IPSDEDataExportGroup;
import net.ibizsys.model.dataentity.dataexport.IPSDEDataExportItem;
import net.ibizsys.runtime.dataentity.DataEntityRuntimeException;
import net.ibizsys.runtime.dataentity.IDataEntityRuntimeBaseContext;
import net.ibizsys.runtime.security.IUserContext;
import net.ibizsys.runtime.security.UserContext;
import net.ibizsys.runtime.util.Errors;

public class DEDataExportRuntime extends DataEntityModelRuntimeBase implements IDEDataExportRuntime{

	private static final Log log = LogFactory.getLog(DEDataExportRuntime.class);
	private IDataEntityRuntimeBaseContext iDataEntityRuntimeBaseContext = null;
	private IPSDEDataExport iPSDEDataExport = null;
	
	@Override
	public void init(IDataEntityRuntimeBaseContext iDataEntityRuntimeBaseContext, IPSDEDataExport iPSDEDataExport) throws Exception {
		this.iDataEntityRuntimeBaseContext = iDataEntityRuntimeBaseContext;
		this.iPSDEDataExport = iPSDEDataExport;
		this.setDataEntityRuntimeBase(this.iDataEntityRuntimeBaseContext.getDataEntityRuntime());
		this.onInit();
	}

	@Override
	public IPSDEDataExport getPSDEDataExport() {
		return this.iPSDEDataExport;
	}

	@Override
	public IPSModelObject getPSModelObject() {
		return this.getPSDEDataExport();
	}
	
	protected java.util.List<IPSDEDataExportItem> getPSDEDataExportItems(){
		return this.getPSDEDataExport().getPSDEDataExportItems();
	}
	
	protected java.util.List<IPSDEDataExportGroup> getPSDEDataExportGroups() {
		return this.getPSDEDataExport().getPSDEDataExportGroups();
	}
	
	protected int getGroupLevel() {
		return this.getPSDEDataExport().getGroupLevel();
	}

	protected IUserContext getUserContext() {
		return UserContext.getCurrent();
	}
	
	@Override
	public File exportFile(Object objData, String strMethodName, Object objBody, String strKey, Object objTag, boolean bTestPriv, IDataEntityRuntime parentDataEntityRuntime, String strParentKey) {
		try {
			return onExportFile(objData, strMethodName, objBody, strKey, objTag, bTestPriv, parentDataEntityRuntime, strParentKey);
		}
		catch(Throwable ex) {
			log.error(String.format("实体数据导出[%1$s]导出数据发生异常，%2$s", this.getName(), ex.getMessage()), ex);
			throw new DataEntityRuntimeException(this.getDataEntityRuntimeBase(), this, String.format("导出数据发生异常，%1$s", ex.getMessage()), ex);
		}
	}

	protected File onExportFile(Object objData, String strMethodName, Object objBody, String strKey, Object objTag, boolean bTestPriv, IDataEntityRuntime parentDataEntityRuntime, String strParentKey) {
		throw new DataEntityRuntimeException(this.getDataEntityRuntimeBase(), this, "没有实现", Errors.NOTIMPL);
	}
	
	@Override
	public File exportFile(Object objData, String strMethodName, Object objBody, String strKey, Object objTag, boolean bTestPriv, net.ibizsys.runtime.dataentity.IDataEntityRuntime parentDataEntityRuntime, String strParentKey) {
		return this.exportFile(objData, strMethodName, objBody, strKey, objTag, bTestPriv, (IDataEntityRuntime) parentDataEntityRuntime, strParentKey);
	}

	@Override
	public void exportStream(Object objData, OutputStream outputStram) throws Throwable{
		try {
			onExportStream(objData, outputStram);
		}
		catch(Throwable ex) {
			log.error(String.format("实体数据导出[%1$s]导出数据发生异常，%2$s", this.getName(), ex.getMessage()), ex);
			throw new DataEntityRuntimeException(this.getDataEntityRuntimeBase(), this, String.format("导出数据发生异常，%1$s", ex.getMessage()), ex);
		}
	}
	
	protected void onExportStream(Object objData, OutputStream outputStram) throws Throwable{
		throw new Exception("没有实现");
	}

	
	@Override
	public int getMaxRowCount() {
		return getPSDEDataExport().getMaxRowCount();
	}
	
	
	protected String getImportParam(String strKey, String strDefault) {
		if (this.getPSDEDataExport().getExpParams() != null) {
			JsonNode node = this.getPSDEDataExport().getExpParams().get(strKey);
			if (node != null) {
				return node.asText(strDefault);
			}
		}
		return strDefault;
	}

	protected int getImportParam(String strKey, int nDefault) {
		if (this.getPSDEDataExport().getExpParams() != null) {
			JsonNode node = this.getPSDEDataExport().getExpParams().get(strKey);
			if (node != null) {
				return node.asInt(nDefault);
			}
		}
		return nDefault;
	}

	protected double getImportParam(String strKey, double fDefault) {
		if (this.getPSDEDataExport().getExpParams() != null) {
			JsonNode node = this.getPSDEDataExport().getExpParams().get(strKey);
			if (node != null) {
				return node.asDouble(fDefault);
			}
		}
		return fDefault;
	}
	
	
	protected boolean getImportParam(String strKey, boolean bDefault) {
		if (this.getPSDEDataExport().getExpParams() != null) {
			JsonNode node = this.getPSDEDataExport().getExpParams().get(strKey);
			if (node != null) {
				return node.asBoolean(bDefault);
			}
		}
		return bDefault;
	}
}
