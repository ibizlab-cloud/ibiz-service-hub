package net.ibizsys.central.cloud.core.spring.filter;

import java.io.IOException;

import javax.annotation.PostConstruct;
import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.filter.OncePerRequestFilter;

import net.ibizsys.central.cloud.core.IServiceHub;
import net.ibizsys.central.cloud.core.servlet.IServiceHubFilter;

@Component
public class AuthorizationFilter extends OncePerRequestFilter {

	@Autowired
	IServiceHub iServiceHub;

	IServiceHubFilter iServiceHubFilter = null;

	public AuthorizationFilter() {

	}

	@PostConstruct
	protected void postConstruct() {
		if (iServiceHub instanceof IServiceHubFilter) {
			this.iServiceHubFilter = (IServiceHubFilter) iServiceHub;
		}
	}

	@Override
	protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain chain) throws ServletException, IOException {
		if (this.iServiceHubFilter != null) {
			if(!this.iServiceHubFilter.doFilter(request, response)) {
				return;
			}
		}

		chain.doFilter(request, response);
	}

}
