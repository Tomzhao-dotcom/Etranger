package com.etranger.web.entity;

import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table( name = "mdmpartner", schema = "public", catalog = "etranger" )
public class MdmpartnerEntity {
    private String id;
    private String address;
    private String auditflowcharid;
    private String auditstate;
    private String bankaccount;
    private String bankid;
    private BigDecimal chargepercent;
    private String code;
    private String currencyid;
    private String customertype;
    private String dblinkcode;
    private Timestamp disabletime;
    private String email;
    private String englishname;
    private String fax;
    private String idnumber;
    private String insidecom;
    private String invoicebank;
    private String invoicebankaccount;
    private String iscustomer;
    private String isdelete;
    private String ishistory;
    private String isinsidecom;
    private String issupplier;
    private String istrans;
    private String keyword;
    private String linkman;
    private String managemode;
    private String nameChs;
    private String nameCht;
    private String nameEn;
    private String nameEs;
    private String namePt;
    private String ofcountry;
    private String ofindustry;
    private String ofregion;
    private String orgnumber;
    private String ownertype;
    private String partnerarea;
    private String partnertype;
    private String postcode;
    private String psi;
    private BigDecimal registercapital;
    private String remark;
    private String representative;
    private String scc;
    private String shortname;
    private String suppliertype;
    private String taxaccount;
    private String taxpayertype;
    private String telephone;
    private String timestampCreatedby;
    private Timestamp timestampCreatedon;
    private String timestampLastchangedby;
    private Timestamp timestampLastchangedon;
    private String transcope;
    private Timestamp version;

    @Id
    @Column( name = "id", nullable = false, length = 36 )
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Basic
    @Column( name = "address", nullable = true, length = 200 )
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Basic
    @Column( name = "auditflowcharid", nullable = true, length = 36 )
    public String getAuditflowcharid() {
        return auditflowcharid;
    }

    public void setAuditflowcharid(String auditflowcharid) {
        this.auditflowcharid = auditflowcharid;
    }

    @Basic
    @Column( name = "auditstate", nullable = true, length = 36 )
    public String getAuditstate() {
        return auditstate;
    }

    public void setAuditstate(String auditstate) {
        this.auditstate = auditstate;
    }

    @Basic
    @Column( name = "bankaccount", nullable = true, length = 100 )
    public String getBankaccount() {
        return bankaccount;
    }

    public void setBankaccount(String bankaccount) {
        this.bankaccount = bankaccount;
    }

    @Basic
    @Column( name = "bankid", nullable = true, length = 36 )
    public String getBankid() {
        return bankid;
    }

    public void setBankid(String bankid) {
        this.bankid = bankid;
    }

    @Basic
    @Column( name = "chargepercent", nullable = true, precision = 8 )
    public BigDecimal getChargepercent() {
        return chargepercent;
    }

    public void setChargepercent(BigDecimal chargepercent) {
        this.chargepercent = chargepercent;
    }

    @Basic
    @Column( name = "code", nullable = true, length = 100 )
    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    @Basic
    @Column( name = "currencyid", nullable = true, length = 36 )
    public String getCurrencyid() {
        return currencyid;
    }

    public void setCurrencyid(String currencyid) {
        this.currencyid = currencyid;
    }

    @Basic
    @Column( name = "customertype", nullable = true, length = 36 )
    public String getCustomertype() {
        return customertype;
    }

    public void setCustomertype(String customertype) {
        this.customertype = customertype;
    }

    @Basic
    @Column( name = "dblinkcode", nullable = true, length = 200 )
    public String getDblinkcode() {
        return dblinkcode;
    }

    public void setDblinkcode(String dblinkcode) {
        this.dblinkcode = dblinkcode;
    }

    @Basic
    @Column( name = "disabletime", nullable = true )
    public Timestamp getDisabletime() {
        return disabletime;
    }

    public void setDisabletime(Timestamp disabletime) {
        this.disabletime = disabletime;
    }

    @Basic
    @Column( name = "email", nullable = true, length = 100 )
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Basic
    @Column( name = "englishname", nullable = true, length = 100 )
    public String getEnglishname() {
        return englishname;
    }

    public void setEnglishname(String englishname) {
        this.englishname = englishname;
    }

    @Basic
    @Column( name = "fax", nullable = true, length = 60 )
    public String getFax() {
        return fax;
    }

    public void setFax(String fax) {
        this.fax = fax;
    }

    @Basic
    @Column( name = "idnumber", nullable = true, length = 60 )
    public String getIdnumber() {
        return idnumber;
    }

    public void setIdnumber(String idnumber) {
        this.idnumber = idnumber;
    }

    @Basic
    @Column( name = "insidecom", nullable = true, length = 36 )
    public String getInsidecom() {
        return insidecom;
    }

    public void setInsidecom(String insidecom) {
        this.insidecom = insidecom;
    }

    @Basic
    @Column( name = "invoicebank", nullable = true, length = 36 )
    public String getInvoicebank() {
        return invoicebank;
    }

    public void setInvoicebank(String invoicebank) {
        this.invoicebank = invoicebank;
    }

    @Basic
    @Column( name = "invoicebankaccount", nullable = true, length = 100 )
    public String getInvoicebankaccount() {
        return invoicebankaccount;
    }

    public void setInvoicebankaccount(String invoicebankaccount) {
        this.invoicebankaccount = invoicebankaccount;
    }

    @Basic
    @Column( name = "iscustomer", nullable = true, length = -1 )
    public String getIscustomer() {
        return iscustomer;
    }

    public void setIscustomer(String iscustomer) {
        this.iscustomer = iscustomer;
    }

    @Basic
    @Column( name = "isdelete", nullable = true, length = 1 )
    public String getIsdelete() {
        return isdelete;
    }

    public void setIsdelete(String isdelete) {
        this.isdelete = isdelete;
    }

    @Basic
    @Column( name = "ishistory", nullable = true, length = 36 )
    public String getIshistory() {
        return ishistory;
    }

    public void setIshistory(String ishistory) {
        this.ishistory = ishistory;
    }

    @Basic
    @Column( name = "isinsidecom", nullable = true, length = 1 )
    public String getIsinsidecom() {
        return isinsidecom;
    }

    public void setIsinsidecom(String isinsidecom) {
        this.isinsidecom = isinsidecom;
    }

    @Basic
    @Column( name = "issupplier", nullable = true, length = -1 )
    public String getIssupplier() {
        return issupplier;
    }

    public void setIssupplier(String issupplier) {
        this.issupplier = issupplier;
    }

    @Basic
    @Column( name = "istrans", nullable = true, length = 1 )
    public String getIstrans() {
        return istrans;
    }

    public void setIstrans(String istrans) {
        this.istrans = istrans;
    }

    @Basic
    @Column( name = "keyword", nullable = true, length = 100 )
    public String getKeyword() {
        return keyword;
    }

    public void setKeyword(String keyword) {
        this.keyword = keyword;
    }

    @Basic
    @Column( name = "linkman", nullable = true, length = 60 )
    public String getLinkman() {
        return linkman;
    }

    public void setLinkman(String linkman) {
        this.linkman = linkman;
    }

    @Basic
    @Column( name = "managemode", nullable = true, length = 36 )
    public String getManagemode() {
        return managemode;
    }

    public void setManagemode(String managemode) {
        this.managemode = managemode;
    }

    @Basic
    @Column( name = "name_chs", nullable = true, length = 200 )
    public String getNameChs() {
        return nameChs;
    }

    public void setNameChs(String nameChs) {
        this.nameChs = nameChs;
    }

    @Basic
    @Column( name = "name_cht", nullable = true, length = 200 )
    public String getNameCht() {
        return nameCht;
    }

    public void setNameCht(String nameCht) {
        this.nameCht = nameCht;
    }

    @Basic
    @Column( name = "name_en", nullable = true, length = 200 )
    public String getNameEn() {
        return nameEn;
    }

    public void setNameEn(String nameEn) {
        this.nameEn = nameEn;
    }

    @Basic
    @Column( name = "name_es", nullable = true, length = 200 )
    public String getNameEs() {
        return nameEs;
    }

    public void setNameEs(String nameEs) {
        this.nameEs = nameEs;
    }

    @Basic
    @Column( name = "name_pt", nullable = true, length = 200 )
    public String getNamePt() {
        return namePt;
    }

    public void setNamePt(String namePt) {
        this.namePt = namePt;
    }

    @Basic
    @Column( name = "ofcountry", nullable = true, length = 36 )
    public String getOfcountry() {
        return ofcountry;
    }

    public void setOfcountry(String ofcountry) {
        this.ofcountry = ofcountry;
    }

    @Basic
    @Column( name = "ofindustry", nullable = true, length = 36 )
    public String getOfindustry() {
        return ofindustry;
    }

    public void setOfindustry(String ofindustry) {
        this.ofindustry = ofindustry;
    }

    @Basic
    @Column( name = "ofregion", nullable = true, length = 36 )
    public String getOfregion() {
        return ofregion;
    }

    public void setOfregion(String ofregion) {
        this.ofregion = ofregion;
    }

    @Basic
    @Column( name = "orgnumber", nullable = true, length = 60 )
    public String getOrgnumber() {
        return orgnumber;
    }

    public void setOrgnumber(String orgnumber) {
        this.orgnumber = orgnumber;
    }

    @Basic
    @Column( name = "ownertype", nullable = true, length = 36 )
    public String getOwnertype() {
        return ownertype;
    }

    public void setOwnertype(String ownertype) {
        this.ownertype = ownertype;
    }

    @Basic
    @Column( name = "partnerarea", nullable = true, length = 36 )
    public String getPartnerarea() {
        return partnerarea;
    }

    public void setPartnerarea(String partnerarea) {
        this.partnerarea = partnerarea;
    }

    @Basic
    @Column( name = "partnertype", nullable = true, length = 36 )
    public String getPartnertype() {
        return partnertype;
    }

    public void setPartnertype(String partnertype) {
        this.partnertype = partnertype;
    }

    @Basic
    @Column( name = "postcode", nullable = true, length = 60 )
    public String getPostcode() {
        return postcode;
    }

    public void setPostcode(String postcode) {
        this.postcode = postcode;
    }

    @Basic
    @Column( name = "psi", nullable = true, length = 60 )
    public String getPsi() {
        return psi;
    }

    public void setPsi(String psi) {
        this.psi = psi;
    }

    @Basic
    @Column( name = "registercapital", nullable = true, precision = 8 )
    public BigDecimal getRegistercapital() {
        return registercapital;
    }

    public void setRegistercapital(BigDecimal registercapital) {
        this.registercapital = registercapital;
    }

    @Basic
    @Column( name = "remark", nullable = true, length = 1024 )
    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    @Basic
    @Column( name = "representative", nullable = true, length = 100 )
    public String getRepresentative() {
        return representative;
    }

    public void setRepresentative(String representative) {
        this.representative = representative;
    }

    @Basic
    @Column( name = "scc", nullable = true, length = 60 )
    public String getScc() {
        return scc;
    }

    public void setScc(String scc) {
        this.scc = scc;
    }

    @Basic
    @Column( name = "shortname", nullable = true, length = 100 )
    public String getShortname() {
        return shortname;
    }

    public void setShortname(String shortname) {
        this.shortname = shortname;
    }

    @Basic
    @Column( name = "suppliertype", nullable = true, length = 36 )
    public String getSuppliertype() {
        return suppliertype;
    }

    public void setSuppliertype(String suppliertype) {
        this.suppliertype = suppliertype;
    }

    @Basic
    @Column( name = "taxaccount", nullable = true, length = 60 )
    public String getTaxaccount() {
        return taxaccount;
    }

    public void setTaxaccount(String taxaccount) {
        this.taxaccount = taxaccount;
    }

    @Basic
    @Column( name = "taxpayertype", nullable = true, length = 36 )
    public String getTaxpayertype() {
        return taxpayertype;
    }

    public void setTaxpayertype(String taxpayertype) {
        this.taxpayertype = taxpayertype;
    }

    @Basic
    @Column( name = "telephone", nullable = true, length = 60 )
    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    @Basic
    @Column( name = "timestamp_createdby", nullable = true, length = 256 )
    public String getTimestampCreatedby() {
        return timestampCreatedby;
    }

    public void setTimestampCreatedby(String timestampCreatedby) {
        this.timestampCreatedby = timestampCreatedby;
    }

    @Basic
    @Column( name = "timestamp_createdon", nullable = true )
    public Timestamp getTimestampCreatedon() {
        return timestampCreatedon;
    }

    public void setTimestampCreatedon(Timestamp timestampCreatedon) {
        this.timestampCreatedon = timestampCreatedon;
    }

    @Basic
    @Column( name = "timestamp_lastchangedby", nullable = true, length = 256 )
    public String getTimestampLastchangedby() {
        return timestampLastchangedby;
    }

    public void setTimestampLastchangedby(String timestampLastchangedby) {
        this.timestampLastchangedby = timestampLastchangedby;
    }

    @Basic
    @Column( name = "timestamp_lastchangedon", nullable = true )
    public Timestamp getTimestampLastchangedon() {
        return timestampLastchangedon;
    }

    public void setTimestampLastchangedon(Timestamp timestampLastchangedon) {
        this.timestampLastchangedon = timestampLastchangedon;
    }

    @Basic
    @Column( name = "transcope", nullable = true, length = 2000 )
    public String getTranscope() {
        return transcope;
    }

    public void setTranscope(String transcope) {
        this.transcope = transcope;
    }

    @Basic
    @Column( name = "version", nullable = true )
    public Timestamp getVersion() {
        return version;
    }

    public void setVersion(Timestamp version) {
        this.version = version;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MdmpartnerEntity that = (MdmpartnerEntity) o;
        return Objects.equals(id, that.id) &&
                Objects.equals(address, that.address) &&
                Objects.equals(auditflowcharid, that.auditflowcharid) &&
                Objects.equals(auditstate, that.auditstate) &&
                Objects.equals(bankaccount, that.bankaccount) &&
                Objects.equals(bankid, that.bankid) &&
                Objects.equals(chargepercent, that.chargepercent) &&
                Objects.equals(code, that.code) &&
                Objects.equals(currencyid, that.currencyid) &&
                Objects.equals(customertype, that.customertype) &&
                Objects.equals(dblinkcode, that.dblinkcode) &&
                Objects.equals(disabletime, that.disabletime) &&
                Objects.equals(email, that.email) &&
                Objects.equals(englishname, that.englishname) &&
                Objects.equals(fax, that.fax) &&
                Objects.equals(idnumber, that.idnumber) &&
                Objects.equals(insidecom, that.insidecom) &&
                Objects.equals(invoicebank, that.invoicebank) &&
                Objects.equals(invoicebankaccount, that.invoicebankaccount) &&
                Objects.equals(iscustomer, that.iscustomer) &&
                Objects.equals(isdelete, that.isdelete) &&
                Objects.equals(ishistory, that.ishistory) &&
                Objects.equals(isinsidecom, that.isinsidecom) &&
                Objects.equals(issupplier, that.issupplier) &&
                Objects.equals(istrans, that.istrans) &&
                Objects.equals(keyword, that.keyword) &&
                Objects.equals(linkman, that.linkman) &&
                Objects.equals(managemode, that.managemode) &&
                Objects.equals(nameChs, that.nameChs) &&
                Objects.equals(nameCht, that.nameCht) &&
                Objects.equals(nameEn, that.nameEn) &&
                Objects.equals(nameEs, that.nameEs) &&
                Objects.equals(namePt, that.namePt) &&
                Objects.equals(ofcountry, that.ofcountry) &&
                Objects.equals(ofindustry, that.ofindustry) &&
                Objects.equals(ofregion, that.ofregion) &&
                Objects.equals(orgnumber, that.orgnumber) &&
                Objects.equals(ownertype, that.ownertype) &&
                Objects.equals(partnerarea, that.partnerarea) &&
                Objects.equals(partnertype, that.partnertype) &&
                Objects.equals(postcode, that.postcode) &&
                Objects.equals(psi, that.psi) &&
                Objects.equals(registercapital, that.registercapital) &&
                Objects.equals(remark, that.remark) &&
                Objects.equals(representative, that.representative) &&
                Objects.equals(scc, that.scc) &&
                Objects.equals(shortname, that.shortname) &&
                Objects.equals(suppliertype, that.suppliertype) &&
                Objects.equals(taxaccount, that.taxaccount) &&
                Objects.equals(taxpayertype, that.taxpayertype) &&
                Objects.equals(telephone, that.telephone) &&
                Objects.equals(timestampCreatedby, that.timestampCreatedby) &&
                Objects.equals(timestampCreatedon, that.timestampCreatedon) &&
                Objects.equals(timestampLastchangedby, that.timestampLastchangedby) &&
                Objects.equals(timestampLastchangedon, that.timestampLastchangedon) &&
                Objects.equals(transcope, that.transcope) &&
                Objects.equals(version, that.version);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, address, auditflowcharid, auditstate, bankaccount, bankid, chargepercent, code, currencyid, customertype, dblinkcode, disabletime, email, englishname, fax, idnumber, insidecom, invoicebank, invoicebankaccount, iscustomer, isdelete, ishistory, isinsidecom, issupplier, istrans, keyword, linkman, managemode, nameChs, nameCht, nameEn, nameEs, namePt, ofcountry, ofindustry, ofregion, orgnumber, ownertype, partnerarea, partnertype, postcode, psi, registercapital, remark, representative, scc, shortname, suppliertype, taxaccount, taxpayertype, telephone, timestampCreatedby, timestampCreatedon, timestampLastchangedby, timestampLastchangedon, transcope, version);
    }
}
