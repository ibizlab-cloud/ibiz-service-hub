package net.ibizsys.central.plugin.ai.sysutil.addin;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;

import org.apache.commons.logging.LogFactory;
import org.springframework.util.ObjectUtils;

import net.ibizsys.central.cloud.core.util.IChunkSearchContext;
import net.ibizsys.central.cloud.core.util.domain.Chunk;
import net.ibizsys.central.plugin.ai.sysutil.ISysKnowledgeBaseUtilRuntime.GraphRelationField;
import net.ibizsys.central.plugin.ai.sysutil.ISysKnowledgeBaseUtilRuntime.IGraphRelationProxyDERuntime;
import net.ibizsys.central.plugin.ai.util.domain.ParserConfig;
import net.ibizsys.central.plugin.ai.util.domain.Triplet;
import net.ibizsys.central.util.IEntityDTO;
import net.ibizsys.runtime.util.ActionSessionManager;
import net.ibizsys.runtime.util.IAction;
import net.ibizsys.runtime.util.ITransactionalUtil;
import net.ibizsys.runtime.util.JsonUtils;

public abstract class GraphRAGChunkRetrieverBase extends ChunkRetrieverBase {

	private static final org.apache.commons.logging.Log log = LogFactory.getLog(GraphRAGChunkRetrieverBase.class);
	
	/**
	 * 表示图中的节点，用于优先队列
	 */
	final static class Node {
		String vertex;
	    int weight;
	    
	    public Node(String vertex, int weight) {
	        this.vertex = vertex;
	        this.weight = weight;
	    }
	}
	
	
	@Override
	protected List<Chunk> onRetrieve(List<Object> kbIds, IChunkSearchContext iChunkSearchContext, ParserConfig config) throws Throwable {
		
		List<Map<String, Object>> tripletDataList = (List<Map<String, Object>>)iChunkSearchContext.get(IChunkSearchContext.PARAM_TRIPLETS);
		if(!ObjectUtils.isEmpty(tripletDataList)) {
			List<Chunk> totalList = new ArrayList<Chunk>();
			for(Map<String, Object> tripletData : tripletDataList) {
				if(ObjectUtils.isEmpty(tripletData)) {
					continue;
				}
				Triplet triplet = JsonUtils.as(tripletData, Triplet.class);
				List<Chunk> chunkList = (List<Chunk>)ActionSessionManager.execute(new IAction() {
					@Override
					public Object execute(Object[] args) throws Throwable {
						return onRetrieve(kbIds, triplet, iChunkSearchContext, config);
					}
				}, null, ITransactionalUtil.PROPAGATION_UNKNOWN);
				
				if(!ObjectUtils.isEmpty(chunkList)) {
					totalList.addAll(chunkList);
				}
			}
			return totalList;
		}
		else {
			Map<String, Object> tripletData = (Map<String, Object>)iChunkSearchContext.get(IChunkSearchContext.PARAM_TRIPLET);
			if(ObjectUtils.isEmpty(tripletData)) {
				//throw new Exception("未指定三元组");
				log.warn(String.format("未传入三元组"));
				return Collections.EMPTY_LIST;
			}
			
			log.debug(String.format("三元组 ==> %1$s", tripletData));
			
			Triplet triplet = JsonUtils.as(tripletData, Triplet.class);
			return (List<Chunk>)ActionSessionManager.execute(new IAction() {
				@Override
				public Object execute(Object[] args) throws Throwable {
					return onRetrieve(kbIds, triplet, iChunkSearchContext, config);
				}
			}, null, ITransactionalUtil.PROPAGATION_UNKNOWN);
		}
		
	}
	
	protected List<Chunk> onRetrieve(List<Object> kbIds, Triplet triplet, IChunkSearchContext iChunkSearchContext, ParserConfig config) throws Throwable {
		return super.onRetrieve(kbIds, iChunkSearchContext, config);
	}
	
	
	/**
     * 寻找两点间最短路径
     * @param start 起点
     * @param end 终点
     * @param edges 无向线段集合，每个线段包含起点、终点和权重
     * @return 最短路径对象，包含路径和总权重
     */
    protected List<String> findShortestPath(Object subjectId, Object objectId, List<IEntityDTO> allRelationList) throws Throwable {
        // 构建图的邻接表表示[1,9](@ref)
        Map<String, List<Node>> graph = buildGraph(allRelationList);
        
        // 初始化距离数组，所有节点初始距离为无穷大[1,9](@ref)
        Map<String, Integer> distances = new HashMap<>();
        for (String node : graph.keySet()) {
            distances.put(node, Integer.MAX_VALUE);
        }
        distances.put(String.valueOf(subjectId), 0);
        
        // 优先队列（最小堆）用于高效获取当前最小距离节点[1,9](@ref)
        PriorityQueue<Node> pq = new PriorityQueue<>(Comparator.comparingInt(node -> node.weight));
        pq.offer(new Node(String.valueOf(subjectId), 0));
        
        // 记录路径的前驱节点[2](@ref)
        Map<String, String> previous = new HashMap<>();
        
        // Dijkstra算法主循环[1,9](@ref)
        while (!pq.isEmpty()) {
            Node current = pq.poll();
            String currentNode = current.vertex;
            int currentDist = current.weight;
            
            // 如果到达终点，提前结束[1](@ref)
            if (currentNode.equals(objectId)) {
                break;
            }
            
            // 遍历当前节点的所有邻居[1,9](@ref)
            if (graph.containsKey(currentNode)) {
                for (Node neighbor : graph.get(currentNode)) {
                    int newDist = currentDist + neighbor.weight;
                    
                    // 如果找到更短路径，更新距离并加入队列[1,9](@ref)
                    if (newDist < distances.get(neighbor.vertex)) {
                        distances.put(neighbor.vertex, newDist);
                        previous.put(neighbor.vertex, currentNode);
                        pq.offer(new Node(neighbor.vertex, newDist));
                    }
                }
            }
        }
        
        // 构建最短路径[2](@ref)
        List<String> path = reconstructPath(String.valueOf(subjectId), String.valueOf(objectId), previous);
        //int totalWeight = distances.get(objectId);
        
        //return new ShortestPathResult(path, totalWeight);
        return path;
    }
    
    private List<String> reconstructPath(String start, String end, Map<String, String> previous) {
        List<String> path = new ArrayList<>();
        
        // 如果终点不可达，返回空路径[2](@ref)
        if (!previous.containsKey(end) && !start.equals(end)) {
            return path;
        }
        
        // 从终点反向追踪到起点[2](@ref)
        String current = end;
        while (!current.equals(start)){
            path.add(0, current);
            current = previous.get(current);
        }
        path.add(0, start);
        
        return path;
    }
    
    
    /**
     * 构建图的邻接表表示[1,9](@ref)
     */
    private Map<String, List<Node>> buildGraph(List<IEntityDTO> allRelationList) throws Throwable{
    	final IGraphRelationProxyDERuntime  graphRelationProxyDERuntime = this.getContext().getGraphRelationProxyDERuntime(false);
    	
        Map<String, List<Node>> graph = new HashMap<>();
        
        for (IEntityDTO relationEntityDTO : allRelationList) {
        	String strSourceId = (String)graphRelationProxyDERuntime.getFieldValue(relationEntityDTO, GraphRelationField.SOURCE_ID);
			String strTargetId = (String)graphRelationProxyDERuntime.getFieldValue(relationEntityDTO, GraphRelationField.TARGET_ID);
            // 添加正向边
            graph.computeIfAbsent(strSourceId, k -> new ArrayList<>())
                 .add(new Node(strTargetId, 1));
            // 添加反向边（无向图）[9](@ref)
            graph.computeIfAbsent(strTargetId, k -> new ArrayList<>())
                 .add(new Node(strSourceId, 1));
        }
        
        return graph;
    }
    
    /**
     * 根据前驱节点重建路径[2](@ref)
     */
    private static List<Integer> reconstructPath(int start, int end, Map<Integer, Integer> previous) {
        List<Integer> path = new ArrayList<>();
        
        // 如果终点不可达，返回空路径[2](@ref)
        if (!previous.containsKey(end) && start != end) {
            return path;
        }
        
        // 从终点反向追踪到起点[2](@ref)
        int current = end;
        while (current != start) {
            path.add(0, current);
            current = previous.get(current);
        }
        path.add(0, start);
        
        return path;
    }
}
