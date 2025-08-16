package net.ibizsys.central.cloud.core.sysutil;

import com.nimbusds.jose.JWSVerifier;
import com.nimbusds.jose.crypto.MACVerifier;
import com.nimbusds.jose.crypto.RSASSAVerifier;
import com.nimbusds.jose.jwk.RSAKey;
import com.nimbusds.jwt.JWTClaimsSet;
import com.nimbusds.jwt.SignedJWT;
import io.jsonwebtoken.Clock;
import io.jsonwebtoken.impl.DefaultClock;
import net.ibizsys.central.cloud.core.security.IAuthenticationUser;
import net.ibizsys.central.service.client.IWebClient;
import net.ibizsys.central.service.client.IWebClientRep;
import org.apache.commons.logging.LogFactory;
import org.springframework.util.ObjectUtils;
import org.springframework.util.StringUtils;

import java.util.Date;

public class RTJWTSysUAAUtilRuntime extends SysUAAUtilRuntimeBase {

    private static final org.apache.commons.logging.Log log = LogFactory.getLog(RTJWTSysUAAUtilRuntime.class);

    public static String RT_SERVICE = "lb://uaa-api";

    public static String RT_PUBLICKEY_PATH = "/auths/signaturekey";

    public static String RT_PUBLICKEY_PEM_PATH = "/auths/public_key";

    private String secret;
    private String signature;

    private Clock clock = DefaultClock.INSTANCE;

    protected static final String SIGNATURE_RSA = "RSA";
    protected static final String SIGNATURE_MAC = "MAC";

    @Override
    protected void onPrepareDefaultSetting() throws Exception {
        super.onPrepareDefaultSetting();

        signature = this.getSystemRuntimeSetting().getParam(this.getConfigFolder() + ".signature", "RSA");
        secret = this.getSystemRuntimeSetting().getParam(this.getConfigFolder() + ".secret", "MIICdwIBADANBgkqhkiG9w0BAQEFAASCAmEwggJdAgEAAoGBAKaTz4pgOR/p0RjlczM0dErf4ZUNziE/HJcfKDLPu77Gs2EJdDK0uGfPI3GX/eRwX9L9bTZJtz9sX2fkRqRt3gWnsMypT2P/cO/2GgtRCPHRFD7BI+Df32isEJZ6M4kD9tyKLw8Y9KuP0C20ZMMDeCrrbjMagMMrwTOM4/4eFjzVAgMBAAECgYEAnH3mj2hgolOmhg4hkOxpiGIV6lMi4OcKtAqoWDwCdHL12GbqTCytxZC7Cp+w/Wh5DZ3aeRL93c6xPsgdeaJh3kYa4ooo6b5tFHPU63VU5MBgwGzi26/6GB4GCXxGMB+SxmdigDmmPIYbXD+jO2oj1s8hj+DOE4U2fIjeZ//DumECQQDlA74KHNZlKxoWl0FoHCgcIHFBZcQWKO3puhrH7VsRYI7CVVguE57NBT6QvAmU9r32PDt64tS0Qd1sCrk4uEqtAkEAujSj/cwF4ctQZCbUoMMzK/mw8ZxW3M6VK3urbq8fyFJ2iT2aLV3jE3+tnDdpezcfnbs/9SVXeFmJpdg/L7hnyQJAQyxo1qCExmHxIgU1uyrfHPjrH2qRLIrO1gqvhkr5tkwjM59C4SkCIFLUejGdgeMp7wrVy4KzLzhOkT1H/PoZdQJAEbKxJ409veFKKcq7CPCkq3hXBg/a/a+w4+okOCfy+GJGG/M79TXoQFExWhi2MNzjZ2WFxbIf5zNzbszn7Iw1aQJBAIXpKrQ0sLxr0rFzsoHBrobPcnQeutzypQNTPkoItILVP9pWz+aUfIKnOHEC5GAdD2LPZZ/pF7ixdRd9nBab+pk=}");

    }

    @Override
    protected boolean onValidateToken(String token, IAuthenticationUser iAuthenticationUser) throws Throwable {
        if(ObjectUtils.isEmpty(signature)|| SIGNATURE_MAC.equalsIgnoreCase(signature))
            return validateTokenByMAC(token,iAuthenticationUser);
        else if(SIGNATURE_RSA.equalsIgnoreCase((signature)))
            return validateTokenByRSA(token,iAuthenticationUser);
        else
            throw new RuntimeException(String.format("验证访问令牌出错，签名暂未支持[%1$s]加密算法",signature));
    }

    /**
     * 通过MAC方式验证token（对称加密）
     *
     * @param token
     * @param iAuthenticationUser
     * @return
     */
    protected Boolean validateTokenByMAC(String token, IAuthenticationUser iAuthenticationUser) {
        try {
            if (!StringUtils.hasLength(secret))
                throw new RuntimeException("token验证失败，未指定secret");
            Date now = new Date();
            JWSVerifier verifier = new MACVerifier(this.secret);
            SignedJWT signedJWT = SignedJWT.parse(token);
            JWTClaimsSet claimsSet = signedJWT.getJWTClaimsSet();
            if (signedJWT.verify(verifier) && now.before(claimsSet.getExpirationTime())) {
                return true;
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return false;
    }

    /**
     * 通过RSA方式验证token（非对称加密）
     *
     * @param token
     * @param iAuthenticationUser
     * @return
     */
    protected Boolean validateTokenByRSA(String token, IAuthenticationUser iAuthenticationUser) {
        try {
            String signatureKey = null;
            try {
                IWebClientRep<String> rep = getWebClient(false).post(RT_PUBLICKEY_PATH, null);
                signatureKey = rep.getBody();
            } catch (Throwable e) {
                throw new RuntimeException(e);
            }
            if (ObjectUtils.isEmpty(signatureKey))
                throw new RuntimeException("验证访问令牌出错，未能获取到公钥信息");

            Date now = new Date();
            RSAKey publicJWK = RSAKey.parse(signatureKey);
            JWSVerifier verifier = new RSASSAVerifier(publicJWK);
            SignedJWT signedJWT = SignedJWT.parse(token);
            JWTClaimsSet claimsSet = signedJWT.getJWTClaimsSet();

            if (!signedJWT.verify(verifier))
                return false;

            if (now.after(claimsSet.getExpirationTime()))
                throw new RuntimeException(String.format("访问令牌已过期，令牌有效期为[%1$s]，当前时间为[%2$s]", claimsSet.getExpirationTime(), now));


            return true;

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    private IWebClient iWebClient = null;

    protected IWebClient getWebClient(boolean bTryMode) {
        if (this.iWebClient != null || bTryMode) {
            return this.iWebClient;
        }
        this.iWebClient = createWebClient();
        return this.iWebClient;
    }

    protected IWebClient createWebClient() {
        IWebClient iWebClient = this.getSystemRuntime().createWebClient(this);
        try {
            iWebClient.init(this.getSystemRuntime(), RT_SERVICE, null);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        return iWebClient;
    }

    @Override
    protected String onGetUsernameFromToken(String token) throws Throwable {
        try {
            SignedJWT signedJWT = SignedJWT.parse(token);
            JWTClaimsSet claimsSet = signedJWT.getJWTClaimsSet();
            return claimsSet.getSubject();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    protected Date onGetExpirationDateFromToken(String token) throws Throwable {
        try {
            SignedJWT signedJWT = SignedJWT.parse(token);
            JWTClaimsSet claimsSet = signedJWT.getJWTClaimsSet();
            return claimsSet.getExpirationTime();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

}
