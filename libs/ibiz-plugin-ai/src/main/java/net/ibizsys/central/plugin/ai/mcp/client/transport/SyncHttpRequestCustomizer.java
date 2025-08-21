/*
 * Copyright 2024-2025 the original author or authors.
 */

package net.ibizsys.central.plugin.ai.mcp.client.transport;

import java.net.URI;

import org.apache.http.client.methods.RequestBuilder;

import reactor.util.annotation.Nullable;

/**
 * Customize {@link HttpRequest.Builder} before executing the request, either in SSE or
 * Streamable HTTP transport.
 *
 * @author Daniel Garnier-Moiroux
 */
public interface SyncHttpRequestCustomizer {

	void customize(RequestBuilder builder, String method, URI endpoint, @Nullable String body);

}
