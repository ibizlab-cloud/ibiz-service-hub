package cn.ibizlab.runner.servicerunner.appender;

import ch.qos.logback.core.AppenderBase;
import ch.qos.logback.core.encoder.Encoder;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;
import net.ibizsys.runtime.ISystemRuntime;
import net.ibizsys.runtime.util.SystemRuntimeHolder;
import org.eclipse.paho.client.mqttv3.MqttClient;
import org.eclipse.paho.client.mqttv3.MqttConnectOptions;
import org.eclipse.paho.client.mqttv3.MqttException;
import org.eclipse.paho.client.mqttv3.MqttMessage;
import org.eclipse.paho.client.mqttv3.persist.MemoryPersistence;
import org.springframework.util.StringUtils;

import java.nio.charset.StandardCharsets;

public class LogbackMqttAppender extends AppenderBase<Object> {
    private Encoder<Object> encoder;
    private String brokerUrl;
    private String topic;
    private String clientId;
    private MqttClient mqttClient;

    @Override
    public void start() {
        try {
            // 创建 MQTT 客户端
            mqttClient = new MqttClient(brokerUrl, clientId, new MemoryPersistence());
            MqttConnectOptions options = new MqttConnectOptions();
            options.setCleanSession(true);
            mqttClient.connect(options);
            super.start();
        } catch (MqttException e) {
            addError("Error while connecting to the MQTT broker", e);
        }
    }

    private static final ObjectMapper OBJECT_MAPPER = new ObjectMapper();
    @Override
    protected void append(Object eventObject) {
        try {
            // 使用 Encoder 格式化日志事件，并获取字节数组
            byte[] byteArray = encoder.encode(eventObject);
            // 将字节数组转换为字符串
            String formattedMessage = new String(byteArray, StandardCharsets.UTF_8);
            // 创建 MQTT 消息并设置格式化后的字符串
            ObjectNode jsonLog = OBJECT_MAPPER.createObjectNode();

            // 添加您要求的固定字段
            jsonLog.put("type", "CONSOLE");
            jsonLog.put("subtype", clientId);

            // 核心内容：将格式化后的日志字符串作为 'content' 字段的值
            jsonLog.put("content", formattedMessage);

            MqttMessage mqttMessage = new MqttMessage(OBJECT_MAPPER.writeValueAsBytes(jsonLog));
            // 发布 MQTT 消息

            mqttClient.publish(getDynaTopic(), mqttMessage);
        } catch (MqttException e) {
            addError("Error while publishing the MQTT message", e);
        } catch (JsonProcessingException e) {
            addError("Error while publishing the MQTT message", e);
        }
    }

    private String getDynaTopic() {
        ISystemRuntime iSystemRuntime =	SystemRuntimeHolder.peek();
        if(iSystemRuntime == null) {
            return topic;
        }

        String strPSDevSlnSysId = iSystemRuntime.getPSDevSlnSysId();
        if(!StringUtils.hasLength(strPSDevSlnSysId)) {
            return topic;
        }
        return strPSDevSlnSysId;
    }

    @Override
    public void stop() {
        try {
            // 关闭 MQTT 客户端
            if (mqttClient != null) {
                mqttClient.disconnect();
                mqttClient.close();
            }
        } catch (MqttException e) {
            addError("Error while disconnecting from the MQTT broker", e);
        }
        super.stop();
    }

    public String getBrokerUrl() {
        return brokerUrl;
    }

    public void setBrokerUrl(String brokerUrl) {
        this.brokerUrl = brokerUrl;
    }

    public String getTopic() {
        return topic;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }

    public String getClientId() {
        return clientId;
    }

    public void setClientId(String clientId) {
        this.clientId = clientId;
    }

    // Getter 和 Setter 方法
    public Encoder<Object> getEncoder() {
        return encoder;
    }

    public void setEncoder(Encoder<Object> encoder) {
        this.encoder = encoder;
    }
}

