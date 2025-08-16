package net.ibizsys.central.dataentity.logic;

import net.ibizsys.runtime.dataentity.DataEntityRuntimeException;
import net.ibizsys.runtime.dataentity.util.IDEFileUtilRuntime;
import net.ibizsys.runtime.util.domain.File;
import net.ibizsys.runtime.util.domain.FileTypes;

/**
 * 文件对象参数运行时对象实现
 * 
 * @author lionlau
 *
 */
public class DELogicFileParamRuntime extends DELogicParamRuntimeBase implements IDELogicFileParamRuntime {

	private String strFileType = null;

	@Override
	protected void onInit() throws Exception {
		if(getDEFileUtilRuntime() == null) {
			throw new Exception("未配置文件功能组件");
		}
		strFileType = this.getPSDELogicParam().getFileType();
		super.onInit();
	}

	public String getFileType() {
		return this.strFileType;
	}
	
	protected IDEFileUtilRuntime getDEFileUtilRuntime() {
		return this.getDELogicRuntime().getDataEntityRuntime().getDEFileUtilRuntime();
	}
	
	@Override
	public Object getParamObject(IDELogicSession iDELogicSession) throws Throwable {
		Object object = iDELogicSession.getParamObject(this.getCodeName(), true);
		if (object != null) {
			// 检查类型是否正确
			if (!(object instanceof File)) {
				throw new DataEntityRuntimeException(this.getDELogicRuntimeContext().getDataEntityRuntime(), getDELogicRuntimeContext().getDELogicRuntime(), String.format("逻辑参数[%1$s]不是文件对象类型", getCodeName()));
			}
			return object;
		}
		if (FileTypes.TEMP.equals(this.getFileType())) {
			object = this.getDEFileUtilRuntime().createTempFile(null);
		} 
		else
			if (FileTypes.URL.equals(this.getFileType())) {
				object = this.getDEFileUtilRuntime().createUrlFile(this.getPSDELogicParam().getFileUrl());
			} 
			else
				if (FileTypes.STORAGESERVICE.equals(this.getFileType())) {
					object = this.getDEFileUtilRuntime().getDraft();
				} 
			else {
				throw new DataEntityRuntimeException(this.getDELogicRuntimeContext().getDataEntityRuntime(), getDELogicRuntimeContext().getDELogicRuntime(), String.format("逻辑参数[%1$s]文件类型[%2$s]不支持", getCodeName(), this.getFileType()));
			}

		iDELogicSession.setParamObject(this.getCodeName(), object);
		return object;
	}
	
	@Override
	public void set(IDELogicSession iDELogicSession, String strName, Object objValue) throws Throwable {
		
		if(FileTypes.URL.equals(this.getFileType())) {
			if(PARAM_URL.equals(strName)) {
				//指定Url文件，重新获取文件
				File file = this.getDEFileUtilRuntime().createUrlFile(objValue==null?null:objValue.toString());
				Object object = iDELogicSession.getParamObject(this.getCodeName(), true);
				if(object == null) {
					iDELogicSession.setParamObject(this.getCodeName(), file);
				}
				else {
					file.copyTo((File)object);
				}
				return;
			}
		}
		
		super.set(iDELogicSession, strName, objValue);
	}
	
	@Override
	public void bind(IDELogicSession iDELogicSession, Object paramObject) throws Throwable {
		if (paramObject != null) {
			// 检查类型是否正确
			if(!(paramObject instanceof File)) {
				throw new DataEntityRuntimeException(this.getDELogicRuntimeContext().getDataEntityRuntime(), getDELogicRuntimeContext().getDELogicRuntime(), String.format("逻辑参数[%1$s]无法绑定非文件对象类型参数", getCodeName()));
			}
		}
		super.bind(iDELogicSession, paramObject);
	}
	
	@Override
	public void copyTo(IDELogicSession iDELogicSession, Object dstParam) throws Throwable {
		if(!(dstParam instanceof File)) {
			throw new DataEntityRuntimeException(this.getDELogicRuntimeContext().getDataEntityRuntime(), getDELogicRuntimeContext().getDELogicRuntime(), String.format("逻辑参数[%1$s]无法拷贝至非文件对象类型参数", getCodeName()));
		}
		
		
		super.copyTo(iDELogicSession, dstParam);
	}

	// @Override
	// public InputStream getInputStream(IDELogicSession iDELogicSession) throws
	// Throwable {
	// // TODO Auto-generated method stub
	// return null;
	// }
	//
	// @Override
	// public OutputStream getOutputStream(IDELogicSession iDELogicSession)
	// throws Throwable {
	// return this.getOutputStream(iDELogicSession, false);
	// }
	//
	// @Override
	// public OutputStream getOutputStream(IDELogicSession iDELogicSession,
	// boolean bAppendMode) throws Throwable {
	// // TODO Auto-generated method stub
	// return null;
	// }
	//

}
