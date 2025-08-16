package net.ibizsys.central.cloud.uaa.core.util;

import java.security.Security;
import java.util.Arrays;

import org.bouncycastle.crypto.digests.SM3Digest;
import org.bouncycastle.crypto.macs.HMac;
import org.bouncycastle.crypto.params.KeyParameter;
import org.bouncycastle.jce.provider.BouncyCastleProvider;
import org.bouncycastle.pqc.math.linearalgebra.ByteUtils;

public class SM3Utils {

	//private static final org.apache.commons.logging.Log log = LogFactory.getLog(SM3Utils.class);

    private SM3Utils() {
    }

    public static byte[] hash(byte[] data) {
        SM3Digest digest = new SM3Digest();
        digest.update(data, 0, data.length);
        byte[] hash = new byte[digest.getDigestSize()];
        digest.doFinal(hash, 0);
        return hash;
    }

    public static boolean verify(byte[] data, byte[] sm3Hash) {
        byte[] newHash = hash(data);
        return Arrays.equals(newHash, sm3Hash);
    }

    public static byte[] hmac(byte[] key, byte[] data) {
        KeyParameter keyParameter = new KeyParameter(key);
        SM3Digest digest = new SM3Digest();
        HMac mac = new HMac(digest);
        mac.init(keyParameter);
        mac.update(data, 0, data.length);
        byte[] result = new byte[mac.getMacSize()];
        mac.doFinal(result, 0);
        return result;
    }

    public static String encrypt(String paramStr) {
        String resultJexString = "";

        try {
            byte[] bytes = paramStr.getBytes();
            byte[] hash = hash(bytes);
            resultJexString = ByteUtils.toHexString(hash);
        } catch (Exception ex) {
        	throw new RuntimeException(String.format("SM3加密发生异常，%1$s", ex.getMessage()), ex);
        }

        return resultJexString;
    }

    static {
        Security.addProvider(new BouncyCastleProvider());
    }
}
