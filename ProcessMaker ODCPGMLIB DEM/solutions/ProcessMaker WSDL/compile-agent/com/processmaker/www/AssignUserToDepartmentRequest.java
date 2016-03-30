/**
 * AssignUserToDepartmentRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Nov 19, 2006 (02:31:34 GMT+00:00) WSDL2Java emitter.
 */

package com.processmaker.www;

public class AssignUserToDepartmentRequest  implements java.io.Serializable {
    private java.lang.String sessionId;

    private java.lang.String userId;

    private java.lang.String departmentId;

    private java.lang.String manager;

    public AssignUserToDepartmentRequest() {
    }

    public AssignUserToDepartmentRequest(
           java.lang.String sessionId,
           java.lang.String userId,
           java.lang.String departmentId,
           java.lang.String manager) {
           this.sessionId = sessionId;
           this.userId = userId;
           this.departmentId = departmentId;
           this.manager = manager;
    }


    /**
     * Gets the sessionId value for this AssignUserToDepartmentRequest.
     * 
     * @return sessionId
     */
    public java.lang.String getSessionId() {
        return sessionId;
    }


    /**
     * Sets the sessionId value for this AssignUserToDepartmentRequest.
     * 
     * @param sessionId
     */
    public void setSessionId(java.lang.String sessionId) {
        this.sessionId = sessionId;
    }


    /**
     * Gets the userId value for this AssignUserToDepartmentRequest.
     * 
     * @return userId
     */
    public java.lang.String getUserId() {
        return userId;
    }


    /**
     * Sets the userId value for this AssignUserToDepartmentRequest.
     * 
     * @param userId
     */
    public void setUserId(java.lang.String userId) {
        this.userId = userId;
    }


    /**
     * Gets the departmentId value for this AssignUserToDepartmentRequest.
     * 
     * @return departmentId
     */
    public java.lang.String getDepartmentId() {
        return departmentId;
    }


    /**
     * Sets the departmentId value for this AssignUserToDepartmentRequest.
     * 
     * @param departmentId
     */
    public void setDepartmentId(java.lang.String departmentId) {
        this.departmentId = departmentId;
    }


    /**
     * Gets the manager value for this AssignUserToDepartmentRequest.
     * 
     * @return manager
     */
    public java.lang.String getManager() {
        return manager;
    }


    /**
     * Sets the manager value for this AssignUserToDepartmentRequest.
     * 
     * @param manager
     */
    public void setManager(java.lang.String manager) {
        this.manager = manager;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AssignUserToDepartmentRequest)) return false;
        AssignUserToDepartmentRequest other = (AssignUserToDepartmentRequest) obj;
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
            ((this.userId==null && other.getUserId()==null) || 
             (this.userId!=null &&
              this.userId.equals(other.getUserId()))) &&
            ((this.departmentId==null && other.getDepartmentId()==null) || 
             (this.departmentId!=null &&
              this.departmentId.equals(other.getDepartmentId()))) &&
            ((this.manager==null && other.getManager()==null) || 
             (this.manager!=null &&
              this.manager.equals(other.getManager())));
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
        if (getUserId() != null) {
            _hashCode += getUserId().hashCode();
        }
        if (getDepartmentId() != null) {
            _hashCode += getDepartmentId().hashCode();
        }
        if (getManager() != null) {
            _hashCode += getManager().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(AssignUserToDepartmentRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.processmaker.com", ">assignUserToDepartmentRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sessionId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.processmaker.com", "sessionId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.processmaker.com", "userId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("departmentId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.processmaker.com", "departmentId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("manager");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.processmaker.com", "manager"));
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
