package net.ibizsys.central.cloud.core.util;

import java.io.BufferedReader;
import java.io.StringReader;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.tools.ant.filters.StringInputStream;
import org.springframework.util.Assert;
import org.springframework.util.ObjectUtils;
import org.springframework.util.StringUtils;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import groovy.text.Template;
import net.ibizsys.central.ISystemRuntime;
import net.ibizsys.central.ISystemRuntimeContext;
import net.ibizsys.central.cloud.core.security.EmployeeContext;
import net.ibizsys.central.cloud.core.util.domain.ChatCompletionRequest;
import net.ibizsys.central.cloud.core.util.domain.ChatMessage;
import net.ibizsys.central.cloud.core.util.domain.ChatMessageRole;
import net.ibizsys.central.dataentity.IDataEntityRuntime;
import net.ibizsys.central.util.IEntityDTO;
import net.ibizsys.runtime.IModelRuntimeContext;
import net.ibizsys.runtime.security.DataAccessActions;
import net.ibizsys.runtime.util.DataTypeUtils;
import net.ibizsys.runtime.util.Entity;
import net.ibizsys.runtime.util.IEntity;
import net.ibizsys.runtime.util.JsonUtils;

public class ChatResourceUtils implements IChatResourceUtils {

	private static final Log log = LogFactory.getLog(ChatResourceUtils.class);

	public final static String RESOURCES_BEGIN = "<resources";
	
	public final static String RESOURCE_NAME = "resource";

	public final static String RESOURCES_END = "</resources>";
	
	public final static String DATA_NODENAME = "data";
	public final static String METADATA_NODENAME = "metadata";
	
	public final static String RESOURCETYPE_DATAENTITY = "dataentity";
	public final static String RESOURCETYPE_OSSFILE = "ossfile";
	
	/**
	 * 模板参数：数据
	 */
	public final static String TEMPLPARAM_DATA = "data";
	
	/**
	 * 模板参数：系统
	 */
	public final static String TEMPLPARAM_SYS = "sys";
	
	
	/**
	 * 模板参数：实体
	 */
	public final static String TEMPLPARAM_DE = "de";
	
	/**
	 * 模板参数：内容
	 */
	public final static String TEMPLPARAM_CONTENT = "content";
	

	private IModelRuntimeContext iModelRuntimeContext = null;
	
	public ChatResourceUtils(IModelRuntimeContext iModelRuntimeContext) {
		Assert.notNull(iModelRuntimeContext, "传入模型上下文对象无效");
		this.iModelRuntimeContext = iModelRuntimeContext;
	}
	

	protected IModelRuntimeContext getModelRuntimeContext() {
		return this.iModelRuntimeContext;
	}
	
	protected ISystemRuntime getSystemRuntime() {
		if(this.getModelRuntimeContext() instanceof ISystemRuntimeContext) {
			return ((ISystemRuntimeContext)this.getModelRuntimeContext()).getSystemRuntime();
		}
		throw new RuntimeException("系统运行时对象无效");
	}

	
	
	@Override
	public void convert(ChatCompletionRequest chatCompletionRequest, boolean bTestPriv) throws Exception {
		List<ChatMessage> chatMessages = chatCompletionRequest.getMessages();
		if(ObjectUtils.isEmpty(chatMessages)) {
			return;
		}
		
		ChatMessage lastMessage = chatMessages.get(chatMessages.size()-1);
		if(!shouldConvert(lastMessage)) {
			return;
		}
		
		List<ChatMessage> newList = this.convert(lastMessage, bTestPriv);
		lastMessage = newList.remove(newList.size()-1);
		
		for(int i = 0;i<chatMessages.size()-1;i++) {
			ChatMessage chatMessage = chatMessages.get(i);
			if(i == 0) {
				if(ChatMessageRole.SYSTEM.getValue().equalsIgnoreCase(chatMessage.getRole())) {
					newList.add(0, chatMessage);
					continue;
				}
			}
			newList.add(chatMessage);
		}
		
		newList.add(lastMessage);
		chatCompletionRequest.setMessages(newList);
	}

	@Override
	public boolean shouldConvert(ChatMessage chatMessage) {
		String strContent = chatMessage.getContent();
		if (StringUtils.hasLength(strContent)) {
			return strContent.trim().indexOf(RESOURCES_BEGIN) == 0;
		}
		return false;
	}

	@Override
	public List<ChatMessage> convert(ChatMessage chatMessage, boolean testPriv) throws Exception {
		List<IEntity> entityList = new ArrayList<IEntity>();
		String content = null;
		
		try (BufferedReader reader = new BufferedReader(new StringReader(chatMessage.getContent()))) {
			String line;
			List<String> resourceLines = new ArrayList<>();
			List<String> otherLines = new ArrayList<>();
			boolean inResourceBlock = false;
			while ((line = reader.readLine()) != null) {
				if (line.startsWith("<resources")) {
					inResourceBlock = true;
					continue; // 跳过开始标签行
				}

				if (line.startsWith("</resources>")) {
					inResourceBlock = false;
					continue; // 跳过结束标签行
				}

				if (inResourceBlock) {
					resourceLines.add(line);
				} else {
					otherLines.add(line);
				}
			}
			
			//解析XML内容
			String strXML = String.format("<?xml version=\"1.0\" encoding=\"UTF-8\"?>\r\n<resources>\r\n%1$s\r\n</resources>", String.join("\n", resourceLines).trim());
			content = String.join("\n", otherLines);
			
			// 创建 DocumentBuilderFactory 对象
			DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();

			// 创建 DocumentBuilder 对象
			DocumentBuilder builder = factory.newDocumentBuilder();

			try (StringInputStream is = new StringInputStream(strXML, "UTF-8")) {
				// 从 XML 文件加载 Document 对象
				Document document = builder.parse(is);

				// 获取根节点
				Element root = document.getDocumentElement();

				// 获取子节点列表
				NodeList nodeList = root.getChildNodes();

				// 遍历子节点
				for (int i = 0; i < nodeList.getLength(); i++) {
					Node node = nodeList.item(i);
					if (node.getNodeType() == Node.ELEMENT_NODE) {
						// 处理每个元素节点
						Element element = (Element) node;
						String nodeName = element.getNodeName();

						if (RESOURCE_NAME.equalsIgnoreCase(nodeName)) {
							entityList.add(this.getResourceEntity(node, testPriv));
							continue;
						}

						throw new Exception(String.format("无法识别的节点[%1$s]", nodeName));
					}
				}
			}
		}
		
		//获取模板路径
		String resourcePath = String.format("/chatresources/chatmessages.xml");
		String templateContent = this.getTemplateContent(resourcePath, null);
		if(!StringUtils.hasLength(templateContent)) {
			throw new Exception(String.format("未存在指定路径[%1$s]系统资源", resourcePath));
		}
		
		Map<String, Object> params = new HashMap<String, Object>();
		params.put(TEMPLPARAM_DATA, entityList);
		params.put(TEMPLPARAM_SYS, this.getSystemRuntime());
		params.put(TEMPLPARAM_CONTENT, content);
		
		String xmlMessages = null;
		try {
			xmlMessages = this.getContent(templateContent, params);
		}
		catch (Throwable ex) {
			throw new Exception(String.format("获取聊天消息发生异常，%1$s", ex.getMessage()), ex);
		}
		
		return new ChatMessagesBuilder().xml(xmlMessages).build();
	}

	protected IEntity getResourceEntity(Node node, boolean testPriv) throws Exception {
		String type = null;
		String version = "1.0";
		if(node.hasAttributes()) {
			Node typeNode = node.getAttributes().getNamedItem("type");
			if(typeNode != null) {
				type = typeNode.getTextContent();
			}
			Node versionNode = node.getAttributes().getNamedItem("version");
			if(versionNode != null) {
				version = versionNode.getTextContent();
			}
		}
		
		if(!StringUtils.hasLength(type)) {
			throw new Exception("未指定资源类型");
		}
		
		String data = null;
		String metadata = null;
		
		Node dataNode = null;
		Node metadataNode = null;
		
		if(node.hasChildNodes()) {
			NodeList nodeList = node.getChildNodes();
			for(int i = 0;i<nodeList.getLength();i++) {
				Node childNode = nodeList.item(i);
				if(dataNode == null && "data".equalsIgnoreCase(childNode.getNodeName())) {
					dataNode = childNode;
					continue;
				}
				if(metadataNode == null && "metadata".equalsIgnoreCase(childNode.getNodeName())) {
					metadataNode = childNode;
					continue;
				}
			}
		}
		
		if(dataNode == null) {
			throw new Exception("未指定数据节点");
		}
		
		if(metadataNode == null) {
			throw new Exception("未指定元数据节点");
		}
		
		
		data = dataNode.getTextContent();
		if(StringUtils.hasLength(data)) {
			data = data.replace("\r\n", "\n");
			data = data.replace("\r", "\n");
			data = StringUtils.trimLeadingCharacter(data, '\n');
			data = StringUtils.trimTrailingCharacter(data, '\n');
		}
		
		metadata = metadataNode.getTextContent();
		if(StringUtils.hasLength(metadata)) {
			metadata = metadata.replace("\r\n", "\n");
			metadata = metadata.replace("\r", "\n");
			metadata = StringUtils.trimLeadingCharacter(metadata, '\n');
			metadata = StringUtils.trimTrailingCharacter(metadata, '\n');
		}
		
		if(!StringUtils.hasLength(data)) {
			throw new Exception("数据节点未携带内容");
		}
		
		if(!StringUtils.hasLength(metadata)) {
			throw new Exception("元数据节点未携带内容");
		}
		
		Map dataMap = null;
		Map metadataMap = null;
		
		try{
			dataMap = JsonUtils.asMap(data);
		}
		catch (Throwable ex) {
			throw new Exception(String.format("数据内容格式化不正确"));
		}
		
		try{
			metadataMap = JsonUtils.asMap(metadata);
		}
		catch (Throwable ex) {
			throw new Exception(String.format("元数据内容格式化不正确"));
		}
				
		return this.getResourceEntity(type, version, dataMap, metadataMap, testPriv);
	}
	
	@Override
	public String getResource(String type, String subType, String key, boolean testPriv) throws Exception {
		if(RESOURCETYPE_DATAENTITY.equalsIgnoreCase(type)) {
			Map<String, Object> data = new LinkedHashMap<String, Object>();
			data.put("de_name", subType);
			data.put("id", key);
			IEntity iEntity = this.getResourceEntity(subType, "1.0", data, null, testPriv);
			return DataTypeUtils.asString(iEntity.get("content"));
		}
		throw new Exception(String.format("未支持的资源类型[%1$s]", type));
	}
	
	
	@Override
	public IEntity getResourceEntity(String type, String version, Map data, Map metadata, boolean testPriv) throws Exception {
		if(RESOURCETYPE_DATAENTITY.equalsIgnoreCase(type)) {
			String templId = DataTypeUtils.asString(data.get("templ_id"));
			String id = DataTypeUtils.asString(data.get("id"));
			String deName = DataTypeUtils.asString(data.get("de_name"));
			if(!StringUtils.hasLength(deName)) {
				throw new Exception("未指定实体名称");
			}
			
			if(!StringUtils.hasLength(id)) {
				throw new Exception("未指定实体数据主键");
			}
			
			IDataEntityRuntime iDataEntityRuntime = getSystemRuntime().getDataEntityRuntime(deName);
			if(testPriv) {
				if(!iDataEntityRuntime.getDataEntityAccessManager().testDataAccessActionIf(EmployeeContext.getCurrentMust(), id, DataAccessActions.READ)) {
					throw new Exception(String.format("实体[%1$s]数据[%2$s]不具备访问权限", iDataEntityRuntime.getName(), id));
				}
			}
			
			IEntityDTO iEntityDTO;
			try {
				iEntityDTO = iDataEntityRuntime.get(id);
			} catch (Throwable ex) {
				throw new Exception(String.format("实体[%1$s]获取数据[%2$s]发送异常，%3$s", iDataEntityRuntime.getName(), id, ex.getMessage()), ex);
			}
			
			//获取模板路径
			String templateContent = null;
			if(StringUtils.hasLength(templId)) {
				String resourcePath = String.format("/chatresources/de/%1$s.%2$s.md", iDataEntityRuntime.getName(), templId);
				templateContent = this.getTemplateContent(resourcePath, null);
			}
			if(!StringUtils.hasLength(templateContent)) {
				String resourcePath = String.format("/chatresources/de/%1$s.md", iDataEntityRuntime.getName());
				templateContent = this.getTemplateContent(resourcePath, null);
				if(!StringUtils.hasLength(templateContent)) {
					throw new Exception(String.format("未存在指定路径[%1$s]系统资源", resourcePath));
				}
			}
			
			
			Map<String, Object> params = new HashMap<String, Object>();
			params.put(TEMPLPARAM_DATA, Arrays.asList(iEntityDTO));
			params.put(TEMPLPARAM_SYS, this.getSystemRuntime());
			params.put(TEMPLPARAM_DE, iDataEntityRuntime);
			
			String strContent = null;
			try {
				strContent = this.getContent(templateContent, params);
			}
			catch (Throwable ex) {
				throw new Exception(String.format("获取内容发生异常，%1$s", ex.getMessage()), ex);
			}
			
			Entity entity = new Entity();
			if(!ObjectUtils.isEmpty(metadata)) {
				entity.putAll(metadata);
			}
			
			entity.set("content", strContent);
			
			
			return entity;
		}
		
		throw new Exception(String.format("未支持的资源类型[%1$s]", type));
	}
	
	protected String getTemplateContent(String resourcePath, String defaultValue) throws Exception {
		return this.getSystemRuntime().getResourceContent(resourcePath, defaultValue);
	}
	
	protected String getContent(String strTemplate, Map<String, Object> params)  throws Exception {
		
		Template template = null;
		try {
			template = this.getSystemRuntime().getGroovyTemplate(strTemplate);
		}
		catch (Throwable ex) {
			throw new Exception(String.format("获取模板对象发生异常，%1$s", ex.getMessage()), ex);
		}
		
		StringWriter sw = new StringWriter();
		template.make(params).writeTo(sw);
		return sw.toString();
		
	}
}
