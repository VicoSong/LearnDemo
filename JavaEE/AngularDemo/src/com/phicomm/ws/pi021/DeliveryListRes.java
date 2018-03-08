
package com.phicomm.ws.pi021;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>DeliveryList_Res complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="DeliveryList_Res"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ES_DELIVERY_STO_HEADER" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="STREET" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="ADRNR" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="EKGRP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="EKORG" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="BUKRS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="LIFNR" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="ERNAM" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="AEDAT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="BSART" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="EBELN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="E_WBSTK" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="E_RETURN" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="TYPE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="ID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="NUMBER" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="MESSAGE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="LOG_NO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="LOG_MSG_NO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="MESSAGE_V1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="MESSAGE_V2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="MESSAGE_V3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="MESSAGE_V4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="PARAMETER" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="ROW" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="FIELD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="SYSTEM" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="ET_DELIVERY_ITEM"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="ITEM" maxOccurs="unbounded" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="VBELN_VL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="POSNR_VL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="MATNR" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="WERKS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="LGORT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="LGMNG" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="MEINS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                           &lt;/sequence&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DeliveryList_Res", propOrder = {
    "esdeliverystoheader",
    "ewbstk",
    "ereturn",
    "etdeliveryitem"
})
public class DeliveryListRes {

    @XmlElement(name = "ES_DELIVERY_STO_HEADER")
    protected DeliveryListRes.ESDELIVERYSTOHEADER esdeliverystoheader;
    @XmlElement(name = "E_WBSTK")
    protected String ewbstk;
    @XmlElement(name = "E_RETURN")
    protected DeliveryListRes.ERETURN ereturn;
    @XmlElement(name = "ET_DELIVERY_ITEM", required = true)
    protected DeliveryListRes.ETDELIVERYITEM etdeliveryitem;

    /**
     * 获取esdeliverystoheader属性的值。
     * 
     * @return
     *     possible object is
     *     {@link DeliveryListRes.ESDELIVERYSTOHEADER }
     *     
     */
    public DeliveryListRes.ESDELIVERYSTOHEADER getESDELIVERYSTOHEADER() {
        return esdeliverystoheader;
    }

    /**
     * 设置esdeliverystoheader属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link DeliveryListRes.ESDELIVERYSTOHEADER }
     *     
     */
    public void setESDELIVERYSTOHEADER(DeliveryListRes.ESDELIVERYSTOHEADER value) {
        this.esdeliverystoheader = value;
    }

    /**
     * 获取ewbstk属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEWBSTK() {
        return ewbstk;
    }

    /**
     * 设置ewbstk属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEWBSTK(String value) {
        this.ewbstk = value;
    }

    /**
     * 获取ereturn属性的值。
     * 
     * @return
     *     possible object is
     *     {@link DeliveryListRes.ERETURN }
     *     
     */
    public DeliveryListRes.ERETURN getERETURN() {
        return ereturn;
    }

    /**
     * 设置ereturn属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link DeliveryListRes.ERETURN }
     *     
     */
    public void setERETURN(DeliveryListRes.ERETURN value) {
        this.ereturn = value;
    }

    /**
     * 获取etdeliveryitem属性的值。
     * 
     * @return
     *     possible object is
     *     {@link DeliveryListRes.ETDELIVERYITEM }
     *     
     */
    public DeliveryListRes.ETDELIVERYITEM getETDELIVERYITEM() {
        return etdeliveryitem;
    }

    /**
     * 设置etdeliveryitem属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link DeliveryListRes.ETDELIVERYITEM }
     *     
     */
    public void setETDELIVERYITEM(DeliveryListRes.ETDELIVERYITEM value) {
        this.etdeliveryitem = value;
    }


    /**
     * <p>anonymous complex type的 Java 类。
     * 
     * <p>以下模式片段指定包含在此类中的预期内容。
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="TYPE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="ID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="NUMBER" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="MESSAGE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="LOG_NO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="LOG_MSG_NO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="MESSAGE_V1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="MESSAGE_V2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="MESSAGE_V3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="MESSAGE_V4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="PARAMETER" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="ROW" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="FIELD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="SYSTEM" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
        "type",
        "id",
        "number",
        "message",
        "logno",
        "logmsgno",
        "messagev1",
        "messagev2",
        "messagev3",
        "messagev4",
        "parameter",
        "row",
        "field",
        "system"
    })
    public static class ERETURN {

        @XmlElement(name = "TYPE")
        protected String type;
        @XmlElement(name = "ID")
        protected String id;
        @XmlElement(name = "NUMBER")
        protected String number;
        @XmlElement(name = "MESSAGE")
        protected String message;
        @XmlElement(name = "LOG_NO")
        protected String logno;
        @XmlElement(name = "LOG_MSG_NO")
        protected String logmsgno;
        @XmlElement(name = "MESSAGE_V1")
        protected String messagev1;
        @XmlElement(name = "MESSAGE_V2")
        protected String messagev2;
        @XmlElement(name = "MESSAGE_V3")
        protected String messagev3;
        @XmlElement(name = "MESSAGE_V4")
        protected String messagev4;
        @XmlElement(name = "PARAMETER")
        protected String parameter;
        @XmlElement(name = "ROW")
        protected String row;
        @XmlElement(name = "FIELD")
        protected String field;
        @XmlElement(name = "SYSTEM")
        protected String system;

        /**
         * 获取type属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTYPE() {
            return type;
        }

        /**
         * 设置type属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setTYPE(String value) {
            this.type = value;
        }

        /**
         * 获取id属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getID() {
            return id;
        }

        /**
         * 设置id属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setID(String value) {
            this.id = value;
        }

        /**
         * 获取number属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getNUMBER() {
            return number;
        }

        /**
         * 设置number属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setNUMBER(String value) {
            this.number = value;
        }

        /**
         * 获取message属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getMESSAGE() {
            return message;
        }

        /**
         * 设置message属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setMESSAGE(String value) {
            this.message = value;
        }

        /**
         * 获取logno属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getLOGNO() {
            return logno;
        }

        /**
         * 设置logno属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setLOGNO(String value) {
            this.logno = value;
        }

        /**
         * 获取logmsgno属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getLOGMSGNO() {
            return logmsgno;
        }

        /**
         * 设置logmsgno属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setLOGMSGNO(String value) {
            this.logmsgno = value;
        }

        /**
         * 获取messagev1属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getMESSAGEV1() {
            return messagev1;
        }

        /**
         * 设置messagev1属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setMESSAGEV1(String value) {
            this.messagev1 = value;
        }

        /**
         * 获取messagev2属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getMESSAGEV2() {
            return messagev2;
        }

        /**
         * 设置messagev2属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setMESSAGEV2(String value) {
            this.messagev2 = value;
        }

        /**
         * 获取messagev3属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getMESSAGEV3() {
            return messagev3;
        }

        /**
         * 设置messagev3属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setMESSAGEV3(String value) {
            this.messagev3 = value;
        }

        /**
         * 获取messagev4属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getMESSAGEV4() {
            return messagev4;
        }

        /**
         * 设置messagev4属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setMESSAGEV4(String value) {
            this.messagev4 = value;
        }

        /**
         * 获取parameter属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPARAMETER() {
            return parameter;
        }

        /**
         * 设置parameter属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPARAMETER(String value) {
            this.parameter = value;
        }

        /**
         * 获取row属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getROW() {
            return row;
        }

        /**
         * 设置row属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setROW(String value) {
            this.row = value;
        }

        /**
         * 获取field属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getFIELD() {
            return field;
        }

        /**
         * 设置field属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setFIELD(String value) {
            this.field = value;
        }

        /**
         * 获取system属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSYSTEM() {
            return system;
        }

        /**
         * 设置system属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSYSTEM(String value) {
            this.system = value;
        }

    }


    /**
     * <p>anonymous complex type的 Java 类。
     * 
     * <p>以下模式片段指定包含在此类中的预期内容。
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="STREET" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="ADRNR" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="EKGRP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="EKORG" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="BUKRS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="LIFNR" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="ERNAM" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="AEDAT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="BSART" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="EBELN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
        "street",
        "adrnr",
        "ekgrp",
        "ekorg",
        "bukrs",
        "lifnr",
        "ernam",
        "aedat",
        "bsart",
        "ebeln"
    })
    public static class ESDELIVERYSTOHEADER {

        @XmlElement(name = "STREET")
        protected String street;
        @XmlElement(name = "ADRNR")
        protected String adrnr;
        @XmlElement(name = "EKGRP")
        protected String ekgrp;
        @XmlElement(name = "EKORG")
        protected String ekorg;
        @XmlElement(name = "BUKRS")
        protected String bukrs;
        @XmlElement(name = "LIFNR")
        protected String lifnr;
        @XmlElement(name = "ERNAM")
        protected String ernam;
        @XmlElement(name = "AEDAT")
        protected String aedat;
        @XmlElement(name = "BSART")
        protected String bsart;
        @XmlElement(name = "EBELN")
        protected String ebeln;

        /**
         * 获取street属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSTREET() {
            return street;
        }

        /**
         * 设置street属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSTREET(String value) {
            this.street = value;
        }

        /**
         * 获取adrnr属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getADRNR() {
            return adrnr;
        }

        /**
         * 设置adrnr属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setADRNR(String value) {
            this.adrnr = value;
        }

        /**
         * 获取ekgrp属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getEKGRP() {
            return ekgrp;
        }

        /**
         * 设置ekgrp属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setEKGRP(String value) {
            this.ekgrp = value;
        }

        /**
         * 获取ekorg属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getEKORG() {
            return ekorg;
        }

        /**
         * 设置ekorg属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setEKORG(String value) {
            this.ekorg = value;
        }

        /**
         * 获取bukrs属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getBUKRS() {
            return bukrs;
        }

        /**
         * 设置bukrs属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setBUKRS(String value) {
            this.bukrs = value;
        }

        /**
         * 获取lifnr属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getLIFNR() {
            return lifnr;
        }

        /**
         * 设置lifnr属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setLIFNR(String value) {
            this.lifnr = value;
        }

        /**
         * 获取ernam属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getERNAM() {
            return ernam;
        }

        /**
         * 设置ernam属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setERNAM(String value) {
            this.ernam = value;
        }

        /**
         * 获取aedat属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAEDAT() {
            return aedat;
        }

        /**
         * 设置aedat属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAEDAT(String value) {
            this.aedat = value;
        }

        /**
         * 获取bsart属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getBSART() {
            return bsart;
        }

        /**
         * 设置bsart属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setBSART(String value) {
            this.bsart = value;
        }

        /**
         * 获取ebeln属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getEBELN() {
            return ebeln;
        }

        /**
         * 设置ebeln属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setEBELN(String value) {
            this.ebeln = value;
        }

    }


    /**
     * <p>anonymous complex type的 Java 类。
     * 
     * <p>以下模式片段指定包含在此类中的预期内容。
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="ITEM" maxOccurs="unbounded" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="VBELN_VL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="POSNR_VL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="MATNR" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="WERKS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="LGORT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="LGMNG" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="MEINS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                 &lt;/sequence&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
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
        "item"
    })
    public static class ETDELIVERYITEM {

        @XmlElement(name = "ITEM")
        protected List<DeliveryListRes.ETDELIVERYITEM.ITEM> item;

        /**
         * Gets the value of the item property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the item property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getITEM().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link DeliveryListRes.ETDELIVERYITEM.ITEM }
         * 
         * 
         */
        public List<DeliveryListRes.ETDELIVERYITEM.ITEM> getITEM() {
            if (item == null) {
                item = new ArrayList<DeliveryListRes.ETDELIVERYITEM.ITEM>();
            }
            return this.item;
        }


        /**
         * <p>anonymous complex type的 Java 类。
         * 
         * <p>以下模式片段指定包含在此类中的预期内容。
         * 
         * <pre>
         * &lt;complexType&gt;
         *   &lt;complexContent&gt;
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *       &lt;sequence&gt;
         *         &lt;element name="VBELN_VL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="POSNR_VL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="MATNR" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="WERKS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="LGORT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="LGMNG" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="MEINS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
            "vbelnvl",
            "posnrvl",
            "matnr",
            "werks",
            "lgort",
            "lgmng",
            "meins"
        })
        public static class ITEM {

            @XmlElement(name = "VBELN_VL")
            protected String vbelnvl;
            @XmlElement(name = "POSNR_VL")
            protected String posnrvl;
            @XmlElement(name = "MATNR")
            protected String matnr;
            @XmlElement(name = "WERKS")
            protected String werks;
            @XmlElement(name = "LGORT")
            protected String lgort;
            @XmlElement(name = "LGMNG")
            protected String lgmng;
            @XmlElement(name = "MEINS")
            protected String meins;

            /**
             * 获取vbelnvl属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getVBELNVL() {
                return vbelnvl;
            }

            /**
             * 设置vbelnvl属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setVBELNVL(String value) {
                this.vbelnvl = value;
            }

            /**
             * 获取posnrvl属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getPOSNRVL() {
                return posnrvl;
            }

            /**
             * 设置posnrvl属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setPOSNRVL(String value) {
                this.posnrvl = value;
            }

            /**
             * 获取matnr属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getMATNR() {
                return matnr;
            }

            /**
             * 设置matnr属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setMATNR(String value) {
                this.matnr = value;
            }

            /**
             * 获取werks属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getWERKS() {
                return werks;
            }

            /**
             * 设置werks属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setWERKS(String value) {
                this.werks = value;
            }

            /**
             * 获取lgort属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getLGORT() {
                return lgort;
            }

            /**
             * 设置lgort属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setLGORT(String value) {
                this.lgort = value;
            }

            /**
             * 获取lgmng属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getLGMNG() {
                return lgmng;
            }

            /**
             * 设置lgmng属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setLGMNG(String value) {
                this.lgmng = value;
            }

            /**
             * 获取meins属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getMEINS() {
                return meins;
            }

            /**
             * 设置meins属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setMEINS(String value) {
                this.meins = value;
            }

        }

    }

}
