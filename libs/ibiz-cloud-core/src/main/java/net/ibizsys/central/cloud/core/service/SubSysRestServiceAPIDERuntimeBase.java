package net.ibizsys.central.cloud.core.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.Pageable;
import org.springframework.util.ObjectUtils;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.node.ArrayNode;
import com.fasterxml.jackson.databind.node.ObjectNode;

import net.ibizsys.central.cloud.core.util.RestUtils;
import net.ibizsys.central.dataentity.IDataEntityRuntime;
import net.ibizsys.central.service.SubSysServiceAPIDERuntime;
import net.ibizsys.central.service.client.IWebClientRep;
import net.ibizsys.central.util.IEntityDTO;
import net.ibizsys.central.util.ISearchContext;
import net.ibizsys.model.PSModelEnums.DEMethodReturnType;
import net.ibizsys.model.dataentity.action.IPSDEAction;
import net.ibizsys.model.dataentity.ds.IPSDEDataSet;
import net.ibizsys.model.dataentity.service.IPSDEMethodDTO;
import net.ibizsys.model.service.IPSSubSysServiceAPIDEMethod;
import net.ibizsys.runtime.util.DataTypeUtils;
import net.ibizsys.runtime.util.JsonUtils;

public abstract class SubSysRestServiceAPIDERuntimeBase extends SubSysServiceAPIDERuntime {

	private static final org.apache.commons.logging.Log log = org.apache.commons.logging.LogFactory.getLog(SubSysRestServiceAPIDERuntimeBase.class);
	
	/**
	 * Spring 分页对象属性：总数
	 */
	public final static String PAGE_TOTAL = "total";
	
	/**
	 * Spring 分页对象属性：内容
	 */
	public final static String PAGE_CONTENT = "content";
	
	
//	@Override
//	protected Object onWebClientExecute(IPSSubSysServiceAPIDEMethod iPSSubSysServiceAPIDEMethod, String strRequestPath, Map<String, ?> uriParams, Map<String, ?> headers, Map<String, ?> queries, Object objData, Object objTag) throws Throwable {
//		Object ret = super.onWebClientExecute(iPSSubSysServiceAPIDEMethod, strRequestPath, uriParams, headers, queries, objData, objTag);
//		if(ret instanceof IWebClientRep) {
//			return ((IWebClientRep)ret).getBody();
//		}
//		return ret;
//	}

	@Override
	protected Object onInvokeMethod(IPSSubSysServiceAPIDEMethod iPSSubSysServiceAPIDEMethod, Map<String, Object> context, IDataEntityRuntime iDataEntityRuntime, IPSDEAction iPSDEAction, Object[] args) throws Throwable {
		Object ret = super.onInvokeMethod(iPSSubSysServiceAPIDEMethod, context, iDataEntityRuntime, iPSDEAction, args);
		if(ret instanceof IWebClientRep) {
			Object body =  ((IWebClientRep)ret).getBody();
			if(ObjectUtils.isEmpty(body)
					|| iDataEntityRuntime == null
					|| iPSDEAction == null){
				return body;
			}
			
			String strRetType = iPSDEAction.getPSDEActionReturnMust().getType();
			
			if(DEMethodReturnType.VOID.value.equals(strRetType)) {
				IPSDEMethodDTO iPSDEMethodDTO = iDataEntityRuntime.getDefaultPSDEMethodDTO();
				if(iPSDEMethodDTO != null) {
					Map map = JsonUtils.asMap(body);
					return iDataEntityRuntime.getDEMethodDTO(iPSDEMethodDTO, map, isDTOData());
				}
				return null;
			}
			
			if(DEMethodReturnType.DTO.value.equals(strRetType)) {
				IPSDEMethodDTO iPSDEMethodDTO = iPSDEAction.getPSDEActionReturnMust().getPSDEMethodDTOMust();
				Map map = JsonUtils.asMap(body);
				return iDataEntityRuntime.getDEMethodDTO(iPSDEMethodDTO, map, isDTOData());
			}
			
			if(DEMethodReturnType.DTOS.value.equals(strRetType)) {
				List<IEntityDTO> entityList = new ArrayList<IEntityDTO>();
				List list = JsonUtils.asList(body);
				if(!ObjectUtils.isEmpty(list)) {
					IPSDEMethodDTO iPSDEMethodDTO = iPSDEAction.getPSDEActionReturnMust().getPSDEMethodDTOMust();
					for(Object map : list) {
						IEntityDTO iEntityDTO = (IEntityDTO) iDataEntityRuntime.getDEMethodDTO(iPSDEMethodDTO, map, isDTOData());
						entityList.add(iEntityDTO);
					}
				}
				return entityList;
			}
			
			if(DEMethodReturnType.SIMPLE.value.equals(strRetType)) {
				return DataTypeUtils.parse(iPSDEAction.getPSDEActionReturnMust().getStdDataType(), body.toString());
			}
			
			if(DEMethodReturnType.SIMPLES.value.equals(strRetType)) {
				List<Object> valueList = new ArrayList<Object>();
				List list = JsonUtils.asList(body);
				if(!ObjectUtils.isEmpty(list)) {
					for(Object item : list) {
						if(item!=null) {
							Object value = DataTypeUtils.parse(iPSDEAction.getPSDEActionReturnMust().getStdDataType(), item.toString());
							valueList.add(value);
						}
						else {
							valueList.add(null);
						}
					}
				}
				return valueList;
			}
			
			return body;
		}
		
		return ret;
	}
	
	@Override
	protected Object onInvokeMethod(IPSSubSysServiceAPIDEMethod iPSSubSysServiceAPIDEMethod, Map<String, Object> context, IDataEntityRuntime iDataEntityRuntime, IPSDEDataSet iPSDEDataSet, Object[] args) throws Throwable {
		Object ret =  super.onInvokeMethod(iPSSubSysServiceAPIDEMethod, context, iDataEntityRuntime, iPSDEDataSet, args);
		if(ret instanceof IWebClientRep) {
			IWebClientRep rep = (IWebClientRep)ret;
			Object body = rep.getBody();
			if(ObjectUtils.isEmpty(body)
					|| iDataEntityRuntime == null
					|| iPSDEDataSet == null){
				return body;
			}
			
			String strRetType = iPSDEDataSet.getPSDEDataSetReturnMust().getType();
			if(DEMethodReturnType.PAGE.value.equals(strRetType)
					||DEMethodReturnType.DTOS.value.equals(strRetType)) {
				long total = -1;
				ArrayNode listNode = null;
				//判断是否为page的序列化结果
				JsonNode jsonNode = JsonUtils.toJsonNode(body);
				if(jsonNode instanceof ArrayNode) {
					listNode = (ArrayNode)jsonNode;
					total = DataTypeUtils.getIntegerValue(rep.getHeader(RestUtils.HEADER_X_TOTAL), 0);
				}
				else
					if(jsonNode instanceof ObjectNode) {
						ObjectNode objectNode = (ObjectNode)jsonNode;
						if(objectNode.has(PAGE_TOTAL)) {
							total = objectNode.get(PAGE_TOTAL).asLong(-1);
						}
						if(objectNode.has(PAGE_CONTENT)) {
							JsonNode node = objectNode.get(PAGE_CONTENT);
							if(node instanceof ArrayNode) {
								listNode = (ArrayNode)node;
							}
						}
					}
						
				if(listNode != null) {
					List<IEntityDTO> entityDTOList = new ArrayList<IEntityDTO>();
					IPSDEMethodDTO iPSDEMethodDTO = iPSDEDataSet.getPSDEDataSetReturnMust().getPSDEMethodDTOMust();
					for(JsonNode node : listNode) {
						IEntityDTO iEntityDTO = (IEntityDTO)iDataEntityRuntime.getDEMethodDTO(iPSDEMethodDTO, JsonUtils.asMap(node), isDTOData());
						entityDTOList.add(iEntityDTO);
					}
					
					if(DEMethodReturnType.PAGE.value.equals(strRetType)) {
						if(total <= 0) {
							total = entityDTOList.size();
						}
						if(args.length>0 &&  args[0] instanceof ISearchContext) {
							return new PageImpl<IEntityDTO>(entityDTOList, ((ISearchContext)args[0]).getPageable(), total);
						}
						else {
							return new PageImpl<IEntityDTO>(entityDTOList, Pageable.unpaged(), total);
						}
					}
					if(DEMethodReturnType.DTOS.value.equals(strRetType)) {
						return entityDTOList;
					}
				}
			
				return body;
			}

			return body;
		}
		return ret;
	}
	
	@Override
	protected boolean isDTOData() {
		return true;
	}
}
