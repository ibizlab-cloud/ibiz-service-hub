package net.ibizsys.codegen.template.runtime.support;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import net.ibizsys.model.dataentity.IPSDataEntity;
import net.ibizsys.model.dataentity.defield.IPSDEField;
import net.ibizsys.model.wf.*;
import org.springframework.util.ObjectUtils;
import org.springframework.util.StringUtils;

import net.ibizsys.codegen.groovy.engine.GroovyCodeGenEngine;
import net.ibizsys.model.IPSSystem;
import net.ibizsys.model.PSModelEnums;
import net.ibizsys.model.app.IPSApplication;
import net.ibizsys.model.app.dataentity.IPSAppDataEntity;
import net.ibizsys.model.util.Conditions;
import net.ibizsys.model.wf.IPSWFDE;
import net.ibizsys.model.wf.IPSWFLink;
import net.ibizsys.model.wf.IPSWFLinkCond;
import net.ibizsys.model.wf.IPSWFLinkCustomCond;
import net.ibizsys.model.wf.IPSWFLinkGroupCond;
import net.ibizsys.model.wf.IPSWFLinkSingleCond;
import net.ibizsys.model.wf.IPSWFProcess;
import net.ibizsys.model.wf.IPSWFProcessRole;
import net.ibizsys.model.wf.IPSWFVersion;

public class PSWFVersionExtension {

	public static String getCloudBpmn(IPSWFVersion iPSWFVersion) {
//		GroovyCodeGenEngine groovyCodeGenEngine = new GroovyCodeGenEngine();
//		groovyCodeGenEngine.init(strTemplatePath, bFromResource, params);
		return null;
	}

	public static List<IPSApplication> getCloudApps(IPSWFDE iPSWFDE) {
		List<IPSApplication> list = new ArrayList<IPSApplication>();
		IPSSystem iPSSystem = iPSWFDE.getParentPSModelObject(net.ibizsys.model.IPSSystem.class);
		if (iPSSystem.getAllPSApps() != null) {
			for (IPSApplication app : iPSSystem.getAllPSApps()) {
				if (!app.isMobileApp()) {
					if (app.getAllPSAppDataEntities() != null) {
						for (IPSAppDataEntity appentity : app.getAllPSAppDataEntities()) {
							if (appentity.getPSDataEntity() != null && appentity.getPSDataEntity().getId().equals(iPSWFDE.getPSDataEntity().getId())) {
								list.add(app);
							}
						}
					}
				}
			}
		}
		return list;
	}

	public static List getCloudMobApps(IPSWFDE iPSWFDE) {
		List<IPSApplication> list = new ArrayList<IPSApplication>();
		IPSSystem iPSSystem = iPSWFDE.getParentPSModelObject(net.ibizsys.model.IPSSystem.class);
		if (iPSSystem.getAllPSApps() != null) {
			for (IPSApplication app : iPSSystem.getAllPSApps()) {
				if (app.isMobileApp()) {
					if (app.getAllPSAppDataEntities() != null) {
						for (IPSAppDataEntity appentity : app.getAllPSAppDataEntities()) {
							if (appentity.getPSDataEntity() != null && appentity.getPSDataEntity().getId().equals(iPSWFDE.getPSDataEntity().getId())) {
								list.add(app);
							}
						}
					}
				}
			}
		}
		return list;
	}

	public static String getCloudProcessUser(IPSWFProcess iPSWFProcess) {

		List<IPSWFProcessRole> psWFProcessRoles = net.ibizsys.codegen.groovy.support.PSWFVersionExtension.getPSWFProcessRoles(iPSWFProcess);
		if (!ObjectUtils.isEmpty(psWFProcessRoles)) {
			List<String> list = new ArrayList<String>();
			for (IPSWFProcessRole iPSWFProcessRole : psWFProcessRoles) {
				if (PSModelEnums.WFProcRoleType.WFROLE.value.equals(iPSWFProcessRole.getWFProcessRoleType())) {
					if (iPSWFProcessRole.getPSWFRole() != null) {
						if (StringUtils.hasLength(iPSWFProcessRole.getUserData()) && StringUtils.hasLength(iPSWFProcessRole.getUserData2())) {
							list.add(String.format("${wfCoreService.getGroupUsers('%s|%s|%s',execution)}", iPSWFProcessRole.getPSWFRole().getCodeName(), iPSWFProcessRole.getUserData(), iPSWFProcessRole.getUserData2()));
						} else {
							list.add(String.format("${wfCoreService.getGroupUsers('%s',execution)}", iPSWFProcessRole.getPSWFRole().getCodeName()));
						}
					}
				} else if (PSModelEnums.WFProcRoleType.UDACTOR.value.equals(iPSWFProcessRole.getWFProcessRoleType())) {
					if (StringUtils.hasLength(iPSWFProcessRole.getUDField())) {
						for (String field : iPSWFProcessRole.getUDField().split(";")) {
							list.add(String.format("${activedata.%s}", field.toLowerCase()));
						}
					}
				} else if (PSModelEnums.WFProcRoleType.CURACTOR.value.equals(iPSWFProcessRole.getWFProcessRoleType())) {
					// 此处有问题，
					// list.add(String.format("${activedata.%s}", "createman"));
					if (iPSWFProcess instanceof IPSWFInteractiveProcess) {
						IPSWFInteractiveProcess iPSWFInteractiveProcess = (IPSWFInteractiveProcess) iPSWFProcess;
						IPSDataEntity iPSDataEntity = iPSWFInteractiveProcess.getPSDataEntity();
						if (iPSDataEntity != null && iPSDataEntity.getAllPSDEFields() != null) {
							Optional<IPSDEField> optional = iPSDataEntity.getAllPSDEFields().stream().filter(field -> PSModelEnums.PredefinedFieldType.CREATEMAN.value.equals(field.getPredefinedType())).findFirst();
							if (optional.isPresent()) {
								list.add(String.format("${activedata.%s}", optional.get().getCodeName().toLowerCase()));
							}
						}
					}
				}
			}
			return String.join(",", list);
		}

		return "";

	}

	public static String getCloudProcessUser2(IPSWFProcess iPSWFProcess) {

		List<IPSWFProcessRole> psWFProcessRoles = net.ibizsys.codegen.groovy.support.PSWFVersionExtension.getPSWFProcessRoles(iPSWFProcess);
		if (!ObjectUtils.isEmpty(psWFProcessRoles)) {
			List<String> list = new ArrayList<String>();
			for (IPSWFProcessRole iPSWFProcessRole : psWFProcessRoles) {
				if (PSModelEnums.WFProcRoleType.WFROLE.value.equals(iPSWFProcessRole.getWFProcessRoleType())) {
					if (iPSWFProcessRole.getPSWFRole() != null) {
						if (StringUtils.hasLength(iPSWFProcessRole.getUserData()) && StringUtils.hasLength(iPSWFProcessRole.getUserData2())) {
							list.add(String.format("#wfCoreService.getGroupUsers2('%s|%s|%s',#execution)", iPSWFProcessRole.getPSWFRole().getCodeName(), iPSWFProcessRole.getUserData(), iPSWFProcessRole.getUserData2()));
						} else {
							list.add(String.format("#wfCoreService.getGroupUsers2('%s',#execution)", iPSWFProcessRole.getPSWFRole().getCodeName()));
						}
					}
				} else if (PSModelEnums.WFProcRoleType.UDACTOR.value.equals(iPSWFProcessRole.getWFProcessRoleType())) {
					if (StringUtils.hasLength(iPSWFProcessRole.getUDField())) {
						for (String field : iPSWFProcessRole.getUDField().split(";")) {
							list.add(String.format("#activedata.%s", field.toLowerCase()));
						}
					}
				} else if (PSModelEnums.WFProcRoleType.CURACTOR.value.equals(iPSWFProcessRole.getWFProcessRoleType())) {

				}

			}
			return String.join(",", list);
		}

		return "";

	}

	public static String getCloudDueDate(IPSWFProcess iPSWFProcess) {
		String temp = "%s%s%s";
		if (iPSWFProcess.isEnableTimeout() && iPSWFProcess.getTimeout() > 0) {
			if (PSModelEnums.WFTimeoutType.MINUTE.value.equals(iPSWFProcess.getTimeoutType())) {
				return String.format(temp, "M", iPSWFProcess.getTimeout(), "PT");
			} else if (PSModelEnums.WFTimeoutType.HOUR.value.equals(iPSWFProcess.getTimeoutType())) {
				return String.format(temp, "H", iPSWFProcess.getTimeout(), "PT");
			} else if (PSModelEnums.WFTimeoutType.DAY.value.equals(iPSWFProcess.getTimeoutType())) {
				return String.format(temp, "D", iPSWFProcess.getTimeout(), "P");
			}
		}
		return "";
	}

	public static String getCloudCondInfo(IPSWFLink iPSWFLink) {
		StringBuffer info = new StringBuffer();
		if (iPSWFLink.getPSWFLinkGroupCond() != null) {
			List<IPSWFLinkCond> conds = iPSWFLink.getPSWFLinkGroupCond().getPSWFLinkConds();
			if (conds != null && conds.size() > 0) {
				for (int i = 0; i < conds.size(); i++) {
					if (i > 0)
						info.append(" && ");
					getCloudGroupCondInfo(info, conds.get(i));
				}
			}
		}

		return info.toString();
	}

	public static void getCloudGroupCondInfo(StringBuffer info, IPSWFLinkCond iPSWFLinkCond) {
		if (iPSWFLinkCond instanceof IPSWFLinkSingleCond) {
			IPSWFLinkSingleCond iPSWFLinkSingleCond = (IPSWFLinkSingleCond) iPSWFLinkCond;
			String fieldInfo = iPSWFLinkSingleCond.getFieldName();
			if (StringUtils.hasLength(fieldInfo)) {
				fieldInfo = fieldInfo.toLowerCase();
				String fieldCondInfo = "";
				if (Conditions.ISNULL.equals(iPSWFLinkSingleCond.getCondOP()) || Conditions.ISNOTNULL.equals(iPSWFLinkSingleCond.getCondOP())) {
					fieldCondInfo = String.format("wfCoreService.test(activedata.%s, '%s', null)", fieldInfo, iPSWFLinkSingleCond.getCondOP());
				} else if ("ENTITYFIELD".equals(iPSWFLinkSingleCond.getParamType())) {
					if (StringUtils.hasLength(iPSWFLinkSingleCond.getParamValue())) {
						fieldCondInfo = String.format("wfCoreService.test(activedata.%s, '%s', activedata.%s)", fieldInfo, iPSWFLinkSingleCond.getCondOP(), iPSWFLinkSingleCond.getParamValue().toLowerCase());
					} else {
						fieldCondInfo = String.format("wfCoreService.test(activedata.%s, '%s', null)", fieldInfo, iPSWFLinkSingleCond.getCondOP());
					}
				} else if ("CURTIME".equals(iPSWFLinkSingleCond.getParamType())) {
					fieldCondInfo = String.format("wfCoreService.test(activedata.%s, '%s',  wfCoreService.getnow())", fieldInfo, iPSWFLinkSingleCond.getCondOP());
				} else {
					if (StringUtils.hasLength(iPSWFLinkSingleCond.getParamValue())) {
						fieldCondInfo = String.format("wfCoreService.test(activedata.%s, '%s', '%s')", fieldInfo, iPSWFLinkSingleCond.getCondOP(), iPSWFLinkSingleCond.getParamValue().replace("‘", "").replace("“", "").replace("”", ""));
					} else {
						fieldCondInfo = String.format("wfCoreService.test(activedata.%s, '%s', null)", fieldInfo, iPSWFLinkSingleCond.getCondOP());
					}
				}
				info.append(fieldCondInfo);
			}
		} else if (iPSWFLinkCond instanceof IPSWFLinkCustomCond) {

		} else if (iPSWFLinkCond instanceof IPSWFLinkGroupCond) {
			IPSWFLinkGroupCond iPSWFLinkGroupCond = (IPSWFLinkGroupCond) iPSWFLinkCond;
			List<IPSWFLinkCond> conds = iPSWFLinkGroupCond.getPSWFLinkConds();
			if (conds != null && conds.size() > 0) {
				if (iPSWFLinkGroupCond.isNotMode()) {
					info.append("!");
				}
				info.append("(");
				for (int i = 0; i < conds.size(); i++) {
					if (i > 0)
						info.append(String.format(" %s ", "AND".equals(iPSWFLinkGroupCond.getGroupOP()) ? "&&" : "||"));
					getCloudGroupCondInfo(info, conds.get(i));
				}
				info.append(")");
			}
		}
	}
}
