package net.ibizsys.central.cloud.workflow.flowable.util;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamReader;

import net.ibizsys.central.cloud.core.security.EmployeeContext;
import net.ibizsys.central.cloud.core.security.IEmployeeContext;
import net.ibizsys.central.cloud.saas.ebsx.EBSXSystemRuntime;
import net.ibizsys.central.cloud.saas.ebsx.spring.core.lite.dto.MetaDynaModelDTO;
import net.ibizsys.central.cloud.saas.ebsx.spring.core.lite.service.IMetaDynaModelService;
import net.ibizsys.central.cloud.saas.ebsx.spring.core.uaa.dto.DynaInstDTO;
import net.ibizsys.central.cloud.saas.ebsx.spring.core.uaa.service.IDynaInstService;
import net.ibizsys.central.util.SearchContextDTO;
import org.flowable.bpmn.converter.BpmnXMLConverter;
import org.flowable.bpmn.model.BpmnModel;
import org.flowable.bpmn.model.ExtensionAttribute;
import org.flowable.bpmn.model.ExtensionElement;
import org.flowable.bpmn.model.FlowElement;
import org.flowable.bpmn.model.Process;
import org.springframework.util.DigestUtils;
import org.springframework.util.ObjectUtils;

import net.ibizsys.central.cloud.core.util.domain.WFModel;

public class FlowableUtils {

	public static BpmnXMLConverter BpmnXMLConverter = new BpmnXMLConverter();

	/**
	 * 获取流程节点指定参数
	 *
	 * @param element
	 * @param property
	 * @param attribute
	 * @return
	 */
	public static String getElementParam(FlowElement element, String property, String attribute) {
		List<ExtensionElement> formProps = element.getExtensionElements().get(property);
		if (formProps == null) {
			return null;
		}
		for (ExtensionElement prop : formProps) {
			if (prop.getAttributes() == null) {
				return null;
			}
			Map<String, List<ExtensionAttribute>> attributes = prop.getAttributes();
			if (attributes.containsKey(attribute)) {
				return ObjectUtils.isEmpty(attributes.get(attribute)) ? null : String.valueOf(attributes.get(attribute).get(0).getValue());
			}
		}
		return null;
	}


	public static BpmnModel getBpmnModel(ByteArrayOutputStream bpmnFile ,String processDefinitionKey) throws Exception {
		BpmnModel bpmnModel = null;
		XMLInputFactory factory = XMLInputFactory.newInstance();
		XMLStreamReader reader = null;
		try(InputStream inputStream = new ByteArrayInputStream(bpmnFile.toByteArray());){
			reader = factory.createXMLStreamReader(inputStream);
			bpmnModel = BpmnXMLConverter.convertToBpmnModel(reader);
			bpmnModel.getMainProcess().setId(processDefinitionKey);
		}
		finally {
			try {
				if(reader != null) {
					reader.close();
				}
			}
			catch(Exception ex) {

			}
		}
		return bpmnModel;

	}

	/**
	 * 获取工作流部署文件
	 * @param input
	 * @return
	 */
	public static ByteArrayOutputStream getByteArrayOutputStream(InputStream input) throws Exception{
		ByteArrayOutputStream baos = new ByteArrayOutputStream();
		byte[] buffer = new byte[1024];
		int len;
		while ((len = input.read(buffer)) > -1) {
			baos.write(buffer, 0, len);
		}
		baos.flush();
		return baos;
	}


	/**
	 * 计算bpmnfileId
	 * @param bpmnFile
	 * @param processDefinitionKey
	 * @return
	 */
	public static String getBpmnFileId(ByteArrayOutputStream bpmnFile, String processDefinitionKey) throws Exception{
		XMLInputFactory factory = XMLInputFactory.newInstance();
		OutputStream out = null;
		InputStream is = null;
		XMLStreamReader reader2 = null;
		InputStream inputStream2 = null;
		String bmpmfileId = null;
		BpmnModel entitymodel = null;

		try {
			inputStream2 = new ByteArrayInputStream(bpmnFile.toByteArray());
			reader2 = factory.createXMLStreamReader(inputStream2);
			entitymodel = BpmnXMLConverter.convertToBpmnModel(reader2);
			entitymodel.getMainProcess().setId(processDefinitionKey);
			byte[] bs = BpmnXMLConverter.convertToXML(entitymodel);
			bmpmfileId = DigestUtils.md5DigestAsHex(bs);
		} catch (XMLStreamException e) {
			throw e;
		} finally {
			try {
				if (reader2 != null) {
					reader2.close();
				}
			} catch (Exception e) {
			}
			try {
				if (is != null) {
					is.close();
				}
			} catch (Exception exis) {
			}
			try {
				if (out != null) {
					out.close();
				}
			} catch (Exception exis) {
			}
		}
		return bmpmfileId;
	}


	/**
	 * 获取工作流模型
	 * @param model
	 * @param bpmnFileName
	 * @return
	 */
	public static WFModel getWFModel(BpmnModel model , String bpmnFileName) throws Exception{

		String deployInfo = "";
		WFModel wfreModel = new WFModel();

//		AuthenticationUser user = AuthenticationUser.getAuthenticationUser();
//		if (user == null || StringUtils.isEmpty(user.getSrfdcid())){
//			deployInfo += String.format("部署工作流失败，无法获取租户标识[%s] \r\n", bpmnFileName);
//			wfreModel.setName(deployInfo);
//			return wfreModel;
//		}

		List<Process> processes = model.getProcesses();
		if (ObjectUtils.isEmpty(processes)) {
//			deployInfo += bpmnFileName + "解析失败，没有找到流程配置信息" + "\r\n";
//			wfreModel.setName(deployInfo);
//			return wfreModel;
			throw new Exception(String.format(bpmnFileName + "解析失败，没有找到流程配置信息"));
		}

		Process curProcess = model.getMainProcess();
		if (!curProcess.getExtensionElements().containsKey("field")) {
//			deployInfo += bpmnFileName + "解析失败，没有实体订阅配置" + "\r\n";
//			wfreModel.setName(deployInfo);
//			return wfreModel;
			throw new Exception(String.format(bpmnFileName + "解析失败，没有实体订阅配置"));
		}

		String[] params = curProcess.getId().split("-");
		if (params.length != 2) {
//			deployInfo += bpmnFileName + "解析失败，没有发布系统配置" + "\r\n";
//			wfreModel.setName(deployInfo);
//			return wfreModel;
			throw new Exception(String.format(bpmnFileName + "解析失败，没有发布系统配置"));
		}

		Map<String, String> bookingapps = new HashMap<String, String>();
		Map<String, String> bookingmobs = new HashMap<String, String>();
		int isValid = 1;
		String bookings = "";
		String refgroups = "";

		for (ExtensionElement field : curProcess.getExtensionElements().get("field")) {
			if ("bookings".equals(field.getAttributes().get("name").get(0).getValue())) {
				bookings = field.getChildElements().get("string").get(0).getElementText();
			}
			if ("refgroups".equals(field.getAttributes().get("name").get(0).getValue())) {
				refgroups = field.getChildElements().get("string").get(0).getElementText();
			}
			if ("isvalid".equals(field.getAttributes().get("name").get(0).getValue())) {
				isValid = Integer.valueOf(field.getChildElements().get("string").get(0).getElementText());
			}

			if (field.getAttributes().get("name").get(0).getValue().startsWith("bookingapps_")) {
				String bookingapp = field.getChildElements().get("string").get(0).getElementText();
				if (!ObjectUtils.isEmpty(bookingapp)) {
					String[] arr = field.getAttributes().get("name").get(0).getValue().split("_");
					if (arr.length > 1) {
						bookingapps.put(arr[1], bookingapp);
					}
				}
			}

			if (field.getAttributes().get("name").get(0).getValue().startsWith("bookingmobs_")) {
				String bookingmob = field.getChildElements().get("string").get(0).getElementText();
				if (!ObjectUtils.isEmpty(bookingmob)) {
					String[] arr = field.getAttributes().get("name").get(0).getValue().split("_");
					if (arr.length > 1) {
						bookingmobs.put(arr[1], bookingmob);
					}
				}
			}
		}

		if (ObjectUtils.isEmpty(bookings)) {
//			deployInfo += bpmnFileName + "解析失败，没有实体订阅配置" + "\r\n";
//			wfreModel.setName(deployInfo);
//			return wfreModel;
			throw new Exception(String.format(bpmnFileName + "解析失败，没有实体订阅配置"));
		}

		String system = params[0];
		String workflow = params[1];
		String processDefinitionKey = null;
		String dynaModelId = null;
		Integer version = Integer.parseInt(params[1].substring(params[1].lastIndexOf("v") + 1));

		if (!ObjectUtils.isEmpty(bpmnFileName) && bpmnFileName.contains(":") && bpmnFileName.split(":").length == 3) {
			String[] bpmnParams = bpmnFileName.split(":");
			dynaModelId = bpmnParams[1];
			system = bpmnParams[2];
			if("___srfDefaultInst___".equals(dynaModelId)||"___srfDefualtInst___".equals(dynaModelId)){
				try {
					dynaModelId = getActiveDynaInstId(system);
				}catch (Throwable ex){
					throw new Exception(String.format(bpmnFileName + "无法获取系统实例标识"));
				}
			}
			processDefinitionKey = String.format("wf%s-%s-%s-%s", dynaModelId, system, "%s", workflow);
		}

		if(ObjectUtils.isEmpty(processDefinitionKey) || ObjectUtils.isEmpty(dynaModelId)){
//			deployInfo += bpmnFileName + "参数格式不正确，无法获取流程定义标识" + "\r\n";
//			wfreModel.setName(deployInfo);
//			return wfreModel;
			throw new Exception(String.format(bpmnFileName + "参数格式不正确，无法获取流程定义标识"));
		}

		wfreModel.setRefGroup(refgroups);
		wfreModel.setRefDataEntity(bookings);
		wfreModel.setIsValid(isValid);
		wfreModel.set("system",system);
		wfreModel.set("workflow",workflow);
		wfreModel.set("dynaModelId",dynaModelId);
		wfreModel.set("version",version);
		wfreModel.set("processDefinitionKey",processDefinitionKey);
		wfreModel.set("bookingapps",bookingapps);
		wfreModel.set("bookingmobs",bookingmobs);
		return wfreModel;
	}

	public static void writeBpmnFile(BpmnModel entitymodel, String fileFullPath) throws Exception{
		OutputStream out = null;
		InputStream is = null;
		try {
			byte[] bs = BpmnXMLConverter.convertToXML(entitymodel);
			is = new ByteArrayInputStream(bs);
			File file = new File(fileFullPath);
			File parent = new File(file.getParent());
			if (!parent.exists()) {
				parent.mkdirs();
			}
			out = new FileOutputStream(fileFullPath);
			byte[] buff = new byte[1024];
			int len = 0;
			while ((len = is.read(buff)) != -1) {
				out.write(buff, 0, len);
			}
		} catch (IOException e) {
			throw e;
		} finally {
			try {
				if (is != null) {
					is.close();
				}
			} catch (Exception exis) {
			}
			try {
				if (out != null) {
					out.close();
				}
			} catch (Exception exis) {
			}
		}
	}

	/**
	 * 获取流程节点所有参数
	 *
	 * @param element
	 * @param property
	 * @return
	 */
	public static Map<String, String> getElementParams(FlowElement element, String property) {
		Map<String, String> params = new HashMap<>();
		if(element == null){
			//log.error("获取流程节点参数失败");
			return params;
		}
		List<ExtensionElement> formProps = element.getExtensionElements().get(property);
		if (formProps == null) {
			return null;
		}
		for (ExtensionElement prop : formProps) {
			if (prop.getAttributes() == null) {
				return null;
			}
			Map<String, List<ExtensionAttribute>> attributes = prop.getAttributes();
			for (String attribute : attributes.keySet()) {
				if (!ObjectUtils.isEmpty(attributes.get(attribute))) {
					params.put(attribute, attributes.get(attribute).get(0).getValue());
				}
			}
		}
		return params;
	}


	public static String getActiveDynaInstId(String system) throws Throwable {
		IEmployeeContext iEmployeeContext = EmployeeContext.getCurrentMust();
		String dcSystemId = iEmployeeContext.getDcsystemid();
		String srfDCId = iEmployeeContext.getTenant();
		DynaInstDTO dynaInstDTO = EBSXSystemRuntime.getInstance().getDynaInstService().selectOne(new SearchContextDTO().eq(IDynaInstService.FIELD_DCSYSTEMID, dcSystemId).eq(IDynaInstService.FIELD_ISVALID, 1).eq(IDynaInstService.FIELD_INTERNALINST, 1).eq(IDynaInstService.FIELD_DEFAULTINST, 1).eq(IDynaInstService.FIELD_SRFDCID, srfDCId), true);
		MetaDynaModelDTO metaDynaModelDTO = EBSXSystemRuntime.getInstance().getMetaDynaModelService().selectOne(new SearchContextDTO().eq(IMetaDynaModelService.FIELD_SYSDYNAINSTID, dynaInstDTO.getDynaInstId()).eq(IMetaDynaModelService.FIELD_STATUS, "1").eq(IMetaDynaModelService.FIELD_SRFDCID, srfDCId).nvl(IMetaDynaModelService.FIELD_PDYNAINSTID), true);
		return metaDynaModelDTO.getConfigId();
	}

}
