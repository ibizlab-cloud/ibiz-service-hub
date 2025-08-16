package net.ibizsys.model.control.list;



public class PSDEMobMDCtrlImpl extends net.ibizsys.model.control.list.PSDEListImpl implements net.ibizsys.model.control.list.IPSDEMobMDCtrl{

	public final static String ATTR_GETMOBLISTSTYLE = "mobListStyle";
	public final static String ATTR_GETPSDEUIACTIONGROUP = "getPSDEUIActionGroup";
	public final static String ATTR_GETPSDEUIACTIONGROUP2 = "getPSDEUIActionGroup2";
	public final static String ATTR_GETPSDEUIACTIONGROUP3 = "getPSDEUIActionGroup3";
	public final static String ATTR_GETPSDEUIACTIONGROUP4 = "getPSDEUIActionGroup4";
	public final static String ATTR_GETPSDEUIACTIONGROUP5 = "getPSDEUIActionGroup5";
	public final static String ATTR_GETPSDEUIACTIONGROUP6 = "getPSDEUIActionGroup6";

	public java.lang.String getMobListStyle(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETMOBLISTSTYLE);
		if(value == null){
			return null;
		}
		return value.asText();
	}
	private net.ibizsys.model.dataentity.uiaction.IPSDEUIActionGroup psdeuiactiongroup;

	public net.ibizsys.model.dataentity.uiaction.IPSDEUIActionGroup getPSDEUIActionGroup(){
		if(this.psdeuiactiongroup != null) return this.psdeuiactiongroup;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPSDEUIACTIONGROUP);
		if(value == null){
			return null;
		}
		this.psdeuiactiongroup = getPSModelObject(net.ibizsys.model.dataentity.uiaction.IPSDEUIActionGroup.class, (com.fasterxml.jackson.databind.node.ObjectNode)value, ATTR_GETPSDEUIACTIONGROUP);
		return this.psdeuiactiongroup;
	}

	public net.ibizsys.model.dataentity.uiaction.IPSDEUIActionGroup getPSDEUIActionGroupMust(){
		net.ibizsys.model.dataentity.uiaction.IPSDEUIActionGroup value = this.getPSDEUIActionGroup();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定界面行为组");}
		return value;
	}

	public void setPSDEUIActionGroup(net.ibizsys.model.dataentity.uiaction.IPSDEUIActionGroup psdeuiactiongroup){
		this.psdeuiactiongroup = psdeuiactiongroup;
	}

	private net.ibizsys.model.dataentity.uiaction.IPSDEUIActionGroup psdeuiactiongroup2;

	public net.ibizsys.model.dataentity.uiaction.IPSDEUIActionGroup getPSDEUIActionGroup2(){
		if(this.psdeuiactiongroup2 != null) return this.psdeuiactiongroup2;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPSDEUIACTIONGROUP2);
		if(value == null){
			return null;
		}
		this.psdeuiactiongroup2 = getPSModelObject(net.ibizsys.model.dataentity.uiaction.IPSDEUIActionGroup.class, (com.fasterxml.jackson.databind.node.ObjectNode)value, ATTR_GETPSDEUIACTIONGROUP2);
		return this.psdeuiactiongroup2;
	}

	public net.ibizsys.model.dataentity.uiaction.IPSDEUIActionGroup getPSDEUIActionGroup2Must(){
		net.ibizsys.model.dataentity.uiaction.IPSDEUIActionGroup value = this.getPSDEUIActionGroup2();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定界面行为组2");}
		return value;
	}

	public void setPSDEUIActionGroup2(net.ibizsys.model.dataentity.uiaction.IPSDEUIActionGroup psdeuiactiongroup2){
		this.psdeuiactiongroup2 = psdeuiactiongroup2;
	}

	private net.ibizsys.model.dataentity.uiaction.IPSDEUIActionGroup psdeuiactiongroup3;

	public net.ibizsys.model.dataentity.uiaction.IPSDEUIActionGroup getPSDEUIActionGroup3(){
		if(this.psdeuiactiongroup3 != null) return this.psdeuiactiongroup3;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPSDEUIACTIONGROUP3);
		if(value == null){
			return null;
		}
		this.psdeuiactiongroup3 = getPSModelObject(net.ibizsys.model.dataentity.uiaction.IPSDEUIActionGroup.class, (com.fasterxml.jackson.databind.node.ObjectNode)value, ATTR_GETPSDEUIACTIONGROUP3);
		return this.psdeuiactiongroup3;
	}

	public net.ibizsys.model.dataentity.uiaction.IPSDEUIActionGroup getPSDEUIActionGroup3Must(){
		net.ibizsys.model.dataentity.uiaction.IPSDEUIActionGroup value = this.getPSDEUIActionGroup3();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定界面行为组3");}
		return value;
	}

	public void setPSDEUIActionGroup3(net.ibizsys.model.dataentity.uiaction.IPSDEUIActionGroup psdeuiactiongroup3){
		this.psdeuiactiongroup3 = psdeuiactiongroup3;
	}

	private net.ibizsys.model.dataentity.uiaction.IPSDEUIActionGroup psdeuiactiongroup4;

	public net.ibizsys.model.dataentity.uiaction.IPSDEUIActionGroup getPSDEUIActionGroup4(){
		if(this.psdeuiactiongroup4 != null) return this.psdeuiactiongroup4;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPSDEUIACTIONGROUP4);
		if(value == null){
			return null;
		}
		this.psdeuiactiongroup4 = getPSModelObject(net.ibizsys.model.dataentity.uiaction.IPSDEUIActionGroup.class, (com.fasterxml.jackson.databind.node.ObjectNode)value, ATTR_GETPSDEUIACTIONGROUP4);
		return this.psdeuiactiongroup4;
	}

	public net.ibizsys.model.dataentity.uiaction.IPSDEUIActionGroup getPSDEUIActionGroup4Must(){
		net.ibizsys.model.dataentity.uiaction.IPSDEUIActionGroup value = this.getPSDEUIActionGroup4();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定界面行为组4");}
		return value;
	}

	public void setPSDEUIActionGroup4(net.ibizsys.model.dataentity.uiaction.IPSDEUIActionGroup psdeuiactiongroup4){
		this.psdeuiactiongroup4 = psdeuiactiongroup4;
	}

	private net.ibizsys.model.dataentity.uiaction.IPSDEUIActionGroup psdeuiactiongroup5;

	public net.ibizsys.model.dataentity.uiaction.IPSDEUIActionGroup getPSDEUIActionGroup5(){
		if(this.psdeuiactiongroup5 != null) return this.psdeuiactiongroup5;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPSDEUIACTIONGROUP5);
		if(value == null){
			return null;
		}
		this.psdeuiactiongroup5 = getPSModelObject(net.ibizsys.model.dataentity.uiaction.IPSDEUIActionGroup.class, (com.fasterxml.jackson.databind.node.ObjectNode)value, ATTR_GETPSDEUIACTIONGROUP5);
		return this.psdeuiactiongroup5;
	}

	public net.ibizsys.model.dataentity.uiaction.IPSDEUIActionGroup getPSDEUIActionGroup5Must(){
		net.ibizsys.model.dataentity.uiaction.IPSDEUIActionGroup value = this.getPSDEUIActionGroup5();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定界面行为组5");}
		return value;
	}

	public void setPSDEUIActionGroup5(net.ibizsys.model.dataentity.uiaction.IPSDEUIActionGroup psdeuiactiongroup5){
		this.psdeuiactiongroup5 = psdeuiactiongroup5;
	}

	private net.ibizsys.model.dataentity.uiaction.IPSDEUIActionGroup psdeuiactiongroup6;

	public net.ibizsys.model.dataentity.uiaction.IPSDEUIActionGroup getPSDEUIActionGroup6(){
		if(this.psdeuiactiongroup6 != null) return this.psdeuiactiongroup6;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPSDEUIACTIONGROUP6);
		if(value == null){
			return null;
		}
		this.psdeuiactiongroup6 = getPSModelObject(net.ibizsys.model.dataentity.uiaction.IPSDEUIActionGroup.class, (com.fasterxml.jackson.databind.node.ObjectNode)value, ATTR_GETPSDEUIACTIONGROUP6);
		return this.psdeuiactiongroup6;
	}

	public net.ibizsys.model.dataentity.uiaction.IPSDEUIActionGroup getPSDEUIActionGroup6Must(){
		net.ibizsys.model.dataentity.uiaction.IPSDEUIActionGroup value = this.getPSDEUIActionGroup6();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定界面行为组6");}
		return value;
	}

	public void setPSDEUIActionGroup6(net.ibizsys.model.dataentity.uiaction.IPSDEUIActionGroup psdeuiactiongroup6){
		this.psdeuiactiongroup6 = psdeuiactiongroup6;
	}

}