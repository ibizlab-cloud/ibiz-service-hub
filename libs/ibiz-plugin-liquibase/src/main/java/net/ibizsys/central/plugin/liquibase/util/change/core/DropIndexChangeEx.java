package net.ibizsys.central.plugin.liquibase.util.change.core;

import liquibase.change.DatabaseChange;
import liquibase.change.core.DropIndexChange;
import liquibase.database.Database;
import liquibase.statement.SqlStatement;
import liquibase.statement.core.DropIndexStatement;

@DatabaseChange(name="dropIndex", description = "Drops an existing index", priority = 10, appliesTo = "index")
public class DropIndexChangeEx extends DropIndexChange {

	@Override
    public SqlStatement[] generateStatements(Database database) {
		
		DropIndexStatement dropIndexStatement = new	DropIndexStatement(getIndexName(), getCatalogName(), getSchemaName(), getTableName(), getAssociatedWith());
		dropIndexStatement.setContinueOnError(true);
        return new SqlStatement[] {
        		dropIndexStatement
        };
    }
}
