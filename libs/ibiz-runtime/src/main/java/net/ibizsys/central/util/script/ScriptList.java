package net.ibizsys.central.util.script;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;

import org.springframework.util.Assert;

import net.ibizsys.central.ISystemRuntime;
import net.ibizsys.central.dataentity.logic.DELogicParamRuntime;
import net.ibizsys.runtime.SystemRuntimeException;
import net.ibizsys.runtime.util.DataTypeUtils;
import net.ibizsys.runtime.util.IEntity;
import net.ibizsys.runtime.util.script.ScriptObjectMirrorUtils;
import net.ibizsys.runtime.util.script.ScriptUtils;
@SuppressWarnings({"rawtypes","unchecked","restriction"})
public class ScriptList implements IScriptList {


	private ISystemRuntime iSystemRuntime = null;
	private List list = null;
	private boolean bLowerCaseFieldName = true;

	public ScriptList(ISystemRuntime iSystemRuntime, List list) {
		Assert.notNull(iSystemRuntime, "传入系统运行时对象不能为空");
		Assert.notNull(list, "传入列表对象不能为空");
		this.list = list;
		this.iSystemRuntime = iSystemRuntime;
	}
	
	public ScriptList(ISystemRuntime iSystemRuntime,  List list, boolean bLowerCaseFieldName) {
		Assert.notNull(iSystemRuntime, "传入系统运行时对象不能为空");
		Assert.notNull(list, "传入列表对象不能为空");
		this.list = list;
		this.iSystemRuntime = iSystemRuntime;
		this.bLowerCaseFieldName = bLowerCaseFieldName;
	}

	protected ISystemRuntime getSystemRuntime() {
		return this.iSystemRuntime;
	}

	protected List getList() {
		return this.list;
	}

	protected void setList(List list) {
		Assert.notNull(list, "传入列表对象不能为空");
		this.list = list;
	}

	protected boolean isLowerCaseFieldName() {
		return this.bLowerCaseFieldName;
	}
	
	@Override
	public Object getReal() {
		return getList();
	}

	@Override
	public int getLength() {
		return getList().size();
	}

	@Override
	public int size() {
		return getLength();
	}

	@Override
	public IScriptList add(Object objValue) {
		if (objValue != null) {
			objValue = ScriptUtils.getReal(objValue);
		}
		this.getList().add(objValue);
		return this;
	}

	@Override
	public IScriptList add(int nIndex, Object objValue) {
		if (objValue != null) {
			objValue = ScriptUtils.getReal(objValue);
		}
		this.getList().add(nIndex, objValue);
		return this;
	}

	@Override
	public IScriptList addAll(Object objList) {
		if (objList == null) {
			return this;
		}

		if (objList instanceof IScriptList) {
			IScriptList iScriptListBase = (IScriptList) objList;
			int nSize = iScriptListBase.size();
			for (int i = 0; i < nSize; i++) {
				this.add(iScriptListBase.get(i));
			}
			return this;
		}

		List srcList = null;

		if (objList instanceof List) {
			srcList = (List) objList;
		} else if (objList instanceof jdk.nashorn.api.scripting.ScriptObjectMirror) {
			Object obj = ScriptObjectMirrorUtils.getJavaObject((jdk.nashorn.api.scripting.ScriptObjectMirror) objList);
			if (obj instanceof List) {
				srcList = (List) obj;
			}
		}

		if (srcList != null) {
			int nSize = srcList.size();
			for (int i = 0; i < nSize; i++) {
				this.add(srcList.get(i));
			}
			return this;
		}

		throw new SystemRuntimeException(this.getSystemRuntime(), "无法识别的列表对象");
	}

	@Override
	public IScriptList addall(Object list) {
		return this.addAll(list);
	}
	
	
	@Override
	public Object get(int nIndex) {
		Object objValue = this.getList().get(nIndex);
		if(objValue == null) {
			return null;
		}
		return this.getSystemRuntime().createScriptObject(objValue);
	}

	@Override
	public Object remove(int nIndex) {
		Object objValue = this.getList().remove(nIndex);
		if(objValue == null) {
			return null;
		}
		return this.getSystemRuntime().createScriptObject(objValue);
		
	}

	@Override
	public IScriptList clear() {
		this.getList().clear();
		return this;
	}

	
	@Override
	public IScriptList sort(String strSortInfo) {
		Assert.hasLength(strSortInfo, "未传入排序信息");

		String[] parts = strSortInfo.split("[,]");
		String strField = parts[0];
		boolean bSortDesc = false;
		if (parts.length > 1) {
			bSortDesc = "desc".equalsIgnoreCase(parts[1]);
		}

		Collections.sort(this.getList(), new Comparator<Object>() {
			@Override
			public int compare(Object o1, Object o2) {
				IEntity e1 = (IEntity) o1;
				IEntity e2 = (IEntity) o2;
				Object v1 = e1.get(strField);
				Object v2 = e2.get(strField);

				if (v1 == null && v2 == null) {
					return 0;
				}

				if (v1 != null && v2 == null) {
					return 1;
				}

				if (v1 == null && v2 != null) {
					return -1;
				}

				return (int) DataTypeUtils.compare(DataTypeUtils.getObjectDataType(v1), v1, v2);
			}
		});

		if (bSortDesc) {
			Collections.reverse(this.getList());
		}

		return this;
	}

	@Override
	public Object max(String strField) {
		Assert.hasLength(strField, "未传入计算属性");
		try {
			return DELogicParamRuntime.max(this.getList(), strField);
		} catch (Throwable e) {
			throw new SystemRuntimeException(this.getSystemRuntime(), e.getMessage(), e);
		}
	}

	@Override
	public Object min(String strField) {
		try {
			return DELogicParamRuntime.min(this.getList(), strField);
		} catch (Throwable e) {
			throw new SystemRuntimeException(this.getSystemRuntime(), e.getMessage(), e);
		}
	}

	@Override
	public Object avg(String strField) {
		try {
			return DELogicParamRuntime.avg(this.getList(), strField);
		} catch (Throwable e) {
			throw new SystemRuntimeException(this.getSystemRuntime(), e.getMessage(), e);
		}
	}

	@Override
	public Object sum(String strField) {
		try {
			return DELogicParamRuntime.sum(this.getList(), strField);
		} catch (Throwable e) {
			throw new SystemRuntimeException(this.getSystemRuntime(), e.getMessage(), e);
		}
	}

	@Override
	public IScriptList from(Object objData) {

		Assert.notNull(objData, "不能传入空数据");

		try {
			List list = this.getSystemRuntime().deserialize(objData, List.class);
			if (list != null) {
				List templist = new ArrayList();
				for (Object map : list) {
					if (map instanceof Map) {
						IEntity iEntity = this.getSystemRuntime().createEntity(map, this.isLowerCaseFieldName());
						templist.add(iEntity);
					} else {
						throw new Exception("成员类型不正确");
					}
				}
				this.getList().clear();
				this.getList().addAll(templist);
			}
		} catch (Exception ex) {
			throw new SystemRuntimeException(this.getSystemRuntime(), String.format("反序列化数据对象列表发生异常，%1$s", ex.getMessage()), ex);
		}

		return this;
	}

	@Override
	public String dump() {
		return (String) this.getSystemRuntime().serialize(this.getList());
	}

	// @Override
	// public Object[] array() {
	// return this.getList().toArray(new Object[this.getList().size()]);
	// }

}
