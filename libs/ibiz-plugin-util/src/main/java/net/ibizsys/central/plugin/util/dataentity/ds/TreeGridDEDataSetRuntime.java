package net.ibizsys.central.plugin.util.dataentity.ds;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.util.ObjectUtils;

import net.ibizsys.central.util.IEntityDTO;
import net.ibizsys.central.util.ISearchContextDTO;
import net.ibizsys.central.util.PageImpl;
import net.ibizsys.model.PSModelEnums.DER1NMasterRS;
import net.ibizsys.model.dataentity.der.IPSDER1N;
import net.ibizsys.model.dataentity.der.IPSDERBase;
import net.ibizsys.runtime.util.DataTypeUtils;

public class TreeGridDEDataSetRuntime extends DEDataSetRuntimeBase {

	private static final org.apache.commons.logging.Log log = org.apache.commons.logging.LogFactory.getLog(TreeGridDEDataSetRuntime.class);
	
	public final static String PARAM_SHOWMODE = "srfshowmode";
	
	/**
	 * 递归模型
	 */
	private IPSDER1N recursivePSDER1N = null;
	
	@Override
	protected void onInit() throws Exception {
		if(getRecursivePSDER1N(true)==null) {
			this.prepareRecursivePSDER1N();
			this.getRecursivePSDER1N();
		}
		super.onInit();
	}
	
	protected void prepareRecursivePSDER1N() throws Exception {
		List<IPSDERBase> psDERBaseList = this.getDataEntityRuntime().getPSDataEntity().getMinorPSDERs();
		if(!ObjectUtils.isEmpty(psDERBaseList)) {
			for(IPSDERBase iPSDERBase : psDERBaseList) {
				if(iPSDERBase instanceof IPSDER1N) {
					IPSDER1N iPSDER1N = (IPSDER1N)iPSDERBase;
					if((DER1NMasterRS.RECURSIVE.value & iPSDER1N.getMasterRS()) == DER1NMasterRS.RECURSIVE.value) {
						this.setRecursivePSDER1N(iPSDER1N);
						break;
					}
				}
			}
		}
	}
	
	protected IPSDER1N getRecursivePSDER1N() throws Exception{
		return this.getRecursivePSDER1N(false);
	}
	
	protected IPSDER1N getRecursivePSDER1N(boolean bTryMode) throws Exception {
		if(this.recursivePSDER1N != null || bTryMode) {
			return this.recursivePSDER1N;
		}
		throw new Exception("递归关系无效");
	}
	

	protected void setRecursivePSDER1N(IPSDER1N recursivePSDER1N) {
		this.recursivePSDER1N = recursivePSDER1N;
	}
	
	
	@Override
	public boolean isValid(Object[] args) {
		if(args!=null && args.length >0 && args[0] instanceof ISearchContextDTO) {
			return isFetchTreeMode((ISearchContextDTO)args[0]);
		}
		return false;
	}
	

	@Override
	protected Page<?> doFetchReal(ISearchContextDTO iSearchContextDTO) throws Throwable {
		
		if (this.getDataEntityRuntime().getSystemPersistentAdapter() == null) {
			throw new Exception("实体未提供系统持久化设置器");
		}

		//备份分页信息
		Pageable pageable = iSearchContextDTO.getPageable();
		
		iSearchContextDTO.setPageable(ISearchContextDTO.STARTPAGE, this.getFetchTreeMaxSize(), 0);
		Page<?> ret = this.getDataEntityRuntime().getSystemPersistentAdapter().fetchDataSet(this.getDataEntityRuntime(), this.getPSDEDataSet(), iSearchContextDTO, null);
		Page<IEntityDTO> page = this.getDataEntityRuntime().getEntityDTOPage(ret, this.getPSDEDataSet(), iSearchContextDTO.getPageable());
		
		//选拔
		String strPickupFieldName = getRecursivePSDER1N().getPSPickupDEFieldMust().getLowerCaseName();
		String strKeyFieldName = this.getDataEntityRuntime().getKeyPSDEField().getLowerCaseName();
		
		Map<Object, IEntityDTO> entityDTOMap = new LinkedHashMap<Object, IEntityDTO>();
		MultiValueMap<Object, IEntityDTO> entityDTOListMap = new LinkedMultiValueMap<Object, IEntityDTO>();
		for(IEntityDTO iEntityDTO : page.getContent()) {
			Object objKeyValue = iEntityDTO.get(strKeyFieldName);
			if(ObjectUtils.isEmpty(objKeyValue)) {
				throw new Exception(String.format("填充数据对象成员数据发生异常，传入数据未指定主键"));
			}
			entityDTOMap.put(objKeyValue, iEntityDTO);
			Object parentId = iEntityDTO.get(strPickupFieldName);
			if(ObjectUtils.isEmpty(parentId)) {
				continue;
			}
			entityDTOListMap.add(parentId, iEntityDTO);
		}
		
		//重新组织列表
		Map<Object, IEntityDTO> entityDTORemoveMap = new LinkedHashMap<Object, IEntityDTO>();
		List<IEntityDTO> entityDTOList = new ArrayList<IEntityDTO>();
		for(IEntityDTO iEntityDTO : page.getContent()) {
			Object objKeyValue = iEntityDTO.get(strKeyFieldName);
			IEntityDTO iEntityDTO2 = entityDTOMap.remove(objKeyValue);
			if(iEntityDTO2 == null) {
				continue;
			}
			
			//放入已经移除
			entityDTORemoveMap.put(objKeyValue, iEntityDTO2);
			
			Object parentId = iEntityDTO.get(strPickupFieldName);
			if(ObjectUtils.isEmpty(parentId)) {
				entityDTOList.add(iEntityDTO);
				continue;
			}
			else {
				//选择顶级父替换为未知
				while(!ObjectUtils.isEmpty(parentId)) {
					IEntityDTO iEntityDTO3 = entityDTOMap.remove(parentId);
					if(iEntityDTO3 == null) {
						//需要判断父未出现
						if(!entityDTORemoveMap.containsKey(parentId)) {
							entityDTOList.add(iEntityDTO2);
						}
						break;
					}
					else {
						//放入已经移除
						entityDTORemoveMap.put(parentId, iEntityDTO3);
						
						parentId = iEntityDTO3.get(strPickupFieldName);
						iEntityDTO2 = iEntityDTO3;
						if(ObjectUtils.isEmpty(parentId)) {
							entityDTOList.add(iEntityDTO2);
							break;
						}
					}
				}				
			}
		}
		
		iSearchContextDTO.setPageable(pageable);
		
		List<IEntityDTO> pageEntityDTOList = new ArrayList<IEntityDTO>();
		int nLength = (pageable.getPageNumber() + 1) * pageable.getPageSize();
		if(nLength>entityDTOList.size()) {
			nLength = entityDTOList.size();
		}
		for(int i = pageable.getPageNumber() * pageable.getPageSize(); i< nLength; i++) {
			pageEntityDTOList.add(entityDTOList.get(i));
		}
		
		//计算页数
		int nTotalPages = pageable.getPageSize() == 0 ? 1 : (int) Math.ceil((double) entityDTOList.size() / (double) pageable.getPageSize());
		
		//附加列表
		entityDTOList.clear();
		entityDTOList.addAll(pageEntityDTOList);
		for(IEntityDTO iEntityDTO : pageEntityDTOList) {
			
			List<IEntityDTO> parentEntityDTOList = new ArrayList<IEntityDTO>();
			parentEntityDTOList.add(iEntityDTO);
			while(parentEntityDTOList.size()>0) {
				IEntityDTO parentEntityDTO = parentEntityDTOList.remove(0);
				Object objKeyValue = parentEntityDTO.get(strKeyFieldName);
				List<IEntityDTO> list = entityDTOListMap.remove(objKeyValue);
				if(!ObjectUtils.isEmpty(list)) {
					entityDTOList.addAll(list);
					parentEntityDTOList.addAll(list);
				}
			}
		}
		
		return new PageImpl<IEntityDTO>(entityDTOList, iSearchContextDTO.getPageable(), ret.getTotalElements(), nTotalPages);
		
	}
	
	protected boolean isFetchTreeMode(ISearchContextDTO iSearchContextDTO)  {
		String strShowMode = DataTypeUtils.asString(iSearchContextDTO.get(PARAM_SHOWMODE), null);
		if("tree".equalsIgnoreCase(strShowMode)) {
			return true;
		}
		return false;
	}
	
	protected int getFetchTreeMaxSize() {
		return 10000;
	}
}
