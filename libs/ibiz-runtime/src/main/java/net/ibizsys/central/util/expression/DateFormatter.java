package net.ibizsys.central.util.expression;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.concurrent.ConcurrentHashMap;

public class DateFormatter {

	// 缓存 DateTimeFormatter（用于 Java 8 时间）
	private static final ConcurrentHashMap<String, DateTimeFormatter> DTF_CACHE = new ConcurrentHashMap<>();

	// 默认时区（系统默认）
	private static final ZoneId DEFAULT_ZONE = ZoneId.systemDefault();

	/**
	 * 使用当前时间，按指定 pattern 格式化
	 */
	public String format(String pattern) {
		return format(LocalDateTime.now(), pattern);
	}

	/**
	 * 格式化指定的日期对象（支持 Date, LocalDateTime, Instant, ZonedDateTime, LocalDate 等）
	 */
	public String format(Object date, String pattern) {
		if (date == null) {
			return null;
		}
		// 统一转换为 LocalDateTime
		LocalDateTime dateTime = toLocalDateTime(date);
		if (dateTime == null) {
			// 若无法转换，返回 toString
			return date.toString();
		}
		return DTF_CACHE.computeIfAbsent(pattern, DateTimeFormatter::ofPattern).format(dateTime);
	}

	private LocalDateTime toLocalDateTime(Object date) {
		if (date instanceof LocalDateTime) {
			return (LocalDateTime) date;
		} else if (date instanceof LocalDate) {
			return ((LocalDate) date).atStartOfDay();
		} else if (date instanceof ZonedDateTime) {
			return ((ZonedDateTime) date).toLocalDateTime();
		} else if (date instanceof Instant) {
			return LocalDateTime.ofInstant((Instant) date, DEFAULT_ZONE);
		} else if (date instanceof Date) {
			return LocalDateTime.ofInstant(((Date) date).toInstant(), DEFAULT_ZONE);
		} else if (date instanceof Long) {
			// 支持时间戳（毫秒）
			return LocalDateTime.ofInstant(Instant.ofEpochMilli((Long) date), DEFAULT_ZONE);
		}
		return null; // 不支持的类型
	}
}
