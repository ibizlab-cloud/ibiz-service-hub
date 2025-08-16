package net.ibizsys.central.plugin.kafka;

import org.apache.kafka.clients.producer.*;

import java.util.Properties;

public class Test {

	public static void main(String[] args) {
		// Kafka 服务器地址和端口
		String bootstrapServers = "localhost:9092";

		// Kafka 主题名称
		String topicName = "testtest";

		// Kafka 生产者配置
		Properties props = new Properties();
		props.put("bootstrap.servers", bootstrapServers);
		props.put("key.serializer", "org.apache.kafka.common.serialization.StringSerializer");
		props.put("value.serializer", "org.apache.kafka.common.serialization.StringSerializer");

		// 创建 Kafka 生产者
		KafkaProducer<String, String> producer = new KafkaProducer<>(props);

		// 构建消息
		String key = "key1";
		String value = "Hello, Kafka!";

		// 创建消息记录
		ProducerRecord<String, String> record = new ProducerRecord<>(topicName, key, value);

		// 发送消息
		producer.send(record, new Callback() {
			@Override
			public void onCompletion(RecordMetadata metadata, Exception exception) {
				if (exception != null) {
					System.err.println("Error sending message: " + exception.getMessage());
				} else {
					System.out.println("Message sent successfully! Topic: " + metadata.topic() + ", Partition: " + metadata.partition() + ", Offset: " + metadata.offset());
				}
			}
		});

		// 关闭 Kafka 生产者
		producer.close();
	}
}
