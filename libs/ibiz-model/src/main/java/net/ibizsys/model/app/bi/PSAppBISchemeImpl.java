package net.ibizsys.model.app.bi;



public class PSAppBISchemeImpl extends net.ibizsys.model.app.PSApplicationObjectImpl implements net.ibizsys.model.app.bi.IPSAppBIScheme{

	public final static String ATTR_GETPSAPPBICUBES = "getPSAppBICubes";
	public final static String ATTR_GETPSAPPBIREPORTS = "getPSAppBIReports";
	public final static String ATTR_GETUNIQUETAG = "uniqueTag";

	private java.util.List<net.ibizsys.model.app.bi.IPSAppBICube> psappbicubes = null;
	public java.util.List<net.ibizsys.model.app.bi.IPSAppBICube> getPSAppBICubes(){
		if(this.psappbicubes == null){
			com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPSAPPBICUBES);
			if(value == null){return null;}
			com.fasterxml.jackson.databind.node.ArrayNode arrayNode = (com.fasterxml.jackson.databind.node.ArrayNode)value;
			if(arrayNode.size() == 0){return null;}
			java.util.List<net.ibizsys.model.app.bi.IPSAppBICube> list = new java.util.ArrayList<net.ibizsys.model.app.bi.IPSAppBICube>();
			for(int i = 0;i<arrayNode.size();i++) {
				net.ibizsys.model.app.bi.IPSAppBICube obj = this.getPSModelObject(net.ibizsys.model.app.bi.IPSAppBICube.class, (com.fasterxml.jackson.databind.node.ObjectNode)arrayNode.get(i),ATTR_GETPSAPPBICUBES);
				if(obj!=null)list.add(obj);
			}
			this.psappbicubes = list;
		}
		return (this.psappbicubes.size() == 0)? null : this.psappbicubes;
	}

	public net.ibizsys.model.app.bi.IPSAppBICube getPSAppBICube(Object objKey, boolean bTryMode){
		return getPSModelObject(net.ibizsys.model.app.bi.IPSAppBICube.class, this.getPSAppBICubes(), objKey, bTryMode);
	}
	public void setPSAppBICubes(java.util.List<net.ibizsys.model.app.bi.IPSAppBICube> list){
		this.psappbicubes = list;
	}

	private java.util.List<net.ibizsys.model.app.bi.IPSAppBIReport> psappbireports = null;
	public java.util.List<net.ibizsys.model.app.bi.IPSAppBIReport> getPSAppBIReports(){
		if(this.psappbireports == null){
			com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPSAPPBIREPORTS);
			if(value == null){return null;}
			com.fasterxml.jackson.databind.node.ArrayNode arrayNode = (com.fasterxml.jackson.databind.node.ArrayNode)value;
			if(arrayNode.size() == 0){return null;}
			java.util.List<net.ibizsys.model.app.bi.IPSAppBIReport> list = new java.util.ArrayList<net.ibizsys.model.app.bi.IPSAppBIReport>();
			for(int i = 0;i<arrayNode.size();i++) {
				net.ibizsys.model.app.bi.IPSAppBIReport obj = this.getPSModelObject(net.ibizsys.model.app.bi.IPSAppBIReport.class, (com.fasterxml.jackson.databind.node.ObjectNode)arrayNode.get(i),ATTR_GETPSAPPBIREPORTS);
				if(obj!=null)list.add(obj);
			}
			this.psappbireports = list;
		}
		return (this.psappbireports.size() == 0)? null : this.psappbireports;
	}

	public net.ibizsys.model.app.bi.IPSAppBIReport getPSAppBIReport(Object objKey, boolean bTryMode){
		return getPSModelObject(net.ibizsys.model.app.bi.IPSAppBIReport.class, this.getPSAppBIReports(), objKey, bTryMode);
	}
	public void setPSAppBIReports(java.util.List<net.ibizsys.model.app.bi.IPSAppBIReport> list){
		this.psappbireports = list;
	}

	public java.lang.String getUniqueTag(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETUNIQUETAG);
		if(value == null){
			return null;
		}
		return value.asText();
	}
}