package net.ibizsys.codegen.groovy.support;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.util.DigestUtils;
import org.springframework.util.ObjectUtils;
import org.springframework.util.StringUtils;

import net.ibizsys.model.IPSSystem;
import net.ibizsys.model.PSModelEnums.WFLinkType;
import net.ibizsys.model.PSModelEnums.WFProcMultiInstMode;
import net.ibizsys.model.PSModelEnums.WFProcRoleType;
import net.ibizsys.model.wf.IPSWFCallActivityProcess;
import net.ibizsys.model.wf.IPSWFCallOrgActivityProcess;
import net.ibizsys.model.wf.IPSWFEmbedWFProcess;
import net.ibizsys.model.wf.IPSWFEmbedWFProcessBase;
import net.ibizsys.model.wf.IPSWFInteractiveProcess;
import net.ibizsys.model.wf.IPSWFLink;
import net.ibizsys.model.wf.IPSWFProcess;
import net.ibizsys.model.wf.IPSWFProcessRole;
import net.ibizsys.model.wf.IPSWFRole;
import net.ibizsys.model.wf.IPSWFVersion;
import net.ibizsys.model.wf.IPSWorkflow;

public class PSWFVersionExtension {

	public static String getDeployId(IPSWorkflow iPSWorkflow) {
		IPSSystem iPSSytem = iPSWorkflow.getParentPSModelObject(IPSSystem.class);
		return DigestUtils.md5DigestAsHex(String.format("%1$s||%2$s", iPSSytem.getObjectNode().toString() ,iPSWorkflow.getCodeName()).getBytes());

	}

	public static String getDeployId(IPSWFVersion iPSWFVersion) {
		String strDeployId = getDeployId(iPSWFVersion.getPSWorkflowMust());
		return DigestUtils.md5DigestAsHex(String.format("%1$s||%2$s", strDeployId ,iPSWFVersion.getObjectNode().toString()).getBytes());
	}

	public static String getDeployId(IPSWFProcess iPSWFProcess) {
		String strDeployId = getDeployId(iPSWFProcess.getParentPSModelObject(IPSWFVersion.class));
		return DigestUtils.md5DigestAsHex(String.format("%1$s||%2$s", strDeployId ,iPSWFProcess.getObjectNode().toString()).getBytes());
	}

	public static String getDeployId(IPSWFLink iPSWFLink) {
		return String.format("%1$s-%2$s", getDeployId(iPSWFLink.getFromPSWFProcessMust()) ,getDeployId(iPSWFLink.getToPSWFProcessMust()));
	}

	public static Collection<IPSWFRole> getPSWFRoles(IPSWFVersion iPSWFVersion) {

		Map<String, IPSWFRole> psWFRoleMap = new HashMap<>();
		if (!ObjectUtils.isEmpty(iPSWFVersion.getPSWFProcesses())) {
			List<IPSWFProcessRole> psWFProcessRoleList = new ArrayList<IPSWFProcessRole>();
			for (IPSWFProcess iPSWFProcess : iPSWFVersion.getPSWFProcesses()) {
				List<IPSWFProcessRole> list = getPSWFProcessRoles(iPSWFProcess);
				if (list != null) {
					psWFProcessRoleList.addAll(list);
				}
			}

			for (IPSWFProcessRole iPSWFProcessRole : psWFProcessRoleList) {
				if (WFProcRoleType.WFROLE.value.equals(iPSWFProcessRole.getWFProcessRoleType())) {
					if (!psWFRoleMap.containsKey(iPSWFProcessRole.getPSWFRoleMust().getCodeName())) {
						psWFRoleMap.put(iPSWFProcessRole.getPSWFRoleMust().getCodeName(), iPSWFProcessRole.getPSWFRoleMust());
					}
				}
			}
		}

		return psWFRoleMap.values();
	}

	public static List<IPSWFProcessRole> getPSWFProcessRoles(IPSWFProcess iPSWFProcess) {
		if (iPSWFProcess instanceof IPSWFInteractiveProcess) {
			return ((IPSWFInteractiveProcess) iPSWFProcess).getPSWFProcessRoles();
		}

		if (iPSWFProcess instanceof IPSWFCallOrgActivityProcess) {
			return ((IPSWFCallOrgActivityProcess) iPSWFProcess).getPSWFProcessRoles();
		}

		if (iPSWFProcess instanceof IPSWFEmbedWFProcess) {
			return ((IPSWFEmbedWFProcess) iPSWFProcess).getPSWFProcessRoles();
		}

		return null;
	}

	public static String getMultiInstMode(IPSWFProcess iPSWFProcess) {

		if (iPSWFProcess instanceof IPSWFInteractiveProcess) {
			return ((IPSWFInteractiveProcess) iPSWFProcess).getMultiInstMode();
		}

		if (iPSWFProcess instanceof IPSWFEmbedWFProcessBase) {
			return ((IPSWFEmbedWFProcessBase) iPSWFProcess).getMultiInstMode();
		}

		if (iPSWFProcess instanceof IPSWFCallActivityProcess) {
			return ((IPSWFCallActivityProcess) iPSWFProcess).getMultiInstMode();
		}

		return null;
	}

	public static boolean isMultiInstance(IPSWFProcess iPSWFProcess) {
		String strMultiInstMode = getMultiInstMode(iPSWFProcess);
		if (StringUtils.hasLength(strMultiInstMode) && !strMultiInstMode.equals(WFProcMultiInstMode.NONE.value)) {
			return WFProcMultiInstMode.PARALLEL.value.equals(strMultiInstMode) || WFProcMultiInstMode.SEQUENTIAL.value.equals(strMultiInstMode);
		}
		return false;
	}

	public static boolean isSequential(IPSWFProcess iPSWFProcess) {
		String strMultiInstMode = getMultiInstMode(iPSWFProcess);
		if (StringUtils.hasLength(strMultiInstMode)) {
			return WFProcMultiInstMode.SEQUENTIAL.value.equals(strMultiInstMode);
		}
		return false;

	}

	public static boolean hasTimeOutLink(IPSWFProcess iPSWFProcess) {
		if (!ObjectUtils.isEmpty(iPSWFProcess.getPSWFLinks())) {
			for (IPSWFLink iPSWFLink : iPSWFProcess.getPSWFLinks()) {
				if (WFLinkType.TIMEOUT.value.equals(iPSWFLink.getWFLinkType())) {
					return true;
				}
			}
		}
		return false;
	}
}
