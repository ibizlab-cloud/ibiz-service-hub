package net.ibizsys.central.cloud.dataflow.spark.addin;

import net.ibizsys.central.cloud.dataflow.core.addin.IDataFlowAccessAgent;

public interface ISparkDataFlowAccessAgent extends IDataFlowAccessAgent {


	/**
	 * spark home
	 */
	public final static String PARAM_SPARK_HOME = "home";

	/**
	 * 集群
	 */
	public final static String PARAM_SPARK_MASTER = "master";

	/**
	 * jar包地址
	 */
	public final static String PARAM_SPARK_APPRESOURCE = "appresource";

	/**
	 * mainClass
	 */
	public final static String PARAM_SPARK_MAINCLASS = "mainclass";
	/**
	 * K8s参数
	 */
	public final static String PARAM_K8SPARAMS = "k8sparams";
}
