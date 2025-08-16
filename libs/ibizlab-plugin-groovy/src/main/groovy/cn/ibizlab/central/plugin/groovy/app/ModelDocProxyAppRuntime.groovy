package cn.ibizlab.central.plugin.groovy.app

class ModelDocProxyAppRuntime extends net.ibizsys.central.plugin.gateway.app.ProxyAppRuntimeBase{

	@Override
	protected void onInit() throws Exception {
		super.onInit();
		
		//this.setForwardHost("http://127.0.0.1:10002/web/ls/doc");
		this.setProxyUrl("https://start.spring.io");
		

	}
	
//	@Override
//	protected ResponseEntity<?> doProxy(ProxyExchange<byte[]> proxy, HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) {
//		// TODO Auto-generated method stub
//		return super.doProxy(proxy, httpServletRequest, httpServletResponse);
//	}
//	
	
}
