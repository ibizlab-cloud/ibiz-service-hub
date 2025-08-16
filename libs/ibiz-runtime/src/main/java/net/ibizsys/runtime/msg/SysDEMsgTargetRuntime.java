package net.ibizsys.runtime.msg;

import java.util.LinkedHashMap;
import java.util.Map;

import org.springframework.data.domain.Page;
import org.springframework.util.ObjectUtils;

import net.ibizsys.model.dataentity.defield.IPSDEField;
import net.ibizsys.runtime.SystemRuntimeException;
import net.ibizsys.runtime.dataentity.IDataEntityRuntime;
import net.ibizsys.runtime.util.DataTypeUtils;
import net.ibizsys.runtime.util.IEntity;
import net.ibizsys.runtime.util.IEntityBase;
import net.ibizsys.runtime.util.ISearchContext;
import net.ibizsys.runtime.util.ISearchContextBase;

/**
 * 系统实体消息目标运行时对象
 * 
 * @author lionlau
 *
 */
public class SysDEMsgTargetRuntime extends SysMsgTargetRuntimeBase {

	private static final org.apache.commons.logging.Log log = org.apache.commons.logging.LogFactory.getLog(SysDEMsgTargetRuntime.class);
	private IDataEntityRuntime iDataEntityRuntime = null;
	
	@Override
	protected void onInit() throws Exception {
		
		this.getPSSysMsgTarget().getPSDataEntityMust();
		this.getPSSysMsgTarget().getPSDEDataSetMust();
		this.getPSSysMsgTarget().getTargetPSDEFieldMust();
		
		
		super.onInit();
	}

	@Override
	public Map<String, String> get(IEntityBase iEntityBase) {
		try {
			return this.onGet(iEntityBase);
		} catch (Throwable ex) {
			throw new SystemRuntimeException(this.getSystemRuntimeBase(), this, String.format("获取消息目标发生异常，%1$s", ex.getMessage()), ex);
		}
	}

	protected Map<String, String> onGet(IEntityBase iEntityBase) throws Throwable {
		IDataEntityRuntime iDataEntityRuntime = getDataEntityRuntime();
		ISearchContextBase iSearchContext = iDataEntityRuntime.createSearchContext();
		iDataEntityRuntime.setSearchPaging(iSearchContext, ISearchContext.STARTPAGE, Integer.MAX_VALUE, null);
		iDataEntityRuntime.setSearchMode(iSearchContext, true, false);
		
		if(iEntityBase instanceof IEntity) {
			Map<String, Object> any = ((IEntity)iEntityBase).any();
			if(!ObjectUtils.isEmpty(any)) {
				for(java.util.Map.Entry<String, Object> entry : any.entrySet()) {
					Object value = entry.getValue();
					value = DataTypeUtils.asSimple(value);
					if(value == null) {
						continue;
					}
					
					iDataEntityRuntime.setSearchDataContext(iSearchContext, entry.getKey(), value);
				}
			}
		}
		else {
			log.warn(String.format("无法从传入数据获取上下文"));
		}
		
		
		IPSDEField targetPSDEField = this.getPSSysMsgTarget().getTargetPSDEFieldMust();
		IPSDEField targetTypePSDEField = this.getPSSysMsgTarget().getTargetTypePSDEField();
		
		Page<? extends IEntityBase> page = iDataEntityRuntime.searchDataSet(this.getPSSysMsgTarget().getPSDEDataSetMust(), iSearchContext);
		if(page != null && page.getContent() != null) {
			Map<String, String> map = new LinkedHashMap<String, String>();
			for(IEntityBase item : page.getContent()) {
				String strTargetId = DataTypeUtils.getStringValue(iDataEntityRuntime.getFieldValue(item, targetPSDEField), null);
				if(ObjectUtils.isEmpty(strTargetId)) {
					continue;
				}
				String strTargetType = null;
				if(targetTypePSDEField != null){
					strTargetType = DataTypeUtils.getStringValue(iDataEntityRuntime.getFieldValue(item, targetTypePSDEField), null);
				}
				
				map.put(strTargetId, strTargetType);				
			}
			return map;
		}
	
		return null;
	}

	protected IDataEntityRuntime getDataEntityRuntime() {
		if(this.iDataEntityRuntime == null) {
			this.iDataEntityRuntime = this.getSystemRuntime().getDataEntityRuntime(this.getPSSysMsgTarget().getPSDataEntityMust().getId());
		}
		return this.iDataEntityRuntime;
	}
	
	
}
