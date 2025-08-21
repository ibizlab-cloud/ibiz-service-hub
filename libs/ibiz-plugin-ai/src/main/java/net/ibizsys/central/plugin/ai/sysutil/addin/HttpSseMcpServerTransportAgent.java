package net.ibizsys.central.plugin.ai.sysutil.addin;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;

import javax.servlet.AsyncContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import net.ibizsys.central.plugin.ai.mcp.spec.McpError;
import net.ibizsys.central.plugin.ai.mcp.spec.McpSchema;
import net.ibizsys.central.plugin.ai.mcp.spec.McpServerSession;
import net.ibizsys.central.plugin.ai.mcp.spec.McpServerTransport;
import net.ibizsys.central.plugin.ai.mcp.spec.ProtocolVersions;
import net.ibizsys.central.plugin.ai.mcp.util.KeepAliveScheduler;
import net.ibizsys.runtime.util.JsonUtils;
import net.ibizsys.runtime.util.KeyValueUtils;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public class HttpSseMcpServerTransportAgent extends HttpMcpServerTransportAgentBase {
	
	private static final Logger logger = LoggerFactory.getLogger(HttpSseMcpServerTransportAgent.class);

	public static final String UTF_8 = "UTF-8";

	public static final String APPLICATION_JSON = "application/json";

	public static final String FAILED_TO_SEND_ERROR_RESPONSE = "Failed to send error response: {}";

	/** Default endpoint path for SSE connections */
	public static final String DEFAULT_SSE_ENDPOINT = "/sse";

	/** Event type for regular messages */
	public static final String MESSAGE_EVENT_TYPE = "message";

	/** Event type for endpoint information */
	public static final String ENDPOINT_EVENT_TYPE = "endpoint";

	public static final String DEFAULT_BASE_URL = "";

	/** JSON object mapper for serialization/deserialization */
	//private final ObjectMapper objectMapper;
	private final ObjectMapper objectMapper = JsonUtils.MAPPER;

	/** Base URL for the server transport */
	//private final String baseUrl;

	/** The endpoint path for handling client messages */
	private final String messageEndpoint = "/message";

	/** The endpoint path for handling SSE connections */
	private final String sseEndpoint = "/sse";

	/** Map of active client sessions, keyed by session ID */
	private final Map<String, McpServerSession> sessions = new ConcurrentHashMap<String, McpServerSession>();

	/** Flag indicating if the transport is in the process of shutting down */
	private final AtomicBoolean isClosing = new AtomicBoolean(false);

	/** Session factory for creating new sessions */
	private McpServerSession.Factory sessionFactory;

	/**
	 * Keep-alive scheduler for managing session pings. Activated if keepAliveInterval is
	 * set. Disabled by default.
	 */
	private KeepAliveScheduler keepAliveScheduler;

//	@Deprecated
//    public HttpServletSseServerTransportProvider(ObjectMapper objectMapper, String messageEndpoint, String sseEndpoint) {
//        this(objectMapper, DEFAULT_BASE_URL, messageEndpoint, sseEndpoint);
//    }
//
//    @Deprecated
//    public HttpServletSseServerTransportProvider(ObjectMapper objectMapper, String baseUrl, String messageEndpoint, String sseEndpoint) {
//        this(objectMapper, baseUrl, messageEndpoint, sseEndpoint, null);
//    }
//
//    @Deprecated
//    public HttpServletSseServerTransportProvider(ObjectMapper objectMapper, String baseUrl, String messageEndpoint, String sseEndpoint, Duration keepAliveInterval) {
//        this.objectMapper = objectMapper;
//        this.baseUrl = baseUrl;
//        this.messageEndpoint = messageEndpoint;
//        this.sseEndpoint = sseEndpoint;
//
//        if (keepAliveInterval != null) {
//            this.keepAliveScheduler = KeepAliveScheduler
//                .builder(() -> (isClosing.get()) ? Flux.empty() : Flux.fromIterable(sessions.values()))
//                .initialDelay(keepAliveInterval)
//                .interval(keepAliveInterval)
//                .build();
//            this.keepAliveScheduler.start();
//        }
//    }
    
    @Override
    protected void onStart() throws Exception {
//    	if (keepAliveInterval != null) {
//            this.keepAliveScheduler = KeepAliveScheduler
//                .builder(() -> (isClosing.get()) ? Flux.empty() : Flux.fromIterable(sessions.values()))
//                .initialDelay(keepAliveInterval)
//                .interval(keepAliveInterval)
//                .build();
//            this.keepAliveScheduler.start();
//        }
    	super.onStart();
    }

    @Override
    public List<String> protocolVersions() {
        return Arrays.asList(ProtocolVersions.MCP_2024_11_05); // JDK8兼容修改
    }

//    public HttpServletSseServerTransportProvider(ObjectMapper objectMapper, String messageEndpoint) {
//        this(objectMapper, messageEndpoint, DEFAULT_SSE_ENDPOINT);
//    }

    @Override
    public void setSessionFactory(McpServerSession.Factory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    @Override
    public Mono<Void> notifyClients(String method, Object params) {
        if (sessions.isEmpty()) {
            logger.debug("No active sessions to broadcast message to");
            return Mono.empty();
        }
        logger.debug("Attempting to broadcast message to {} active sessions", sessions.size());
        return Flux.fromIterable(sessions.values())
            .flatMap(session -> session.sendNotification(method, params)
                .doOnError(e -> logger.error("Failed to send message to session {}: {}", session.getId(), e.getMessage()))
              //.onErrorComplete())
                .onErrorResume(e -> Mono.empty())) // 转为完成信号
            .then();
    }

    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        String requestURI = request.getRequestURI();
        if (!requestURI.endsWith(sseEndpoint)) {
            response.sendError(HttpServletResponse.SC_NOT_FOUND);
            return;
        }
        if (isClosing.get()) {
            response.sendError(HttpServletResponse.SC_SERVICE_UNAVAILABLE, "Server is shutting down");
            return;
        }
        response.setContentType("text/event-stream");
        response.setCharacterEncoding(UTF_8);
        response.setHeader("Cache-Control", "no-cache");
        response.setHeader("Connection", "keep-alive");
        response.setHeader("Access-Control-Allow-Origin", "*");
        //String sessionId = UUID.randomUUID().toString();
        String sessionId = KeyValueUtils.genUniqueId();
        AsyncContext asyncContext = request.startAsync();
        asyncContext.setTimeout(0);
        PrintWriter writer = response.getWriter();
        HttpServletMcpSessionTransport sessionTransport = new HttpServletMcpSessionTransport(sessionId, asyncContext, writer);
        McpServerSession session = sessionFactory.create(sessionTransport);
        this.sessions.put(sessionId, session);
        this.sendEvent(writer, ENDPOINT_EVENT_TYPE, this.getContext().getBaseUrl() + this.messageEndpoint + "?sessionId=" + sessionId);
    }

    @Override
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        if (isClosing.get()) {
            response.sendError(HttpServletResponse.SC_SERVICE_UNAVAILABLE, "Server is shutting down");
            return;
        }
        String requestURI = request.getRequestURI();
        if (!requestURI.endsWith(messageEndpoint)) {
            response.sendError(HttpServletResponse.SC_NOT_FOUND);
            return;
        }
        String sessionId = request.getParameter("sessionId");
        if (sessionId == null) {
            response.setContentType(APPLICATION_JSON);
            response.setCharacterEncoding(UTF_8);
            response.setStatus(HttpServletResponse.SC_BAD_REQUEST);
            String jsonError = objectMapper.writeValueAsString(new McpError("Session ID missing in message endpoint")); // JDK8兼容修改
            PrintWriter writer = response.getWriter();
            writer.write(jsonError);
            writer.flush();
            return;
        }
        McpServerSession session = sessions.get(sessionId);
        if (session == null) {
            response.setContentType(APPLICATION_JSON);
            response.setCharacterEncoding(UTF_8);
            response.setStatus(HttpServletResponse.SC_NOT_FOUND);
            String jsonError = objectMapper.writeValueAsString(new McpError("Session not found: " + sessionId)); // JDK8兼容修改
            PrintWriter writer = response.getWriter();
            writer.write(jsonError);
            writer.flush();
            return;
        }
        try {
            BufferedReader reader = request.getReader();
            StringBuilder body = new StringBuilder();
            String line;
            while ((line = reader.readLine()) != null) {
                body.append(line);
            }
            McpSchema.JSONRPCMessage message = McpSchema.deserializeJsonRpcMessage(objectMapper, body.toString());
            session.handle(message).block(); // Block for Servlet compatibility
            response.setStatus(HttpServletResponse.SC_OK);
        } catch (Exception e) {
            logger.error("Error processing message: {}", e.getMessage());
            try {
                McpError mcpError = new McpError(e.getMessage());
                response.setContentType(APPLICATION_JSON);
                response.setCharacterEncoding(UTF_8);
                response.setStatus(HttpServletResponse.SC_INTERNAL_SERVER_ERROR);
                String jsonError = objectMapper.writeValueAsString(mcpError); // JDK8兼容修改
                PrintWriter writer = response.getWriter();
                writer.write(jsonError);
                writer.flush();
            } catch (IOException ex) {
                logger.error(FAILED_TO_SEND_ERROR_RESPONSE, ex.getMessage());
                response.sendError(HttpServletResponse.SC_INTERNAL_SERVER_ERROR, "Error processing message");
            }
        }
    }

    @Override
    public Mono<Void> closeGracefully() {
        isClosing.set(true);
        logger.debug("Initiating graceful shutdown with {} active sessions", sessions.size());
        return Flux.fromIterable(sessions.values())
            .flatMap(McpServerSession::closeGracefully)
            .then()
            .doOnSuccess(v -> {
                sessions.clear();
                logger.debug("Graceful shutdown completed");
                if (this.keepAliveScheduler != null) {
                    this.keepAliveScheduler.shutdown();
                }
            });
    }

    private void sendEvent(PrintWriter writer, String eventType, String data) throws IOException {
        writer.write("event: " + eventType + "\n");
        writer.write("data: " + data + "\n\n");
        writer.flush();
        if (writer.checkError()) {
            throw new IOException("Client disconnected");
        }
    }

//    @Override
//    public void destroy() {
//        closeGracefully().block();
//        super.destroy();
//    }
    
    @Override
    protected void onStop() throws Exception {
    	 closeGracefully().block();
    	super.onStop();
    }

    private final class HttpServletMcpSessionTransport implements McpServerTransport {
        private final String sessionId;
        private final AsyncContext asyncContext;
        private final PrintWriter writer;

        HttpServletMcpSessionTransport(String sessionId, AsyncContext asyncContext, PrintWriter writer) {
            this.sessionId = sessionId;
            this.asyncContext = asyncContext;
            this.writer = writer;
            logger.debug("Session transport {} initialized with SSE writer", sessionId);
        }

        @Override
        public Mono<Void> sendMessage(McpSchema.JSONRPCMessage message) {
            return Mono.fromRunnable(() -> {
                try {
                    String jsonText = objectMapper.writeValueAsString(message);
                    sendEvent(writer, MESSAGE_EVENT_TYPE, jsonText);
                    logger.debug("Message sent to session {}\r\n{} ", sessionId, jsonText);
                } catch (Exception e) {
                    logger.error("Failed to send message to session {}: {}", sessionId, e.getMessage());
                    sessions.remove(sessionId);
                    asyncContext.complete();
                }
            });
        }

        @Override
        public <T> T unmarshalFrom(Object data, TypeReference<T> typeRef) {
            return objectMapper.convertValue(data, typeRef);
        }

        @Override
        public Mono<Void> closeGracefully() {
            return Mono.fromRunnable(() -> {
                logger.debug("Closing session transport: {}", sessionId);
                try {
                    sessions.remove(sessionId);
                    asyncContext.complete();
                    logger.debug("Successfully completed async context for session {}", sessionId);
                } catch (Exception e) {
                    logger.warn("Failed to complete async context for session {}: {}", sessionId, e.getMessage());
                }
            });
        }

        @Override
        public void close() {
            try {
                sessions.remove(sessionId);
                asyncContext.complete();
                logger.debug("Successfully completed async context for session {}", sessionId);
            } catch (Exception e) {
                logger.warn("Failed to complete async context for session {}: {}", sessionId, e.getMessage());
            }
        }
    }

}
