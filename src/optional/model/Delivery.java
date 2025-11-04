package optional.model;

public class Delivery {
    private String status;
    private boolean canceled;

    public Delivery(String status, boolean canceled) {
        this.status = status;
        this.canceled = canceled;
    }

    public boolean isCanceled() {
        return canceled;
    }

    public String getStatus() {
        return status;
    }
}
