package service;
import java.util.List;





import mapper.SysUserRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;




import entity.SysUser;

@Service
@EnableMongoRepositories(basePackages="mapper" )
public class SysUserService{

	@Autowired
   private SysUserRepository sysUserRepository;
   
    @RequestMapping("save")
    public  String save(){
    	SysUser sysUser = new SysUser();
    	sysUser.setName("张三");
    	sysUser.setPassword("123456");
    	sysUser.setSeqid(1L);
    	sysUserRepository.save(sysUser);
      
       sysUser = new SysUser();
       sysUser.setName("李四");
       sysUser.setPassword("123456");
       sysUser.setSeqid(2L);
       sysUserRepository.save(sysUser);
      
       return "ok";
    }
   
    @RequestMapping("find")
    public List<SysUser> find(){
       return sysUserRepository.findAll();
    }
   
    @RequestMapping("findByName")
    public SysUser findByName(){
       return sysUserRepository.findByName("张三");
    }
	
}

