/**
 * ExecuteTriggerRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Nov 19, 2006 (02:31:34 GMT+00:00) WSDL2Java emitter.
 */

package com.processmaker.www;

public class ExecuteTriggerRequest  implements java.io.Serializable {
    private java.lang.String sessionId;

    private java.lang.String caseId;

    private java.lang.String triggerIndex;

    private java.lang.String delIndex;

    public ExecuteTriggerRequest() {
    }

    public ExecuteTriggerRequest(
           java.lang.String sessionId,
           java.lang.String caseId,
           java.lang.String triggerIndex,
           java.lang.String delIndex) {
           this.sessionId = sessionId;
           this.caseId = caseId;
           this.triggerIndex = triggerIndex;
           this.delIndex = delIndex;
    }


    /**
     * Gets the sessionId value for this ExecuteTriggerRequest.
     * 
     * @return sessionId
     */
    public java.lang.String getSessionId() {
        return sessionId;
    }


    /**
     * Sets the sessionId value for this ExecuteTriggerRequest.
     * 
     * @param sessionId
     */
    public void setSessionId(java.lang.String sessionId) {
        this.sessionId = sessionId;
    }


    /**
     * Gets the caseId value for this ExecuteTriggerRequest.
     * 
     * @return caseId
     */
    public java.lang.String getCaseId() {
        return caseId;
    }


    /**
     * Sets the caseId value for this ExecuteTriggerRequest.
     * 
     * @param caseId
     */
    public void setCaseId(java.lang.String caseId) {
        this.caseId = caseId;
    }


    /**
     * Gets the triggerIndex value for this ExecuteTriggerRequest.
     * 
     * @return triggerIndex
     */
    public java.lang.String getTriggerIndex() {
        return triggerIndex;
    }


    /**
     * Sets the triggerIndex value for this ExecuteTriggerRequest.
     * 
     * @param triggerIndex
     */
    public void setTriggerIndex(java.lang.String triggerIndex) {
        this.triggerIndex = triggerIndex;
    }


    /**
     * Gets the delIndex value for this ExecuteTriggerRequest.
     * 
     * @return delIndex
     */
    public java.lang.String getDelIndex() {
        return delIndex;
    }


    /**
     * Sets the delIndex value for this ExecuteTriggerRequest.
     * 
     * @param delIndex
     */
    public void setDelIndex(java.lang.String delIndex) {
        this.delIndex = delIndex;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ExecuteTriggerRequest)) return false;
        ExecuteTriggerRequest other = (ExecuteTriggerRequest) obj;
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
            ((this.triggerIndex==null && other.getTriggerIndex()==null) || 
             (this.triggerIndex!=null &&
              this.triggerIndex.equals(other.getTriggerIndex()))) &&
            ((this.delIndex==null && other.getDelIndex()==null) || 
             (this.delIndex!=null &&
              this.delIndex.equals(other.getDelIndex())));
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
        if (getTriggerIndex() != null) {
            _hashCode += getTriggerIndex().hashCode();
        }
        if (getDelIndex() != null) {
            _hashCode += getDelIndex().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ExecuteTriggerRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.processmaker.com", ">executeTriggerRequest"));
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
        elemField.setFieldName("triggerIndex");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.processmaker.com", "triggerIndex"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("delIndex");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.processmaker.com", "delIndex"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
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
