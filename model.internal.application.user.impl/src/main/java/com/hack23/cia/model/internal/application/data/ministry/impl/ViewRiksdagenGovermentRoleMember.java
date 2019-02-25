//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.02.25 at 12:05:09 AM CET 
//


package com.hack23.cia.model.internal.application.data.ministry.impl;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import com.hack23.cia.model.common.api.ModelObject;
import com.hack23.cia.model.common.impl.xml.XmlDateTypeAdapter;
import org.jvnet.jaxb2_commons.lang.Equals;
import org.jvnet.jaxb2_commons.lang.EqualsStrategy;
import org.jvnet.jaxb2_commons.lang.HashCode;
import org.jvnet.jaxb2_commons.lang.HashCodeStrategy;
import org.jvnet.jaxb2_commons.lang.JAXBEqualsStrategy;
import org.jvnet.jaxb2_commons.lang.JAXBHashCodeStrategy;
import org.jvnet.jaxb2_commons.lang.JAXBToStringStrategy;
import org.jvnet.jaxb2_commons.lang.ToString;
import org.jvnet.jaxb2_commons.lang.ToStringStrategy;
import org.jvnet.jaxb2_commons.locator.ObjectLocator;
import org.jvnet.jaxb2_commons.locator.util.LocatorUtils;


/**
 * <p>Java class for ViewRiksdagenGovermentRoleMember complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ViewRiksdagenGovermentRoleMember"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="roleId" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="detail" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="role_code" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="first_name" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="last_name" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="from_date" type="{http://www.w3.org/2001/XMLSchema}date"/&gt;
 *         &lt;element name="to_date" type="{http://www.w3.org/2001/XMLSchema}date"/&gt;
 *         &lt;element name="person_id" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="party" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="total_days_served" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="active" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ViewRiksdagenGovermentRoleMember", propOrder = {
    "roleId",
    "detail",
    "roleCode",
    "firstName",
    "lastName",
    "fromDate",
    "toDate",
    "personId",
    "party",
    "totalDaysServed",
    "active"
})
@Entity(name = "ViewRiksdagenGovermentRoleMember")
@Table(name = "VIEW_RIKSDAGEN_GOVERMENT_ROLE_MEMBER")
@Inheritance(strategy = InheritanceType.JOINED)
public class ViewRiksdagenGovermentRoleMember
    implements Serializable, ModelObject, Equals, HashCode, ToString
{

    protected long roleId;
    @XmlElement(required = true)
    protected String detail;
    @XmlElement(name = "role_code", required = true)
    protected String roleCode;
    @XmlElement(name = "first_name", required = true)
    protected String firstName;
    @XmlElement(name = "last_name", required = true)
    protected String lastName;
    @XmlElement(name = "from_date", required = true, type = String.class)
    @XmlJavaTypeAdapter(XmlDateTypeAdapter.class)
    @XmlSchemaType(name = "date")
    protected Date fromDate;
    @XmlElement(name = "to_date", required = true, type = String.class)
    @XmlJavaTypeAdapter(XmlDateTypeAdapter.class)
    @XmlSchemaType(name = "date")
    protected Date toDate;
    @XmlElement(name = "person_id", required = true)
    protected String personId;
    @XmlElement(required = true)
    protected String party;
    @XmlElement(name = "total_days_served")
    protected int totalDaysServed;
    protected boolean active;

    /**
     * Gets the value of the roleId property.
     * 
     */
    @Id
    @Column(name = "ROLE_ID")
    public long getRoleId() {
        return roleId;
    }

    /**
     * Sets the value of the roleId property.
     * 
     */
    public void setRoleId(long value) {
        this.roleId = value;
    }

    /**
     * Gets the value of the detail property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Basic
    @Column(name = "DETAIL", length = 255)
    public String getDetail() {
        return detail;
    }

    /**
     * Sets the value of the detail property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDetail(String value) {
        this.detail = value;
    }

    /**
     * Gets the value of the roleCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Basic
    @Column(name = "ROLE_CODE", length = 255)
    public String getRoleCode() {
        return roleCode;
    }

    /**
     * Sets the value of the roleCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRoleCode(String value) {
        this.roleCode = value;
    }

    /**
     * Gets the value of the firstName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Basic
    @Column(name = "FIRST_NAME", length = 255)
    public String getFirstName() {
        return firstName;
    }

    /**
     * Sets the value of the firstName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFirstName(String value) {
        this.firstName = value;
    }

    /**
     * Gets the value of the lastName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Basic
    @Column(name = "LAST_NAME", length = 255)
    public String getLastName() {
        return lastName;
    }

    /**
     * Sets the value of the lastName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLastName(String value) {
        this.lastName = value;
    }

    /**
     * Gets the value of the fromDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Basic
    @Column(name = "FROM_DATE")
    @Temporal(TemporalType.DATE)
    public Date getFromDate() {
        return fromDate;
    }

    /**
     * Sets the value of the fromDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFromDate(Date value) {
        this.fromDate = value;
    }

    /**
     * Gets the value of the toDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Basic
    @Column(name = "TO_DATE")
    @Temporal(TemporalType.DATE)
    public Date getToDate() {
        return toDate;
    }

    /**
     * Sets the value of the toDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setToDate(Date value) {
        this.toDate = value;
    }

    /**
     * Gets the value of the personId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Basic
    @Column(name = "PERSON_ID", length = 255)
    public String getPersonId() {
        return personId;
    }

    /**
     * Sets the value of the personId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPersonId(String value) {
        this.personId = value;
    }

    /**
     * Gets the value of the party property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Basic
    @Column(name = "PARTY", length = 255)
    public String getParty() {
        return party;
    }

    /**
     * Sets the value of the party property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setParty(String value) {
        this.party = value;
    }

    /**
     * Gets the value of the totalDaysServed property.
     * 
     */
    @Basic
    @Column(name = "TOTAL_DAYS_SERVED", precision = 10, scale = 0)
    public int getTotalDaysServed() {
        return totalDaysServed;
    }

    /**
     * Sets the value of the totalDaysServed property.
     * 
     */
    public void setTotalDaysServed(int value) {
        this.totalDaysServed = value;
    }

    /**
     * Gets the value of the active property.
     * 
     */
    @Basic
    @Column(name = "ACTIVE")
    public boolean isActive() {
        return active;
    }

    /**
     * Sets the value of the active property.
     * 
     */
    public void setActive(boolean value) {
        this.active = value;
    }

    public ViewRiksdagenGovermentRoleMember withRoleId(long value) {
        setRoleId(value);
        return this;
    }

    public ViewRiksdagenGovermentRoleMember withDetail(String value) {
        setDetail(value);
        return this;
    }

    public ViewRiksdagenGovermentRoleMember withRoleCode(String value) {
        setRoleCode(value);
        return this;
    }

    public ViewRiksdagenGovermentRoleMember withFirstName(String value) {
        setFirstName(value);
        return this;
    }

    public ViewRiksdagenGovermentRoleMember withLastName(String value) {
        setLastName(value);
        return this;
    }

    public ViewRiksdagenGovermentRoleMember withFromDate(Date value) {
        setFromDate(value);
        return this;
    }

    public ViewRiksdagenGovermentRoleMember withToDate(Date value) {
        setToDate(value);
        return this;
    }

    public ViewRiksdagenGovermentRoleMember withPersonId(String value) {
        setPersonId(value);
        return this;
    }

    public ViewRiksdagenGovermentRoleMember withParty(String value) {
        setParty(value);
        return this;
    }

    public ViewRiksdagenGovermentRoleMember withTotalDaysServed(int value) {
        setTotalDaysServed(value);
        return this;
    }

    public ViewRiksdagenGovermentRoleMember withActive(boolean value) {
        setActive(value);
        return this;
    }

    public String toString() {
        final ToStringStrategy strategy = JAXBToStringStrategy.INSTANCE;
        final StringBuilder buffer = new StringBuilder();
        append(null, buffer, strategy);
        return buffer.toString();
    }

    public StringBuilder append(ObjectLocator locator, StringBuilder buffer, ToStringStrategy strategy) {
        strategy.appendStart(locator, this, buffer);
        appendFields(locator, buffer, strategy);
        strategy.appendEnd(locator, this, buffer);
        return buffer;
    }

    public StringBuilder appendFields(ObjectLocator locator, StringBuilder buffer, ToStringStrategy strategy) {
        {
            long theRoleId;
            theRoleId = this.getRoleId();
            strategy.appendField(locator, this, "roleId", buffer, theRoleId);
        }
        {
            String theDetail;
            theDetail = this.getDetail();
            strategy.appendField(locator, this, "detail", buffer, theDetail);
        }
        {
            String theRoleCode;
            theRoleCode = this.getRoleCode();
            strategy.appendField(locator, this, "roleCode", buffer, theRoleCode);
        }
        {
            String theFirstName;
            theFirstName = this.getFirstName();
            strategy.appendField(locator, this, "firstName", buffer, theFirstName);
        }
        {
            String theLastName;
            theLastName = this.getLastName();
            strategy.appendField(locator, this, "lastName", buffer, theLastName);
        }
        {
            Date theFromDate;
            theFromDate = this.getFromDate();
            strategy.appendField(locator, this, "fromDate", buffer, theFromDate);
        }
        {
            Date theToDate;
            theToDate = this.getToDate();
            strategy.appendField(locator, this, "toDate", buffer, theToDate);
        }
        {
            String thePersonId;
            thePersonId = this.getPersonId();
            strategy.appendField(locator, this, "personId", buffer, thePersonId);
        }
        {
            String theParty;
            theParty = this.getParty();
            strategy.appendField(locator, this, "party", buffer, theParty);
        }
        {
            int theTotalDaysServed;
            theTotalDaysServed = this.getTotalDaysServed();
            strategy.appendField(locator, this, "totalDaysServed", buffer, theTotalDaysServed);
        }
        {
            boolean theActive;
            theActive = this.isActive();
            strategy.appendField(locator, this, "active", buffer, theActive);
        }
        return buffer;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if ((object == null)||(this.getClass()!= object.getClass())) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final ViewRiksdagenGovermentRoleMember that = ((ViewRiksdagenGovermentRoleMember) object);
        {
            long lhsRoleId;
            lhsRoleId = this.getRoleId();
            long rhsRoleId;
            rhsRoleId = that.getRoleId();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "roleId", lhsRoleId), LocatorUtils.property(thatLocator, "roleId", rhsRoleId), lhsRoleId, rhsRoleId)) {
                return false;
            }
        }
        {
            String lhsDetail;
            lhsDetail = this.getDetail();
            String rhsDetail;
            rhsDetail = that.getDetail();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "detail", lhsDetail), LocatorUtils.property(thatLocator, "detail", rhsDetail), lhsDetail, rhsDetail)) {
                return false;
            }
        }
        {
            String lhsRoleCode;
            lhsRoleCode = this.getRoleCode();
            String rhsRoleCode;
            rhsRoleCode = that.getRoleCode();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "roleCode", lhsRoleCode), LocatorUtils.property(thatLocator, "roleCode", rhsRoleCode), lhsRoleCode, rhsRoleCode)) {
                return false;
            }
        }
        {
            String lhsFirstName;
            lhsFirstName = this.getFirstName();
            String rhsFirstName;
            rhsFirstName = that.getFirstName();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "firstName", lhsFirstName), LocatorUtils.property(thatLocator, "firstName", rhsFirstName), lhsFirstName, rhsFirstName)) {
                return false;
            }
        }
        {
            String lhsLastName;
            lhsLastName = this.getLastName();
            String rhsLastName;
            rhsLastName = that.getLastName();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "lastName", lhsLastName), LocatorUtils.property(thatLocator, "lastName", rhsLastName), lhsLastName, rhsLastName)) {
                return false;
            }
        }
        {
            Date lhsFromDate;
            lhsFromDate = this.getFromDate();
            Date rhsFromDate;
            rhsFromDate = that.getFromDate();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "fromDate", lhsFromDate), LocatorUtils.property(thatLocator, "fromDate", rhsFromDate), lhsFromDate, rhsFromDate)) {
                return false;
            }
        }
        {
            Date lhsToDate;
            lhsToDate = this.getToDate();
            Date rhsToDate;
            rhsToDate = that.getToDate();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "toDate", lhsToDate), LocatorUtils.property(thatLocator, "toDate", rhsToDate), lhsToDate, rhsToDate)) {
                return false;
            }
        }
        {
            String lhsPersonId;
            lhsPersonId = this.getPersonId();
            String rhsPersonId;
            rhsPersonId = that.getPersonId();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "personId", lhsPersonId), LocatorUtils.property(thatLocator, "personId", rhsPersonId), lhsPersonId, rhsPersonId)) {
                return false;
            }
        }
        {
            String lhsParty;
            lhsParty = this.getParty();
            String rhsParty;
            rhsParty = that.getParty();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "party", lhsParty), LocatorUtils.property(thatLocator, "party", rhsParty), lhsParty, rhsParty)) {
                return false;
            }
        }
        {
            int lhsTotalDaysServed;
            lhsTotalDaysServed = this.getTotalDaysServed();
            int rhsTotalDaysServed;
            rhsTotalDaysServed = that.getTotalDaysServed();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "totalDaysServed", lhsTotalDaysServed), LocatorUtils.property(thatLocator, "totalDaysServed", rhsTotalDaysServed), lhsTotalDaysServed, rhsTotalDaysServed)) {
                return false;
            }
        }
        {
            boolean lhsActive;
            lhsActive = this.isActive();
            boolean rhsActive;
            rhsActive = that.isActive();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "active", lhsActive), LocatorUtils.property(thatLocator, "active", rhsActive), lhsActive, rhsActive)) {
                return false;
            }
        }
        return true;
    }

    public boolean equals(Object object) {
        final EqualsStrategy strategy = JAXBEqualsStrategy.INSTANCE;
        return equals(null, null, object, strategy);
    }

    public int hashCode(ObjectLocator locator, HashCodeStrategy strategy) {
        int currentHashCode = 1;
        {
            long theRoleId;
            theRoleId = this.getRoleId();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "roleId", theRoleId), currentHashCode, theRoleId);
        }
        {
            String theDetail;
            theDetail = this.getDetail();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "detail", theDetail), currentHashCode, theDetail);
        }
        {
            String theRoleCode;
            theRoleCode = this.getRoleCode();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "roleCode", theRoleCode), currentHashCode, theRoleCode);
        }
        {
            String theFirstName;
            theFirstName = this.getFirstName();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "firstName", theFirstName), currentHashCode, theFirstName);
        }
        {
            String theLastName;
            theLastName = this.getLastName();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "lastName", theLastName), currentHashCode, theLastName);
        }
        {
            Date theFromDate;
            theFromDate = this.getFromDate();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "fromDate", theFromDate), currentHashCode, theFromDate);
        }
        {
            Date theToDate;
            theToDate = this.getToDate();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "toDate", theToDate), currentHashCode, theToDate);
        }
        {
            String thePersonId;
            thePersonId = this.getPersonId();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "personId", thePersonId), currentHashCode, thePersonId);
        }
        {
            String theParty;
            theParty = this.getParty();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "party", theParty), currentHashCode, theParty);
        }
        {
            int theTotalDaysServed;
            theTotalDaysServed = this.getTotalDaysServed();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "totalDaysServed", theTotalDaysServed), currentHashCode, theTotalDaysServed);
        }
        {
            boolean theActive;
            theActive = this.isActive();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "active", theActive), currentHashCode, theActive);
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

}