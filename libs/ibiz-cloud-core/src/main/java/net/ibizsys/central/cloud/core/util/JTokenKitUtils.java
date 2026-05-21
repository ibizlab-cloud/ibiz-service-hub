package net.ibizsys.central.cloud.core.util;

import java.util.Optional;

import com.knuddels.jtokkit.Encodings;
import com.knuddels.jtokkit.api.Encoding;
import com.knuddels.jtokkit.api.EncodingRegistry;
import com.knuddels.jtokkit.api.EncodingType;

public class JTokenKitUtils {
	
	private static EncodingRegistry registry = Encodings.newLazyEncodingRegistry();
	static {
		registry.getEncoding(EncodingType.CL100K_BASE);
	}
	
	
	
	public static Encoding getEncoding(EncodingType encodingType) {
		return registry.getEncoding(encodingType);
	}
	
	public static Encoding getEncodingForModel(String modelName) {
		Optional<Encoding> optional = registry.getEncodingForModel(modelName);
		if(!optional.isPresent()) {
			throw new RuntimeException(String.format("指定模型[%1$s]不存在", modelName));
		}
		return optional.get();
	}
}
