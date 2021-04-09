package com.sandbox.demo.repository;

import com.sandbox.demo.model.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin("http://localhost:4200")
public interface RoleRepository extends JpaRepository<Role, Integer> {
}
