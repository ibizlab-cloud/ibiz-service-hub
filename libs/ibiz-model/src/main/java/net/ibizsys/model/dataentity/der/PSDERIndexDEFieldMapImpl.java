package net.ibizsys.model.dataentity.der;



public class PSDERIndexDEFieldMapImpl extends net.ibizsys.model.dataentity.der.PSDERDEFieldMapImpl implements net.ibizsys.model.dataentity.der.IPSDERIndexDEFieldMap{

	public final static String ATTR_GETCODENAME = "codeName";
	public final static String ATTR_GETMAJORPSDEFIELD = "getMajorPSDEField";
	public final static String ATTR_GETMINORPSDEFIELD = "getMinorPSDEField";
	public final static String ATTR_GETSRCVALUE = "srcValue";
	public final static String ATTR_GETSRCVALUESTDDATATYPE = "srcValueStdDataType";
	public final static String ATTR_GETSRCVALUETYPE = "srcValueType";

	public java.lang.String getCodeName(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETCODENAME);
		if(value == null){
			return null;
		}
		return value.asText();
	}
	private net.ibizsys.model.dataentity.defield.IPSDEField majorpsdefield;

	public net.ibizsys.model.dataentity.defield.IPSDEField getMajorPSDEField(){
		if(this.majorpsdefield != null) return this.majorpsdefield;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETMAJORPSDEFIELD);
		if(value == null){
			return null;
		}
		net.ibizsys.model.dataentity.der.IPSDERIndex ipsderindex = getParentPSModelObject(net.ibizsys.model.dataentity.der.IPSDERIndex.class);
		this.majorpsdefield = ipsderindex.getMajorPSDataEntityMust().getPSDEField(value, false);
		return this.majorpsdefield;
	}

	public net.ibizsys.model.dataentity.defield.IPSDEField getMajorPSDEFieldMust(){
		net.ibizsys.model.dataentity.defield.IPSDEField value = this.getMajorPSDEField();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定主实体属性");}
		return value;
	}

	public void setMajorPSDEField(net.ibizsys.model.dataentity.defield.IPSDEField majorpsdefield){
		this.majorpsdefield = majorpsdefield;
	}

	private net.ibizsys.model.dataentity.defield.IPSDEField minorpsdefield;

	public net.ibizsys.model.dataentity.defield.IPSDEField getMinorPSDEField(){
		if(this.minorpsdefield != null) return this.minorpsdefield;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETMINORPSDEFIELD);
		if(value == null){
			return null;
		}
		net.ibizsys.model.dataentity.der.IPSDERIndex ipsderindex = getParentPSModelObject(net.ibizsys.model.dataentity.der.IPSDERIndex.class);
		this.minorpsdefield = ipsderindex.getMinorPSDataEntityMust().getPSDEField(value, false);
		return this.minorpsdefield;
	}

	public net.ibizsys.model.dataentity.defield.IPSDEField getMinorPSDEFieldMust(){
		net.ibizsys.model.dataentity.defield.IPSDEField value = this.getMinorPSDEField();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定从实体属性");}
		return value;
	}

	public void setMinorPSDEField(net.ibizsys.model.dataentity.defield.IPSDEField minorpsdefield){
		this.minorpsdefield = minorpsdefield;
	}


	public java.lang.String getSrcValue(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETSRCVALUE);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public int getSrcValueStdDataType(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETSRCVALUESTDDATATYPE);
		if(value == null){
			return 0;
		}
		return value.asInt();
	}

	public java.lang.String getSrcValueType(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETSRCVALUETYPE);
		if(value == null){
			return null;
		}
		return value.asText();
	}
}