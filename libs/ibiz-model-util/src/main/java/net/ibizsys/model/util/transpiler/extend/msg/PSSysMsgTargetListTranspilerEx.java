package net.ibizsys.model.util.transpiler.extend.msg;




public class PSSysMsgTargetListTranspilerEx extends net.ibizsys.model.util.transpiler.msg.PSSysMsgTargetListTranspiler{
	
	@Override
	protected String[] getModelFolders() {
		return new String[] {"PSSYSMODELGROUPS", "PSMODULES", "PSSYSMSGTARGETS"};
	}
}

