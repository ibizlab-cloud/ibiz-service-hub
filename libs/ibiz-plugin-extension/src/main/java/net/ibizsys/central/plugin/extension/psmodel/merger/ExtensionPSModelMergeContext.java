package net.ibizsys.central.plugin.extension.psmodel.merger;

import java.util.HashMap;
import java.util.Map;

import net.ibizsys.model.PSSystemImpl;
import net.ibizsys.model.app.IPSApplication;
import net.ibizsys.model.util.merger.PSModelMergeContext;

public class ExtensionPSModelMergeContext extends PSModelMergeContext implements IExtensionPSModelMergeContext {

	private final static Map<String, Boolean> psModelMergeChildMap = new HashMap<String, Boolean>();
	
	
	static {
		psModelMergeChildMap.put(IPSApplication.class.getSimpleName(), false);
		psModelMergeChildMap.put(String.format("%1$s.%2$s", PSSystemImpl.class.getSimpleName(), PSSystemImpl.ATTR_GETALLPSAPPS), false);
	}


	@Override
	public Boolean isEnableMergeChild(Class<?> cls) {
		Boolean ret = psModelMergeChildMap.get(cls.getSimpleName());
		if(ret!=null) {
			return ret;
		}
		return super.isEnableMergeChild(cls);
	}
	
	@Override
	public Boolean isEnableMergeChild(Class<?> cls, String strFieldName) {
		String tag = String.format("%1$s.%2$s", PSSystemImpl.class.getSimpleName(), strFieldName);
		Boolean ret = psModelMergeChildMap.get(tag);
		if(ret!=null) {
			return ret;
		}
		return super.isEnableMergeChild(cls, strFieldName);
	}
}
