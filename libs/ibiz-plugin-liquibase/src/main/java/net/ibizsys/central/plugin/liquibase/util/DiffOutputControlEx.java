package net.ibizsys.central.plugin.liquibase.util;

import liquibase.database.Database;
import liquibase.diff.compare.CompareControl.SchemaComparison;
import liquibase.diff.output.DiffOutputControl;
import liquibase.structure.DatabaseObject;
import liquibase.structure.core.Column;

/**
 * 差异输出控制
 * @author lionlau
 *
 */
public class DiffOutputControlEx extends DiffOutputControl {

	private static final org.apache.commons.logging.Log log = org.apache.commons.logging.LogFactory.getLog(DiffOutputControlEx.class);
	
	public DiffOutputControlEx(boolean includeCatalog, boolean includeSchema, boolean includeTablespace, SchemaComparison[] schemaComparisons) {
		super(includeCatalog, includeSchema, includeTablespace, schemaComparisons);

	}

	@Override
	public boolean alreadyHandledUnexpected(DatabaseObject unexpectedObject, Database accordingTo) {
//		if(unexpectedObject instanceof ForeignKey) {
//			return super.alreadyHandledUnexpected(unexpectedObject, accordingTo);
//		}
		
		
		return true;
	}
	
	@Override
	public boolean alreadyHandledMissing(DatabaseObject missingObject, Database accordingTo) {
		if(missingObject instanceof Column) {
			Column column = (Column)missingObject;
		}
		
		log.debug(String.format("Missing %1$s", missingObject));
		
		// TODO Auto-generated method stub
		return super.alreadyHandledMissing(missingObject, accordingTo);
	}
	
	@Override
	public boolean alreadyHandledChanged(DatabaseObject changedObject, Database accordingTo) {
		
		if(changedObject instanceof Column) {
			Column column = (Column)changedObject;
		}
		
		// TODO Auto-generated method stub
		return super.alreadyHandledChanged(changedObject, accordingTo);
	}
}
