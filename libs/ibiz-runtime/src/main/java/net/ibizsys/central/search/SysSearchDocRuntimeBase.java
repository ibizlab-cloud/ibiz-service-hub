package net.ibizsys.central.search;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.util.ObjectUtils;

import net.ibizsys.model.IPSModelObject;
import net.ibizsys.model.search.IPSSysSearchDoc;
import net.ibizsys.model.search.IPSSysSearchField;
import net.ibizsys.runtime.ModelRuntimeBase;

public abstract class SysSearchDocRuntimeBase extends ModelRuntimeBase implements ISysSearchDocRuntime{
	
	private static final org.apache.commons.logging.Log log = org.apache.commons.logging.LogFactory.getLog(SysSearchDocRuntimeBase.class);
	
	private ISysSearchSchemeRuntimeContext iSysSearchSchemeRuntimeContext = null;
	private IPSSysSearchDoc iPSSysSearchDoc = null;
	private Map<String, IPSSysSearchField> psSysSearchFieldMap = new HashMap<String, IPSSysSearchField>();

	
	
	@Override
	public void init(ISysSearchSchemeRuntimeContext iSysSearchSchemeRuntimeContext, IPSSysSearchDoc iPSSysSearchDoc) throws Exception {
		this.iSysSearchSchemeRuntimeContext = iSysSearchSchemeRuntimeContext;
		this.iPSSysSearchDoc = iPSSysSearchDoc;
		this.onInit();
	}
	
	@Override
	protected void onInit() throws Exception {
		List<IPSSysSearchField> psSysSearchFieldList = this.getPSSysSearchDoc().getAllPSSysSearchFields();
		if(!ObjectUtils.isEmpty(psSysSearchFieldList)) {
			for(IPSSysSearchField iPSSysSearchField : psSysSearchFieldList) {
				psSysSearchFieldMap.put(iPSSysSearchField.getName().toUpperCase(), iPSSysSearchField);
			}
		}
		super.onInit();
	}
	
	
	
	protected ISysSearchSchemeRuntimeContext getSysSearchSchemeRuntimeContext() {
		return this.iSysSearchSchemeRuntimeContext;
	}
	
	@Override
	public IPSSysSearchDoc getPSSysSearchDoc() {
		return this.iPSSysSearchDoc;
	}
	
	@Override
	public IPSModelObject getPSModelObject() {
		return this.getPSSysSearchDoc();
	}

	@Override
	public String getId() {
		return this.getPSSysSearchDoc().getId();
	}

	@Override
	public String getName() {
		return this.getPSSysSearchDoc().getName();
	}


	@Override
	public ISysSearchSchemeRuntime getSysSearchSchemeRuntime() {
		return this.getSysSearchSchemeRuntimeContext().getSysSearchSchemeRuntime();
	}

	@Override
	public IPSSysSearchField getPSSysSearchField(String name, boolean tryMode) {
		IPSSysSearchField iPSSysSearchField = psSysSearchFieldMap.get(name.toUpperCase());
		if(iPSSysSearchField != null || tryMode) {
			return iPSSysSearchField;
		}
		throw new SysSearchSchemeRuntimeException(this.getSysSearchSchemeRuntime(), this, String.format("指定属性[%1$s]不存在", name));
	}
	
}
