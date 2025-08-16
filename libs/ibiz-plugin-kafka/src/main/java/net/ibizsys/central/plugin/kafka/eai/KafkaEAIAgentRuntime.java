package net.ibizsys.central.plugin.kafka.eai;

import java.time.Duration;
import java.util.Properties;

import org.apache.kafka.clients.consumer.Consumer;
import org.apache.kafka.clients.consumer.ConsumerConfig;
import org.apache.kafka.clients.consumer.ConsumerRecords;
import org.apache.kafka.clients.consumer.KafkaConsumer;
import org.apache.kafka.clients.producer.KafkaProducer;
import org.apache.kafka.clients.producer.Producer;
import org.apache.kafka.clients.producer.ProducerConfig;
import org.apache.kafka.clients.producer.ProducerRecord;
import org.apache.kafka.common.serialization.StringDeserializer;
import org.apache.kafka.common.serialization.StringSerializer;
import org.springframework.util.StringUtils;

import net.ibizsys.central.cloud.core.eai.SysEAIAgentRuntimeBase;
import net.ibizsys.central.cloud.core.spring.rt.ServiceHub;
import net.ibizsys.runtime.res.SysDataSyncAgentDirs;
import net.ibizsys.runtime.util.JsonUtils;
import net.ibizsys.runtime.util.KeyValueUtils;
import net.ibizsys.runtime.util.LogLevels;

/**
 * Kafka 应用集成代理运行时对象
 * @author lionlau
 *
 */
public class KafkaEAIAgentRuntime extends SysEAIAgentRuntimeBase {

	private static final org.apache.commons.logging.Log log = org.apache.commons.logging.LogFactory.getLog(KafkaEAIAgentRuntime.class);
	
	private Producer<String, String> producer;
    private Consumer<String, String> consumer;
    
    private boolean bConsumerThreadRun = false;
	@Override
	protected void onInit() throws Exception {
		
		
		super.onInit();
		
		String strSyncDir = this.getPSSysDataSyncAgent().getSyncDir();
		if(SysDataSyncAgentDirs.INOUT.equals(strSyncDir)
				|| SysDataSyncAgentDirs.OUT.equals(strSyncDir)) {
			if(getProducer() == null) {
				this.prepareProducer();
			}
			if(getProducer() == null) {
				throw new Exception("生产者对象无效");
			}
		}
		if(SysDataSyncAgentDirs.INOUT.equals(strSyncDir)
				|| SysDataSyncAgentDirs.IN.equals(strSyncDir)) {
			if(getConsumer() == null) {
				this.prepareConsumer();
			}
			if(getConsumer() == null) {
				throw new Exception("消费者对象无效");
			}
			
			//开启接收线程
			startConsumerThread();
		}
	}
	
	
	protected void startConsumerThread() {
		setConsumerThreadRun(true);
		new Thread(new Runnable() {
			
			@Override
			public void run() {
				runConsumerThread();
			}
		}).start();
	}
	
	
	
	protected void setProducer(Producer<String, String> producer){
		this.producer = producer;
	}
	
	protected Producer<String, String> getProducer(){
		return this.producer;
	}
	
	protected void prepareProducer() throws Exception{
		Properties props = new Properties();
        props.put(ProducerConfig.ACKS_CONFIG, "all");
        props.put(ProducerConfig.RETRIES_CONFIG, 0);
        props.put(ProducerConfig.BATCH_SIZE_CONFIG, 16384);
        props.put(ProducerConfig.LINGER_MS_CONFIG, 1);
       // props.put(ProducerConfig.BUFFER_MEMORY_CONFIG, 33554432);
        props.put(ProducerConfig.KEY_SERIALIZER_CLASS_CONFIG, StringSerializer.class.getName());
        props.put(ProducerConfig.VALUE_SERIALIZER_CLASS_CONFIG, StringSerializer.class.getName());
        if(this.getPSSysDataSyncAgent().getAgentParams() != null) {
        	JsonUtils.fillProperties(this.getPSSysDataSyncAgent().getAgentParams(), props, "out.");
        }
        props.put(ProducerConfig.BOOTSTRAP_SERVERS_CONFIG, this.getServiceUrl());// 服务器ip:端口号，集群用逗号分隔
        
        this.setProducer(new KafkaProducer<>(props));
	}
	
	protected void closeProducer() throws Exception{
		Producer<String, String> producer = this.getProducer();
		if(producer != null) {
			producer.close();
			this.setProducer(null);
		}
	}
	
	@Override
	protected void onSend(String strTopic, String strData) throws Throwable {
		this.getProducer().send(new ProducerRecord<String, String>(StringUtils.hasLength(strTopic)?strTopic:this.getDefaultTopic(), strData));
	}
	
	protected void setConsumer(Consumer<String, String> consumer){
		this.consumer = consumer;
	}
	
	protected Consumer<String, String> getConsumer(){
		return this.consumer;
	}
	
	protected void prepareConsumer() throws Exception{
		Properties props = new Properties();
		
		props.setProperty(ConsumerConfig.KEY_DESERIALIZER_CLASS_CONFIG, StringDeserializer.class.getName());
		props.setProperty(ConsumerConfig.VALUE_DESERIALIZER_CLASS_CONFIG, StringDeserializer.class.getName());
		
		props.setProperty(ConsumerConfig.AUTO_OFFSET_RESET_CONFIG, "latest"); // earliest, none
		if(this.getPSSysDataSyncAgent().getAgentParams() != null) {
			JsonUtils.fillProperties(this.getPSSysDataSyncAgent().getAgentParams(), props, "in.");
        }
		props.setProperty(ConsumerConfig.BOOTSTRAP_SERVERS_CONFIG, this.getServiceUrl());
		props.setProperty(ConsumerConfig.GROUP_ID_CONFIG, this.getGroupId());
		
		props.setProperty(ConsumerConfig.GROUP_INSTANCE_ID_CONFIG, String.format("%1$s_%2$s", this.getGroupId(), KeyValueUtils.genUniqueId(ServiceHub.getInstance().getInstanceId(), this.getSystemRuntime().getDeploySystemId(), this.getPSSysDataSyncAgent().getId())));
		
		
		//props.put("client.id", "");
		Consumer<String, String> consumer = new KafkaConsumer<>(props);
		consumer.subscribe(this.getTopics());
		
		this.setConsumer(consumer);
	}
	
	protected void closeConsumer() throws Exception{
		this.setConsumerThreadRun(false);
		Consumer<String, String> consumer = this.getConsumer();
		if(consumer != null) {
			consumer.close();
			this.setClientSecret(null);
		}
	}
	
	
	protected boolean isConsumerThreadRun() {
		return this.bConsumerThreadRun;
	}
	
	protected void setConsumerThreadRun(boolean bConsumerThreadRun) {
		this.bConsumerThreadRun = bConsumerThreadRun;
	}

	
	protected void runConsumerThread() {
		while(isConsumerThreadRun()) {
	        //  从服务器开始拉取数据
	        ConsumerRecords<String, String> records = consumer.poll(Duration.ofMillis(100));
	        records.forEach(record -> {
//	            System.out.printf("topic = %s ,partition = %d,offset = %d, key = %s, value = %s%n", record.topic(), record.partition(),
//	                    record.offset(), record.key(), record.value());
	        	try {
	        		recv(record.topic(), record.value());
	        	}
	        	catch(Throwable ex) {
					log.error(String.format("系统应用集成代理[%1$s]处理接收数据发生异常，%2$s", this.getName(), ex.getMessage()), ex);
					this.getSystemRuntime().log(LogLevels.ERROR, "数据同步", String.format("系统应用集成代理[%1$s]处理接收数据发生异常，%2$s", this.getName(), ex.getMessage()), null);
				}
	        });
		}
	}
	
	
	@Override
	protected void onShutdown() throws Exception {
		try {
			this.closeConsumer();
		}
		catch (Exception ex) {
			log.error(String.format("关闭消费者发生异常，%1$s", ex.getMessage()), ex);
		}
		try {
			this.closeProducer();
		}
		catch (Exception ex) {
			log.error(String.format("关闭生产者发生异常，%1$s", ex.getMessage()), ex);
		}
		
		super.onShutdown();
	}
}
