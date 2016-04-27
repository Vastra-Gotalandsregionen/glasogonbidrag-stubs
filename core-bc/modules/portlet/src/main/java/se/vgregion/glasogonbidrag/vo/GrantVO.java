package se.vgregion.glasogonbidrag.vo;

import java.util.Date;

public class GrantVO {

    private String grantType;
    private String personNumber;

    private double amountExcludingVAT;
    private Date prescriptionDate;
    private Date receiptDate;



    public GrantVO() {
    }

    public String getGrantType() {
        return grantType;
    }

    public void setGrantType(String grantType) {
        this.grantType = grantType;
    }

    public String getPersonNumber() {
        return personNumber;
    }

    public void setPersonNumber(String personNumber) {
        this.personNumber = personNumber;
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
}
