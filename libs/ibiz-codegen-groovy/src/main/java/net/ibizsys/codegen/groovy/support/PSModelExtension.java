package net.ibizsys.codegen.groovy.support;

import net.ibizsys.model.IPSModelObject;
import net.ibizsys.model.PSModelUtils;
import net.ibizsys.model.system.IPSSysModelGroup;
import net.ibizsys.model.system.IPSSystemModule;

public class PSModelExtension {

	public final static String MSG_WARN = "!!!PSMODEL_WARN:";
	
	public final static String MSG_ERROR = "!!!PSMODEL_ERROR:";
	
	public static String uniquetag(IPSModelObject iPSModelObject) {
		return PSModelUtils.calcUniqueTag(iPSModelObject.getCodeName());
	}

	public static String uniquetag(IPSModelObject iPSModelObject, IPSSystemModule iPSSystemModule) {
		return PSModelUtils.calcUniqueTag(iPSSystemModule, iPSModelObject.getCodeName());
	}
	
	public static String uniquetag(IPSModelObject iPSModelObject, IPSSysModelGroup iPSSysModelGroup) {
		return PSModelUtils.calcUniqueTag(iPSSysModelGroup, iPSModelObject.getCodeName());
	}
	
	
	
	
	
}
