package net.ibizsys.model.wf;



public abstract class PSWFEmbedWFProcessBaseImpl extends net.ibizsys.model.wf.PSWFProcessImpl implements net.ibizsys.model.wf.IPSWFEmbedWFProcessBase{

	public final static String ATTR_GETMULTIINSTMODE = "multiInstMode";
	public final static String ATTR_GETPSWFPROCESSSUBWFS = "getPSWFProcessSubWFs";

	public java.lang.String getMultiInstMode(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETMULTIINSTMODE);
		if(value == null){
			return "NONE";
		}
		return value.asText();
	}

	private java.util.List<net.ibizsys.model.wf.IPSWFProcessSubWF> pswfprocesssubwfs = null;
	public java.util.List<net.ibizsys.model.wf.IPSWFProcessSubWF> getPSWFProcessSubWFs(){
		if(this.pswfprocesssubwfs == null){
			com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPSWFPROCESSSUBWFS);
			if(value == null){return null;}
			com.fasterxml.jackson.databind.node.ArrayNode arrayNode = (com.fasterxml.jackson.databind.node.ArrayNode)value;
			if(arrayNode.size() == 0){return null;}
			java.util.List<net.ibizsys.model.wf.IPSWFProcessSubWF> list = new java.util.ArrayList<net.ibizsys.model.wf.IPSWFProcessSubWF>();
			for(int i = 0;i<arrayNode.size();i++) {
				net.ibizsys.model.wf.IPSWFProcessSubWF obj = this.getPSModelObject(net.ibizsys.model.wf.IPSWFProcessSubWF.class, (com.fasterxml.jackson.databind.node.ObjectNode)arrayNode.get(i),ATTR_GETPSWFPROCESSSUBWFS);
				if(obj!=null)list.add(obj);
			}
			this.pswfprocesssubwfs = list;
		}
		return (this.pswfprocesssubwfs.size() == 0)? null : this.pswfprocesssubwfs;
	}

	public net.ibizsys.model.wf.IPSWFProcessSubWF getPSWFProcessSubWF(Object objKey, boolean bTryMode){
		return getPSModelObject(net.ibizsys.model.wf.IPSWFProcessSubWF.class, this.getPSWFProcessSubWFs(), objKey, bTryMode);
	}
	public void setPSWFProcessSubWFs(java.util.List<net.ibizsys.model.wf.IPSWFProcessSubWF> list){
		this.pswfprocesssubwfs = list;
	}
}