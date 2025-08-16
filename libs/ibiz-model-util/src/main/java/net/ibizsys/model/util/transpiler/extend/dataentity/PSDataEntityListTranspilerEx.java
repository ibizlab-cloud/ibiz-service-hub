package net.ibizsys.model.util.transpiler.extend.dataentity;




public class PSDataEntityListTranspilerEx extends net.ibizsys.model.util.transpiler.dataentity.PSDataEntityListTranspiler{
	
	@Override
	protected String[] getModelFolders() {
		return new String[] {"PSSYSMODELGROUPS", "PSMODULES", "PSDATAENTITIES"};
	}
}