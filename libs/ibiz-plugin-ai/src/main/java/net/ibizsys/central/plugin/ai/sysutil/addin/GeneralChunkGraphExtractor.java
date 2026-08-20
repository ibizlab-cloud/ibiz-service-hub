package net.ibizsys.central.plugin.ai.sysutil.addin;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.apache.commons.logging.LogFactory;
import org.springframework.util.ObjectUtils;
import org.springframework.util.StringUtils;

import net.ibizsys.central.cloud.core.util.ChatMessagesBuilder;
import net.ibizsys.central.cloud.core.util.domain.Chunk;
import net.ibizsys.central.plugin.ai.util.domain.GraphRAGConfig;
import net.ibizsys.runtime.util.JsonUtils;

public class GeneralChunkGraphExtractor extends ChunkGraphExtractorBase {

	private static final org.apache.commons.logging.Log log = LogFactory.getLog(GeneralChunkGraphExtractor.class);
	
	public final static String DEFAULT_TUPLE_DELIMITER = "<|>";
	public final static String DEFAULT_RECORD_DELIMITER = "##";
	public final static String DEFAULT_COMPLETION_DELIMITER = "<|COMPLETE|>";

	

	@Override
	protected List<Object[]> doProcessContent(Chunk chunk, int chunkSeq, int totalChunk, GraphRAGConfig graphRagConfig) throws Throwable {
	
		Map<String, String> variables = new HashMap<>();
		if (!ObjectUtils.isEmpty(graphRagConfig.getEntityTypes())) {
			variables.put(GraphRAGConfig.FIELD__ENTITY_TYPES, StringUtils.collectionToDelimitedString(graphRagConfig.getEntityTypes(), ","));
		}

		variables.put(graphRagConfig.getInputTextKey(), chunk.getContent());
		variables.put(graphRagConfig.getTupleDelimiterKey(), DEFAULT_TUPLE_DELIMITER);
		variables.put(graphRagConfig.getRecordDelimiterKey(), DEFAULT_RECORD_DELIMITER);
		variables.put(graphRagConfig.getCompletionDelimiterKey(), DEFAULT_COMPLETION_DELIMITER);
		variables.put("sub_prompt", graphRagConfig.getExtractionSubPrompt());
		variables.put("optional_entity_types", null);

		//判断是否展开可选实体类型
		if(!ObjectUtils.isEmpty(graphRagConfig.getOptionalEntityTypes()) && !ObjectUtils.isEmpty(graphRagConfig.getEntityTypes())) {
			boolean bMust = false;
			Map<String, String> optionalEntityTypes = new LinkedHashMap<String, String>();
			for(String strEntityType : graphRagConfig.getEntityTypes()) {
				String strDescription = graphRagConfig.getOptionalEntityTypes().get(strEntityType);
				if(strDescription == null) {
					strDescription = "";
				}
				optionalEntityTypes.put(strEntityType, strDescription);
				
				if(!bMust && StringUtils.hasLength(strDescription)) {
					bMust = true;
				}
			}
			
			if(bMust) {
				String strOptionalEntityTypes = String.format("** 可选的实体类型 **在下面的JSON对象中定义：\r\n```json\r\n%1$s\r\n```", JsonUtils.toObjectNode(optionalEntityTypes).toPrettyString());
				variables.put("optional_entity_types", strOptionalEntityTypes);
			}
		}
		

		String strExtractionPrompt = graphRagConfig.getExtractionPrompt();
		if (ObjectUtils.isEmpty(strExtractionPrompt)) {
			strExtractionPrompt = this.getExtractionPrompt();
		}
		strExtractionPrompt = this.getTemplateContent(strExtractionPrompt, variables);
		
		ChatMessagesBuilder chatMessagesBuilder = ChatMessagesBuilder.create().xml(strExtractionPrompt);
		if(ObjectUtils.isEmpty(chatMessagesBuilder.build())) {
			chatMessagesBuilder = ChatMessagesBuilder.create().system(strExtractionPrompt).user("Output:");
		}

		String strResponse = this.chatCompletion(null, chatMessagesBuilder.build());
		String results = strResponse;
		chatMessagesBuilder.assistant(strResponse);

		int nMaxGleanings = graphRagConfig.getMaxGleanings();
		for (int i = 0; i < nMaxGleanings; i++) {
			chatMessagesBuilder.user(this.getContinuePrompt());
			strResponse = this.chatCompletion(null, chatMessagesBuilder.build());
			results += strResponse;

			if (i >= nMaxGleanings - 1) {
				break;
			}

			chatMessagesBuilder.assistant(strResponse);
			chatMessagesBuilder.user(getLoopPrompt());

			String strContinuation = this.chatCompletion(null, chatMessagesBuilder.build());
			if (!"Y".equalsIgnoreCase(strContinuation)) {
				break;
			}

			chatMessagesBuilder.assistant("Y");
		}

		List<String> records = splitStringByMultiMarkers(results, Arrays.asList(variables.get(graphRagConfig.getRecordDelimiterKey()), variables.get(graphRagConfig.getCompletionDelimiterKey())));

		List<String> rcds = new ArrayList<>();
		Pattern pattern = Pattern.compile("\\((.*)\\)"); // 匹配括号内的内容

		for (String record : records) {
			Matcher matcher = pattern.matcher(record);
			if (matcher.find()) {
				rcds.add(matcher.group(1)); // 提取第一个分组（括号内的内容）
			}
			// 如果没匹配到（matcher.find()返回false），则跳过，对应Python中的continue
		}

		// 3. 实体和关系提取 - 对应Python的_entities_and_relations方法
		String tupleDelimiter = variables.get(graphRagConfig.getTupleDelimiterKey());
		Object[] entitiesResult = this.getEntitiesAndRelations(chunk.getId(), rcds, tupleDelimiter, graphRagConfig.getEntityTypes());
		Map<String, List> maybeNodes = (Map<String, List>) entitiesResult[0];
		Map<String, List> maybeEdges = (Map<String, List>) entitiesResult[1];

		// 4. 将结果添加到outResults - 对应Python的out_results.append((maybe_nodes,
		// maybe_edges, token_count))
		Object[] resultTuple = new Object[] { maybeNodes, maybeEdges};
		
		List<Object[]> result = new ArrayList<Object[]>();
		result.add(resultTuple);
		return result;
		
	}

	/**
	 * 获取默认的展开提示词
	 * 
	 * @return
	 */
	protected String getExtractionPrompt() {
//		return "-Goal-\r\n" + "Given a text document that is potentially relevant to this activity and a list of entity types, identify all entities of those types from the text and all relationships among the identified entities.\r\n" + "\r\n" + "-Steps-\r\n" + "1. Identify all entities. For each identified entity, extract the following information:\r\n" + "- entity_name: Name of the entity, capitalized, in language of 'Text'\r\n" + "- entity_type: One of the following types: [{entity_types}]\r\n" + "- entity_description: Comprehensive description of the entity's attributes and activities in language of 'Text'\r\n" + "Format each entity as (\"entity\"{tuple_delimiter}<entity_name>{tuple_delimiter}<entity_type>{tuple_delimiter}<entity_description>\r\n" + "\r\n" + "2. From the entities identified in step 1, identify all pairs of (source_entity, target_entity) that are *clearly related* to each other.\r\n" + "For each pair of related entities, extract the following information:\r\n" + "- source_entity: name of the source entity, as identified in step 1\r\n" + "- target_entity: name of the target entity, as identified in step 1\r\n" + "- relationship_description: explanation as to why you think the source entity and the target entity are related to each other in language of 'Text'\r\n" + "- relationship_strength: a numeric score indicating strength of the relationship between the source entity and target entity\r\n" + " Format each relationship as (\"relationship\"{tuple_delimiter}<source_entity>{tuple_delimiter}<target_entity>{tuple_delimiter}<relationship_description>{tuple_delimiter}<relationship_strength>)\r\n" + "\r\n" + "3. Return output as a single list of all the entities and relationships identified in steps 1 and 2. Use **{record_delimiter}** as the list delimiter.\r\n" + "\r\n" + "4. When finished, output {completion_delimiter}\r\n" + "\r\n" + "######################\r\n" + "-Examples-\r\n" + "######################\r\n" + "Example 1:\r\n" + "\r\n" + "Entity_types: [person, technology, mission, organization, location]\r\n" + "Text:\r\n" + "while Alex clenched his jaw, the buzz of frustration dull against the backdrop of Taylor's authoritarian certainty. It was this competitive undercurrent that kept him alert, the sense that his and Jordan's shared commitment to discovery was an unspoken rebellion against Cruz's narrowing vision of control and order.\r\n" + "\r\n" + "Then Taylor did something unexpected. They paused beside Jordan and, for a moment, observed the device with something akin to reverence. “If this tech can be understood...\" Taylor said, their voice quieter, \"It could change the game for us. For all of us.”\r\n" + "\r\n" + "The underlying dismissal earlier seemed to falter, replaced by a glimpse of reluctant respect for the gravity of what lay in their hands. Jordan looked up, and for a fleeting heartbeat, their eyes locked with Taylor's, a wordless clash of wills softening into an uneasy truce.\r\n" + "\r\n" + "It was a small transformation, barely perceptible, but one that Alex noted with an inward nod. They had all been brought here by different paths\r\n" + "################\r\n" + "Output:\r\n" + "(\"entity\"{tuple_delimiter}\"Alex\"{tuple_delimiter}\"person\"{tuple_delimiter}\"Alex is a character who experiences frustration and is observant of the dynamics among other characters.\"){record_delimiter}\r\n" + "(\"entity\"{tuple_delimiter}\"Taylor\"{tuple_delimiter}\"person\"{tuple_delimiter}\"Taylor is portrayed with authoritarian certainty and shows a moment of reverence towards a device, indicating a change in perspective.\"){record_delimiter}\r\n" + "(\"entity\"{tuple_delimiter}\"Jordan\"{tuple_delimiter}\"person\"{tuple_delimiter}\"Jordan shares a commitment to discovery and has a significant interaction with Taylor regarding a device.\"){record_delimiter}\r\n" + "(\"entity\"{tuple_delimiter}\"Cruz\"{tuple_delimiter}\"person\"{tuple_delimiter}\"Cruz is associated with a vision of control and order, influencing the dynamics among other characters.\"){record_delimiter}\r\n" + "(\"entity\"{tuple_delimiter}\"The Device\"{tuple_delimiter}\"technology\"{tuple_delimiter}\"The Device is central to the story, with potential game-changing implications, and is revered by Taylor.\"){record_delimiter}\r\n" + "(\"relationship\"{tuple_delimiter}\"Alex\"{tuple_delimiter}\"Taylor\"{tuple_delimiter}\"Alex is affected by Taylor's authoritarian certainty and observes changes in Taylor's attitude towards the device.\"{tuple_delimiter}7){record_delimiter}\r\n" + "(\"relationship\"{tuple_delimiter}\"Alex\"{tuple_delimiter}\"Jordan\"{tuple_delimiter}\"Alex and Jordan share a commitment to discovery, which contrasts with Cruz's vision.\"{tuple_delimiter}6){record_delimiter}\r\n" + "(\"relationship\"{tuple_delimiter}\"Taylor\"{tuple_delimiter}\"Jordan\"{tuple_delimiter}\"Taylor and Jordan interact directly regarding the device, leading to a moment of mutual respect and an uneasy truce.\"{tuple_delimiter}8){record_delimiter}\r\n" + "(\"relationship\"{tuple_delimiter}\"Jordan\"{tuple_delimiter}\"Cruz\"{tuple_delimiter}\"Jordan's commitment to discovery is in rebellion against Cruz's vision of control and order.\"{tuple_delimiter}5){record_delimiter}\r\n" + "(\"relationship\"{tuple_delimiter}\"Taylor\"{tuple_delimiter}\"The Device\"{tuple_delimiter}\"Taylor shows reverence towards the device, indicating its importance and potential impact.\"{tuple_delimiter}9){completion_delimiter}\r\n" + "#############################\r\n" + "Example 2:\r\n" + "\r\n" + "Entity_types: [person, technology, mission, organization, location]\r\n" + "Text:\r\n" + "They were no longer mere operatives; they had become guardians of a threshold, keepers of a message from a realm beyond stars and stripes. This elevation in their mission could not be shackled by regulations and established protocols—it demanded a new perspective, a new resolve.\r\n" + "\r\n" + "Tension threaded through the dialogue of beeps and static as communications with Washington buzzed in the background. The team stood, a portentous air enveloping them. It was clear that the decisions they made in the ensuing hours could redefine humanity's place in the cosmos or condemn them to ignorance and potential peril.\r\n" + "\r\n" + "Their connection to the stars solidified, the group moved to address the crystallizing warning, shifting from passive recipients to active participants. Mercer's latter instincts gained precedence— the team's mandate had evolved, no longer solely to observe and report but to interact and prepare. A metamorphosis had begun, and Operation: Dulce hummed with the newfound frequency of their daring, a tone set not by the earthly\r\n" + "#############\r\n" + "Output:\r\n" + "(\"entity\"{tuple_delimiter}\"Washington\"{tuple_delimiter}\"location\"{tuple_delimiter}\"Washington is a location where communications are being received, indicating its importance in the decision-making process.\"){record_delimiter}\r\n" + "(\"entity\"{tuple_delimiter}\"Operation: Dulce\"{tuple_delimiter}\"mission\"{tuple_delimiter}\"Operation: Dulce is described as a mission that has evolved to interact and prepare, indicating a significant shift in objectives and activities.\"){record_delimiter}\r\n" + "(\"entity\"{tuple_delimiter}\"The team\"{tuple_delimiter}\"organization\"{tuple_delimiter}\"The team is portrayed as a group of individuals who have transitioned from passive observers to active participants in a mission, showing a dynamic change in their role.\"){record_delimiter}\r\n" + "(\"relationship\"{tuple_delimiter}\"The team\"{tuple_delimiter}\"Washington\"{tuple_delimiter}\"The team receives communications from Washington, which influences their decision-making process.\"{tuple_delimiter}7){record_delimiter}\r\n" + "(\"relationship\"{tuple_delimiter}\"The team\"{tuple_delimiter}\"Operation: Dulce\"{tuple_delimiter}\"The team is directly involved in Operation: Dulce, executing its evolved objectives and activities.\"{tuple_delimiter}9){completion_delimiter}\r\n" + "#############################\r\n" + "Example 3:\r\n" + "\r\n" + "Entity_types: [person, role, technology, organization, event, location, concept]\r\n" + "Text:\r\n" + "their voice slicing through the buzz of activity. \"Control may be an illusion when facing an intelligence that literally writes its own rules,\" they stated stoically, casting a watchful eye over the flurry of data.\r\n" + "\r\n" + "\"It's like it's learning to communicate,\" offered Sam Rivera from a nearby interface, their youthful energy boding a mix of awe and anxiety. \"This gives talking to strangers' a whole new meaning.\"\r\n" + "\r\n" + "Alex surveyed his team—each face a study in concentration, determination, and not a small measure of trepidation. \"This might well be our first contact,\" he acknowledged, \"And we need to be ready for whatever answers back.\"\r\n" + "\r\n" + "Together, they stood on the edge of the unknown, forging humanity's response to a message from the heavens. The ensuing silence was palpable—a collective introspection about their role in this grand cosmic play, one that could rewrite human history.\r\n" + "\r\n" + "The encrypted dialogue continued to unfold, its intricate patterns showing an almost uncanny anticipation\r\n" + "#############\r\n" + "Output:\r\n" + "(\"entity\"{tuple_delimiter}\"Sam Rivera\"{tuple_delimiter}\"person\"{tuple_delimiter}\"Sam Rivera is a member of a team working on communicating with an unknown intelligence, showing a mix of awe and anxiety.\"){record_delimiter}\r\n" + "(\"entity\"{tuple_delimiter}\"Alex\"{tuple_delimiter}\"person\"{tuple_delimiter}\"Alex is the leader of a team attempting first contact with an unknown intelligence, acknowledging the significance of their task.\"){record_delimiter}\r\n"
//				+ "(\"entity\"{tuple_delimiter}\"Control\"{tuple_delimiter}\"concept\"{tuple_delimiter}\"Control refers to the ability to manage or govern, which is challenged by an intelligence that writes its own rules.\"){record_delimiter}\r\n" + "(\"entity\"{tuple_delimiter}\"Intelligence\"{tuple_delimiter}\"concept\"{tuple_delimiter}\"Intelligence here refers to an unknown entity capable of writing its own rules and learning to communicate.\"){record_delimiter}\r\n" + "(\"entity\"{tuple_delimiter}\"First Contact\"{tuple_delimiter}\"event\"{tuple_delimiter}\"First Contact is the potential initial communication between humanity and an unknown intelligence.\"){record_delimiter}\r\n" + "(\"entity\"{tuple_delimiter}\"Humanity's Response\"{tuple_delimiter}\"event\"{tuple_delimiter}\"Humanity's Response is the collective action taken by Alex's team in response to a message from an unknown intelligence.\"){record_delimiter}\r\n" + "(\"relationship\"{tuple_delimiter}\"Sam Rivera\"{tuple_delimiter}\"Intelligence\"{tuple_delimiter}\"Sam Rivera is directly involved in the process of learning to communicate with the unknown intelligence.\"{tuple_delimiter}9){record_delimiter}\r\n" + "(\"relationship\"{tuple_delimiter}\"Alex\"{tuple_delimiter}\"First Contact\"{tuple_delimiter}\"Alex leads the team that might be making the First Contact with the unknown intelligence.\"{tuple_delimiter}10){record_delimiter}\r\n" + "(\"relationship\"{tuple_delimiter}\"Alex\"{tuple_delimiter}\"Humanity's Response\"{tuple_delimiter}\"Alex and his team are the key figures in Humanity's Response to the unknown intelligence.\"{tuple_delimiter}8){record_delimiter}\r\n" + "(\"relationship\"{tuple_delimiter}\"Control\"{tuple_delimiter}\"Intelligence\"{tuple_delimiter}\"The concept of Control is challenged by the Intelligence that writes its own rules.\"{tuple_delimiter}7){completion_delimiter}\r\n" + "#############################\r\n" + "-Real Data-\r\n" + "######################\r\n" + "Entity_types: {entity_types}\r\n" + "Text: {input_text}\r\n" + "######################\r\n" + "Output:";
		return this.getSystemRuntime().getResourceContent(GeneralChunkGraphExtractor.class, "ExtractionPrompt.md", false);
	}
	

	protected String getContinuePrompt() {
		//return "MANY entities were missed in the last extraction.  Add them below using the same format:\n";
		return this.getSystemRuntime().getResourceContent(GeneralChunkGraphExtractor.class, "ContinuePrompt.md", false);
	}

	protected String getLoopPrompt() {
		//return "It appears some entities may have still been missed. Answer Y if there are still entities that need to be added, or N if there are none. Please answer with a single letter Y or N.\n";
		return this.getSystemRuntime().getResourceContent(GeneralChunkGraphExtractor.class, "LoopPrompt.md", false);
	}
}
