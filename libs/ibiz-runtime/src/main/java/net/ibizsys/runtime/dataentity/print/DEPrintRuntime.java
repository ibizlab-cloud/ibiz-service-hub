package net.ibizsys.runtime.dataentity.print;

import java.io.OutputStream;
import java.util.ArrayList;
import java.util.List;

import org.springframework.util.Assert;
import org.springframework.util.StringUtils;

import net.ibizsys.model.IPSModelObject;
import net.ibizsys.model.PSModelEnums.ReportContentType;
import net.ibizsys.model.dataentity.print.IPSDEPrint;
import net.ibizsys.runtime.dataentity.DataEntityModelRuntimeBase;
import net.ibizsys.runtime.dataentity.DataEntityRuntimeException;
import net.ibizsys.runtime.dataentity.IDataEntityRuntimeBase;
import net.ibizsys.runtime.security.IUserContext;
import net.ibizsys.runtime.security.UserContext;
import net.ibizsys.runtime.util.Errors;
import net.ibizsys.runtime.util.IEntityBase;

/**
 * 实体打印运行时对象接口
 * 
 * @author lionlau
 *
 */
public class DEPrintRuntime extends DataEntityModelRuntimeBase implements IDEPrintRuntime {

	private static final org.apache.commons.logging.Log log = org.apache.commons.logging.LogFactory.getLog(DEPrintRuntime.class);

	private IPSDEPrint iPSDEPrint = null;

	@Override
	public void init(IDataEntityRuntimeBase iDataEntityRuntimeBase, IPSDEPrint iPSDEPrint) throws Exception {
		Assert.notNull(iDataEntityRuntimeBase, "传入实体运行时对象无效");
		Assert.notNull(iPSDEPrint, "传入实体打印模型对象无效");

		this.setDataEntityRuntimeBase(iDataEntityRuntimeBase);

		this.iPSDEPrint = iPSDEPrint;

		this.onInit();
	}

	@Override
	public IPSDEPrint getPSDEPrint() {
		return this.iPSDEPrint;
	}

	@Override
	public IPSModelObject getPSModelObject() {
		return getPSDEPrint();
	}

	@Override
	public String getId() {
		if (getPSDEPrint() != null) {
			return getPSDEPrint().getId();
		}
		return null;
	}

	@Override
	public String getName() {
		if (getPSDEPrint() != null) {
			return getPSDEPrint().getName();
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
	public void output(OutputStream outputStream, Object[] keys, String strType, boolean bTestPriv) throws Throwable {

		if(!StringUtils.hasLength(strType)) {
			strType = getDefaultContentType();
		}
		
		List<IEntityBase> list = new ArrayList<IEntityBase>();
		for (Object objKey : keys) {
			IEntityBase iEntityBase = null;
			try {
				if (this.getPSDEPrint().getGetDataPSDEAction() == null) {
					iEntityBase = this.getDataEntityRuntime().get(objKey);
				} else {
					iEntityBase = this.getDataEntityRuntime().createEntity();
					this.getDataEntityRuntime().setFieldValue(iEntityBase, this.getDataEntityRuntime().getKeyPSDEField(), objKey);
					Object ojbRet = this.getDataEntityRuntime().executeAction(this.getPSDEPrint().getGetDataPSDEAction().getName(), this.getPSDEPrint().getGetDataPSDEAction(), new Object[] { iEntityBase });
					if (ojbRet instanceof IEntityBase) {
						iEntityBase = (IEntityBase) ojbRet;
					}
				}
			} catch (Throwable e) {
				throw new DataEntityRuntimeException(this.getDataEntityRuntimeBase(), this, String.format("获取数据[%1$s]发生异常，%2$s", objKey, e.getMessage()), e);
			}
			// 判断数据对象权限
			if (bTestPriv && !testPermission(iEntityBase)) {
				throw new DataEntityRuntimeException(this.getDataEntityRuntimeBase(), this, String.format("没有授权访问指定打印"), Errors.ACCESSDENY);
			}

			list.add(iEntityBase);
		}

		IEntityBase[] entities = list.toArray(new IEntityBase[list.size()]);
		entities = this.onBeforeOutput(entities, strType);
		onOutput(outputStream, entities, strType);
	}

	protected IEntityBase[] onBeforeOutput(IEntityBase[] list, String strType) throws Throwable {
		return list;
	}

	protected void onOutput(OutputStream outputStream, IEntityBase[] list, String strType) throws Throwable {
		throw new Exception("没有实现");
	}

	protected boolean testPermission(IEntityBase iEntityBase) throws Throwable {
		String strDataAccessAction = null;
		try {
			if (this.getPSDEPrint().getGetDataPSDEOPPriv() != null) {
				strDataAccessAction = this.getPSDEPrint().getGetDataPSDEOPPriv().getName();
			}
		} catch (Exception e) {
			throw new DataEntityRuntimeException(this.getDataEntityRuntimeBase(), this, String.format("获取打印[%1$s]访问操作标识发生异常，%2$s", this.getName(), e.getMessage()), Errors.MODELERROR, e);
		}
		if (StringUtils.hasLength(strDataAccessAction)) {
			return this.getDataEntityRuntime().testDataAccessAction(iEntityBase, strDataAccessAction);
		}
		return true;
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
	 * 
	 * @return
	 */
	protected String getReportModel() {
		return this.getPSDEPrint().getReportModel();
	}

	/**
	 * 获取报表文件路径
	 * 
	 * @return
	 */
	protected String getReportFilePath() {
		return this.getPSDEPrint().getReportFile();
	}
}
