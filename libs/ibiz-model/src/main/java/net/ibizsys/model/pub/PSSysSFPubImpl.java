package net.ibizsys.model.pub;



public class PSSysSFPubImpl extends net.ibizsys.model.PSSystemObjectImpl implements net.ibizsys.model.pub.IPSSysSFPub{

	public final static String ATTR_GETCODENAME = "codeName";
	public final static String ATTR_GETCONTENTTYPE = "contentType";
	public final static String ATTR_GETDEFAULTFLAG = "defaultFlag";
	public final static String ATTR_GETGROOVYSOURCEFOLDER = "groovySourceFolder";
	public final static String ATTR_GETMODELFOLDER = "modelFolder";
	public final static String ATTR_GETPKGCODENAME = "pKGCodeName";
	public final static String ATTR_GETPSSYSSFPUBPKGS = "getPSSysSFPubPkgs";
	public final static String ATTR_GETVERSIONSTRING = "versionString";
	public final static String ATTR_ISCODEMODE = "codeMode";
	public final static String ATTR_ISDOCMODE = "docMode";
	public final static String ATTR_ISENABLEMODELRT = "enableModelRT";
	public final static String ATTR_ISMAINPSSYSSFPUB = "mainPSSysSFPub";
	public final static String ATTR_ISPUBMODEL = "pubModel";
	public final static String ATTR_ISSUBSYSPACKAGE = "subSysPackage";
	public final static String ATTR_ISTESTCODEMODE = "testCodeMode";

	public java.lang.String getCodeName(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETCODENAME);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getContentType(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETCONTENTTYPE);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public boolean getDefaultFlag(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETDEFAULTFLAG);
		if(value == null){
			return false;
		}
		return value.asBoolean();
	}

	public java.lang.String getGroovySourceFolder(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETGROOVYSOURCEFOLDER);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getModelFolder(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETMODELFOLDER);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getPKGCodeName(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPKGCODENAME);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	private java.util.List<net.ibizsys.model.pub.IPSSysSFPubPkg> pssyssfpubpkgs = null;
	public java.util.List<net.ibizsys.model.pub.IPSSysSFPubPkg> getPSSysSFPubPkgs(){
		if(this.pssyssfpubpkgs == null){
			com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPSSYSSFPUBPKGS);
			if(value == null){return null;}
			com.fasterxml.jackson.databind.node.ArrayNode arrayNode = (com.fasterxml.jackson.databind.node.ArrayNode)value;
			if(arrayNode.size() == 0){return null;}
			java.util.List<net.ibizsys.model.pub.IPSSysSFPubPkg> list = new java.util.ArrayList<net.ibizsys.model.pub.IPSSysSFPubPkg>();
			for(int i = 0;i<arrayNode.size();i++) {
				net.ibizsys.model.pub.IPSSysSFPubPkg obj = this.getPSModelObject(net.ibizsys.model.pub.IPSSysSFPubPkg.class, (com.fasterxml.jackson.databind.node.ObjectNode)arrayNode.get(i),ATTR_GETPSSYSSFPUBPKGS);
				if(obj!=null)list.add(obj);
			}
			this.pssyssfpubpkgs = list;
		}
		return (this.pssyssfpubpkgs.size() == 0)? null : this.pssyssfpubpkgs;
	}

	public net.ibizsys.model.pub.IPSSysSFPubPkg getPSSysSFPubPkg(Object objKey, boolean bTryMode){
		return getPSModelObject(net.ibizsys.model.pub.IPSSysSFPubPkg.class, this.getPSSysSFPubPkgs(), objKey, bTryMode);
	}
	public void setPSSysSFPubPkgs(java.util.List<net.ibizsys.model.pub.IPSSysSFPubPkg> list){
		this.pssyssfpubpkgs = list;
	}

	public java.lang.String getVersionString(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETVERSIONSTRING);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public boolean isCodeMode(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_ISCODEMODE);
		if(value == null){
			return false;
		}
		return value.asBoolean();
	}

	public boolean isDocMode(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_ISDOCMODE);
		if(value == null){
			return false;
		}
		return value.asBoolean();
	}

	public boolean isEnableModelRT(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_ISENABLEMODELRT);
		if(value == null){
			return false;
		}
		return value.asBoolean();
	}

	public boolean isMainPSSysSFPub(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_ISMAINPSSYSSFPUB);
		if(value == null){
			return false;
		}
		return value.asBoolean();
	}

	public boolean isPubModel(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_ISPUBMODEL);
		if(value == null){
			return false;
		}
		return value.asBoolean();
	}

	public boolean isSubSysPackage(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_ISSUBSYSPACKAGE);
		if(value == null){
			return false;
		}
		return value.asBoolean();
	}

	public boolean isTestCodeMode(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_ISTESTCODEMODE);
		if(value == null){
			return false;
		}
		return value.asBoolean();
	}
}