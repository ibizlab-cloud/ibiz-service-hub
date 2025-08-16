package net.ibizsys.central.dataentity.defield;

import java.util.HashMap;
import java.util.Map;

import org.springframework.util.Assert;
import org.springframework.util.ObjectUtils;

import net.ibizsys.central.dataentity.DataEntityModelRuntimeBase;
import net.ibizsys.central.dataentity.IDataEntityRuntimeContext;
import net.ibizsys.model.IPSModelObject;
import net.ibizsys.model.dataentity.defield.IPSDEFGroup;
import net.ibizsys.model.dataentity.defield.IPSDEFGroupDetail;
import net.ibizsys.model.dataentity.defield.IPSDEField;

public abstract class DEFGroupRuntimeBase extends DataEntityModelRuntimeBase implements IDEFGroupRuntime  {

	private static final org.apache.commons.logging.Log log = org.apache.commons.logging.LogFactory.getLog(DEFGroupRuntimeBase.class);
	
	private IPSDEFGroup iPSDEFGroup = null;
	private Map<String, IPSDEField> psDEFieldMap = new HashMap<String, IPSDEField>();
	
	@Override
	public void init(IDataEntityRuntimeContext iDataEntityRuntimeContext, IPSDEFGroup iPSDEFGroup) throws Exception {
		Assert.notNull(iDataEntityRuntimeContext, "未传入实体运行时上下文对象");
		Assert.notNull(iPSDEFGroup, "未传入实体属性组模型对象");
		this.setDataEntityRuntimeBaseContext(iDataEntityRuntimeContext);
		this.setPSDEFGroup(iPSDEFGroup);
		this.onInit();
	}
	
	@Override
	protected void onInit() throws Exception {
		
		java.util.List<IPSDEFGroupDetail> psDEFGroupDetailList = this.getPSDEFGroup().getPSDEFGroupDetails();
		if(!ObjectUtils.isEmpty(psDEFGroupDetailList)) {
			for(IPSDEFGroupDetail iPSDEFGroupDetail : psDEFGroupDetailList) {
				//修复早期BUG
				if(iPSDEFGroupDetail.getPSDEField() == null) {
					psDEFieldMap.put(iPSDEFGroupDetail.getName().toLowerCase(), null);
				}
				else {
					psDEFieldMap.put(iPSDEFGroupDetail.getPSDEField().getLowerCaseName(), iPSDEFGroupDetail.getPSDEField());
				}
			}
		}
		
		
		super.onInit();
	}
	
	@Override
	public IPSDEFGroup getPSDEFGroup() {
		return this.iPSDEFGroup;
	}
	
	protected void setPSDEFGroup(IPSDEFGroup iPSDEFGroup) {
		this.iPSDEFGroup = iPSDEFGroup;
	}
	
	
	

	@Override
	public IPSModelObject getPSModelObject() {
		return this.getPSDEFGroup();
	}

	@Override
	public boolean contains(IPSDEField iPSDEField) {
		Assert.notNull(iPSDEField, "未传入实体属性模型对象");
		return psDEFieldMap.containsKey(iPSDEField.getLowerCaseName());
	}
	
	
}
