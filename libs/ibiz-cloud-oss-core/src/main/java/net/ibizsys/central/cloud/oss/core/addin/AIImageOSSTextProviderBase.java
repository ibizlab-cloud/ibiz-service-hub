package net.ibizsys.central.cloud.oss.core.addin;

import java.awt.image.BufferedImage;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.util.Base64;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import javax.imageio.ImageIO;

import org.apache.commons.io.FileUtils;
import org.apache.commons.io.FilenameUtils;
import org.apache.commons.logging.LogFactory;
import org.springframework.util.ObjectUtils;
import org.springframework.util.StringUtils;

import com.fasterxml.jackson.databind.node.ArrayNode;
import com.fasterxml.jackson.databind.node.ObjectNode;

import net.ibizsys.central.cloud.core.sysutil.ISysAIUtilRuntime;
import net.ibizsys.central.cloud.core.util.domain.ChatCompletionRequest;
import net.ibizsys.central.cloud.core.util.domain.ChatContent;
import net.ibizsys.central.cloud.core.util.domain.ChatContentType;
import net.ibizsys.central.cloud.core.util.domain.ChatMessage;
import net.ibizsys.central.cloud.core.util.domain.ChatMessageRole;
import net.ibizsys.runtime.util.DataTypeUtils;
import net.ibizsys.runtime.util.JsonUtils;

public abstract class AIImageOSSTextProviderBase extends OSSTextProviderBase{

	private static final org.apache.commons.logging.Log log = LogFactory.getLog(AIImageOSSTextProviderBase.class);
	
	private Map<String, Object> aiImageParams = new ConcurrentHashMap<String, Object>();
	private ISysAIUtilRuntime iSysAIUtilRuntime = null;
	
	public final static String AGENT_ENGINE_PREFIX = "ENGINE.";
	
	public final static String AGENT_ENGINE_OCR = "ENGINE.OCR";
	
	@Override
	protected void onInit() throws Exception {
		this.getContext().getSettings("aiimage", this.aiImageParams);
		super.onInit();
	}
	
	@Override
	protected void onReloadSetting() throws Throwable {
		this.aiImageParams.clear();
		this.getContext().getSettings("aiimage", this.aiImageParams);
		super.onReloadSetting();
	}
	
	protected final Map<String, Object> getAIImageParams() {
		return this.aiImageParams;
	}
	
	protected ISysAIUtilRuntime getSysAIUtilRuntime() {
		if(this.iSysAIUtilRuntime == null) {
			this.iSysAIUtilRuntime = this.getSystemRuntime().getSysUtilRuntime(ISysAIUtilRuntime.class, false);
		}
		return this.iSysAIUtilRuntime;
	}
	
	protected String getAgent() {
		return DataTypeUtils.asString(aiImageParams.get("agent"), "qwenvl");
	}
	
	protected int getMinWidth() {
		return DataTypeUtils.asInteger(aiImageParams.get("minwidth"), 20);
	}
	
	protected int getMinHeight() {
		return DataTypeUtils.asInteger(aiImageParams.get("minheight"), 20);
	}
	
	protected String getPrompt() {
		//return DataTypeUtils.asString(aiImageParams.get("prompt"), "图中描绘的是什么景象?");
		return DataTypeUtils.asString(aiImageParams.get("prompt"), getDefaultPrompt());
	}
	
	protected String getDefaultPrompt() {
		return "对`图片`生成一段简洁、客观的描述性文字，说明其内容、主题和功能。";
	}
	
	protected String getOcrAgent() {
		return DataTypeUtils.asString(aiImageParams.get("ocragent"), getAgent());
	}
	
	
	
	protected String getOcrPrompt() {
		return DataTypeUtils.asString(aiImageParams.get("ocrprompt"), getDefaultOcrPrompt());
	}
	
	protected String getDefaultOcrPrompt() {
		return "识别图像中的所有内容，并将其分为“文本”和“图片”两类。\r\n" + 
				"- 对于“文本”部分，**严格按原始格式、排版和内容进行逐字输出**，不做任何概括、总结或修改。\r\n" + 
				"- 对于“图片”部分（包括图表、图形、照片、印章、签名等），**生成一段简洁、客观的描述性文字**，说明其内容、主题和功能。";
	}
	
	
	
	@Override
	protected Object doGetText(String cat, String fileId, File file, String type, Map<String, Object> params, File textFile) throws Throwable {
		
		if (type.equals(TYPE_PAGEINDEX)) {
			//判断当前文件是否未PDF
			String strReplaceContent = StringUtils.hasLength(cat) ? String.format("/__APP__/ibizutil/download/%1$s/%2$s", cat, fileId) : String.format("/__APP__/ibizutil/download/%1$s", fileId);
			ObjectNode pageIndexNode = JsonUtils.createObjectNode();
			ArrayNode pagesNode = pageIndexNode.putArray("pages");
			
			int nIndex = 0;
			
			ObjectNode pageNode = pagesNode.addObject();
			pageNode.put("index", nIndex);
			//pageNode.put("description", altText);
			pageNode.put("image_url", strReplaceContent);
			return pageIndexNode.toPrettyString();
		}
		
		if (type.equals(TYPE_MD)
				|| type.equals(TYPE_HTML)
				|| type.equals(TYPE_PLAIN)) {
			
			//根据文件后缀
			String strName = file.getName();
			int nPos = strName.lastIndexOf(".");
			if(nPos == -1) {
				throw new Exception("无法获取文件后缀");
			}
			String strExt = strName.substring(nPos);
			strExt = strExt.toLowerCase();
			
			int nMinWidth = this.getMinWidth();
			int nMinHeight = this.getMinHeight();
			try {
				BufferedImage image = ImageIO.read(file);
				if(image.getWidth() < nMinWidth) {
					return "";
				}
				if(image.getHeight() < nMinHeight) {
					return "";
				}
				
				if(image.getWidth() / image.getHeight() >= 200) {
					return "";
				}
			}
			catch (Throwable ex) {
				log.error(String.format("获取图片信息发生异常，%1$s", ex.getMessage()), ex);
			}
			
			String strContent = null;
			if(".gif".equals(strExt)) {
				//对gif进行转化
				BufferedImage image = ImageIO.read(file);
	            // 写入为PNG文件
				ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
	            ImageIO.write(image, "png", byteArrayOutputStream);
	            strContent = Base64.getEncoder().encodeToString(byteArrayOutputStream.toByteArray());
	            byteArrayOutputStream.close();
	            strExt = ".png";
			}
			else {
				strContent = Base64.getEncoder().encodeToString(FileUtils.readFileToByteArray(file));
			}
			
			String strBase64Content = null;
			if(".png".equals(strExt)) {
				strBase64Content = String.format("data:image/png;base64,%1$s", strContent);
			}
			else
				if(".bmp".equals(strExt)) {
					strBase64Content = String.format("data:image/bmp;base64,%1$s", strContent);
				}
				else
					if(".jpe".equals(strExt)||".jpeg".equals(strExt)||".jpg".equals(strExt)) {
						strBase64Content = String.format("data:image/jpeg;base64,%1$s", strContent);
					}
					else
						if(".tif".equals(strExt)||".tiff".equals(strExt)) {
							strBase64Content = String.format("data:image/tiff;base64,%1$s", strContent);
						}
						else
							if(".webp".equals(strExt)) {
								strBase64Content = String.format("data:image/webp;base64,%1$s", strContent);
							}
							else
								if(".heic".equals(strExt)) {
									strBase64Content = String.format("data:image/heic;base64,%1$s", strContent);
								}
								else
									throw new Exception(String.format("不支持的文件后缀[%1$s]", strExt));
			
			ChatCompletionRequest chatCompletionRequest = new ChatCompletionRequest();
			
			ChatMessage chatMessage = new ChatMessage();
			chatMessage.setRole(ChatMessageRole.USER.getValue());
			ChatContent chatContent = new ChatContent();
			chatContent.setType(ChatContentType.IMAGE_URL.getValue());
			chatContent.setUrl(strBase64Content);
			chatMessage.getChatContentsIf().add(chatContent);
			
			String strNewFileName = strName.substring(0, strName.length() - strExt.length());
			//再次获取结尾，如果为PDF，做扫描件处理
			String strNewExt = FilenameUtils.getExtension(strNewFileName);
			if("pdf".equalsIgnoreCase(strNewExt) && isEnableOcrAgent()) {
				if(ObjectUtils.isEmpty(this.getOcrAgent())) {
					return this.getContext().getOSSTextProvider(AGENT_ENGINE_OCR, false).getText(cat, fileId, file, type, params);
				}
				
				if(this.getOcrAgent().indexOf(AGENT_ENGINE_PREFIX) == 0) {
					return this.getContext().getOSSTextProvider(this.getOcrAgent(), false).getText(cat, fileId, file, type, params);
				}
				
				ChatContent chatContent2 = new ChatContent();
				chatContent2.setType(ChatContentType.TEXT.getValue());
				String strPrompt = getOcrPrompt();
				if(params!=null) {
					strPrompt = DataTypeUtils.asString(params.get(PARAM_PROMPT), strPrompt);
				}
				chatContent2.setText(strPrompt);
				chatMessage.getChatContentsIf().add(chatContent2);
				
				chatCompletionRequest.getMessagesIf().add(chatMessage);
				return this.getSysAIUtilRuntime().chatCompletion(this.getOcrAgent(), chatCompletionRequest).getChoices().get(0).getContent();	
			}
			else {
				if(ObjectUtils.isEmpty(this.getAgent())) {
					return this.getContext().getOSSTextProvider(AGENT_ENGINE_OCR, false).getText(cat, fileId, file, type, params);
				}
				
				if(this.getAgent().indexOf(AGENT_ENGINE_PREFIX) == 0) {
					return this.getContext().getOSSTextProvider(this.getAgent(), false).getText(cat, fileId, file, type, params);
				}
				
				ChatContent chatContent2 = new ChatContent();
				chatContent2.setType(ChatContentType.TEXT.getValue());
				String strPrompt = getPrompt();
				if(params!=null) {
					strPrompt = DataTypeUtils.asString(params.get(PARAM_PROMPT), strPrompt);
				}
				chatContent2.setText(strPrompt);
				chatMessage.getChatContentsIf().add(chatContent2);
				
				chatCompletionRequest.getMessagesIf().add(chatMessage);
				return this.getSysAIUtilRuntime().chatCompletion(this.getAgent(), chatCompletionRequest).getChoices().get(0).getContent();		
			}
		}
		
		return super.doGetText(cat, fileId, file, type, params, textFile);
		
		
	}
	
	protected boolean isEnableOcrAgent() {
		return true;
	}
}
