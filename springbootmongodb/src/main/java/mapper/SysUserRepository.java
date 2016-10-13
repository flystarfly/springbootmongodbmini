package mapper;


import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import entity.SysUser;


@Component
public interface SysUserRepository extends MongoRepository<SysUser, String> {
	SysUser findByName(String name);
}
