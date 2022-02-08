package com.stunstun.spring.repository;

import com.stunstun.spring.repository.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author stunstun
 *
 */
@Mapper
public interface UserMapper {

	public List<User> findAll();

	public List<User> findByUserName(@Param("userName") String userName);

	public User findOne(Long id);

	public Boolean exists(Long id);

	public void save(User user);
	
	public void update(User user);

	public void delete(User user);
}
