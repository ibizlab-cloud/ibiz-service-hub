package net.ibizsys.runtime.util;

import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import org.apache.commons.io.IOUtils;

public class ResourcesUtils {

	private final static Map<ClassLoader, ResourcesUtils> resourcesUtilsMap = new HashMap<ClassLoader, ResourcesUtils>();
	private final static ResourcesUtils defaultResourcesUtils = new ResourcesUtils();

	private final Map<String, String> cache = new ConcurrentHashMap<>();
	private final ClassLoader classLoader;

	public ResourcesUtils() {
		this.classLoader = null;
	}

	public ResourcesUtils(ClassLoader classLoader) {
		this.classLoader = classLoader;
	}

	/**
	 * 获取指定资源路径的内容，如果缓存中已存在则直接返回
	 * 
	 * @param resourcePath
	 *            资源路径（如 "/config/app.properties"）
	 * @return 资源内容字符串
	 */
	public String getResourceContent(String resourcePath, boolean tryMode) {
		return cache.computeIfAbsent(resourcePath, k -> {
			return loadResourceContent(k, tryMode);
		});
	}
	
	
	public String getResourceContent(Class<?> clazz, String resourcePath, boolean tryMode) {
		return getResourceContent(String.format("/%1$s_%2$s", clazz.getName().replace(".", "/"), resourcePath), tryMode);
	}

	/**
	 * 从资源路径加载内容
	 * 
	 * @param resourcePath
	 *            资源路径
	 * @return 资源内容字符串
	 */
	private String loadResourceContent(String resourcePath, boolean tryMode) {
		if(this.classLoader == null) {
			try (InputStream is = this.getClass().getResourceAsStream(resourcePath)) {
				if (is != null) {
					return IOUtils.toString(is, "UTF-8");
				}

				if (tryMode) {
					return null;
				}
				throw new IllegalArgumentException("Resource not found: " + resourcePath);

			} catch (Exception e) {
				throw new RuntimeException("Failed to load resource: " + resourcePath, e);
			}
		}
		else {
			try (InputStream is = this.classLoader.getResourceAsStream(resourcePath)) {
				if (is != null) {
					return IOUtils.toString(is, "UTF-8");
				}

				if (tryMode) {
					return null;
				}
				throw new IllegalArgumentException("Resource not found: " + resourcePath);

			} catch (Exception e) {
				throw new RuntimeException("Failed to load resource: " + resourcePath, e);
			}
		}
		
	}

	/**
	 * 清除缓存
	 */
	public void clearCache() {
		cache.clear();
	}

	/**
	 * 检查资源是否已缓存
	 * 
	 * @param resourcePath
	 *            资源路径
	 * @return 是否已缓存
	 */
	public boolean isCached(String resourcePath) {
		return cache.containsKey(resourcePath);
	}

	/**
	 * 获取缓存大小
	 * 
	 * @return 缓存中的资源数量
	 */
	public int getCacheSize() {
		return cache.size();
	}

	public static ResourcesUtils getInstance() {
		return getInstance(null);
	}

	public static ResourcesUtils getInstance(ClassLoader classLoader) {
		if (classLoader == null) {
			return defaultResourcesUtils;
		}
		return resourcesUtilsMap.computeIfAbsent(classLoader, k -> {
			return new ResourcesUtils(k);
		});
	}
}
