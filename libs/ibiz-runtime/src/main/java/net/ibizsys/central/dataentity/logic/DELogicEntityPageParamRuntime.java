package net.ibizsys.central.dataentity.logic;

import java.util.ArrayList;
import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import net.ibizsys.central.service.client.IWebClientRepEntity;
import net.ibizsys.central.util.ISearchContextDTO;
import net.ibizsys.central.util.script.ScriptPageImpl;
import net.ibizsys.runtime.dataentity.DataEntityRuntimeException;
import net.ibizsys.runtime.util.EntityUtils;
import net.ibizsys.runtime.util.IEntity;

/**
 * 数据对象分页结果参数运行时对象实现
 * @author lionlau
 *
 */
public class DELogicEntityPageParamRuntime extends DELogicParamRuntimeBase{

	private static final org.apache.commons.logging.Log log = org.apache.commons.logging.LogFactory.getLog(DELogicEntityPageParamRuntime.class);
	
	@Override
	public Object getScriptObject(IDELogicSession iDELogicSession) throws Throwable {
		Object objParam = getParamObject(iDELogicSession);
		if (objParam instanceof Page) {
			return this.getSystemRuntime().createScriptPage((Page)objParam, !this.getPSDELogicParam().isOriginEntity());
		}
		return super.getScriptObject(iDELogicSession);
	}
	
	
	@Override
	public Object getParamObject(IDELogicSession iDELogicSession) throws Throwable {
		Object object = iDELogicSession.getParamObject(this.getCodeName(), true);
		if (object != null) {
			// 检查类型是否正确
			if (!(object instanceof Page)) {
				throw new DataEntityRuntimeException(this.getDELogicRuntimeContext().getDataEntityRuntime(), getDELogicRuntimeContext().getDELogicRuntime(), String.format("逻辑参数[%1$s]不是数据对象分页结果类型", getCodeName()));
			}
			return object;
		}
		
		
		Pageable pageable = Pageable.unpaged();
		if(this.getDataEntityRuntime()!=null 
				&& this.getDELogicRuntime().getDefaultDELogicParamRuntime() != null
				&& this.getDELogicRuntime().getDefaultDELogicParamRuntime().getDataEntityRuntime() != null
				&& this.getDataEntityRuntime().getId().equals(this.getDELogicRuntime().getDefaultDELogicParamRuntime().getDataEntityRuntime().getId())) {
			Object objDefaultParam = this.getDELogicRuntime().getDefaultDELogicParamRuntime().getParamObject(iDELogicSession);
			if(objDefaultParam instanceof ISearchContextDTO) {
				ISearchContextDTO 	iSearchContextDTO = (ISearchContextDTO)objDefaultParam;
				pageable = iSearchContextDTO.getPageable();
			}
		}
		
		// 新建
		if (this.getDataEntityRuntime() == null) {
			object = new ScriptPageImpl(new ArrayList<IEntity>(), pageable, 0);
		} else {
			object = new ScriptPageImpl(this.getDataEntityRuntime().createEntityList(), pageable, 0);
		}
		iDELogicSession.setParamObject(this.getCodeName(), object);
		return object;
	}

	@Override
	public void bind(IDELogicSession iDELogicSession, Object paramObject) throws Throwable {
		if (paramObject != null) {
			// 检查类型是否正确
			if(paramObject instanceof Page) {
				super.bind(iDELogicSession, paramObject);
				return;
			}
			
			int nTotal = -1;
			List<?> list = asList(paramObject);
			if(list == null) {
				if(paramObject instanceof IWebClientRepEntity) {
					IWebClientRepEntity iWebClientRepEntity = (IWebClientRepEntity)paramObject;
					paramObject = iWebClientRepEntity.getBody();
					if(iWebClientRepEntity.getHeader() != null) {
						Object objTotal = iWebClientRepEntity.getHeader().get("x-total");
						if(objTotal != null) {
							nTotal = Integer.parseInt((String)objTotal);
						}
					}
				}
				try {
					List rawList = this.getSystemRuntime().deserialize(paramObject, List.class);
					list = (List)EntityUtils.getValue(rawList, !this.getPSDELogicParam().isOriginEntity(), this.getSystemRuntime());
				}
				catch(Throwable ex) {
					throw new DataEntityRuntimeException(this.getDELogicRuntimeContext().getDataEntityRuntime(), getDELogicRuntimeContext().getDELogicRuntime(), String.format("逻辑参数[%1$s]无法绑定非数据分页结果类型参数", getCodeName()), ex);
				}
			}
			if(list != null) {
				Page<?> page = (Page<?>)this.getParamObject(iDELogicSession);
				page = new ScriptPageImpl(list, page.getPageable(), (nTotal == -1)?list.size():nTotal);
				super.bind(iDELogicSession, page);
				return;
			}
			
			throw new DataEntityRuntimeException(this.getDELogicRuntimeContext().getDataEntityRuntime(), getDELogicRuntimeContext().getDELogicRuntime(), String.format("逻辑参数[%1$s]无法绑定非数据分页结果类型参数", getCodeName()));
		}
		super.bind(iDELogicSession, paramObject);
	}
	
	@Override
	public int count(IDELogicSession iDELogicSession) throws Throwable {
		Object obj = iDELogicSession.getParamObject(this.getCodeName(), true);
		if(obj == null) {
			return 0;
		}
		
		obj = this.getParamObject(iDELogicSession);
		if(obj instanceof Page) {
			List list = ((Page)obj).getContent();
			if(list == null) {
				return 0;
			}
			return list.size();
		}
		return super.count(iDELogicSession);
	}

	

	@Override
	public void set(IDELogicSession iDELogicSession, String strName, Object objValue) throws Throwable {
		Page<?> page = (Page<?>)this.getParamObject(iDELogicSession);

		
		if(PARAM_TOTAL.equalsIgnoreCase(strName)) {
			int nTotal = Integer.valueOf(objValue.toString());
			if (nTotal < 0) {
				nTotal = 0;
			}
			
			page = new ScriptPageImpl(page.getContent(), page.getPageable(), nTotal);
			super.bind(iDELogicSession, page);
			return;
		}
		
		throw new DataEntityRuntimeException(this.getDELogicRuntimeContext().getDataEntityRuntime(), this.getDELogicRuntimeContext().getDELogicRuntime(), String.format("逻辑参数[%1$s]未支持set[%2$s]操作", getCodeName(), strName));
	}
	
	
	
	
}
