package net.ibizsys.central.plugin.util.dataentity.ds.util;

import java.util.List;

import org.springframework.util.ObjectUtils;

import com.fasterxml.jackson.databind.node.ArrayNode;
import com.fasterxml.jackson.databind.node.ObjectNode;

import net.ibizsys.central.dataentity.IDataEntityRuntime;
import net.ibizsys.model.IPSModelObjectRuntime;
import net.ibizsys.model.dataentity.IPSDataEntity;
import net.ibizsys.model.dataentity.ds.IPSDEDataQuery;
import net.ibizsys.model.dataentity.ds.PSDEDQColumnImpl;
import net.ibizsys.model.dataentity.ds.PSDEDQMainImpl;
import net.ibizsys.runtime.util.JsonUtils;



/**
 * 简单实体查询连接实现对象
 * @author Administrator
 *
 */
public class SimplePSDEDQMainImpl extends PSDEDQMainImpl {

	private IPSDataEntity iPSDataEntity = null;
	private IPSDEDataQuery iPSDEDataQuery = null;
	private IDataEntityRuntime iDataEntityRuntime = null;
	
	public void init(IDataEntityRuntime iDataEntityRuntime, List<String> psDEDQColumnList)throws Exception{
		this.iDataEntityRuntime = iDataEntityRuntime;
		this.iPSDataEntity = iDataEntityRuntime.getPSDataEntity();
		//this.psDEDQColumnList = psDEDQColumnList;
		if(this.iDataEntityRuntime.getDefaultPSDEDataQuery()!=null) {
			iPSDEDataQuery = this.iDataEntityRuntime.getDefaultPSDEDataQuery();
		}
		else {
			iPSDEDataQuery = this.iDataEntityRuntime.getViewPSDEDataQuery();
		}
		if(getPSDEDataQuery()==null) {
			throw new Exception(String.format("实体[%1$s]没有定义数据查询",this.iPSDataEntity.getName()));
		}
		
		ObjectNode objectNode = JsonUtils.createObjectNode();
		objectNode.put(PSDEDQMainImpl.ATTR_GETJOINTYPE, "MAIN");
		
		if(!ObjectUtils.isEmpty(psDEDQColumnList)) {
			ArrayNode columnsNode = objectNode.putArray(PSDEDQMainImpl.ATTR_GETSELECTEDPSDEDQCOLUMNS);
			for(String strColumn : psDEDQColumnList) {
				ObjectNode columnNode = columnsNode.addObject();
				columnNode.put(PSDEDQColumnImpl.ATTR_GETID, strColumn);
				columnNode.put(PSDEDQColumnImpl.ATTR_GETNAME, strColumn);
			}
		}
		
		this.init(iDataEntityRuntime.getSystemRuntime().getPSSystemService(), (IPSModelObjectRuntime) iPSDEDataQuery, objectNode);
	}
	

	@Override
	public IPSDEDataQuery getPSDEDataQuery() {
		return this.iPSDEDataQuery;
	}


	@Override
	public IPSDataEntity getJoinPSDataEntity() {
		return this.iPSDataEntity;
	}


}
