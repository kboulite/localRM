/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cedamus.civilrm.ui;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.Serializable;
import java.math.BigInteger;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;

/**
 *
 * @author Khalid
 */
@Entity
@Table(name = "name_conformity", catalog = "local", schema = "local")
@NamedQueries({
    @NamedQuery(name = "NameConformity.findAll", query = "SELECT n FROM NameConformity n")
    , @NamedQuery(name = "NameConformity.findById", query = "SELECT n FROM NameConformity n WHERE n.id = :id")
    , @NamedQuery(name = "NameConformity.findByNumber", query = "SELECT n FROM NameConformity n WHERE n.number = :number")
    , @NamedQuery(name = "NameConformity.findByLastName", query = "SELECT n FROM NameConformity n WHERE n.lastName = :lastName")
    , @NamedQuery(name = "NameConformity.findByDeliveryDate", query = "SELECT n FROM NameConformity n WHERE n.deliveryDate = :deliveryDate")
    , @NamedQuery(name = "NameConformity.findByFirstName", query = "SELECT n FROM NameConformity n WHERE n.firstName = :firstName")
    , @NamedQuery(name = "NameConformity.findByFamilyName", query = "SELECT n FROM NameConformity n WHERE n.familyName = :familyName")
    , @NamedQuery(name = "NameConformity.findByBirthDate", query = "SELECT n FROM NameConformity n WHERE n.birthDate = :birthDate")
    , @NamedQuery(name = "NameConformity.findByBirthPlace", query = "SELECT n FROM NameConformity n WHERE n.birthPlace = :birthPlace")
    , @NamedQuery(name = "NameConformity.findByMotherFullName", query = "SELECT n FROM NameConformity n WHERE n.motherFullName = :motherFullName")
    , @NamedQuery(name = "NameConformity.findByFatherFullName", query = "SELECT n FROM NameConformity n WHERE n.fatherFullName = :fatherFullName")
    , @NamedQuery(name = "NameConformity.findByEditionDate", query = "SELECT n FROM NameConformity n WHERE n.editionDate = :editionDate")
    , @NamedQuery(name = "NameConformity.findByAutorityAgentFk", query = "SELECT n FROM NameConformity n WHERE n.autorityAgentFk = :autorityAgentFk")
    , @NamedQuery(name = "NameConformity.findByFirstNameBis", query = "SELECT n FROM NameConformity n WHERE n.firstNameBis = :firstNameBis")
    , @NamedQuery(name = "NameConformity.findByLastNameBis", query = "SELECT n FROM NameConformity n WHERE n.lastNameBis = :lastNameBis")
    , @NamedQuery(name = "NameConformity.findByCin", query = "SELECT n FROM NameConformity n WHERE n.cin = :cin")
    , @NamedQuery(name = "NameConformity.findByBirthActNumber", query = "SELECT n FROM NameConformity n WHERE n.birthActNumber = :birthActNumber")
    , @NamedQuery(name = "NameConformity.findByCivilAutority", query = "SELECT n FROM NameConformity n WHERE n.civilAutority = :civilAutority")})
public class NameConformityList implements Serializable {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "id")
    private Long id;
    @Column(name = "number")
    private String number;
    @Column(name = "last_name")
    private String lastName;
    @Column(name = "delivery_date")
    @Temporal(TemporalType.DATE)
    private Date deliveryDate;
    @Column(name = "first_name")
    private String firstName;
    @Column(name = "family_name")
    private String familyName;
    @Column(name = "birth_date")
    @Temporal(TemporalType.DATE)
    private Date birthDate;
    @Column(name = "birth_place")
    private String birthPlace;
    @Column(name = "mother_full_name")
    private String motherFullName;
    @Column(name = "father_full_name")
    private String fatherFullName;
    @Column(name = "edition_date")
    @Temporal(TemporalType.DATE)
    private Date editionDate;
    @Column(name = "autority_agent_fk")
    private BigInteger autorityAgentFk;
    @Column(name = "first_name_bis")
    private String firstNameBis;
    @Column(name = "last_name_bis")
    private String lastNameBis;
    @Column(name = "cin")
    private String cin;
    @Column(name = "birth_act_number")
    private String birthActNumber;
    @Column(name = "civil_autority")
    private String civilAutority;

    public NameConformityList() {
    }

    public NameConformityList(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        Long oldId = this.id;
        this.id = id;
        changeSupport.firePropertyChange("id", oldId, id);
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        String oldNumber = this.number;
        this.number = number;
        changeSupport.firePropertyChange("number", oldNumber, number);
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        String oldLastName = this.lastName;
        this.lastName = lastName;
        changeSupport.firePropertyChange("lastName", oldLastName, lastName);
    }

    public Date getDeliveryDate() {
        return deliveryDate;
    }

    public void setDeliveryDate(Date deliveryDate) {
        Date oldDeliveryDate = this.deliveryDate;
        this.deliveryDate = deliveryDate;
        changeSupport.firePropertyChange("deliveryDate", oldDeliveryDate, deliveryDate);
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        String oldFirstName = this.firstName;
        this.firstName = firstName;
        changeSupport.firePropertyChange("firstName", oldFirstName, firstName);
    }

    public String getFamilyName() {
        return familyName;
    }

    public void setFamilyName(String familyName) {
        String oldFamilyName = this.familyName;
        this.familyName = familyName;
        changeSupport.firePropertyChange("familyName", oldFamilyName, familyName);
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        Date oldBirthDate = this.birthDate;
        this.birthDate = birthDate;
        changeSupport.firePropertyChange("birthDate", oldBirthDate, birthDate);
    }

    public String getBirthPlace() {
        return birthPlace;
    }

    public void setBirthPlace(String birthPlace) {
        String oldBirthPlace = this.birthPlace;
        this.birthPlace = birthPlace;
        changeSupport.firePropertyChange("birthPlace", oldBirthPlace, birthPlace);
    }

    public String getMotherFullName() {
        return motherFullName;
    }

    public void setMotherFullName(String motherFullName) {
        String oldMotherFullName = this.motherFullName;
        this.motherFullName = motherFullName;
        changeSupport.firePropertyChange("motherFullName", oldMotherFullName, motherFullName);
    }

    public String getFatherFullName() {
        return fatherFullName;
    }

    public void setFatherFullName(String fatherFullName) {
        String oldFatherFullName = this.fatherFullName;
        this.fatherFullName = fatherFullName;
        changeSupport.firePropertyChange("fatherFullName", oldFatherFullName, fatherFullName);
    }

    public Date getEditionDate() {
        return editionDate;
    }

    public void setEditionDate(Date editionDate) {
        Date oldEditionDate = this.editionDate;
        this.editionDate = editionDate;
        changeSupport.firePropertyChange("editionDate", oldEditionDate, editionDate);
    }

    public BigInteger getAutorityAgentFk() {
        return autorityAgentFk;
    }

    public void setAutorityAgentFk(BigInteger autorityAgentFk) {
        BigInteger oldAutorityAgentFk = this.autorityAgentFk;
        this.autorityAgentFk = autorityAgentFk;
        changeSupport.firePropertyChange("autorityAgentFk", oldAutorityAgentFk, autorityAgentFk);
    }

    public String getFirstNameBis() {
        return firstNameBis;
    }

    public void setFirstNameBis(String firstNameBis) {
        String oldFirstNameBis = this.firstNameBis;
        this.firstNameBis = firstNameBis;
        changeSupport.firePropertyChange("firstNameBis", oldFirstNameBis, firstNameBis);
    }

    public String getLastNameBis() {
        return lastNameBis;
    }

    public void setLastNameBis(String lastNameBis) {
        String oldLastNameBis = this.lastNameBis;
        this.lastNameBis = lastNameBis;
        changeSupport.firePropertyChange("lastNameBis", oldLastNameBis, lastNameBis);
    }

    public String getCin() {
        return cin;
    }

    public void setCin(String cin) {
        String oldCin = this.cin;
        this.cin = cin;
        changeSupport.firePropertyChange("cin", oldCin, cin);
    }

    public String getBirthActNumber() {
        return birthActNumber;
    }

    public void setBirthActNumber(String birthActNumber) {
        String oldBirthActNumber = this.birthActNumber;
        this.birthActNumber = birthActNumber;
        changeSupport.firePropertyChange("birthActNumber", oldBirthActNumber, birthActNumber);
    }

    public String getCivilAutority() {
        return civilAutority;
    }

    public void setCivilAutority(String civilAutority) {
        String oldCivilAutority = this.civilAutority;
        this.civilAutority = civilAutority;
        changeSupport.firePropertyChange("civilAutority", oldCivilAutority, civilAutority);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof NameConformityList)) {
            return false;
        }
        NameConformityList other = (NameConformityList) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.cedamus.civilrm.ui.NameConformity[ id=" + id + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
