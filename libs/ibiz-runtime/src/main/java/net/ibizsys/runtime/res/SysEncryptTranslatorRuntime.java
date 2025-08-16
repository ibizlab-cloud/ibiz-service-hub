package net.ibizsys.runtime.res;

import java.io.UnsupportedEncodingException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.Base64;

import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.SecretKeySpec;

import org.springframework.util.ObjectUtils;

import net.ibizsys.model.dataentity.defield.IPSDEField;
import net.ibizsys.runtime.dataentity.IDataEntityRuntime;
import net.ibizsys.runtime.util.IEntityBase;

/**
 * 数据加密转换器运行时对象
 * 
 * @author lionlau
 *
 */
public class SysEncryptTranslatorRuntime extends SysTranslatorRuntimeBase {

	private static final org.apache.commons.logging.Log log = org.apache.commons.logging.LogFactory.getLog(SysEncryptTranslatorRuntime.class);

	final Base64.Decoder decoder = Base64.getDecoder();
	final Base64.Encoder encoder = Base64.getEncoder();

	private static final String ENCRYPTTYPE = "AES";// 加密方式

	private static final String ENCODING = "UTF-8";// 加密时编码
	
	private String strEncryptKey  = "__ibiz__encrpty__";// 加密密钥
	
	private static SysEncryptTranslatorRuntime instance = new SysEncryptTranslatorRuntime();

	
	private static Cipher encryptCipher;

	private static Cipher decryptChipher;

	public SysEncryptTranslatorRuntime() {

		if (encryptCipher == null) {
			try {
				encryptCipher = Cipher.getInstance(ENCRYPTTYPE);
				decryptChipher = Cipher.getInstance(ENCRYPTTYPE);
				encryptCipher.init(Cipher.ENCRYPT_MODE, generateAESKey(getEncryptKey(), ENCODING));
				decryptChipher.init(Cipher.DECRYPT_MODE, generateAESKey(getEncryptKey(), ENCODING));
			} catch (NoSuchAlgorithmException | NoSuchPaddingException e) {
				log.error(e);
				encryptCipher = null;
				throw new RuntimeException(e);
			} catch (InvalidKeyException e) {
				encryptCipher = null;
				log.error(e);
				throw new RuntimeException(e);
			}
		}
	}
	
	protected String getEncryptKey() {
		return this.strEncryptKey;
	}

	/**
	 * 
	 * 加密算法
	 * 
	 * @param encryptString
	 * 
	 * @return
	 * 
	 */

	public String aesEncrypt(String encryptString) {

		try {
			return new String(encoder.encode(encryptCipher.doFinal(encryptString.getBytes(ENCODING))), ENCODING);

		} catch (BadPaddingException e) {
			throw new RuntimeException(e);
		} catch (UnsupportedEncodingException e) {
			throw new RuntimeException(e);
		} catch (IllegalBlockSizeException e) {
			throw new RuntimeException(e);
		}

	}

	public String aesDecrypt(String decryptString) {

		try {
			return new String(decryptChipher.doFinal(decoder.decode(decryptString.getBytes())));
		} catch (BadPaddingException nsae) {
			throw new RuntimeException(nsae);
		} catch (IllegalBlockSizeException ike) {
			throw new RuntimeException(ike);
		}

	}

	

	public static SecretKeySpec generateAESKey(final String key, final String encoding) {
		try {

			final byte[] finalKey = new byte[16];

			int i = 0;

			for (byte b : key.getBytes(encoding))

				finalKey[i++ % 16] ^= b;

			return new SecretKeySpec(finalKey, "AES");

		} catch (UnsupportedEncodingException e) {

			throw new RuntimeException(e);

		}

	}
	
	
	/**
	 * 获取默认实例对象
	 * 
	 * @return
	 */
	public static SysEncryptTranslatorRuntime getInstance() {
		return SysEncryptTranslatorRuntime.instance;
	}

	@Override
	public Object translate(Object objValue, boolean bIn, IEntityBase iEntityBase,  IPSDEField iPSDEField, IDataEntityRuntime entityDataEntityRuntime) throws Throwable {

		if(bIn) {
			if(ObjectUtils.isEmpty(objValue)) {
				//没有指定值
				return null;
			}
			
			String strContent = null;
			if(objValue instanceof String) {
				strContent = (String)objValue;
			}
			else {
				strContent = objValue.toString();
			}
			return SysEncryptTranslatorRuntime.getInstance().aesEncrypt(strContent);
		}
		else {
			if(ObjectUtils.isEmpty(objValue)) {
				//没有指定值
				return null;
			}
			
			String strContent = null;
			if(objValue instanceof String) {
				strContent = (String)objValue;
			}
			else {
				strContent = objValue.toString();
			}
			
			strContent = SysEncryptTranslatorRuntime.getInstance().aesDecrypt(strContent);
			if(iPSDEField!=null && this.getSystemRuntime()!=null) {
				return this.getSystemRuntime().convertValue(iPSDEField.getStdDataType(), strContent);
			}
			else {
				return strContent;
			}
		}
	}

}
