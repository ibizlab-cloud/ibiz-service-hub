package net.ibizsys.central.cloud.core.util;

import net.ibizsys.central.util.ISearchContext;

/**
 * 资料pi
 * @author lionlau
 *
 */
public interface IChunkSearchContext extends ISearchContext {

	/**
	 * 相似度阈值
	 * @return
	 */
	Float getSimilarityThreshold();
	
	
	Float getVectorSimilarityWeight();
	
}
