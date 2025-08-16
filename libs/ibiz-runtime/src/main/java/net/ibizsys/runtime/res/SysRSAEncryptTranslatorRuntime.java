package net.ibizsys.runtime.res;

import java.security.KeyFactory;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.spec.PKCS8EncodedKeySpec;
import java.util.Base64;

import javax.crypto.Cipher;

import org.springframework.util.ObjectUtils;
import org.springframework.util.StringUtils;

import net.ibizsys.model.dataentity.defield.IPSDEField;
import net.ibizsys.runtime.SystemRuntimeException;
import net.ibizsys.runtime.dataentity.IDataEntityRuntime;
import net.ibizsys.runtime.util.IEntityBase;

/**
 * RSA数据加密转换器运行时对象
 * 
 * @author lionlau
 *
 */
public class SysRSAEncryptTranslatorRuntime extends SysTranslatorRuntimeBase {

	private static final org.apache.commons.logging.Log log = org.apache.commons.logging.LogFactory.getLog(SysRSAEncryptTranslatorRuntime.class);

	private PrivateKey privateKey = null;
	private PublicKey publicKey = null;

	public SysRSAEncryptTranslatorRuntime() {

	}

	@Override
	protected void onInit() throws Exception {
		super.onInit();

		if (this.getPublicKey(true) == null) {
			this.preparePublicKey();
			if (this.getPublicKey(true) == null) {
				throw new Exception("公钥无效");
			}
		}

		if (this.getPrivateKey(true) == null) {
			this.preparePrivateKey();
			if (this.getPrivateKey(true) == null) {
				throw new Exception("私钥无效");
			}
		}

	}

	protected PrivateKey getPrivateKey() {
		return privateKey;
	}

	protected PrivateKey getPrivateKey(boolean bTryMode) {
		if (this.privateKey != null || bTryMode) {
			return this.privateKey;
		}
		throw new SystemRuntimeException(this.getSystemRuntimeBase(), this, String.format("未指定私钥"));
	}

	protected void preparePrivateKey() throws Exception {
		String strPrivateKey = this.getSystemRuntime().getSystemRuntimeSetting().getParam(this.getConfigFolder() + ".privatekey", null);
		if (!StringUtils.hasLength(strPrivateKey)) {
			throw new Exception("未指定私钥配置");
		}

		PKCS8EncodedKeySpec pkcs8EncodedKeySpec = new PKCS8EncodedKeySpec(Base64.getDecoder().decode(strPrivateKey));
		KeyFactory keyFactory = KeyFactory.getInstance("RSA");
		PrivateKey privateKey = keyFactory.generatePrivate(pkcs8EncodedKeySpec);
		this.setPrivateKey(privateKey);
	}

	protected void setPrivateKey(PrivateKey privateKey) {
		this.privateKey = privateKey;

	}

	protected PublicKey getPublicKey() {
		return getPublicKey(false);
	}

	protected PublicKey getPublicKey(boolean bTryMode) {
		if (this.publicKey != null || bTryMode) {
			return this.publicKey;
		}
		throw new SystemRuntimeException(this.getSystemRuntimeBase(), this, String.format("未指定公钥"));
	}

	protected void setPublicKey(PublicKey publicKey) {
		this.publicKey = publicKey;
	}

	protected void preparePublicKey() throws Exception {
		String strPublicKey = this.getSystemRuntime().getSystemRuntimeSetting().getParam(this.getConfigFolder() + ".publickey", null);
		if (!StringUtils.hasLength(strPublicKey)) {
			throw new Exception("未指定公钥配置");
		}

		PKCS8EncodedKeySpec pkcs8EncodedKeySpec = new PKCS8EncodedKeySpec(Base64.getDecoder().decode(strPublicKey));
		KeyFactory keyFactory = KeyFactory.getInstance("RSA");
		PublicKey privateKey = keyFactory.generatePublic(pkcs8EncodedKeySpec);
		this.setPublicKey(privateKey);
	}

	public static String encrypt(String plainText, PublicKey publicKey) throws Exception {
		// Get Cipher Instance RSA With ECB Mode and
		// OAEPWITHSHA-512ANDMGF1PADDING Padding
		Cipher cipher = Cipher.getInstance("RSA/ECB/OAEPWITHSHA-512ANDMGF1PADDING");

		// Initialize Cipher for ENCRYPT_MODE
		cipher.init(Cipher.ENCRYPT_MODE, publicKey);

		// Perform Encryption
		byte[] cipherText = cipher.doFinal(plainText.getBytes());
		return Base64.getEncoder().encodeToString(cipherText);
	}
	

	

	public static String decrypt(String cipherText, PrivateKey privateKey) throws Exception {
		// Get Cipher Instance RSA With ECB Mode and
		// OAEPWITHSHA-512ANDMGF1PADDING Padding
		Cipher cipher = Cipher.getInstance("RSA/ECB/OAEPWITHSHA-512ANDMGF1PADDING");

		// Initialize Cipher for DECRYPT_MODE
		cipher.init(Cipher.DECRYPT_MODE, privateKey);

		// Perform Decryption
		byte[] decryptedTextArray = cipher.doFinal(Base64.getDecoder().decode(cipherText));

		return new String(decryptedTextArray);
	}
	
	public static String encrypt(String plainText, PrivateKey privateKey) throws Exception {
		// Get Cipher Instance RSA With ECB Mode and
		// OAEPWITHSHA-512ANDMGF1PADDING Padding
		Cipher cipher = Cipher.getInstance("RSA/ECB/OAEPWITHSHA-512ANDMGF1PADDING");

		// Initialize Cipher for ENCRYPT_MODE
		cipher.init(Cipher.ENCRYPT_MODE, privateKey);

		// Perform Encryption
		byte[] cipherText = cipher.doFinal(plainText.getBytes());
		return Base64.getEncoder().encodeToString(cipherText);
	}
	

	

	public static String decrypt(String cipherText, PublicKey publicKey) throws Exception {
		// Get Cipher Instance RSA With ECB Mode and
		// OAEPWITHSHA-512ANDMGF1PADDING Padding
		Cipher cipher = Cipher.getInstance("RSA/ECB/OAEPWITHSHA-512ANDMGF1PADDING");

		// Initialize Cipher for DECRYPT_MODE
		cipher.init(Cipher.DECRYPT_MODE, publicKey);

		// Perform Decryption
		byte[] decryptedTextArray = cipher.doFinal(Base64.getDecoder().decode(cipherText));

		return new String(decryptedTextArray);
	}
	
	
	

	@Override
	public Object translate(Object objValue, boolean bIn, IEntityBase iEntityBase, IPSDEField iPSDEField, IDataEntityRuntime entityDataEntityRuntime) throws Throwable {

		if (bIn) {
			if (ObjectUtils.isEmpty(objValue)) {
				// 没有指定值
				return null;
			}

			String strContent = null;
			if (objValue instanceof String) {
				strContent = (String) objValue;
			} else {
				strContent = objValue.toString();
			}
			return encrypt(strContent, this.getPrivateKey());
			
		} else {
			if (ObjectUtils.isEmpty(objValue)) {
				// 没有指定值
				return null;
			}

			String strContent = null;
			if (objValue instanceof String) {
				strContent = (String) objValue;
			} else {
				strContent = objValue.toString();
			}
			
			strContent = decrypt(strContent, this.getPublicKey());
			if (iPSDEField != null) {
				return this.getSystemRuntime().convertValue(iPSDEField.getStdDataType(), strContent);
			} else {
				return strContent;
			}
		}
	}

}
