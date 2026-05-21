package net.ibizsys.central.util.freemarker;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.util.Assert;

import freemarker.template.TemplateModel;
import freemarker.template.TemplateModelException;
import net.ibizsys.central.util.IEntityDTO;
import net.ibizsys.central.util.script.IScriptEntity;
import net.ibizsys.runtime.util.script.IScriptCodeItem;

public class TemplateEntity implements ITemplateEntity {

	private Map<String, ITemplateEntity> templateEntityMap = new HashMap<String, ITemplateEntity>();
	private Map<String, List<ITemplateEntity>> templateEntityListMap = new HashMap<String, List<ITemplateEntity>>();

	final IScriptEntity iScriptEntity;

	public TemplateEntity(IScriptEntity iScriptEntity) {
		this.iScriptEntity = iScriptEntity;
		Assert.notNull(this.iScriptEntity, "传入脚本对象无效");
	}

	@Override
	public TemplateModel get(String key) throws TemplateModelException {
		Object value = this.doGet(key, null);
		return wrap(value);
	}

	@Override
	public boolean isEmpty() throws TemplateModelException {
		return false;
	}


	// 一个简单的包装方法，处理基本类型和常见对象
	protected TemplateModel wrap(Object obj) throws TemplateModelException {
		return freemarker.template.ObjectWrapper.DEFAULT_WRAPPER.wrap(obj);
	}

	protected Object doGet(String strName, Object objDefault) {
		Object value = this.iScriptEntity.get(strName, objDefault);
		if (value instanceof IEntityDTO) {
			IEntityDTO iEntityDTO = (IEntityDTO) value;
			if (iEntityDTO.getDEMethodDTORuntime() != null) {
				String strTag = String.format("__FIELD__%1$s", strName).toUpperCase();
				if (!templateEntityMap.containsKey(strTag)) {
					net.ibizsys.runtime.util.script.IScriptEntity iScriptEntity = iEntityDTO.getDEMethodDTORuntime().getDataEntityRuntime().createScriptEntity(iEntityDTO);
					if (iScriptEntity == null) {
						templateEntityMap.put(strTag, null);
					} else {
						ITemplateEntity templateEntity = this.createTemplateEntity((IScriptEntity)iScriptEntity);
						templateEntityMap.put(strTag, templateEntity);
					}
				}
				return templateEntityMap.get(strTag);
			}
		} 
		else
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
			}
		return value;
	}

	@Override
	public Object getId() {
		return this.iScriptEntity.getId();
	}

	@Override
	public Object getName() {
		return this.iScriptEntity.getName();
	}

	@Override
	public boolean contains(String strName) {
		return this.iScriptEntity.contains(strName);
	}
	
	protected ITemplateEntity createTemplateEntity(IScriptEntity iScriptEntity) {
		return new TemplateEntity(iScriptEntity);
	}

	@Override
	public ITemplateEntity parent(String strName) {
		String strTag = String.format("__PARENT__%1$s", strName).toUpperCase();
		if (!templateEntityMap.containsKey(strTag)) {
			net.ibizsys.runtime.util.script.IScriptEntity iScriptEntity = this.iScriptEntity.parent(strName);
			if (iScriptEntity == null) {
				templateEntityMap.put(strTag, null);
			} else {
				ITemplateEntity templateEntity = this.createTemplateEntity((IScriptEntity)iScriptEntity);
				templateEntityMap.put(strTag, templateEntity);
			}
		}
		return templateEntityMap.get(strTag);
	}
	
	@Override
	public ITemplateEntity child(String strName) {
		String strTag = String.format("__CHILD__%1$s", strName).toUpperCase();
		if (!templateEntityMap.containsKey(strTag)) {
			net.ibizsys.runtime.util.script.IScriptEntity iScriptEntity = this.iScriptEntity.child(strName);
			if (iScriptEntity == null) {
				templateEntityMap.put(strTag, null);
			} else {
				ITemplateEntity templateEntity = this.createTemplateEntity((IScriptEntity)iScriptEntity);
				templateEntityMap.put(strTag, templateEntity);
			}
		}
		return templateEntityMap.get(strTag);
	}


	public boolean exists() {
		return this.iScriptEntity.exists();
	}

	public ITemplateEntity last() {
		String strName = "--LAST--";
		if (!templateEntityMap.containsKey(strName)) {
			net.ibizsys.runtime.util.script.IScriptEntity iScriptEntity = this.iScriptEntity.last();
			if (iScriptEntity == null) {
				templateEntityMap.put(strName, null);
			} else {
				ITemplateEntity templateEntity = this.createTemplateEntity((IScriptEntity)iScriptEntity);
				templateEntityMap.put(strName, templateEntity);
			}
		}
		return templateEntityMap.get(strName);
	}

	 @Override
	public String dump() {
		return this.iScriptEntity.dump();
	}

	 @Override
	public IScriptCodeItem codeitem(String strName) {
		return this.iScriptEntity.codeitem(strName);
	}

	 @Override
	public IScriptCodeItem codeitem(String strName, boolean bTryMode) {
		return this.iScriptEntity.codeitem(strName, bTryMode);
	}

	 @Override
	public String codelisttext(String strName) {
		return this.iScriptEntity.codelisttext(strName);
	}

	
	 @Override
	 public String toJsonString() {
	 return this.iScriptEntity.toJsonString();
	 }

	 @Override
	 public String toJsonString(boolean bDTO) {
	 return this.iScriptEntity.toJsonString(bDTO);
	 }
	
	 @Override
	 public String toJsonString(boolean bDTO, String strSuffix) {
	 return this.iScriptEntity.toJsonString(bDTO, strSuffix);
	 }

	 @Override
	public List<ITemplateEntity> children(String strName) {
		String strTag = String.format("__CHILDREN__%1$s", strName).toUpperCase();
		if (!templateEntityListMap.containsKey(strTag)) {
			List<ITemplateEntity> templateEntityList = new ArrayList<ITemplateEntity>();
			IScriptEntity[] list = this.iScriptEntity.children(strName);
			if (list != null && list.length > 0) {
				for (IScriptEntity item : list) {
					ITemplateEntity templateEntity = this.createTemplateEntity(item);
					templateEntityList.add(templateEntity);
				}

			}
			if (templateEntityList.size() > 0) {
				templateEntityListMap.put(strTag, Collections.unmodifiableList(templateEntityList));
			} else {
				templateEntityListMap.put(strTag, Collections.EMPTY_LIST);
			}
		}
		return templateEntityListMap.get(strTag);
	}

	@Override
	public Object get(String strName, Object objDefault) {
		return this.iScriptEntity.get(strName, objDefault);
	}

	
}
