package net.ibizsys.central.cloud.core.util;

import java.io.BufferedReader;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.List;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.apache.tools.ant.filters.StringInputStream;
import org.springframework.util.StringUtils;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import net.ibizsys.central.cloud.core.util.domain.ChatMessage;
import net.ibizsys.central.cloud.core.util.domain.ChatMessageRole;

/**
 * 聊天消息构建器
 * @author lionlau
 *
 */
public class ChatMessagesBuilder {

	public final static String SYSTEM_BEGIN = "<system>";
	
	public final static String SYSTEM_END = "</system>";
	
	public final static String USER_BEGIN = "<user>";
	
	public final static String USER_END = "</user>";
	
	public final static String ASSISTANT_BEGIN = "<assistant>";
	
	public final static String ASSISTANT_END = "</assistant>";
	
	public final static String TOOL_BEGIN = "<tool>";
	
	public final static String TOOL_END = "</tool>";
	
	
	private List<ChatMessage> list = new ArrayList<ChatMessage>();

	public ChatMessagesBuilder user(String strMessage) {
		ChatMessage chatMessage = new ChatMessage();
		chatMessage.setRole(ChatMessageRole.USER.getValue());
		chatMessage.setContent(strMessage);
		list.add(chatMessage);
		return this;
	}

	public ChatMessagesBuilder assistant(String strMessage) {
		ChatMessage chatMessage = new ChatMessage();
		chatMessage.setRole(ChatMessageRole.ASSISTANT.getValue());
		chatMessage.setContent(strMessage);
		list.add(chatMessage);
		return this;
	}

	public ChatMessagesBuilder system(String strMessage) {
		ChatMessage chatMessage = new ChatMessage();
		chatMessage.setRole(ChatMessageRole.SYSTEM.getValue());
		chatMessage.setContent(strMessage);
		list.add(chatMessage);
		return this;
	}
	
	public ChatMessagesBuilder tool(String strMessage) {
		ChatMessage chatMessage = new ChatMessage();
		chatMessage.setRole(ChatMessageRole.TOOL.getValue());
		chatMessage.setContent(strMessage);
		list.add(chatMessage);
		return this;
	}
	

	public ChatMessagesBuilder xml(String strXmlMessages) throws Exception {

		if (!StringUtils.hasLength(strXmlMessages)) {
			return this;
		}

		strXmlMessages = strXmlMessages.trim();
		if(strXmlMessages.indexOf("<![CDATA[") == -1) {
		
			try (BufferedReader reader = new BufferedReader(new StringReader(strXmlMessages))) {
				// 读取每行事件数据
				StringBuilder sb = null;
				String start = null;
				String line;
				
				while ((line = reader.readLine()) != null) {
					if (StringUtils.hasLength(line)) {
						//判断类型
						if(line.indexOf(SYSTEM_BEGIN) == 0) {
							if(StringUtils.hasLength(start)) {
								throw new Exception(String.format("已经出现开始标记[%1$s]", start));
							}
							sb = new StringBuilder();
							start = SYSTEM_BEGIN;
							continue;
						}
						
						if(line.indexOf(SYSTEM_END) == 0) {
							if(!SYSTEM_BEGIN.equals(start)) {
								throw new Exception(String.format("未出现开始标记[%1$s]", SYSTEM_BEGIN));
							}
							
							this.system(sb.toString());
							start = null;
							sb = null;
							continue;
						}
						
						if(line.indexOf(USER_BEGIN) == 0) {
							if(StringUtils.hasLength(start)) {
								throw new Exception(String.format("已经出现开始标记[%1$s]", start));
							}
							sb = new StringBuilder();
							start = USER_BEGIN;
							continue;
						}
						
						if(line.indexOf(USER_END) == 0) {
							if(!USER_BEGIN.equals(start)) {
								throw new Exception(String.format("未出现开始标记[%1$s]", USER_BEGIN));
							}
							
							this.user(sb.toString());
							start = null;
							sb = null;
							continue;
						}
						
						if(line.indexOf(ASSISTANT_BEGIN) == 0) {
							if(StringUtils.hasLength(start)) {
								throw new Exception(String.format("已经出现开始标记[%1$s]", start));
							}
							sb = new StringBuilder();
							start = ASSISTANT_BEGIN;
							continue;
						}
												
						if(line.indexOf(ASSISTANT_END) == 0) {
							if(!ASSISTANT_BEGIN.equals(start)) {
								throw new Exception(String.format("未出现开始标记[%1$s]", ASSISTANT_BEGIN));
							}
							
							this.assistant(sb.toString());
							start = null;
							sb = null;
							continue;
						}
						
						if(line.indexOf(TOOL_BEGIN) == 0) {
							if(StringUtils.hasLength(start)) {
								throw new Exception(String.format("已经出现开始标记[%1$s]", start));
							}
							sb = new StringBuilder();
							start = TOOL_BEGIN;
							continue;
						}
						
						if(line.indexOf(TOOL_END) == 0) {
							if(!TOOL_BEGIN.equals(start)) {
								throw new Exception(String.format("未出现开始标记[%1$s]", TOOL_BEGIN));
							}
							
							this.tool(sb.toString());
							start = null;
							sb = null;
							continue;
						}
						
						if(sb == null) {
							continue;
						}
						
						if(StringUtils.hasLength(sb.toString())){
							sb.append("\r\n");
						}
						sb.append(line);
					}
					else {
						if(sb != null) {
							sb.append("\r\n");
						}
					}
				}
			}
		}
		else {
			String strXML = String.format("<?xml version=\"1.0\" encoding=\"UTF-8\"?>\r\n<CHATMESSAGES>\r\n%1$s\r\n</CHATMESSAGES>", strXmlMessages);

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
						String nodeValue = element.getTextContent();
						if(StringUtils.hasLength(nodeValue)) {
							nodeValue = nodeValue.replace("\r\n", "\n");
							nodeValue = nodeValue.replace("\r", "\n");
							nodeValue = StringUtils.trimLeadingCharacter(nodeValue, '\n');
							nodeValue = StringUtils.trimTrailingCharacter(nodeValue, '\n');
						}

						if (ChatMessageRole.SYSTEM.getValue().equalsIgnoreCase(nodeName)) {
							this.system(nodeValue);
							continue;
						}

						if (ChatMessageRole.USER.getValue().equalsIgnoreCase(nodeName)) {
							this.user(nodeValue);
							continue;
						}

						if (ChatMessageRole.ASSISTANT.getValue().equalsIgnoreCase(nodeName)) {
							this.assistant(nodeValue);
							continue;
						}
						
						if (ChatMessageRole.TOOL.getValue().equalsIgnoreCase(nodeName)) {
							this.tool(nodeValue);
							continue;
						}

						throw new Exception(String.format("无法识别的节点[%1$s]", nodeName));
					}
				}
			}
		}

		return this;
	}

	public List<ChatMessage> build() {
		return this.build(null);
	}

	public List<ChatMessage> build(List<ChatMessage> dst) {
		if (dst == null) {
			dst = new ArrayList<ChatMessage>();
		}
		dst.addAll(this.list);
		return dst;
	}
}
