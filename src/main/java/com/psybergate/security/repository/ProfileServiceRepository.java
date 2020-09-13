package com.psybergate.security.repository;

import com.psybergate.security.entity.Profile;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface ProfileServiceRepository extends JpaRepository<Profile, Long> {
    Optional<Profile> findOneByUsername(String username);
}
