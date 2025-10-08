package cn.ibizlab.central.plugin.odoo.service;

import static java.util.Arrays.asList;

import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.xmlrpc.client.XmlRpcClient;
import org.apache.xmlrpc.client.XmlRpcClientConfigImpl;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.Pageable;
import org.springframework.util.ObjectUtils;
import org.springframework.util.StringUtils;

import net.ibizsys.central.dataentity.IDataEntityRuntime;
import net.ibizsys.central.service.SubSysServiceAPIDERuntime;
import net.ibizsys.central.util.IEntityDTO;
import net.ibizsys.central.util.ISearchContext;
import net.ibizsys.model.dataentity.ds.IPSDEDataSet;
import net.ibizsys.model.dataentity.service.IPSDEMethodDTO;
import net.ibizsys.model.dataentity.service.IPSDEMethodDTOField;
import net.ibizsys.model.service.IPSSubSysServiceAPIDEMethod;
import net.ibizsys.runtime.dataentity.defield.DEFDataTypes;
import net.ibizsys.runtime.util.DataTypeUtils;

public class OdooSubSysServiceAPIDERuntime extends SubSysServiceAPIDERuntime {

	@Override
	protected Object onInvokeMethod(IPSSubSysServiceAPIDEMethod iPSSubSysServiceAPIDEMethod, Map<String, Object> context, IDataEntityRuntime iDataEntityRuntime, IPSDEDataSet iPSDEDataSet, Object[] args) throws Throwable {

		String strTag = iDataEntityRuntime.getPSDataEntity().getDETag();
		if(!StringUtils.hasLength(strTag)) {
			throw new Exception(String.format("实体[%1$s]未定义Odoo模型标记", iDataEntityRuntime.getPSDataEntity().getName()));
		}
		
		ISearchContext iSearchContext2 = null;
		if (args != null && args.length > 0 && args[0] instanceof ISearchContext) {
			iSearchContext2 = (ISearchContext) args[0];
		}
		
		if(iSearchContext2 == null) {
			throw new Exception(String.format("查询条件无效"));
		}
		
		ISearchContext iSearchContext= iSearchContext2;
		//

		// 列出Odoo实体
		String url = this.getSubSysServiceAPIRuntime().getServiceUrl();
		String db = "";// openAccess.getRegionId();
		String username = this.getSubSysServiceAPIRuntime().getClientId();
		String password = this.getSubSysServiceAPIRuntime().getClientSecret();
		final XmlRpcClient client = new XmlRpcClient() {
			{
				setConfig(new XmlRpcClientConfigImpl() {
					{
						setServerURL(new URL(String.format("%s/xmlrpc/2/common", url)));
					}
				});
			}
		};

		int uid = (int) client.execute("authenticate", Arrays.asList(db, username, password, new HashMap<>()));

		final XmlRpcClient models = new XmlRpcClient() {
			{
				setConfig(new XmlRpcClientConfigImpl() {
					{
						setServerURL(new URL(String.format("%s/xmlrpc/2/object", url)));
					}
				});
			}
		};
		
		List<String> fieldList = new ArrayList<String>();
		
		IPSDEMethodDTO iPSDEMethodDTO =	iPSDEDataSet.getPSDEDataSetReturnMust().getPSDEMethodDTO();
		if(iPSDEMethodDTO == null) {
			iPSDEMethodDTO = iDataEntityRuntime.getDefaultPSDEMethodDTO();
		}
		if(iPSDEMethodDTO != null) {
			List<IPSDEMethodDTOField> list = iPSDEMethodDTO.getPSDEMethodDTOFields();
			if(list != null) {
				for(IPSDEMethodDTOField iPSDEMethodDTOField : list) {
					if(iPSDEMethodDTOField.getRefPSDEMethodDTO() != null) {
						continue;
					}
					
					//排除外键值文本
					if(iPSDEMethodDTOField.getPSDEField() != null && DEFDataTypes.PICKUPTEXT.equals(iPSDEMethodDTOField.getPSDEField().getDataType())) {
						continue;
					}
					
					
					fieldList.add(iPSDEMethodDTOField.getName().toLowerCase());
				}
			}
		}
		
		
		List list2 = asList((Object[]) models.execute("execute_kw", asList(db, uid, password, strTag, "search_read", asList(getConditionList(iSearchContext)),

				new HashMap() {
					{
						put("fields", fieldList);
						if(iSearchContext.getPageable() != null && iSearchContext.getPageable() != Pageable.unpaged()) {
							put("limit", iSearchContext.getPageable().getPageSize());
						}
					}
				})));
		
		
		List<IEntityDTO> entityDTOList = new ArrayList<IEntityDTO>();
		if(!ObjectUtils.isEmpty(list2)) {
			for(Object objItem :list2) {
				
				Map<String, Object> dataMap = new HashMap<String, Object>();
				
				//重新构建Map
				Map<String, Object> srcMap = (Map<String, Object>)objItem;
				for(java.util.Map.Entry<String, Object> entry : srcMap.entrySet()) {
					
					Object objValue = DataTypeUtils.asSimple(entry.getValue());
					if(objValue == null) {
						continue;
					}
					
					dataMap.put(entry.getKey(), objValue);
				}
				
				
				IEntityDTO iEntityDTO =  (IEntityDTO)iDataEntityRuntime.getDEMethodDTO(iPSDEMethodDTO, dataMap, false);
				entityDTOList.add(iEntityDTO);
			}
		}
		
		
		return new PageImpl<IEntityDTO>(entityDTOList, iSearchContext.getPageable(), entityDTOList.size() );
		
	}
	
	
	protected List getConditionList(ISearchContext iSearchContext) {
		List list = new ArrayList();
		return list;
	}
	
	
	protected int getDataId(Object id) throws Throwable {
		if (id instanceof Integer) {
			return (int) id;
		}
		if (id instanceof Object[]) {
			Object[] values = (Object[]) id;
			if (values.length > 0) {
				return this.getDataId(values[0]);
			}
		}
		if (id != null) {
			return Integer.parseInt(id.toString());
		}
		throw new Exception("数据标识无效");
	}
}
