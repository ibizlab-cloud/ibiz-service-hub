package net.ibizsys.model.dataentity.dataexport;



public class PSDEDataExportGroupImpl extends net.ibizsys.model.PSObjectImpl implements net.ibizsys.model.dataentity.dataexport.IPSDEDataExportGroup{

	public final static String ATTR_GETALIGN = "align";
	public final static String ATTR_GETCAPPSLANGUAGERES = "getCapPSLanguageRes";
	public final static String ATTR_GETCAPTION = "caption";
	public final static String ATTR_GETGROUPLEVEL = "groupLevel";
	public final static String ATTR_GETPARENTPSDEDATAEXPORTGROUP = "getParentPSDEDataExportGroup";

	public java.lang.String getAlign(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETALIGN);
		if(value == null){
			return null;
		}
		return value.asText();
	}
	private net.ibizsys.model.res.IPSLanguageRes cappslanguageres;

	public net.ibizsys.model.res.IPSLanguageRes getCapPSLanguageRes(){
		if(this.cappslanguageres != null) return this.cappslanguageres;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETCAPPSLANGUAGERES);
		if(value == null){
			return null;
		}
		this.cappslanguageres = getPSModelObject(net.ibizsys.model.res.IPSLanguageRes.class, (com.fasterxml.jackson.databind.node.ObjectNode)value, ATTR_GETCAPPSLANGUAGERES);
		return this.cappslanguageres;
	}

	public net.ibizsys.model.res.IPSLanguageRes getCapPSLanguageResMust(){
		net.ibizsys.model.res.IPSLanguageRes value = this.getCapPSLanguageRes();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定标题语言资源");}
		return value;
	}

	public void setCapPSLanguageRes(net.ibizsys.model.res.IPSLanguageRes cappslanguageres){
		this.cappslanguageres = cappslanguageres;
	}


	public java.lang.String getCaption(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETCAPTION);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public int getGroupLevel(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETGROUPLEVEL);
		if(value == null){
			return 1;
		}
		return value.asInt();
	}
	private net.ibizsys.model.dataentity.dataexport.IPSDEDataExportGroup parentpsdedataexportgroup;

	public net.ibizsys.model.dataentity.dataexport.IPSDEDataExportGroup getParentPSDEDataExportGroup(){
		if(this.parentpsdedataexportgroup != null) return this.parentpsdedataexportgroup;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPARENTPSDEDATAEXPORTGROUP);
		if(value == null){
			return null;
		}
		net.ibizsys.model.dataentity.dataexport.IPSDEDataExport ipsdedataexport = getParentPSModelObject(net.ibizsys.model.dataentity.dataexport.IPSDEDataExport.class);
		this.parentpsdedataexportgroup = ipsdedataexport.getPSDEDataExportGroup(value, false);
		return this.parentpsdedataexportgroup;
	}

	public net.ibizsys.model.dataentity.dataexport.IPSDEDataExportGroup getParentPSDEDataExportGroupMust(){
		net.ibizsys.model.dataentity.dataexport.IPSDEDataExportGroup value = this.getParentPSDEDataExportGroup();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定父数据导出分组");}
		return value;
	}

	public void setParentPSDEDataExportGroup(net.ibizsys.model.dataentity.dataexport.IPSDEDataExportGroup parentpsdedataexportgroup){
		this.parentpsdedataexportgroup = parentpsdedataexportgroup;
	}

}