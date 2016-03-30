/**
 * SendMessageRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Nov 19, 2006 (02:31:34 GMT+00:00) WSDL2Java emitter.
 */

package com.processmaker.www;

public class SendMessageRequest  implements java.io.Serializable {
    private java.lang.String sessionId;

    private java.lang.String caseId;

    private java.lang.String from;

    private java.lang.String to;

    private java.lang.String cc;

    private java.lang.String bcc;

    private java.lang.String subject;

    private java.lang.String template;

    public SendMessageRequest() {
    }

    public SendMessageRequest(
           java.lang.String sessionId,
           java.lang.String caseId,
           java.lang.String from,
           java.lang.String to,
           java.lang.String cc,
           java.lang.String bcc,
           java.lang.String subject,
           java.lang.String template) {
           this.sessionId = sessionId;
           this.caseId = caseId;
           this.from = from;
           this.to = to;
           this.cc = cc;
           this.bcc = bcc;
           this.subject = subject;
           this.template = template;
    }


    /**
     * Gets the sessionId value for this SendMessageRequest.
     * 
     * @return sessionId
     */
    public java.lang.String getSessionId() {
        return sessionId;
    }


    /**
     * Sets the sessionId value for this SendMessageRequest.
     * 
     * @param sessionId
     */
    public void setSessionId(java.lang.String sessionId) {
        this.sessionId = sessionId;
    }


    /**
     * Gets the caseId value for this SendMessageRequest.
     * 
     * @return caseId
     */
    public java.lang.String getCaseId() {
        return caseId;
    }


    /**
     * Sets the caseId value for this SendMessageRequest.
     * 
     * @param caseId
     */
    public void setCaseId(java.lang.String caseId) {
        this.caseId = caseId;
    }


    /**
     * Gets the from value for this SendMessageRequest.
     * 
     * @return from
     */
    public java.lang.String getFrom() {
        return from;
    }


    /**
     * Sets the from value for this SendMessageRequest.
     * 
     * @param from
     */
    public void setFrom(java.lang.String from) {
        this.from = from;
    }


    /**
     * Gets the to value for this SendMessageRequest.
     * 
     * @return to
     */
    public java.lang.String getTo() {
        return to;
    }


    /**
     * Sets the to value for this SendMessageRequest.
     * 
     * @param to
     */
    public void setTo(java.lang.String to) {
        this.to = to;
    }


    /**
     * Gets the cc value for this SendMessageRequest.
     * 
     * @return cc
     */
    public java.lang.String getCc() {
        return cc;
    }


    /**
     * Sets the cc value for this SendMessageRequest.
     * 
     * @param cc
     */
    public void setCc(java.lang.String cc) {
        this.cc = cc;
    }


    /**
     * Gets the bcc value for this SendMessageRequest.
     * 
     * @return bcc
     */
    public java.lang.String getBcc() {
        return bcc;
    }


    /**
     * Sets the bcc value for this SendMessageRequest.
     * 
     * @param bcc
     */
    public void setBcc(java.lang.String bcc) {
        this.bcc = bcc;
    }


    /**
     * Gets the subject value for this SendMessageRequest.
     * 
     * @return subject
     */
    public java.lang.String getSubject() {
        return subject;
    }


    /**
     * Sets the subject value for this SendMessageRequest.
     * 
     * @param subject
     */
    public void setSubject(java.lang.String subject) {
        this.subject = subject;
    }


    /**
     * Gets the template value for this SendMessageRequest.
     * 
     * @return template
     */
    public java.lang.String getTemplate() {
        return template;
    }


    /**
     * Sets the template value for this SendMessageRequest.
     * 
     * @param template
     */
    public void setTemplate(java.lang.String template) {
        this.template = template;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SendMessageRequest)) return false;
        SendMessageRequest other = (SendMessageRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.sessionId==null && other.getSessionId()==null) || 
             (this.sessionId!=null &&
              this.sessionId.equals(other.getSessionId()))) &&
            ((this.caseId==null && other.getCaseId()==null) || 
             (this.caseId!=null &&
              this.caseId.equals(other.getCaseId()))) &&
            ((this.from==null && other.getFrom()==null) || 
             (this.from!=null &&
              this.from.equals(other.getFrom()))) &&
            ((this.to==null && other.getTo()==null) || 
             (this.to!=null &&
              this.to.equals(other.getTo()))) &&
            ((this.cc==null && other.getCc()==null) || 
             (this.cc!=null &&
              this.cc.equals(other.getCc()))) &&
            ((this.bcc==null && other.getBcc()==null) || 
             (this.bcc!=null &&
              this.bcc.equals(other.getBcc()))) &&
            ((this.subject==null && other.getSubject()==null) || 
             (this.subject!=null &&
              this.subject.equals(other.getSubject()))) &&
            ((this.template==null && other.getTemplate()==null) || 
             (this.template!=null &&
              this.template.equals(other.getTemplate())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getSessionId() != null) {
            _hashCode += getSessionId().hashCode();
        }
        if (getCaseId() != null) {
            _hashCode += getCaseId().hashCode();
        }
        if (getFrom() != null) {
            _hashCode += getFrom().hashCode();
        }
        if (getTo() != null) {
            _hashCode += getTo().hashCode();
        }
        if (getCc() != null) {
            _hashCode += getCc().hashCode();
        }
        if (getBcc() != null) {
            _hashCode += getBcc().hashCode();
        }
        if (getSubject() != null) {
            _hashCode += getSubject().hashCode();
        }
        if (getTemplate() != null) {
            _hashCode += getTemplate().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SendMessageRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.processmaker.com", ">sendMessageRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sessionId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.processmaker.com", "sessionId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("caseId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.processmaker.com", "caseId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("from");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.processmaker.com", "from"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("to");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.processmaker.com", "to"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cc");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.processmaker.com", "cc"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bcc");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.processmaker.com", "bcc"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("subject");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.processmaker.com", "subject"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("template");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.processmaker.com", "template"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
