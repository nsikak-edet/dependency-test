package com.mhp.coding.challenges.dependency.commons;

import com.mhp.coding.challenges.dependency.inquiry.Inquiry;
import com.mhp.coding.challenges.dependency.notifications.EmailHandler;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
public class EmailHandlerImpl implements EmailHandler {

    private static final Logger LOG = LoggerFactory.getLogger(EmailHandlerImpl.class);

    public void sendEmail(final Inquiry inquiry) {
        LOG.info("Sending email for: {}", inquiry);
    }
}
