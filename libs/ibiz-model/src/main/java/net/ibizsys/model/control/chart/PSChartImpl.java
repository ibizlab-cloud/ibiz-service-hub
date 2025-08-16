package net.ibizsys.model.control.chart;



public class PSChartImpl extends net.ibizsys.model.control.PSMDAjaxControlContainerImpl2 implements net.ibizsys.model.control.chart.IPSChart{

	public final static String ATTR_GETCOORDINATESYSTEM = "coordinateSystem";
	public final static String ATTR_GETEMPTYTEXT = "emptyText";
	public final static String ATTR_GETEMPTYTEXTPSLANGUAGERES = "getEmptyTextPSLanguageRes";
	public final static String ATTR_GETGETPSCONTROLACTION = "getGetPSControlAction";
	public final static String ATTR_GETPSCHARTANGLEAXISES = "getPSChartAngleAxises";
	public final static String ATTR_GETPSCHARTCOORDINATESYSTEMS = "getPSChartCoordinateSystems";
	public final static String ATTR_GETPSCHARTDATASETGROUPS = "getPSChartDataSetGroups";
	public final static String ATTR_GETPSCHARTDATASETS = "getPSChartDataSets";
	public final static String ATTR_GETPSCHARTGRIDS = "getPSChartGrids";
	public final static String ATTR_GETPSCHARTPARALLELAXISES = "getPSChartParallelAxises";
	public final static String ATTR_GETPSCHARTPARALLELS = "getPSChartParallels";
	public final static String ATTR_GETPSCHARTPOLARS = "getPSChartPolars";
	public final static String ATTR_GETPSCHARTRADARS = "getPSChartRadars";
	public final static String ATTR_GETPSCHARTRADIUSAXISES = "getPSChartRadiusAxises";
	public final static String ATTR_GETPSCHARTSINGLEAXISES = "getPSChartSingleAxises";
	public final static String ATTR_GETPSCHARTSINGLES = "getPSChartSingles";
	public final static String ATTR_GETPSCHARTXAXISES = "getPSChartXAxises";
	public final static String ATTR_GETPSCHARTYAXISES = "getPSChartYAxises";

	@Deprecated
	public java.lang.String getCoordinateSystem(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETCOORDINATESYSTEM);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	@Deprecated
	public java.lang.String getEmptyText(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETEMPTYTEXT);
		if(value == null){
			return null;
		}
		return value.asText();
	}
	private net.ibizsys.model.res.IPSLanguageRes emptytextpslanguageres;

	@Deprecated
	public net.ibizsys.model.res.IPSLanguageRes getEmptyTextPSLanguageRes(){
		if(this.emptytextpslanguageres != null) return this.emptytextpslanguageres;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETEMPTYTEXTPSLANGUAGERES);
		if(value == null){
			return null;
		}
		this.emptytextpslanguageres = getPSModelObject(net.ibizsys.model.res.IPSLanguageRes.class, (com.fasterxml.jackson.databind.node.ObjectNode)value, ATTR_GETEMPTYTEXTPSLANGUAGERES);
		return this.emptytextpslanguageres;
	}

	public net.ibizsys.model.res.IPSLanguageRes getEmptyTextPSLanguageResMust(){
		net.ibizsys.model.res.IPSLanguageRes value = this.getEmptyTextPSLanguageRes();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "[getEmptyTextPSLanguageRes]返回空值");}
		return value;
	}

	private net.ibizsys.model.control.IPSControlAction getpscontrolaction;

	@Deprecated
	public net.ibizsys.model.control.IPSControlAction getGetPSControlAction(){
		if(this.getpscontrolaction != null) return this.getpscontrolaction;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETGETPSCONTROLACTION);
		if(value == null){
			return null;
		}
		this.getpscontrolaction = getPSModelObject(net.ibizsys.model.control.IPSControlAction.class, (com.fasterxml.jackson.databind.node.ObjectNode)value, ATTR_GETGETPSCONTROLACTION);
		return this.getpscontrolaction;
	}

	public net.ibizsys.model.control.IPSControlAction getGetPSControlActionMust(){
		net.ibizsys.model.control.IPSControlAction value = this.getGetPSControlAction();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "[getGetPSControlAction]返回空值");}
		return value;
	}


	private java.util.List<net.ibizsys.model.control.chart.IPSChartAngleAxis> pschartangleaxises = null;
	public java.util.List<net.ibizsys.model.control.chart.IPSChartAngleAxis> getPSChartAngleAxises(){
		if(this.pschartangleaxises == null){
			com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPSCHARTANGLEAXISES);
			if(value == null){return null;}
			com.fasterxml.jackson.databind.node.ArrayNode arrayNode = (com.fasterxml.jackson.databind.node.ArrayNode)value;
			if(arrayNode.size() == 0){return null;}
			java.util.List<net.ibizsys.model.control.chart.IPSChartAngleAxis> list = new java.util.ArrayList<net.ibizsys.model.control.chart.IPSChartAngleAxis>();
			for(int i = 0;i<arrayNode.size();i++) {
				net.ibizsys.model.control.chart.IPSChartAngleAxis obj = this.getPSModelObject(net.ibizsys.model.control.chart.IPSChartAngleAxis.class, (com.fasterxml.jackson.databind.node.ObjectNode)arrayNode.get(i),ATTR_GETPSCHARTANGLEAXISES);
				if(obj!=null)list.add(obj);
			}
			this.pschartangleaxises = list;
		}
		return (this.pschartangleaxises.size() == 0)? null : this.pschartangleaxises;
	}

	public net.ibizsys.model.control.chart.IPSChartAngleAxis getPSChartAngleAxis(Object objKey, boolean bTryMode){
		return getPSModelObject(net.ibizsys.model.control.chart.IPSChartAngleAxis.class, this.getPSChartAngleAxises(), objKey, bTryMode);
	}
	public void setPSChartAngleAxes(java.util.List<net.ibizsys.model.control.chart.IPSChartAngleAxis> list){
		this.pschartangleaxises = list;
	}

	private java.util.List<net.ibizsys.model.control.chart.IPSChartCoordinateSystem> pschartcoordinatesystems = null;
	public java.util.List<net.ibizsys.model.control.chart.IPSChartCoordinateSystem> getPSChartCoordinateSystems(){
		if(this.pschartcoordinatesystems == null){
			com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPSCHARTCOORDINATESYSTEMS);
			if(value == null){return null;}
			com.fasterxml.jackson.databind.node.ArrayNode arrayNode = (com.fasterxml.jackson.databind.node.ArrayNode)value;
			if(arrayNode.size() == 0){return null;}
			java.util.List<net.ibizsys.model.control.chart.IPSChartCoordinateSystem> list = new java.util.ArrayList<net.ibizsys.model.control.chart.IPSChartCoordinateSystem>();
			for(int i = 0;i<arrayNode.size();i++) {
				net.ibizsys.model.control.chart.IPSChartCoordinateSystem obj = this.getPSModelObject(net.ibizsys.model.control.chart.IPSChartCoordinateSystem.class, (com.fasterxml.jackson.databind.node.ObjectNode)arrayNode.get(i),ATTR_GETPSCHARTCOORDINATESYSTEMS);
				if(obj!=null)list.add(obj);
			}
			this.pschartcoordinatesystems = list;
		}
		return (this.pschartcoordinatesystems.size() == 0)? null : this.pschartcoordinatesystems;
	}

	public net.ibizsys.model.control.chart.IPSChartCoordinateSystem getPSChartCoordinateSystem(Object objKey, boolean bTryMode){
		return getPSModelObject(net.ibizsys.model.control.chart.IPSChartCoordinateSystem.class, this.getPSChartCoordinateSystems(), objKey, bTryMode);
	}
	public void setPSChartCoordinateSystems(java.util.List<net.ibizsys.model.control.chart.IPSChartCoordinateSystem> list){
		this.pschartcoordinatesystems = list;
	}

	private java.util.List<net.ibizsys.model.control.chart.IPSChartDataSetGroup> pschartdatasetgroups = null;
	public java.util.List<net.ibizsys.model.control.chart.IPSChartDataSetGroup> getPSChartDataSetGroups(){
		if(this.pschartdatasetgroups == null){
			com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPSCHARTDATASETGROUPS);
			if(value == null){return null;}
			com.fasterxml.jackson.databind.node.ArrayNode arrayNode = (com.fasterxml.jackson.databind.node.ArrayNode)value;
			if(arrayNode.size() == 0){return null;}
			java.util.List<net.ibizsys.model.control.chart.IPSChartDataSetGroup> list = new java.util.ArrayList<net.ibizsys.model.control.chart.IPSChartDataSetGroup>();
			for(int i = 0;i<arrayNode.size();i++) {
				net.ibizsys.model.control.chart.IPSChartDataSetGroup obj = this.getPSModelObject(net.ibizsys.model.control.chart.IPSChartDataSetGroup.class, (com.fasterxml.jackson.databind.node.ObjectNode)arrayNode.get(i),ATTR_GETPSCHARTDATASETGROUPS);
				if(obj!=null)list.add(obj);
			}
			this.pschartdatasetgroups = list;
		}
		return (this.pschartdatasetgroups.size() == 0)? null : this.pschartdatasetgroups;
	}

	public net.ibizsys.model.control.chart.IPSChartDataSetGroup getPSChartDataSetGroup(Object objKey, boolean bTryMode){
		return getPSModelObject(net.ibizsys.model.control.chart.IPSChartDataSetGroup.class, this.getPSChartDataSetGroups(), objKey, bTryMode);
	}
	public void setPSChartDataSetGroups(java.util.List<net.ibizsys.model.control.chart.IPSChartDataSetGroup> list){
		this.pschartdatasetgroups = list;
	}

	private java.util.List<net.ibizsys.model.control.chart.IPSChartDataSet> pschartdatasets = null;
	public java.util.List<net.ibizsys.model.control.chart.IPSChartDataSet> getPSChartDataSets(){
		if(this.pschartdatasets == null){
			com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPSCHARTDATASETS);
			if(value == null){return null;}
			com.fasterxml.jackson.databind.node.ArrayNode arrayNode = (com.fasterxml.jackson.databind.node.ArrayNode)value;
			if(arrayNode.size() == 0){return null;}
			java.util.List<net.ibizsys.model.control.chart.IPSChartDataSet> list = new java.util.ArrayList<net.ibizsys.model.control.chart.IPSChartDataSet>();
			for(int i = 0;i<arrayNode.size();i++) {
				net.ibizsys.model.control.chart.IPSChartDataSet obj = this.getPSModelObject(net.ibizsys.model.control.chart.IPSChartDataSet.class, (com.fasterxml.jackson.databind.node.ObjectNode)arrayNode.get(i),ATTR_GETPSCHARTDATASETS);
				if(obj!=null)list.add(obj);
			}
			this.pschartdatasets = list;
		}
		return (this.pschartdatasets.size() == 0)? null : this.pschartdatasets;
	}

	public net.ibizsys.model.control.chart.IPSChartDataSet getPSChartDataSet(Object objKey, boolean bTryMode){
		return getPSModelObject(net.ibizsys.model.control.chart.IPSChartDataSet.class, this.getPSChartDataSets(), objKey, bTryMode);
	}
	public void setPSChartDataSets(java.util.List<net.ibizsys.model.control.chart.IPSChartDataSet> list){
		this.pschartdatasets = list;
	}

	private java.util.List<net.ibizsys.model.control.chart.IPSChartGrid> pschartgrids = null;
	public java.util.List<net.ibizsys.model.control.chart.IPSChartGrid> getPSChartGrids(){
		if(this.pschartgrids == null){
			com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPSCHARTGRIDS);
			if(value == null){return null;}
			com.fasterxml.jackson.databind.node.ArrayNode arrayNode = (com.fasterxml.jackson.databind.node.ArrayNode)value;
			if(arrayNode.size() == 0){return null;}
			java.util.List<net.ibizsys.model.control.chart.IPSChartGrid> list = new java.util.ArrayList<net.ibizsys.model.control.chart.IPSChartGrid>();
			for(int i = 0;i<arrayNode.size();i++) {
				net.ibizsys.model.control.chart.IPSChartGrid obj = this.getPSModelObject(net.ibizsys.model.control.chart.IPSChartGrid.class, (com.fasterxml.jackson.databind.node.ObjectNode)arrayNode.get(i),ATTR_GETPSCHARTGRIDS);
				if(obj!=null)list.add(obj);
			}
			this.pschartgrids = list;
		}
		return (this.pschartgrids.size() == 0)? null : this.pschartgrids;
	}

	public net.ibizsys.model.control.chart.IPSChartGrid getPSChartGrid(Object objKey, boolean bTryMode){
		return getPSModelObject(net.ibizsys.model.control.chart.IPSChartGrid.class, this.getPSChartGrids(), objKey, bTryMode);
	}
	public void setPSChartGrids(java.util.List<net.ibizsys.model.control.chart.IPSChartGrid> list){
		this.pschartgrids = list;
	}

	private java.util.List<net.ibizsys.model.control.chart.IPSChartParallelAxis> pschartparallelaxises = null;
	public java.util.List<net.ibizsys.model.control.chart.IPSChartParallelAxis> getPSChartParallelAxises(){
		if(this.pschartparallelaxises == null){
			com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPSCHARTPARALLELAXISES);
			if(value == null){return null;}
			com.fasterxml.jackson.databind.node.ArrayNode arrayNode = (com.fasterxml.jackson.databind.node.ArrayNode)value;
			if(arrayNode.size() == 0){return null;}
			java.util.List<net.ibizsys.model.control.chart.IPSChartParallelAxis> list = new java.util.ArrayList<net.ibizsys.model.control.chart.IPSChartParallelAxis>();
			for(int i = 0;i<arrayNode.size();i++) {
				net.ibizsys.model.control.chart.IPSChartParallelAxis obj = this.getPSModelObject(net.ibizsys.model.control.chart.IPSChartParallelAxis.class, (com.fasterxml.jackson.databind.node.ObjectNode)arrayNode.get(i),ATTR_GETPSCHARTPARALLELAXISES);
				if(obj!=null)list.add(obj);
			}
			this.pschartparallelaxises = list;
		}
		return (this.pschartparallelaxises.size() == 0)? null : this.pschartparallelaxises;
	}

	public net.ibizsys.model.control.chart.IPSChartParallelAxis getPSChartParallelAxis(Object objKey, boolean bTryMode){
		return getPSModelObject(net.ibizsys.model.control.chart.IPSChartParallelAxis.class, this.getPSChartParallelAxises(), objKey, bTryMode);
	}
	public void setPSChartParallelAxes(java.util.List<net.ibizsys.model.control.chart.IPSChartParallelAxis> list){
		this.pschartparallelaxises = list;
	}

	private java.util.List<net.ibizsys.model.control.chart.IPSChartParallel> pschartparallels = null;
	public java.util.List<net.ibizsys.model.control.chart.IPSChartParallel> getPSChartParallels(){
		if(this.pschartparallels == null){
			com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPSCHARTPARALLELS);
			if(value == null){return null;}
			com.fasterxml.jackson.databind.node.ArrayNode arrayNode = (com.fasterxml.jackson.databind.node.ArrayNode)value;
			if(arrayNode.size() == 0){return null;}
			java.util.List<net.ibizsys.model.control.chart.IPSChartParallel> list = new java.util.ArrayList<net.ibizsys.model.control.chart.IPSChartParallel>();
			for(int i = 0;i<arrayNode.size();i++) {
				net.ibizsys.model.control.chart.IPSChartParallel obj = this.getPSModelObject(net.ibizsys.model.control.chart.IPSChartParallel.class, (com.fasterxml.jackson.databind.node.ObjectNode)arrayNode.get(i),ATTR_GETPSCHARTPARALLELS);
				if(obj!=null)list.add(obj);
			}
			this.pschartparallels = list;
		}
		return (this.pschartparallels.size() == 0)? null : this.pschartparallels;
	}

	public net.ibizsys.model.control.chart.IPSChartParallel getPSChartParallel(Object objKey, boolean bTryMode){
		return getPSModelObject(net.ibizsys.model.control.chart.IPSChartParallel.class, this.getPSChartParallels(), objKey, bTryMode);
	}
	public void setPSChartParallels(java.util.List<net.ibizsys.model.control.chart.IPSChartParallel> list){
		this.pschartparallels = list;
	}

	private java.util.List<net.ibizsys.model.control.chart.IPSChartPolar> pschartpolars = null;
	public java.util.List<net.ibizsys.model.control.chart.IPSChartPolar> getPSChartPolars(){
		if(this.pschartpolars == null){
			com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPSCHARTPOLARS);
			if(value == null){return null;}
			com.fasterxml.jackson.databind.node.ArrayNode arrayNode = (com.fasterxml.jackson.databind.node.ArrayNode)value;
			if(arrayNode.size() == 0){return null;}
			java.util.List<net.ibizsys.model.control.chart.IPSChartPolar> list = new java.util.ArrayList<net.ibizsys.model.control.chart.IPSChartPolar>();
			for(int i = 0;i<arrayNode.size();i++) {
				net.ibizsys.model.control.chart.IPSChartPolar obj = this.getPSModelObject(net.ibizsys.model.control.chart.IPSChartPolar.class, (com.fasterxml.jackson.databind.node.ObjectNode)arrayNode.get(i),ATTR_GETPSCHARTPOLARS);
				if(obj!=null)list.add(obj);
			}
			this.pschartpolars = list;
		}
		return (this.pschartpolars.size() == 0)? null : this.pschartpolars;
	}

	public net.ibizsys.model.control.chart.IPSChartPolar getPSChartPolar(Object objKey, boolean bTryMode){
		return getPSModelObject(net.ibizsys.model.control.chart.IPSChartPolar.class, this.getPSChartPolars(), objKey, bTryMode);
	}
	public void setPSChartPolars(java.util.List<net.ibizsys.model.control.chart.IPSChartPolar> list){
		this.pschartpolars = list;
	}

	private java.util.List<net.ibizsys.model.control.chart.IPSChartRadar> pschartradars = null;
	public java.util.List<net.ibizsys.model.control.chart.IPSChartRadar> getPSChartRadars(){
		if(this.pschartradars == null){
			com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPSCHARTRADARS);
			if(value == null){return null;}
			com.fasterxml.jackson.databind.node.ArrayNode arrayNode = (com.fasterxml.jackson.databind.node.ArrayNode)value;
			if(arrayNode.size() == 0){return null;}
			java.util.List<net.ibizsys.model.control.chart.IPSChartRadar> list = new java.util.ArrayList<net.ibizsys.model.control.chart.IPSChartRadar>();
			for(int i = 0;i<arrayNode.size();i++) {
				net.ibizsys.model.control.chart.IPSChartRadar obj = this.getPSModelObject(net.ibizsys.model.control.chart.IPSChartRadar.class, (com.fasterxml.jackson.databind.node.ObjectNode)arrayNode.get(i),ATTR_GETPSCHARTRADARS);
				if(obj!=null)list.add(obj);
			}
			this.pschartradars = list;
		}
		return (this.pschartradars.size() == 0)? null : this.pschartradars;
	}

	public net.ibizsys.model.control.chart.IPSChartRadar getPSChartRadar(Object objKey, boolean bTryMode){
		return getPSModelObject(net.ibizsys.model.control.chart.IPSChartRadar.class, this.getPSChartRadars(), objKey, bTryMode);
	}
	public void setPSChartRadars(java.util.List<net.ibizsys.model.control.chart.IPSChartRadar> list){
		this.pschartradars = list;
	}

	private java.util.List<net.ibizsys.model.control.chart.IPSChartRadiusAxis> pschartradiusaxises = null;
	public java.util.List<net.ibizsys.model.control.chart.IPSChartRadiusAxis> getPSChartRadiusAxises(){
		if(this.pschartradiusaxises == null){
			com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPSCHARTRADIUSAXISES);
			if(value == null){return null;}
			com.fasterxml.jackson.databind.node.ArrayNode arrayNode = (com.fasterxml.jackson.databind.node.ArrayNode)value;
			if(arrayNode.size() == 0){return null;}
			java.util.List<net.ibizsys.model.control.chart.IPSChartRadiusAxis> list = new java.util.ArrayList<net.ibizsys.model.control.chart.IPSChartRadiusAxis>();
			for(int i = 0;i<arrayNode.size();i++) {
				net.ibizsys.model.control.chart.IPSChartRadiusAxis obj = this.getPSModelObject(net.ibizsys.model.control.chart.IPSChartRadiusAxis.class, (com.fasterxml.jackson.databind.node.ObjectNode)arrayNode.get(i),ATTR_GETPSCHARTRADIUSAXISES);
				if(obj!=null)list.add(obj);
			}
			this.pschartradiusaxises = list;
		}
		return (this.pschartradiusaxises.size() == 0)? null : this.pschartradiusaxises;
	}

	public net.ibizsys.model.control.chart.IPSChartRadiusAxis getPSChartRadiusAxis(Object objKey, boolean bTryMode){
		return getPSModelObject(net.ibizsys.model.control.chart.IPSChartRadiusAxis.class, this.getPSChartRadiusAxises(), objKey, bTryMode);
	}
	public void setPSChartRadiusAxes(java.util.List<net.ibizsys.model.control.chart.IPSChartRadiusAxis> list){
		this.pschartradiusaxises = list;
	}

	private java.util.List<net.ibizsys.model.control.chart.IPSChartSingleAxis> pschartsingleaxises = null;
	public java.util.List<net.ibizsys.model.control.chart.IPSChartSingleAxis> getPSChartSingleAxises(){
		if(this.pschartsingleaxises == null){
			com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPSCHARTSINGLEAXISES);
			if(value == null){return null;}
			com.fasterxml.jackson.databind.node.ArrayNode arrayNode = (com.fasterxml.jackson.databind.node.ArrayNode)value;
			if(arrayNode.size() == 0){return null;}
			java.util.List<net.ibizsys.model.control.chart.IPSChartSingleAxis> list = new java.util.ArrayList<net.ibizsys.model.control.chart.IPSChartSingleAxis>();
			for(int i = 0;i<arrayNode.size();i++) {
				net.ibizsys.model.control.chart.IPSChartSingleAxis obj = this.getPSModelObject(net.ibizsys.model.control.chart.IPSChartSingleAxis.class, (com.fasterxml.jackson.databind.node.ObjectNode)arrayNode.get(i),ATTR_GETPSCHARTSINGLEAXISES);
				if(obj!=null)list.add(obj);
			}
			this.pschartsingleaxises = list;
		}
		return (this.pschartsingleaxises.size() == 0)? null : this.pschartsingleaxises;
	}

	public net.ibizsys.model.control.chart.IPSChartSingleAxis getPSChartSingleAxis(Object objKey, boolean bTryMode){
		return getPSModelObject(net.ibizsys.model.control.chart.IPSChartSingleAxis.class, this.getPSChartSingleAxises(), objKey, bTryMode);
	}
	public void setPSChartSingleAxes(java.util.List<net.ibizsys.model.control.chart.IPSChartSingleAxis> list){
		this.pschartsingleaxises = list;
	}

	private java.util.List<net.ibizsys.model.control.chart.IPSChartSingle> pschartsingles = null;
	public java.util.List<net.ibizsys.model.control.chart.IPSChartSingle> getPSChartSingles(){
		if(this.pschartsingles == null){
			com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPSCHARTSINGLES);
			if(value == null){return null;}
			com.fasterxml.jackson.databind.node.ArrayNode arrayNode = (com.fasterxml.jackson.databind.node.ArrayNode)value;
			if(arrayNode.size() == 0){return null;}
			java.util.List<net.ibizsys.model.control.chart.IPSChartSingle> list = new java.util.ArrayList<net.ibizsys.model.control.chart.IPSChartSingle>();
			for(int i = 0;i<arrayNode.size();i++) {
				net.ibizsys.model.control.chart.IPSChartSingle obj = this.getPSModelObject(net.ibizsys.model.control.chart.IPSChartSingle.class, (com.fasterxml.jackson.databind.node.ObjectNode)arrayNode.get(i),ATTR_GETPSCHARTSINGLES);
				if(obj!=null)list.add(obj);
			}
			this.pschartsingles = list;
		}
		return (this.pschartsingles.size() == 0)? null : this.pschartsingles;
	}

	public net.ibizsys.model.control.chart.IPSChartSingle getPSChartSingle(Object objKey, boolean bTryMode){
		return getPSModelObject(net.ibizsys.model.control.chart.IPSChartSingle.class, this.getPSChartSingles(), objKey, bTryMode);
	}
	public void setPSChartSingles(java.util.List<net.ibizsys.model.control.chart.IPSChartSingle> list){
		this.pschartsingles = list;
	}

	private java.util.List<net.ibizsys.model.control.chart.IPSChartXAxis> pschartxaxises = null;
	public java.util.List<net.ibizsys.model.control.chart.IPSChartXAxis> getPSChartXAxises(){
		if(this.pschartxaxises == null){
			com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPSCHARTXAXISES);
			if(value == null){return null;}
			com.fasterxml.jackson.databind.node.ArrayNode arrayNode = (com.fasterxml.jackson.databind.node.ArrayNode)value;
			if(arrayNode.size() == 0){return null;}
			java.util.List<net.ibizsys.model.control.chart.IPSChartXAxis> list = new java.util.ArrayList<net.ibizsys.model.control.chart.IPSChartXAxis>();
			for(int i = 0;i<arrayNode.size();i++) {
				net.ibizsys.model.control.chart.IPSChartXAxis obj = this.getPSModelObject(net.ibizsys.model.control.chart.IPSChartXAxis.class, (com.fasterxml.jackson.databind.node.ObjectNode)arrayNode.get(i),ATTR_GETPSCHARTXAXISES);
				if(obj!=null)list.add(obj);
			}
			this.pschartxaxises = list;
		}
		return (this.pschartxaxises.size() == 0)? null : this.pschartxaxises;
	}

	public net.ibizsys.model.control.chart.IPSChartXAxis getPSChartXAxis(Object objKey, boolean bTryMode){
		return getPSModelObject(net.ibizsys.model.control.chart.IPSChartXAxis.class, this.getPSChartXAxises(), objKey, bTryMode);
	}
	public void setPSChartXAxes(java.util.List<net.ibizsys.model.control.chart.IPSChartXAxis> list){
		this.pschartxaxises = list;
	}

	private java.util.List<net.ibizsys.model.control.chart.IPSChartYAxis> pschartyaxises = null;
	public java.util.List<net.ibizsys.model.control.chart.IPSChartYAxis> getPSChartYAxises(){
		if(this.pschartyaxises == null){
			com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPSCHARTYAXISES);
			if(value == null){return null;}
			com.fasterxml.jackson.databind.node.ArrayNode arrayNode = (com.fasterxml.jackson.databind.node.ArrayNode)value;
			if(arrayNode.size() == 0){return null;}
			java.util.List<net.ibizsys.model.control.chart.IPSChartYAxis> list = new java.util.ArrayList<net.ibizsys.model.control.chart.IPSChartYAxis>();
			for(int i = 0;i<arrayNode.size();i++) {
				net.ibizsys.model.control.chart.IPSChartYAxis obj = this.getPSModelObject(net.ibizsys.model.control.chart.IPSChartYAxis.class, (com.fasterxml.jackson.databind.node.ObjectNode)arrayNode.get(i),ATTR_GETPSCHARTYAXISES);
				if(obj!=null)list.add(obj);
			}
			this.pschartyaxises = list;
		}
		return (this.pschartyaxises.size() == 0)? null : this.pschartyaxises;
	}

	public net.ibizsys.model.control.chart.IPSChartYAxis getPSChartYAxis(Object objKey, boolean bTryMode){
		return getPSModelObject(net.ibizsys.model.control.chart.IPSChartYAxis.class, this.getPSChartYAxises(), objKey, bTryMode);
	}
	public void setPSChartYAxes(java.util.List<net.ibizsys.model.control.chart.IPSChartYAxis> list){
		this.pschartyaxises = list;
	}
}