package com.mhp.coding.challenges.dependency.inquiry;

import com.mhp.coding.challenges.dependency.notifications.EmailHandler;
import com.mhp.coding.challenges.dependency.notifications.PushNotificationHandler;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class InquiryServiceImpl implements InquiryService{

    private static final Logger LOG = LoggerFactory.getLogger(InquiryServiceImpl.class);

    private PushNotificationHandler pushNotificationHandler;

    private EmailHandler emailHandler;


    @Autowired
    public InquiryServiceImpl(EmailHandler emailHandler, PushNotificationHandler notificationHandler){
        this.pushNotificationHandler = notificationHandler;
        this.emailHandler = emailHandler;

    }

    public void create(final Inquiry inquiry) {
        LOG.info("User sent inquiry: {}", inquiry);
        emailHandler.sendEmail(inquiry);
        pushNotificationHandler.sendNotification(inquiry);
    }
}
