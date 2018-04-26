/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jilit.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

 
@Entity
@Table(name = "feetransactiondetail")

public class FeeTransactionDetail implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected FeeTransactionDetailPK feeTransactionDetailPK;
    @Column(name = "studentid")
    private String studentid;
    @Column(name = "semester")
    private Integer semester;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "feeamount")
    private BigDecimal feeamount;
    @Column(name = "payparticulars")
    private String payparticulars;
    @JoinColumn(name = "feeheadid", referencedColumnName = "feeheadid")
    @ManyToOne
    private FeeHeads feeheadid;

    public FeeTransactionDetail() {
    }

    public FeeTransactionDetail(FeeTransactionDetailPK feeTransactionDetailPK) {
        this.feeTransactionDetailPK = feeTransactionDetailPK;
    }

    public FeeTransactionDetail(int transactionid, int slno) {
        this.feeTransactionDetailPK = new FeeTransactionDetailPK(transactionid, slno);
    }

    public FeeTransactionDetailPK getFeetransactiondetailPK() {
        return feeTransactionDetailPK;
    }

    public void setFeetransactiondetailPK(FeeTransactionDetailPK feeTransactionDetailPK) {
        this.feeTransactionDetailPK = feeTransactionDetailPK;
    }

    public String getStudentid() {
        return studentid;
    }

    public void setStudentid(String studentid) {
        this.studentid = studentid;
    }

    public Integer getSemester() {
        return semester;
    }

    public void setSemester(Integer semester) {
        this.semester = semester;
    }

    public BigDecimal getFeeamount() {
        return feeamount;
    }

    public void setFeeamount(BigDecimal feeamount) {
        this.feeamount = feeamount;
    }

    public String getPayparticulars() {
        return payparticulars;
    }

    public void setPayparticulars(String payparticulars) {
        this.payparticulars = payparticulars;
    }

    public FeeHeads getFeeheadid() {
        return feeheadid;
    }

    public void setFeeheadid(FeeHeads feeheadid) {
        this.feeheadid = feeheadid;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (feeTransactionDetailPK != null ? feeTransactionDetailPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof FeeTransactionDetail)) {
            return false;
        }
        FeeTransactionDetail other = (FeeTransactionDetail) object;
        if ((this.feeTransactionDetailPK == null && other.feeTransactionDetailPK != null) || (this.feeTransactionDetailPK != null && !this.feeTransactionDetailPK.equals(other.feeTransactionDetailPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.jilit.entity.FeeTransactionDetail[ feeTransactionDetailPK=" + feeTransactionDetailPK + " ]";
    }
    
}
