package net.ibizsys.central.plugin.liquibase.util.change.core;

import liquibase.change.AddColumnConfig;
import liquibase.change.DatabaseChange;
import liquibase.change.core.CreateIndexChange;
import liquibase.database.Database;
import liquibase.statement.SqlStatement;
import liquibase.statement.core.CreateIndexStatement;

@DatabaseChange(name="createIndex", description = "Creates an index on an existing column or set of columns.", priority = 10, appliesTo = "index")
public class CreateIndexChangeEx extends CreateIndexChange {

	@Override
    public SqlStatement[] generateStatements(Database database) {
		
		CreateIndexStatement createIndexStatement =  new CreateIndexStatement(
                getIndexName(),
                getCatalogName(),
                getSchemaName(),
                getTableName(),
                this.isUnique(),
                getAssociatedWith(),
                getColumns().toArray(new AddColumnConfig[getColumns().size()]))
                .setTablespace(getTablespace())
                .setClustered(getClustered());
               
		createIndexStatement.setContinueOnError(true);
        return new SqlStatement[] {
        		createIndexStatement
        };
    }
	
}
