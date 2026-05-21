package net.ibizsys.central.cloud.core.util;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.regex.Pattern;

/**
 * 文本预处理功能组件
 *
 * @author lionlau
 *
 */
public class TextPreprocessUtils {

    // 空白字符处理（含全角空格）
    public static final Pattern MULTISPACE_PATTERN = Pattern.compile("[\\s\\u3000]+");
    // 换行符
    public static final Pattern LINE_BREAK_PATTERN = Pattern.compile("(\\r?\\n|\\r)+");
    // Script标签（含跨行内容）
    public static final Pattern SCRIPT_TAG_PATTERN = Pattern.compile("<script[^>]*>[\\s\\S]*?</script>", Pattern.CASE_INSENSITIVE);
    // Style标签（含跨行内容）
    public static final Pattern STYLE_TAG_PATTERN = Pattern.compile("<style[^>]*>[\\s\\S]*?</style>", Pattern.CASE_INSENSITIVE);
    // HTML标签
    public static final Pattern HTML_TAG_PATTERN = Pattern.compile("<[^>]+>");
    // Markdown图片: ![alt](url)
    public static final Pattern MD_IMAGE_PATTERN = Pattern.compile("!\\[([^\\]]*)\\]\\(([^)]*)\\)");
    // Markdown链接: [text](url)
    public static final Pattern MD_LINK_PATTERN = Pattern.compile("\\[([^\\]]*)\\]\\(([^)]*)\\)");
    // URL (http/https)
    public static final Pattern URL_PATTERN = Pattern.compile("https?://[^\\s]+");
    // 邮箱
    public static final Pattern EMAIL_PATTERN = Pattern.compile("[\\w.\\-]+@[\\w.\\-]+\\.\\w+");

    /**
     * 合并字符串中的多个连续空格为单个空格
     * @param text 输入文本
     * @return 处理后的文本
     */
    public static String mergeSpaces(String text) {
        if (text == null || text.trim().isEmpty()) {
            return text;
        }
        return MULTISPACE_PATTERN.matcher(text.trim()).replaceAll(" ");
    }

    /**
     * 合并连续换行符为单个换行符
     */
    public static String mergeReturns(String text) {
        if (text == null || text.trim().isEmpty()) {
            return text;
        }
        return LINE_BREAK_PATTERN.matcher(text.trim()).replaceAll("\n");
    }

    /**
     * 移除<script>标签及其内容（含跨行）
     */
    public static String removeScriptTags(String text) {
        if (text == null || text.isEmpty()) {
            return text;
        }
        return SCRIPT_TAG_PATTERN.matcher(text).replaceAll("");
    }

    /**
     * 移除<style>标签及其内容（含跨行）
     */
    public static String removeStyleTags(String text) {
        if (text == null || text.isEmpty()) {
            return text;
        }
        return STYLE_TAG_PATTERN.matcher(text).replaceAll("");
    }

    /**
     * 移除所有HTML标签（保留标签内文本）
     */
    public static String removeHtmlTags(String text) {
        if (text == null || text.isEmpty()) {
            return text;
        }
        return HTML_TAG_PATTERN.matcher(text).replaceAll("");
    }

    /**
     * 移除Markdown图片语法: ![alt](url)
     */
    public static String removeMarkdownImages(String text) {
        if (text == null || text.isEmpty()) {
            return text;
        }
        return MD_IMAGE_PATTERN.matcher(text).replaceAll("");
    }

    /**
     * 移除Markdown链接语法: [text](url)
     */
    public static String removeMarkdownLinks(String text) {
        if (text == null || text.isEmpty()) {
            return text;
        }
        return MD_LINK_PATTERN.matcher(text).replaceAll("");
    }

    /**
     * 移除URL（http/https开头）
     */
    public static String removeUrls(String text) {
        if (text == null || text.isEmpty()) {
            return text;
        }
        return URL_PATTERN.matcher(text).replaceAll("");
    }

    /**
     * 移除电子邮件地址
     */
    public static String removeEmails(String text) {
        if (text == null || text.isEmpty()) {
            return text;
        }
        return EMAIL_PATTERN.matcher(text).replaceAll("");
    }

    /**
     * 标准化标点符号
     */
    public static String normalizePunctuation(String text) {
        if (text == null || text.trim().isEmpty()) {
            return text;
        }
        return text
                .replace("，", ",")
                .replace("。", ".")
                .replace("！", "!")
                .replace("？", "?")
                .replace("；", ";")
                .replace("：", ":")
                .replace("（", "(")
                .replace("）", ")")
                .replace("“", "\"")
                .replace("”", "\"")
                .replace("‘", "'")
                .replace("’", "'");
    }

    /**
     * 根据自定义正则规则进行文本替换
     * @param text 输入文本
     * @param rules 自定义替换规则列表（每个规则包含pattern和replacement）
     * @return 处理后的文本
     */
    public static String maskingRule(String text, LinkedHashMap<String, String> rules) {
        if (text == null || text.trim().isEmpty()) {
            return text;
        }
        if (rules == null || rules.isEmpty()) {
            return text;
        }

        for (Map.Entry<String, String> entry : rules.entrySet()) {
            String pattern = entry.getKey();
            String replacement = entry.getValue();

            if (pattern == null) {
               continue;
            }
            if (replacement == null) {
                replacement = "";
            }

            try {
                text = text.replaceAll(pattern, replacement);
            } catch (Exception e) {
                throw new RuntimeException(String.format("自定义规则脱敏替换失败,%1$s",e.getMessage()));
            }
        }
        return text;
    }

}