//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.08.19 at 01:30:50 PM IST 
//


package com.pzv.dataload.model.dana.aftermarket.vendor;

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
 *         &lt;element name="TotalVendorsReceived" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="TotalVendorsLoaded" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
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
    "totalVendorsReceived",
    "totalVendorsLoaded"
})
@XmlRootElement(name = "LoadVendorsResponse")
public class LoadVendorsResponse {

    @XmlElement(name = "TotalVendorsReceived")
    protected long totalVendorsReceived;
    @XmlElement(name = "TotalVendorsLoaded")
    protected long totalVendorsLoaded;

    /**
     * Gets the value of the totalVendorsReceived property.
     * 
     */
    public long getTotalVendorsReceived() {
        return totalVendorsReceived;
    }

    /**
     * Sets the value of the totalVendorsReceived property.
     * 
     */
    public void setTotalVendorsReceived(long value) {
        this.totalVendorsReceived = value;
    }

    /**
     * Gets the value of the totalVendorsLoaded property.
     * 
     */
    public long getTotalVendorsLoaded() {
        return totalVendorsLoaded;
    }

    /**
     * Sets the value of the totalVendorsLoaded property.
     * 
     */
    public void setTotalVendorsLoaded(long value) {
        this.totalVendorsLoaded = value;
    }

}
