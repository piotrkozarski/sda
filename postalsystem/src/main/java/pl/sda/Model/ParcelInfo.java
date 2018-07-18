package pl.sda.Model;

import java.time.LocalDateTime;

public class ParcelInfo {


    private int id;
    private Customer shipper;
    private Customer receiver;
    private LocalDateTime shippmentDate;
    private LocalDateTime receiveDate;
    private String content;
    private ParcelStatus status;

    public int getId() {
        return id;
    }

    public Customer getShipper() {
        return shipper;
    }

    public Customer getReceiver() {
        return receiver;
    }

    public LocalDateTime getShippmentDate() {
        return shippmentDate;
    }

    public LocalDateTime getReceiveDate() {
        return receiveDate;
    }

    public String getContent() {
        return content;
    }

    public ParcelStatus getStatus() {
        return status;
    }
}
