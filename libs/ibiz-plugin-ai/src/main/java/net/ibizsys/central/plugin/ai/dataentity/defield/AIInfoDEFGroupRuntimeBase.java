package net.ibizsys.central.plugin.ai.dataentity.defield;

import java.util.ArrayList;
import java.util.List;

import org.springframework.util.ObjectUtils;
import org.springframework.util.StringUtils;

import com.vladsch.flexmark.ast.Image;
import com.vladsch.flexmark.ast.Text;
import com.vladsch.flexmark.formatter.Formatter;
import com.vladsch.flexmark.html2md.converter.FlexmarkHtmlConverter;
import com.vladsch.flexmark.parser.Parser;
import com.vladsch.flexmark.util.ast.Document;
import com.vladsch.flexmark.util.ast.NodeVisitor;
import com.vladsch.flexmark.util.ast.VisitHandler;
import com.vladsch.flexmark.util.data.MutableDataSet;

import net.ibizsys.central.cloud.core.cloudutil.ICloudUtilRuntime;
import net.ibizsys.central.cloud.core.cloudutil.client.ICloudOSSClient;
import net.ibizsys.central.cloud.core.sysutil.ISysCloudClientUtilRuntime;
import net.ibizsys.central.util.IEntityDTO;
import net.ibizsys.model.dataentity.defield.IPSDEFGroupDetail;

public abstract class AIInfoDEFGroupRuntimeBase extends net.ibizsys.central.cloud.core.dataentity.defield.AIInfoDEFGroupRuntimeBase {

	private static final org.apache.commons.logging.Log log = org.apache.commons.logging.LogFactory.getLog(AIInfoDEFGroupRuntimeBase.class);

	public final static String DETAILPARAM_COMPLEX = "COMPLEX"; // 需要参数2指定内容类型
	public final static String DETAILPARAM_COMPLEX_RAW = "COMPLEX_RAW"; //不转化IMAGE、 需要参数2指定内容类型
	public final static String DETAILPARAM_HTML = "HTML";
	public final static String DETAILPARAM_HTML_RAW = "HTMLRAW"; //转化MD，不转化IMAGE
	public final static String DETAILPARAM_MD = "MD";

	public static final String APPDOWNLOADURL = "/ibizutil/download/";

	private ISysCloudClientUtilRuntime iSysCloudClientUtilRuntime = null;

	@Override
	protected String getFieldValue(IPSDEFGroupDetail iPSDEFGroupDetail, IEntityDTO iEntityDTO, Object[] args) {

		String strDetailParam = iPSDEFGroupDetail.getDetailParam();
		if (StringUtils.hasLength(strDetailParam)) {
			if (strDetailParam.equalsIgnoreCase(DETAILPARAM_COMPLEX)) {
				String strTypeField = iPSDEFGroupDetail.getDetailParam2();
				if (!StringUtils.hasLength(strTypeField)) {
					log.warn(String.format("没有为[%1$s]指定类型属性", iPSDEFGroupDetail.getPSDEFieldMust().getName()));
					strDetailParam = null;
				} else {
					strDetailParam = iEntityDTO.getString(strTypeField, null);
				}
			}
			else
				if (strDetailParam.equalsIgnoreCase(DETAILPARAM_COMPLEX_RAW)) {
					String strTypeField = iPSDEFGroupDetail.getDetailParam2();
					if (!StringUtils.hasLength(strTypeField)) {
						log.warn(String.format("没有为[%1$s]指定类型属性", iPSDEFGroupDetail.getPSDEFieldMust().getName()));
						strDetailParam = null;
					} else {
						strDetailParam = iEntityDTO.getString(strTypeField, null);
						if(StringUtils.hasLength(strDetailParam)) {
							strDetailParam = strDetailParam + "_RAW";
						}
					}
				}
			
			if (StringUtils.hasLength(strDetailParam)) {
				if (strDetailParam.equalsIgnoreCase(DETAILPARAM_MD)) {
					return this.getFieldMDValue(iPSDEFGroupDetail, iEntityDTO, args);
				}
				if (strDetailParam.equalsIgnoreCase(DETAILPARAM_HTML)) {
					return this.getFieldHtmlValue(iPSDEFGroupDetail, iEntityDTO, true, args);
				}
				if (strDetailParam.equalsIgnoreCase(DETAILPARAM_HTML_RAW)) {
					return this.getFieldHtmlValue(iPSDEFGroupDetail, iEntityDTO, false, args);
				}
			}
		}
		return super.getFieldValue(iPSDEFGroupDetail, iEntityDTO, args);
	}

	protected String getFieldMDValue(IPSDEFGroupDetail iPSDEFGroupDetail, IEntityDTO iEntityDTO, Object[] args) {
		Object value = iEntityDTO.get(iPSDEFGroupDetail.getPSDEFieldMust().getLowerCaseName());
		if (ObjectUtils.isEmpty(value)) {
			return null;
		}

		String text = String.valueOf(value);
		return replaceImagesWithText(text);
	}

	protected String getFieldHtmlValue(IPSDEFGroupDetail iPSDEFGroupDetail, IEntityDTO iEntityDTO, boolean bReplaceImage, Object[] args) {
		Object value = iEntityDTO.get(iPSDEFGroupDetail.getPSDEFieldMust().getLowerCaseName());
		if (ObjectUtils.isEmpty(value)) {
			return null;
		}

		String text = String.valueOf(value);
		FlexmarkHtmlConverter converter = FlexmarkHtmlConverter.builder().build();
		// 执行转换
		String markdown = converter.convert(text);
		if(bReplaceImage)
			return replaceImagesWithText(markdown);
		else
			return markdown;
	}

	protected String replaceImagesWithText(String markdownContent) {
		Parser parser = Parser.builder().build();
		Document document = parser.parse(markdownContent);

		// 第一阶段：收集所有图片节点
		List<Image> imagesToReplace = new ArrayList<>();
		NodeVisitor collector = new NodeVisitor(new VisitHandler<>(Image.class, imagesToReplace::add));
		collector.visit(document);

		// 第二阶段：逆向遍历并替换，避免位置索引问题
		for (int i = imagesToReplace.size() - 1; i >= 0; i--) {
			Image image = imagesToReplace.get(i);
			replaceSingleImage(image);
		}

		return renderMarkdown(document);
	}

	protected void replaceSingleImage(Image image) {
		String altText = image.getText().toString();
		String imageUrl = image.getUrl().toString();

		int nPos = imageUrl.indexOf(APPDOWNLOADURL);
		if (nPos == -1) {
			return;
		}

		imageUrl = imageUrl.substring(nPos + APPDOWNLOADURL.length());
		String[] items = imageUrl.split("[/]");

		String strImageText = "";
		ICloudOSSClient iCloudOSSClient = this.getSysCloudClientUtilRuntime().getServiceClient(ICloudUtilRuntime.CLOUDCONFIGID_OSS, ICloudOSSClient.class, true);
		if (items.length == 2) {
			strImageText = iCloudOSSClient.downloadText(items[0], items[1]);
		} else {
			strImageText = iCloudOSSClient.downloadText(items[0]);
		}
		// 生成描述文本
		String description = String.format("```markdown\n下面为多模态图片识别内容：\n%s\n```",
				// altText.isEmpty() ? "无描述" : altText,
				strImageText);

		// 创建文本节点
		Text textNode = new Text(description);

		// 在图片节点前插入文本节点
		image.insertBefore(textNode);
		// 从AST中移除图片节点
		image.unlink();
	}

	protected String renderMarkdown(Document document) {
		// 这里需要将修改后的AST渲染回Markdown字符串
		// 注意：flexmark-core 主要功能是解析，标准库可能不包含Markdown渲染器
		// 您可能需要使用 flexmark-formatter 或其他扩展来渲染
		// 此处返回原始字符串仅作示例，实际需根据使用的渲染器调整

		MutableDataSet options = new MutableDataSet();

		// uncomment to set optional extensions
		// options.set(Parser.EXTENSIONS,
		// Arrays.asList(TablesExtension.create(),
		// StrikethroughExtension.create()));

		// uncomment to convert soft-breaks to hard breaks
		// options.set(HtmlRenderer.SOFT_BREAK, "<br />\n");

		Formatter renderer = Formatter.builder(options).build();

		return renderer.render(document);
		// return document.getChars().toString();
	}

	public ISysCloudClientUtilRuntime getSysCloudClientUtilRuntime() {
		if (this.iSysCloudClientUtilRuntime == null) {
			this.iSysCloudClientUtilRuntime = this.getSystemRuntime().getSysUtilRuntime(ISysCloudClientUtilRuntime.class, false);
		}
		return this.iSysCloudClientUtilRuntime;
	}
}
