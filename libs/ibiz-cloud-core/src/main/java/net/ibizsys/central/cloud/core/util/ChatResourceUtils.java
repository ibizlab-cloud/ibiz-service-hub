package net.ibizsys.central.cloud.core.util;

import java.io.BufferedReader;
import java.io.ByteArrayOutputStream;
import java.io.StringReader;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

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

import com.knuddels.jtokkit.api.Encoding;
import com.knuddels.jtokkit.api.EncodingType;

import groovy.text.Template;
import net.ibizsys.central.ISystemRuntime;
import net.ibizsys.central.ISystemRuntimeContext;
import net.ibizsys.central.cloud.core.cloudutil.ICloudUtilRuntime;
import net.ibizsys.central.cloud.core.cloudutil.client.ICloudOSSClient;
import net.ibizsys.central.cloud.core.security.EmployeeContext;
import net.ibizsys.central.cloud.core.sysutil.ISysCloudClientUtilRuntime;
import net.ibizsys.central.cloud.core.util.domain.ChatCompletionRequest;
import net.ibizsys.central.cloud.core.util.domain.ChatMessage;
import net.ibizsys.central.cloud.core.util.domain.ChatMessageRole;
import net.ibizsys.central.dataentity.IDataEntityRuntime;
import net.ibizsys.central.util.IEntityDTO;
import net.ibizsys.model.PSModelEnums.ReportContentType;
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

	private ISysCloudClientUtilRuntime iSysCloudClientUtilRuntime = null;

	private Encoding encoding;
	
	public ChatResourceUtils(IModelRuntimeContext iModelRuntimeContext) {
		Assert.notNull(iModelRuntimeContext, "传入模型上下文对象无效");
		this.iModelRuntimeContext = iModelRuntimeContext;

		this.encoding = JTokenKitUtils.getEncoding(EncodingType.CL100K_BASE);
	}

	protected IModelRuntimeContext getModelRuntimeContext() {
		return this.iModelRuntimeContext;
	}

	protected ISystemRuntime getSystemRuntime() {
		if (this.getModelRuntimeContext() instanceof ISystemRuntimeContext) {
			return ((ISystemRuntimeContext) this.getModelRuntimeContext()).getSystemRuntime();
		}
		throw new RuntimeException("系统运行时对象无效");
	}

	protected int getMaxConvertTokens() {
		return 15000;
	}
	
	
	@Override
	public void convert(ChatCompletionRequest chatCompletionRequest, boolean bTestPriv) throws Exception {
		this.convert(chatCompletionRequest, bTestPriv, new AtomicInteger(this.getMaxConvertTokens()));
	}

	@Override
	public void convert(ChatCompletionRequest chatCompletionRequest, boolean bTestPriv, AtomicInteger limit) throws Exception {
		List<ChatMessage> chatMessages = chatCompletionRequest.getMessages();
		if (ObjectUtils.isEmpty(chatMessages)) {
			return;
		}

		
		boolean bConvert = false;
		List<ChatMessage> newList  = new ArrayList<ChatMessage>();
		for (int i = 0; i < chatMessages.size() ; i++) {
			ChatMessage chatMessage = chatMessages.get(i);
			if (i == 0) {
				if (ChatMessageRole.SYSTEM.getValue().equalsIgnoreCase(chatMessage.getRole())) {
					newList.add(0, chatMessage);
					continue;
				}
			}
			
			if (!shouldConvert(chatMessage)) {
				newList.add(chatMessage);
				continue;
			}
			if(!bConvert)
				bConvert = true;
			
			List<ChatMessage> list = this.convert(chatMessage, bTestPriv, limit);
			if(ObjectUtils.isEmpty(list)) {
				continue;
			}
			list.get(0).set(FIELD_ORIGINAL, chatMessage.getContent());
			newList.addAll(list);
		}
		if(bConvert) {
			chatCompletionRequest.set(FIELD_ORIGINAL, chatMessages);
		}
		
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

	protected ChatMessage removeResourcesContent(ChatMessage chatMessage) throws Exception {
		if (shouldConvert(chatMessage)) {
			chatMessage.setContent(removeResourcesContent(chatMessage.getContent()));
		}
		return chatMessage;
	}

	protected String removeResourcesContent(String strContent) throws Exception {
		try (BufferedReader reader = new BufferedReader(new StringReader(strContent))) {
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
			return String.join("\n", otherLines);
		}
	}

	@Override
	public List<ChatMessage> convert(ChatMessage chatMessage, boolean testPriv) throws Exception {
		return this.convert(chatMessage, testPriv, null);
	}
	
	@Override
	public List<ChatMessage> convert(ChatMessage chatMessage, boolean testPriv, AtomicInteger limit) throws Exception {
		List<IEntity> entityList = new ArrayList<IEntity>();
		StringBuilder contentBuilder = new StringBuilder();
		this.fillResourceEntities(chatMessage, entityList, contentBuilder, testPriv, true);
		return convert(chatMessage, contentBuilder.toString(), entityList, limit);

	}
	
	@Override
	public List<IEntity> getResourceEntities(ChatMessage chatMessage, boolean testPriv, boolean fillContent) throws Exception {
		List<IEntity> entityList = new ArrayList<IEntity>();
		this.fillResourceEntities(chatMessage, entityList, null, testPriv, fillContent);
		return entityList;
	}
	
	protected void fillResourceEntities(ChatMessage chatMessage, List<IEntity> entityList, StringBuilder otherStringBuilder, boolean testPriv, boolean fillContent) throws Exception {
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

			// 解析XML内容
			String strXML = String.format("<?xml version=\"1.0\" encoding=\"UTF-8\"?>\r\n<resources>\r\n%1$s\r\n</resources>", String.join("\n", resourceLines).trim());
			if(otherStringBuilder != null) {
				otherStringBuilder.append(String.join("\n", otherLines));
			}
			
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
							entityList.add(this.getResourceEntity(node, testPriv, fillContent));
							continue;
						}

						throw new Exception(String.format("无法识别的节点[%1$s]", nodeName));
					}
				}
			}
		}
	}

	protected List<ChatMessage> convert(ChatMessage chatMessage, String content, List<IEntity> entityList, AtomicInteger limit) throws Exception {

		if(limit != null) {
			//循环处理内容
			for(IEntity iEntity : entityList) {
				String strContent = (String) iEntity.get("content");
				if(!StringUtils.hasLength(strContent)) {
					iEntity.set("content", "");
					continue;
				}
				
				int nLeave = limit.get();
				if(nLeave <= 0) {
					iEntity.set("content", "注意：上下文长度超过限制，内容已被截断");
				}
				else {
					//判断长度
					int nToken = this.encoding.countTokens(strContent); 
					if(nToken <= nLeave) {
						nLeave -= nToken;
					}
					else {
						//需要截断
						String strNewContent = this.encoding.decode(this.encoding.encode(strContent, nLeave).getTokens());
						iEntity.set("content", strNewContent + "...。\r\n注意：上下文长度超过限制，内容已被截断");
						nLeave = 0;
					}
				}
				limit.set(nLeave);
			}
		}
		
		
		String templateContent = getChatMessagesTemplateContent();
		if (StringUtils.hasLength(templateContent)) {
			Map<String, Object> params = new HashMap<String, Object>();
			params.put(TEMPLPARAM_DATA, entityList);
			params.put(TEMPLPARAM_SYS, this.getSystemRuntime());
			params.put(TEMPLPARAM_CONTENT, content);

			String xmlMessages = null;
			try {
				xmlMessages = this.getContent(templateContent, params);
			} catch (Throwable ex) {
				throw new Exception(String.format("获取聊天消息发生异常，%1$s", ex.getMessage()), ex);
			}

			return new ChatMessagesBuilder().xml(xmlMessages).build();
		} else {
			if (!ObjectUtils.isEmpty(entityList)) {
				String strUserContent = String.format("我将提供%1$s份资料：", entityList.size());
				for (int i = 0; i < entityList.size(); i++) {
					if (i != 0) {
						strUserContent += "、";
					}
					strUserContent += String.format("`%1$s`", entityList.get(i).get("name"));
				}
				strUserContent += "。后续请严格基于这些资料交流。（注意：这些资料已被多模态识别为MD内容）\r\n";
				for (int i = 0; i < entityList.size(); i++) {
					String strUrl = DataTypeUtils.asString(entityList.get(i).get("url"));
					if(StringUtils.hasLength(strUrl)) {
						strUrl = String.format("(DownloadUrl`%1$s`)", strUrl);
					}
					else {
						strUrl = "";
					}
					strUserContent += String.format("___\r\n`%1$s`BEGIN%3$s\r\n___\r\n%2$s\r\n___\r\n`%1$s`END\r\n___\r\n", entityList.get(i).get("name"), entityList.get(i).get("content"), strUrl);
					//chatMessagesBuilder.user(String.format("`%1$s`内容如下：\n\n%2$s", entityList.get(i).get("name"), entityList.get(i).get("content"))).assistant("明白");
				}
				
				strUserContent+= content;
				
				return ChatMessagesBuilder.create().user(strUserContent).build();
			} else {
				return ChatMessagesBuilder.create().user(content).build();
			}
		}
	}

	protected String getChatMessagesTemplateContent() throws Exception {
		String resourcePath = String.format("/chatresources/chatmessages.xml");
		String templateContent = this.getTemplateContent(resourcePath, null);
		if (!StringUtils.hasLength(templateContent)) {
			// throw new Exception(String.format("未存在指定路径[%1$s]系统资源",
			// resourcePath));
			return getDefaultChatMessagesTemplateContent();
		}
		return templateContent;
	}

	protected String getDefaultChatMessagesTemplateContent() {
		return null;
	}

	protected IEntity getResourceEntity(Node node, boolean testPriv, boolean fillContent) throws Exception {
		String type = null;
		String version = "1.0";
		if (node.hasAttributes()) {
			Node typeNode = node.getAttributes().getNamedItem("type");
			if (typeNode != null) {
				type = typeNode.getTextContent();
			}
			Node versionNode = node.getAttributes().getNamedItem("version");
			if (versionNode != null) {
				version = versionNode.getTextContent();
			}
		}

		if (!StringUtils.hasLength(type)) {
			throw new Exception("未指定资源类型");
		}

		String data = null;
		String metadata = null;

		Node dataNode = null;
		Node metadataNode = null;

		if (node.hasChildNodes()) {
			NodeList nodeList = node.getChildNodes();
			for (int i = 0; i < nodeList.getLength(); i++) {
				Node childNode = nodeList.item(i);
				if (dataNode == null && "data".equalsIgnoreCase(childNode.getNodeName())) {
					dataNode = childNode;
					continue;
				}
				if (metadataNode == null && "metadata".equalsIgnoreCase(childNode.getNodeName())) {
					metadataNode = childNode;
					continue;
				}
			}
		}

		if (dataNode == null) {
			throw new Exception("未指定数据节点");
		}

		if (metadataNode == null) {
			throw new Exception("未指定元数据节点");
		}

		data = dataNode.getTextContent();
		if (StringUtils.hasLength(data)) {
			data = data.replace("\r\n", "\n");
			data = data.replace("\r", "\n");
			data = StringUtils.trimLeadingCharacter(data, '\n');
			data = StringUtils.trimTrailingCharacter(data, '\n');
		}

		metadata = metadataNode.getTextContent();
		if (StringUtils.hasLength(metadata)) {
			metadata = metadata.replace("\r\n", "\n");
			metadata = metadata.replace("\r", "\n");
			metadata = StringUtils.trimLeadingCharacter(metadata, '\n');
			metadata = StringUtils.trimTrailingCharacter(metadata, '\n');
		}

		if (!StringUtils.hasLength(data)) {
			throw new Exception("数据节点未携带内容");
		}

		if (!StringUtils.hasLength(metadata)) {
			throw new Exception("元数据节点未携带内容");
		}

		Map dataMap = null;
		Map metadataMap = null;

		try {
			dataMap = JsonUtils.asMap(data);
		} catch (Throwable ex) {
			throw new Exception(String.format("数据内容格式化不正确"));
		}

		try {
			metadataMap = JsonUtils.asMap(metadata);
		} catch (Throwable ex) {
			throw new Exception(String.format("元数据内容格式化不正确"));
		}

		return this.getResourceEntity(type, version, dataMap, metadataMap, testPriv, fillContent);
	}
	
	

	@Override
	public String getResource(String type, String subType, Object key, Map<String, Object> params, boolean testPriv) throws Exception {
		if (RESOURCETYPE_DATAENTITY.equalsIgnoreCase(type)) {
			Map<String, Object> data = new LinkedHashMap<String, Object>();
			data.put("de_name", subType);
			data.put("id", key);
			IEntity iEntity = this.getResourceEntity(type, "1.0", data, null, testPriv);
			return DataTypeUtils.asString(iEntity.get("content"));
		}

		if (RESOURCETYPE_OSSFILE.equalsIgnoreCase(type)) {
			Map<String, Object> data = new LinkedHashMap<String, Object>();
			data.put("folder", subType);
			data.put("id", key);
			IEntity iEntity = this.getResourceEntity(type, "1.0", data, null, testPriv);
			return DataTypeUtils.asString(iEntity.get("content"));
		}

		throw new Exception(String.format("未支持的资源类型[%1$s]", type));
	}
	
	@Override
	public IEntity getResourceEntity(String type, String version, Map data, Map metadata, boolean testPriv) throws Exception {
		return this.getResourceEntity(type, version, data, metadata, testPriv, true);
	}
	

	@Override
	public IEntity getResourceEntity(String type, String version, Map data, Map metadata, boolean testPriv, boolean fillContent) throws Exception {
		Entity entity = new Entity();
		IEntity iEntity = this.onGetResourceEntity(type, version, data, metadata, testPriv, fillContent);
		if (!ObjectUtils.isEmpty(metadata)) {
			entity.putAll(metadata);
		}
		if (!ObjectUtils.isEmpty(data)) {
			entity.putAll(data);
		}
		entity.copyToIf(iEntity);
		iEntity.set("type", type);
		return iEntity;
	}
	

	protected IEntity onGetResourceEntity(String type, String version, Map data, Map metadata, boolean testPriv, boolean fillContent) throws Exception {
		if (RESOURCETYPE_DATAENTITY.equalsIgnoreCase(type)) {
			String templId = DataTypeUtils.asString(data.get("templ_id"));
			Object id = data.get("id");
			String deName = DataTypeUtils.asString(data.get("de_name"));
			if (!StringUtils.hasLength(deName)) {
				throw new Exception("未指定实体名称");
			}

			if (ObjectUtils.isEmpty(id)) {
				throw new Exception("未指定实体数据主键");
			}

			IDataEntityRuntime iDataEntityRuntime = getSystemRuntime().getDataEntityRuntime(deName);
			if (testPriv) {
				if (!iDataEntityRuntime.getDataEntityAccessManager().testDataAccessActionIf(EmployeeContext.getCurrentMust(), id, DataAccessActions.READ)) {
					throw new Exception(String.format("实体[%1$s]数据[%2$s]不具备访问权限", iDataEntityRuntime.getName(), id));
				}
			}

			IEntityDTO iEntityDTO;
			try {
				iEntityDTO = iDataEntityRuntime.get(id);
			} catch (Throwable ex) {
				throw new Exception(String.format("实体[%1$s]获取数据[%2$s]发送异常，%3$s", iDataEntityRuntime.getName(), id, ex.getMessage()), ex);
			}

			Entity entity = new Entity();
			
			if(fillContent) {
				String strContent = null;
				String templateContent = null;
				// 获取模板路径
				
				if (StringUtils.hasLength(templId)) {
					String resourcePath = String.format("/chatresources/de/%1$s.%2$s.md", iDataEntityRuntime.getName(), templId);
					templateContent = this.getTemplateContent(resourcePath, null);
				}
				if (!StringUtils.hasLength(templateContent)) {
					String resourcePath = String.format("/chatresources/de/%1$s.md", iDataEntityRuntime.getName());
					templateContent = this.getTemplateContent(resourcePath, null);
					if (!StringUtils.hasLength(templateContent)) {
						throw new Exception(String.format("未存在指定路径[%1$s]系统资源", resourcePath));
					}
				}

				Map<String, Object> params = new HashMap<String, Object>();
				params.put(TEMPLPARAM_DATA, Arrays.asList(iEntityDTO));
				params.put(TEMPLPARAM_SYS, this.getSystemRuntime());
				params.put(TEMPLPARAM_DE, iDataEntityRuntime);

				try {
					strContent = this.getContent(templateContent, params);
				} catch (Throwable ex) {
					throw new Exception(String.format("获取内容发生异常，%1$s", ex.getMessage()), ex);
				}
				entity.set("content", strContent);
			}

			if (iDataEntityRuntime.getMajorPSDEField() != null) {
				entity.set("name", String.format("%1$s.md", iEntityDTO.get(iDataEntityRuntime.getMajorPSDEField().getLowerCaseName())));
			}
			return entity;
		}

		if (RESOURCETYPE_OSSFILE.equalsIgnoreCase(type)) {
			String fileId = DataTypeUtils.asString(data.get("id"));
			String fileFolder = DataTypeUtils.asString(data.get("folder"));
			if (!StringUtils.hasLength(fileFolder) && !ObjectUtils.isEmpty(metadata)) {
				fileFolder = DataTypeUtils.asString(metadata.get("folder"));
			}

			if (ObjectUtils.isEmpty(fileId)) {
				throw new Exception("未指定OSS文件标识");
			}

			Entity entity = new Entity();
			if(fillContent) {
				String strContent = null;
				String strUrl = null;
				ICloudOSSClient iCloudOSSClient = this.getSysCloudClientUtilRuntime().getServiceClient(ICloudUtilRuntime.CLOUDCONFIGID_OSS, ICloudOSSClient.class, true);
				if (StringUtils.hasLength(fileFolder)) {
					strContent = iCloudOSSClient.downloadText(fileFolder, fileId);
					strUrl = String.format("lb://%1$s/ibizutil/download/%2$s/%3$s", ICloudUtilRuntime.CLOUDSERVICEURL_OSS, fileFolder, fileId);
				} else {
					strContent = iCloudOSSClient.downloadText(fileId);
					strUrl = String.format("lb://%1$s/ibizutil/download/%2$s", ICloudUtilRuntime.CLOUDSERVICEURL_OSS, fileId);
				}
				entity.set("content", strContent);
				entity.set("url", strUrl);
			}
			return entity;
		}

		if (RESOURCETYPE_DEPRINT.equals(type)) {
			String printId = DataTypeUtils.asString(data.get("print_id"));
			Object id = data.get("id");
			String deName = DataTypeUtils.asString(data.get("de_name"));
			if (!StringUtils.hasLength(deName)) {
				throw new Exception("未指定实体名称");
			}

			if (ObjectUtils.isEmpty(id)) {
				throw new Exception("未指定实体数据主键");
			}
			
			if (ObjectUtils.isEmpty(printId)) {
				throw new Exception("未指定实体打印标识");
			}
			
			String[] ids =String.valueOf(id).split("[,]");

			IDataEntityRuntime iDataEntityRuntime = getSystemRuntime().getDataEntityRuntime(deName);
			if (testPriv) {
				for(String strId : ids) {
					if (!iDataEntityRuntime.getDataEntityAccessManager().testDataAccessActionIf(EmployeeContext.getCurrentMust(), strId, DataAccessActions.READ)) {
						throw new Exception(String.format("实体[%1$s]数据[%2$s]不具备访问权限", iDataEntityRuntime.getName(), strId));
					}
				}
			}
			
			Entity entity = new Entity();
			if(fillContent) {
				ByteArrayOutputStream baos = new ByteArrayOutputStream();
				try {
					iDataEntityRuntime.outputPrint(printId, baos, ids, ReportContentType.MARKDOWN.value, false);
				} catch (Throwable ex) {
					throw new Exception(ex.getMessage(), ex);
				}
				entity.set("content", baos.toString("utf-8"));
			}
			
			entity.set("name", String.format("%1$s(%2$s).md", iDataEntityRuntime.getLogicName(), id));
			return entity;
		}

		throw new Exception(String.format("未支持的资源类型[%1$s]", type));
	}

	protected String getTemplateContent(String resourcePath, String defaultValue) throws Exception {
		return this.getSystemRuntime().getResourceContent(resourcePath, defaultValue);
	}

	protected String getContent(String strTemplate, Map<String, Object> params) throws Exception {

		Template template = null;
		try {
			template = this.getSystemRuntime().getGroovyTemplate(strTemplate);
		} catch (Throwable ex) {
			throw new Exception(String.format("获取模板对象发生异常，%1$s", ex.getMessage()), ex);
		}

		StringWriter sw = new StringWriter();
		template.make(params).writeTo(sw);
		return sw.toString();

	}

	protected ISysCloudClientUtilRuntime getSysCloudClientUtilRuntime() {
		if (this.iSysCloudClientUtilRuntime == null) {
			this.iSysCloudClientUtilRuntime = this.getSystemRuntime().getSysUtilRuntime(ISysCloudClientUtilRuntime.class, false);
		}
		return this.iSysCloudClientUtilRuntime;
	}
	
	public static void clearOriginalContent(ChatCompletionRequest chatCompletionRequest){
		chatCompletionRequest.reset(FIELD_ORIGINAL);
		List<ChatMessage> chatMessageList = chatCompletionRequest.getMessages();
		if(ObjectUtils.isEmpty(chatMessageList)) {
			return;
		}
		for(ChatMessage chatMessage : chatMessageList) {
			chatMessage.reset(FIELD_ORIGINAL);
		}
	}
}
