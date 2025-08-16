package net.ibizsys.model.util.transpiler.extend.msg;




public class PSSysMsgTemplListTranspilerEx extends net.ibizsys.model.util.transpiler.msg.PSSysMsgTemplListTranspiler{
	
	@Override
	protected String[] getModelFolders() {
		return new String[] {"PSSYSMODELGROUPS", "PSMODULES", "PSSYSMSGTEMPLS"};
	}
	
}