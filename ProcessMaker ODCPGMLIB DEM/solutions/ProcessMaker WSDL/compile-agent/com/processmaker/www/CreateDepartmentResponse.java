/**
 * CreateDepartmentResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Nov 19, 2006 (02:31:34 GMT+00:00) WSDL2Java emitter.
 */

package com.processmaker.www;

public class CreateDepartmentResponse  implements java.io.Serializable {
    private java.math.BigInteger status_code;

    private java.lang.String message;

    private java.lang.String departmentUID;

    private java.lang.String timestamp;

    public CreateDepartmentResponse() {
    }

    public CreateDepartmentResponse(
           java.math.BigInteger status_code,
           java.lang.String message,
           java.lang.String departmentUID,
           java.lang.String timestamp) {
           this.status_code = status_code;
           this.message = message;
           this.departmentUID = departmentUID;
           this.timestamp = timestamp;
    }


    /**
     * Gets the status_code value for this CreateDepartmentResponse.
     * 
     * @return status_code
     */
    public java.math.BigInteger getStatus_code() {
        return status_code;
    }


    /**
     * Sets the status_code value for this CreateDepartmentResponse.
     * 
     * @param status_code
     */
    public void setStatus_code(java.math.BigInteger status_code) {
        this.status_code = status_code;
    }


    /**
     * Gets the message value for this CreateDepartmentResponse.
     * 
     * @return message
     */
    public java.lang.String getMessage() {
        return message;
    }


    /**
     * Sets the message value for this CreateDepartmentResponse.
     * 
     * @param message
     */
    public void setMessage(java.lang.String message) {
        this.message = message;
    }


    /**
     * Gets the departmentUID value for this CreateDepartmentResponse.
     * 
     * @return departmentUID
     */
    public java.lang.String getDepartmentUID() {
        return departmentUID;
    }


    /**
     * Sets the departmentUID value for this CreateDepartmentResponse.
     * 
     * @param departmentUID
     */
    public void setDepartmentUID(java.lang.String departmentUID) {
        this.departmentUID = departmentUID;
    }


    /**
     * Gets the timestamp value for this CreateDepartmentResponse.
     * 
     * @return timestamp
     */
    public java.lang.String getTimestamp() {
        return timestamp;
    }


    /**
     * Sets the timestamp value for this CreateDepartmentResponse.
     * 
     * @param timestamp
     */
    public void setTimestamp(java.lang.String timestamp) {
        this.timestamp = timestamp;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CreateDepartmentResponse)) return false;
        CreateDepartmentResponse other = (CreateDepartmentResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.status_code==null && other.getStatus_code()==null) || 
             (this.status_code!=null &&
              this.status_code.equals(other.getStatus_code()))) &&
            ((this.message==null && other.getMessage()==null) || 
             (this.message!=null &&
              this.message.equals(other.getMessage()))) &&
            ((this.departmentUID==null && other.getDepartmentUID()==null) || 
             (this.departmentUID!=null &&
              this.departmentUID.equals(other.getDepartmentUID()))) &&
            ((this.timestamp==null && other.getTimestamp()==null) || 
             (this.timestamp!=null &&
              this.timestamp.equals(other.getTimestamp())));
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
        if (getStatus_code() != null) {
            _hashCode += getStatus_code().hashCode();
        }
        if (getMessage() != null) {
            _hashCode += getMessage().hashCode();
        }
        if (getDepartmentUID() != null) {
            _hashCode += getDepartmentUID().hashCode();
        }
        if (getTimestamp() != null) {
            _hashCode += getTimestamp().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CreateDepartmentResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.processmaker.com", ">createDepartmentResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("status_code");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.processmaker.com", "status_code"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "integer"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("message");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.processmaker.com", "message"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("departmentUID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.processmaker.com", "departmentUID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("timestamp");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.processmaker.com", "timestamp"));
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
