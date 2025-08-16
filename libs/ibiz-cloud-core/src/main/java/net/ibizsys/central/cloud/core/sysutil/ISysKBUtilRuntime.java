package net.ibizsys.central.cloud.core.sysutil;

import org.springframework.data.domain.Page;

import net.ibizsys.central.cloud.core.util.IChunkSearchContext;
import net.ibizsys.central.cloud.core.util.domain.Chunk;

/**
 * 系统KB功能运行时对象接口
 * @author lionlau
 *
 */
public interface ISysKBUtilRuntime extends ISysUtilRuntime{

	/**
	 * KB平台：默认，由Cloud平台默认KB引擎提供服务
	 */
	public final static String KBPLATFORM_DEFAULT = "DEFAULT";
	
	
	/**
	 * 获取默认的KB平台类型
	 * @return
	 */
	String getDefaultKBPlatformType();
	
	/**
	 * 获取知识片段
	 * @param iChunkSearchContext
	 * @return
	 */
	Page<Chunk> fetchChunks(IChunkSearchContext iChunkSearchContext);
	
	/**
	 * 获取知识片段
	 * @param type
	 * @param iChunkSearchContext
	 * @return
	 */
	Page<Chunk> fetchChunks(String type, IChunkSearchContext iChunkSearchContext);
}
