package io.github.robertomessabrasil.jwatch.tutorial.listener;

import io.github.robertomessabrasil.jwatch.observer.listener.Event;
import io.github.robertomessabrasil.jwatch.observer.listener.EventListener;
import io.github.robertomessabrasil.jwatch.tutorial.entity.user.event.UserValidationCode;
import io.github.robertomessabrasil.jwatch.tutorial.entity.user.event.UserValidationEvent;
import io.github.robertomessabrasil.jwatch.tutorial.log.LogEvent;
import io.github.robertomessabrasil.jwatch.tutorial.security.event.InvalidRoleEvent;

import java.util.logging.Level;
import java.util.logging.Logger;

public class LogListener extends EventListener {
    private static final Logger logger = Logger.getLogger(LogListener.class.getName());

    @Override
    public boolean handleEvent(Event event) {
        if (event instanceof UserValidationEvent userValidationEvent) {
            if (userValidationEvent.getCode().equals(UserValidationCode.INVALID_EMAIL)) {
                logger.log(Level.SEVERE, userValidationEvent.toString());
            }
        }
        if (event instanceof InvalidRoleEvent invalidRoleEvent) {
            logger.log(Level.SEVERE, invalidRoleEvent.toString());
        }
        if (event instanceof LogEvent logEvent) {
            logger.info(logEvent.toString());
        }
        return false;
    }
}
