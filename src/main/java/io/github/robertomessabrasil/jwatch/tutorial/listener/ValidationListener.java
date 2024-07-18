package io.github.robertomessabrasil.jwatch.tutorial.listener;

import com.jwatch.observer.listener.Event;
import com.jwatch.observer.listener.EventListener;
import io.github.robertomessabrasil.jwatch.tutorial.entity.user.event.UserValidationCode;
import io.github.robertomessabrasil.jwatch.tutorial.entity.user.event.UserValidationEvent;

public class ValidationListener extends EventListener {
    @Override
    public boolean handleEvent(Event event) {
        if (event instanceof UserValidationEvent userValidationEvent) {
            if (userValidationEvent.getCode().equals(UserValidationCode.INVALID_NAME)) {
                userValidationEvent.getUser().setName("New User");
            }
            if (userValidationEvent.getCode().equals(UserValidationCode.INVALID_EMAIL)) {
                return true;
            }
        }
        return false;
    }
}