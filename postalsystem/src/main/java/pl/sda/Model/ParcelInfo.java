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

    public void setShipper(Customer shipper) {
        this.shipper = shipper;
    }

    public void setReceiver(Customer receiver) {
        this.receiver = receiver;
    }

    public void setShippmentDate(LocalDateTime shippmentDate) {
        this.shippmentDate = shippmentDate;
    }

    public void setReceiveDate(LocalDateTime receiveDate) {
        this.receiveDate = receiveDate;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public void setStatus(ParcelStatus status) {
        this.status = status;
    }

    public void setId(int id) {
        this.id = id;
    }
}
