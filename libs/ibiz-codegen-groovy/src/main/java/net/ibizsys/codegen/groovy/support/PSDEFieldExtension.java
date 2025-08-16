package net.ibizsys.codegen.groovy.support;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.util.ObjectUtils;
import org.springframework.util.StringUtils;

import net.ibizsys.model.PSModelEnums.DEFDefaultValueType;
import net.ibizsys.model.PSModelEnums.DEFDupCheckMode;
import net.ibizsys.model.PSModelEnums.DEFVRType;
import net.ibizsys.model.PSModelEnums.GroupCondOP;
import net.ibizsys.model.dataentity.defield.IPSDEField;
import net.ibizsys.model.dataentity.defield.valuerule.IPSDEFVRCondition;
import net.ibizsys.model.dataentity.defield.valuerule.IPSDEFVRGroupCondition;

/**
 * 实体属性接口对象接口
 * @author lionlau
 *
 */
public class PSDEFieldExtension {

	public static String getDefaultValueComment(IPSDEField self) {
		if(!StringUtils.hasLength(self.getDefaultValueType()) && !StringUtils.hasLength(self.getDefaultValue())) {
			return null;
		}
		
		if(!StringUtils.hasLength(self.getDefaultValueType())) {
			return String.format("[直接值] %1$s", self.getDefaultValue());
		}
		else {
			DEFDefaultValueType defDefaultValueType = DEFDefaultValueType.from(self.getDefaultValueType());
			if(!StringUtils.hasLength(self.getDefaultValue())) {
				return String.format("[%1$s]", defDefaultValueType.text);
			}
			else {
				return String.format("[%1$s] %2$s", defDefaultValueType.text, self.getDefaultValue());
			}
		}
	}
	
	
	public static String getValueRuleComment(IPSDEField self) {
		
		StringBuilder stringBuilder = new StringBuilder();
		stringBuilder.append(String.format("[允许空输入] %1$s", self.isAllowEmpty()?"是":"否"));
		if(StringUtils.hasLength(self.getDupCheckMode()) && !DEFDupCheckMode.NONE.value.equals(self.getDupCheckMode())) {
			DEFDupCheckMode defDupCheckMode = DEFDupCheckMode.from(self.getDupCheckMode());
			stringBuilder.append(String.format("\n[重复值检查] %1$s", defDupCheckMode.text));
			if(!ObjectUtils.isEmpty(self.getDupCheckValues())) {
				stringBuilder.append(String.format("[%1$s]", StringUtils.collectionToDelimitedString(Arrays.asList(self.getDupCheckValues()), ",")));
			}
			if(!ObjectUtils.isEmpty(self.getDupCheckPSDEFields())) {
				List<String> list = new ArrayList<>();
				for(IPSDEField iPSDEField : self.getDupCheckPSDEFields()) {
					list.add(iPSDEField.getName());
				}
				stringBuilder.append(String.format("，约束属性[%1$s]", StringUtils.collectionToDelimitedString(list, ",")));
			}
			
		}
		return stringBuilder.toString();
	}
	
	public static String getComment(IPSDEFVRCondition self) {
		
		StringBuilder stringBuilder = new StringBuilder();
		
		if (DEFVRType.GROUP.value.equals(self.getCondType())) {
			IPSDEFVRGroupCondition iPSDEFVRGroupCondition = (IPSDEFVRGroupCondition)self;
			if(ObjectUtils.isEmpty(iPSDEFVRGroupCondition.getPSDEFVRConditions())) {
				return null;
			}
			
			List<String> list = new ArrayList<String>();
			for(IPSDEFVRCondition iPSDEFVRCondition : iPSDEFVRGroupCondition.getPSDEFVRConditions()) {
				String strComment = getComment(iPSDEFVRCondition);
				if(!StringUtils.hasLength(strComment)) {
					continue;
				}
				list.add(strComment);
			}
			
			if(ObjectUtils.isEmpty(list)) {
				return null;
			}
			
			if(list.size() == 1 && !iPSDEFVRGroupCondition.isNotMode()) {
				return list.get(0);
			}
			
			if(iPSDEFVRGroupCondition.isNotMode()) {
				stringBuilder.append("[取反(NOT)]");
			}
			
			if(GroupCondOP.AND.value.equalsIgnoreCase(iPSDEFVRGroupCondition.getCondOp())) {
				stringBuilder.append(String.format("[%1$s]", GroupCondOP.AND.text));
			}
			else {
				stringBuilder.append(String.format("[%1$s]", GroupCondOP.OR.text));
			}
			stringBuilder.append(String.format(" {\n"));
			for(String strComment : list) {
				String[] items = strComment.split("[\n]");
				for(String item : items) {
					stringBuilder.append(String.format("    %1$s\n", item));
				}
			}
			stringBuilder.append(String.format("}\n"));
			return stringBuilder.toString();
		}
		
		DEFVRType defVRType = DEFVRType.from(self.getCondType());
		return String.format("[%1$s] %2$s", defVRType.text, self.getRuleInfo());
//		
//		if (DEFVRType.REGEX.value.equals(self.getCondType())) {
//			return this.checkFieldRegExCondition(objValue, arg0, (IPSDEFVRRegExCondition) self, iPSDEField);
//		}
//
//		if (DEFVRType.STRINGLENGTH.value.equals(self.getCondType())) {
//			return this.checkFieldStringLengthCondition(objValue, arg0, (IPSDEFVRStringLengthCondition) self, iPSDEField);
//		}
//
//		if (DEFVRType.SIMPLE.value.equals(self.getCondType())) {
//			return this.checkFieldSimpleCondition(objValue, arg0, (IPSDEFVRSimpleCondition) self, iPSDEField);
//		}
//
//		if (DEFVRType.QUERYCOUNT.value.equals(self.getCondType())) {
//			return this.checkFieldQueryCountCondition(objValue, arg0, (IPSDEFVRQueryCountCondition) self, iPSDEField);
//		}
//
//		if (DEFVRType.VALUERECURSION.value.equals(self.getCondType())) {
//			return this.checkFieldValueRecursionCondition(objValue, arg0, (IPSDEFVRValueRecursionCondition) self, iPSDEField);
//		}
//
//		if (DEFVRType.SYSVALUERULE.value.equals(self.getCondType())) {
//			return this.checkFieldSysValueRuleCondition(objValue, arg0, (IPSDEFVRSysValueRuleCondition) self, iPSDEField);
//		}
//
//		if (DEFVRType.VALUERANGE.value.equals(self.getCondType())) {
//			return this.checkFieldValueRangeCondition(objValue, arg0, (IPSDEFVRValueRangeCondition) self, iPSDEField);
//		}
//
//		if (DEFVRType.VALUERANGE2.value.equals(self.getCondType())) {
//			return this.checkFieldValueRange2Condition(objValue, arg0, (IPSDEFVRValueRange2Condition) self, iPSDEField);
//		}
//
//		if (DEFVRType.VALUERANGE3.value.equals(self.getCondType())) {
//			return this.checkFieldValueRange3Condition(objValue, arg0, (IPSDEFVRValueRange3Condition) self, iPSDEField);
//		}
//		
//		return self.getMemo();
	}
	
}
