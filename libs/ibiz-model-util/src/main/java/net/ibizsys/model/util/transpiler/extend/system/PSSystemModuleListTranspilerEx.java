package net.ibizsys.model.util.transpiler.extend.system;




public class PSSystemModuleListTranspilerEx extends net.ibizsys.model.util.transpiler.system.PSSystemModuleListTranspiler{
	
	@Override
	protected String[] getModelFolders() {
		return getSysModelGroupModelFolder("PSMODULES");
	}
	
}