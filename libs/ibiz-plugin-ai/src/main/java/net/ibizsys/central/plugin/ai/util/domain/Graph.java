package net.ibizsys.central.plugin.ai.util.domain;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

import net.ibizsys.runtime.util.KeyValueUtils;

/**
 * 图类，模仿nx.Graph的基本功能
 * 支持有向图和无向图
 */
public class Graph<T> {
    private final Map<String, GraphNode<T>> nodes;
    private final Map<String, GraphEdge<T>> edges;
    private final boolean directed;
    private final Map<String, Object> graphAttributes;
    
    public Graph() {
        this(false);
    }
    
    public Graph(boolean directed) {
        this.directed = directed;
        this.nodes = new HashMap<>();
        this.edges = new HashMap<>();
        this.graphAttributes = new LinkedHashMap<>();
    }
    
    // 节点操作
    public GraphNode<T> addNode(String nodeId) {
        return addNode(nodeId, null);
    }
    
    public GraphNode<T> addNode(String nodeId, T data) {
        GraphNode<T> node = new GraphNode<>(nodeId, data);
        nodes.put(nodeId, node);
        return node;
    }
    
    public GraphNode<T> getNode(String nodeId) {
        return nodes.get(nodeId);
    }
    
    public boolean hasNode(String nodeId) {
        return nodes.containsKey(nodeId);
    }
    
    public boolean removeNode(String nodeId) {
        GraphNode<T> node = nodes.remove(nodeId);
        if (node != null) {
            // 移除所有与该节点相关的边
        	Map<String, GraphEdge<T>> edges2 = new HashMap();
        	for(java.util.Map.Entry<String, GraphEdge<T>> entry : this.edges.entrySet()) {
        		if(entry.getValue().containsNode(node)) {
        			continue;
        		}
        		edges2.put(entry.getKey(), entry.getValue());
        	}
        	edges.clear();
        	edges.putAll(edges2);
            return true;
        }
        return false;
    }
    
    public Collection<GraphNode<T>> getNodes() {
        return Collections.unmodifiableCollection(nodes.values());
    }
    
    public int numberOfNodes() {
        return nodes.size();
    }
    
    // 边操作
    public GraphEdge<T> addEdge(String sourceId, String targetId, T data) {
        return addEdge(sourceId, targetId, data, new HashMap<>());
    }
    
    public GraphEdge<T> addEdge(String sourceId, String targetId, T data, Map<String, Object> attributes) {
        GraphNode<T> source = getOrCreateNode(sourceId);
        GraphNode<T> target = getOrCreateNode(targetId);
        
        String strUniqueId = KeyValueUtils.genUniqueId(sourceId, targetId);
        
        GraphEdge<T> edge = new GraphEdge<>(source, target, data, directed, attributes);
        edges.put(strUniqueId, edge);
        
        source.addNeighbor(targetId);
        target.addNeighbor(sourceId);
        
        return edge;
    }
    
    public boolean hasEdge(String sourceId, String targetId) {
        GraphNode<T> source = nodes.get(sourceId);
        GraphNode<T> target = nodes.get(targetId);
        if (source == null || target == null) return false;
        
        String strUniqueId = KeyValueUtils.genUniqueId(sourceId, targetId);
        return edges.containsKey(strUniqueId);
    }
    
    public boolean removeEdge(String sourceId, String targetId) {
        GraphNode<T> source = nodes.get(sourceId);
        GraphNode<T> target = nodes.get(targetId);
        if (source == null || target == null) return false;
        
        source.removeNeighbor(targetId);
        target.removeNeighbor(sourceId);
        
        String strUniqueId = KeyValueUtils.genUniqueId(sourceId, targetId);
        return edges.remove(strUniqueId) != null;
    }
    
    public Collection<GraphEdge<T>> getEdges() {
        return Collections.unmodifiableCollection(edges.values());
    }
    
    public int numberOfGraphEdges() {
        return edges.size();
    }
    
    // 邻居和度操作
    public Set<GraphNode<T>> getNeighbors(String nodeId) {
        GraphNode<T> node = nodes.get(nodeId);
        if (node == null) return Collections.emptySet();
        
        return edges.values().stream()
            .filter(edge -> edge.containsNode(node))
            .map(edge -> edge.getOtherNode(node))
            .collect(Collectors.toSet());
    }
    
    public int degree(String nodeId) {
        return getNeighbors(nodeId).size();
    }
    
    // 图属性操作
    public void setAttribute(String key, Object value) {
        graphAttributes.put(key, value);
    }
    
    public Object getAttribute(String key) {
        return graphAttributes.get(key);
    }
    
    public void putAttributes(Map<String, Object> attributes) {
    	this.graphAttributes.putAll(attributes);
    }
    
    public Map<String, Object> getAttributes() {
        return Collections.unmodifiableMap(graphAttributes);
    }
    
    // 图信息
    public boolean isDirected() {
        return directed;
    }
    
    public boolean isEmpty() {
        return nodes.isEmpty();
    }
    
    // 辅助方法
    private GraphNode<T> getOrCreateNode(String nodeId) {
        return nodes.computeIfAbsent(nodeId, id -> new GraphNode<>(id));
    }
    
    @Override
    public String toString() {
        return String.format("Graph{nodes=%d, edges=%d, directed=%s}", 
                           nodes.size(), edges.size(), directed);
    }
}