package cn.ibizlab.runner.servicerunner.appender;

import ch.qos.logback.classic.spi.ILoggingEvent;
import ch.qos.logback.core.filter.Filter;
import ch.qos.logback.core.spi.FilterReply;

import java.util.Arrays;
import java.util.List;
import java.util.regex.Pattern;

/**
 * logback日志过滤器：预先设置忽略日志输出关键字，logback日志输出前校验判断是否忽略输出日志内容
 */
public class LogStopWordsFilter extends Filter<ILoggingEvent> {

    private static final Pattern pattern = Pattern.compile("[,;]");
    private List<String> stopWords = null;

    @Override
    public FilterReply decide(ILoggingEvent event) {
        if (stopWords == null || stopWords.isEmpty()) {
            return FilterReply.NEUTRAL;
        }
        String message = event.getMessage();
        if (message != null) {
            for (String word : stopWords) {
                if (message.contains(word)) {
                    return FilterReply.DENY; // 拒绝记录
                }
            }
        }
        return FilterReply.NEUTRAL; // 其他日志正常处理
    }

    public void setStopWords(String stopWords) {
        this.stopWords = Arrays.asList(pattern.split(stopWords));
    }
}