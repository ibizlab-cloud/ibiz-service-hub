package net.ibizsys.central.dataentity.der;

import java.util.ArrayList;
import java.util.List;

import net.ibizsys.model.dataentity.der.IPSDERAggData;
import net.ibizsys.model.dataentity.der.IPSDERAggDataDEFieldMap;
import net.ibizsys.runtime.dataentity.DataEntityRuntimeException;

public class DERAggDataRuntime extends DERBaseRuntime implements IDERAggDataRuntime {

	private List<IDERAggDataDEFMapRuntime> derAggDataDEFMapRuntimeList = new ArrayList<IDERAggDataDEFMapRuntime>();
	
	@Override
	protected void onInit() throws Exception {
		if(!(this.getPSDERBase() instanceof IPSDERAggData)) {
			throw new Exception("传入关系模型对象类型不正确");
		}
		
		List<IPSDERAggDataDEFieldMap> psDERAggDataDEFieldMapList = getPSDERAggData().getPSDERAggDataDEFieldMaps();
		if(psDERAggDataDEFieldMapList != null) {
			for(IPSDERAggDataDEFieldMap iPSDERAggDataDEFieldMap : psDERAggDataDEFieldMapList) {
				IDERAggDataDEFMapRuntime iDERAggDataDEFMapRuntime = createDERAggDataDEFMapRuntime(iPSDERAggDataDEFieldMap);
				iDERAggDataDEFMapRuntime.init(this.getDERBaseRuntimeContext(), iPSDERAggDataDEFieldMap);
				this.derAggDataDEFMapRuntimeList.add(iDERAggDataDEFMapRuntime);
			}
		}
		super.onInit();
	}

	@Override
	public IPSDERAggData getPSDERAggData() {
		return (IPSDERAggData)this.getPSDERBase();
	}

	
	
	protected IDERAggDataDEFMapRuntime createDERAggDataDEFMapRuntime(IPSDERAggDataDEFieldMap iPSDERAggDataDEFieldMap) {
		return new DERAggDataDEFMapRuntime();
	}
	
	
	@Override
	public List<IDERAggDataDEFMapRuntime> getDERAggDataDEFMapRuntimes() {
		return this.derAggDataDEFMapRuntimeList;
	}


	@Override
	public IDERAggDataDEFMapRuntime getDERAggDataDEFMapRuntimeByMajorField(String strFieldName, boolean bTryMode) {
		for(IDERAggDataDEFMapRuntime item : this.derAggDataDEFMapRuntimeList) {
			if(item.getPSDERAggDataDEFieldMap().getMajorPSDEFieldMust().getLowerCaseName().equalsIgnoreCase(strFieldName)) {
				return item;
			}
		}
		if(bTryMode) {
			return null;
		}
		throw new DataEntityRuntimeException(this.getMinorDataEntityRuntime(), this, String.format("无法获取指定主属性名称[%1$s]聚合关系属性映射", strFieldName));
		
	}

	@Override
	public IDERAggDataDEFMapRuntime getDERAggDataDEFMapRuntime(String strFieldName, boolean bTryMode) {
		for(IDERAggDataDEFMapRuntime item : this.derAggDataDEFMapRuntimeList) {
			if(item.getName().equalsIgnoreCase(strFieldName)) {
				return item;
			}
		}
		if(bTryMode) {
			return null;
		}

		throw new DataEntityRuntimeException(this.getMinorDataEntityRuntime(), this, String.format("无法获取指定名称[%1$s]聚合关系属性映射", strFieldName));
	}

	
}
