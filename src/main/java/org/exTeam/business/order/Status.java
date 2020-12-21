package org.exTeam.business.order;

public class Status {
    private boolean notPaid;
    private boolean paid;
    private boolean delivered;
    private boolean pendingIssue;
    private boolean issued;

    public boolean isNotPaid() {
        return notPaid;
    }
    public void setNotPaid(boolean notPaid) {
        this.notPaid = notPaid;
    }

    public boolean isPaid() {
        return paid;
    }
    public void setPaid(boolean paid) {
        this.paid = paid;
    }

    public boolean isDelivered() {
        return delivered;
    }
    public void setDelivered(boolean delivered) {
        this.delivered = delivered;
    }

    public boolean isPendingIssue() {
        return pendingIssue;
    }
    public void setPendingIssue(boolean pendingIssue) {
        this.pendingIssue = pendingIssue;
    }

    public boolean isIssued() {
        return issued;
    }
    public void setIssued(boolean issued) {
        this.issued = issued;
    }
}
