package net.ibizsys.central.cloud.core.security.util;

import java.util.Collection;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.util.StringUtils;

import io.jsonwebtoken.lang.Assert;
import net.ibizsys.central.cloud.core.security.EmployeeContext;
import net.ibizsys.central.cloud.core.security.IEmployeeContext;
import net.ibizsys.central.cloud.core.sysutil.SysUAAUtilRuntimeBase;
import net.ibizsys.central.cloud.core.util.domain.AccessToken;
import net.ibizsys.central.cloud.core.util.domain.Employee;
import net.ibizsys.runtime.util.JsonUtils;

public class AccessTokenUtils {

	public static IEmployeeContext toEmployeeContext(AccessToken accessToken, String systemId) {
		
		Assert.notNull(accessToken, "传入凭证无效");
		Assert.notNull(accessToken.getEmployee(), "传入凭证未携带机构用户信息");
		
		Employee employee = new Employee();
		employee.putAll(accessToken.getEmployee());

		Collection<? extends GrantedAuthority> authorities = null;
		String strAuthorities = accessToken.getAuthorities();
		if (StringUtils.hasLength(strAuthorities)) {
			authorities = JsonUtils.as(strAuthorities, SysUAAUtilRuntimeBase.UAAGrantedAuthorityListType);
		}
		return new EmployeeContext(employee, null, systemId, authorities, accessToken.getSession());
	}
	
}
