package net.ibizsys.central.cloud.core.search;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.util.ObjectUtils;
import org.springframework.util.StringUtils;

import com.fasterxml.jackson.databind.node.ArrayNode;
import com.fasterxml.jackson.databind.node.ObjectNode;

import net.ibizsys.central.cloud.core.util.RecursiveCharacterTextSplitter;
import net.ibizsys.central.search.SysSearchSchemeRuntimeException;
import net.ibizsys.model.PSModelEnums.SearchFieldDataType;
import net.ibizsys.model.search.IPSSysSearchField;
import net.ibizsys.runtime.util.JsonUtils;

public abstract class SysSearchDocRuntimeBase extends net.ibizsys.central.search.SysSearchDocRuntimeBase implements ISysSearchDocRuntime {

	private List<IPSSysSearchField> nestedTextVectorFields = new ArrayList<IPSSysSearchField>();
	private Map<String, RecursiveCharacterTextSplitter> recursiveCharacterTextSplitterMap = new HashMap<String, RecursiveCharacterTextSplitter>();
		
	
	@Override
	protected void onInit() throws Exception {
		
		List<IPSSysSearchField> list = this.getPSSysSearchDoc().getAllPSSysSearchFields();
		if(!ObjectUtils.isEmpty(list)) {
			for(IPSSysSearchField iPSSysSearchField : list) {
				if(SearchFieldDataType.NESTED.value.equals(iPSSysSearchField.getFieldType())) {
					if(FIELDTAG_NESTED_TEXT_VECTOR.equals(iPSSysSearchField.getFieldTag())) {
						this.nestedTextVectorFields.add(iPSSysSearchField);
						RecursiveCharacterTextSplitter recursiveCharacterTextSplitter = this.createRecursiveCharacterTextSplitter(iPSSysSearchField);
						recursiveCharacterTextSplitterMap.put(iPSSysSearchField.getName(), recursiveCharacterTextSplitter);
					}
				}
				
			}
		}
		
		super.onInit();
	}
	
	protected RecursiveCharacterTextSplitter createRecursiveCharacterTextSplitter(IPSSysSearchField iPSSysSearchField) {
		List<String> separators = null;
		int size = 500;
		int overlap = 50;
		ObjectNode splitter = null;
		if(iPSSysSearchField.getFieldParams() != null && iPSSysSearchField.getFieldParams().has("splitter")) {
			splitter = (ObjectNode)iPSSysSearchField.getFieldParams().get("splitter");
			
			size = JsonUtils.getField(splitter, "size", size);
			overlap = JsonUtils.getField(splitter, "overlap", overlap);
			Object list = splitter.get("separators");
			if(list instanceof ArrayNode) {
				ArrayNode arrayNode = (ArrayNode)list;
				for(int i = 0;i<arrayNode.size();i++) {
					String strSeparator = arrayNode.get(i).textValue();
					if(!StringUtils.hasLength(strSeparator)) {
						continue;
					}
					if(separators == null) {
						separators = new ArrayList<String>();
					}
					separators.add(strSeparator);
				}
			}
		}
		
		return new RecursiveCharacterTextSplitter(separators, size, overlap);
	}
	
	@Override
	public List<IPSSysSearchField> getNestedTextVectorFields() {
		return this.nestedTextVectorFields;
	}
	
	
	@Override
	public List<String> splitNestedText(IPSSysSearchField iPSSysSearchField, String strContent) {
		RecursiveCharacterTextSplitter recursiveCharacterTextSplitter = recursiveCharacterTextSplitterMap.get(iPSSysSearchField.getName());
		if(recursiveCharacterTextSplitter == null) {
			throw new SysSearchSchemeRuntimeException(this.getSysSearchSchemeRuntime(), this, String.format("无法获取属性[%1$s]嵌套文本分割器", iPSSysSearchField.getName()));
		}
		return recursiveCharacterTextSplitter.splitText(strContent);
	}
}
