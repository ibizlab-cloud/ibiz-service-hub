package cn.ibizlab.central.plugin.groovy.dataentity

import net.ibizsys.central.cloud.core.util.annotation.DataEntityRTAddin
import net.ibizsys.central.plugin.groovy.dataentity.GroovyDataEntityRTAddinBase
import net.ibizsys.central.util.IEntityDTO
import net.ibizsys.central.util.annotation.DEAction
import net.ibizsys.central.util.annotation.DEActionLogic


@DataEntityRTAddin("SysDevStudio.PSSYSMODELFOLDER")
class SimpleDataEntityRTAddin extends GroovyDataEntityRTAddinBase{
	
	@Override
	protected void onInit() throws Exception {
		// TODO Auto-generated method stub
		super.onInit();

		System.out.println("init");
		
		//this.getDataEntityRuntimeContext().getDataEntityRuntime().getPSDataEntity().getAllPSDEACModes()
		
	}
	
	@DEAction("UPDATE")
	protected void update(IEntityDTO iEntityDTO) {
		System.out.println("update");
	}
	
	
	@DEActionLogic(name="UPDATE", mode="BEFORE")
	protected void onBeforeUpdate(IEntityDTO iEntityDTO) {
		
	}
	
	
}
