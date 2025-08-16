package net.ibizsys.model.res;



public class PSSysPDTViewImpl extends net.ibizsys.model.PSSystemObjectImpl implements net.ibizsys.model.res.IPSSysPDTView{

	public final static String ATTR_GETCAPPSLANGUAGERES = "getCapPSLanguageRes";
	public final static String ATTR_GETCAPTION = "caption";
	public final static String ATTR_GETCODENAME = "codeName";
	public final static String ATTR_GETMOBVIEWCODENAME = "mobViewCodeName";
	public final static String ATTR_GETMOBVIEWPSDATAENTITY = "getMobViewPSDataEntity";
	public final static String ATTR_GETPSSYSTEMMODULE = "getPSSystemModule";
	public final static String ATTR_GETVIEWCODENAME = "viewCodeName";
	public final static String ATTR_GETVIEWPSDATAENTITY = "getViewPSDataEntity";
	public final static String ATTR_ISFROMDEVIEWTOPDTVIEW = "fromDEViewToPDTView";
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


	public java.lang.String getCaption(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETCAPTION);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getCodeName(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETCODENAME);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getMobViewCodeName(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETMOBVIEWCODENAME);
		if(value == null){
			return null;
		}
		return value.asText();
	}
	private net.ibizsys.model.dataentity.IPSDataEntity mobviewpsdataentity;

	public net.ibizsys.model.dataentity.IPSDataEntity getMobViewPSDataEntity(){
		if(this.mobviewpsdataentity != null) return this.mobviewpsdataentity;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETMOBVIEWPSDATAENTITY);
		if(value == null){
			return null;
		}
		this.mobviewpsdataentity = getPSModelObject(net.ibizsys.model.dataentity.IPSDataEntity.class, (com.fasterxml.jackson.databind.node.ObjectNode)value, ATTR_GETMOBVIEWPSDATAENTITY);
		return this.mobviewpsdataentity;
	}

	public net.ibizsys.model.dataentity.IPSDataEntity getMobViewPSDataEntityMust(){
		net.ibizsys.model.dataentity.IPSDataEntity value = this.getMobViewPSDataEntity();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定移动端视图相关实体");}
		return value;
	}

	private net.ibizsys.model.system.IPSSystemModule pssystemmodule;

	public net.ibizsys.model.system.IPSSystemModule getPSSystemModule(){
		if(this.pssystemmodule != null) return this.pssystemmodule;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPSSYSTEMMODULE);
		if(value == null){
			return null;
		}
		this.pssystemmodule = getPSModelObject(net.ibizsys.model.system.IPSSystemModule.class, (com.fasterxml.jackson.databind.node.ObjectNode)value, ATTR_GETPSSYSTEMMODULE);
		return this.pssystemmodule;
	}

	public net.ibizsys.model.system.IPSSystemModule getPSSystemModuleMust(){
		net.ibizsys.model.system.IPSSystemModule value = this.getPSSystemModule();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定系统模块");}
		return value;
	}


	public java.lang.String getViewCodeName(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETVIEWCODENAME);
		if(value == null){
			return null;
		}
		return value.asText();
	}
	private net.ibizsys.model.dataentity.IPSDataEntity viewpsdataentity;

	public net.ibizsys.model.dataentity.IPSDataEntity getViewPSDataEntity(){
		if(this.viewpsdataentity != null) return this.viewpsdataentity;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETVIEWPSDATAENTITY);
		if(value == null){
			return null;
		}
		this.viewpsdataentity = getPSModelObject(net.ibizsys.model.dataentity.IPSDataEntity.class, (com.fasterxml.jackson.databind.node.ObjectNode)value, ATTR_GETVIEWPSDATAENTITY);
		return this.viewpsdataentity;
	}

	public net.ibizsys.model.dataentity.IPSDataEntity getViewPSDataEntityMust(){
		net.ibizsys.model.dataentity.IPSDataEntity value = this.getViewPSDataEntity();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定视图相关实体");}
		return value;
	}


	public boolean isFromDEViewToPDTView(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_ISFROMDEVIEWTOPDTVIEW);
		if(value == null){
			return false;
		}
		return value.asBoolean();
	}
}