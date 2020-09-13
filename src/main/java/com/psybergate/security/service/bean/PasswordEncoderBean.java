package com.psybergate.security.service.bean;

import lombok.NonNull;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.Objects;

@Service
public class PasswordEncoderBean implements PasswordEncoder {

    @Override
    public String encode(@NonNull CharSequence charSequence) {
        return charSequence.toString();
    }

    @Override
    public boolean matches(@NonNull CharSequence charSequence, String s) {
        return Objects.equals(charSequence.toString(), s);
    }
}
