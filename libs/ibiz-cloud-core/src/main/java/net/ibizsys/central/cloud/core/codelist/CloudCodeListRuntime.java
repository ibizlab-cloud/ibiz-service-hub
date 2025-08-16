package net.ibizsys.central.cloud.core.codelist;

import java.util.ArrayList;
import java.util.List;

import org.springframework.util.ObjectUtils;
import org.springframework.util.StringUtils;

import com.fasterxml.jackson.databind.node.ObjectNode;

import net.ibizsys.central.cloud.core.sysutil.ISysConfUtilRuntime;
import net.ibizsys.central.cloud.core.util.domain.CodeItem;
import net.ibizsys.central.cloud.core.util.domain.CodeList;
import net.ibizsys.model.IPSModelObjectRuntime;
import net.ibizsys.model.codelist.IPSCodeItem;
import net.ibizsys.model.codelist.PSCodeItemImpl;
import net.ibizsys.runtime.util.DataTypeUtils;
import net.ibizsys.runtime.util.JsonUtils;

/**
 * 来自Cloud体系的代码表运行时对象
 * 
 * @author lionlau
 *
 */
public class CloudCodeListRuntime extends net.ibizsys.runtime.codelist.PredefinedCodeListRuntime {

	private List<IPSCodeItem> psCodeItemList = null;
	
	@Override
	public List<IPSCodeItem> getPSCodeItems() {
		return this.onGetPSCodeItems();
	}
	
	protected synchronized List<IPSCodeItem> onGetPSCodeItems() {
		if(this.psCodeItemList != null) {
			return this.psCodeItemList;
		}
		
		List<IPSCodeItem> psCodeItemList = new ArrayList<IPSCodeItem>();
		// 获取系统配置组件
		ISysConfUtilRuntime iSysConfUtilRuntime = this.getSystemRuntime().getSysUtilRuntime(ISysConfUtilRuntime.class, false);
		// CodeList codeList =
		// iSysConfUtilRuntime.getCodeList(this.getPSCodeList().getCodeListTag(),
		// false);
		CodeList codeList = iSysConfUtilRuntime.getCodeList(this.getPSCodeList().getCodeName(), false);
		if (!ObjectUtils.isEmpty(codeList.getItems())) {
			for (CodeItem codeItem : codeList.getItems()) {
				ObjectNode itemNode = this.getPSCodeItemNode(codeItem);
				IPSCodeItem iPSCodeItem = this.getSystemRuntime().getPSSystemService().createAndInitPSModelObject((IPSModelObjectRuntime) this.getPSCodeList(), IPSCodeItem.class, itemNode);
				psCodeItemList.add(iPSCodeItem);
			}
		}
		if(this.psCodeItemList == null) {
			this.psCodeItemList = psCodeItemList;
		}
		
		return this.psCodeItemList;
	}

	/**
	 * 代码表层级关系
	 *
	 * @param codeItem
	 * @return
	 */
	public ObjectNode getPSCodeItemNode(CodeItem codeItem) {
		ObjectNode objNode = JsonUtils.createObjectNode();
		objNode.put(PSCodeItemImpl.ATTR_GETID, String.valueOf(codeItem.getValue()));
		objNode.put(PSCodeItemImpl.ATTR_GETNAME, String.valueOf(codeItem.getText()));
		objNode.put(PSCodeItemImpl.ATTR_GETVALUE, String.valueOf(codeItem.getValue()));
		objNode.put(PSCodeItemImpl.ATTR_GETTEXT, String.valueOf(codeItem.getText()));
		if(StringUtils.hasLength(codeItem.getColor())){
			objNode.put(PSCodeItemImpl.ATTR_GETCOLOR, String.valueOf(codeItem.getColor()));
		}
		if(StringUtils.hasLength(codeItem.getBKColor())){
			objNode.put(PSCodeItemImpl.ATTR_GETBKCOLOR, String.valueOf(codeItem.getBKColor()));
		}
		if(StringUtils.hasLength(codeItem.getCls())){
			objNode.put(PSCodeItemImpl.ATTR_GETTEXTCLS, String.valueOf(codeItem.getCls()));
		}
		if(StringUtils.hasLength(codeItem.getIconClass())){
			objNode.put(PSCodeItemImpl.ATTR_GETICONCLS, String.valueOf(codeItem.getIconClass()));
		}
		if(DataTypeUtils.getBooleanValue(codeItem.getDisabled(), false)){
			objNode.put(PSCodeItemImpl.ATTR_ISDISABLESELECT, true);
		}
 		
		
		
		
		// if (!ObjectUtils.isEmpty(codeItem.getChildren())) {
		// ArrayNode childINodes = MAPPER.createArrayNode();
		// for (CodeItem child : codeItem.getChildren()) {
		// ObjectNode childNode = genPSCodeItem(child);
		// childINodes.add(childNode);
		// }
		// objNode.put(PSCodeItemImpl.ATTR_GETPSCODEITEMS, childINodes);
		// }
		return objNode;
	}
	
	
	@Override
	public IPSCodeItem getPSCodeItem(String strItemValue, boolean bTryMode) {
		if(!bTryMode) {
			IPSCodeItem iPSCodeItem = super.getPSCodeItem(strItemValue, true);
			if(iPSCodeItem != null) {
				return iPSCodeItem;
			}
			this.reset();
		}
		return super.getPSCodeItem(strItemValue, bTryMode);
	}
	
	@Override
	protected void onReset() {
		this.psCodeItemList = null;
		super.onReset();
	}
	

}
