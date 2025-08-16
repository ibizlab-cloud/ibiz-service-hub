package net.ibizsys.model.util.transpiler.extend.wf;




public class PSWorkflowListTranspilerEx extends net.ibizsys.model.util.transpiler.wf.PSWorkflowListTranspiler{
	
	@Override
	protected String[] getModelFolders() {
		return getSystemModelFolder("PSWORKFLOWS");
	}
}