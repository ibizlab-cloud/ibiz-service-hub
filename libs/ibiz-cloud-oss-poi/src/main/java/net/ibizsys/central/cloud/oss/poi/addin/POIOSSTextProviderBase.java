package net.ibizsys.central.cloud.oss.poi.addin;

import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.geom.Dimension2D;
import java.awt.geom.Rectangle2D;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import java.util.Map;

import javax.imageio.ImageIO;

import org.apache.commons.io.FileUtils;
import org.apache.commons.io.FilenameUtils;
import org.apache.commons.logging.LogFactory;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.rendering.PDFRenderer;
import org.apache.pdfbox.text.PDFTextStripper;
import org.apache.poi.hemf.usermodel.HemfPicture;
import org.apache.poi.util.Units;
import org.springframework.util.StringUtils;

import net.ibizsys.central.cloud.oss.core.addin.LibreOfficeOSSTextProviderBase;
import net.ibizsys.central.cloud.oss.core.cloudutil.ISimpleFileStorageService;
import net.ibizsys.central.cloud.oss.core.cloudutil.SimpleCloudOSSUtilRuntime;
import net.ibizsys.central.cloud.oss.core.util.domain.FileItem;
import net.ibizsys.runtime.util.HtmlUtils;
import net.ibizsys.runtime.util.MarkdownUtils;

public abstract class POIOSSTextProviderBase extends LibreOfficeOSSTextProviderBase{

	private static final org.apache.commons.logging.Log log = LogFactory.getLog(POIOSSTextProviderBase.class);

	@Override
	protected Object doGetText(String cat, String fileId, File file, String type, Map<String, Object> params, File textFile) throws Throwable {
		
		if (type.equals(TYPE_PAGEINDEX)) {
			//判断当前文件是否未PDF
			File pdfFile = null;
			File pdfDir = null;
			String strExt = FilenameUtils.getExtension(file.getName());
			if("pdf".equalsIgnoreCase(strExt)) {
				pdfFile = file;
			}
			else {
				pdfDir = new File(file.getParentFile().getAbsolutePath() + File.separator + ".pdf");
				if (!pdfDir.exists()) {
					pdfDir.mkdirs();
				}
				
				File[] files = pdfDir.listFiles();
				if(files != null && files.length > 0) {
					for(File item : files) {
						strExt = FilenameUtils.getExtension(item.getName());
						if("pdf".equalsIgnoreCase(strExt)) {
							pdfFile = item;
							break;
						}
					}
				}
			}
			
			int nIndex = 0;
			while(pdfFile == null) {
				File command = new File(getLibreOfficeCommandPath());
				//String strCommand = String.format("%1$s --headless --invisible --convert-to pdf --outdir \"%2$s\" \"%3$s\"", command.getCanonicalPath(), pdfDir.getCanonicalPath(), file.getCanonicalPath());
				String[] commandArray = {
						command.getCanonicalPath(),
						"--headless",
						"--invisible",
						"--convert-to", "pdf",
						"--outdir", pdfDir.getCanonicalPath(),
						file.getCanonicalPath()  // 自动处理空格
				};
				ExecuteResult result = executeCommandArray(commandArray, null, COMMAND_TIMEOUT);
				File[] files = pdfDir.listFiles();
				if(files != null && files.length > 0) {
					for(File item : files) {
						strExt = FilenameUtils.getExtension(item.getName());
						if("pdf".equalsIgnoreCase(strExt)) {
							pdfFile = item;
							break;
						}
					}
				}
				
				if(pdfFile == null) {
					log.error(String.format("生成PDF文件发生异常，exit_code[%1$s]\r\ninfo: %2$s\r\nerror: %3$s", result.exitValue, result.standardOutput, result.errorOutput));
					nIndex ++;
					if(nIndex == 5) {
						throw new Exception("生成PDF文件发生异常，请稍后重试");
					}
					Thread.sleep(200);
				}
				else {
					break;
				}
			}
//			
			String strMarkdown = getPdfText(cat, pdfFile, type, null, textFile, true);
			return this.getPageIndexContent(strMarkdown);
		}
		
		if (type.equals(TYPE_MD)) {
			// 先转为为HTML
			String strHtml = this.getText(cat, fileId, file, TYPE_HTML, params);
			// 进行转化
			return HtmlUtils.toMarkdown(strHtml);
		}

		if (type.equals(TYPE_HTML)) {
			// 1. 创建图片保存目录
			File imageDir = new File(textFile.getAbsolutePath() + ".images");
			if (!imageDir.exists()) {
				imageDir.mkdirs();
			}

			// 判断是否有LibreOffice指令
			if (StringUtils.hasLength(this.getLibreOfficeCommandPath())) {
				File command = new File(getLibreOfficeCommandPath());
				// File workingDirectory = command.getParentFile();

				//String strCommand = String.format("%1$s --headless --invisible --convert-to html --outdir \"%2$s\" \"%3$s\"", command.getCanonicalPath(), imageDir.getCanonicalPath(), file.getCanonicalPath());

				for(int i = 0;i<2;i++) {
					try {
						String[] commandArray = {
								command.getCanonicalPath(),
								"--headless",
								"--invisible",
								"--convert-to", "html",
								"--outdir", imageDir.getCanonicalPath(),
								file.getCanonicalPath()  // 自动处理空格
						};
	
						ExecuteResult result = executeCommandArray(commandArray, null, COMMAND_TIMEOUT);

						// 从图片目录中获取
						String strSrcFileName = imageDir.getCanonicalPath() + File.separator + FilenameUtils.removeExtension(file.getName()) + ".html";
						FileUtils.moveFile(new File(strSrcFileName), textFile);
	
						String strHtml = FileUtils.readFileToString(textFile, "utf-8");
	
						// 循环Images目录
						if (imageDir.exists()) {
							File[] imageFileList = imageDir.listFiles();
							if (imageFileList != null) {
								for (File imageFile : imageFileList) {
									if (imageFile.isDirectory()) {
										continue;
									}
									String strOriginPath = imageFile.getName();
									FileItem fileItem = null;
									
									String strImageCat = cat;
									if(StringUtils.hasLength(strImageCat) && strImageCat.indexOf("$")==-1) {
										strImageCat = cat + "$";
									}
									
									// 判断后缀，emf 需要转为为 png 图片
									String strExt = SimpleCloudOSSUtilRuntime.getFileExt(imageFile.getName());
									if ("emf".equalsIgnoreCase(strExt)) {
										File pngFile = File.createTempFile("cloudoss_", ".png");
										convertEmfToPng(imageFile, pngFile);
										fileItem = ((ISimpleFileStorageService) this.getCloudOSSUtilRuntime()).uploadFile(strImageCat, pngFile);
									} else {
										fileItem = ((ISimpleFileStorageService) this.getCloudOSSUtilRuntime()).uploadFile(strImageCat, imageFile);
									}
									
									
									String strReplaceContent = StringUtils.hasLength(strImageCat) ? String.format("/__APP__/ibizutil/download/%1$s/%2$s", strImageCat, fileItem.getFileId()) : String.format("/__APP__/ibizutil/download/%1$s", fileItem.getFileId());
									String encodedFileName = URLEncoder.encode(strOriginPath, StandardCharsets.UTF_8.toString());
									encodedFileName = encodedFileName.replace("+", "%20");
									strHtml = strHtml.replace("\"" + encodedFileName + "\"", "\"" + strReplaceContent + "\"");
								}
								// 写回
								// FileUtils.write(textFile, strHtml, "utf-8");
							}
						}
						return strHtml;
					}
					catch(Throwable ex) {
						if( i == 0) {
							//改造文件名称
							String strNewFile = String.format("%1$s%2$s_a.%3$s", textFile.getParentFile().getAbsolutePath(), File.separator,  FilenameUtils.getExtension(file.getName()));
							FileUtils.copyFile(file, new File(strNewFile));
							file = new File(strNewFile);
							
							imageDir = new File(file.getAbsolutePath() + ".images");
							if (!imageDir.exists()) {
								imageDir.mkdirs();
							}
						}
						else
							throw ex;
					}
				}
				
			}

			// 判断是否有pandoc指令
			if (StringUtils.hasLength(this.getPandocCommandPath())) {
				File command = new File(getPandocCommandPath());
				File workingDirectory = command.getParentFile();

				//String strCommand = String.format("%1$s %2$s -o %3$s --extract-media %4$s", command.getName(), file.getCanonicalPath(), textFile.getCanonicalPath(), imageDir.getCanonicalPath());

				String[] commandArray = {
						command.getName(),
						file.getCanonicalPath(),
						"-o", textFile.getCanonicalPath(),
						"--extract-media", imageDir.getCanonicalPath()
				};

				ExecuteResult result = executeCommandArray(commandArray, workingDirectory, COMMAND_TIMEOUT);
				String strHtml = FileUtils.readFileToString(textFile, "utf-8");

				// 循环Images目录
				File mediaDir = new File(imageDir.getCanonicalPath() + "/media");
				if (mediaDir.exists()) {
					File[] imageFileList = mediaDir.listFiles();
					if (imageFileList != null) {
						for (File imageFile : imageFileList) {
							if (imageFile.isDirectory()) {
								continue;
							}
							String strOriginPath = imageDir.getCanonicalPath() + "/media/" + imageFile.getName();
							FileItem fileItem = null;
							
							String strImageCat = cat;
							if(StringUtils.hasLength(strImageCat) && strImageCat.indexOf("$")==-1) {
								strImageCat = cat + "$";
							}
							
							// 判断后缀，emf 需要转为为 png 图片
							String strExt = SimpleCloudOSSUtilRuntime.getFileExt(imageFile.getName());
							if ("emf".equalsIgnoreCase(strExt)) {
								File pngFile = File.createTempFile("cloudoss_", ".png");
								convertEmfToPng(imageFile, pngFile);
								fileItem = ((ISimpleFileStorageService) this.getCloudOSSUtilRuntime()).uploadFile(strImageCat, pngFile);
							} else {
								fileItem = ((ISimpleFileStorageService) this.getCloudOSSUtilRuntime()).uploadFile(strImageCat, imageFile);
							}
							
							String strReplaceContent = StringUtils.hasLength(strImageCat) ? String.format("/__APP__/ibizutil/download/%1$s/%2$s", strImageCat, fileItem.getFileId()) : String.format("/__APP__/ibizutil/download/%1$s", fileItem.getFileId());
							strHtml = strHtml.replace(strOriginPath, strReplaceContent);
						}
						// 写回
						// FileUtils.write(textFile, strHtml, "utf-8");
					}
				}
				return strHtml;
			}
		}

		return super.doGetText(cat, fileId, file, type, params, textFile);
	}

	@Override
	public boolean isEnabled() {
		return true;
	}

	protected boolean isSuperEnabled() {
		return super.isEnabled();
	}

	

	public static void convertEmfToPng(File emfFile, File pngFile) throws IOException {
		try (FileInputStream fis = new FileInputStream(emfFile)) {

			// 1. 加载 EMF 图片
			HemfPicture emf = new HemfPicture(fis);

			// 2. 获取 EMF 图片的原始尺寸（单位为点）
			Dimension2D dim = emf.getSize();
			int width = Units.pointsToPixel(dim.getWidth()) * 2;
			int height = Units.pointsToPixel(dim.getHeight()) * 2;

			// 3. (可选) 限制图片最大尺寸，避免过大
			double max = Math.max(width, height);
			if (max > 3000) {
				double scaleFactor = 3000 / max;
				width = (int) (width * scaleFactor);
				height = (int) (height * scaleFactor);
			}

			// 4. 创建目标 PNG 图像缓冲区
			BufferedImage bufImg = new BufferedImage(width, height, BufferedImage.TYPE_INT_ARGB);
			Graphics2D g = bufImg.createGraphics();

			// 5. 设置高质量的渲染参数
			g.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
			g.setRenderingHint(RenderingHints.KEY_RENDERING, RenderingHints.VALUE_RENDER_QUALITY);
			g.setRenderingHint(RenderingHints.KEY_INTERPOLATION, RenderingHints.VALUE_INTERPOLATION_BICUBIC);
			g.setRenderingHint(RenderingHints.KEY_FRACTIONALMETRICS, RenderingHints.VALUE_FRACTIONALMETRICS_ON);

			// 6. 将 EMF 内容绘制到缓冲区
			emf.draw(g, new Rectangle2D.Double(0, 0, width, height));
			g.dispose();

			// 7. 将缓冲区内容写入 PNG 文件
			ImageIO.write(bufImg, "PNG", pngFile);

		}
	}
	
	public static void convertEmfToJpg(File emfFile, File pngFile) throws IOException {
		try (FileInputStream fis = new FileInputStream(emfFile)) {

			// 1. 加载 EMF 图片
			HemfPicture emf = new HemfPicture(fis);

			// 2. 获取 EMF 图片的原始尺寸（单位为点）
			Dimension2D dim = emf.getSize();
			int width = Units.pointsToPixel(dim.getWidth()) * 2;
			int height = Units.pointsToPixel(dim.getHeight()) * 2;

			// 3. (可选) 限制图片最大尺寸，避免过大
			double max = Math.max(width, height);
			if (max > 3000) {
				double scaleFactor = 3000 / max;
				width = (int) (width * scaleFactor);
				height = (int) (height * scaleFactor);
			}

			// 4. 创建目标 PNG 图像缓冲区
			BufferedImage bufImg = new BufferedImage(width, height, BufferedImage.TYPE_INT_ARGB);
			Graphics2D g = bufImg.createGraphics();

			// 5. 设置高质量的渲染参数
			g.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
			g.setRenderingHint(RenderingHints.KEY_RENDERING, RenderingHints.VALUE_RENDER_QUALITY);
			g.setRenderingHint(RenderingHints.KEY_INTERPOLATION, RenderingHints.VALUE_INTERPOLATION_BICUBIC);
			g.setRenderingHint(RenderingHints.KEY_FRACTIONALMETRICS, RenderingHints.VALUE_FRACTIONALMETRICS_ON);

			// 6. 将 EMF 内容绘制到缓冲区
			emf.draw(g, new Rectangle2D.Double(0, 0, width, height));
			g.dispose();

			// 7. 将缓冲区内容写入 JPEG 文件
			ImageIO.write(bufImg, "JPEG", pngFile);

		}
	}

	protected String getPdfText(String cat, File file, String type, Map<String, Object> params, File textFile, Boolean imageMode) throws Throwable {

		int dpi = 96;
		// 1. 创建图片保存目录
		File imageDir = new File(textFile.getAbsolutePath() + ".images");
		if (!imageDir.exists()) {
			imageDir.mkdirs();
		}

		if (imageMode == null) {
			// 需要提取PDF中的文字，判断是否为图片

		}

		StringBuilder sb = new StringBuilder();
		if (imageMode) {
			// 使用try-with-resources确保文档资源被正确关闭
			try (PDDocument document = PDDocument.load(file)) {
				PDFRenderer pdfRenderer = new PDFRenderer(document);

				for (int pageIndex = 0; pageIndex < document.getNumberOfPages(); pageIndex++) {
					// 将当前页渲染为带有指定DPI的图像
					BufferedImage image = pdfRenderer.renderImageWithDPI(pageIndex, dpi);
					// 生成输出文件路径
					String outputFilePath = String.format("%s/page_%03d.pdf.jpg", imageDir, pageIndex + 1);
					File outputFile = new File(outputFilePath);
					
					// 将图像写入文件
					ImageIO.write(image, "JPEG", outputFile);
					String strImageCat = cat;
					if(StringUtils.hasLength(strImageCat) && strImageCat.indexOf("$")==-1) {
						strImageCat = cat + "$";
					}
					
					FileItem fileItem = ((ISimpleFileStorageService) this.getCloudOSSUtilRuntime()).uploadFile(strImageCat, outputFile);
					
					String strReplaceContent = StringUtils.hasLength(strImageCat) ? String.format("/__APP__/ibizutil/download/%1$s/%2$s", strImageCat, fileItem.getFileId()) : String.format("/__APP__/ibizutil/download/%1$s", fileItem.getFileId());

					//sb.append("# 第 " + (pageIndex + 1) + " 页\r\n");
					sb.append(String.format("![第%2$s页](%1$s)", strReplaceContent, pageIndex + 1));
					sb.append("\r\n");
				}

			} catch (Throwable ex) {
				log.error(String.format("提取PDF文本内容发生异常，%1$s", ex.getMessage()), ex);
				throw new Exception(String.format("提取PDF文本内容发生异常，%1$s", ex.getMessage()), ex);
			}
		} else {
			try (PDDocument document = PDDocument.load(file)) {
				PDFTextStripper stripper = new PDFTextStripper();
				int totalPages = document.getNumberOfPages();
				// 遍历每一页
				for (int pageIndex = 1; pageIndex <= totalPages; pageIndex++) {
					// 设置起始和结束页为当前页，实现逐页提取
					stripper.setStartPage(pageIndex);
					stripper.setEndPage(pageIndex);
					// 提取当前页的文本
					String pageText = stripper.getText(document);
					//sb.append("# 第 " + pageIndex + " 页\r\n");
					sb.append(pageText);
					sb.append("\r\n");
				}
			} catch (Throwable ex) {
				log.error(String.format("提取PDF文本内容发生异常，%1$s", ex.getMessage()), ex);
				throw new Exception(String.format("提取PDF文本内容发生异常，%1$s", ex.getMessage()), ex);
			}
		}

		String strMarkdownContent = sb.toString();
		if (TYPE_HTML.equals(type)) {
			return MarkdownUtils.toHtml(strMarkdownContent);
		}

		return strMarkdownContent;
	}
	
	

}
