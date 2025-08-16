package net.ibizsys.model.testing;



public class PSSysTestCase2Impl extends net.ibizsys.model.testing.PSSysTestCaseImpl implements net.ibizsys.model.testing.IPSDESAMethodTestCase
		,net.ibizsys.model.testing.IPSAppViewTestCase{

	public final static String ATTR_GETPSAPPVIEW = "getPSAppView";
	public final static String ATTR_GETPSDESERVICEAPI = "getPSDEServiceAPI";
	public final static String ATTR_GETPSDESERVICEAPIMETHOD = "getPSDEServiceAPIMethod";
	public final static String ATTR_GETPSSYSTESTMODULE = "getPSSysTestModule";
	public final static String ATTR_GETPSSYSTESTPRJ = "getPSSysTestPrj";
	private net.ibizsys.model.app.view.IPSAppView psappview;

	public net.ibizsys.model.app.view.IPSAppView getPSAppView(){
		if(this.psappview != null) return this.psappview;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPSAPPVIEW);
		if(value == null){
			return null;
		}
		this.psappview = this.getPSSysTestPrjMust().getPSApplicationMust().getPSAppView(value, false);
		return this.psappview;
	}

	public net.ibizsys.model.app.view.IPSAppView getPSAppViewMust(){
		net.ibizsys.model.app.view.IPSAppView value = this.getPSAppView();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定应用视图");}
		return value;
	}

	private net.ibizsys.model.dataentity.service.IPSDEServiceAPI psdeserviceapi;

	public net.ibizsys.model.dataentity.service.IPSDEServiceAPI getPSDEServiceAPI(){
		if(this.psdeserviceapi != null) return this.psdeserviceapi;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPSDESERVICEAPI);
		if(value == null){
			return null;
		}
		this.psdeserviceapi = this.getPSSysTestPrjMust().getPSSysServiceAPIMust().getPSDEServiceAPI(value, false);
		return this.psdeserviceapi;
	}

	public net.ibizsys.model.dataentity.service.IPSDEServiceAPI getPSDEServiceAPIMust(){
		net.ibizsys.model.dataentity.service.IPSDEServiceAPI value = this.getPSDEServiceAPI();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定实体服务接口");}
		return value;
	}

	private net.ibizsys.model.dataentity.service.IPSDEServiceAPIMethod psdeserviceapimethod;

	public net.ibizsys.model.dataentity.service.IPSDEServiceAPIMethod getPSDEServiceAPIMethod(){
		if(this.psdeserviceapimethod != null) return this.psdeserviceapimethod;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPSDESERVICEAPIMETHOD);
		if(value == null){
			return null;
		}
		this.psdeserviceapimethod = this.getPSDEServiceAPIMust().getPSDEServiceAPIMethod(value, false);
		return this.psdeserviceapimethod;
	}

	public net.ibizsys.model.dataentity.service.IPSDEServiceAPIMethod getPSDEServiceAPIMethodMust(){
		net.ibizsys.model.dataentity.service.IPSDEServiceAPIMethod value = this.getPSDEServiceAPIMethod();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定实体服务接口方法");}
		return value;
	}

	private net.ibizsys.model.testing.IPSSysTestModule pssystestmodule;

	public net.ibizsys.model.testing.IPSSysTestModule getPSSysTestModule(){
		if(this.pssystestmodule != null) return this.pssystestmodule;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPSSYSTESTMODULE);
		if(value == null){
			return null;
		}
		this.pssystestmodule = this.getPSSysTestPrjMust().getPSSysTestModule(value, false);
		return this.pssystestmodule;
	}

	public net.ibizsys.model.testing.IPSSysTestModule getPSSysTestModuleMust(){
		net.ibizsys.model.testing.IPSSysTestModule value = this.getPSSysTestModule();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定测试模块");}
		return value;
	}

	private net.ibizsys.model.testing.IPSSysTestPrj pssystestprj;

	public net.ibizsys.model.testing.IPSSysTestPrj getPSSysTestPrj(){
		if(this.pssystestprj != null) return this.pssystestprj;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPSSYSTESTPRJ);
		if(value == null){
			return null;
		}
		this.pssystestprj = getPSModelObject(net.ibizsys.model.testing.IPSSysTestPrj.class, (com.fasterxml.jackson.databind.node.ObjectNode)value, ATTR_GETPSSYSTESTPRJ);
		return this.pssystestprj;
	}

	public net.ibizsys.model.testing.IPSSysTestPrj getPSSysTestPrjMust(){
		net.ibizsys.model.testing.IPSSysTestPrj value = this.getPSSysTestPrj();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定测试项目");}
		return value;
	}

}