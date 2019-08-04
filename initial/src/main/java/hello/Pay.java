package hello;

public class Pay {

    private final long id;
    private final String reason;
    private final double amount;
    private final String date;
    private final String rec_by;

    public Pay(long id, String reason, double amount, String date, String rec_by) {
        this.id = id;
        this.reason = reason;
        this.amount = amount;
        this.date = date;
        this.rec_by = rec_by;
    }

    public long getId() {
        return id;
    }

    public String getReason() {
        return reason;
    }

    public double getAmount() {
        return amount;
    }

    public String getDate() {
        return date;
    }

    public String getRecBy() {
        return rec_by;
    }
}
