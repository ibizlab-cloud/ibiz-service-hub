package net.ibizsys.central.cloud.kb.core.util.jackrabbit;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Collections;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

import org.apache.jackrabbit.core.fs.FileSystem;
import org.apache.jackrabbit.core.fs.FileSystemException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 自定义 FileSystem – 基于内存的简单实现。
 * 数据保存在 HashMap 中，应用重启后数据会丢失。
 * 适合开发/测试，后续可以改为数据库存储。
 */
public class KBDavFileSystem implements FileSystem {

    private static final Logger log = LoggerFactory.getLogger(KBDavFileSystem.class);

    // 内存存储：键为路径，值为文件内容（字节数组）或目录标记
    private final Map<String, Object> storage = new ConcurrentHashMap<>();
    // 记录目录下的子项列表，便于 listFolder
    private final Map<String, Set<String>> dirChildren = new ConcurrentHashMap<>();

    private boolean initialized = false;

    private final static Object DirectoryMarker = new Object();
    
    
    private String path = null;
    
    
    
    // ---------- 生命周期方法 ----------
    @Override
    public void init() throws FileSystemException {
        log.info("Initializing KBDavFileSystem ");
        // 可以在这里读取配置参数，例如数据库连接信息
        // 如果是数据库，可以在这里建立连接
        initialized = true;
        // 确保根目录存在
        //createFolder("/");
    }

    @Override
    public void close() throws FileSystemException {
        log.info("Closing KBDavFileSystem");
        // 释放资源，例如关闭数据库连接
        storage.clear();
        dirChildren.clear();
        initialized = false;
    }

    // ---------- 辅助方法 ----------
    private void checkInitialized() throws FileSystemException {
        if (!initialized) {
            throw new FileSystemException("FileSystem not initialized");
        }
    }

    private String normalizePath(String path) {
        if (path == null || path.isEmpty()) {
            return "/";
        }
        // 保证以 / 开头，并去除末尾多余的 /
        if (!path.startsWith("/")) {
            path = "/" + path;
        }
        if (path.length() > 1 && path.endsWith("/")) {
            path = path.substring(0, path.length() - 1);
        }
        return path;
    }

    private String getParentPath(String path) {
        String normalized = normalizePath(path);
        if ("/".equals(normalized)) {
            return null;
        }
        int lastSlash = normalized.lastIndexOf('/');
        if (lastSlash == 0) {
            return "/";
        }
        return normalized.substring(0, lastSlash);
    }

    private String getFileName(String path) {
        String normalized = normalizePath(path);
        if ("/".equals(normalized)) {
            return "";
        }
        return normalized.substring(normalized.lastIndexOf('/') + 1);
    }

    // ---------- 目录操作 ----------
    @Override
    public boolean exists(String path) throws FileSystemException {
        checkInitialized();
        String p = normalizePath(path);
        return storage.containsKey(p);
    }

    @Override
    public boolean isFolder(String path) throws FileSystemException {
        checkInitialized();
        String p = normalizePath(path);
        Object obj = storage.get(p);
        return obj != null && obj == DirectoryMarker;
    }

    @Override
    public boolean isFile(String path) throws FileSystemException {
        checkInitialized();
        String p = normalizePath(path);
        Object obj = storage.get(p);
        return obj != null && obj instanceof byte[];
    }

    @Override
    public String[] listFolders(String path) throws FileSystemException {
        checkInitialized();
        String p = normalizePath(path);
        if (!isFolder(p)) {
            throw new FileSystemException("Path is not a folder: " + p);
        }
        Set<String> children = dirChildren.getOrDefault(p, Collections.emptySet());
        return  children.toArray(new String[children.size()]);
    }

    @Override
    public void createFolder(String path) throws FileSystemException {
        checkInitialized();
        String p = normalizePath(path);
        if (exists(p)) {
            throw new FileSystemException("Path already exists: " + p);
        }
        // 确保父目录存在
        String parent = getParentPath(p);
        if (parent != null && !exists(parent)) {
            createFolder(parent); // 递归创建父目录
        }
        // 存储目录标记
        storage.put(p, DirectoryMarker);
        // 更新父目录的子项列表
        if (parent != null) {
            dirChildren.computeIfAbsent(parent, k -> ConcurrentHashMap.newKeySet())
                       .add(getFileName(p));
        }
        log.debug("Created folder: {}", p);
    }

    @Override
    public void deleteFolder(String path) throws FileSystemException {
        checkInitialized();
        String p = normalizePath(path);
        if ("/".equals(p)) {
            throw new FileSystemException("Cannot delete root folder");
        }
        if (!isFolder(p)) {
            throw new FileSystemException("Path is not a folder: " + p);
        }
        // 检查是否为空（非必须，但为了安全）
        if (listFolders(p).length != 0) {
            throw new FileSystemException("Folder is not empty: " + p);
        }
        storage.remove(p);
        String parent = getParentPath(p);
        if (parent != null) {
            Set<String> children = dirChildren.get(parent);
            if (children != null) {
                children.remove(getFileName(p));
            }
        }
        log.debug("Deleted folder: {}", p);
    }

    // ---------- 文件操作 ----------
    @Override
    public InputStream getInputStream(String filePath) throws FileSystemException {
        checkInitialized();
        String p = normalizePath(filePath);
        if (!isFile(p)) {
            throw new FileSystemException("Path is not a file: " + p);
        }
        byte[] data = (byte[]) storage.get(p);
        return new ByteArrayInputStream(data);
    }

    @Override
    public OutputStream getOutputStream(String filePath) throws FileSystemException {
        checkInitialized();
        String p = normalizePath(filePath);
        // 确保父目录存在
        String parent = getParentPath(p);
        if (parent != null && !exists(parent)) {
            createFolder(parent);
        }
        // 返回一个 ByteArrayOutputStream，在 close 时自动写入 storage
        return new ByteArrayOutputStream() {
            @Override
            public void close() throws IOException {
                super.close();
                
                try {
                	byte[] data = toByteArray();
                    // 如果文件已存在且是目录则报错
                    if (exists(p) && isFolder(p)) {
                        throw new IOException("Cannot write to a folder: " + p);
                    }
                    // 如果是新文件，更新父目录子项列表
                    if (!exists(p)) {
                        if (parent != null) {
                            dirChildren.computeIfAbsent(parent, k -> ConcurrentHashMap.newKeySet())
                                       .add(getFileName(p));
                        }
                    }
                    storage.put(p, data);
                    log.debug("Written file: {} ({} bytes)", p, data.length);
                }
                catch (Throwable ex) {
                	log.error(ex.getMessage(), ex);
				}
            }
        };
    }

    @Override
    public void deleteFile(String filePath) throws FileSystemException {
        checkInitialized();
        String p = normalizePath(filePath);
        if (!isFile(p)) {
            throw new FileSystemException("Path is not a file: " + p);
        }
        storage.remove(p);
        String parent = getParentPath(p);
        if (parent != null) {
            Set<String> children = dirChildren.get(parent);
            if (children != null) {
                children.remove(getFileName(p));
            }
        }
        log.debug("Deleted file: {}", p);
    }

    @Override
    public long length(String filePath) throws FileSystemException {
        checkInitialized();
        String p = normalizePath(filePath);
        if (!isFile(p)) {
            throw new FileSystemException("Path is not a file: " + p);
        }
        byte[] data = (byte[]) storage.get(p);
        return data.length;
    }

    @Override
    public long lastModified(String filePath) throws FileSystemException {
        checkInitialized();
        // 简单返回当前时间（每次调用更新）
        return System.currentTimeMillis();
    }

   

	@Override
	public boolean hasChildren(String path) throws FileSystemException {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public String[] list(String folderPath) throws FileSystemException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String[] listFiles(String folderPath) throws FileSystemException {
		// TODO Auto-generated method stub
		return null;
	}


	public String getPath() {
		return this.path;
	}
	
	public void setPath(String path) {
		this.path = path;
	}
}