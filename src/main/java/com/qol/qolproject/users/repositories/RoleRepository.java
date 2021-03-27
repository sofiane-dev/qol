package com.qol.qolproject.users.repositories;

import com.qol.qolproject.users.models.ERole;
import com.qol.qolproject.users.models.Role;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface RoleRepository extends JpaRepository<Role, Long> {
    Optional<Role> findByName(ERole name);
}
