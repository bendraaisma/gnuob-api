package com.netbrasoft.gnuob.api;

import java.io.Serializable;
import java.math.BigDecimal;
import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for offerRecord complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType name="offerRecord">
 *   &lt;complexContent>
 *     &lt;extension base="{http://gnuob.netbrasoft.com/}type">
 *       &lt;sequence>
 *         &lt;element name="amount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="itemHeight" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="itemHeightUnit" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="itemLength" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="itemLengthUnit" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="itemUrl" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="itemWeight" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="itemWeightUnit" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="itemWidth" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="itemWidthUnit" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="number" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="product" type="{http://gnuob.netbrasoft.com/}product" minOccurs="0"/>
 *         &lt;element name="quantity" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *         &lt;element name="tax" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "offerRecord", propOrder = { "amount", "description", "itemHeight", "itemHeightUnit", "itemLength", "itemLengthUnit", "itemUrl", "itemWeight", "itemWeightUnit", "itemWidth", "itemWidthUnit", "name", "number", "product", "quantity", "tax" })
public class OfferRecord extends Type implements Serializable {

    private static final long serialVersionUID = 546789756717912252L;
    protected BigDecimal amount;
    protected String description;
    protected BigDecimal itemHeight;
    protected String itemHeightUnit;
    protected BigDecimal itemLength;
    protected String itemLengthUnit;
    protected String itemUrl;
    protected BigDecimal itemWeight;
    protected String itemWeightUnit;
    protected BigDecimal itemWidth;
    protected String itemWidthUnit;
    protected String name;
    protected String number;
    protected Product product;
    @XmlElement(required = true)
    protected BigInteger quantity;
    protected BigDecimal tax;

    /**
     * Gets the value of the amount property.
     * 
     * @return possible object is {@link BigDecimal }
     * 
     */
    public BigDecimal getAmount() {
        return amount;
    }

    /**
     * Sets the value of the amount property.
     * 
     * @param value
     *            allowed object is {@link BigDecimal }
     * 
     */
    public void setAmount(BigDecimal value) {
        this.amount = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *            allowed object is {@link String }
     * 
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Gets the value of the itemHeight property.
     * 
     * @return possible object is {@link BigDecimal }
     * 
     */
    public BigDecimal getItemHeight() {
        return itemHeight;
    }

    /**
     * Sets the value of the itemHeight property.
     * 
     * @param value
     *            allowed object is {@link BigDecimal }
     * 
     */
    public void setItemHeight(BigDecimal value) {
        this.itemHeight = value;
    }

    /**
     * Gets the value of the itemHeightUnit property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getItemHeightUnit() {
        return itemHeightUnit;
    }

    /**
     * Sets the value of the itemHeightUnit property.
     * 
     * @param value
     *            allowed object is {@link String }
     * 
     */
    public void setItemHeightUnit(String value) {
        this.itemHeightUnit = value;
    }

    /**
     * Gets the value of the itemLength property.
     * 
     * @return possible object is {@link BigDecimal }
     * 
     */
    public BigDecimal getItemLength() {
        return itemLength;
    }

    /**
     * Sets the value of the itemLength property.
     * 
     * @param value
     *            allowed object is {@link BigDecimal }
     * 
     */
    public void setItemLength(BigDecimal value) {
        this.itemLength = value;
    }

    /**
     * Gets the value of the itemLengthUnit property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getItemLengthUnit() {
        return itemLengthUnit;
    }

    /**
     * Sets the value of the itemLengthUnit property.
     * 
     * @param value
     *            allowed object is {@link String }
     * 
     */
    public void setItemLengthUnit(String value) {
        this.itemLengthUnit = value;
    }

    /**
     * Gets the value of the itemUrl property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getItemUrl() {
        return itemUrl;
    }

    /**
     * Sets the value of the itemUrl property.
     * 
     * @param value
     *            allowed object is {@link String }
     * 
     */
    public void setItemUrl(String value) {
        this.itemUrl = value;
    }

    /**
     * Gets the value of the itemWeight property.
     * 
     * @return possible object is {@link BigDecimal }
     * 
     */
    public BigDecimal getItemWeight() {
        return itemWeight;
    }

    /**
     * Sets the value of the itemWeight property.
     * 
     * @param value
     *            allowed object is {@link BigDecimal }
     * 
     */
    public void setItemWeight(BigDecimal value) {
        this.itemWeight = value;
    }

    /**
     * Gets the value of the itemWeightUnit property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getItemWeightUnit() {
        return itemWeightUnit;
    }

    /**
     * Sets the value of the itemWeightUnit property.
     * 
     * @param value
     *            allowed object is {@link String }
     * 
     */
    public void setItemWeightUnit(String value) {
        this.itemWeightUnit = value;
    }

    /**
     * Gets the value of the itemWidth property.
     * 
     * @return possible object is {@link BigDecimal }
     * 
     */
    public BigDecimal getItemWidth() {
        return itemWidth;
    }

    /**
     * Sets the value of the itemWidth property.
     * 
     * @param value
     *            allowed object is {@link BigDecimal }
     * 
     */
    public void setItemWidth(BigDecimal value) {
        this.itemWidth = value;
    }

    /**
     * Gets the value of the itemWidthUnit property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getItemWidthUnit() {
        return itemWidthUnit;
    }

    /**
     * Sets the value of the itemWidthUnit property.
     * 
     * @param value
     *            allowed object is {@link String }
     * 
     */
    public void setItemWidthUnit(String value) {
        this.itemWidthUnit = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *            allowed object is {@link String }
     * 
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the number property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getNumber() {
        return number;
    }

    /**
     * Sets the value of the number property.
     * 
     * @param value
     *            allowed object is {@link String }
     * 
     */
    public void setNumber(String value) {
        this.number = value;
    }

    /**
     * Gets the value of the product property.
     * 
     * @return possible object is {@link Product }
     * 
     */
    public Product getProduct() {
        return product;
    }

    /**
     * Sets the value of the product property.
     * 
     * @param value
     *            allowed object is {@link Product }
     * 
     */
    public void setProduct(Product value) {
        this.product = value;
    }

    /**
     * Gets the value of the quantity property.
     * 
     * @return possible object is {@link BigInteger }
     * 
     */
    public BigInteger getQuantity() {
        return quantity;
    }

    /**
     * Sets the value of the quantity property.
     * 
     * @param value
     *            allowed object is {@link BigInteger }
     * 
     */
    public void setQuantity(BigInteger value) {
        this.quantity = value;
    }

    /**
     * Gets the value of the tax property.
     * 
     * @return possible object is {@link BigDecimal }
     * 
     */
    public BigDecimal getTax() {
        return tax;
    }

    /**
     * Sets the value of the tax property.
     * 
     * @param value
     *            allowed object is {@link BigDecimal }
     * 
     */
    public void setTax(BigDecimal value) {
        this.tax = value;
    }

}
