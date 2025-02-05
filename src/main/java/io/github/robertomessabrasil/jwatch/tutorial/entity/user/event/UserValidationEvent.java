package io.github.robertomessabrasil.jwatch.tutorial.entity.user.event;

import io.github.robertomessabrasil.jwatch.observer.listener.Event;
import io.github.robertomessabrasil.jwatch.tutorial.entity.user.UserEntity;

public class UserValidationEvent extends Event {
    private UserEntity user;
    private UserValidationCode code;

    public UserEntity getUser() {
        return user;
    }

    public UserValidationEvent setUser(UserEntity user) {
        this.user = user;
        return this;
    }

    public UserValidationCode getCode() {
        return code;
    }

    public UserValidationEvent setCode(UserValidationCode code) {
        this.code = code;
        return this;
    }

    @Override
    public String toString() {
        return "Validation error: " + this.code;
    }
}
