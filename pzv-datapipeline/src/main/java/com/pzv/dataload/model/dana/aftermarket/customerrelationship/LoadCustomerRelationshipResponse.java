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
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="TotalCustomerRelationshipsReceived" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="TotalCustomerRelationshipsLoaded" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "totalCustomerRelationshipsReceived",
    "totalCustomerRelationshipsLoaded"
})
@XmlRootElement(name = "LoadCustomerRelationshipResponse")
public class LoadCustomerRelationshipResponse {

    @XmlElement(name = "TotalCustomerRelationshipsReceived")
    protected long totalCustomerRelationshipsReceived;
    @XmlElement(name = "TotalCustomerRelationshipsLoaded")
    protected long totalCustomerRelationshipsLoaded;

    /**
     * Gets the value of the totalCustomerRelationshipsReceived property.
     * 
     */
    public long getTotalCustomerRelationshipsReceived() {
        return totalCustomerRelationshipsReceived;
    }

    /**
     * Sets the value of the totalCustomerRelationshipsReceived property.
     * 
     */
    public void setTotalCustomerRelationshipsReceived(long value) {
        this.totalCustomerRelationshipsReceived = value;
    }

    /**
     * Gets the value of the totalCustomerRelationshipsLoaded property.
     * 
     */
    public long getTotalCustomerRelationshipsLoaded() {
        return totalCustomerRelationshipsLoaded;
    }

    /**
     * Sets the value of the totalCustomerRelationshipsLoaded property.
     * 
     */
    public void setTotalCustomerRelationshipsLoaded(long value) {
        this.totalCustomerRelationshipsLoaded = value;
    }

}
