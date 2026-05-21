package net.ibizsys.central.cloud.oss.core.addin;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.util.ArrayList;
import java.util.Base64;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.io.FileUtils;
import org.apache.commons.io.FilenameUtils;
import org.apache.commons.lang3.ObjectUtils;
import org.apache.commons.logging.LogFactory;
import org.mozilla.universalchardet.UniversalDetector;
import org.springframework.util.StringUtils;

import com.fasterxml.jackson.databind.node.ArrayNode;
import com.fasterxml.jackson.databind.node.ObjectNode;
import com.vladsch.flexmark.ast.Image;
import com.vladsch.flexmark.parser.Parser;
import com.vladsch.flexmark.util.ast.Document;
import com.vladsch.flexmark.util.ast.NodeVisitor;
import com.vladsch.flexmark.util.ast.VisitHandler;

import net.ibizsys.central.cloud.oss.core.cloudutil.SimpleCloudOSSUtilRuntime;
import net.ibizsys.runtime.util.DataTypeUtils;
import net.ibizsys.runtime.util.JsonUtils;

public abstract class OSSTextProviderBase extends CloudOSSUtilRTAddinBase implements IOSSTextProvider {

	private static final org.apache.commons.logging.Log log = LogFactory.getLog(OSSTextProviderBase.class);
	
	private static final byte[] UTF8_BOM = new byte[]{(byte) 0xEF, (byte) 0xBB, (byte) 0xBF};
    // 增大缓冲区以提高效率，8192 是默认值，可以设大一点
    private static final int BUFFER_SIZE = 32768; 
    
	final static Map<String, String> FileExtTypeMap = new HashMap<String, String>();
	final static Map<String, String> Utf8BomTypeMap = new HashMap<String, String>();
	
	static {
		FileExtTypeMap.put("md", TYPE_MD);
		FileExtTypeMap.put("markdown", TYPE_MD);
		FileExtTypeMap.put("html", TYPE_HTML);
		FileExtTypeMap.put("htm", TYPE_HTML);
		FileExtTypeMap.put("txt", TYPE_PLAIN);
		FileExtTypeMap.put("text", TYPE_PLAIN);
		
		Utf8BomTypeMap.put("md", "");
		Utf8BomTypeMap.put("markdown", "");
		Utf8BomTypeMap.put("html", "");
		Utf8BomTypeMap.put("htm", "");
		Utf8BomTypeMap.put("txt", "");
		Utf8BomTypeMap.put("text", "");
		Utf8BomTypeMap.put("json", "");
		Utf8BomTypeMap.put("csv", "");
	}
	
	@Override
	public String getText(String cat, String fileId, File file, String type, Map<String, Object> params) throws Throwable{
		
		String strExt = FilenameUtils.getExtension(file.getName());
		if(StringUtils.hasLength(strExt) && Utf8BomTypeMap.containsKey(strExt.toLowerCase())) {
			File bomFile = null;
			if(!hasUtf8Bom(file)) {
				File folder = this.getTextFolder(file, "utf-bom");
				bomFile = new File(folder.getAbsolutePath() + File.separator + file.getName());
				if(!bomFile.exists()) {
					try {
						convertToUtf8WithBom(file.getCanonicalPath(), bomFile.getCanonicalPath());
					}
					catch (Throwable ex) {
						log.error(String.format("转化Utf8WithBom文档发生异常，%1$s", ex.getMessage()), ex);
					}
				}
				file = bomFile;
			}
		}
		
		String textType = !ObjectUtils.isEmpty(type)?type:TYPE_MD;
		String curTextType = this.getFileTextType(file);
		if(StringUtils.hasLength(curTextType)) {
			if(textType.equals(curTextType)) {
				return FileUtils.readFileToString(file, "utf-8");
			}
		}
		return this.onGetText(cat, fileId, file, textType, params);
	}
	
	protected String getFileTextType(File file) {
		String strCurExt = SimpleCloudOSSUtilRuntime.getFileExt(file.getName());
		return FileExtTypeMap.get(strCurExt.toLowerCase());
	}
	
	protected String onGetText(String cat, String fileId, File file, String type, Map<String, Object> params) throws Throwable {
		boolean rebuild = false;
		if(params != null) {
			rebuild = DataTypeUtils.asBoolean(params.get(PARAM_REBUILD), rebuild);
		}
		
		//判断文本文件是否已经存在
		File folder = this.getTextFolder(file,  type);
		File textFile = new File(folder.getAbsolutePath() + File.separator + file.getName() + "." + type);
		if(rebuild && textFile.exists()) {
			textFile.delete();
		}
		if(!textFile.exists()) {
			Object text = this.doGetText(cat, fileId, file, type, params, textFile);
			if(text instanceof String) {
				String strText = (String)text;
				FileUtils.writeStringToFile(textFile, strText, "utf-8");
				return strText;
			}
		}
		
		return FileUtils.readFileToString(textFile, "utf-8");
	}
	
	
	protected Object doGetText(String cat, String fileId, File file, String type, Map<String, Object> params, File textFile) throws Throwable {
		if (type.equals(TYPE_PAGEINDEX)) {
			String strMarkdown = this.getText(cat, fileId, file, TYPE_MD, params);
			return this.getPageIndexContent(strMarkdown);
		}
		
		if (type.indexOf(TYPE_BASE64_PREFIX) == 0) {
			return Base64.getEncoder().encodeToString(FileUtils.readFileToByteArray(file));
		}
		
		throw new Exception("没有实现");
	}
	
	protected String getPageIndexContent(String strMarkdown) throws Throwable {
		Parser parser = Parser.builder().build();
		Document document = parser.parse(strMarkdown);

		// 第一阶段：收集所有图片节点
		List<Image> imagesToReplace = new ArrayList<>();
		NodeVisitor collector = new NodeVisitor(new VisitHandler<>(Image.class, imagesToReplace::add));
		collector.visit(document);
		
		ObjectNode pageIndexNode = JsonUtils.createObjectNode();
		ArrayNode pagesNode = pageIndexNode.putArray("pages");
		
		int nIndex = 0;
		
		for (Image image : imagesToReplace) {
			String altText = image.getText().toString();
			String imageUrl = image.getUrl().toString();
			
			ObjectNode pageNode = pagesNode.addObject();
			pageNode.put("index", nIndex);
			pageNode.put("description", altText);
			pageNode.put("image_url", imageUrl);
			nIndex ++;
		}
		
		return pageIndexNode.toPrettyString();
	}
	
	protected File getTextFolder(File file, String type) {
		File folder = new File(file.getParentFile().getAbsolutePath() + File.separator + "." + type); 
		if(!folder.exists()) {
			folder.mkdirs();
		}
		return folder;
	}
	
	 public static void convertToUtf8WithBom(String sourcePath, String destPath) throws IOException {
		 convertToUtf8WithBom(sourcePath, destPath, null);
	 }
	

    public static void convertToUtf8WithBom(String sourcePath, String destPath, Charset sourceCharset) throws IOException {
        File sourceFile = new File(sourcePath);

        // 1. 检查是否已有 BOM (二进制检查，最快)
        if (hasUtf8Bom(sourceFile)) {
           Files.copy(sourceFile.toPath(), Paths.get(destPath), StandardCopyOption.REPLACE_EXISTING);
            return;
        }
        
        if(sourceCharset == null) {
        	sourceCharset =	detectFileEncoding(sourcePath);
        }

        // 2. 使用字符流进行转码 (支持大文件，不依赖换行符)
        try (InputStreamReader reader = new InputStreamReader(new FileInputStream(sourceFile), sourceCharset);
             FileOutputStream fos = new FileOutputStream(destPath)) {

            // 2.1 先写入 BOM (二进制写入)
            fos.write(UTF8_BOM);

            // 2.2 包装为 UTF-8 Writer
            try (OutputStreamWriter writer = new OutputStreamWriter(fos, StandardCharsets.UTF_8)) {
                char[] buffer = new char[BUFFER_SIZE];
                int charsRead;
                
                // 2.3 按块读取字符，再按块写入
                // 这种方式不关心换行符，原样保留 \r, \n, 或 \r\n
                while ((charsRead = reader.read(buffer)) != -1) {
                    writer.write(buffer, 0, charsRead);
                }
            }
        }
    }

    /**
     * 步骤 1: 使用 juniversalchardet 检测文件编码
     */
    public static Charset detectFileEncoding(String filePath) throws IOException {
        UniversalDetector detector = new UniversalDetector(null);
        byte[] buf = new byte[4096];
        int nRead;

        try (InputStream is = new FileInputStream(filePath)) {
            // 读取文件部分内容进行检测
            while ((nRead = is.read(buf)) > 0 && !detector.isDone()) {
                detector.handleData(buf, 0, nRead);
            }
        }

        detector.dataEnd();
        String charsetName = detector.getDetectedCharset();

        if (charsetName != null) {
            return Charset.forName(charsetName);
        } else {
            // 如果检测失败，默认返回 UTF-8，或者根据你的业务场景默认返回 GBK
        	log.warn(String.format("文件[%1$s]未能自动检测编码，默认使用 UTF-8 尝试读取。", filePath));
            return StandardCharsets.UTF_8;
        }
    }
    
    public static boolean hasUtf8Bom(File file) throws IOException {
        if (file.length() < 3) {
            return false;
        }
        try (InputStream is = new FileInputStream(file)) {
            byte[] bomCheck = new byte[3];
            if (is.read(bomCheck) == 3) {
                return (bomCheck[0] == UTF8_BOM[0]) && 
                       (bomCheck[1] == UTF8_BOM[1]) && 
                       (bomCheck[2] == UTF8_BOM[2]);
            }
            return false;
        }
    }

}
