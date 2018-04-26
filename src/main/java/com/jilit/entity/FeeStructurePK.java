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

 
 
public class FeeStructurePK implements Serializable {

    @Basic(optional = false)
    @Column(name = "programid")
    private int programid;
    @Basic(optional = false)
    @Column(name = "branchid")
    private int branchid;
    @Basic(optional = false)
    @Column(name = "feeheadid")
    private String feeheadid;
    @Basic(optional = false)
    @Column(name = "semester")
    private int semester;

    public FeeStructurePK() {
    }

    public FeeStructurePK(int programid, int branchid, String feeheadid, int semester) {
        this.programid = programid;
        this.branchid = branchid;
        this.feeheadid = feeheadid;
        this.semester = semester;
    }

    public int getProgramid() {
        return programid;
    }

    public void setProgramid(int programid) {
        this.programid = programid;
    }

    public int getBranchid() {
        return branchid;
    }

    public void setBranchid(int branchid) {
        this.branchid = branchid;
    }

    public String getFeeheadid() {
        return feeheadid;
    }

    public void setFeeheadid(String feeheadid) {
        this.feeheadid = feeheadid;
    }

    public int getSemester() {
        return semester;
    }

    public void setSemester(int semester) {
        this.semester = semester;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) programid;
        hash += (int) branchid;
        hash += (feeheadid != null ? feeheadid.hashCode() : 0);
        hash += (int) semester;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof FeeStructurePK)) {
            return false;
        }
        FeeStructurePK other = (FeeStructurePK) object;
        if (this.programid != other.programid) {
            return false;
        }
        if (this.branchid != other.branchid) {
            return false;
        }
        if ((this.feeheadid == null && other.feeheadid != null) || (this.feeheadid != null && !this.feeheadid.equals(other.feeheadid))) {
            return false;
        }
        if (this.semester != other.semester) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.jilit.entity.FeeStructurePK[ programid=" + programid + ", branchid=" + branchid + ", feeheadid=" + feeheadid + ", semester=" + semester + " ]";
    }
    
}
