package cn.ibizlab.central.plugin.groovy.app

import groovy.util.logging.Slf4j
import net.ibizsys.central.cloud.core.app.GroovyServletAppRuntime

@Slf4j
class ModelDocServletAppRuntime extends GroovyServletAppRuntime {
	
	
	@Override
	protected void prepareResourceRoot() throws Exception {
		this.setEnableTemplateCache(false);
		if(!this.isEnableTemplateCache()) {
			this.setResourceRoot("H:/R8/ibiz-plugin/ibizlab-plugin-groovy/src/main/resources/modeldocapp/tpl");
			this.setFromClassPathResource(false);
		}
		else {
			this.setResourceRoot("modeldocapp/tpl");
			this.setFromClassPathResource(true);
		}
	}
	
	
	@Override
	protected void prepareTemplates() throws Exception {
	
		super.prepareTemplates();
		
		this.registerTemplate("README.md", "README.md.tpl");
		this.registerTemplate("psmodules/{moduleid}.md", "PSMODULE.md.tpl");
		this.registerTemplate("psmodules/{moduleid}/psdataentities/{dataentityid}.md", "PSDATAENTITY.md.tpl");
	}
}
