package net.ibizsys.central.cloud.core.search;

import java.util.List;

import net.ibizsys.central.cloud.core.util.IChunkSearchContext;
import net.ibizsys.central.cloud.core.util.domain.Chunk;
import net.ibizsys.model.search.IPSSysSearchDoc;

public interface ISysSearchSchemeRuntime extends net.ibizsys.central.search.ISysSearchSchemeRuntime {

	/**
	 * 获取知识片段
	 * @param tableName 数据表名
	 * @param iChunkSearchContext
	 * @return
	 */
	List<Chunk> selectChunks(String docName, IChunkSearchContext iChunkSearchContext) throws Throwable;
	
	
	/**
	 * 获取指定系统检索文档运行时对象
	 * @param strDocName
	 * @param bTryMode
	 * @return
	 */
	ISysSearchDocRuntime getSysSearchDocRuntime(String strDocName, boolean bTryMode);
	
	
	
	
	
	/**
	 * 获取指定系统检索文档运行时对象
	 * @param iPSSysSearchDoc
	 * @return
	 */
	ISysSearchDocRuntime getSysSearchDocRuntime(IPSSysSearchDoc iPSSysSearchDoc);
}
