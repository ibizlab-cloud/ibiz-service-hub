package net.ibizsys.model.ai;



public class PSSysAIChatAgentImpl extends net.ibizsys.model.ai.PSSysAIFactoryObjectImpl implements net.ibizsys.model.ai.IPSSysAIChatAgent{

	public final static String ATTR_GETAIPLATFORMTYPE = "aIPlatformType";
	public final static String ATTR_GETAGENTINFO = "agentInfo";
	public final static String ATTR_GETAGENTPARAMS = "agentParams";
	public final static String ATTR_GETAGENTTAG = "agentTag";
	public final static String ATTR_GETAGENTTAG2 = "agentTag2";
	public final static String ATTR_GETAGENTTYPE = "agentType";
	public final static String ATTR_GETCODENAME = "codeName";
	public final static String ATTR_GETDEFAULTFLAGPSDEFIELD = "getDefaultFlagPSDEField";
	public final static String ATTR_GETDYNAMICMODE = "dynamicMode";
	public final static String ATTR_GETENABLESUGGESTEDQUESTIONS = "enableSuggestedQuestions";
	public final static String ATTR_GETENABLESUGGESTEDQUESTIONSPSDEFIELD = "getEnableSuggestedQuestionsPSDEField";
	public final static String ATTR_GETENABLETHINKING = "enableThinking";
	public final static String ATTR_GETENABLETHINKINGPSDEFIELD = "getEnableThinkingPSDEField";
	public final static String ATTR_GETENABLETOOLS = "enableTools";
	public final static String ATTR_GETENABLETOOLSPSDEFIELD = "getEnableToolsPSDEField";
	public final static String ATTR_GETGENERATIONMODE = "generationMode";
	public final static String ATTR_GETGENERATIONMODEPSDEFIELD = "getGenerationModePSDEField";
	public final static String ATTR_GETMAXINPUTTOKENS = "maxInputTokens";
	public final static String ATTR_GETMAXINPUTTOKENSPSDEFIELD = "getMaxInputTokensPSDEField";
	public final static String ATTR_GETMAXTOKENS = "maxTokens";
	public final static String ATTR_GETMAXTOKENSPSDEFIELD = "getMaxTokensPSDEField";
	public final static String ATTR_GETMEMORYMAXTURNS = "memoryMaxTurns";
	public final static String ATTR_GETMEMORYMAXTURNSPSDEFIELD = "getMemoryMaxTurnsPSDEField";
	public final static String ATTR_GETMEMORYMODE = "memoryMode";
	public final static String ATTR_GETMEMORYMODEPSDEFIELD = "getMemoryModePSDEField";
	public final static String ATTR_GETNAMEPSDEFIELD = "getNamePSDEField";
	public final static String ATTR_GETPSDEDATASET = "getPSDEDataSet";
	public final static String ATTR_GETPSDELOGIC = "getPSDELogic";
	public final static String ATTR_GETPSDATAENTITY = "getPSDataEntity";
	public final static String ATTR_GETPSSYSSFPLUGIN = "getPSSysSFPlugin";
	public final static String ATTR_GETPSSYSUNIRES = "getPSSysUniRes";
	public final static String ATTR_GETSTREAM = "stream";
	public final static String ATTR_GETSTREAMPSDEFIELD = "getStreamPSDEField";
	public final static String ATTR_GETSUGGESTIONPROMPT = "suggestionPrompt";
	public final static String ATTR_GETSUGGESTIONPROMPTPSDEFIELD = "getSuggestionPromptPSDEField";
	public final static String ATTR_GETSYSTEMPROMPT = "systemPrompt";
	public final static String ATTR_GETSYSTEMPROMPTPSDEFIELD = "getSystemPromptPSDEField";
	public final static String ATTR_GETTEMPERATURE = "temperature";
	public final static String ATTR_GETTEMPERATUREPSDEFIELD = "getTemperaturePSDEField";
	public final static String ATTR_GETTOOLEXCEEDMESSAGE = "toolExceedMessage";
	public final static String ATTR_GETTOOLEXCEEDMESSAGEPSDEFIELD = "getToolExceedMessagePSDEField";
	public final static String ATTR_GETTOOLMAXCALLS = "toolMaxCalls";
	public final static String ATTR_GETTOOLMAXCALLSPSDEFIELD = "getToolMaxCallsPSDEField";
	public final static String ATTR_GETTOPP = "topP";
	public final static String ATTR_GETTOPPPSDEFIELD = "getTopPPSDEField";
	public final static String ATTR_GETTRIMMINGSTRATEGY = "trimmingStrategy";
	public final static String ATTR_GETTRIMMINGSTRATEGYPSDEFIELD = "getTrimmingStrategyPSDEField";
	public final static String ATTR_GETUNIQUETAGPSDEFIELD = "getUniqueTagPSDEField";
	public final static String ATTR_GETWELCOMEMESSAGE = "welcomeMessage";
	public final static String ATTR_GETWELCOMEMESSAGEPSDEFIELD = "getWelcomeMessagePSDEField";

	public java.lang.String getAIPlatformType(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETAIPLATFORMTYPE);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getAgentInfo(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETAGENTINFO);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public com.fasterxml.jackson.databind.node.ObjectNode getAgentParams(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETAGENTPARAMS);
		if(value == null){
			return null;
		}
		return (com.fasterxml.jackson.databind.node.ObjectNode)value;
	}

	public java.lang.String getAgentTag(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETAGENTTAG);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getAgentTag2(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETAGENTTAG2);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getAgentType(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETAGENTTYPE);
		if(value == null){
			return null;
		}
		return value.asText();
	}

	public java.lang.String getCodeName(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETCODENAME);
		if(value == null){
			return null;
		}
		return value.asText();
	}
	private net.ibizsys.model.dataentity.defield.IPSDEField defaultflagpsdefield;

	public net.ibizsys.model.dataentity.defield.IPSDEField getDefaultFlagPSDEField(){
		if(this.defaultflagpsdefield != null) return this.defaultflagpsdefield;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETDEFAULTFLAGPSDEFIELD);
		if(value == null){
			return null;
		}
		net.ibizsys.model.dataentity.IPSDataEntity ipsdataentity = this.getPSDataEntityMust();
		this.defaultflagpsdefield = ipsdataentity.getPSDEField(value, false);
		return this.defaultflagpsdefield;
	}

	public net.ibizsys.model.dataentity.defield.IPSDEField getDefaultFlagPSDEFieldMust(){
		net.ibizsys.model.dataentity.defield.IPSDEField value = this.getDefaultFlagPSDEField();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定默认标志值属性");}
		return value;
	}

	public void setDefaultFlagPSDEField(net.ibizsys.model.dataentity.defield.IPSDEField defaultflagpsdefield){
		this.defaultflagpsdefield = defaultflagpsdefield;
	}


	public int getDynamicMode(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETDYNAMICMODE);
		if(value == null){
			return 0;
		}
		return value.asInt();
	}

	public java.lang.Boolean getEnableSuggestedQuestions(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETENABLESUGGESTEDQUESTIONS);
		if(value == null){
			return null;
		}
		return value.asBoolean();
	}
	private net.ibizsys.model.dataentity.defield.IPSDEField enablesuggestedquestionspsdefield;

	public net.ibizsys.model.dataentity.defield.IPSDEField getEnableSuggestedQuestionsPSDEField(){
		if(this.enablesuggestedquestionspsdefield != null) return this.enablesuggestedquestionspsdefield;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETENABLESUGGESTEDQUESTIONSPSDEFIELD);
		if(value == null){
			return null;
		}
		net.ibizsys.model.dataentity.IPSDataEntity ipsdataentity = this.getPSDataEntityMust();
		this.enablesuggestedquestionspsdefield = ipsdataentity.getPSDEField(value, false);
		return this.enablesuggestedquestionspsdefield;
	}

	public net.ibizsys.model.dataentity.defield.IPSDEField getEnableSuggestedQuestionsPSDEFieldMust(){
		net.ibizsys.model.dataentity.defield.IPSDEField value = this.getEnableSuggestedQuestionsPSDEField();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定启用问题建议值属性");}
		return value;
	}

	public void setEnableSuggestedQuestionsPSDEField(net.ibizsys.model.dataentity.defield.IPSDEField enablesuggestedquestionspsdefield){
		this.enablesuggestedquestionspsdefield = enablesuggestedquestionspsdefield;
	}


	public java.lang.Boolean getEnableThinking(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETENABLETHINKING);
		if(value == null){
			return null;
		}
		return value.asBoolean();
	}
	private net.ibizsys.model.dataentity.defield.IPSDEField enablethinkingpsdefield;

	public net.ibizsys.model.dataentity.defield.IPSDEField getEnableThinkingPSDEField(){
		if(this.enablethinkingpsdefield != null) return this.enablethinkingpsdefield;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETENABLETHINKINGPSDEFIELD);
		if(value == null){
			return null;
		}
		net.ibizsys.model.dataentity.IPSDataEntity ipsdataentity = this.getPSDataEntityMust();
		this.enablethinkingpsdefield = ipsdataentity.getPSDEField(value, false);
		return this.enablethinkingpsdefield;
	}

	public net.ibizsys.model.dataentity.defield.IPSDEField getEnableThinkingPSDEFieldMust(){
		net.ibizsys.model.dataentity.defield.IPSDEField value = this.getEnableThinkingPSDEField();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定启用思考链值属性");}
		return value;
	}

	public void setEnableThinkingPSDEField(net.ibizsys.model.dataentity.defield.IPSDEField enablethinkingpsdefield){
		this.enablethinkingpsdefield = enablethinkingpsdefield;
	}


	public java.lang.Boolean getEnableTools(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETENABLETOOLS);
		if(value == null){
			return null;
		}
		return value.asBoolean();
	}
	private net.ibizsys.model.dataentity.defield.IPSDEField enabletoolspsdefield;

	public net.ibizsys.model.dataentity.defield.IPSDEField getEnableToolsPSDEField(){
		if(this.enabletoolspsdefield != null) return this.enabletoolspsdefield;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETENABLETOOLSPSDEFIELD);
		if(value == null){
			return null;
		}
		net.ibizsys.model.dataentity.IPSDataEntity ipsdataentity = this.getPSDataEntityMust();
		this.enabletoolspsdefield = ipsdataentity.getPSDEField(value, false);
		return this.enabletoolspsdefield;
	}

	public net.ibizsys.model.dataentity.defield.IPSDEField getEnableToolsPSDEFieldMust(){
		net.ibizsys.model.dataentity.defield.IPSDEField value = this.getEnableToolsPSDEField();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定调用工具值属性");}
		return value;
	}

	public void setEnableToolsPSDEField(net.ibizsys.model.dataentity.defield.IPSDEField enabletoolspsdefield){
		this.enabletoolspsdefield = enabletoolspsdefield;
	}


	public java.lang.String getGenerationMode(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETGENERATIONMODE);
		if(value == null){
			return null;
		}
		return value.asText();
	}
	private net.ibizsys.model.dataentity.defield.IPSDEField generationmodepsdefield;

	public net.ibizsys.model.dataentity.defield.IPSDEField getGenerationModePSDEField(){
		if(this.generationmodepsdefield != null) return this.generationmodepsdefield;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETGENERATIONMODEPSDEFIELD);
		if(value == null){
			return null;
		}
		net.ibizsys.model.dataentity.IPSDataEntity ipsdataentity = this.getPSDataEntityMust();
		this.generationmodepsdefield = ipsdataentity.getPSDEField(value, false);
		return this.generationmodepsdefield;
	}

	public net.ibizsys.model.dataentity.defield.IPSDEField getGenerationModePSDEFieldMust(){
		net.ibizsys.model.dataentity.defield.IPSDEField value = this.getGenerationModePSDEField();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定生成模式值属性");}
		return value;
	}

	public void setGenerationModePSDEField(net.ibizsys.model.dataentity.defield.IPSDEField generationmodepsdefield){
		this.generationmodepsdefield = generationmodepsdefield;
	}


	public java.lang.Integer getMaxInputTokens(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETMAXINPUTTOKENS);
		if(value == null){
			return null;
		}
		return value.asInt();
	}
	private net.ibizsys.model.dataentity.defield.IPSDEField maxinputtokenspsdefield;

	public net.ibizsys.model.dataentity.defield.IPSDEField getMaxInputTokensPSDEField(){
		if(this.maxinputtokenspsdefield != null) return this.maxinputtokenspsdefield;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETMAXINPUTTOKENSPSDEFIELD);
		if(value == null){
			return null;
		}
		net.ibizsys.model.dataentity.IPSDataEntity ipsdataentity = this.getPSDataEntityMust();
		this.maxinputtokenspsdefield = ipsdataentity.getPSDEField(value, false);
		return this.maxinputtokenspsdefield;
	}

	public net.ibizsys.model.dataentity.defield.IPSDEField getMaxInputTokensPSDEFieldMust(){
		net.ibizsys.model.dataentity.defield.IPSDEField value = this.getMaxInputTokensPSDEField();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定最大输入token数值属性");}
		return value;
	}

	public void setMaxInputTokensPSDEField(net.ibizsys.model.dataentity.defield.IPSDEField maxinputtokenspsdefield){
		this.maxinputtokenspsdefield = maxinputtokenspsdefield;
	}


	public java.lang.Integer getMaxTokens(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETMAXTOKENS);
		if(value == null){
			return null;
		}
		return value.asInt();
	}
	private net.ibizsys.model.dataentity.defield.IPSDEField maxtokenspsdefield;

	public net.ibizsys.model.dataentity.defield.IPSDEField getMaxTokensPSDEField(){
		if(this.maxtokenspsdefield != null) return this.maxtokenspsdefield;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETMAXTOKENSPSDEFIELD);
		if(value == null){
			return null;
		}
		net.ibizsys.model.dataentity.IPSDataEntity ipsdataentity = this.getPSDataEntityMust();
		this.maxtokenspsdefield = ipsdataentity.getPSDEField(value, false);
		return this.maxtokenspsdefield;
	}

	public net.ibizsys.model.dataentity.defield.IPSDEField getMaxTokensPSDEFieldMust(){
		net.ibizsys.model.dataentity.defield.IPSDEField value = this.getMaxTokensPSDEField();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定最大token数值属性");}
		return value;
	}

	public void setMaxTokensPSDEField(net.ibizsys.model.dataentity.defield.IPSDEField maxtokenspsdefield){
		this.maxtokenspsdefield = maxtokenspsdefield;
	}


	public java.lang.Integer getMemoryMaxTurns(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETMEMORYMAXTURNS);
		if(value == null){
			return null;
		}
		return value.asInt();
	}
	private net.ibizsys.model.dataentity.defield.IPSDEField memorymaxturnspsdefield;

	public net.ibizsys.model.dataentity.defield.IPSDEField getMemoryMaxTurnsPSDEField(){
		if(this.memorymaxturnspsdefield != null) return this.memorymaxturnspsdefield;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETMEMORYMAXTURNSPSDEFIELD);
		if(value == null){
			return null;
		}
		net.ibizsys.model.dataentity.IPSDataEntity ipsdataentity = this.getPSDataEntityMust();
		this.memorymaxturnspsdefield = ipsdataentity.getPSDEField(value, false);
		return this.memorymaxturnspsdefield;
	}

	public net.ibizsys.model.dataentity.defield.IPSDEField getMemoryMaxTurnsPSDEFieldMust(){
		net.ibizsys.model.dataentity.defield.IPSDEField value = this.getMemoryMaxTurnsPSDEField();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定记忆对话轮数值属性");}
		return value;
	}

	public void setMemoryMaxTurnsPSDEField(net.ibizsys.model.dataentity.defield.IPSDEField memorymaxturnspsdefield){
		this.memorymaxturnspsdefield = memorymaxturnspsdefield;
	}


	public java.lang.String getMemoryMode(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETMEMORYMODE);
		if(value == null){
			return null;
		}
		return value.asText();
	}
	private net.ibizsys.model.dataentity.defield.IPSDEField memorymodepsdefield;

	public net.ibizsys.model.dataentity.defield.IPSDEField getMemoryModePSDEField(){
		if(this.memorymodepsdefield != null) return this.memorymodepsdefield;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETMEMORYMODEPSDEFIELD);
		if(value == null){
			return null;
		}
		net.ibizsys.model.dataentity.IPSDataEntity ipsdataentity = this.getPSDataEntityMust();
		this.memorymodepsdefield = ipsdataentity.getPSDEField(value, false);
		return this.memorymodepsdefield;
	}

	public net.ibizsys.model.dataentity.defield.IPSDEField getMemoryModePSDEFieldMust(){
		net.ibizsys.model.dataentity.defield.IPSDEField value = this.getMemoryModePSDEField();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定记忆模式值属性");}
		return value;
	}

	public void setMemoryModePSDEField(net.ibizsys.model.dataentity.defield.IPSDEField memorymodepsdefield){
		this.memorymodepsdefield = memorymodepsdefield;
	}

	private net.ibizsys.model.dataentity.defield.IPSDEField namepsdefield;

	public net.ibizsys.model.dataentity.defield.IPSDEField getNamePSDEField(){
		if(this.namepsdefield != null) return this.namepsdefield;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETNAMEPSDEFIELD);
		if(value == null){
			return null;
		}
		net.ibizsys.model.dataentity.IPSDataEntity ipsdataentity = this.getPSDataEntityMust();
		this.namepsdefield = ipsdataentity.getPSDEField(value, false);
		return this.namepsdefield;
	}

	public net.ibizsys.model.dataentity.defield.IPSDEField getNamePSDEFieldMust(){
		net.ibizsys.model.dataentity.defield.IPSDEField value = this.getNamePSDEField();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定名称值属性");}
		return value;
	}

	public void setNamePSDEField(net.ibizsys.model.dataentity.defield.IPSDEField namepsdefield){
		this.namepsdefield = namepsdefield;
	}

	private net.ibizsys.model.dataentity.ds.IPSDEDataSet psdedataset;

	public net.ibizsys.model.dataentity.ds.IPSDEDataSet getPSDEDataSet(){
		if(this.psdedataset != null) return this.psdedataset;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPSDEDATASET);
		if(value == null){
			return null;
		}
		net.ibizsys.model.dataentity.IPSDataEntity ipsdataentity = this.getPSDataEntityMust();
		this.psdedataset = ipsdataentity.getPSDEDataSet(value, false);
		return this.psdedataset;
	}

	public net.ibizsys.model.dataentity.ds.IPSDEDataSet getPSDEDataSetMust(){
		net.ibizsys.model.dataentity.ds.IPSDEDataSet value = this.getPSDEDataSet();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定实体数据集");}
		return value;
	}

	public void setPSDEDataSet(net.ibizsys.model.dataentity.ds.IPSDEDataSet psdedataset){
		this.psdedataset = psdedataset;
	}

	private net.ibizsys.model.dataentity.logic.IPSDELogic psdelogic;

	public net.ibizsys.model.dataentity.logic.IPSDELogic getPSDELogic(){
		if(this.psdelogic != null) return this.psdelogic;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPSDELOGIC);
		if(value == null){
			return null;
		}
		net.ibizsys.model.dataentity.IPSDataEntity ipsdataentity = this.getPSDataEntityMust();
		this.psdelogic = ipsdataentity.getPSDELogic(value, false);
		return this.psdelogic;
	}

	public net.ibizsys.model.dataentity.logic.IPSDELogic getPSDELogicMust(){
		net.ibizsys.model.dataentity.logic.IPSDELogic value = this.getPSDELogic();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定实体逻辑");}
		return value;
	}

	public void setPSDELogic(net.ibizsys.model.dataentity.logic.IPSDELogic psdelogic){
		this.psdelogic = psdelogic;
	}

	private net.ibizsys.model.dataentity.IPSDataEntity psdataentity;

	public net.ibizsys.model.dataentity.IPSDataEntity getPSDataEntity(){
		if(this.psdataentity != null) return this.psdataentity;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPSDATAENTITY);
		if(value == null){
			return null;
		}
		this.psdataentity = getPSModelObject(net.ibizsys.model.dataentity.IPSDataEntity.class, (com.fasterxml.jackson.databind.node.ObjectNode)value, ATTR_GETPSDATAENTITY);
		return this.psdataentity;
	}

	public net.ibizsys.model.dataentity.IPSDataEntity getPSDataEntityMust(){
		net.ibizsys.model.dataentity.IPSDataEntity value = this.getPSDataEntity();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定实体对象");}
		return value;
	}

	public void setPSDataEntity(net.ibizsys.model.dataentity.IPSDataEntity psdataentity){
		this.psdataentity = psdataentity;
	}

	private net.ibizsys.model.res.IPSSysSFPlugin pssyssfplugin;

	public net.ibizsys.model.res.IPSSysSFPlugin getPSSysSFPlugin(){
		if(this.pssyssfplugin != null) return this.pssyssfplugin;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPSSYSSFPLUGIN);
		if(value == null){
			return null;
		}
		this.pssyssfplugin = getPSModelObject(net.ibizsys.model.res.IPSSysSFPlugin.class, (com.fasterxml.jackson.databind.node.ObjectNode)value, ATTR_GETPSSYSSFPLUGIN);
		return this.pssyssfplugin;
	}

	public net.ibizsys.model.res.IPSSysSFPlugin getPSSysSFPluginMust(){
		net.ibizsys.model.res.IPSSysSFPlugin value = this.getPSSysSFPlugin();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定后台扩展插件");}
		return value;
	}

	public void setPSSysSFPlugin(net.ibizsys.model.res.IPSSysSFPlugin pssyssfplugin){
		this.pssyssfplugin = pssyssfplugin;
	}

	private net.ibizsys.model.security.IPSSysUniRes pssysunires;

	public net.ibizsys.model.security.IPSSysUniRes getPSSysUniRes(){
		if(this.pssysunires != null) return this.pssysunires;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETPSSYSUNIRES);
		if(value == null){
			return null;
		}
		this.pssysunires = getPSModelObject(net.ibizsys.model.security.IPSSysUniRes.class, (com.fasterxml.jackson.databind.node.ObjectNode)value, ATTR_GETPSSYSUNIRES);
		return this.pssysunires;
	}

	public net.ibizsys.model.security.IPSSysUniRes getPSSysUniResMust(){
		net.ibizsys.model.security.IPSSysUniRes value = this.getPSSysUniRes();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定权限统一资源对象");}
		return value;
	}

	public void setPSSysUniRes(net.ibizsys.model.security.IPSSysUniRes pssysunires){
		this.pssysunires = pssysunires;
	}


	public java.lang.Boolean getStream(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETSTREAM);
		if(value == null){
			return null;
		}
		return value.asBoolean();
	}
	private net.ibizsys.model.dataentity.defield.IPSDEField streampsdefield;

	public net.ibizsys.model.dataentity.defield.IPSDEField getStreamPSDEField(){
		if(this.streampsdefield != null) return this.streampsdefield;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETSTREAMPSDEFIELD);
		if(value == null){
			return null;
		}
		net.ibizsys.model.dataentity.IPSDataEntity ipsdataentity = this.getPSDataEntityMust();
		this.streampsdefield = ipsdataentity.getPSDEField(value, false);
		return this.streampsdefield;
	}

	public net.ibizsys.model.dataentity.defield.IPSDEField getStreamPSDEFieldMust(){
		net.ibizsys.model.dataentity.defield.IPSDEField value = this.getStreamPSDEField();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定启用流值属性");}
		return value;
	}

	public void setStreamPSDEField(net.ibizsys.model.dataentity.defield.IPSDEField streampsdefield){
		this.streampsdefield = streampsdefield;
	}


	public java.lang.String getSuggestionPrompt(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETSUGGESTIONPROMPT);
		if(value == null){
			return null;
		}
		return value.asText();
	}
	private net.ibizsys.model.dataentity.defield.IPSDEField suggestionpromptpsdefield;

	public net.ibizsys.model.dataentity.defield.IPSDEField getSuggestionPromptPSDEField(){
		if(this.suggestionpromptpsdefield != null) return this.suggestionpromptpsdefield;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETSUGGESTIONPROMPTPSDEFIELD);
		if(value == null){
			return null;
		}
		net.ibizsys.model.dataentity.IPSDataEntity ipsdataentity = this.getPSDataEntityMust();
		this.suggestionpromptpsdefield = ipsdataentity.getPSDEField(value, false);
		return this.suggestionpromptpsdefield;
	}

	public net.ibizsys.model.dataentity.defield.IPSDEField getSuggestionPromptPSDEFieldMust(){
		net.ibizsys.model.dataentity.defield.IPSDEField value = this.getSuggestionPromptPSDEField();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定建议提示词值属性");}
		return value;
	}

	public void setSuggestionPromptPSDEField(net.ibizsys.model.dataentity.defield.IPSDEField suggestionpromptpsdefield){
		this.suggestionpromptpsdefield = suggestionpromptpsdefield;
	}


	public java.lang.String getSystemPrompt(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETSYSTEMPROMPT);
		if(value == null){
			return null;
		}
		return value.asText();
	}
	private net.ibizsys.model.dataentity.defield.IPSDEField systempromptpsdefield;

	public net.ibizsys.model.dataentity.defield.IPSDEField getSystemPromptPSDEField(){
		if(this.systempromptpsdefield != null) return this.systempromptpsdefield;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETSYSTEMPROMPTPSDEFIELD);
		if(value == null){
			return null;
		}
		net.ibizsys.model.dataentity.IPSDataEntity ipsdataentity = this.getPSDataEntityMust();
		this.systempromptpsdefield = ipsdataentity.getPSDEField(value, false);
		return this.systempromptpsdefield;
	}

	public net.ibizsys.model.dataentity.defield.IPSDEField getSystemPromptPSDEFieldMust(){
		net.ibizsys.model.dataentity.defield.IPSDEField value = this.getSystemPromptPSDEField();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定系统提示词值属性");}
		return value;
	}

	public void setSystemPromptPSDEField(net.ibizsys.model.dataentity.defield.IPSDEField systempromptpsdefield){
		this.systempromptpsdefield = systempromptpsdefield;
	}


	public java.lang.Double getTemperature(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETTEMPERATURE);
		if(value == null){
			return null;
		}
		return value.asDouble();
	}
	private net.ibizsys.model.dataentity.defield.IPSDEField temperaturepsdefield;

	public net.ibizsys.model.dataentity.defield.IPSDEField getTemperaturePSDEField(){
		if(this.temperaturepsdefield != null) return this.temperaturepsdefield;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETTEMPERATUREPSDEFIELD);
		if(value == null){
			return null;
		}
		net.ibizsys.model.dataentity.IPSDataEntity ipsdataentity = this.getPSDataEntityMust();
		this.temperaturepsdefield = ipsdataentity.getPSDEField(value, false);
		return this.temperaturepsdefield;
	}

	public net.ibizsys.model.dataentity.defield.IPSDEField getTemperaturePSDEFieldMust(){
		net.ibizsys.model.dataentity.defield.IPSDEField value = this.getTemperaturePSDEField();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定随机性参数值属性");}
		return value;
	}

	public void setTemperaturePSDEField(net.ibizsys.model.dataentity.defield.IPSDEField temperaturepsdefield){
		this.temperaturepsdefield = temperaturepsdefield;
	}


	public java.lang.String getToolExceedMessage(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETTOOLEXCEEDMESSAGE);
		if(value == null){
			return null;
		}
		return value.asText();
	}
	private net.ibizsys.model.dataentity.defield.IPSDEField toolexceedmessagepsdefield;

	public net.ibizsys.model.dataentity.defield.IPSDEField getToolExceedMessagePSDEField(){
		if(this.toolexceedmessagepsdefield != null) return this.toolexceedmessagepsdefield;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETTOOLEXCEEDMESSAGEPSDEFIELD);
		if(value == null){
			return null;
		}
		net.ibizsys.model.dataentity.IPSDataEntity ipsdataentity = this.getPSDataEntityMust();
		this.toolexceedmessagepsdefield = ipsdataentity.getPSDEField(value, false);
		return this.toolexceedmessagepsdefield;
	}

	public net.ibizsys.model.dataentity.defield.IPSDEField getToolExceedMessagePSDEFieldMust(){
		net.ibizsys.model.dataentity.defield.IPSDEField value = this.getToolExceedMessagePSDEField();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定工具调用超限提示语值属性");}
		return value;
	}

	public void setToolExceedMessagePSDEField(net.ibizsys.model.dataentity.defield.IPSDEField toolexceedmessagepsdefield){
		this.toolexceedmessagepsdefield = toolexceedmessagepsdefield;
	}


	public java.lang.Integer getToolMaxCalls(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETTOOLMAXCALLS);
		if(value == null){
			return null;
		}
		return value.asInt();
	}
	private net.ibizsys.model.dataentity.defield.IPSDEField toolmaxcallspsdefield;

	public net.ibizsys.model.dataentity.defield.IPSDEField getToolMaxCallsPSDEField(){
		if(this.toolmaxcallspsdefield != null) return this.toolmaxcallspsdefield;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETTOOLMAXCALLSPSDEFIELD);
		if(value == null){
			return null;
		}
		net.ibizsys.model.dataentity.IPSDataEntity ipsdataentity = this.getPSDataEntityMust();
		this.toolmaxcallspsdefield = ipsdataentity.getPSDEField(value, false);
		return this.toolmaxcallspsdefield;
	}

	public net.ibizsys.model.dataentity.defield.IPSDEField getToolMaxCallsPSDEFieldMust(){
		net.ibizsys.model.dataentity.defield.IPSDEField value = this.getToolMaxCallsPSDEField();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定最大工具调用次数值属性");}
		return value;
	}

	public void setToolMaxCallsPSDEField(net.ibizsys.model.dataentity.defield.IPSDEField toolmaxcallspsdefield){
		this.toolmaxcallspsdefield = toolmaxcallspsdefield;
	}


	public java.lang.Double getTopP(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETTOPP);
		if(value == null){
			return null;
		}
		return value.asDouble();
	}
	private net.ibizsys.model.dataentity.defield.IPSDEField topppsdefield;

	public net.ibizsys.model.dataentity.defield.IPSDEField getTopPPSDEField(){
		if(this.topppsdefield != null) return this.topppsdefield;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETTOPPPSDEFIELD);
		if(value == null){
			return null;
		}
		net.ibizsys.model.dataentity.IPSDataEntity ipsdataentity = this.getPSDataEntityMust();
		this.topppsdefield = ipsdataentity.getPSDEField(value, false);
		return this.topppsdefield;
	}

	public net.ibizsys.model.dataentity.defield.IPSDEField getTopPPSDEFieldMust(){
		net.ibizsys.model.dataentity.defield.IPSDEField value = this.getTopPPSDEField();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定概率核采样值属性");}
		return value;
	}

	public void setTopPPSDEField(net.ibizsys.model.dataentity.defield.IPSDEField topppsdefield){
		this.topppsdefield = topppsdefield;
	}


	public java.lang.String getTrimmingStrategy(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETTRIMMINGSTRATEGY);
		if(value == null){
			return null;
		}
		return value.asText();
	}
	private net.ibizsys.model.dataentity.defield.IPSDEField trimmingstrategypsdefield;

	public net.ibizsys.model.dataentity.defield.IPSDEField getTrimmingStrategyPSDEField(){
		if(this.trimmingstrategypsdefield != null) return this.trimmingstrategypsdefield;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETTRIMMINGSTRATEGYPSDEFIELD);
		if(value == null){
			return null;
		}
		net.ibizsys.model.dataentity.IPSDataEntity ipsdataentity = this.getPSDataEntityMust();
		this.trimmingstrategypsdefield = ipsdataentity.getPSDEField(value, false);
		return this.trimmingstrategypsdefield;
	}

	public net.ibizsys.model.dataentity.defield.IPSDEField getTrimmingStrategyPSDEFieldMust(){
		net.ibizsys.model.dataentity.defield.IPSDEField value = this.getTrimmingStrategyPSDEField();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定截断策略值属性");}
		return value;
	}

	public void setTrimmingStrategyPSDEField(net.ibizsys.model.dataentity.defield.IPSDEField trimmingstrategypsdefield){
		this.trimmingstrategypsdefield = trimmingstrategypsdefield;
	}

	private net.ibizsys.model.dataentity.defield.IPSDEField uniquetagpsdefield;

	public net.ibizsys.model.dataentity.defield.IPSDEField getUniqueTagPSDEField(){
		if(this.uniquetagpsdefield != null) return this.uniquetagpsdefield;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETUNIQUETAGPSDEFIELD);
		if(value == null){
			return null;
		}
		net.ibizsys.model.dataentity.IPSDataEntity ipsdataentity = this.getPSDataEntityMust();
		this.uniquetagpsdefield = ipsdataentity.getPSDEField(value, false);
		return this.uniquetagpsdefield;
	}

	public net.ibizsys.model.dataentity.defield.IPSDEField getUniqueTagPSDEFieldMust(){
		net.ibizsys.model.dataentity.defield.IPSDEField value = this.getUniqueTagPSDEField();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定唯一标记值属性");}
		return value;
	}

	public void setUniqueTagPSDEField(net.ibizsys.model.dataentity.defield.IPSDEField uniquetagpsdefield){
		this.uniquetagpsdefield = uniquetagpsdefield;
	}


	public java.lang.String getWelcomeMessage(){
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETWELCOMEMESSAGE);
		if(value == null){
			return null;
		}
		return value.asText();
	}
	private net.ibizsys.model.dataentity.defield.IPSDEField welcomemessagepsdefield;

	public net.ibizsys.model.dataentity.defield.IPSDEField getWelcomeMessagePSDEField(){
		if(this.welcomemessagepsdefield != null) return this.welcomemessagepsdefield;
		com.fasterxml.jackson.databind.JsonNode value = this.getObjectNode().get(ATTR_GETWELCOMEMESSAGEPSDEFIELD);
		if(value == null){
			return null;
		}
		net.ibizsys.model.dataentity.IPSDataEntity ipsdataentity = this.getPSDataEntityMust();
		this.welcomemessagepsdefield = ipsdataentity.getPSDEField(value, false);
		return this.welcomemessagepsdefield;
	}

	public net.ibizsys.model.dataentity.defield.IPSDEField getWelcomeMessagePSDEFieldMust(){
		net.ibizsys.model.dataentity.defield.IPSDEField value = this.getWelcomeMessagePSDEField();
		if(value == null){throw new net.ibizsys.model.PSModelException(this, "未指定欢迎消息值属性");}
		return value;
	}

	public void setWelcomeMessagePSDEField(net.ibizsys.model.dataentity.defield.IPSDEField welcomemessagepsdefield){
		this.welcomemessagepsdefield = welcomemessagepsdefield;
	}

}