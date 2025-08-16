package net.ibizsys.central.cloud.core.util;

import net.ibizsys.central.util.ISearchContext;

public interface IChunkSearchContext extends ISearchContext {

	Float getSimilarityThreshold();
	
	Float getVectorSimilarityWeight();
	
}
