package net.ibizsys.central.util.converter;

import java.io.InputStream;
import java.io.OutputStream;
import java.util.Map;

public interface IDocumentConverter {

	/**
	 * 文档转化
	 * @param inputStream
	 * @param outputStream
	 * @return
	 * @throws Throwable
	 */
	default void convert(InputStream inputStream, OutputStream outputStream) throws Throwable{
		convert(inputStream, outputStream, null);
	}
		
	/**
	 * 文档转化
	 * @param inputStream
	 * @param outputStream
	 * @param tryMode
	 * @return
	 * @throws Throwable
	 */
	default void convert(InputStream inputStream, OutputStream outputStream, Map<String, Object> params) throws Throwable{
		convert(inputStream, outputStream, params, false);
	}
	
	/**
	 * 文档转化
	 * @param inputStream
	 * @param outputStream
	 * @param tryMode
	 * @return
	 * @throws Throwable
	 */
	boolean convert(InputStream inputStream, OutputStream outputStream, Map<String, Object> params, boolean tryMode) throws Throwable;
	
	
	
	/**
	 * 文档转化
	 * @param input 源内容
	 * @param params 转化参数
	 * @param tryMode 尝试模式
	 * @return 
	 * @throws Throwable
	 */
	String convert(String input, Map<String, Object> params, boolean tryMode) throws Throwable;
}
