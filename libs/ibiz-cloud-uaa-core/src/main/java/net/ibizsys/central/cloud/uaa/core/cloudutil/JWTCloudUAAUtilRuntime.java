package net.ibizsys.central.cloud.uaa.core.cloudutil;

import java.security.PublicKey;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;

import org.apache.commons.logging.LogFactory;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Clock;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import io.jsonwebtoken.impl.DefaultClock;
import net.ibizsys.central.cloud.core.security.IAuthenticationUser;

public class JWTCloudUAAUtilRuntime extends CloudUAAUtilRuntimeBase {

	private static final org.apache.commons.logging.Log log = LogFactory.getLog(JWTCloudUAAUtilRuntime.class);
	
	/**
	 * cn.ibizlab.util.security
	 */

	private Clock clock = DefaultClock.INSTANCE;

	// @Value("${ibiz.jwt.secret:ibzsecret}")
	private String secret;

	

	// @Value("${ibiz.jwt.header:Authorization}")
	//private String tokenHeader;

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

	@Override
	protected String onGenerateToken(IAuthenticationUser iAuthenticationUser, long nTokenExpiration) throws Throwable {
		Map<String, Object> claims = new HashMap<>();
		return doGenerateToken(iAuthenticationUser, claims, nTokenExpiration);
	}

	protected String doGenerateToken(IAuthenticationUser iAuthenticationUser, Map<String, Object> claims, long nTokenExpiration) throws Throwable {
		final Date createdDate = clock.now();
		final Date expirationDate = calculateExpirationDate(createdDate, nTokenExpiration);

		return Jwts.builder().setClaims(claims).setSubject(iAuthenticationUser.getUsername()).setIssuedAt(createdDate).setExpiration(expirationDate).signWith(SignatureAlgorithm.RS256, getPrivateKey(getPrivateKeyString())).compact();
	}

	protected Date calculateExpirationDate(Date createdDate, long nTokenExpiration) {
		return new Date(createdDate.getTime() + nTokenExpiration);
	}


	@Override
	protected boolean onValidateToken(String token, IAuthenticationUser iAuthenticationUser) throws Throwable {
		
		String strUserName = this.getUsernameFromToken(token);
		if(iAuthenticationUser!=null) {
			if(!strUserName.contentEquals(iAuthenticationUser.getUsername())) {
				return false;
			}
		}
		
		final Date expiration = getExpirationDateFromToken(token);
	    return !expiration.before(clock.now());
	}

	@Override
	protected String onGetUsernameFromToken(String token) throws Throwable {
		 return getClaimFromToken(token, Claims::getSubject);
	}

	@Override
	protected Date onGetExpirationDateFromToken(String token) throws Throwable {
		return getClaimFromToken(token, Claims::getExpiration);
	}
	

	protected <T> T getClaimFromToken(String token, Function<Claims, T> claimsResolver) throws Throwable {
        final Claims claims = getAllClaimsFromToken(token);
        return claimsResolver.apply(claims);
    }

	protected Claims getAllClaimsFromToken(String token) throws Throwable{
        PublicKey publicKey = getPublicKey(getPublicKeyString());
        return Jwts.parser()
                .setSigningKey(publicKey)
                .parseClaimsJws(token)
                .getBody();
    }
	
	
//	@Override
//	protected String onRefreshToken(String strToken) throws Throwable {
//		 String username = null;
//	        String newToken = null;
//	        try {
//	            username = jwtTokenUtil.getUsernameFromToken(oldToken);
//	        } catch (ExpiredJwtException e) {
//	            log.error(e.getMessage());
//	        }
//	        if (!StringUtils.isEmpty(username)) {
//	            AuthenticationUser user = userDetailsService.loadUserByUsername(username);
//	            if (jwtTokenUtil.validateToken(oldToken, user)) {
//	                // 将新token存入缓存，在固定周期内调用接口将返回同一token
//	                Token tok = getToken(oldToken);
//	                if (ObjectUtils.isEmpty(tok)) {
//	                    newToken = jwtTokenUtil.generateToken(user);
//	                    setToken(oldToken, newToken);
//	                } else {
//	                    // 判断缓存中的token是否到期，到期将返回新token
//	                    if (isExpired(tok, expiration)) {
//	                        newToken = jwtTokenUtil.generateToken(user);
//	                        setToken(oldToken, newToken);
//	                    } else {
//	                        newToken = tok.getNewToken();
//	                    }
//	                }
//	            }
//	        }
//	        if (StringUtils.isEmpty(newToken)) {
//	            throw new BadRequestAlertException("获取token失败", "", "refreshToken");
//	        } else {
//	            return newToken;
//	        }
//	}
	

	
}
