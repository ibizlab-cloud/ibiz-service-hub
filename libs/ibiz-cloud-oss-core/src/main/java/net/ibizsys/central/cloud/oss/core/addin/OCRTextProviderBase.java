package net.ibizsys.central.cloud.oss.core.addin;

import java.awt.image.BufferedImage;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.util.Base64;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import javax.imageio.ImageIO;

import org.apache.commons.io.FileUtils;
import org.apache.commons.logging.LogFactory;
import org.springframework.util.StringUtils;

import net.ibizsys.central.service.client.IWebClientRep;
import net.ibizsys.runtime.util.DataTypeUtils;

/**
 * OCR 文本提供者
 */
public abstract class OCRTextProviderBase extends OSSTextProviderBase {

    private static final org.apache.commons.logging.Log log = LogFactory.getLog(OCRTextProviderBase.class);

    private Map<String, Object> ocrParams = new ConcurrentHashMap<String, Object>();

    @Override
    protected void onInit() throws Exception {
        this.getContext().getSettings("ocr", this.ocrParams);
        setServiceUrl(DataTypeUtils.asString(this.ocrParams.get("serviceurl")));
        super.onInit();
    }

    @Override
    protected void onReloadSetting() throws Throwable {
        this.ocrParams.clear();
        this.getContext().getSettings("ocr", this.ocrParams);
        setServiceUrl(DataTypeUtils.asString(this.ocrParams.get("serviceurl")));
        super.onReloadSetting();
    }

    @Override
    protected String doGetText(String cat, String fileId, File file, String type, Map<String, Object> params, File textFile) throws Throwable {
        //根据文件后缀
        String strName = file.getName();
        int nPos = strName.lastIndexOf(".");
        if (nPos == -1) {
            throw new Exception("无法获取文件后缀");
        }
        String strExt = strName.substring(nPos);
        strExt = strExt.toLowerCase();
        String strBase64 = null;
        if (".gif".equals(strExt)) {
            //对gif进行转化
            BufferedImage image = ImageIO.read(file);
            // 写入为PNG文件
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            ImageIO.write(image, "png", byteArrayOutputStream);
            strBase64 = Base64.getEncoder().encodeToString(byteArrayOutputStream.toByteArray());
            byteArrayOutputStream.close();
            strExt = ".png";
        } else {
            strBase64 = Base64.getEncoder().encodeToString(FileUtils.readFileToByteArray(file));
        }

        Map request = new HashMap();
        request.put("id", fileId);
        request.put("name", strName);
        request.put("base64", strBase64);
        try {
        	IWebClientRep<Map> rep = this.getSystemRuntime().getDefaultWebClient().post(this.getServiceUrl(), null, null, null, request, null, Map.class, null);
        	if(DataTypeUtils.asInteger(rep.getBody().get("ret")) == 0) {
        		return DataTypeUtils.asString(rep.getBody().get("content"));
        	}
        	throw new Exception(String.format("返回值[%1$s]不正确，%2$s", rep.getBody().get("ret"), rep.getBody().get("info")));
        }
        catch (Throwable ex) {
			throw new Exception(String.format("执行OCR发生异常，%1$s", ex.getMessage()), ex);
		}
    }

    @Override
    public boolean isEnabled() {
        return StringUtils.hasLength(getServiceUrl());
    }
    
    @Override
    protected File getTextFolder(File file, String type) {
    	return super.getTextFolder(file, "engine." + type);
    }
}
