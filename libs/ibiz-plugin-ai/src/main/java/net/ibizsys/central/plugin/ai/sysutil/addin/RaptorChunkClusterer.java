package net.ibizsys.central.plugin.ai.sysutil.addin;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import org.apache.commons.logging.LogFactory;
import org.springframework.util.StringUtils;

import net.ibizsys.central.cloud.core.ai.util.AIChatUtils;
import net.ibizsys.central.cloud.core.util.ChatMessagesBuilder;
import net.ibizsys.central.cloud.core.util.RecursiveCharacterTextSplitter;
import net.ibizsys.central.cloud.core.util.domain.ChatCompletionRequest;
import net.ibizsys.central.cloud.core.util.domain.ChatCompletionResult;
import net.ibizsys.central.cloud.core.util.domain.ClusterEmbeddingsRequest;
import net.ibizsys.central.plugin.ai.util.domain.RaptorConfig;
import net.ibizsys.central.plugin.ai.util.domain.RaptorNode;
import net.ibizsys.runtime.util.IAction;

public class RaptorChunkClusterer extends ChunkClustererBase {

	private static final org.apache.commons.logging.Log log = LogFactory.getLog(RaptorChunkClusterer.class);

	@Override
	protected List<List<RaptorNode>> onCluster(Object documentId, List<RaptorNode> nodes, RaptorConfig config) throws Throwable {
		if (nodes == null || nodes.isEmpty()) {
			return new ArrayList<>();
		}

		// 复制节点列表以进行修改
		List<RaptorNode> allNodes = new ArrayList<>(nodes);

		// 分层记录
		List<List<RaptorNode>> layers = new ArrayList<>();
		layers.add(new ArrayList<>(allNodes));

		// 当前处理的节点范围
		int start = 0;
		int end = allNodes.size();

		int layerIndex = 0;

		while (end - start > 1) {
			
			if(getContext().shouldCancelDocumentJobs(documentId)) {
				throw new Exception("文档作业已被取消");
			}
			
			getContext().updateDocumentProgress(documentId, String.format("片段聚合[%1$s]", layerIndex + 1));
			// 提取当前层的嵌入
			double[][] embeddings = new double[end - start][];
			for (int i = 0; i < end - start; i++) {
				embeddings[i] = allNodes.get(start + i).getEmbedding();
			}

			// 特殊情况：只有两个节点
			if (end - start == 2) {
				RaptorNode summaryNode = getSummaryNode(allNodes, start, start + 1, layerIndex + 1, config);
				if (summaryNode != null) {
					allNodes.add(summaryNode);
				}

				// 记录新层
				List<RaptorNode> newLayer = allNodes.subList(end, allNodes.size());
				layers.add(new ArrayList<>(newLayer));

				// 更新指针
				start = end;
				end = allNodes.size();
				layerIndex++;
				continue;
			}

			int optimalClusters = 1;
			int[] labels = null;
			ClusterEmbeddingsRequest request = new ClusterEmbeddingsRequest();
			request.setEmbeddings(Arrays.asList(embeddings));
			request.setMaxClusters(config.getUmapNComponents());
			request.setRandomState(config.getRandomSeed());
			request.setThreshold(new Float(config.getSimilarityThreshold()));
			List<Integer> labelList = this.getContext().clusterEmbeddings(request);
			optimalClusters = (new HashSet<Integer>(labelList)).size();
			labels = new int[labelList.size()];
			for(int i = 0;i<labelList.size();i++) {
				labels[i] = labelList.get(i);
			}
			
			List<IAction> actionList = new ArrayList<>();
			for (int clusterId = 0; clusterId < optimalClusters; clusterId++) {
				final int finalClusterId = clusterId;
				final int finalStart = start;
				final int finalLayerIndex = layerIndex;
				final int[] finalLabels = labels;
				actionList.add(new IAction() {
					@Override
					public Object execute(Object[] args) throws Throwable {
						
						if(getContext().shouldCancelDocumentJobs(documentId)) {
							throw new Exception("文档作业已被取消");
						}
						
						// 收集属于该聚类的节点索引
						List<Integer> clusterIndices = new ArrayList<>();
						for (int i = 0; i < finalLabels.length; i++) {
							if (finalLabels[i] == finalClusterId) {
								clusterIndices.add(finalStart + i);
							}
						}

						if (clusterIndices.isEmpty()) {
							return null;
						}

						// 生成摘要
						return getSummaryNode(allNodes, clusterIndices, finalLayerIndex + 1, config);
					}
				});
			}

			// 收集结果
			List<RaptorNode> newNodes = new ArrayList<>();

			Map<String, Object> ret = this.getContext().threadRunAllOf(actionList, false, null);
			for (Object value : ret.values()) {
				if (value instanceof RaptorNode) {
					newNodes.add((RaptorNode) value);
				}
			}

			// 添加新节点
			allNodes.addAll(newNodes);

			// 记录新层
			List<RaptorNode> newLayer = allNodes.subList(end, allNodes.size());
			layers.add(new ArrayList<>(newLayer));

			// 更新指针
			start = end;
			end = allNodes.size();
			layerIndex++;
		}

		return layers;
	}
	

	// 异步生成摘要
	protected RaptorNode getSummaryNode(List<RaptorNode> nodes, int startIdx, int endIdx, int layer, RaptorConfig config)	throws Throwable {
		List<Integer> indices = new ArrayList<>();
		for (int i = startIdx; i <= endIdx; i++) {
			indices.add(i);
		}
		return getSummaryNode(nodes, indices, layer, config);
	}

	

	// 生成聚类摘要
	protected RaptorNode getSummaryNode(List<RaptorNode> allNodes, List<Integer> indices, int layer, RaptorConfig config) throws Throwable {
		// 收集聚类的所有节点
		List<RaptorNode> clusterNodes = new ArrayList<>();
		for (int idx : indices) {
			clusterNodes.add(allNodes.get(idx));
		}

		// 收集所有源索引
		List<Integer> sourceIndices = new ArrayList<>();
		for (RaptorNode node : clusterNodes) {
			sourceIndices.addAll(node.getSourceIndices());
		}

		// 如果没有源索引，使用当前索引
		if (sourceIndices.isEmpty()) {
			sourceIndices = new ArrayList<>(indices);
		}

		// 收集文本
		List<String> texts = clusterNodes.stream().map(RaptorNode::getText).collect(Collectors.toList());
		
		//进行文本截断
		int nMaxLength = 10240;
		int lenPerChunk = nMaxLength / texts.size();
		RecursiveCharacterTextSplitter recursiveCharacterTextSplitter = new RecursiveCharacterTextSplitter(Arrays.asList("\n"," ",",",".","，","。"), lenPerChunk, 0);
		
		// 截断文本
		List<String> truncatedTexts = new ArrayList<String>();
		for(String strContent : texts) {
			if(strContent.length() > lenPerChunk) {
				//truncatedTexts.add(strContent.substring(0, lenPerChunk));
				truncatedTexts.add(recursiveCharacterTextSplitter.splitText(strContent).get(0));
			}
			else {
				truncatedTexts.add(strContent);
			}
		}

		String clusterContent = String.join("\n", truncatedTexts);
		
		String strPrompt = config.getPrompt();
		if(StringUtils.hasLength(strPrompt)) {
			strPrompt = strPrompt.replace("{cluster_content}", clusterContent);
		}
		else {
			strPrompt = String.format("请总结以下段落。 小心数字，不要编造。 段落如下：\r\n" + "%1$s\r\n" + "---\r\n" + "以上就是你需要总结的内容。", 	clusterContent);
		}

		strPrompt += String.format("注意：总结内容长度不要超过`%1$s`，返回内容也无需输出字数。", config.getMaxTokens());

		ChatCompletionRequest chatCompletionRequest = new ChatCompletionRequest();
		chatCompletionRequest.setMessages(ChatMessagesBuilder.create().user(strPrompt).build());
		ChatCompletionResult chatCompletionResult = getContext().chatCompletion(config.getChatAgent(), chatCompletionRequest);
		String summary = chatCompletionResult.getChoices().get(0).getContent();
		summary = AIChatUtils.removeThinkingContent(summary);
		double[] embedding = this.getEmbedding(config.getEmbeddingAgent(), summary);

		return new RaptorNode(summary, embedding, layer, sourceIndices);
	}

	
}
