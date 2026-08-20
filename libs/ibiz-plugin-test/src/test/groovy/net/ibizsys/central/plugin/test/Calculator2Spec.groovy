package net.ibizsys.central.plugin.test

import org.junit.jupiter.api.extension.ExtendWith
import net.ibizsys.central.ISystemRuntime
import net.ibizsys.central.plugin.test.util.SystemRTInjector
import spock.lang.Specification
import org.junit.jupiter.api.extension.RegisterExtension
import org.springframework.beans.factory.annotation.Autowired

@ExtendWith(SystemRTInjector.class)
class Calculator2Spec extends Specification {
	
	@RegisterExtension
	static SystemRTInjector injector = new SystemRTInjector()

	
	static final class CalculatorService {
		int add(int a, int b) { return a + b }
		int divide(int a, int b) { return a / b }
	}
	
	@Autowired
	ISystemRuntime sys
	
	// 被测对象（这里直接 new，不依赖外部）
	def calculator = new CalculatorService()

	def "加法运算 - 两个正数相加返回正确结果"() {
		given: "两个正数"
		def a = 3
		def b = 5

		when: "调用 add 方法"
		def result = calculator.add(a, b)

		then: "结果等于和"
		result == 8
	}

	def "除法运算 - 除数为零时抛出异常"() {
		when:
		calculator.divide(10, 0)

		then:
		throw(ArithmeticException)
	}
}
