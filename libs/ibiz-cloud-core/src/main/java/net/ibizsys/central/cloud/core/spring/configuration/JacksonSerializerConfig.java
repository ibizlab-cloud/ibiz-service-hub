package net.ibizsys.central.cloud.core.spring.configuration;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.TimeZone;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.converter.json.Jackson2ObjectMapperBuilder;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.PropertyAccessor;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.databind.deser.std.DateDeserializers;
import com.fasterxml.jackson.databind.module.SimpleModule;
import com.fasterxml.jackson.databind.ser.std.DateSerializer;
import com.fasterxml.jackson.databind.ser.std.ToStringSerializer;

import net.ibizsys.central.cloud.core.service.util.MethodHandlerBase;
import net.ibizsys.central.service.client.WebClientBase;

/**
 * 后端->前端全局序列化设置： 全局Long|BigInteger转String
 */
@Configuration
public class JacksonSerializerConfig {

	private static final org.apache.commons.logging.Log log = org.apache.commons.logging.LogFactory.getLog(JacksonSerializerConfig.class);

	private static final String PATTERN = "yyyy-MM-dd HH:mm:ss";
	private static final String TIME_ZONE = "GMT+8";

	@Autowired
	Jackson2ObjectMapperBuilder jackson2ObjectMapperBuilder;

	

	@Bean
	public MappingJackson2HttpMessageConverter mappingJackson2HttpMessageConverter(List<HttpMessageConverter<?>> converters) {
		MappingJackson2HttpMessageConverter converter = new MappingJackson2HttpMessageConverter();
		
		ObjectMapper objectMapper = this.getObjectMapper();
		MethodHandlerBase.MAPPER = objectMapper;
		
		WebClientBase.MAPPER = objectMapper;
		WebClientBase.OUTMAPPER = this.getObjectMapper2();
		
		converter.setObjectMapper(objectMapper);
		return converter;
	}

	
	private ObjectMapper getObjectMapper() {
		ObjectMapper objectMapper = jackson2ObjectMapperBuilder.build();
		objectMapper.setTimeZone(TimeZone.getTimeZone(TIME_ZONE));
		objectMapper.setVisibility(PropertyAccessor.ALL, JsonAutoDetect.Visibility.ANY);
		// 关闭日期序列化为时间戳的功能
		objectMapper.disable(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS);
		// 关闭序列化的时候没有为属性找到getter方法,报错
		objectMapper.disable(SerializationFeature.FAIL_ON_EMPTY_BEANS);
		// 序列化的时候序列对象的所有属性
		// objectMapper.setSerializationInclusion(JsonInclude.Include.ALWAYS);
		// 空值不序列化
		objectMapper.setSerializationInclusion(JsonInclude.Include.NON_NULL);
		// 序列化空对象不抛异常
		objectMapper.configure(SerializationFeature.FAIL_ON_EMPTY_BEANS, false);
		// 关闭反序列化的时候，没有找到属性的setter报错
		objectMapper.disable(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES);
		// 反序列化未知属性不抛出异常
		objectMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
		// 自定义序列化：key-序列化字段类型,value-序列化所用对象,支持自定义及Jackson自带序列化器
		SimpleModule module = new SimpleModule();
		String[] patternArr = PATTERN.split(" ");
		// module.addSerializer(LocalDateTime.class, new
		// LocalDateTimeSerializer(DateTimeFormatter.ofPattern(PATTERN)));
		// module.addSerializer(LocalDate.class, new
		// LocalDateSerializer(DateTimeFormatter.ofPattern(patternArr[0])));
		// module.addSerializer(LocalTime.class, new
		// LocalTimeSerializer(DateTimeFormatter.ofPattern(patternArr[1])));
		module.addSerializer(Date.class, new DateSerializer(false, new SimpleDateFormat(PATTERN)));

		// java.sql
		module.addSerializer(Timestamp.class, new DateSerializer(false, new SimpleDateFormat(PATTERN)));
		module.addSerializer(java.sql.Date.class, new DateSerializer(false, new SimpleDateFormat(PATTERN)));

		// Long BigInteger 转 String
		module.addSerializer(Long.class, ToStringSerializer.instance);
		module.addSerializer(BigInteger.class, ToStringSerializer.instance);
		module.addSerializer(BigDecimal.class, ToStringSerializer.instance);
		
		//module.addSerializer(IEntityDTO.class, , ser)
//		try {
//			BeanSerializer baseSerializer = (BeanSerializer) objectMapper.getSerializerProviderInstance()
//			        .findValueSerializer(IEntityDTO.class);
//			 // 创建 EntityDTOSerializer
//	        EntityDTOSerializer entityDTOSerializer = new EntityDTOSerializer(baseSerializer,
//	        		baseSerializer.g);
//	        // 在序列化过程中使用 EntityDTOSerializer
//	        module.addSerializer(IEntityDTO.class, entityDTOSerializer);
//		} catch (JsonMappingException ex) {
//			log.error(ex);
//		}

       
        

		// 自定义反序列化：key-序列化字段类型,value-序列化所用对象,支持自定义及Jackson自带序列化器
		// module.addDeserializer(LocalDateTime.class, new
		// LocalDateTimeDeserializer(DateTimeFormatter.ofPattern(PATTERN)));
		// module.addDeserializer(LocalDate.class, new
		// LocalDateDeserializer(DateTimeFormatter.ofPattern(patternArr[0])));
		// module.addDeserializer(LocalTime.class, new
		// LocalTimeDeserializer(DateTimeFormatter.ofPattern(patternArr[1])));
		module.addDeserializer(Date.class, new DateDeserializers.DateDeserializer() {
			@Override
			public Date deserialize(JsonParser jsonParser, DeserializationContext ctxt) {
				try {
					String text = jsonParser.getText().trim();
					SimpleDateFormat sdf = new SimpleDateFormat(PATTERN);
					return sdf.parse(text);
				} catch (Exception ex) {
					log.debug(ex);
					throw new RuntimeException(ex);
				}
			}
		});
		module.addDeserializer(Timestamp.class, new DateDeserializers.TimestampDeserializer() {
			@Override
			public Timestamp deserialize(JsonParser jsonParser, DeserializationContext ctxt) {
				try {
					String text = jsonParser.getText().trim();
					SimpleDateFormat sdf = new SimpleDateFormat(PATTERN);
					return new Timestamp(sdf.parse(text).getTime());
				} catch (Exception ex) {
					log.debug(ex);
					throw new RuntimeException(ex);
				}
			}
		});
		module.addDeserializer(java.sql.Date.class, new DateDeserializers.SqlDateDeserializer() {
			@Override
			public java.sql.Date deserialize(JsonParser jsonParser, DeserializationContext ctxt) {
				try {
					String text = jsonParser.getText().trim();
					SimpleDateFormat sdf = new SimpleDateFormat(PATTERN);
					return new java.sql.Date(sdf.parse(text).getTime());
				} catch (Exception ex) {
					log.debug(ex);
					throw new RuntimeException(ex);
				}
			}
		});
		objectMapper.registerModule(module);
		
		return objectMapper;
	}
	
	
	/**
	 * WebClient输出使用对象，空值也送出
	 * @return
	 */
	private ObjectMapper getObjectMapper2() {
		ObjectMapper objectMapper = jackson2ObjectMapperBuilder.build();
		objectMapper.setTimeZone(TimeZone.getTimeZone(TIME_ZONE));
		objectMapper.setVisibility(PropertyAccessor.ALL, JsonAutoDetect.Visibility.ANY);
		// 关闭日期序列化为时间戳的功能
		objectMapper.disable(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS);
		// 关闭序列化的时候没有为属性找到getter方法,报错
		objectMapper.disable(SerializationFeature.FAIL_ON_EMPTY_BEANS);
		// 序列化的时候序列对象的所有属性
		objectMapper.setSerializationInclusion(JsonInclude.Include.ALWAYS);
		// 空值不序列化
		// objectMapper.setSerializationInclusion(JsonInclude.Include.NON_NULL);
		// 序列化空对象不抛异常
		objectMapper.configure(SerializationFeature.FAIL_ON_EMPTY_BEANS, false);
		// 关闭反序列化的时候，没有找到属性的setter报错
		objectMapper.disable(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES);
		// 反序列化未知属性不抛出异常
		objectMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
		// 自定义序列化：key-序列化字段类型,value-序列化所用对象,支持自定义及Jackson自带序列化器
		SimpleModule module = new SimpleModule();
		String[] patternArr = PATTERN.split(" ");
		// module.addSerializer(LocalDateTime.class, new
		// LocalDateTimeSerializer(DateTimeFormatter.ofPattern(PATTERN)));
		// module.addSerializer(LocalDate.class, new
		// LocalDateSerializer(DateTimeFormatter.ofPattern(patternArr[0])));
		// module.addSerializer(LocalTime.class, new
		// LocalTimeSerializer(DateTimeFormatter.ofPattern(patternArr[1])));
		module.addSerializer(Date.class, new DateSerializer(false, new SimpleDateFormat(PATTERN)));

		// java.sql
		module.addSerializer(Timestamp.class, new DateSerializer(false, new SimpleDateFormat(PATTERN)));
		module.addSerializer(java.sql.Date.class, new DateSerializer(false, new SimpleDateFormat(PATTERN)));

		// Long BigInteger 转 String
		module.addSerializer(Long.class, ToStringSerializer.instance);
		module.addSerializer(BigInteger.class, ToStringSerializer.instance);
		module.addSerializer(BigDecimal.class, ToStringSerializer.instance);

		// 自定义反序列化：key-序列化字段类型,value-序列化所用对象,支持自定义及Jackson自带序列化器
		// module.addDeserializer(LocalDateTime.class, new
		// LocalDateTimeDeserializer(DateTimeFormatter.ofPattern(PATTERN)));
		// module.addDeserializer(LocalDate.class, new
		// LocalDateDeserializer(DateTimeFormatter.ofPattern(patternArr[0])));
		// module.addDeserializer(LocalTime.class, new
		// LocalTimeDeserializer(DateTimeFormatter.ofPattern(patternArr[1])));
		module.addDeserializer(Date.class, new DateDeserializers.DateDeserializer() {
			@Override
			public Date deserialize(JsonParser jsonParser, DeserializationContext ctxt) {
				try {
					String text = jsonParser.getText().trim();
					SimpleDateFormat sdf = new SimpleDateFormat(PATTERN);
					return sdf.parse(text);
				} catch (Exception ex) {
					log.debug(ex);
					throw new RuntimeException(ex);
				}
			}
		});
		module.addDeserializer(Timestamp.class, new DateDeserializers.TimestampDeserializer() {
			@Override
			public Timestamp deserialize(JsonParser jsonParser, DeserializationContext ctxt) {
				try {
					String text = jsonParser.getText().trim();
					SimpleDateFormat sdf = new SimpleDateFormat(PATTERN);
					return new Timestamp(sdf.parse(text).getTime());
				} catch (Exception ex) {
					log.debug(ex);
					throw new RuntimeException(ex);
				}
			}
		});
		module.addDeserializer(java.sql.Date.class, new DateDeserializers.SqlDateDeserializer() {
			@Override
			public java.sql.Date deserialize(JsonParser jsonParser, DeserializationContext ctxt) {
				try {
					String text = jsonParser.getText().trim();
					SimpleDateFormat sdf = new SimpleDateFormat(PATTERN);
					return new java.sql.Date(sdf.parse(text).getTime());
				} catch (Exception ex) {
					log.debug(ex);
					throw new RuntimeException(ex);
				}
			}
		});
		objectMapper.registerModule(module);
		
		return objectMapper;
	}
	
}
