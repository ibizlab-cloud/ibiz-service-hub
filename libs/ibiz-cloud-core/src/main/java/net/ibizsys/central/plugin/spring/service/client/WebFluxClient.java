package net.ibizsys.central.plugin.spring.service.client;

import java.io.File;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.nio.channels.FileChannel;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletResponse;

import org.apache.commons.io.FileUtils;
import org.apache.commons.io.FilenameUtils;
import org.apache.commons.io.IOUtils;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.core.io.FileSystemResource;
import org.springframework.core.io.InputStreamResource;
import org.springframework.core.io.Resource;
import org.springframework.core.io.buffer.DataBufferUtils;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.http.codec.json.Jackson2JsonDecoder;
import org.springframework.http.codec.json.Jackson2JsonEncoder;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.util.ObjectUtils;
import org.springframework.util.StringUtils;
import org.springframework.web.reactive.function.BodyExtractors;
import org.springframework.web.reactive.function.BodyInserters;
import org.springframework.web.reactive.function.client.ExchangeFilterFunction;
import org.springframework.web.reactive.function.client.WebClient;
import org.springframework.web.reactive.function.client.WebClient.RequestBodySpec;
import org.springframework.web.reactive.function.client.WebClient.RequestHeadersSpec;
import org.springframework.web.reactive.function.client.WebClientResponseException;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.node.ObjectNode;

import net.ibizsys.central.service.SubSysServiceAPIRuntimeException;
import net.ibizsys.central.service.client.IWebClientRep;
import net.ibizsys.central.service.client.WebClientBase;
import net.ibizsys.central.service.client.WebClientRep;
import net.ibizsys.runtime.SystemRuntimeException;
import net.ibizsys.runtime.util.DataTypeUtils;
import net.ibizsys.runtime.util.IEntity;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public class WebFluxClient extends WebClientBase {

	private static final Log log = LogFactory.getLog(WebFluxClient.class);

	private static ExchangeFilterFunction exchangeFilterFunction = null;

	public static void setExchangeFilterFunction(ExchangeFilterFunction exchangeFilterFunction) {
		WebFluxClient.exchangeFilterFunction = exchangeFilterFunction;

	}

	public static ExchangeFilterFunction getExchangeFilterFunction() {
		return WebFluxClient.exchangeFilterFunction;
	}

	private WebClient webClient = null;
	private WebClient webClient2 = null;

	protected WebClient getWebClient(String strUri) {

		if (StringUtils.hasLength(this.getServiceUrl())) {
			if (this.webClient == null) {
				if (this.getServiceUrl().indexOf("lb://") == 0) {
					this.webClient = WebClient.builder().codecs(configurer -> {
						configurer.defaultCodecs().jackson2JsonDecoder(new Jackson2JsonDecoder(WebClientBase.MAPPER));
						configurer.defaultCodecs().jackson2JsonEncoder(new Jackson2JsonEncoder(WebClientBase.OUTMAPPER));
						configurer.defaultCodecs().maxInMemorySize(getMaxInMemorySize());
					}).filter(getExchangeFilterFunction()).baseUrl(this.getServiceUrl()).build();

				} else {
					this.webClient = WebClient.builder().codecs(configurer -> {
						configurer.defaultCodecs().jackson2JsonDecoder(new Jackson2JsonDecoder(WebClientBase.MAPPER));
						configurer.defaultCodecs().jackson2JsonEncoder(new Jackson2JsonEncoder(WebClientBase.OUTMAPPER));
						configurer.defaultCodecs().maxInMemorySize(getMaxInMemorySize());
					}).baseUrl(this.getServiceUrl()).build();
				}
			}
			return this.webClient;
		} else if (StringUtils.hasLength(strUri) && strUri.indexOf("lb://") == 0) {
			if (this.webClient == null) {
				this.webClient = WebClient.builder().codecs(configurer -> {
					configurer.defaultCodecs().jackson2JsonDecoder(new Jackson2JsonDecoder(WebClientBase.MAPPER));
					configurer.defaultCodecs().jackson2JsonEncoder(new Jackson2JsonEncoder(WebClientBase.OUTMAPPER));
					configurer.defaultCodecs().maxInMemorySize(getMaxInMemorySize());
				}).filter(getExchangeFilterFunction()).build();
			}
			return this.webClient;
		} else {
			if (this.webClient2 == null) {
				this.webClient2 = WebClient.builder().codecs(configurer -> {
					configurer.defaultCodecs().jackson2JsonDecoder(new Jackson2JsonDecoder(WebClientBase.MAPPER));
					configurer.defaultCodecs().jackson2JsonEncoder(new Jackson2JsonEncoder(WebClientBase.OUTMAPPER));
					configurer.defaultCodecs().maxInMemorySize(getMaxInMemorySize());
				}).build();
			}
			return this.webClient2;
		}

	}

	@Override
	protected <T> IWebClientRep<T> onGet(String strUri, Map<String, ?> uriParams, Map<String, ?> headers, Map<String, ?> queries, Class<T> cls, Object objTag) throws Throwable {
		try {
			if (queries != null) {
				String strQueryParam = getUrlParams(queries, false);
				if (StringUtils.hasLength(strQueryParam)) {
					if (strUri.indexOf("?") == -1) {
						strUri += "?";
					} else {
						strUri += "&";
					}
					strUri += strQueryParam;
				}
			}

			removeInvalidUriParams(strUri, uriParams);

			RequestHeadersSpec<?> s = null;
			if (uriParams != null) {
				s = getWebClient(strUri).get().uri(strUri, uriParams);
			} else {
				s = getWebClient(strUri).get().uri(strUri);
			}

			if (headers != null) {
				for (String strHeader : headers.keySet()) {
					s.header(strHeader, (String) headers.get(strHeader));
				}
			}
			Map<String, ?> globalHeaders = this.getHeaders();
			if (globalHeaders != null) {
				for (String strHeader : globalHeaders.keySet()) {
					s.header(strHeader, (String) globalHeaders.get(strHeader));
				}
			}
			Mono<ResponseEntity<T>> mono = s.retrieve().toEntity(cls);
			ResponseEntity<T> entity = mono.block();

			if (entity.getStatusCodeValue() < 200 || entity.getStatusCodeValue() >= 300) {
				throw createWebClientResponseException(entity.getStatusCodeValue(), null, entity.getHeaders(), entity.getBody());
			}

			return new WebClientRep<T>(entity.getBody(), (entity.getHeaders() == null) ? null : entity.getHeaders());
		} catch (Throwable ex) {
			if (ex instanceof WebClientResponseException) {
				WebClientResponseException webClientResponseException = (WebClientResponseException) ex;

				throw new SubSysServiceAPIRuntimeException(this.getSystemRuntime(), this.getSubSysServiceAPIRuntime(), webClientResponseException.getRawStatusCode(), getExceptionMessage(webClientResponseException), ex);
			}
			throw new SystemRuntimeException(this.getSystemRuntime(), this.getSubSysServiceAPIRuntime(), String.format("请求发生异常，%1$s", ex.getMessage()), ex);
		}
	}

	@Override
	protected <T> IWebClientRep<T> onPost(String strUri, Map<String, ?> uriParams, Map<String, ?> headers, Map<String, ?> queries, Object objBody, String strContentType, Class<T> cls, Object objTag) throws Throwable {
		try {
			if (queries != null) {
				String strQueryParam = getUrlParams(queries, false);
				if (StringUtils.hasLength(strQueryParam)) {
					if (strUri.indexOf("?") == -1) {
						strUri += "?";
					} else {
						strUri += "&";
					}
					strUri += strQueryParam;
				}
			}

			removeInvalidUriParams(strUri, uriParams);

			RequestHeadersSpec<?> s = null;
			if (uriParams != null) {
				s = getWebClient(strUri).post().uri(strUri, uriParams);
			} else {
				s = getWebClient(strUri).post().uri(strUri);
			}

			if (headers != null) {
				for (String strHeader : headers.keySet()) {
					s.header(strHeader, (String) headers.get(strHeader));
				}
			}
			Map<String, ?> globalHeaders = this.getHeaders();
			if (globalHeaders != null) {
				for (String strHeader : globalHeaders.keySet()) {
					s.header(strHeader, (String) globalHeaders.get(strHeader));
				}
			}
			if (objBody != null) {
				RequestBodySpec bs = (RequestBodySpec) s;
				if (ObjectUtils.isEmpty(strContentType) || strContentType.equals(MediaType.APPLICATION_JSON_VALUE)) {
					bs.contentType(MediaType.APPLICATION_JSON).bodyValue(objBody);
				} else if (strContentType.equals(MediaType.APPLICATION_FORM_URLENCODED_VALUE)) {
					bs.contentType(MediaType.APPLICATION_FORM_URLENCODED).body(BodyInserters.fromFormData(this.getFormData(objBody)));
				} else if (strContentType.equals(MediaType.TEXT_XML_VALUE)) {
					bs.contentType(MediaType.TEXT_XML).bodyValue(objBody);
				} else {
					throw new Exception(String.format("未支持的内容类型[%1$s]", strContentType));
				}

			}

			Mono<ResponseEntity<T>> mono = s.retrieve().toEntity(cls);
			ResponseEntity<T> entity = mono.block();

			if (entity.getStatusCodeValue() < 200 || entity.getStatusCodeValue() >= 300) {
				throw createWebClientResponseException(entity.getStatusCodeValue(), null, entity.getHeaders(), entity.getBody());
			}

			return new WebClientRep<T>(entity.getBody(), (entity.getHeaders() == null) ? null : entity.getHeaders());
		} catch (Throwable ex) {
			if (ex instanceof WebClientResponseException) {
				WebClientResponseException webClientResponseException = (WebClientResponseException) ex;
				throw new SubSysServiceAPIRuntimeException(this.getSystemRuntime(), this.getSubSysServiceAPIRuntime(), webClientResponseException.getRawStatusCode(), getExceptionMessage(webClientResponseException), ex);
			}
			throw new SystemRuntimeException(this.getSystemRuntime(), this.getSubSysServiceAPIRuntime(), String.format("请求发生异常，%1$s", ex.getMessage()), ex);
		}
	}

	@Override
	protected <T> IWebClientRep<T> onPut(String strUri, Map<String, ?> uriParams, Map<String, ?> headers, Map<String, ?> queries, Object objBody, String strContentType, Class<T> cls, Object objTag) throws Throwable {
		try {
			if (queries != null) {
				String strQueryParam = getUrlParams(queries, false);
				if (StringUtils.hasLength(strQueryParam)) {
					if (strUri.indexOf("?") == -1) {
						strUri += "?";
					} else {
						strUri += "&";
					}
					strUri += strQueryParam;
				}
			}

			removeInvalidUriParams(strUri, uriParams);

			RequestHeadersSpec<?> s = null;
			if (uriParams != null) {
				s = getWebClient(strUri).put().uri(strUri, uriParams);
			} else {
				s = getWebClient(strUri).put().uri(strUri);
			}

			if (headers != null) {
				for (String strHeader : headers.keySet()) {
					s.header(strHeader, (String) headers.get(strHeader));
				}
			}
			Map<String, ?> globalHeaders = this.getHeaders();
			if (globalHeaders != null) {
				for (String strHeader : globalHeaders.keySet()) {
					s.header(strHeader, (String) globalHeaders.get(strHeader));
				}
			}
			if (objBody != null) {
				RequestBodySpec bs = (RequestBodySpec) s;
				if (ObjectUtils.isEmpty(strContentType) || strContentType.equals(MediaType.APPLICATION_JSON_VALUE)) {
					bs.contentType(MediaType.APPLICATION_JSON).bodyValue(objBody);
				} else if (strContentType.equals(MediaType.APPLICATION_FORM_URLENCODED_VALUE)) {
					bs.contentType(MediaType.APPLICATION_FORM_URLENCODED).body(BodyInserters.fromFormData(this.getFormData(objBody)));
				} else if (strContentType.equals(MediaType.TEXT_XML_VALUE)) {
					bs.contentType(MediaType.TEXT_XML).bodyValue(objBody);
				} else {
					throw new Exception(String.format("未支持的内容类型[%1$s]", strContentType));
				}
			}
			Mono<ResponseEntity<T>> mono = s.retrieve().toEntity(cls);
			ResponseEntity<T> entity = mono.block();

			if (entity.getStatusCodeValue() < 200 || entity.getStatusCodeValue() >= 300) {
				throw createWebClientResponseException(entity.getStatusCodeValue(), null, entity.getHeaders(), entity.getBody());
			}

			return new WebClientRep<T>(entity.getBody(), (entity.getHeaders() == null) ? null : entity.getHeaders());
		} catch (Throwable ex) {
			if (ex instanceof WebClientResponseException) {
				WebClientResponseException webClientResponseException = (WebClientResponseException) ex;
				throw new SubSysServiceAPIRuntimeException(this.getSystemRuntime(), this.getSubSysServiceAPIRuntime(), webClientResponseException.getRawStatusCode(), getExceptionMessage(webClientResponseException), ex);
			}
			throw new SystemRuntimeException(this.getSystemRuntime(), this.getSubSysServiceAPIRuntime(), String.format("请求发生异常，%1$s", ex.getMessage()), ex);
		}
	}

	@Override
	protected <T> IWebClientRep<T> onPatch(String strUri, Map<String, ?> uriParams, Map<String, ?> headers, Map<String, ?> queries, Object objBody, String strContentType, Class<T> cls, Object objTag) throws Throwable {
		try {
			if (queries != null) {
				String strQueryParam = getUrlParams(queries, false);
				if (StringUtils.hasLength(strQueryParam)) {
					if (strUri.indexOf("?") == -1) {
						strUri += "?";
					} else {
						strUri += "&";
					}
					strUri += strQueryParam;
				}
			}

			removeInvalidUriParams(strUri, uriParams);

			RequestHeadersSpec<?> s = null;
			if (uriParams != null) {
				s = getWebClient(strUri).patch().uri(strUri, uriParams);
			} else {
				s = getWebClient(strUri).patch().uri(strUri);
			}

			if (headers != null) {
				for (String strHeader : headers.keySet()) {
					s.header(strHeader, (String) headers.get(strHeader));
				}
			}
			Map<String, ?> globalHeaders = this.getHeaders();
			if (globalHeaders != null) {
				for (String strHeader : globalHeaders.keySet()) {
					s.header(strHeader, (String) globalHeaders.get(strHeader));
				}
			}
			if (objBody != null) {
				RequestBodySpec bs = (RequestBodySpec) s;
				if (ObjectUtils.isEmpty(strContentType) || strContentType.equals(MediaType.APPLICATION_JSON_VALUE)) {
					bs.contentType(MediaType.APPLICATION_JSON).bodyValue(objBody);
				} else if (strContentType.equals(MediaType.APPLICATION_FORM_URLENCODED_VALUE)) {
					bs.contentType(MediaType.APPLICATION_FORM_URLENCODED).body(BodyInserters.fromFormData(this.getFormData(objBody)));
				} else if (strContentType.equals(MediaType.TEXT_XML_VALUE)) {
					bs.contentType(MediaType.TEXT_XML).bodyValue(objBody);
				} else {
					throw new Exception(String.format("未支持的内容类型[%1$s]", strContentType));
				}
			}
			Mono<ResponseEntity<T>> mono = s.retrieve().toEntity(cls);
			ResponseEntity<T> entity = mono.block();

			if (entity.getStatusCodeValue() < 200 || entity.getStatusCodeValue() >= 300) {
				throw createWebClientResponseException(entity.getStatusCodeValue(), null, entity.getHeaders(), entity.getBody());
			}

			return new WebClientRep<T>(entity.getBody(), (entity.getHeaders() == null) ? null : entity.getHeaders());
		} catch (Throwable ex) {
			if (ex instanceof WebClientResponseException) {
				WebClientResponseException webClientResponseException = (WebClientResponseException) ex;
				throw new SubSysServiceAPIRuntimeException(this.getSystemRuntime(), this.getSubSysServiceAPIRuntime(), webClientResponseException.getRawStatusCode(), getExceptionMessage(webClientResponseException), ex);
			}
			throw new SystemRuntimeException(this.getSystemRuntime(), this.getSubSysServiceAPIRuntime(), String.format("请求发生异常，%1$s", ex.getMessage()), ex);
		}
	}

	@Override
	protected <T> IWebClientRep<T> onDelete(String strUri, Map<String, ?> uriParams, Map<String, ?> headers, Map<String, ?> queries, Class<T> cls, Object objTag) throws Throwable {
		try {
			if (queries != null) {
				String strQueryParam = getUrlParams(queries, false);
				if (StringUtils.hasLength(strQueryParam)) {
					if (strUri.indexOf("?") == -1) {
						strUri += "?";
					} else {
						strUri += "&";
					}
					strUri += strQueryParam;
				}
			}

			removeInvalidUriParams(strUri, uriParams);

			RequestHeadersSpec<?> s = null;
			if (uriParams != null) {
				s = getWebClient(strUri).delete().uri(strUri, uriParams);
			} else {
				s = getWebClient(strUri).delete().uri(strUri);
			}

			if (headers != null) {
				for (String strHeader : headers.keySet()) {
					s.header(strHeader, (String) headers.get(strHeader));
				}
			}
			Map<String, ?> globalHeaders = this.getHeaders();
			if (globalHeaders != null) {
				for (String strHeader : globalHeaders.keySet()) {
					s.header(strHeader, (String) globalHeaders.get(strHeader));
				}
			}
			Mono<ResponseEntity<T>> mono = s.retrieve().toEntity(cls);
			ResponseEntity<T> entity = mono.block();

			if (entity.getStatusCodeValue() < 200 || entity.getStatusCodeValue() >= 300) {
				throw createWebClientResponseException(entity.getStatusCodeValue(), null, entity.getHeaders(), entity.getBody());
			}

			return new WebClientRep<T>(entity.getBody(), (entity.getHeaders() == null) ? null : entity.getHeaders());
		} catch (Throwable ex) {
			if (ex instanceof WebClientResponseException) {
				WebClientResponseException webClientResponseException = (WebClientResponseException) ex;
				throw new SubSysServiceAPIRuntimeException(this.getSystemRuntime(), this.getSubSysServiceAPIRuntime(), webClientResponseException.getRawStatusCode(), getExceptionMessage(webClientResponseException), ex);
			}
			throw new SystemRuntimeException(this.getSystemRuntime(), this.getSubSysServiceAPIRuntime(), String.format("请求发生异常，%1$s", ex.getMessage()), ex);
		}
	}

	@Override
	protected IWebClientRep<?> onUpload(String strUri, Map<String, ?> uriParams, Map<String, ?> headers, Map<String, ?> queries, Object objFile, Object objTag) throws Throwable {
		try {
			if (queries != null) {
				String strQueryParam = getUrlParams(queries, false);
				if (StringUtils.hasLength(strQueryParam)) {
					if (strUri.indexOf("?") == -1) {
						strUri += "?";
					} else {
						strUri += "&";
					}
					strUri += strQueryParam;
				}
			}

			HttpEntity<?> fileEntity = null;

			if (objFile instanceof java.io.File) {
				fileEntity = new HttpEntity<>(new FileSystemResource((java.io.File) objFile));
			} else if (objFile instanceof java.io.InputStream) {
				fileEntity = new HttpEntity<>(new InputStreamResource((java.io.InputStream) objFile));
			} else
				throw new Exception("无法识别的文件对象");

			MultiValueMap<String, Object> parts = new LinkedMultiValueMap<>();
			parts.add("file", fileEntity);

			removeInvalidUriParams(strUri, uriParams);

			RequestHeadersSpec<?> s = null;
			if (uriParams != null) {
				s = getWebClient(strUri).post().uri(strUri, uriParams);
			} else {
				s = getWebClient(strUri).post().uri(strUri);
			}

			if (headers != null) {
				for (String strHeader : headers.keySet()) {
					s.header(strHeader, (String) headers.get(strHeader));
				}
			}
			Map<String, ?> globalHeaders = this.getHeaders();
			if (globalHeaders != null) {
				for (String strHeader : globalHeaders.keySet()) {
					s.header(strHeader, (String) globalHeaders.get(strHeader));
				}
			}

			Mono<ResponseEntity<String>> mono = ((RequestBodySpec) s).contentType(MediaType.MULTIPART_FORM_DATA).body(BodyInserters.fromMultipartData(parts)).retrieve().toEntity(String.class);

			ResponseEntity<String> entity = mono.block();

			if (entity.getStatusCodeValue() < 200 || entity.getStatusCodeValue() >= 300) {
				throw createWebClientResponseException(entity.getStatusCodeValue(), null, entity.getHeaders(), entity.getBody());
			}

			return new WebClientRep<String>(entity.getBody(), (entity.getHeaders() == null) ? null : entity.getHeaders());
		} catch (Throwable ex) {
			if (ex instanceof WebClientResponseException) {
				WebClientResponseException webClientResponseException = (WebClientResponseException) ex;
				throw new SubSysServiceAPIRuntimeException(this.getSystemRuntime(), this.getSubSysServiceAPIRuntime(), webClientResponseException.getRawStatusCode(), getExceptionMessage(webClientResponseException), ex);
			}
			throw new SystemRuntimeException(this.getSystemRuntime(), this.getSubSysServiceAPIRuntime(), String.format("上传文件发生异常，%1$s", ex.getMessage()), ex);
		}
	}

	@Override
	protected IWebClientRep<?> onDownload(String strUri, Map<String, ?> uriParams, Map<String, ?> headers, Map<String, ?> queries, Object objFile, Object objTag) throws Throwable {
		try {
			// 1. 处理 URL 参数
			if (queries != null) {
				String strQueryParam = getUrlParams(queries, false);
				if (StringUtils.hasLength(strQueryParam)) {
					if (strUri.indexOf("?") == -1) {
						strUri += "?";
					} else {
						strUri += "&";
					}
					strUri += strQueryParam;
				}
			}

			// 2. 解析输出目标对象
			boolean bReturnTempFile = false;
			java.io.File file = null;
			java.io.OutputStream outputStream = null;
			// 使用 final 变量以便在 Lambda 中使用
			final HttpServletResponse httpServletResponse;

			if (objFile instanceof java.io.File) {
				file = (java.io.File) objFile;
				httpServletResponse = null;
			} else if (objFile instanceof java.io.OutputStream) {
				outputStream = (java.io.OutputStream) objFile;
				httpServletResponse = null;
			} else if (objFile instanceof HttpServletResponse) {
				httpServletResponse = (HttpServletResponse) objFile;
				outputStream = httpServletResponse.getOutputStream();
			} else {
				//throw new Exception("无法识别的文件输出对象");
				httpServletResponse = null;
				bReturnTempFile = true;
			}

			// 3. 处理 file:// 协议
			if (strUri.startsWith("file://")) {
				String localPath = strUri.substring(7);
				java.nio.file.Path sourcePath = java.nio.file.Paths.get(localPath);

				if (!java.nio.file.Files.exists(sourcePath)) {
					throw new Exception("文件不存在: " + localPath);
				}

				if (file != null) {
					java.nio.file.Files.copy(sourcePath, file.toPath(), java.nio.file.StandardCopyOption.REPLACE_EXISTING);
				} else if (outputStream != null) {
					java.nio.file.Files.copy(sourcePath, outputStream);
				}
				else {
					net.ibizsys.runtime.util.domain.File fileItem = new net.ibizsys.runtime.util.domain.File();
					fileItem.setLocalPath(sourcePath.toFile().getCanonicalPath());
					fileItem.setFileName(sourcePath.getFileName().toString());
					return new WebClientRep<net.ibizsys.runtime.util.domain.File>(fileItem, null);
				}
				return new WebClientRep<String>(sourcePath.getFileName().toString(), null);
			}

			removeInvalidUriParams(strUri, uriParams);

			// 4. 构建请求
			RequestHeadersSpec<?> s = null;
			if (uriParams != null) {
				s = getWebClient(strUri).get().uri(strUri, uriParams);
			} else {
				s = getWebClient(strUri).get().uri(strUri);
			}

			// 设置请求头
			if (headers != null) {
				for (String strHeader : headers.keySet()) {
					s.header(strHeader, (String) headers.get(strHeader));
				}
			}
			Map<String, ?> globalHeaders = this.getHeaders();
			if (globalHeaders != null) {
				for (String strHeader : globalHeaders.keySet()) {
					s.header(strHeader, (String) globalHeaders.get(strHeader));
				}
			}

			// 5. 定义状态持有者 (用于在 Lambda 中传递数据)
			final HttpHeaders[] headersHolder = new HttpHeaders[1];
			final Path[] tempFilePathHolder = new Path[1];
			// 用于捕获重定向地址
			final String[] redirectUrlHolder = new String[1];

			// 6. 执行请求与流处理
			s.exchange().flatMapMany(response -> {
				// 保存响应头
				headersHolder[0] = response.headers().asHttpHeaders();

				// 检查状态码
				int statusCode = response.rawStatusCode();

				// 处理重定向 (301, 302, 303, 307, 308)
				if (statusCode >= 300 && statusCode < 400) {
					List<String> locations = response.headers().header("Location");
					if (!ObjectUtils.isEmpty(locations)) {
						String redirectUrl = locations.get(0);
						redirectUrlHolder[0] = redirectUrl; // 记录地址供后续使用

						// 【核心修改点】
						if (httpServletResponse != null) {
							// 情况 A: 目标是 HttpServletResponse -> 直接发送重定向给客户端
							try {
								httpServletResponse.setStatus(statusCode);
								httpServletResponse.setHeader("Location", redirectUrl);
								log.debug("检测到重定向，已直接向 HttpServletResponse 发送: " + redirectUrl);
							} catch (Exception e) {
								log.error("设置 HttpServletResponse 重定向失败", e);
							}
							// 终止流，不再下载内容
							return Flux.empty();
						}
						// 情况 B: 目标是 File/OutputStream -> 记录地址后终止流，后续逻辑会处理递归
						else {
							log.debug("检测到重定向，将在后续逻辑中递归下载: " + redirectUrl);
							return Flux.empty();
						}
					}
				}

				// 如果不是 2xx 且不是上面处理过的重定向，则抛出异常
				if (statusCode < 200 || statusCode >= 300) {
					throw createWebClientResponseException(statusCode, null, response.headers().asHttpHeaders(), null);
				}

				// --- 正常下载逻辑 ---
				FileChannel fileChannel;
				try {
					tempFilePathHolder[0] = Files.createTempFile("download", ".tmp");
					fileChannel = FileChannel.open(tempFilePathHolder[0], StandardOpenOption.CREATE, StandardOpenOption.WRITE);
				} catch (IOException e) {
					return Flux.error(e);
				}

				return response.body(BodyExtractors.toDataBuffers()).doOnNext(dataBuffer -> {
					try {
						fileChannel.write(dataBuffer.asByteBuffer());
						DataBufferUtils.release(dataBuffer);
					} catch (IOException e) {
						throw new RuntimeException("写入数据缓冲区到文件时发生错误", e);
					}
				}).doFinally(signalType -> {
					try {
						fileChannel.close();
					} catch (IOException e) {
						e.printStackTrace();
					}
				});
			}).blockLast();

			// 7. 后处理：根据捕获的状态执行相应逻辑

			// 如果捕获到了重定向地址
			if (redirectUrlHolder[0] != null) {
				if (httpServletResponse != null) {
					// 已经在流中处理过了，直接返回
					return new WebClientRep<String>(null, headersHolder[0]);
				} else {
					// 如果是下载文件模式，递归调用下载重定向后的地址
					return onDownload(redirectUrlHolder[0], null, null, null, objFile, null);
				}
			}

			// 8. 正常文件处理逻辑
			String strFileName = null;
			HttpHeaders httpHeaders = headersHolder[0];
			if (httpHeaders != null) {
				List<String> list = httpHeaders.get("Content-Disposition");
				if (!ObjectUtils.isEmpty(list)) {
					strFileName = list.get(0);
					if (strFileName.indexOf("attachment;filename=") == 0) {
						strFileName = strFileName.substring("attachment;filename=".length());
						if(StringUtils.hasLength(strFileName)) {
							if(strFileName.charAt(0) == '"' && strFileName.charAt(strFileName.length() - 1) == '"' ) {
								strFileName = strFileName.substring(1, strFileName.length() -1);
							}
						}
						try {
							strFileName = new String(strFileName.getBytes("iso8859-1"), "utf-8");
						}
						catch (UnsupportedEncodingException ex) {
							log.error(ex);
						}
					}
				}
			}

			if (httpServletResponse != null && StringUtils.hasLength(strFileName)) {
				String strAttachmentFileName = strFileName;
				try {
					strAttachmentFileName = new String(strFileName.getBytes("utf-8"), "iso8859-1");
				} catch (UnsupportedEncodingException ex) {
					log.error(ex);
				}
				httpServletResponse.setHeader("Content-Disposition", "attachment;filename=" + strAttachmentFileName);
			}

			// 只有当 tempFilePathHolder 被赋值（即发生了实际下载），才执行拷贝
			if (tempFilePathHolder[0] != null) {
				File tempFile = tempFilePathHolder[0].toFile();
				if(bReturnTempFile) {
					//建立目录
					File folder = new File(tempFile.getParentFile(), FilenameUtils.getBaseName(tempFile.getName()));
					folder.mkdirs();
					File returnFile = new File(folder, strFileName);
					FileUtils.moveFile(tempFile, returnFile);
					net.ibizsys.runtime.util.domain.File fileItem = new net.ibizsys.runtime.util.domain.File();
					fileItem.setLocalPath(returnFile.getCanonicalPath());
					fileItem.setFileName(returnFile.getName());
					return new WebClientRep<net.ibizsys.runtime.util.domain.File>(fileItem, null);
				}

				Resource resource = new FileSystemResource(tempFile);
				if (file != null) {
					FileUtils.copyInputStreamToFile(resource.getInputStream(), file);
				} else if (outputStream != null) {
					IOUtils.copyLarge(resource.getInputStream(), outputStream);
				}
				try {
					tempFile.delete();
				} catch (Exception e) {
					log.error(e);
				}
			}

			return new WebClientRep<String>(strFileName, httpHeaders);
		} catch (Throwable ex) {
			if (ex instanceof WebClientResponseException) {
				WebClientResponseException webClientResponseException = (WebClientResponseException) ex;
				throw new SubSysServiceAPIRuntimeException(this.getSystemRuntime(), this.getSubSysServiceAPIRuntime(), webClientResponseException.getRawStatusCode(), getExceptionMessage(webClientResponseException), ex);
			}
			throw new SystemRuntimeException(this.getSystemRuntime(), this.getSubSysServiceAPIRuntime(), String.format("下载文件发生异常，%1$s", ex.getMessage()), ex);
		}
	}

	protected MultiValueMap<String, String> getFormData(Object objBody) throws Exception {
		Map<String, ?> map = null;
		if (objBody instanceof Map) {
			map = (Map<String, ?>) objBody;
		} else if (objBody instanceof IEntity) {
			map = ((IEntity) objBody).any();
		} else
			throw new Exception(String.format("无法识别的内容对象"));

		MultiValueMap<String, String> parts = new LinkedMultiValueMap<>();
		if (map != null) {
			for (java.util.Map.Entry<String, ?> entry : map.entrySet()) {
				Object objValue = entry.getValue();
				if (objValue == null) {
					parts.add(entry.getKey(), "");
				} else {
					parts.add(entry.getKey(), objValue.toString());
				}
			}
		}

		return parts;
	}

	/**
	 * Create {@code WebClientResponseException} or an HTTP status specific
	 * subclass.
	 *
	 * @since 5.1
	 */
	public static WebClientResponseException createWebClientResponseException(int statusCode, String statusText, HttpHeaders headers, Object objBody) {
		if (objBody instanceof String) {
			if (!StringUtils.hasLength(statusText)) {
				statusText = (String) objBody;
			}
			return WebClientResponseException.create(statusCode, statusText, headers, ((String) objBody).getBytes(), null);
		}
		return WebClientResponseException.create(statusCode, statusText, headers, null, null);
	}

	protected String getExceptionMessage(WebClientResponseException webClientResponseException) {

		if (!ObjectUtils.isEmpty(webClientResponseException.getResponseBodyAsByteArray())) {

			String strBody;
			try {
				strBody = new String(webClientResponseException.getResponseBodyAsByteArray(), "UTF-8");
			} catch (UnsupportedEncodingException ex) {
				log.error(ex);
				strBody = webClientResponseException.getResponseBodyAsString();
			}
			if (StringUtils.hasLength(strBody)) {
				if (webClientResponseException.getStatusCode().value() >= 400 && webClientResponseException.getStatusCode().value() <= 500) {
					if (strBody.indexOf("{") == 0) {
						try {
							JsonNode jsonNode = MAPPER.readTree(strBody);
							if (jsonNode instanceof ObjectNode) {
								JsonNode messageNode = ((ObjectNode) jsonNode).get("message");
								if (messageNode != null && !messageNode.isNull()) {
									return messageNode.asText();
								}
								return String.format("%1$s", webClientResponseException.getMessage());
							}
						} catch (Exception ex) {
							log.error(ex);
						}
					}
				}
				return strBody;
			}
		}

		return String.format("请求发生异常，%1$s", webClientResponseException.getMessage());
	}

	protected void removeInvalidUriParams(String strUri, Map<String, ?> uriParams) {
		if(ObjectUtils.isEmpty(uriParams)) {
			return;
		}

		if(!ObjectUtils.isEmpty(strUri) && (strUri.indexOf("{") != -1)) {
			//已经存在占位
			return;
		}

		List<String> removeKeyList = new ArrayList<String>();

		int nTotalLen = 0;

		for(java.util.Map.Entry<String, ?> entry : uriParams.entrySet()) {
			Object value = entry.getValue();
			Object simple = DataTypeUtils.asSimple(value);
			if(simple == null) {
				//非简单值，移除
				removeKeyList.remove(entry.getKey());
				continue;
			}

			String strValue = simple.toString();
			if(strValue.length() > 500) {
				removeKeyList.remove(entry.getKey());
				continue;
			}

			nTotalLen += strValue.length();
		}

		for(String key : removeKeyList) {
			uriParams.remove(key);
		}

		if(nTotalLen > 2000) {
			//再次移除超过200的内容
			removeKeyList.clear();
			for(java.util.Map.Entry<String, ?> entry : uriParams.entrySet()) {
				Object value = entry.getValue();
				String strValue = value.toString();
				if(strValue.length() > 200) {
					removeKeyList.remove(entry.getKey());
					continue;
				}
			}

			for(String key : removeKeyList) {
				uriParams.remove(key);
			}
		}
	}
}
