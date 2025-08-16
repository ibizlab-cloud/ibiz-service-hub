package cn.ibizlab.central.plugin.groovy.sample

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.beans.factory.annotation.Qualifier

import groovy.util.logging.Slf4j
import net.ibizsys.central.util.IEntityDTO
import net.ibizsys.central.dataentity.IDataEntityRuntime
import net.ibizsys.central.ISystemRuntime;
import net.ibizsys.central.util.EntityDTO

@Slf4j
class DESample01 {

	@Autowired
	ISystemRuntime sys
	
	@Autowired
	IDataEntityRuntime LS_TRADEMARK
	
	
	class SubClass{
		String name 
		String desc
	}
	
	def "中文" () { true }
	
	
	class DemoDTO extends EntityDTO {
		
		Integer getPrice() { (Integer)get("price") }
		//void setPrice(def val) { set("price", val) }
	}
	

	
	public void test(def subInfo) {
		
		sys.info("测试信息22222")
		
		def aa = 中文()
		
		DemoDTO dto = new DemoDTO()
		dto.set("price", "1")
		
		
		def price = dto.price
		
		
		
		List<IEntityDTO> list = LS_TRADEMARK.list()
		//list = null
		list.each {
			
		}
		
		
		def e1 = sys.entity("LS_TRADEMARK")
		e1.with{
			//裸设置属性
			set("name2", "name2")
			//需要存在属性名称，不存在异常
			trademarkName = 'aaa'
			trademarkId = 'bbbb'
			category = 'bbbbb'
		}
		list.add(e1)
		
		def e2 = LS_TRADEMARK.entity();
		e2.with{
			//裸设置属性
			set("name2", "named2")
			//需要存在属性名称，不存在异常
			trademarkName = 'aaca'
			trademarkId = 'bbbbc'
			category = 'bbbbbc'
		}
		
		list.add(e2);
		
		
		def f1 = LS_TRADEMARK.filter();
		f1.and {
			or {
				eq("trademarkName", "aabb3")
				trademarkName.eq("cccc")
				id.ne("c1")
				name.eq("bbb2")
				and{
					id.ne("c122")
					name.eq("bbb222")
				}
			} 
			eq("trademarkId", "bb")		
		}
		
	
		//def page = LS_TRADEMARK.filter().page(list);
		def page = f1.fetch()
		
		log.debug("测试信息");
		
		
		
		
	}	
	
}


