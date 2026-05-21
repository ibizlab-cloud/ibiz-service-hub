package net.ibizsys.central.cloud.core.dataentity.logic.freemarker;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import freemarker.template.TemplateHashModel;
import freemarker.template.TemplateModel;
import freemarker.template.TemplateModelException;
import net.ibizsys.central.cloud.core.util.freemarker.TemplateEntity;
import net.ibizsys.central.dataentity.logic.IDELogicParamRuntime;
import net.ibizsys.central.util.IEntityDTO;
import net.ibizsys.central.util.freemarker.ITemplateEntity;
import net.ibizsys.central.util.script.IScriptEntity;
import net.ibizsys.runtime.util.IEntity;

public class TemplateDELogicParam implements TemplateHashModel {

	private static final org.apache.commons.logging.Log log = org.apache.commons.logging.LogFactory.getLog(TemplateDELogicParam.class);

	private final IDELogicParamRuntime iDELogicParamRuntime;
	private Map<String, ITemplateEntity> templateEntityMap = new HashMap<String, ITemplateEntity>();
	private Map<String, List<ITemplateEntity>> templateEntityListMap = new HashMap<String, List<ITemplateEntity>>();

	public TemplateDELogicParam(IDELogicParamRuntime iDELogicParamRuntime) {
		this.iDELogicParamRuntime = iDELogicParamRuntime;
	}

	@Override
	public TemplateModel get(String key) throws TemplateModelException {
		Object value;
		try {
			value = this.doGet(key);
			return wrap(value);
		} catch (Throwable e) {
			throw new TemplateModelException(e);
		}
		
	}

	@Override
	public boolean isEmpty() throws TemplateModelException {
		return false;
	}

	// 一个简单的包装方法，处理基本类型和常见对象
	protected TemplateModel wrap(Object obj) throws TemplateModelException {
		return freemarker.template.ObjectWrapper.DEFAULT_WRAPPER.wrap(obj);
	}
	
	protected IDELogicParamRuntime getDELogicParamRuntime() {
		return this.iDELogicParamRuntime;
	}
	
	protected Object doGet(String strName) throws Throwable {
		Object value = this.getDELogicParamRuntime().get(strName);
		if (value instanceof IEntityDTO) {
			IEntityDTO iEntityDTO = (IEntityDTO) value;
			String strTag = String.format("__FIELD__%1$s", strName).toUpperCase();
			if (!templateEntityMap.containsKey(strTag)) {
				net.ibizsys.runtime.util.script.IScriptEntity iScriptEntity = null;
				if (iEntityDTO.getDEMethodDTORuntime() != null) {
					 iScriptEntity = iEntityDTO.getDEMethodDTORuntime().getDataEntityRuntime().createScriptEntity(iEntityDTO);
				}
				else {
					iScriptEntity = getDELogicParamRuntime().getDataEntityRuntime().getSystemRuntime().createScriptEntity(iEntityDTO);
				}
				
				ITemplateEntity templateEntity = this.createTemplateEntity((IScriptEntity)iScriptEntity);
				templateEntityMap.put(strTag, templateEntity);
			}
			return templateEntityMap.get(strTag);
		} 
		
		if (value instanceof IEntity) {
			IEntity iEntity = (IEntity) value;
			String strTag = String.format("__FIELD__%1$s", strName).toUpperCase();
			if (!templateEntityMap.containsKey(strTag)) {
				net.ibizsys.runtime.util.script.IScriptEntity iScriptEntity = getDELogicParamRuntime().getDataEntityRuntime().getSystemRuntime().createScriptEntity(iEntity);
				ITemplateEntity templateEntity = this.createTemplateEntity((IScriptEntity)iScriptEntity);
				templateEntityMap.put(strTag, templateEntity);
			}
			return templateEntityMap.get(strTag);
		} 
		
		if (value instanceof List) {
			List list = (List) value;
			if (list.size() > 0 && list.get(0) instanceof IEntityDTO) {
				IEntityDTO iEntityDTO = (IEntityDTO) list.get(0);
				if (iEntityDTO.getDEMethodDTORuntime() != null) {
					String strTag = String.format("__FIELD__%1$s", strName).toUpperCase();
					if (!templateEntityListMap.containsKey(strTag)) {
						List<ITemplateEntity> templateEntityList = new ArrayList<ITemplateEntity>();
						for (Object item : list) {
							net.ibizsys.runtime.util.script.IScriptEntity iScriptEntity = iEntityDTO.getDEMethodDTORuntime().getDataEntityRuntime().createScriptEntity((IEntityDTO) item);
							ITemplateEntity templateEntity = this.createTemplateEntity((IScriptEntity)iScriptEntity);
							templateEntityList.add(templateEntity);
						}
						templateEntityListMap.put(strTag, Collections.unmodifiableList(templateEntityList));
					}
					return templateEntityListMap.get(strTag);
				}
			}
			
			if (list.size() > 0 && list.get(0) instanceof IEntity) {
				String strTag = String.format("__FIELD__%1$s", strName).toUpperCase();
				if (!templateEntityListMap.containsKey(strTag)) {
					List<ITemplateEntity> templateEntityList = new ArrayList<ITemplateEntity>();
					for (Object item : list) {
						net.ibizsys.runtime.util.script.IScriptEntity iScriptEntity =  getDELogicParamRuntime().getDataEntityRuntime().getSystemRuntime().createScriptEntity((IEntity) item);
						ITemplateEntity templateEntity = this.createTemplateEntity((IScriptEntity)iScriptEntity);
						templateEntityList.add(templateEntity);
					}
					templateEntityListMap.put(strTag, Collections.unmodifiableList(templateEntityList));
				}
				return templateEntityListMap.get(strTag);
			}
		}
		return value;
	}
	
	protected ITemplateEntity createTemplateEntity(IScriptEntity iScriptEntity) {
		return new TemplateEntity(iScriptEntity);
	}
}
