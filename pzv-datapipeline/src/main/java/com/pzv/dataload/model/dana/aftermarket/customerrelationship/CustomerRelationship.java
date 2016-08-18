//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.08.18 at 09:49:51 AM IST 
//


package com.pzv.dataload.model.dana.aftermarket.customerrelationship;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CustomerRelationship complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CustomerRelationship"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="DealerCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="BillToCustomerNo" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="ShipToCustomerNo" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="MailToCustomerNo" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Channel" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="ChannelNumber" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Route" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="Payer" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CustomerRelationship", propOrder = {
    "dealerCode",
    "billToCustomerNo",
    "shipToCustomerNo",
    "mailToCustomerNo",
    "channel",
    "channelNumber",
    "route",
    "payer"
})
public class CustomerRelationship {

    @XmlElement(name = "DealerCode", required = true)
    protected String dealerCode;
    @XmlElement(name = "BillToCustomerNo", required = true, defaultValue = "na")
    protected String billToCustomerNo;
    @XmlElement(name = "ShipToCustomerNo", required = true, defaultValue = "na")
    protected String shipToCustomerNo;
    @XmlElement(name = "MailToCustomerNo", required = true, defaultValue = "na")
    protected String mailToCustomerNo;
    @XmlElement(name = "Channel", required = true)
    protected String channel;
    @XmlElement(name = "ChannelNumber", required = true)
    protected String channelNumber;
    @XmlElement(name = "Route")
    protected boolean route;
    @XmlElement(name = "Payer", required = true)
    protected String payer;

    /**
     * Gets the value of the dealerCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDealerCode() {
        return dealerCode;
    }

    /**
     * Sets the value of the dealerCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDealerCode(String value) {
        this.dealerCode = value;
    }

    /**
     * Gets the value of the billToCustomerNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBillToCustomerNo() {
        return billToCustomerNo;
    }

    /**
     * Sets the value of the billToCustomerNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBillToCustomerNo(String value) {
        this.billToCustomerNo = value;
    }

    /**
     * Gets the value of the shipToCustomerNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShipToCustomerNo() {
        return shipToCustomerNo;
    }

    /**
     * Sets the value of the shipToCustomerNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShipToCustomerNo(String value) {
        this.shipToCustomerNo = value;
    }

    /**
     * Gets the value of the mailToCustomerNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMailToCustomerNo() {
        return mailToCustomerNo;
    }

    /**
     * Sets the value of the mailToCustomerNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMailToCustomerNo(String value) {
        this.mailToCustomerNo = value;
    }

    /**
     * Gets the value of the channel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChannel() {
        return channel;
    }

    /**
     * Sets the value of the channel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChannel(String value) {
        this.channel = value;
    }

    /**
     * Gets the value of the channelNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChannelNumber() {
        return channelNumber;
    }

    /**
     * Sets the value of the channelNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChannelNumber(String value) {
        this.channelNumber = value;
    }

    /**
     * Gets the value of the route property.
     * 
     */
    public boolean isRoute() {
        return route;
    }

    /**
     * Sets the value of the route property.
     * 
     */
    public void setRoute(boolean value) {
        this.route = value;
    }

    /**
     * Gets the value of the payer property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPayer() {
        return payer;
    }

    /**
     * Sets the value of the payer property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPayer(String value) {
        this.payer = value;
    }

}