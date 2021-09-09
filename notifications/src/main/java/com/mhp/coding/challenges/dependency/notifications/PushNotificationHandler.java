package com.mhp.coding.challenges.dependency.notifications;

import com.mhp.coding.challenges.dependency.inquiry.Inquiry;

public interface PushNotificationHandler {
    void sendNotification(final Inquiry inquiry);
}
