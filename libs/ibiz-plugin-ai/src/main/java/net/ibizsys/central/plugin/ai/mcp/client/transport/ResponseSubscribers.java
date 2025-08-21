package net.ibizsys.central.plugin.ai.mcp.client.transport;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.LongConsumer;
import java.util.regex.Pattern;

import org.apache.http.HttpResponse;
import org.reactivestreams.Subscription;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import net.ibizsys.central.plugin.ai.mcp.spec.McpTransportException;
import reactor.core.Disposable;
import reactor.core.publisher.BaseSubscriber;
import reactor.core.publisher.FluxSink;

/**
 * Utility class providing various subscriber implementations for handling
 * different types of HTTP response bodies in the context of Model Context Protocol (MCP)
 * clients.
 *
 * <p>
 * Defines subscribers for processing Server-Sent Events (SSE), aggregate responses, and
 * bodiless responses.
 *
 * @author Christian Tzolov
 * @author Dariusz Jędrzejczyk
 */
class ResponseSubscribers {

	private static final Logger logger = LoggerFactory.getLogger(ResponseSubscribers.class);

	static class SseEvent {
		private final String id;
		private final String event;
		private final String data;

		public SseEvent(String id, String event, String data) {
			this.id = id;
			this.event = event;
			this.data = data;
		}

		public String id() {
			return id;
		}

		public String event() {
			return event;
		}

		public String data() {
			return data;
		}

		@Override
		public String toString() {
			return "SseEvent{" +
					"id='" + id + '\'' +
					", event='" + event + '\'' +
					", data='" + data + '\'' +
					'}';
		}
	}

	interface ResponseEvent {
		HttpResponse responseInfo();
	}

	static class DummyEvent implements ResponseEvent {
		private final HttpResponse responseInfo;

		public DummyEvent(HttpResponse responseInfo) {
			this.responseInfo = responseInfo;
		}

		@Override
		public HttpResponse responseInfo() {
			return responseInfo;
		}
	}

	static class SseResponseEvent implements ResponseEvent {
		private final HttpResponse responseInfo;
		private final SseEvent sseEvent;

		public SseResponseEvent(HttpResponse responseInfo, SseEvent sseEvent) {
			this.responseInfo = responseInfo;
			this.sseEvent = sseEvent;
		}

		@Override
		public HttpResponse responseInfo() {
			return responseInfo;
		}

		public SseEvent sseEvent() {
			return sseEvent;
		}
	}

	static class AggregateResponseEvent implements ResponseEvent {
		private final HttpResponse responseInfo;
		private final String data;

		public AggregateResponseEvent(HttpResponse responseInfo, String data) {
			this.responseInfo = responseInfo;
			this.data = data;
		}

		@Override
		public HttpResponse responseInfo() {
			return responseInfo;
		}

		public String data() {
			return data;
		}
	}

	/**
	 * Creates a SSE stream processor that reads from the input stream and emits events.
	 * @param response the HTTP response
	 * @param sink the flux sink to emit events to
	 * @return a runnable that processes the SSE stream
	 */
	static Runnable sseToBodySubscriber(HttpResponse response, FluxSink<ResponseEvent> sink) {
		return new SseStreamProcessor(response, sink);
	}

	/**
	 * Creates an aggregate response processor that reads the entire response body.
	 * @param response the HTTP response
	 * @param sink the flux sink to emit events to
	 * @return a runnable that processes the response
	 */
	static Runnable aggregateBodySubscriber(HttpResponse response, FluxSink<ResponseEvent> sink) {
		return new AggregateStreamProcessor(response, sink);
	}

	/**
	 * Creates a bodiless response processor.
	 * @param response the HTTP response
	 * @param sink the flux sink to emit events to
	 * @return a runnable that processes the response
	 */
	static Runnable bodilessBodySubscriber(HttpResponse response, FluxSink<ResponseEvent> sink) {
		return new BodilessStreamProcessor(response, sink);
	}

	static class SseStreamProcessor implements Runnable {
		private final HttpResponse response;
		private final FluxSink<ResponseEvent> sink;

		public SseStreamProcessor(HttpResponse response, FluxSink<ResponseEvent> sink) {
			this.response = response;
			this.sink = sink;
		}

		@Override
		public void run() {
			try {
				InputStream inputStream = response.getEntity().getContent();
				BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream));
				
				SseLineSubscriber subscriber = new SseLineSubscriber(response, sink);
				subscriber.onSubscribe(new Subscription() {
					@Override
					public void request(long n) {
						// No-op for this implementation
					}

					@Override
					public void cancel() {
						try {
							reader.close();
						} catch (IOException e) {
							logger.warn("Error closing reader", e);
						}
					}
				});

				String line;
				while ((line = reader.readLine()) != null) {
					subscriber.onNext(line);
				}
				subscriber.onComplete();
				
			} catch (Exception e) {
				sink.error(e);
			}
		}
	}

	static class AggregateStreamProcessor implements Runnable {
		private final HttpResponse response;
		private final FluxSink<ResponseEvent> sink;

		public AggregateStreamProcessor(HttpResponse response, FluxSink<ResponseEvent> sink) {
			this.response = response;
			this.sink = sink;
		}

		@Override
		public void run() {
			try {
				InputStream inputStream = response.getEntity().getContent();
				BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream));
				
				AggregateSubscriber subscriber = new AggregateSubscriber(response, sink);
				subscriber.onSubscribe(new Subscription() {
					@Override
					public void request(long n) {
						// No-op for this implementation
					}

					@Override
					public void cancel() {
						try {
							reader.close();
						} catch (IOException e) {
							logger.warn("Error closing reader", e);
						}
					}
				});

				String line;
				StringBuilder builder = new StringBuilder();
				while ((line = reader.readLine()) != null) {
					builder.append(line).append("\n");
				}
				subscriber.onNext(builder.toString());
				subscriber.onComplete();
				
			} catch (Exception e) {
				sink.error(e);
			}
		}
	}

	static class BodilessStreamProcessor implements Runnable {
		private final HttpResponse response;
		private final FluxSink<ResponseEvent> sink;

		public BodilessStreamProcessor(HttpResponse response, FluxSink<ResponseEvent> sink) {
			this.response = response;
			this.sink = sink;
		}

		@Override
		public void run() {
			try {
				BodilessResponseLineSubscriber subscriber = new BodilessResponseLineSubscriber(response, sink);
				subscriber.onSubscribe(new Subscription() {
					@Override
					public void request(long n) {
						// No-op for this implementation
					}

					@Override
					public void cancel() {
						// No resources to close
					}
				});
				subscriber.onComplete();
				
			} catch (Exception e) {
				sink.error(e);
			}
		}
	}

	static class SseLineSubscriber extends BaseSubscriber<String> {

		/**
		 * Pattern to extract data content from SSE "data:" lines.
		 */
		private static final Pattern EVENT_DATA_PATTERN = Pattern.compile("^data:(.+)$", Pattern.MULTILINE);

		/**
		 * Pattern to extract event ID from SSE "id:" lines.
		 */
		private static final Pattern EVENT_ID_PATTERN = Pattern.compile("^id:(.+)$", Pattern.MULTILINE);

		/**
		 * Pattern to extract event type from SSE "event:" lines.
		 */
		private static final Pattern EVENT_TYPE_PATTERN = Pattern.compile("^event:(.+)$", Pattern.MULTILINE);

		/**
		 * The sink for emitting parsed response events.
		 */
		private final FluxSink<ResponseEvent> sink;

		/**
		 * StringBuilder for accumulating multi-line event data.
		 */
		private final StringBuilder eventBuilder;

		/**
		 * Current event's ID, if specified.
		 */
		private final AtomicReference<String> currentEventId;

		/**
		 * Current event's type, if specified.
		 */
		private final AtomicReference<String> currentEventType;

		/**
		 * The response information from the HTTP response. Send with each event to
		 * provide context.
		 */
		private HttpResponse responseInfo;

		/**
		 * Creates a new LineSubscriber that will emit parsed SSE events to the provided
		 * sink.
		 * @param sink the {@link FluxSink} to emit parsed {@link ResponseEvent} objects
		 * to
		 */
		public SseLineSubscriber(HttpResponse responseInfo, FluxSink<ResponseEvent> sink) {
			this.sink = sink;
			this.eventBuilder = new StringBuilder();
			this.currentEventId = new AtomicReference<>();
			this.currentEventType = new AtomicReference<>();
			this.responseInfo = responseInfo;
		}

		@Override
		protected void hookOnSubscribe(Subscription subscription) {
			sink.onRequest(new LongConsumer() {
				@Override
				public void accept(long n) {
					// No-op for this implementation
				}
			});

			// Register disposal callback to cancel subscription when Flux is disposed
			sink.onDispose(new Disposable() {
				@Override
				public void dispose() {
					subscription.cancel();
				}
			});
		}

		@Override
		protected void hookOnNext(String line) {
			if (line.isEmpty()) {
				// Empty line means end of event
				if (this.eventBuilder.length() > 0) {
					String eventData = this.eventBuilder.toString();
					SseEvent sseEvent = new SseEvent(currentEventId.get(), currentEventType.get(), eventData.trim());

					this.sink.next(new SseResponseEvent(responseInfo, sseEvent));
					this.eventBuilder.setLength(0);
				}
			}
			else {
				if (line.startsWith("data:")) {
					java.util.regex.Matcher matcher = EVENT_DATA_PATTERN.matcher(line);
					if (matcher.find()) {
						this.eventBuilder.append(matcher.group(1).trim()).append("\n");
					}
				}
				else if (line.startsWith("id:")) {
					java.util.regex.Matcher matcher = EVENT_ID_PATTERN.matcher(line);
					if (matcher.find()) {
						this.currentEventId.set(matcher.group(1).trim());
					}
				}
				else if (line.startsWith("event:")) {
					java.util.regex.Matcher matcher = EVENT_TYPE_PATTERN.matcher(line);
					if (matcher.find()) {
						this.currentEventType.set(matcher.group(1).trim());
					}
				}
				else if (line.startsWith(":")) {
					// Ignore comment lines starting with ":"
					// This is a no-op, just to skip comments
					logger.debug("Ignoring comment line: {}", line);
				}
				else {
					// If the response is not successful, emit an error
					this.sink.error(new McpTransportException(
							"Invalid SSE response. Status code: " + this.responseInfo.getStatusLine().getStatusCode() + " Line: " + line));
				}
			}
		}

		@Override
		protected void hookOnComplete() {
			if (this.eventBuilder.length() > 0) {
				String eventData = this.eventBuilder.toString();
				SseEvent sseEvent = new SseEvent(currentEventId.get(), currentEventType.get(), eventData.trim());
				this.sink.next(new SseResponseEvent(responseInfo, sseEvent));
			}
			this.sink.complete();
		}

		@Override
		protected void hookOnError(Throwable throwable) {
			this.sink.error(throwable);
		}
	}

	static class AggregateSubscriber extends BaseSubscriber<String> {

		/**
		 * The sink for emitting parsed response events.
		 */
		private final FluxSink<ResponseEvent> sink;

		/**
		 * StringBuilder for accumulating multi-line event data.
		 */
		private final StringBuilder eventBuilder;

		/**
		 * The response information from the HTTP response. Send with each event to
		 * provide context.
		 */
		private HttpResponse responseInfo;

		/**
		 * Creates a new JsonLineSubscriber that will emit parsed JSON-RPC messages.
		 * @param sink the {@link FluxSink} to emit parsed {@link ResponseEvent} objects
		 * to
		 */
		public AggregateSubscriber(HttpResponse responseInfo, FluxSink<ResponseEvent> sink) {
			this.sink = sink;
			this.eventBuilder = new StringBuilder();
			this.responseInfo = responseInfo;
		}

		@Override
		protected void hookOnSubscribe(Subscription subscription) {
			sink.onRequest(new LongConsumer() {
				@Override
				public void accept(long n) {
					// No-op for this implementation
				}
			});

			// Register disposal callback to cancel subscription when Flux is disposed
			sink.onDispose(new Disposable() {
				

				@Override
				public void dispose() {
					subscription.cancel();
				}
			});
		}

		@Override
		protected void hookOnNext(String line) {
			this.eventBuilder.append(line).append("\n");
		}

		@Override
		protected void hookOnComplete() {
			String data = this.eventBuilder.toString();
			this.sink.next(new AggregateResponseEvent(responseInfo, data));
			this.sink.complete();
		}

		@Override
		protected void hookOnError(Throwable throwable) {
			this.sink.error(throwable);
		}
	}

	static class BodilessResponseLineSubscriber extends BaseSubscriber<String> {

		/**
		 * The sink for emitting parsed response events.
		 */
		private final FluxSink<ResponseEvent> sink;

		private final HttpResponse responseInfo;

		public BodilessResponseLineSubscriber(HttpResponse responseInfo, FluxSink<ResponseEvent> sink) {
			this.sink = sink;
			this.responseInfo = responseInfo;
		}

		@Override
		protected void hookOnSubscribe(Subscription subscription) {
			sink.onRequest(new LongConsumer() {
				@Override
				public void accept(long n) {
					// No-op for this implementation
				}
			});

			// Register disposal callback to cancel subscription when Flux is disposed
			sink.onDispose(new Disposable() {
				

				@Override
				public void dispose() {
					subscription.cancel();
				}
			});
		}

		@Override
		protected void hookOnComplete() {
			// emit dummy event to be able to inspect the response info
			// this is a shortcut allowing for a more streamlined processing using
			// operator composition instead of having to deal with the CompletableFuture
			// along the Subscriber for inspecting the result
			this.sink.next(new DummyEvent(responseInfo));
			this.sink.complete();
		}

		@Override
		protected void hookOnError(Throwable throwable) {
			this.sink.error(throwable);
		}
	}
}
