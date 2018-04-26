/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jilit.entity;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;
 
@Entity
@Table(name = "feeheads")
 public class FeeHeads implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "feeheadid")
    private String feeheadid;
    @Basic(optional = false)
    @Column(name = "feeheadcode")
    private String feeheadcode;
    @Basic(optional = false)
    @Column(name = "feeheaddesc")
    private String feeheaddesc;
    @Basic(optional = false)
    @Column(name = "feetype")
    private String feetype;
    @Column(name = "deactive")
    private String deactive;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "feeheads")
    private Collection<FeeStructure> feestructureCollection;
    @OneToMany(mappedBy = "feeheadid")
    private Collection<FeeTransactionDetail> feetransactiondetailCollection;

    public FeeHeads() {
    }

    public FeeHeads(String feeheadid) {
        this.feeheadid = feeheadid;
    }

    public FeeHeads(String feeheadid, String feeheadcode, String feeheaddesc, String feetype) {
        this.feeheadid = feeheadid;
        this.feeheadcode = feeheadcode;
        this.feeheaddesc = feeheaddesc;
        this.feetype = feetype;
    }

    public String getFeeheadid() {
        return feeheadid;
    }

    public void setFeeheadid(String feeheadid) {
        this.feeheadid = feeheadid;
    }

    public String getFeeheadcode() {
        return feeheadcode;
    }

    public void setFeeheadcode(String feeheadcode) {
        this.feeheadcode = feeheadcode;
    }

    public String getFeeheaddesc() {
        return feeheaddesc;
    }

    public void setFeeheaddesc(String feeheaddesc) {
        this.feeheaddesc = feeheaddesc;
    }

    public String getFeetype() {
        return feetype;
    }

    public void setFeetype(String feetype) {
        this.feetype = feetype;
    }

    public String getDeactive() {
        return deactive;
    }

    public void setDeactive(String deactive) {
        this.deactive = deactive;
    }

    @XmlTransient
    public Collection<FeeStructure> getFeestructureCollection() {
        return feestructureCollection;
    }

    public void setFeestructureCollection(Collection<FeeStructure> feestructureCollection) {
        this.feestructureCollection = feestructureCollection;
    }

    @XmlTransient
    public Collection<FeeTransactionDetail> getFeetransactiondetailCollection() {
        return feetransactiondetailCollection;
    }

    public void setFeetransactiondetailCollection(Collection<FeeTransactionDetail> feetransactiondetailCollection) {
        this.feetransactiondetailCollection = feetransactiondetailCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (feeheadid != null ? feeheadid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof FeeHeads)) {
            return false;
        }
        FeeHeads other = (FeeHeads) object;
        if ((this.feeheadid == null && other.feeheadid != null) || (this.feeheadid != null && !this.feeheadid.equals(other.feeheadid))) {
            return false;
        }
        return true;
    }

    
    @Override
    public String toString() {
        return "com.jilit.entity.FeeHeads[ feeheadid=" + feeheadid + " ]";
    }
    
}
