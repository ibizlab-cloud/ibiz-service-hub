package net.ibizsys.central.cloud.dataflow.spark.addin;

import net.ibizsys.central.cloud.core.util.domain.DataFlowAccess;
import net.ibizsys.central.cloud.dataflow.core.addin.DataFlowPlatformBase;
import net.ibizsys.central.cloud.dataflow.core.addin.IDataFlowAccessAgent;

public class SparkDataFlowPlatform extends DataFlowPlatformBase {

	
	
	@Override
	public IDataFlowAccessAgent createDataFlowAccessAgent(DataFlowAccess dataFlowAccess) {
		return this.getSystemRuntime().createObject(IDataFlowAccessAgent.class, SparkDataFlowAccessAgent.class);
	}

}
