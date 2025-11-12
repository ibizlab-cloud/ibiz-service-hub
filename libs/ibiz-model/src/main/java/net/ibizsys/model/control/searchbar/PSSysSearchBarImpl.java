package net.ibizsys.model.control.searchbar;



public class PSSysSearchBarImpl extends net.ibizsys.model.control.PSControlContainerImpl implements net.ibizsys.model.control.searchbar.IPSSysSearchBar{

	public final static String ATTR_GETCODENAME = "codeName";
	public final static String ATTR_GETGROUPMODE = "groupMode";
	public final static String ATTR_GETGROUPMORETEXT = "groupMoreText";
	public final static String ATTR_GETPSAPPCOUNTERREF = "getPSAppCounterRef";
	public final static String ATTR_GETPSSEARCHBARFILTERS = "getPSSearchBarFilters";
	public final static String ATTR_GETPSSEARCHBARGROUPS = "getPSSearchBarGroups";
	public final static String ATTR_GETPSSEARCHBARQUICKSEARCHS = "getPSSearchBarQuickSearchs";
	public final static String ATTR_GETQUICKGROUPCOUNT = "quickGroupCount";
	public final static String ATTR_GETQUICKSEARCHMODE = "quickSearchMode";
	public final static String ATTR_GETQUICKSEARCHWIDTH = "quickSearchWidth";
	public final static String ATTR_GETSEARCHBARSTYLE = "searchBarStyle";
	public final static String ATTR_ISENABLEFILTER = "enableFilter";
	public final static String ATTR_ISENABLEGROUP = "enableGroup";
	public final static String ATTR_ISENABLEQUICKSEARCH = "enableQuickSearch";
	public final static String ATTR_ISMOBILESEARCHBAR = "mobileSearchBar";

	public java.lang.String getCodeName(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETCODENAME);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getGroupMode(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETGROUPMODE);
		if(value == null){
			return "SINGLE";
		}
		return value.asText();
	}

	public java.lang.String getGroupMoreText(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETGROUPMORETEXT);
		if(value == null){
			return null;
		}
		return value.asText();
	}
	private net.ibizsys.model.app.control.IPSAppCounterRef psappcounterref;

	public net.ibizsys.model.app.control.IPSAppCounterRef getPSAppCounterRef(){
		if(this.psappcounterref != null) return this.psappcounterref;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPSAPPCOUNTERREF);
		if(value == null){
			return null;
		}
		this.psappcounterref = getPSModelObject(net.ibizsys.model.app.control.IPSAppCounterRef.class, (com.fasterxml.jackson.databind.node.ObjectNode)value, ATTR_GETPSAPPCOUNTERREF);
		return this.psappcounterref;
	}

	public net.ibizsys.model.app.control.IPSAppCounterRef getPSAppCounterRefMust(){
		net.ibizsys.model.app.control.IPSAppCounterRef value = this.getPSAppCounterRef();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定应用计数器引用");}
		return value;
	}

	public void setPSAppCounterRef(net.ibizsys.model.app.control.IPSAppCounterRef psappcounterref){
		this.psappcounterref = psappcounterref;
	}


	private java.util.List<net.ibizsys.model.control.searchbar.IPSSearchBarFilter> pssearchbarfilters = null;
	public java.util.List<net.ibizsys.model.control.searchbar.IPSSearchBarFilter> getPSSearchBarFilters(){
		if(this.pssearchbarfilters == null){
			com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPSSEARCHBARFILTERS);
			if(value == null){return null;}
			com.fasterxml.jackson.databind.node.ArrayNode arrayNode = (com.fasterxml.jackson.databind.node.ArrayNode)value;
			if(arrayNode.size() == 0){return null;}
			java.util.List<net.ibizsys.model.control.searchbar.IPSSearchBarFilter> list = new java.util.ArrayList<net.ibizsys.model.control.searchbar.IPSSearchBarFilter>();
			for(int i = 0;i<arrayNode.size();i++) {
				net.ibizsys.model.control.searchbar.IPSSearchBarFilter obj = this.getPSModelObject(net.ibizsys.model.control.searchbar.IPSSearchBarFilter.class, (com.fasterxml.jackson.databind.node.ObjectNode)arrayNode.get(i),ATTR_GETPSSEARCHBARFILTERS);
				if(obj!=null)list.add(obj);
			}
			this.pssearchbarfilters = list;
		}
		return (this.pssearchbarfilters.size() == 0)? null : this.pssearchbarfilters;
	}

	public net.ibizsys.model.control.searchbar.IPSSearchBarFilter getPSSearchBarFilter(Object objKey, boolean bTryMode){
		return getPSModelObject(net.ibizsys.model.control.searchbar.IPSSearchBarFilter.class, this.getPSSearchBarFilters(), objKey, bTryMode);
	}
	public void setPSSearchBarFilters(java.util.List<net.ibizsys.model.control.searchbar.IPSSearchBarFilter> list){
		this.pssearchbarfilters = list;
	}

	private java.util.List<net.ibizsys.model.control.searchbar.IPSSearchBarGroup> pssearchbargroups = null;
	public java.util.List<net.ibizsys.model.control.searchbar.IPSSearchBarGroup> getPSSearchBarGroups(){
		if(this.pssearchbargroups == null){
			com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPSSEARCHBARGROUPS);
			if(value == null){return null;}
			com.fasterxml.jackson.databind.node.ArrayNode arrayNode = (com.fasterxml.jackson.databind.node.ArrayNode)value;
			if(arrayNode.size() == 0){return null;}
			java.util.List<net.ibizsys.model.control.searchbar.IPSSearchBarGroup> list = new java.util.ArrayList<net.ibizsys.model.control.searchbar.IPSSearchBarGroup>();
			for(int i = 0;i<arrayNode.size();i++) {
				net.ibizsys.model.control.searchbar.IPSSearchBarGroup obj = this.getPSModelObject(net.ibizsys.model.control.searchbar.IPSSearchBarGroup.class, (com.fasterxml.jackson.databind.node.ObjectNode)arrayNode.get(i),ATTR_GETPSSEARCHBARGROUPS);
				if(obj!=null)list.add(obj);
			}
			this.pssearchbargroups = list;
		}
		return (this.pssearchbargroups.size() == 0)? null : this.pssearchbargroups;
	}

	public net.ibizsys.model.control.searchbar.IPSSearchBarGroup getPSSearchBarGroup(Object objKey, boolean bTryMode){
		return getPSModelObject(net.ibizsys.model.control.searchbar.IPSSearchBarGroup.class, this.getPSSearchBarGroups(), objKey, bTryMode);
	}
	public void setPSSearchBarGroups(java.util.List<net.ibizsys.model.control.searchbar.IPSSearchBarGroup> list){
		this.pssearchbargroups = list;
	}

	private java.util.List<net.ibizsys.model.control.searchbar.IPSSearchBarQuickSearch> pssearchbarquicksearchs = null;
	public java.util.List<net.ibizsys.model.control.searchbar.IPSSearchBarQuickSearch> getPSSearchBarQuickSearchs(){
		if(this.pssearchbarquicksearchs == null){
			com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPSSEARCHBARQUICKSEARCHS);
			if(value == null){return null;}
			com.fasterxml.jackson.databind.node.ArrayNode arrayNode = (com.fasterxml.jackson.databind.node.ArrayNode)value;
			if(arrayNode.size() == 0){return null;}
			java.util.List<net.ibizsys.model.control.searchbar.IPSSearchBarQuickSearch> list = new java.util.ArrayList<net.ibizsys.model.control.searchbar.IPSSearchBarQuickSearch>();
			for(int i = 0;i<arrayNode.size();i++) {
				net.ibizsys.model.control.searchbar.IPSSearchBarQuickSearch obj = this.getPSModelObject(net.ibizsys.model.control.searchbar.IPSSearchBarQuickSearch.class, (com.fasterxml.jackson.databind.node.ObjectNode)arrayNode.get(i),ATTR_GETPSSEARCHBARQUICKSEARCHS);
				if(obj!=null)list.add(obj);
			}
			this.pssearchbarquicksearchs = list;
		}
		return (this.pssearchbarquicksearchs.size() == 0)? null : this.pssearchbarquicksearchs;
	}

	public net.ibizsys.model.control.searchbar.IPSSearchBarQuickSearch getPSSearchBarQuickSearch(Object objKey, boolean bTryMode){
		return getPSModelObject(net.ibizsys.model.control.searchbar.IPSSearchBarQuickSearch.class, this.getPSSearchBarQuickSearchs(), objKey, bTryMode);
	}
	public void setPSSearchBarQuickSearches(java.util.List<net.ibizsys.model.control.searchbar.IPSSearchBarQuickSearch> list){
		this.pssearchbarquicksearchs = list;
	}

	public int getQuickGroupCount(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETQUICKGROUPCOUNT);
		if(value == null){
			return 0;
		}
		return value.asInt();
	}

	public int getQuickSearchMode(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETQUICKSEARCHMODE);
		if(value == null){
			return 0;
		}
		return value.asInt();
	}

	public int getQuickSearchWidth(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETQUICKSEARCHWIDTH);
		if(value == null){
			return 0;
		}
		return value.asInt();
	}

	public java.lang.String getSearchBarStyle(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETSEARCHBARSTYLE);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public boolean isEnableFilter(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_ISENABLEFILTER);
		if(value == null){
			return false;
		}
		return value.asBoolean();
	}

	public boolean isEnableGroup(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_ISENABLEGROUP);
		if(value == null){
			return false;
		}
		return value.asBoolean();
	}

	public boolean isEnableQuickSearch(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_ISENABLEQUICKSEARCH);
		if(value == null){
			return false;
		}
		return value.asBoolean();
	}

	public boolean isMobileSearchBar(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_ISMOBILESEARCHBAR);
		if(value == null){
			return false;
		}
		return value.asBoolean();
	}
}