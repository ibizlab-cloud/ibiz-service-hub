package net.ibizsys.model.util.transpiler.extend.wf;




public class PSWFRoleListTranspilerEx extends net.ibizsys.model.util.transpiler.wf.PSWFRoleListTranspiler{
	
	@Override
	protected String[] getModelFolders() {
		return getSystemModelFolder("PSWFROLES");
	}
	
}