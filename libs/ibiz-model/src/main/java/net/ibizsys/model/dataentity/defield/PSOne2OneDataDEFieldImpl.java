package net.ibizsys.model.dataentity.defield;



public class PSOne2OneDataDEFieldImpl extends net.ibizsys.model.dataentity.defield.PSDEFieldImpl implements net.ibizsys.model.dataentity.defield.IPSOne2OneDataDEField{

	public final static String ATTR_GETPSDER = "getPSDER";
	private net.ibizsys.model.dataentity.der.IPSDERBase psder;

	public net.ibizsys.model.dataentity.der.IPSDERBase getPSDER(){
		if(this.psder != null) return this.psder;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPSDER);
		if(value == null){
			throw new net.ibizsys.model.PSModelException(this, "未指定[一对一关系]的值");
		}
		this.psder = getPSModelObject(net.ibizsys.model.dataentity.der.IPSDERBase.class, (com.fasterxml.jackson.databind.node.ObjectNode)value, ATTR_GETPSDER);
		return this.psder;
	}

	public net.ibizsys.model.dataentity.der.IPSDERBase getPSDERMust(){
		net.ibizsys.model.dataentity.der.IPSDERBase value = this.getPSDER();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定一对一关系");}
		return value;
	}

	public void setPSDER(net.ibizsys.model.dataentity.der.IPSDERBase psder){
		this.psder = psder;
	}

}