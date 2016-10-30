package com.github.emailtohl.building.site.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.github.emailtohl.building.site.entities.Role;
/**
 * 角色访问接口
 * @author HeLei
 */
public interface RoleRepository extends JpaRepository<Role, Long> {
	Role findByName(String name);
}