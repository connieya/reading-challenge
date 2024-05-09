package org.example.chapter11.mockingclasses;

import org.example.chapter11.Inquiry;

public class InquiryController {

    private final IDateTimeServer dateTimeServer;

    public InquiryController(IDateTimeServer dateTimeServer) {
        this.dateTimeServer = dateTimeServer;
    }

    public void approveInquiry(int id) {
        Inquiry inquiry = getById(id);
        inquiry.approve(dateTimeServer.now());
        saveInquiry(inquiry);
    }

    private Inquiry getById(int id) {
        // Implement your logic to get Inquiry by id
        return null;
    }

    private void saveInquiry(Inquiry inquiry) {
        // Implement your logic to save Inquiry
    }
}
