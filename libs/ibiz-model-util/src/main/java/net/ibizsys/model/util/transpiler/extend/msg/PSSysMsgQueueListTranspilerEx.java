package net.ibizsys.model.util.transpiler.extend.msg;




public class PSSysMsgQueueListTranspilerEx extends net.ibizsys.model.util.transpiler.msg.PSSysMsgQueueListTranspiler{
	
	@Override
	protected String[] getModelFolders() {
		return new String[] {"PSSYSMODELGROUPS", "PSMODULES", "PSSYSMSGQUEUES"};
	}
}