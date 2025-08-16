package net.ibizsys.runtime.codelist;

import java.util.ArrayList;
import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Sort;
import org.springframework.util.StringUtils;

import com.fasterxml.jackson.databind.node.ObjectNode;

import net.ibizsys.model.IPSModelObjectRuntime;
import net.ibizsys.model.codelist.IPSCodeItem;
import net.ibizsys.model.codelist.PSCodeItemImpl;
import net.ibizsys.model.dataentity.IPSDataEntity;
import net.ibizsys.model.dataentity.ds.IPSDEDataSet;
import net.ibizsys.runtime.SystemRuntimeException;
import net.ibizsys.runtime.dataentity.IDataEntityRuntime;
import net.ibizsys.runtime.util.IEntityBase;
import net.ibizsys.runtime.util.ISearchContext;
import net.ibizsys.runtime.util.ISearchContextBase;
import net.ibizsys.runtime.util.JsonUtils;

/**
 * 动态代码表运行时对象
 * 
 * @author lionlau
 *
 */
public class DynamicCodeListRuntime extends CodeListRuntimeBase {

	private List<IPSCodeItem> psCodeItemList = null;
	
	@Override
	protected void onInit() throws Exception {
		
		super.onInit();
	}

	@Override
	public List<IPSCodeItem> getPSCodeItems() {
		try {
			return this.onGetPSCodeItems();					
		}
		catch (Throwable ex) {
			SystemRuntimeException.rethrow(this, ex);
			throw new SystemRuntimeException(this.getSystemRuntimeBase(), this, String.format("获取代码项发生异常，%1$s", ex.getMessage()), ex);
		}
	}

	protected List<IPSCodeItem> onGetPSCodeItems() throws Throwable{
		List<IPSCodeItem> psCodeItemList = this.psCodeItemList;
		if(psCodeItemList == null) {
			psCodeItemList = new ArrayList<IPSCodeItem>();
			IPSDataEntity iPSDataEntity = this.getPSCodeList().getPSDataEntityMust();
			IDataEntityRuntime iDataEntityRuntime = this.getSystemRuntime().getDataEntityRuntime(iPSDataEntity.getId());
			IPSDEDataSet iPSDEDataSet = this.getPSCodeList().getPSDEDataSet();
			if(iPSDEDataSet  == null) {
				iPSDEDataSet = iPSDataEntity.getDefaultPSDEDataSetMust();
			}
			ISearchContextBase iSearchContextBase = iDataEntityRuntime.createSearchContext();
			//放入自定义条件
			if(StringUtils.hasLength(this.getPSCodeList().getCustomCond())) {
				iDataEntityRuntime.setSearchCustomCondition(iSearchContextBase, this.getPSCodeList().getCustomCond());
			}
			fillSearchContext(iSearchContextBase);
			Sort sort = Sort.unsorted();
			if(this.getPSCodeList().getMinorSortPSDEField()!=null) {
				List<Sort.Order> list = new ArrayList<Sort.Order>();
				if ("DESC".equalsIgnoreCase(this.getPSCodeList().getMinorSortDir())) {
					list.add(Sort.Order.desc(this.getPSCodeList().getMinorSortPSDEField().getLowerCaseName()));
				} else {
					list.add(Sort.Order.asc(this.getPSCodeList().getMinorSortPSDEField().getLowerCaseName()));
				}
				sort = Sort.by(list);
			}
			iDataEntityRuntime.setSearchPaging(iSearchContextBase, ISearchContext.STARTPAGE, Integer.MAX_VALUE, sort);
			iDataEntityRuntime.setSearchMode(iSearchContextBase, true, false);
			
			Page<? extends IEntityBase> page = iDataEntityRuntime.searchDataSet(iPSDEDataSet, iSearchContextBase);
			if(page != null && page.getContent() != null) {
				for(IEntityBase item : page.getContent()) {
					Object objValue = null;
					Object objText = null;
					if(this.getPSCodeList().getValuePSDEField() != null){
						objValue = iDataEntityRuntime.getFieldValue(item, this.getPSCodeList().getValuePSDEField());
					}
					else {
						objValue = iDataEntityRuntime.getFieldValue(item, iDataEntityRuntime.getKeyPSDEField());
					}
					if(this.getPSCodeList().getTextPSDEField() != null){
						objText = iDataEntityRuntime.getFieldValue(item, this.getPSCodeList().getTextPSDEField());
					}
					else if(iDataEntityRuntime.getMajorPSDEField()!=null){
						objText = iDataEntityRuntime.getFieldValue(item, iDataEntityRuntime.getMajorPSDEField());
					}
					if(objText == null) {
						objText = objValue;
					}
					Object objColor = null;
					if(this.getPSCodeList().getColorPSDEField() != null){
						objColor = iDataEntityRuntime.getFieldValue(item, this.getPSCodeList().getColorPSDEField());
					}
					Object objBKColor = null;
					if(this.getPSCodeList().getBKColorPSDEField() != null){
						objBKColor = iDataEntityRuntime.getFieldValue(item, this.getPSCodeList().getBKColorPSDEField());
					}

					Object objTextCls = null;
					if(this.getPSCodeList().getClsPSDEField() != null){
						objTextCls = iDataEntityRuntime.getFieldValue(item, this.getPSCodeList().getClsPSDEField());
					}

					Object objIconCls = null;
					if(this.getPSCodeList().getIconClsPSDEField() != null){
						objIconCls = iDataEntityRuntime.getFieldValue(item, this.getPSCodeList().getIconClsPSDEField());
					}
					//构建代码项
					ObjectNode objNode = JsonUtils.createObjectNode();
					objNode.put(PSCodeItemImpl.ATTR_GETID, String.valueOf(objValue));
					objNode.put(PSCodeItemImpl.ATTR_GETNAME,  String.valueOf(objText));
					objNode.put(PSCodeItemImpl.ATTR_GETVALUE,  String.valueOf(objValue));
					objNode.put(PSCodeItemImpl.ATTR_GETTEXT,  String.valueOf(objText));
					if(objColor != null){
						objNode.put(PSCodeItemImpl.ATTR_GETCOLOR, String.valueOf(objColor));
					}
					if(objBKColor != null){
						objNode.put(PSCodeItemImpl.ATTR_GETBKCOLOR, String.valueOf(objBKColor));
					}
					if(objTextCls != null){
						objNode.put(PSCodeItemImpl.ATTR_GETTEXTCLS, String.valueOf(objTextCls));
					}
					if(objIconCls != null){
						objNode.put(PSCodeItemImpl.ATTR_GETICONCLS, String.valueOf(objIconCls));
					}
					IPSCodeItem iPSCodeItem = this.getSystemRuntimeBaseContext().getPSSystemService().createAndInitPSModelObject((IPSModelObjectRuntime)this.getPSCodeList(), 
							IPSCodeItem.class, objNode);
					psCodeItemList.add(iPSCodeItem);
				}
			}
		}
		if(this.psCodeItemList == null) {
			this.psCodeItemList = psCodeItemList;
		}
		return psCodeItemList;
	}
	
	@Override
	protected void onReset() {
		this.psCodeItemList = null;
		super.onReset();
	}
	
	
	

	protected void fillSearchContext(ISearchContextBase iSearchContextBase) throws Throwable {
		
	}

	

}
