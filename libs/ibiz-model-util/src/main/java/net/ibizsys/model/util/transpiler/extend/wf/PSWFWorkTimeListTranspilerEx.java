package net.ibizsys.model.util.transpiler.extend.wf;




public class PSWFWorkTimeListTranspilerEx extends net.ibizsys.model.util.transpiler.wf.PSWFWorkTimeListTranspiler{
	@Override
	protected String[] getModelFolders() {
		return getSystemModelFolder("PSWFWORKTIMES");
	}
}