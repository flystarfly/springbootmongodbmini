package controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.embedded.EmbeddedServletContainerFactory;
import org.springframework.boot.context.embedded.tomcat.TomcatEmbeddedServletContainerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Import;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import service.SysUserService;


import entity.SysUser;
/**
 * Created by wenchao.ren on 2014/4/26.
 */
@SpringBootApplication  
//启注解事务管理  
@Controller
@Import (SysUserService.class )
public class SimpleController {


	@Autowired
	private SysUserService sysUserService;


	@RequestMapping(value ="/hello", method = RequestMethod.GET)
    @ResponseBody
    public String hello(){
		SysUser sysUser = new SysUser();
//		sysUser.setName("张三");
//		sysUser.setPassword("李四");
//		sysUser.setRoleId(1L);
//		sysUser.setSeqid(1L);
		sysUserService.save();
		SysUser sysUser2= sysUserService.findByName();
        return sysUser2.getName();
    }
 
   public static void main(String[] args) {
        SpringApplication.run(SimpleController.class, args);
    }
    
  
	
   
    
}
