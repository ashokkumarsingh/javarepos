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
@Table(name = "feestructure")
 public class FeeStructure implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected FeeStructurePK feeStructurePK;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "feeamount")
    private BigDecimal feeamount;
    @JoinColumn(name = "feeheadid", referencedColumnName = "feeheadid", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private FeeHeads feeheads;

    public FeeStructure() {
    }

    public FeeStructure(FeeStructurePK feeStructurePK) {
        this.feeStructurePK = feeStructurePK;
    }

    public FeeStructure(int programid, int branchid, String feeheadid, int semester) {
        this.feeStructurePK = new FeeStructurePK(programid, branchid, feeheadid, semester);
    }

    public FeeStructurePK getFeestructurePK() {
        return feeStructurePK;
    }

    public void setFeestructurePK(FeeStructurePK feeStructurePK) {
        this.feeStructurePK = feeStructurePK;
    }

    public BigDecimal getFeeamount() {
        return feeamount;
    }

    public void setFeeamount(BigDecimal feeamount) {
        this.feeamount = feeamount;
    }

    public FeeHeads getFeeheads() {
        return feeheads;
    }

    public void setFeeheads(FeeHeads feeheads) {
        this.feeheads = feeheads;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (feeStructurePK != null ? feeStructurePK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof FeeStructure)) {
            return false;
        }
        FeeStructure other = (FeeStructure) object;
        if ((this.feeStructurePK == null && other.feeStructurePK != null) || (this.feeStructurePK != null && !this.feeStructurePK.equals(other.feeStructurePK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.jilit.entity.FeeStructure[ feeStructurePK=" + feeStructurePK + " ]";
    }
    
}
