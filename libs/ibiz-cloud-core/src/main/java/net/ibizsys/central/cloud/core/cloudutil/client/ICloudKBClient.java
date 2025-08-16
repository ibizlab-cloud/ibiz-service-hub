package net.ibizsys.central.cloud.core.cloudutil.client;

import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import net.ibizsys.central.cloud.core.util.IChunkSearchContext;
import net.ibizsys.central.cloud.core.util.domain.Chunk;

public interface ICloudKBClient {

	@RequestMapping(method = {RequestMethod.POST}, value = "/kb/{type}/fetchchunks")
	Page<Chunk> fetchChunks(@PathVariable("type") String type, @RequestBody IChunkSearchContext iChunkSearchContext);
	


}
