/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jilit.entity;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;

  
public class FeeTransactionDetailPK implements Serializable {

    @Basic(optional = false)
    @Column(name = "transactionid")
    private int transactionid;
    @Basic(optional = false)
    @Column(name = "slno")
    private int slno;

    public FeeTransactionDetailPK() {
    }

    public FeeTransactionDetailPK(int transactionid, int slno) {
        this.transactionid = transactionid;
        this.slno = slno;
    }

    public int getTransactionid() {
        return transactionid;
    }

    public void setTransactionid(int transactionid) {
        this.transactionid = transactionid;
    }

    public int getSlno() {
        return slno;
    }

    public void setSlno(int slno) {
        this.slno = slno;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) transactionid;
        hash += (int) slno;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof FeeTransactionDetailPK)) {
            return false;
        }
        FeeTransactionDetailPK other = (FeeTransactionDetailPK) object;
        if (this.transactionid != other.transactionid) {
            return false;
        }
        if (this.slno != other.slno) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.jilit.entity.FeeTransactionDetailPK[ transactionid=" + transactionid + ", slno=" + slno + " ]";
    }
    
}
