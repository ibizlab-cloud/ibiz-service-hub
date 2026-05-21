package net.ibizsys.central.cloud.core.util.freemarker;

import net.ibizsys.central.util.script.IScriptEntity;

public class TemplateEntity extends net.ibizsys.central.util.freemarker.TemplateEntity implements ITemplateEntity {

	public TemplateEntity(IScriptEntity iScriptEntity) {
		super(iScriptEntity);
	}

	
	@Override
	protected net.ibizsys.central.util.freemarker.ITemplateEntity createTemplateEntity(IScriptEntity iScriptEntity) {
		return new TemplateEntity(iScriptEntity);
	}
	
}
