package net.ibizsys.central.plugin.util.dataentity.action;

import java.util.List;

import org.springframework.util.ObjectUtils;
import org.springframework.util.StringUtils;

import net.ibizsys.central.dataentity.DataEntityRuntime;
import net.ibizsys.central.dataentity.IDataEntityRuntime;
import net.ibizsys.central.util.IEntityDTO;
import net.ibizsys.central.util.ISearchContextDTO;
import net.ibizsys.model.PSModelEnums.DERSubType;
import net.ibizsys.model.PSModelEnums.PredefinedFieldType;
import net.ibizsys.model.PSModelEnums.SortDir;
import net.ibizsys.model.dataentity.defield.IPSDEField;
import net.ibizsys.model.dataentity.der.IPSDER1N;
import net.ibizsys.model.dataentity.der.IPSDER1NBase;
import net.ibizsys.model.dataentity.der.IPSDERBase;
import net.ibizsys.model.dataentity.der.IPSDERCustom;
import net.ibizsys.model.dataentity.ds.IPSDEDataSet;
import net.ibizsys.runtime.dataentity.DETypes;
import net.ibizsys.runtime.util.ActionSession;
import net.ibizsys.runtime.util.ActionSessionManager;
import net.ibizsys.runtime.util.Conditions;
import net.ibizsys.runtime.util.DataTypeUtils;

public abstract class CopyDEActionRuntimeBase extends DEActionRuntimeBase {

	private static final org.apache.commons.logging.Log log = org.apache.commons.logging.LogFactory.getLog(CopyDEActionRuntimeBase.class);

	@Override
	protected Object onExecute(IEntityDTO iEntityDTO) throws Throwable {

		ActionSession actionSession = ActionSessionManager.getCurrentSessionMust();

		Object objKeyValue = this.getDataEntityRuntime().getKeyFieldValue(iEntityDTO);
		if (ObjectUtils.isEmpty(objKeyValue)) {
			throw new Exception("传入数据键值无效");
		}

		IEntityDTO ret = this.getDataEntityRuntime().get(objKeyValue);
		
		this.getDataEntityRuntime().rebuildCopyEntityDTO(ret, true, true);
//		
//		// 移除不可拷贝值
		java.util.List<IPSDEField> psDEFields = this.getDataEntityRuntime().getPSDEFields(true);
		if (psDEFields != null) {
			for (IPSDEField iPSDEField : psDEFields) {
				if(iPSDEField.isKeyDEField()) {
					continue;
				}
				if (iEntityDTO.contains(iPSDEField.getLowerCaseName())) {
					ret.set(iPSDEField.getLowerCaseName(), iEntityDTO.get(iPSDEField.getLowerCaseName()));
				}
			}
		}
//
//		// 填充默认值
//		this.getDataEntityRuntime().fillEntityDefaultValues(ret, DEActions.COPY);

		// 进一步填充外键
		List<IPSDERBase> psDERBaseList = this.getDataEntityRuntime().getPSDERBases(true);
		if (!ObjectUtils.isEmpty(psDERBaseList)) {
			for (IPSDERBase iPSDERBase : psDERBaseList) {
				if (!(iPSDERBase instanceof IPSDER1NBase)) {
					continue;
				}

				IPSDER1NBase iPSDER1NBase = (IPSDER1NBase) iPSDERBase;
				if (iPSDER1NBase.getCloneOrder() < 0) {
					continue;
				}

				IPSDEField pickupPSDEField = iPSDER1NBase.getPickupPSDEFieldMust();
				// IPSDEMethodDTOField field =
				// iDEMethodDTORuntime.getPSDEMethodDTOFieldByDEField(pickupPSDEField.getName(),
				// true);
				Object value = ret.get(pickupPSDEField.getLowerCaseName());

				if (value == null) {
					continue;
				}

				String strTag = String.format(DataEntityRuntime.ACTIONSESSIONPARAM_COPYSOURCE_X, iPSDER1NBase.getMajorPSDataEntityMust().getId(), value);
				Object cache = actionSession.getActionParam(strTag);
				if (cache instanceof IEntityDTO) {
					IDataEntityRuntime majorDataEntityRuntime = this.getSystemRuntime().getDataEntityRuntime(iPSDER1NBase.getMajorPSDataEntityMust().getId());
					IEntityDTO cacheEntityDTO = (IEntityDTO) cache;
					ret.set(pickupPSDEField.getLowerCaseName(), majorDataEntityRuntime.getKeyFieldValue(cacheEntityDTO));
				}
			}
		}

		// 建立新数据
		this.getDataEntityRuntime().create(ret);

		//Object newKeyValue = this.getDataEntityRuntime().getKeyFieldValue(ret);

		// 放入缓存
		String strTag = String.format(DataEntityRuntime.ACTIONSESSIONPARAM_COPYSOURCE_X, this.getDataEntityRuntime().getId(), objKeyValue);
		actionSession.setActionParam(strTag, ret);

		// 获取全部克隆关系
		List<IPSDER1NBase> clonelist = this.getDataEntityRuntime().getClonePSDER1Ns(true);
		if (!ObjectUtils.isEmpty(clonelist)) {
			for (IPSDER1NBase iPSDERBase : clonelist) {
				this.onCopyPSDER1NBase(iEntityDTO, ret, iPSDERBase);
			}
		}

		return ret;
	}
	
	protected void onCopyPSDER1NBase(IEntityDTO srcEntityDTO, IEntityDTO retEntityDTO, IPSDER1NBase iPSDERBase) throws Throwable{
		Object objKeyValue = this.getDataEntityRuntime().getKeyFieldValue(srcEntityDTO);
		IDataEntityRuntime refDataEntityRuntime = this.getSystemRuntime().getDataEntityRuntime(iPSDERBase.getMinorPSDataEntityMust().getId());
		// 找到外键
		IPSDEField pickupPSDEField = null;
		IPSDEField parentTypePSDEField = null;
		IPSDEField parentSubTypePSDEField = null;

		String strParentSubType = null;
		String strParentType = null;

		IPSDEDataSet nestedPSDEDataSet = null;

		if (iPSDERBase instanceof IPSDER1N) {
			pickupPSDEField = ((IPSDER1N) iPSDERBase).getPSPickupDEFieldMust();
			nestedPSDEDataSet = ((IPSDER1N) iPSDERBase).getNestedPSDEDataSet();
		} else if (iPSDERBase instanceof IPSDERCustom) {
			IPSDERCustom iPSDERCustom = (IPSDERCustom) iPSDERBase;
			pickupPSDEField = iPSDERCustom.getPickupPSDEField();
			nestedPSDEDataSet = iPSDERCustom.getNestedPSDEDataSet();
			if (refDataEntityRuntime.getDEType() == DETypes.DYNAATTACHED || DERSubType.DER1N.value.equalsIgnoreCase(iPSDERCustom.getDERSubType())) {
				parentTypePSDEField = refDataEntityRuntime.getPSDEFieldByPredefinedType(PredefinedFieldType.PARENTTYPE, refDataEntityRuntime.getDEType() != DETypes.DYNAATTACHED);
				if (parentTypePSDEField != null) {
					strParentType = iPSDERCustom.getParentType();
					if (!StringUtils.hasLength(strParentType)) {
						// strParentType = this.getName();
						strParentType = this.getDataEntityRuntime().getDERParentType();
					}
				}
				parentSubTypePSDEField = refDataEntityRuntime.getPSDEFieldByPredefinedType(PredefinedFieldType.PARENTSUBTYPE, true);
				if (parentSubTypePSDEField != null) {
					strParentSubType = iPSDERCustom.getParentSubType();
					if (!StringUtils.hasLength(strParentSubType)) {
						strParentSubType = iPSDERBase.getMinorCodeName();
					}
				}
			}
		}
		if (pickupPSDEField == null) {
			throw new Exception(String.format("克隆关系[%1$s]未定义连接属性", iPSDERBase.getName()));
		}

		ISearchContextDTO iSearchContextDTO = refDataEntityRuntime.createSearchContext();
		iSearchContextDTO.all().count(false);
		refDataEntityRuntime.setSearchCondition(iSearchContextDTO, pickupPSDEField, Conditions.EQ, objKeyValue);
		if (parentTypePSDEField != null) {
			refDataEntityRuntime.setSearchCondition(iSearchContextDTO, parentTypePSDEField, Conditions.EQ, strParentType);
		}
		if (parentSubTypePSDEField != null) {
			if (StringUtils.hasLength(strParentSubType)) {
				refDataEntityRuntime.setSearchCondition(iSearchContextDTO, parentSubTypePSDEField, Conditions.EQ, DataTypeUtils.convert(parentSubTypePSDEField.getStdDataType(), strParentSubType));
			} else {
				refDataEntityRuntime.setSearchCondition(iSearchContextDTO, parentSubTypePSDEField, Conditions.ISNULL, null);
			}
		}

		// 设置排序信息
		IPSDEField orderValuePSDEField = refDataEntityRuntime.getOrderValuePSDEField();
		if (orderValuePSDEField != null) {
			refDataEntityRuntime.setSearchSort(iSearchContextDTO, orderValuePSDEField, SortDir.ASC.value);
		}
		List<IEntityDTO> lastList = null;
		if (nestedPSDEDataSet != null) {
			lastList = refDataEntityRuntime.selectDataSet(nestedPSDEDataSet, iSearchContextDTO);
		} else {
			lastList = refDataEntityRuntime.select(iSearchContextDTO);
		}

		if (!ObjectUtils.isEmpty(lastList)) {
			for (IEntityDTO item : lastList) {
				IEntityDTO newItem = refDataEntityRuntime.createEntity();
				newItem.set(refDataEntityRuntime.getKeyPSDEField().getLowerCaseName(), refDataEntityRuntime.getKeyFieldValue(item));
				// newItem.set(pickupPSDEField.getLowerCaseName(),
				// objValue);
				refDataEntityRuntime.copy(newItem);
			}
		}
	}

}
