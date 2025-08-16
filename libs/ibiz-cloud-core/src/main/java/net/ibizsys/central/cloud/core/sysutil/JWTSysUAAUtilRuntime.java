package net.ibizsys.central.cloud.core.sysutil;

import java.security.PublicKey;
import java.util.Date;
import java.util.function.Function;

import org.apache.commons.logging.LogFactory;
import org.springframework.util.ObjectUtils;
import org.springframework.util.StringUtils;

import com.nimbusds.jose.JWSVerifier;
import com.nimbusds.jose.crypto.MACVerifier;
import com.nimbusds.jose.crypto.RSASSAVerifier;
import com.nimbusds.jose.jwk.RSAKey;
import com.nimbusds.jwt.JWTClaimsSet;
import com.nimbusds.jwt.SignedJWT;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Clock;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.impl.DefaultClock;
import net.ibizsys.central.cloud.core.security.IAuthenticationUser;
import net.ibizsys.central.service.client.IWebClientRep;

public class JWTSysUAAUtilRuntime extends SysUAAUtilRuntimeBase {

	private static final org.apache.commons.logging.Log log = LogFactory.getLog(JWTSysUAAUtilRuntime.class);

	public final static String NEWRT_UAASERVICE_SIGNATUREKEY_URL = "lb://uaa-api/auths/signaturekey";


	protected static final String SIGNATURE_RSA = "RSA";
	protected static final String SIGNATURE_MAC = "MAC";

	/**
	 * cn.ibizlab.util.security
	 */

	private Clock clock = DefaultClock.INSTANCE;

	// @Value("${ibiz.jwt.secret:ibzsecret}")
	private String secret;

	private String signature;

	private boolean enableNewRTUAA = false;
	
	private String publicKeyString = null;

	protected String getSecret() {
		return secret;
	}

	protected void setSecret(String secret) {
		this.secret = secret;
	}

	protected Clock getClock() {
		return clock;
	}

	protected void setClock(Clock clock) {
		this.clock = clock;
	}

	protected boolean isEnableNewRTUAA() {
		return enableNewRTUAA;
	}

	protected void setEnableNewRTUAA(boolean enableNewRTUAA) {
		this.enableNewRTUAA = enableNewRTUAA;
	}

	protected String getSignature() {
		return signature;
	}

	protected void setSignature(String signature) {
		this.signature = signature;
	}

	@Override
	protected void onPrepareDefaultSetting() throws Exception {
		this.setEnableNewRTUAA(this.getSystemRuntimeSetting().getParam(this.getConfigFolder() + ".newrtuaa", this.isEnableNewRTUAA()));
		if (!StringUtils.hasLength(this.getSignature())) {
			this.setSignature(this.getSystemRuntimeSetting().getParam(this.getConfigFolder() + ".signature", "RSA"));
		}

		if (!StringUtils.hasLength(this.getSecret())) {
			this.setSecret(this.getSystemRuntimeSetting().getParam(this.getConfigFolder() + ".secret", "MIICdwIBADANBgkqhkiG9w0BAQEFAASCAmEwggJdAgEAAoGBAKaTz4pgOR/p0RjlczM0dErf4ZUNziE/HJcfKDLPu77Gs2EJdDK0uGfPI3GX/eRwX9L9bTZJtz9sX2fkRqRt3gWnsMypT2P/cO/2GgtRCPHRFD7BI+Df32isEJZ6M4kD9tyKLw8Y9KuP0C20ZMMDeCrrbjMagMMrwTOM4/4eFjzVAgMBAAECgYEAnH3mj2hgolOmhg4hkOxpiGIV6lMi4OcKtAqoWDwCdHL12GbqTCytxZC7Cp+w/Wh5DZ3aeRL93c6xPsgdeaJh3kYa4ooo6b5tFHPU63VU5MBgwGzi26/6GB4GCXxGMB+SxmdigDmmPIYbXD+jO2oj1s8hj+DOE4U2fIjeZ//DumECQQDlA74KHNZlKxoWl0FoHCgcIHFBZcQWKO3puhrH7VsRYI7CVVguE57NBT6QvAmU9r32PDt64tS0Qd1sCrk4uEqtAkEAujSj/cwF4ctQZCbUoMMzK/mw8ZxW3M6VK3urbq8fyFJ2iT2aLV3jE3+tnDdpezcfnbs/9SVXeFmJpdg/L7hnyQJAQyxo1qCExmHxIgU1uyrfHPjrH2qRLIrO1gqvhkr5tkwjM59C4SkCIFLUejGdgeMp7wrVy4KzLzhOkT1H/PoZdQJAEbKxJ409veFKKcq7CPCkq3hXBg/a/a+w4+okOCfy+GJGG/M79TXoQFExWhi2MNzjZ2WFxbIf5zNzbszn7Iw1aQJBAIXpKrQ0sLxr0rFzsoHBrobPcnQeutzypQNTPkoItILVP9pWz+aUfIKnOHEC5GAdD2LPZZ/pF7ixdRd9nBab+pk=}"));
		}
		super.onPrepareDefaultSetting();
	}

	@Override
	protected boolean onValidateToken(String token, IAuthenticationUser iAuthenticationUser) throws Throwable {

		String strUserName = this.getUsernameFromToken(token);
		if (!strUserName.contentEquals(iAuthenticationUser.getUsername())) {
			return false;
		}

		final Date expiration = getExpirationDateFromToken(token);
		if (expiration.before(clock.now())) {
			return false;
		}

		if (isEnableNewRTUAA()) {
			if (ObjectUtils.isEmpty(this.getSignature()) || SIGNATURE_MAC.equalsIgnoreCase(getSignature()))
				return validateTokenByMAC(token, iAuthenticationUser);
			else if (SIGNATURE_RSA.equalsIgnoreCase((signature)))
				return validateTokenByRSA(token, iAuthenticationUser);
			else
				throw new Exception(String.format("RT验证访问令牌出错，签名暂未支持[%1$s]加密算法", signature));
		}
		
		return true;
	}

	@Override
	protected String onGetUsernameFromToken(String token) throws Throwable {
		if (!isEnableNewRTUAA()) {
			return getClaimFromToken(token, Claims::getSubject);
		} else {
			SignedJWT signedJWT = SignedJWT.parse(token);
			JWTClaimsSet claimsSet = signedJWT.getJWTClaimsSet();
			return claimsSet.getSubject();
		}
	}

	@Override
	protected Date onGetExpirationDateFromToken(String token) throws Throwable {
		if (!isEnableNewRTUAA()) {
			return getClaimFromToken(token, Claims::getExpiration);
		} else {
			SignedJWT signedJWT = SignedJWT.parse(token);
			JWTClaimsSet claimsSet = signedJWT.getJWTClaimsSet();
			return claimsSet.getExpirationTime();
		}
	}

	protected <T> T getClaimFromToken(String token, Function<Claims, T> claimsResolver) throws Throwable {
		final Claims claims = getAllClaimsFromToken(token);
		return claimsResolver.apply(claims);
	}

	protected Claims getAllClaimsFromToken(String token) throws Throwable {
		PublicKey publicKey = getPublicKey(getPublicKeyString());
		return Jwts.parser().setSigningKey(publicKey).parseClaimsJws(token).getBody();
	}

	/**
     * 通过MAC方式验证token（对称加密）
     *
     * @param token
     * @param iAuthenticationUser
     * @return
     */
    protected boolean validateTokenByMAC(String token, IAuthenticationUser iAuthenticationUser) throws Throwable {
    	 if (!StringUtils.hasLength(this.getSecret()))
             throw new Exception("RT token验证失败，未指定secret");
         Date now = new Date();
         JWSVerifier verifier = new MACVerifier(this.getSecret());
         SignedJWT signedJWT = SignedJWT.parse(token);
         JWTClaimsSet claimsSet = signedJWT.getJWTClaimsSet();
         if (signedJWT.verify(verifier) && now.before(claimsSet.getExpirationTime())) {
             return true;
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
    protected boolean validateTokenByRSA(String token, IAuthenticationUser iAuthenticationUser) throws Throwable {
    	 String signatureKey = getPublicKeyString();
         Date now = new Date();
         RSAKey publicJWK = RSAKey.parse(signatureKey);
         JWSVerifier verifier = new RSASSAVerifier(publicJWK);
         SignedJWT signedJWT = SignedJWT.parse(token);
         JWTClaimsSet claimsSet = signedJWT.getJWTClaimsSet();
         if (!signedJWT.verify(verifier))
             return false;
         if (now.after(claimsSet.getExpirationTime()))
             throw new Exception(String.format("访问令牌已过期，令牌有效期为[%1$s]，当前时间为[%2$s]", claimsSet.getExpirationTime(), now));

         return true;
    }
    
    @Override
    protected String getPublicKeyString() throws Throwable {
    	if(!this.isEnableNewRTUAA()) {
    		return super.getPublicKeyString();
    	}
    	
    	if(StringUtils.hasLength(this.publicKeyString)) {
			return this.publicKeyString;
		}
    	
    	try {
    		IWebClientRep<String> rep = this.getSystemRuntime().getDefaultWebClient().get(NEWRT_UAASERVICE_SIGNATUREKEY_URL);
    		if(rep == null || !StringUtils.hasLength(rep.getBody())) {
    			throw new Exception("返回值无效");
    		}
    		
    		this.publicKeyString = rep.getBody();
    		return this.publicKeyString;
    	}
    	catch (Throwable ex) {
    		throw new Exception(String.format("请求签名密钥发生异常，%1$s", ex.getMessage()), ex);
		}
    }
}
