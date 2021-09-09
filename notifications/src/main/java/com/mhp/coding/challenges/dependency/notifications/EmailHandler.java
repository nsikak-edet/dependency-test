package com.mhp.coding.challenges.dependency.notifications;

import com.mhp.coding.challenges.dependency.inquiry.Inquiry;


public interface EmailHandler {
    void sendEmail(final Inquiry inquiry);

}
