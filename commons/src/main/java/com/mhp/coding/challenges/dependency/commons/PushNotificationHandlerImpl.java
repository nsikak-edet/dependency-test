package com.mhp.coding.challenges.dependency.commons;

import com.mhp.coding.challenges.dependency.inquiry.Inquiry;
import com.mhp.coding.challenges.dependency.notifications.PushNotificationHandler;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
public class PushNotificationHandlerImpl implements PushNotificationHandler {

    private static final Logger LOG = LoggerFactory.getLogger(PushNotificationHandlerImpl.class);

    public void sendNotification(final Inquiry inquiry) {
        LOG.info("Sending push notification for: {}", inquiry);
    }

}
