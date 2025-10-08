package cn.ibizlab.central.plugin.odoo.dataentity;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.springframework.util.ObjectUtils;
import org.springframework.util.StringUtils;

import com.fasterxml.jackson.databind.node.ObjectNode;

import cn.ibizlab.central.plugin.odoo.IOdooSystemRuntimeBase;
import cn.ibizlab.central.plugin.odoo.dataentity.dto.IrAttachmentDTO;
import cn.ibizlab.central.plugin.odoo.dataentity.dto.IrDefaultDTO;
import cn.ibizlab.central.plugin.odoo.dataentity.util.OdooDynaTableDEDynaStorageUtilRuntime;
import cn.ibizlab.central.plugin.odoo.util.OdooEntityDTOUtils;
import cn.ibizlab.central.plugin.odoo.util.OdooModels;
import net.ibizsys.central.bi.ISysBICubeRuntime;
import net.ibizsys.central.bi.util.BISearchContext;
import net.ibizsys.central.database.IDBDialect;
import net.ibizsys.central.dataentity.IDataEntityRuntime;
import net.ibizsys.central.dataentity.defield.IDEFGroupRuntime;
import net.ibizsys.central.dataentity.ds.IDEDataQueryCodeRuntime;
import net.ibizsys.central.dataentity.util.IDEDynaStorageUtilRuntime;
import net.ibizsys.central.plugin.util.dataentity.InheritLogicDataEntityRuntimeBase;
import net.ibizsys.central.plugin.util.dataentity.ds.RealtimeDEDataQueryCodeRuntime;
import net.ibizsys.central.util.IEntityDTO;
import net.ibizsys.central.util.ISearchContext;
import net.ibizsys.central.util.ISearchContextDTO;
import net.ibizsys.model.IPSModelObjectRuntime;
import net.ibizsys.model.PSModelEnums.DEStorageType;
import net.ibizsys.model.PSModelEnums.DEType;
import net.ibizsys.model.PSModelEnums.DEUtilType;
import net.ibizsys.model.dataentity.IPSDataEntity;
import net.ibizsys.model.dataentity.action.IPSDEAction;
import net.ibizsys.model.dataentity.defield.IPSDEFGroup;
import net.ibizsys.model.dataentity.defield.IPSDEField;
import net.ibizsys.model.dataentity.ds.IPSDEDataQueryCode;
import net.ibizsys.model.dataentity.ds.IPSDEDataSet;
import net.ibizsys.model.dataentity.service.IPSDEMethodDTO;
import net.ibizsys.model.dataentity.service.IPSDEMethodDTOField;
import net.ibizsys.model.dataentity.util.IPSDEUtil;
import net.ibizsys.model.dataentity.util.PSDEUtilImpl;
import net.ibizsys.runtime.DynaInstModes;
import net.ibizsys.runtime.IDynaInstRuntime;
import net.ibizsys.runtime.dataentity.DEStorageModes;
import net.ibizsys.runtime.dataentity.IDynaInstDataEntityRuntime;
import net.ibizsys.runtime.dataentity.action.DEActionModes;
import net.ibizsys.runtime.dataentity.action.DEActions;
import net.ibizsys.runtime.dataentity.util.DEUtilTypes;
import net.ibizsys.runtime.dataentity.util.IDEUtilRuntime;
import net.ibizsys.runtime.util.ActionSession;
import net.ibizsys.runtime.util.ActionSessionManager;
import net.ibizsys.runtime.util.DataEntityRuntimeHolder;
import net.ibizsys.runtime.util.DataTypeUtils;
import net.ibizsys.runtime.util.IEntityBase;
import net.ibizsys.runtime.util.JsonUtils;
import net.ibizsys.runtime.util.KeyValueUtils;

public abstract class OdooDataEntityRuntimeBase extends InheritLogicDataEntityRuntimeBase{

	private static final org.apache.commons.logging.Log log = org.apache.commons.logging.LogFactory.getLog(OdooDataEntityRuntimeBase.class);

	/**
	 * 搜索上下文请求参数：BI 立方体模式
	 */
	public final static String SEARCHCONTEXTPARAM_BICUBEMODE = "bicubemode";

	/**
	 * 搜索上下文请求参数：BI 立方体数据集
	 */
	public final static String SEARCHCONTEXTPARAM_BICUBEDATASET = "bicubedataset";

	private IDataEntityRuntime irAttachmentDERuntime = null;

	private IDataEntityRuntime irDefaultDERuntime = null;


	@Override
	protected void onInit() throws Exception {
		super.onInit();

		if(this.getDEType() != DEType.ABSTRACT.value && this.getStorageMode() != DEStorageModes.NONE) {
			if(this.getDEDynaStorageUtilRuntime() == null) {
				this.prepareDEDynaStorageUtilRuntime();
			}
		}
	}

	protected void prepareDEDynaStorageUtilRuntime() throws Exception {
		ObjectNode objectNode = JsonUtils.createObjectNode();
		objectNode.put(PSDEUtilImpl.ATTR_GETID, DEUtilType.DYNASTORAGE.value);
		objectNode.put(PSDEUtilImpl.ATTR_GETNAME, DEUtilType.DYNASTORAGE.value);
		objectNode.put(PSDEUtilImpl.ATTR_GETCODENAME, DEUtilType.DYNASTORAGE.value);
		objectNode.put(PSDEUtilImpl.ATTR_GETUTILTYPE, DEUtilType.DYNASTORAGE.value);

		IPSDEUtil iPSDEUtil = this.getSystemRuntime().getPSSystemService().createAndInitPSModelObject((IPSModelObjectRuntime)this.getPSDataEntity(), IPSDEUtil.class, objectNode);
		IDEDynaStorageUtilRuntime iDEDynaStorageUtilRuntime = (IDEDynaStorageUtilRuntime)this.registerPSDEUtil(iPSDEUtil);
		this.setDEDynaStorageUtilRuntime(iDEDynaStorageUtilRuntime);
	}

	@Override
	protected IDEUtilRuntime onCreateDEUtilRuntime(IPSDEUtil iPSDEUtil) {
		switch (iPSDEUtil.getUtilType()) {
			case DEUtilTypes.DYNASTORAGE:
				if(this.getStorageMode()!= DEStorageModes.NONE) {
					return this.getSystemRuntime().createObject(IDEUtilRuntime.class, OdooDynaTableDEDynaStorageUtilRuntime.class);
				}
			default:
				return super.onCreateDEUtilRuntime(iPSDEUtil);
		}
	}


	@Override
	protected boolean isInheritPSDEFieldOnly() {
		return false;
	}

	@Override
	protected IEntityDTO createEntityDTO(IPSDEMethodDTO iPSDEMethodDTO) {
		return OdooEntityDTOUtils.createEntityDTO(this.getFullUniqueTag(), iPSDEMethodDTO);
	}

	@Override
	public String getDERParentType() {
		if(this.getDEType() == DEType.ABSTRACT.value) {
			IDataEntityRuntime childDataEntityRuntime = (IDataEntityRuntime) DataEntityRuntimeHolder.peekChildDataEntityRuntime();
			if(childDataEntityRuntime != null) {
				return childDataEntityRuntime.getDERParentType();
			}
		}
		return super.getDERParentType().toLowerCase();
	}

	@Override
	protected Object onFetchDataSet(String strDataSetName, IPSDEDataSet iPSDEDataSet, Object[] args, Object actionData) throws Throwable {
		ActionSession actionSession = ActionSessionManager.getCurrentSessionMust();
		if (args != null && args.length > 0 && args[0] instanceof ISearchContext) {
			ISearchContext iSearchContext = (ISearchContext) args[0];
			if(DataTypeUtils.asInteger(iSearchContext.get(SEARCHCONTEXTPARAM_BICUBEMODE), 0) == 1) {
				iSearchContext.set(SEARCHCONTEXTPARAM_BICUBEDATASET, strDataSetName);
				/**
				 * 计算动态实例实体运行时
				 */
				IDynaInstDataEntityRuntime iDynaInstDataEntityRuntime = null;
				IDynaInstRuntime iDynaInstRuntime = null;
				if (this.getDynaInstMode() != DynaInstModes.DISABLE) {
					String strDynainstid = getDynaInstId(null);
					if (StringUtils.hasLength(strDynainstid)) {
						iDynaInstRuntime = this.getSystemRuntime().getDynaInstRuntime(strDynainstid);
						// 设置当前会话的动态实例运行时
						ActionSessionManager.getCurrentSession().setDynaInstRuntime(iDynaInstRuntime);
						if (this.getDynaInstMode() == DynaInstModes.ENABLEINST) {
							// 计算对应的实例
							Object objDataType = null;
							if (StringUtils.hasLength(this.getDynaInstTag()) && StringUtils.hasLength(actionSession.getUserContext().getDynainsttag()) && StringUtils.hasLength(actionSession.getUserContext().getDynainsttag2()) && this.getDynaInstTag().equals(actionSession.getUserContext().getDynainsttag())) {
								objDataType = this.getSystemRuntime().convertValue(this.getDataTypePSDEField().getStdDataType(), actionSession.getUserContext().getDynainsttag2());
							}
							if (objDataType != null) {
								String strChildDynaInstId = iDynaInstRuntime.getChildDynaInstId(this.getDynaInstTag(), objDataType.toString());
								if (StringUtils.hasLength(strChildDynaInstId)) {
									iDynaInstRuntime = this.getSystemRuntime().getDynaInstRuntime(strChildDynaInstId);
									// 设置当前会话的子动态实例运行时
									ActionSessionManager.getCurrentSession().setChildDynaInstRuntime(iDynaInstRuntime);
									log.debug(String.format("实体[%1$s][%2$s][%3$s]计算实例=>[%4$s]", this.getName(), this.getDynaInstTag(), objDataType.toString(), strChildDynaInstId));
								}
							}
						}
						if (iDynaInstRuntime != null) {
							iDynaInstDataEntityRuntime = iDynaInstRuntime.getDynaInstDataEntityRuntime(this.getId());
						}
					}
				}
				if (iPSDEDataSet != null && iSearchContext != null) {
					// 转换查询上下文
					this.translateSearchContextBeforeProceed(iSearchContext, iPSDEDataSet.getName(), iPSDEDataSet, (iDynaInstDataEntityRuntime == null) ? this.getPSDataEntity() : iDynaInstDataEntityRuntime.getPSDataEntity(), iDynaInstRuntime, actionData);
					if (this.isEnableDynaStorage()) {
						this.translateSearchContextDynaFieldsBeforeProceed(iSearchContext, iPSDEDataSet.getName(), iPSDEDataSet, (iDynaInstDataEntityRuntime == null) ? this.getPSDataEntity() : iDynaInstDataEntityRuntime.getPSDataEntity(), iDynaInstRuntime, actionData);
					}
				}
				ISysBICubeRuntime iSysBICubeRuntime = this.getSystemRuntime().getDefaultSysBISchemeRuntime().getSysBICubeRuntime(this.getId(), false);
				return iSysBICubeRuntime.fetch(new BISearchContext(iSearchContext));
			}

		}

		return super.onFetchDataSet(strDataSetName, iPSDEDataSet, args, actionData);
	}

	protected List<IPSDEField> getIrAttachmentPSDEFields() {
		return this.getAttachmentPSDEFields(true);
	}

	@Override
	protected void translateEntityBeforeProceed(IEntityBase arg0, String strActionName, IPSDEAction iPSDEAction, IPSDataEntity iPSDataEntity, IDynaInstRuntime iDynaInstRuntime, Object actionData) throws Throwable {
		if(this.getDEType() != DEType.ABSTRACT.value && !OdooModels.IR_ATTACHMENT.equalsIgnoreCase(this.getFullUniqueTag()) && this.getStorageMode() == DEStorageType.SQL.value) {
			this.translateEntityIrAttachmentsBeforeProceed((IEntityDTO)arg0, strActionName, iPSDEAction);
		}

		super.translateEntityBeforeProceed(arg0, strActionName, iPSDEAction, iPSDataEntity, iDynaInstRuntime, actionData);
	}

	protected void translateEntityIrAttachmentsBeforeProceed(IEntityDTO iEntityDTO, String strActionName, IPSDEAction iPSDEAction) throws Throwable {
		List<IPSDEField> irAttachmentPSDEFieldList = this.getIrAttachmentPSDEFields();
		if(ObjectUtils.isEmpty(irAttachmentPSDEFieldList)) {
			return;
		}

		Map<String, Object> valueMap = new LinkedHashMap<String, Object>();
		for(IPSDEField iPSDEField : irAttachmentPSDEFieldList) {
			//判断属性是否有值
			if(iEntityDTO.contains(iPSDEField.getLowerCaseName())) {
				valueMap.put(iPSDEField.getLowerCaseName(), iEntityDTO.get(iPSDEField.getLowerCaseName()));
			}
		}

		if(ObjectUtils.isEmpty(valueMap)) {
			return;
		}

		//查出当前数据
		Object key = iEntityDTO.get(this.getKeyPSDEField().getLowerCaseName());
		if(!ObjectUtils.isEmpty(key)) {
			ISearchContextDTO iSearchContextDTO = this.getIrAttachmentDERuntime().createSearchContext().all().count(false);
			iSearchContextDTO.eq(IrAttachmentDTO.FIELD_RES_MODEL, this.getLowerCaseName());
			iSearchContextDTO.eq(IrAttachmentDTO.FIELD_RES_ID, key);
			List<IrAttachmentDTO> irAttachmentDTOList = (List<IrAttachmentDTO>)(Object)this.getIrAttachmentDERuntime().rawSelect(iSearchContextDTO);
			if(!ObjectUtils.isEmpty(irAttachmentDTOList)) {
				List<Object> removeIdList = new ArrayList<Object>();
				for(IrAttachmentDTO irAttachmentDTO : irAttachmentDTOList) {
					String strFieldName = irAttachmentDTO.getResField();
					if(ObjectUtils.isEmpty(strFieldName)) {
						continue;
					}

					if(!valueMap.containsKey(strFieldName.toLowerCase())) {
						continue;
					}

					removeIdList.add(irAttachmentDTO.getId());
				}

				if(!ObjectUtils.isEmpty(removeIdList)) {
					IDBDialect iDBDialect = this.getIrAttachmentDERuntime().getSysDBSchemeRuntimeMust().getDBDialect();
					//移除
					StringBuilder sb = new StringBuilder();
					sb.append(String.format("DELETE FROM %1$s WHERE %2$s ", iDBDialect.getDBObjStandardName(this.getIrAttachmentDERuntime().getTableName()), iDBDialect.getDBObjStandardName(this.getIrAttachmentDERuntime().getKeyPSDEField().getLowerCaseName())));
					if(removeIdList.size() == 1) {
						sb.append(" = ? ");
					}
					else {
						sb.append(" IN (");
						for(int i = 0;i<removeIdList.size();i++) {
							if(i != 0) {
								sb.append(",");
							}
							sb.append("?");
						}
						sb.append(" )");
					}
					this.getIrAttachmentDERuntime().getSysDBSchemeRuntimeMust().executeSQL(sb.toString(), removeIdList);
				}
			}
		}

		//插入数据
		if(!ObjectUtils.isEmpty(key)) {
			for(java.util.Map.Entry<String, Object> entry : valueMap.entrySet()) {
				Object value = entry.getValue();
				if(ObjectUtils.isEmpty(value)) {
					continue;
				}

				List list = JsonUtils.asList(value);
				if(ObjectUtils.isEmpty(list)) {
					continue;
				}

				List<IrAttachmentDTO> irAttachmentDTOList = new ArrayList<IrAttachmentDTO>();
				for(Object item : list) {
					if(!(item instanceof Map)){
						continue;
					}

					Map map = (Map)item;
					String id = DataTypeUtils.asString(map.get("id"));
					String name = DataTypeUtils.asString(map.get("name"));
					int size = DataTypeUtils.asInteger(map.get("size"), -1);
					String ext = DataTypeUtils.asString(map.get("ext"));

					IrAttachmentDTO irAttachmentDTO = new IrAttachmentDTO();
					irAttachmentDTO.setName(name);
					irAttachmentDTO.setFileId(id);
					if(size>0) {
						irAttachmentDTO.setFileSize(size);
					}
					irAttachmentDTO.setType("binary");

					irAttachmentDTO.setResModel(this.getLowerCaseName());
					irAttachmentDTO.setResId(key.toString());
					irAttachmentDTO.setResField(entry.getKey());

					irAttachmentDTO.setId(KeyValueUtils.genUniqueId());
					irAttachmentDTOList.add(irAttachmentDTO);
				}

				this.getIrAttachmentDERuntime().rawCreate(irAttachmentDTOList, false);
			}
		}
	}



	@Override
	protected void translateEntityAfterProceed(Object arg0, Object objRet, String strActionName, IPSDEAction iPSDEAction, IPSDataEntity iPSDataEntity, IDynaInstRuntime iDynaInstRuntime, Object actionData) throws Throwable {
		if(this.getDEType() != DEType.ABSTRACT.value && !OdooModels.IR_ATTACHMENT.equalsIgnoreCase(this.getFullUniqueTag()) && this.getStorageMode() == DEStorageType.SQL.value) {
			IEntityDTO iEntityDTO = null;
			if (objRet instanceof IEntityDTO) {
				iEntityDTO = (IEntityDTO) objRet;
			} else {
				iEntityDTO = (IEntityDTO) arg0;
			}
			this.translateEntityIrAttachmentsAfterProceed(iEntityDTO, strActionName, iPSDEAction);
		}
		super.translateEntityAfterProceed(arg0, objRet, strActionName, iPSDEAction, iPSDataEntity, iDynaInstRuntime, actionData);
	}

	protected void translateEntityIrAttachmentsAfterProceed(IEntityDTO iEntityDTO, String strActionName, IPSDEAction iPSDEAction) throws Throwable {
		List<IPSDEField> irAttachmentPSDEFieldList = this.getIrAttachmentPSDEFields();
		if(ObjectUtils.isEmpty(irAttachmentPSDEFieldList)) {
			return;
		}

		Object key = iEntityDTO.get(this.getKeyPSDEField().getLowerCaseName());
		if(!ObjectUtils.isEmpty(key)) {
			ISearchContextDTO iSearchContextDTO = this.getIrAttachmentDERuntime().createSearchContext().all().count(false);
			iSearchContextDTO.eq(IrAttachmentDTO.FIELD_RES_MODEL, this.getLowerCaseName());
			iSearchContextDTO.eq(IrAttachmentDTO.FIELD_RES_ID, key);
			List<IrAttachmentDTO> irAttachmentDTOList = (List<IrAttachmentDTO>)(Object)this.getIrAttachmentDERuntime().rawSelect(iSearchContextDTO);
			if(!ObjectUtils.isEmpty(irAttachmentDTOList)) {
				for(IPSDEField iPSDEField : irAttachmentPSDEFieldList) {
					//如果物理有数据，忽略
					if(iEntityDTO.contains(iPSDEField.getLowerCaseName()) ) {
						continue;
					}


					List<Map> list = new ArrayList<Map>();
					for(IrAttachmentDTO irAttachmentDTO : irAttachmentDTOList) {
						String strFieldName = irAttachmentDTO.getResField();
						if(ObjectUtils.isEmpty(strFieldName)) {
							continue;
						}

						if(!iPSDEField.getLowerCaseName().equals(strFieldName.toLowerCase())) {
							continue;
						}

						Map map = new LinkedHashMap<String, Object>();
						map.put("id", irAttachmentDTO.getFileId());
						map.put("name", irAttachmentDTO.getName());
						if(irAttachmentDTO.getFileSize() != null) {
							map.put("size", irAttachmentDTO.getFileSize());
						}
						list.add(map);
					}

					if(list.size() == 0) {
						continue;
					}

					String value = JsonUtils.toString(list);
					iEntityDTO.set(iPSDEField.getLowerCaseName(), value);
				}
			}
		}
	}


	@Override
	protected void removeReferenceBeforeRemove(Object arg0, String strActionName, IPSDEAction iPSDEAction, IPSDataEntity iPSDataEntity, IDynaInstRuntime iDynaInstRuntime, Object actionData) throws Throwable {
		if(this.getDEType() != DEType.ABSTRACT.value && !OdooModels.IR_ATTACHMENT.equalsIgnoreCase(this.getFullUniqueTag()) && this.getStorageMode() == DEStorageType.SQL.value) {
			this.removeEntityIrAttachments(arg0, strActionName, iPSDEAction);
		}
		super.removeReferenceBeforeRemove(arg0, strActionName, iPSDEAction, iPSDataEntity, iDynaInstRuntime, actionData);
	}

	protected void removeEntityIrAttachments(Object arg0, String strActionName, IPSDEAction iPSDEAction) throws Throwable {
		List<IPSDEField> irAttachmentPSDEFieldList = this.getIrAttachmentPSDEFields();
		if(ObjectUtils.isEmpty(irAttachmentPSDEFieldList)) {
			return;
		}

		Object key = null;
		if(arg0 instanceof IEntityDTO) {
			key = ((IEntityDTO)arg0).get(this.getKeyPSDEField().getLowerCaseName());
		}
		else {
			key = arg0;
		}

		if(!ObjectUtils.isEmpty(key)) {
			IDBDialect iDBDialect = this.getIrAttachmentDERuntime().getSysDBSchemeRuntimeMust().getDBDialect();
			//移除
			StringBuilder sb = new StringBuilder();
			sb.append(String.format("DELETE FROM %1$s WHERE %2$s = ? AND %3$s = ?", iDBDialect.getDBObjStandardName(this.getIrAttachmentDERuntime().getTableName()), iDBDialect.getDBObjStandardName(IrAttachmentDTO.FIELD_RES_MODEL), iDBDialect.getDBObjStandardName(IrAttachmentDTO.FIELD_RES_ID)));
			this.getIrAttachmentDERuntime().getSysDBSchemeRuntimeMust().executeSQL(sb.toString(), Arrays.asList(this.getLowerCaseName(), key));
		}
	}

	@Override
	public void fillEntityDTONestedFields(List<? extends IEntityDTO> list, IPSDEFGroup iPSDEFGroup) throws Throwable {
		if(this.getDEType() != DEType.ABSTRACT.value && !OdooModels.IR_ATTACHMENT.equalsIgnoreCase(this.getFullUniqueTag()) && this.getStorageMode() == DEStorageType.SQL.value) {
			this.fillEntityIrAttachments(list, iPSDEFGroup);
		}
		super.fillEntityDTONestedFields(list, iPSDEFGroup);
	}

	protected void fillEntityIrAttachments(List<? extends IEntityDTO> list, IPSDEFGroup iPSDEFGroup) throws Throwable {

		if (ObjectUtils.isEmpty(list)) {
			return;
		}

		List<IPSDEField> irAttachmentPSDEFieldList = this.getIrAttachmentPSDEFields();
		if(ObjectUtils.isEmpty(irAttachmentPSDEFieldList)) {
			return;
		}

		IEntityDTO firstEntityDTO = list.get(0);
		if (firstEntityDTO.getDEMethodDTORuntime() != null) {
			Map<String, List<IrAttachmentDTO>> irAttachmentDTOListMap = new LinkedHashMap<String, List<IrAttachmentDTO>>();

			List<Object> keyList = new ArrayList<>();
			for(IEntityDTO iEntityDTO : list) {
				Object key = iEntityDTO.get(this.getKeyPSDEField().getLowerCaseName());
				if(ObjectUtils.isEmpty(key)) {
					continue;
				}
				keyList.add(key);
			}

			IDEFGroupRuntime iDEFGroupRuntime = null;
			if (iPSDEFGroup != null && !ObjectUtils.isEmpty(iPSDEFGroup.getPSDEFGroupDetails())) {
				iDEFGroupRuntime = this.getDEFGroupRuntime(iPSDEFGroup, false);
			}

			for(IPSDEField iPSDEField : irAttachmentPSDEFieldList) {
				IPSDEMethodDTOField iPSDEMethodDTOField = firstEntityDTO.getDEMethodDTORuntime().getPSDEMethodDTOFieldByDEField(iPSDEField.getName(), true);
				if(iPSDEMethodDTOField == null) {
					continue;
				}

				if (iDEFGroupRuntime != null) {
					if (iPSDEMethodDTOField.getPSDEField() == null) {
						continue;
					}
					if (!iDEFGroupRuntime.contains(iPSDEMethodDTOField.getPSDEField())) {
						continue;
					}
				}

				irAttachmentDTOListMap.put(iPSDEField.getLowerCaseName(), new ArrayList<IrAttachmentDTO>());
			}

			if(!ObjectUtils.isEmpty(irAttachmentDTOListMap)) {

				ISearchContextDTO iSearchContextDTO = this.getIrAttachmentDERuntime().createSearchContext().all().count(false);
				iSearchContextDTO.eq(IrAttachmentDTO.FIELD_RES_MODEL, this.getLowerCaseName());
				iSearchContextDTO.in(IrAttachmentDTO.FIELD_RES_FIELD, irAttachmentDTOListMap.keySet());
				iSearchContextDTO.in(IrAttachmentDTO.FIELD_RES_ID, keyList);

				List<IrAttachmentDTO> irAttachmentDTOList = (List<IrAttachmentDTO>)(Object)this.getIrAttachmentDERuntime().rawSelect(iSearchContextDTO);
				if(!ObjectUtils.isEmpty(irAttachmentDTOList)) {
					for(IrAttachmentDTO irAttachmentDTO : irAttachmentDTOList) {
						String strFieldName = irAttachmentDTO.getResField();
						if(ObjectUtils.isEmpty(strFieldName)) {
							continue;
						}

						List<IrAttachmentDTO> tempList = irAttachmentDTOListMap.get(strFieldName);
						if(tempList == null) {
							continue;
						}

						tempList.add(irAttachmentDTO);
					}

					for(IEntityDTO iEntityDTO : list) {

						Object key = iEntityDTO.get(this.getKeyPSDEField().getLowerCaseName());
						if(ObjectUtils.isEmpty(key)) {
							continue;
						}

						for(IPSDEField iPSDEField : irAttachmentPSDEFieldList) {

							List<IrAttachmentDTO> irAttachmentDTOList2 = irAttachmentDTOListMap.get(iPSDEField.getLowerCaseName());
							if(ObjectUtils.isEmpty(irAttachmentDTOList2)) {
								continue;
							}

							//如果物理有数据，忽略
							if(iEntityDTO.contains(iPSDEField.getLowerCaseName()) ) {
								continue;
							}

							List<Map> list2 = new ArrayList<Map>();
							for(IrAttachmentDTO irAttachmentDTO : irAttachmentDTOList2) {
								String strResId = irAttachmentDTO.getResId();
								if(ObjectUtils.isEmpty(strResId)) {
									continue;
								}

								if(!key.equals(strResId)) {
									continue;
								}

								Map map = new LinkedHashMap<String, Object>();
								map.put("id", irAttachmentDTO.getFileId());
								map.put("name", irAttachmentDTO.getName());
								if(irAttachmentDTO.getFileSize() != null) {
									map.put("size", irAttachmentDTO.getFileSize());
								}
								list2.add(map);
							}

							if(list2.size() == 0) {
								continue;
							}

							String value = JsonUtils.toString(list2);
							iEntityDTO.set(iPSDEField.getLowerCaseName(), value);
						}
					}
				}
			}
		}
	}


	protected IDataEntityRuntime getIrAttachmentDERuntime() {
		if(this.irAttachmentDERuntime == null) {
			this.irAttachmentDERuntime = this.getMainSystemRuntime().getDataEntityRuntime(OdooModels.IR_ATTACHMENT);
		}
		return this.irAttachmentDERuntime;
	}

	@Override
	public IOdooSystemRuntimeBase getSystemRuntime() {
		return (IOdooSystemRuntimeBase) super.getSystemRuntime();
	}

	@Override
	protected IDEDataQueryCodeRuntime createDefaultDEDataQueryCodeRuntime(IPSDEDataQueryCode iPSDEDataQueryCode) {
		return new RealtimeDEDataQueryCodeRuntime();
	}

	@Override
	protected void fillEntityDefaultValues(IEntityBase arg0, String strActionName, IPSDEAction iPSDEAction, IPSDataEntity iPSDataEntity, IDynaInstRuntime iDynaInstRuntime, Object actionData) throws Throwable {

		super.fillEntityDefaultValues(arg0, strActionName, iPSDEAction, iPSDataEntity, iDynaInstRuntime, actionData);

		//填充IR_DEFAULT配置的实体属性默认值

		// 判断是否为获取草稿行为
		boolean bGetDraftMode = DEActions.GETDRAFT.equals(strActionName) || (iPSDEAction != null && DEActionModes.GETDRAFT.equals(iPSDEAction.getActionMode()));

		if (bGetDraftMode) {
			//获取当前实体的所有默认值
			ISearchContextDTO iSearchContextDTO = this.getIrDefaultDERuntime().createSearchContext();
			iSearchContextDTO.all().ll(IrDefaultDTO.FIELD_FIELD_ID, this.getFullUniqueTag());
			List<IEntityDTO> defaults = this.getIrDefaultDERuntime().select(iSearchContextDTO);

			// 获取上下文的用户和组织信息
			String srfUserId = (String) getUserContext().getSessionParams().get("srfuserid");
			String srfOrgId = (String) getUserContext().getSessionParams().get("srforgid");

			// 遍历所有默认值配置
			for (IEntityDTO defaultObj : defaults) {
				String fieldId = (String) defaultObj.get(IrDefaultDTO.FIELD_FIELD_ID);
				String strDefaultValue = (String) defaultObj.get(IrDefaultDTO.FIELD_JSON_VALUE);
				if(!StringUtils.hasLength(fieldId) || !StringUtils.hasLength(strDefaultValue)){
					continue;
				}
				String[] fieldIdArr = fieldId.split("[.]");
				String defNameOfFieldId = fieldIdArr[fieldIdArr.length - 1];
				String userId = (String) defaultObj.get(IrDefaultDTO.FIELD_USER_ID);
				String companyId = (String) defaultObj.get(IrDefaultDTO.FIELD_COMPANY_ID);

				// 获取默认值匹配的实体字段
				IPSDEField matchedField = iPSDataEntity.getPSDEField(defNameOfFieldId, true);

				// 给匹配字段赋值
				if (matchedField != null) {
					if (isFillFieldDefaultValueWhenNull()) {
						if (this.getFieldValue(arg0, matchedField) != null) {
							continue;
						}
					} else {
						if (this.containsFieldValue(arg0, matchedField)) {
							continue;
						}
					}
					//检查用户和组织匹配条件，满足一项条件则进行赋值（1.仅用户匹配 2.仅公司匹配 3.两者都匹配 4.不限制）
					boolean userMatch = !StringUtils.hasLength(userId) || srfUserId.equalsIgnoreCase(userId);
					boolean companyMatch = !StringUtils.hasLength(companyId) || srfOrgId.equalsIgnoreCase(companyId);

					if (userMatch && companyMatch) {
						String strDefaultValueType = matchedField.getDefaultValueType();
						Object objValue = strDefaultValue;

						// 根据默认字段类型计算默认值
						if (StringUtils.hasLength(strDefaultValue) && StringUtils.hasLength(strDefaultValueType)) {
							objValue = calcFieldValue(arg0, matchedField, strDefaultValueType, strDefaultValue);
						}

						this.setFieldValue(arg0, matchedField, objValue);
					}
				}
			}

		}
	}

	public IOdooSystemRuntimeBase getMainSystemRuntime() {
		IOdooSystemRuntimeBase mainSystemRuntime = (IOdooSystemRuntimeBase)((IOdooSystemRuntimeBase) super.getSystemRuntime()).getMainSystemRuntime(true);
		if(mainSystemRuntime == null) {
			mainSystemRuntime = this.getSystemRuntime();
		}
		return mainSystemRuntime;
	}

	protected IDataEntityRuntime getIrDefaultDERuntime() {
		if (this.irDefaultDERuntime == null) {
			this.irDefaultDERuntime = this.getMainSystemRuntime().getDataEntityRuntime(OdooModels.IR_DEFAULT);
		}

		return this.irDefaultDERuntime;
	}


}

