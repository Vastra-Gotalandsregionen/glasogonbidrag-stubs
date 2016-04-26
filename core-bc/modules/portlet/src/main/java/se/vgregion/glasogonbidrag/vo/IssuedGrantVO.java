package se.vgregion.glasogonbidrag.vo;

import java.util.Date;

public class IssuedGrantVO {

    private String voucherNumber;
    private double amountExcludingVAT;
    private Date prescriptionDate;
    private Date receiptDate;
    private String status;

    public IssuedGrantVO() {
    }

    public IssuedGrantVO(String voucherNumber, double amountExcludingVAT, Date prescriptionDate, Date receiptDate, String status) {
        this.voucherNumber = voucherNumber;
        this.amountExcludingVAT = amountExcludingVAT;
        this.prescriptionDate = prescriptionDate;
        this.receiptDate = receiptDate;
        this.status = status;
    }

    public String getVoucherNumber() {
        return voucherNumber;
    }

    public void setVoucherNumber(String voucherNumber) {
        this.voucherNumber = voucherNumber;
    }

    public double getAmountExcludingVAT() {
        return amountExcludingVAT;
    }

    public void setAmountExcludingVAT(double amountExcludingVAT) {
        this.amountExcludingVAT = amountExcludingVAT;
    }

    public Date getPrescriptionDate() {
        return prescriptionDate;
    }

    public void setPrescriptionDate(Date prescriptionDate) {
        this.prescriptionDate = prescriptionDate;
    }

    public Date getReceiptDate() {
        return receiptDate;
    }

    public void setReceiptDate(Date receiptDate) {
        this.receiptDate = receiptDate;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

}
