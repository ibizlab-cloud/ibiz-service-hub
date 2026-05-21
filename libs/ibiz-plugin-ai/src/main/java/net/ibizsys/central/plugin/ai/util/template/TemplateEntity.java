package net.ibizsys.central.plugin.ai.util.template;

import java.io.ByteArrayOutputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.util.Assert;

import freemarker.template.TemplateHashModel;
import freemarker.template.TemplateModel;
import freemarker.template.TemplateModelException;
import net.ibizsys.central.cloud.core.dataentity.IDataEntityRuntime;
import net.ibizsys.central.util.IEntityDTO;
import net.ibizsys.central.util.script.IScriptEntity;
import net.ibizsys.model.PSModelEnums.ReportContentType;
import net.ibizsys.runtime.util.script.IScriptCodeItem;


public class TemplateEntity implements TemplateHashModel{

	private Map<String, TemplateEntity> templateEntityMap = new HashMap<String, TemplateEntity>();
	private Map<String, List<TemplateEntity>> templateEntityListMap = new HashMap<String, List<TemplateEntity>>();
	
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
		// TODO Auto-generated method stub
		return false;
	}
	
//	public Object get(String strName) {
//		return this.get(strName, null);
//	}
	
	
//	
	 // 一个简单的包装方法，处理基本类型和常见对象
    private TemplateModel wrap(Object obj) throws TemplateModelException {
        return freemarker.template.ObjectWrapper.DEFAULT_WRAPPER.wrap(obj);
    }

	protected Object doGet(String strName, Object objDefault) {
		Object value = this.iScriptEntity.get(strName, objDefault);
		if(value instanceof IEntityDTO) {
			IEntityDTO iEntityDTO = (IEntityDTO)value;
			if(iEntityDTO.getDEMethodDTORuntime() != null) {
				String strTag = String.format("__FIELD__%1$s", strName).toUpperCase();
				if(!templateEntityMap.containsKey(strTag)) {
					net.ibizsys.runtime.util.script.IScriptEntity iScriptEntity = iEntityDTO.getDEMethodDTORuntime().getDataEntityRuntime().createScriptEntity(iEntityDTO);
					if(iScriptEntity == null) {
						templateEntityMap.put(strTag, null);
					}
					else {
						TemplateEntity templateEntity = new TemplateEntity((IScriptEntity)iScriptEntity);
						templateEntityMap.put(strTag, templateEntity);
					}
				}
				return templateEntityMap.get(strTag);
			}
		}
		else
			if(value instanceof List) {
				List list = (List)value;
				if(list.size() > 0 && list.get(0) instanceof IEntityDTO) {
					IEntityDTO iEntityDTO = (IEntityDTO)list.get(0);
					if(iEntityDTO.getDEMethodDTORuntime() != null) {
						String strTag = String.format("__FIELD__%1$s", strName).toUpperCase();
						if(!templateEntityListMap.containsKey(strTag)) {
							List<TemplateEntity> templateEntityList = new ArrayList<TemplateEntity>();
							for(Object item : list) {
								net.ibizsys.runtime.util.script.IScriptEntity iScriptEntity = iEntityDTO.getDEMethodDTORuntime().getDataEntityRuntime().createScriptEntity((IEntityDTO)item);
								TemplateEntity templateEntity = new TemplateEntity((IScriptEntity)iScriptEntity);
								templateEntityList.add(templateEntity);
							}
							templateEntityListMap.put(strTag, templateEntityList);
						}
						return templateEntityListMap.get(strTag);
					}
				}
			}
		return value;
	}





	public Object getId() {
		return this.iScriptEntity.getId();
	}

	public Object getName() {
		return this.iScriptEntity.getName();
	}

	public boolean contains(String strName) {
		return this.iScriptEntity.contains(strName);
	}
	
	public String print(String strPrintTag)	{
		Object real = this.iScriptEntity.getReal();
		if(real instanceof IEntityDTO) {
			IEntityDTO iEntityDTO = (IEntityDTO)real;
			if(iEntityDTO.getDEMethodDTORuntime() != null) {
				try {
					ByteArrayOutputStream baos = new ByteArrayOutputStream();
					((IDataEntityRuntime)iEntityDTO.getDEMethodDTORuntime().getDataEntityRuntime()).outputPrint(strPrintTag, baos, new Object[] {iEntityDTO.getDEMethodDTORuntime().getDataEntityRuntime().getKeyFieldValue(iEntityDTO)}, ReportContentType.MARKDOWN.value, false);
					return baos.toString("utf-8");
				} catch (Throwable e) {
					return e.getMessage();
				}
			}
		}
		return null;
	}
	
	//@Override
//	public TemplateEntity parent(String strName) {
//		String strTag = String.format("__PARENT__%1$s", strName).toUpperCase();
//		if(!templateEntityMap.containsKey(strTag)) {
//			net.ibizsys.runtime.util.script.IScriptEntity iScriptEntity = this.iScriptEntity.parent(strName);
//			if(iScriptEntity == null) {
//				templateEntityMap.put(strTag, null);
//			}
//			else {
//				if(iScriptEntity.getReal() instanceof IEntityDTO) {
//					IEntityDTO parentEntityDTO = (IEntityDTO)iScriptEntity.getReal();
//					if(parentEntityDTO.getDEMethodDTORuntime() != null) {
//						parentEntityDTO.getDEMethodDTORuntime().getDataEntityRuntime().fillEntityCodeListTexts(parentEntityDTO, this.getCodeItemTextSuffix());
//					}
//				}
//				TemplateEntity templateEntity = new TemplateEntity((IScriptEntity)iScriptEntity);
//				templateEntityMap.put(strTag, templateEntity);
//			}
//		}
//		return templateEntityMap.get(strTag);
//	}

	

//	public TemplateEntity child(String strName) {
//		String strTag = String.format("__CHILD__%1$s", strName).toUpperCase();
//		if(!templateEntityMap.containsKey(strTag)) {
//			net.ibizsys.runtime.util.script.IScriptEntity iScriptEntity = this.iScriptEntity.child(strName);
//			if(iScriptEntity == null) {
//				templateEntityMap.put(strTag, null);
//			}
//			else {
//				TemplateEntity templateEntity = new TemplateEntity((IScriptEntity)iScriptEntity);
//				templateEntityMap.put(strTag, templateEntity);
//			}
//		}
//		return templateEntityMap.get(strTag);
//	}

	public boolean exists() {
		return this.iScriptEntity.exists();
	}

	

	public TemplateEntity last() {
		String strName = "--LAST--";
		if(!templateEntityMap.containsKey(strName)) {
			net.ibizsys.runtime.util.script.IScriptEntity iScriptEntity = this.iScriptEntity.last();
			if(iScriptEntity == null) {
				templateEntityMap.put(strName, null);
			}
			else {
				if(iScriptEntity.getReal() instanceof IEntityDTO) {
					IEntityDTO parentEntityDTO = (IEntityDTO)iScriptEntity.getReal();
					if(parentEntityDTO.getDEMethodDTORuntime() != null) {
						parentEntityDTO.getDEMethodDTORuntime().getDataEntityRuntime().fillEntityCodeListTexts(parentEntityDTO, this.getCodeItemTextSuffix());
					}
				}
				TemplateEntity templateEntity = new TemplateEntity((IScriptEntity)iScriptEntity);
				templateEntityMap.put(strName, templateEntity);
			}
		}
		return templateEntityMap.get(strName);
	}

	public String dump() {
		return this.iScriptEntity.dump();
	}

	public IScriptCodeItem codeitem(String strName) {
		return this.iScriptEntity.codeitem(strName);
	}

	public IScriptCodeItem codeitem(String strName, boolean bTryMode) {
		return this.iScriptEntity.codeitem(strName, bTryMode);
	}

	public String codelisttext(String strName) {
		return this.iScriptEntity.codelisttext(strName);
	}

//	public Timestamp getTimestamp(String strName, Timestamp def) {
//		return this.iScriptEntity.getTimestamp(strName, def);
//	}
//
//	public BigDecimal getBigDecimal(String strName, BigDecimal fDefault) {
//		return this.iScriptEntity.getBigDecimal(strName, fDefault);
//	}
//
//	public BigInteger getBigInteger(String strName, BigInteger nDefault) {
//		return this.iScriptEntity.getBigInteger(strName, nDefault);
//	}
//
//	public Boolean getBoolean(String strName, Boolean def) {
//		return this.iScriptEntity.getBoolean(strName, def);
//	}
//
//	public Double getDouble(String strName, Double def) {
//		return this.iScriptEntity.getDouble(strName, def);
//	}
//
//	public Float getFloat(String strName, Float def) {
//		return this.iScriptEntity.getFloat(strName, def);
//	}
//
//	public Integer getInteger(String strName, Integer def) {
//		return this.iScriptEntity.getInteger(strName, def);
//	}
//
//	public Long getLong(String strName, Long def) {
//		return this.iScriptEntity.getLong(strName, def);
//	}
//
//	public String getString(String strName, String strDefault) {
//		return this.iScriptEntity.getString(strName, strDefault);
//	}
//
//	public String toJsonString() {
//		return this.iScriptEntity.toJsonString();
//	}

//	@Override
//	public String toJsonString(boolean bDTO) {
//		return this.iScriptEntity.toJsonString(bDTO);
//	}
//
//	@Override
//	public String toJsonString(boolean bDTO, String strSuffix) {
//		return this.iScriptEntity.toJsonString(bDTO, strSuffix);
//	}


//	public List<TemplateEntity> children(String strName) {
//		String strTag = String.format("__CHILDREN__%1$s", strName).toUpperCase();
//		if(!templateEntityListMap.containsKey(strTag)) {
//			List<TemplateEntity> templateEntityList = new ArrayList<TemplateEntity>();
//			IScriptEntity[] list = this.iScriptEntity.children(strName);
//			if(list!=null && list.length > 0) {
//				for(IScriptEntity item : list) {
//					TemplateEntity templateEntity = new TemplateEntity(item);
//					templateEntityList.add(templateEntity);
//				}
//			
//			}
//			if(templateEntityList.size() >0) {
//				templateEntityListMap.put(strTag, templateEntityList);
//			}
//			else {
//				templateEntityListMap.put(strTag, null);
//			}
//		}
//		return templateEntityListMap.get(strTag);
//	}
	
	public String info() {
		Object real = this.iScriptEntity.getReal();
		if(real instanceof IEntityDTO) {
			IEntityDTO iEntityDTO = (IEntityDTO)real;
			if(iEntityDTO.getDEMethodDTORuntime() != null) {
				try {
					return ((IDataEntityRuntime)iEntityDTO.getDEMethodDTORuntime().getDataEntityRuntime()).getAIInfo(iEntityDTO);
				} catch (Throwable e) {
					return e.getMessage();
				}
			}
		}
		return null;
	}
	
	public String full_info() {
		Object real = this.iScriptEntity.getReal();
		if(real instanceof IEntityDTO) {
			IEntityDTO iEntityDTO = (IEntityDTO)real;
			if(iEntityDTO.getDEMethodDTORuntime() != null) {
				try {
					return ((IDataEntityRuntime)iEntityDTO.getDEMethodDTORuntime().getDataEntityRuntime()).getAIFullInfo(iEntityDTO);
				} catch (Throwable e) {
					return e.getMessage();
				}
			}
		}
		return null;
	}
	
	/**
	 * 获取代码项文本后缀
	 * @return
	 */
	protected String getCodeItemTextSuffix() {
		return "text";
	}
}
