package net.ibizsys.central.plugin.ai.mcp.util;

import java.time.Duration;
import java.util.Collection;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.Supplier;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.fasterxml.jackson.core.type.TypeReference;

import net.ibizsys.central.plugin.ai.mcp.spec.McpSchema;
import net.ibizsys.central.plugin.ai.mcp.spec.McpSession;

/**
 * JDK8 兼容版心跳调度器
 */
public class KeepAliveScheduler {

    private static final Logger logger = LoggerFactory.getLogger(KeepAliveScheduler.class);
    private static final TypeReference<Object> OBJECT_TYPE_REF = new TypeReference<Object>() {};

    private final long initialDelayMillis;
    private final long intervalMillis;
    private final ScheduledExecutorService scheduler;
    private final AtomicBoolean isRunning = new AtomicBoolean(false);
    private final AtomicReference<ScheduledFuture<?>> scheduledFutureRef = new AtomicReference<>();
    private final Supplier<Collection<McpSession>> mcpSessions;

    KeepAliveScheduler(ScheduledExecutorService scheduler, Duration initialDelay, 
                      Duration interval, Supplier<Collection<McpSession>> mcpSessions) {
        this.scheduler = scheduler;
        this.initialDelayMillis = initialDelay.toMillis();
        this.intervalMillis = interval.toMillis();
        this.mcpSessions = mcpSessions;
    }

    public static Builder builder(Supplier<Collection<McpSession>> mcpSessions) {
        return new Builder(mcpSessions);
    }

    /**
     * 启动心跳调度
     */
    public void start() {
        if (this.isRunning.compareAndSet(false, true)) {
            ScheduledFuture<?> future = scheduler.scheduleAtFixedRate(
                this::sendKeepAlivePings,
                initialDelayMillis,
                intervalMillis,
                TimeUnit.MILLISECONDS
            );
            scheduledFutureRef.set(future);
            logger.info("KeepAlive scheduler started");
        } else {
            throw new IllegalStateException("KeepAlive scheduler is already running. Stop it first.");
        }
    }

    /**
     * 发送心跳的核心逻辑
     */
    private void sendKeepAlivePings() {
        try {
            Collection<McpSession> sessions = mcpSessions.get();
            for (McpSession session : sessions) {
                try {
                    session.sendRequest(McpSchema.METHOD_PING, null, OBJECT_TYPE_REF)
                    	.doOnError(e -> {
                            logger.warn("Failed to send keep-alive ping to session {}: {}", session, e.getMessage());
                    	});
//                    	.
//                    	.exceptionally(e -> {
//                            logger.warn("Failed to send keep-alive ping to session {}: {}", session, e.getMessage());
//                            return null;
//                        });
                } catch (Exception e) {
                    logger.warn("Error sending ping to session {}: {}", session, e.getMessage());
                }
            }
        } catch (Exception e) {
            logger.error("KeepAlive scheduler error", e);
            stop(); // 发生未处理异常时停止调度器
        }
    }

    /**
     * 停止心跳调度
     */
    public void stop() {
        if (isRunning.compareAndSet(true, false)) {
            ScheduledFuture<?> future = scheduledFutureRef.getAndSet(null);
            if (future != null) {
                future.cancel(false); // 不中断正在执行的任务
                logger.info("KeepAlive scheduler stopped");
            }
        }
    }

    public boolean isRunning() {
        return this.isRunning.get();
    }

    /**
     * 关闭所有资源
     */
    public void shutdown() {
        stop();
        scheduler.shutdown();
        try {
            if (!scheduler.awaitTermination(5, TimeUnit.SECONDS)) {
                scheduler.shutdownNow();
            }
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            scheduler.shutdownNow();
        }
    }

    /**
     * JDK8 兼容的构建器
     */
    public final static class Builder {
        private ScheduledExecutorService scheduler = Executors.newSingleThreadScheduledExecutor();
        private Duration initialDelay = Duration.ofSeconds(0);
        private Duration interval = Duration.ofSeconds(30);
        private final Supplier<Collection<McpSession>> mcpSessions;

        Builder(Supplier<Collection<McpSession>> mcpSessions) {
            this.mcpSessions = mcpSessions;
        }

        public Builder scheduler(ScheduledExecutorService scheduler) {
            this.scheduler = scheduler;
            return this;
        }

        public Builder initialDelay(Duration initialDelay) {
            this.initialDelay = initialDelay;
            return this;
        }

        public Builder interval(Duration interval) {
            this.interval = interval;
            return this;
        }

        public KeepAliveScheduler build() {
            return new KeepAliveScheduler(scheduler, initialDelay, interval, mcpSessions);
        }
    }
}