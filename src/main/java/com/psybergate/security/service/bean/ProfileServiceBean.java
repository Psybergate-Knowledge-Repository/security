package com.psybergate.security.service.bean;

import com.psybergate.security.entity.Profile;
import com.psybergate.security.repository.ProfileServiceRepository;
import com.psybergate.security.service.ProfileService;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ProfileServiceBean implements ProfileService {

    private final ProfileServiceRepository profileServiceRepository;

    public ProfileServiceBean(ProfileServiceRepository profileServiceRepository) {
        this.profileServiceRepository = profileServiceRepository;
    }

    @Override
    public Profile loadUserByUsername(String username) throws UsernameNotFoundException {
        Optional<Profile> profile = profileServiceRepository.findOneByUsername(username);
        return profile.orElseThrow(() -> new UsernameNotFoundException(username));
    }
}
