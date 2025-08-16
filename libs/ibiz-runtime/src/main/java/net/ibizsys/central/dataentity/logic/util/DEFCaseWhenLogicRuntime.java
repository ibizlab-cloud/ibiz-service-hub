package net.ibizsys.central.dataentity.logic.util;

import java.util.ArrayList;
import java.util.List;

import org.springframework.util.Assert;

import net.ibizsys.model.IPSModelObject;
import net.ibizsys.model.dataentity.logic.IPSDEFLogic;
import net.ibizsys.model.dataentity.logic.IPSDELogicLink;
import net.ibizsys.runtime.ModelRuntimeBase;

public class DEFCaseWhenLogicRuntime extends ModelRuntimeBase implements IDEFCaseWhenLogicRuntime{

	private IPSDEFLogic iPSDEFLogic = null;
	private IDEFCaseWhenLogicNodeRuntime defaultDEFCaseWhenLogicNodeRuntime = null;
	private List<IDEFCaseWhenLogicNodeRuntime> defCaseWhenLogicNodeRuntimeList = new ArrayList<IDEFCaseWhenLogicNodeRuntime>();
	
	public static IDEFCaseWhenLogicRuntime getInstance(IPSDEFLogic iPSDEFLogic) throws Exception{
		DEFCaseWhenLogicRuntime defCaseWhenLogicRuntime = new DEFCaseWhenLogicRuntime();
		defCaseWhenLogicRuntime.init(iPSDEFLogic);
		return defCaseWhenLogicRuntime;
	}
	
	public void init(IPSDEFLogic iPSDEFLogic)throws Exception{
		Assert.notNull(iPSDEFLogic, "传入实体属性逻辑模型无效");
		this.setPSDEFLogic(iPSDEFLogic);
		this.onInit();
	}
	
	public IPSDEFLogic getPSDEFLogic() {
		return this.iPSDEFLogic;
	}
	
	protected void setPSDEFLogic(IPSDEFLogic iPSDEFLogic) {
		this.iPSDEFLogic = iPSDEFLogic;
	}
	
	@Override
	public IPSModelObject getPSModelObject() {
		return this.getPSDEFLogic();
	}

	
	@Override
	protected void onInit() throws Exception {
		//循环链路 
		
		List<IPSDELogicLink> psDELogicLinks = getPSDEFLogic().getStartPSDELogicNodeMust().getPSDELogicLinks();
		if(psDELogicLinks != null) {
			//获取默认连接
			IPSDELogicLink defaultPSDELogicLink = null;
			for(IPSDELogicLink item : psDELogicLinks) {
				if(item.isDefaultLink()) {
					defaultPSDELogicLink = item;
					continue;
				}
				
				if(item.getPSDELogicLinkGroupCond() == null) {
					continue;
				}
				
				DEFCaseWhenLogicNodeRuntime defCaseWhenLogicNodeRuntime = createDEFCaseWhenLogicNodeRuntime();
				defCaseWhenLogicNodeRuntime.init(item);
				this.defCaseWhenLogicNodeRuntimeList.add(defCaseWhenLogicNodeRuntime);
			}
			
			if(defaultPSDELogicLink != null) {
				DEFCaseWhenLogicNodeRuntime defCaseWhenLogicNodeRuntime = createDEFCaseWhenLogicNodeRuntime();
				
				defCaseWhenLogicNodeRuntime.init(defaultPSDELogicLink);
				this.defaultDEFCaseWhenLogicNodeRuntime = defCaseWhenLogicNodeRuntime;
			}
			
		}
		
		super.onInit();
	}
	
	protected DEFCaseWhenLogicNodeRuntime createDEFCaseWhenLogicNodeRuntime() {
		return new DEFCaseWhenLogicNodeRuntime();
	}
	
	@Override
	public IDEFCaseWhenLogicNodeRuntime getDefaultDEFCaseWhenLogicNodeRuntime() {
		return this.defaultDEFCaseWhenLogicNodeRuntime;
	}
	
	@Override
	public List<IDEFCaseWhenLogicNodeRuntime> getDEFCaseWhenLogicNodeRuntimes(){
		return defCaseWhenLogicNodeRuntimeList;
	}
}
