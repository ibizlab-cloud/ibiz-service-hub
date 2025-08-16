package net.ibizsys.central.cloud.core.cloudutil.client;

import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import net.ibizsys.central.cloud.core.util.domain.V2DataSource;
import net.ibizsys.central.cloud.core.util.domain.V2DeploySystem;
import net.ibizsys.central.cloud.core.util.domain.V2ImportSchema;
import net.ibizsys.central.cloud.core.util.domain.V2InternalMessage;
import net.ibizsys.central.cloud.core.util.domain.V2ServiceHub;
import net.ibizsys.central.cloud.core.util.domain.V2System;
import net.ibizsys.central.cloud.core.util.domain.V2SystemExtensionBICube;
import net.ibizsys.central.cloud.core.util.domain.V2SystemExtensionField;
import net.ibizsys.central.cloud.core.util.domain.V2SystemExtensionForm;
import net.ibizsys.central.cloud.core.util.domain.V2SystemExtensionLogic;
import net.ibizsys.central.cloud.core.util.domain.V2SystemExtensionMainState;
import net.ibizsys.central.cloud.core.util.domain.V2SystemExtensionNotify;
import net.ibizsys.central.cloud.core.util.domain.V2SystemExtensionPortlet;
import net.ibizsys.central.cloud.core.util.domain.V2SystemExtensionSuite;
import net.ibizsys.central.cloud.core.util.domain.V2SystemExtensionWorkflow;
import net.ibizsys.central.cloud.core.util.domain.V2SystemExtensionWorkflowDefinition;
import net.ibizsys.central.cloud.core.util.domain.V2SystemMerge;
import net.ibizsys.central.cloud.core.util.domain.V2SystemSource;
import net.ibizsys.central.cloud.core.util.domain.V2SystemVersion;
import net.ibizsys.central.util.ISearchContext;

public interface ICloudExtensionClient {

	@RequestMapping(method = RequestMethod.POST, value = "/extension/core/internal_messages")
	V2InternalMessage createInternalMessage(@RequestBody V2InternalMessage v2InternalMessage);
	
	
	@RequestMapping(method = RequestMethod.PUT, value = "/extension/core/internal_messages/{key}")
	V2InternalMessage updateInternalMessage(@PathVariable("key") String key, @RequestBody V2InternalMessage v2InternalMessage);
	
	@RequestMapping(method = RequestMethod.GET, value = "/extension/core/internal_messages/{key}")
	V2InternalMessage getInternalMessage(@PathVariable("key") String key);
	
	
	@RequestMapping(method = RequestMethod.POST, value = "/extension/core/import_schemas")
	V2ImportSchema createImportSchema(@RequestBody V2ImportSchema v2ImportSchema);
	
//	@RequestMapping(method = RequestMethod.PUT, value = "/oss/object/{db}/{table}/{key}")
//	Integer updateObject(@PathVariable("db") String db, @PathVariable("table") String table, @PathVariable("key") String key, @RequestBody Map params);
//
//	@RequestMapping(method = RequestMethod.DELETE, value = "/oss/object/{db}/{table}/{key}")
//	Integer deleteObject(@PathVariable("db") String db, @PathVariable("table") String table, @PathVariable("key") String key);
	
	@RequestMapping(method = RequestMethod.GET, value = "/extension/core/import_schemas/{key}")
	V2ImportSchema getImportSchema(@PathVariable("key") String key);
	
//	@RequestMapping(method = RequestMethod.POST, value = "/oss/object/{db}/{table}/fetch")
//	Page<Map> fetchObjects(@PathVariable("db") String db, @PathVariable("table") String table, @RequestBody ISearchContext iSearchContext);
	
	
	
	@RequestMapping(method = RequestMethod.GET, value = "/extension/core/data_sources/{key}")
	V2DataSource getDataSource(@PathVariable("key") String key);
	
	@RequestMapping(method = RequestMethod.POST, value = "/extension/core/data_sources/fetch_default")
	Page<V2DataSource> fetchDataSources(@RequestBody ISearchContext iSearchContext);
	
	
	
	@RequestMapping(method = RequestMethod.GET, value = "/extension/core/service_hubs/{key}")
	V2ServiceHub getServiceHub(@PathVariable("key") String key);
	
	@RequestMapping(method = RequestMethod.POST, value = "/extension/core/service_hubs/fetch_default")
	Page<V2ServiceHub> fetchServiceHubs(@RequestBody ISearchContext iSearchContext);
	
	
	
	@RequestMapping(method = RequestMethod.GET, value = "/extension/core/systems/{key}")
	V2System getSystem(@PathVariable("key") String key);
	
	@RequestMapping(method = RequestMethod.POST, value = "/extension/core/systems")
	V2System createSystem(@RequestBody V2System v2System);
	
	@RequestMapping(method = RequestMethod.PUT, value = "/extension/core/systems/{key}")
	V2System updateSystem(@PathVariable("key") String key, @RequestBody V2System v2System);
	
	@RequestMapping(method = RequestMethod.POST, value = "/extension/core/systems/fetch_default")
	Page<V2System> fetchSystems(@RequestBody ISearchContext iSearchContext);
	
	
	
	
	@RequestMapping(method = RequestMethod.GET, value = "/extension/core/systems/{pkey}/system_sources/{key}")
	V2SystemSource getSystemSource(@PathVariable("pkey") String pkey, @PathVariable("key") String key);
	
	@RequestMapping(method = RequestMethod.POST, value = "/extension/core/systems/{pkey}/system_sources")
	V2SystemSource createSystemSource(@PathVariable("pkey") String pkey, @RequestBody V2SystemSource v2SystemSource);
	
	@RequestMapping(method = RequestMethod.PUT, value = "/extension/core/systems/{pkey}/system_sources/{key}")
	V2SystemSource updateSystemSource(@PathVariable("pkey") String pkey, @PathVariable("key") String key, @RequestBody V2SystemSource v2SystemSource);
	
	@RequestMapping(method = RequestMethod.POST, value = "/extension/core/systems/{pkey}/system_sources/fetch_default")
	Page<V2SystemSource> fetchSystemSources(@PathVariable("pkey") String pkey, @RequestBody ISearchContext iSearchContext);
	
	
	@RequestMapping(method = RequestMethod.GET, value = "/extension/core/systems/{pkey}/system_versions/{key}")
	V2SystemVersion getSystemVersion(@PathVariable("pkey") String pkey, @PathVariable("key") String key);
	
	

	@RequestMapping(method = RequestMethod.DELETE, value = "/extension/core/systems/{pkey}/system_versions/{key}")
	void removeSystemVersion(@PathVariable("pkey") String pkey, @PathVariable("key") String key);
	
	
	@RequestMapping(method = RequestMethod.POST, value = "/extension/core/systems/{pkey}/system_versions")
	V2SystemVersion createSystemVersion(@PathVariable("pkey") String pkey, @RequestBody V2SystemVersion v2SystemVersion);
	
	@RequestMapping(method = RequestMethod.PUT, value = "/extension/core/systems/{pkey}/system_versions/{key}")
	V2SystemVersion updateSystemVersion(@PathVariable("pkey") String pkey, @PathVariable("key") String key, @RequestBody V2SystemVersion v2SystemVersion);
	
	@RequestMapping(method = RequestMethod.POST, value = "/extension/core/systems/{pkey}/system_versions/fetch_default")
	Page<V2SystemVersion> fetchSystemVersions(@PathVariable("pkey") String pkey, @RequestBody ISearchContext iSearchContext);
	

	@RequestMapping(method = RequestMethod.POST, value = "/extension/core/systems/{pkey}/system_merges")
	V2SystemMerge createSystemMerge(@PathVariable("pkey") String pkey, @RequestBody V2SystemMerge v2SystemMerge);
	
	@RequestMapping(method = RequestMethod.PUT, value = "/extension/core/systems/{pkey}/system_merges/{key}")
	V2SystemMerge updateSystemMerge(@PathVariable("pkey") String pkey, @PathVariable("key") String key, @RequestBody V2SystemMerge v2SystemMerge);
	
	@RequestMapping(method = RequestMethod.GET, value = "/extension/core/systems/{pkey}/system_merges/{key}")
	V2SystemMerge getSystemMerge(@PathVariable("pkey") String pkey, @PathVariable("key") String key);
	
	@RequestMapping(method = RequestMethod.DELETE, value = "/extension/core/systems/{pkey}/system_merges/{key}")
	void removeSystemMerge(@PathVariable("pkey") String pkey, @PathVariable("key") String key);
	
	
	@RequestMapping(method = RequestMethod.POST, value = "/extension/core/systems/{pkey}/system_merges/fetch_default")
	Page<V2SystemMerge> fetchSystemMerges(@PathVariable("pkey") String pkey, @RequestBody ISearchContext iSearchContext);
	
	
	
	@RequestMapping(method = RequestMethod.GET, value = "/extension/core/deploy_systems/{key}")
	V2DeploySystem getDeploySystem(@PathVariable("key") String key);
	
	@RequestMapping(method = RequestMethod.POST, value = "/extension/core/deploy_systems")
	V2DeploySystem createDeploySystem(@RequestBody V2DeploySystem v2DeploySystem);
	
	@RequestMapping(method = RequestMethod.PUT, value = "/extension/core/deploy_systems/{key}")
	V2DeploySystem updateDeploySystem(@PathVariable("key") String key, @RequestBody V2DeploySystem v2DeploySystem);
	
	
	@RequestMapping(method = RequestMethod.POST, value = "/extension/core/deploy_systems/fetch_default")
	Page<V2DeploySystem> fetchDeploySystems(@RequestBody ISearchContext iSearchContext);
	

	@RequestMapping(method = RequestMethod.POST, value = "/extension/core/system_extensions")
	V2SystemExtensionSuite createSystemExtension(@RequestBody V2SystemExtensionSuite v2SystemExtensionSuite);

	@RequestMapping(method = RequestMethod.GET, value = "/extension/core/system_extension_suites/{key}")
	V2SystemExtensionSuite getSystemExtensionSuite(@PathVariable("key") String key);
	
	
	@RequestMapping(method = RequestMethod.POST, value = "/extension/core/system_extensions/{pkey}/system_extension_workflows")
	V2SystemExtensionWorkflow createSystemExtensionWorkflow(@PathVariable("pkey") String pkey, @RequestBody V2SystemExtensionWorkflow v2SystemExtensionWorkflow);
	
	@RequestMapping(method = RequestMethod.PUT, value = "/extension/core/system_extensions/{pkey}/system_extension_workflows/{key}")
	V2SystemExtensionWorkflow updateSystemExtensionWorkflow(@PathVariable("pkey") String pkey, @PathVariable("key") String key, @RequestBody V2SystemExtensionWorkflow v2SystemExtensionWorkflow);
	
	@RequestMapping(method = RequestMethod.POST, value = "/extension/core/system_extensions/{pkey}/system_extension_workflows/fetch_default")
	Page<V2SystemExtensionWorkflow> fetchSystemExtensionWorkflows(@PathVariable("pkey") String pkey, @RequestBody ISearchContext iSearchContext);
	
	@RequestMapping(method = RequestMethod.GET, value = "/extension/core/system_extensions/{pkey}/system_extension_fields/{key}")
	V2SystemExtensionField getSystemExtensionField(@PathVariable("pkey") String pkey, @PathVariable("key") String key);
	
	@RequestMapping(method = RequestMethod.POST, value = "/extension/core/system_extensions/{pkey}/system_extension_fields")
	V2SystemExtensionField createSystemExtensionField(@PathVariable("pkey") String pkey, @RequestBody V2SystemExtensionField v2SystemExtensionField);
	
	@RequestMapping(method = RequestMethod.PUT, value = "/extension/core/system_extensions/{pkey}/system_extension_fields/{key}")
	V2SystemExtensionField updateSystemExtensionField(@PathVariable("pkey") String pkey, @PathVariable("key") String key, @RequestBody V2SystemExtensionField v2SystemExtensionField);
	
	@RequestMapping(method = RequestMethod.DELETE, value = "/extension/core/system_extensions/{pkey}/system_extension_fields/{key}")
	void removeSystemExtensionField(@PathVariable("pkey") String pkey, @PathVariable("key") String key);
	
	@RequestMapping(method = RequestMethod.POST, value = "/extension/core/system_extensions/{pkey}/system_extension_fields/fetch_default")
	Page<V2SystemExtensionField> fetchSystemExtensionFields(@PathVariable("pkey") String pkey, @RequestBody ISearchContext iSearchContext);
	
	@RequestMapping(method = RequestMethod.GET, value = "/extension/core/system_extensions/{pkey}/system_extension_forms/{key}")
	V2SystemExtensionForm getSystemExtensionForm(@PathVariable("pkey") String pkey, @PathVariable("key") String key);
	
	@RequestMapping(method = RequestMethod.POST, value = "/extension/core/system_extensions/{pkey}/system_extension_forms")
	V2SystemExtensionForm createSystemExtensionForm(@PathVariable("pkey") String pkey, @RequestBody V2SystemExtensionForm v2SystemExtensionForm);
	
	@RequestMapping(method = RequestMethod.PUT, value = "/extension/core/system_extensions/{pkey}/system_extension_forms/{key}")
	V2SystemExtensionForm updateSystemExtensionForm(@PathVariable("pkey") String pkey, @PathVariable("key") String key, @RequestBody V2SystemExtensionForm v2SystemExtensionForm);
	
	@RequestMapping(method = RequestMethod.DELETE, value = "/extension/core/system_extensions/{pkey}/system_extension_forms/{key}")
	void removeSystemExtensionForm(@PathVariable("pkey") String pkey, @PathVariable("key") String key);
	
	@RequestMapping(method = RequestMethod.POST, value = "/extension/core/system_extensions/{pkey}/system_extension_forms/fetch_default")
	Page<V2SystemExtensionForm> fetchSystemExtensionForms(@PathVariable("pkey") String pkey, @RequestBody ISearchContext iSearchContext);
	
	@RequestMapping(method = RequestMethod.GET, value = "/extension/core/system_extensions/{pkey}/system_extension_workflow_definitions/{key}")
	V2SystemExtensionWorkflowDefinition getSystemExtensionWorkflowDefinition(@PathVariable("pkey") String pkey, @PathVariable("key") String key);
	
	@RequestMapping(method = RequestMethod.POST, value = "/extension/core/system_extensions/{pkey}/system_extension_workflow_definitions")
	V2SystemExtensionWorkflowDefinition createSystemExtensionWorkflowDefinition(@PathVariable("pkey") String pkey, @RequestBody V2SystemExtensionWorkflowDefinition v2SystemExtensionWorkflowDefinition);
	
	@RequestMapping(method = RequestMethod.PUT, value = "/extension/core/system_extensions/{pkey}/system_extension_workflow_definitions/{key}")
	V2SystemExtensionWorkflowDefinition updateSystemExtensionWorkflowDefinition(@PathVariable("pkey") String pkey, @PathVariable("key") String key, @RequestBody V2SystemExtensionWorkflowDefinition v2SystemExtensionWorkflowDefinition);
	
	@RequestMapping(method = RequestMethod.DELETE, value = "/extension/core/system_extensions/{pkey}/system_extension_workflow_definitions/{key}")
	void removeSystemExtensionWorkflowDefinition(@PathVariable("pkey") String pkey, @PathVariable("key") String key);
	
	
	@RequestMapping(method = RequestMethod.POST, value = "/extension/core/system_extensions/{pkey}/system_extension_workflow_definitions/fetch_default")
	Page<V2SystemExtensionWorkflowDefinition> fetchSystemExtensionWorkflowDefinitions(@PathVariable("pkey") String pkey, @RequestBody ISearchContext iSearchContext);
	
	
	
	
	@RequestMapping(method = RequestMethod.GET, value = "/extension/core/system_extensions/{pkey}/system_extension_main_states/{key}")
	V2SystemExtensionMainState getSystemExtensionMainState(@PathVariable("pkey") String pkey, @PathVariable("key") String key);
	
	@RequestMapping(method = RequestMethod.POST, value = "/extension/core/system_extensions/{pkey}/system_extension_main_states")
	V2SystemExtensionMainState createSystemExtensionMainState(@PathVariable("pkey") String pkey, @RequestBody V2SystemExtensionMainState v2SystemExtensionMainState);
	
	@RequestMapping(method = RequestMethod.PUT, value = "/extension/core/system_extensions/{pkey}/system_extension_main_states/{key}")
	V2SystemExtensionMainState updateSystemExtensionMainState(@PathVariable("pkey") String pkey, @PathVariable("key") String key, @RequestBody V2SystemExtensionMainState v2SystemExtensionMainState);
	
	@RequestMapping(method = RequestMethod.DELETE, value = "/extension/core/system_extensions/{pkey}/system_extension_main_states/{key}")
	void removeSystemExtensionMainState(@PathVariable("pkey") String pkey, @PathVariable("key") String key);
	
	@RequestMapping(method = RequestMethod.POST, value = "/extension/core/system_extensions/{pkey}/system_extension_main_states/fetch_default")
	Page<V2SystemExtensionMainState> fetchSystemExtensionMainStates(@PathVariable("pkey") String pkey, @RequestBody ISearchContext iSearchContext);
	
	
	@RequestMapping(method = RequestMethod.GET, value = "/extension/core/system_extensions/{pkey}/system_extension_logics/{key}")
	V2SystemExtensionLogic getSystemExtensionLogic(@PathVariable("pkey") String pkey, @PathVariable("key") String key);
	
	@RequestMapping(method = RequestMethod.POST, value = "/extension/core/system_extensions/{pkey}/system_extension_logics")
	V2SystemExtensionLogic createSystemExtensionLogic(@PathVariable("pkey") String pkey, @RequestBody V2SystemExtensionLogic v2SystemExtensionLogic);
	
	@RequestMapping(method = RequestMethod.PUT, value = "/extension/core/system_extensions/{pkey}/system_extension_logics/{key}")
	V2SystemExtensionLogic updateSystemExtensionLogic(@PathVariable("pkey") String pkey, @PathVariable("key") String key, @RequestBody V2SystemExtensionLogic v2SystemExtensionLogic);
	
	@RequestMapping(method = RequestMethod.DELETE, value = "/extension/core/system_extensions/{pkey}/system_extension_logics/{key}")
	void removeSystemExtensionLogic(@PathVariable("pkey") String pkey, @PathVariable("key") String key);
	
	@RequestMapping(method = RequestMethod.POST, value = "/extension/core/system_extensions/{pkey}/system_extension_logics/fetch_default")
	Page<V2SystemExtensionLogic> fetchSystemExtensionLogics(@PathVariable("pkey") String pkey, @RequestBody ISearchContext iSearchContext);
	
	
	@RequestMapping(method = RequestMethod.GET, value = "/extension/core/system_extensions/{pkey}/system_extension_notifies/{key}")
	V2SystemExtensionNotify getSystemExtensionNotify(@PathVariable("pkey") String pkey, @PathVariable("key") String key);
	
	@RequestMapping(method = RequestMethod.POST, value = "/extension/core/system_extensions/{pkey}/system_extension_notifies")
	V2SystemExtensionNotify createSystemExtensionNotify(@PathVariable("pkey") String pkey, @RequestBody V2SystemExtensionNotify v2SystemExtensionNotify);
	
	@RequestMapping(method = RequestMethod.PUT, value = "/extension/core/system_extensions/{pkey}/system_extension_notifies/{key}")
	V2SystemExtensionNotify updateSystemExtensionNotify(@PathVariable("pkey") String pkey, @PathVariable("key") String key, @RequestBody V2SystemExtensionNotify v2SystemExtensionNotify);
	
	@RequestMapping(method = RequestMethod.DELETE, value = "/extension/core/system_extensions/{pkey}/system_extension_notifies/{key}")
	void removeSystemExtensionNotify(@PathVariable("pkey") String pkey, @PathVariable("key") String key);
	
	@RequestMapping(method = RequestMethod.POST, value = "/extension/core/system_extensions/{pkey}/system_extension_notifies/fetch_default")
	Page<V2SystemExtensionNotify> fetchSystemExtensionNotifies(@PathVariable("pkey") String pkey, @RequestBody ISearchContext iSearchContext);
	
	
	@RequestMapping(method = RequestMethod.GET, value = "/extension/core/system_extensions/{pkey}/system_extension_bi_cubes/{key}")
	V2SystemExtensionBICube getSystemExtensionBICube(@PathVariable("pkey") String pkey, @PathVariable("key") String key);
	
	@RequestMapping(method = RequestMethod.POST, value = "/extension/core/system_extensions/{pkey}/system_extension_bi_cubes")
	V2SystemExtensionBICube createSystemExtensionBICube(@PathVariable("pkey") String pkey, @RequestBody V2SystemExtensionBICube v2SystemExtensionBICube);
	
	@RequestMapping(method = RequestMethod.PUT, value = "/extension/core/system_extensions/{pkey}/system_extension_bi_cubes/{key}")
	V2SystemExtensionBICube updateSystemExtensionBICube(@PathVariable("pkey") String pkey, @PathVariable("key") String key, @RequestBody V2SystemExtensionBICube v2SystemExtensionBICube);
	
	@RequestMapping(method = RequestMethod.DELETE, value = "/extension/core/system_extensions/{pkey}/system_extension_bi_cubes/{key}")
	void removeSystemExtensionBICube(@PathVariable("pkey") String pkey, @PathVariable("key") String key);
	
	@RequestMapping(method = RequestMethod.POST, value = "/extension/core/system_extensions/{pkey}/system_extension_bi_cubes/fetch_default")
	Page<V2SystemExtensionBICube> fetchSystemExtensionBICubes(@PathVariable("pkey") String pkey, @RequestBody ISearchContext iSearchContext);
	
	@RequestMapping(method = RequestMethod.GET, value = "/extension/core/system_extensions/{pkey}/system_extension_portlets/{key}")
	V2SystemExtensionPortlet getSystemExtensionPortlet(@PathVariable("pkey") String pkey, @PathVariable("key") String key);
	
	@RequestMapping(method = RequestMethod.POST, value = "/extension/core/system_extensions/{pkey}/system_extension_portlets")
	V2SystemExtensionPortlet createSystemExtensionPortlet(@PathVariable("pkey") String pkey, @RequestBody V2SystemExtensionPortlet v2SystemExtensionPortlet);
	
	@RequestMapping(method = RequestMethod.PUT, value = "/extension/core/system_extensions/{pkey}/system_extension_portlets/{key}")
	V2SystemExtensionPortlet updateSystemExtensionPortlet(@PathVariable("pkey") String pkey, @PathVariable("key") String key, @RequestBody V2SystemExtensionPortlet v2SystemExtensionPortlet);
	
	@RequestMapping(method = RequestMethod.DELETE, value = "/extension/core/system_extensions/{pkey}/system_extension_portlets/{key}")
	void removeSystemExtensionPortlet(@PathVariable("pkey") String pkey, @PathVariable("key") String key);
	
	@RequestMapping(method = RequestMethod.POST, value = "/extension/core/system_extensions/{pkey}/system_extension_portlets/fetch_default")
	Page<V2SystemExtensionPortlet> fetchSystemExtensionPortlets(@PathVariable("pkey") String pkey, @RequestBody ISearchContext iSearchContext);
}
