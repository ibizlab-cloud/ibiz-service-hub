package net.ibizsys.model.dataentity.der;



public class PSDER11Impl extends net.ibizsys.model.dataentity.der.PSDER1NImpl implements net.ibizsys.model.dataentity.der.IPSDER11{

	public final static String ATTR_GETPSONE2ONEDATADEFIELD = "getPSOne2OneDataDEField";
	private net.ibizsys.model.dataentity.defield.IPSOne2OneDataDEField psone2onedatadefield;

	public net.ibizsys.model.dataentity.defield.IPSOne2OneDataDEField getPSOne2OneDataDEField(){
		if(this.psone2onedatadefield != null) return this.psone2onedatadefield;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPSONE2ONEDATADEFIELD);
		if(value == null){
			return null;
		}
		this.psone2onedatadefield = getPSModelObject(net.ibizsys.model.dataentity.defield.IPSOne2OneDataDEField.class, (com.fasterxml.jackson.databind.node.ObjectNode)value, ATTR_GETPSONE2ONEDATADEFIELD);
		return this.psone2onedatadefield;
	}

	public net.ibizsys.model.dataentity.defield.IPSOne2OneDataDEField getPSOne2OneDataDEFieldMust(){
		net.ibizsys.model.dataentity.defield.IPSOne2OneDataDEField value = this.getPSOne2OneDataDEField();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定一对一关系数据属性");}
		return value;
	}

	public void setPSOne2OneDataDEField(net.ibizsys.model.dataentity.defield.IPSOne2OneDataDEField psone2onedatadefield){
		this.psone2onedatadefield = psone2onedatadefield;
	}

}