package com.jpmc.midascore.foundation;

public class IncentiveRequest {
    private long senderId;
    private long recipientId;
    private float amount;

    public IncentiveRequest() {}

    public IncentiveRequest(long senderId, long recipientId, float amount) {
        this.senderId = senderId;
        this.recipientId = recipientId;
        this.amount = amount;
    }

    public long getSenderId() { return senderId; }
    public long getRecipientId() { return recipientId; }
    public float getAmount() { return amount; }
}