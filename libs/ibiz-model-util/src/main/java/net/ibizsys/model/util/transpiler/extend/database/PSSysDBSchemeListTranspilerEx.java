package net.ibizsys.model.util.transpiler.extend.database;




public class PSSysDBSchemeListTranspilerEx extends net.ibizsys.model.util.transpiler.database.PSSysDBSchemeListTranspiler{
	protected String[] getModelFolders() {
		return getSysModelGroupModelFolder("PSSYSDBSCHEMES");
	}
}