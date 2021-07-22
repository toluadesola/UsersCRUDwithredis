package com.tolulope.aneeque.repository;

import com.tolulope.aneeque.models.ERole;
import com.tolulope.aneeque.models.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;


@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {
    Optional<Role> findByName(ERole name);
}
