package net.ibizsys.central.plugin.neo4j.dataentity.report;

import java.io.OutputStream;

import net.ibizsys.central.plugin.antvg6.dataentity.report.AntVG6DEReportRuntimeBase;
import net.ibizsys.runtime.util.ISearchContextBase;

public class Neo4jAntVG6DEReportRuntime extends AntVG6DEReportRuntimeBase {

	
	private static final org.apache.commons.logging.Log log = org.apache.commons.logging.LogFactory.getLog(Neo4jAntVG6DEReportRuntime.class);
	
	@Override
	protected void onOutput(OutputStream outputStream, Object data, ISearchContextBase iSearchContextBase, String strType) throws Throwable {
		// TODO Auto-generated method stub
		super.onOutput(outputStream, data, iSearchContextBase, strType);
	}
}
