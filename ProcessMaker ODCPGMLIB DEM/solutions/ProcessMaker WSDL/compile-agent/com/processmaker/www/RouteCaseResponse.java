/**
 * RouteCaseResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Nov 19, 2006 (02:31:34 GMT+00:00) WSDL2Java emitter.
 */

package com.processmaker.www;

public class RouteCaseResponse  implements java.io.Serializable {
    private java.math.BigInteger status_code;

    private java.lang.String message;

    private java.lang.String timestamp;

    private com.processmaker.www.RouteListStruct[] routing;

    public RouteCaseResponse() {
    }

    public RouteCaseResponse(
           java.math.BigInteger status_code,
           java.lang.String message,
           java.lang.String timestamp,
           com.processmaker.www.RouteListStruct[] routing) {
           this.status_code = status_code;
           this.message = message;
           this.timestamp = timestamp;
           this.routing = routing;
    }


    /**
     * Gets the status_code value for this RouteCaseResponse.
     * 
     * @return status_code
     */
    public java.math.BigInteger getStatus_code() {
        return status_code;
    }


    /**
     * Sets the status_code value for this RouteCaseResponse.
     * 
     * @param status_code
     */
    public void setStatus_code(java.math.BigInteger status_code) {
        this.status_code = status_code;
    }


    /**
     * Gets the message value for this RouteCaseResponse.
     * 
     * @return message
     */
    public java.lang.String getMessage() {
        return message;
    }


    /**
     * Sets the message value for this RouteCaseResponse.
     * 
     * @param message
     */
    public void setMessage(java.lang.String message) {
        this.message = message;
    }


    /**
     * Gets the timestamp value for this RouteCaseResponse.
     * 
     * @return timestamp
     */
    public java.lang.String getTimestamp() {
        return timestamp;
    }


    /**
     * Sets the timestamp value for this RouteCaseResponse.
     * 
     * @param timestamp
     */
    public void setTimestamp(java.lang.String timestamp) {
        this.timestamp = timestamp;
    }


    /**
     * Gets the routing value for this RouteCaseResponse.
     * 
     * @return routing
     */
    public com.processmaker.www.RouteListStruct[] getRouting() {
        return routing;
    }


    /**
     * Sets the routing value for this RouteCaseResponse.
     * 
     * @param routing
     */
    public void setRouting(com.processmaker.www.RouteListStruct[] routing) {
        this.routing = routing;
    }

    public com.processmaker.www.RouteListStruct getRouting(int i) {
        return this.routing[i];
    }

    public void setRouting(int i, com.processmaker.www.RouteListStruct _value) {
        this.routing[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof RouteCaseResponse)) return false;
        RouteCaseResponse other = (RouteCaseResponse) obj;
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
            ((this.timestamp==null && other.getTimestamp()==null) || 
             (this.timestamp!=null &&
              this.timestamp.equals(other.getTimestamp()))) &&
            ((this.routing==null && other.getRouting()==null) || 
             (this.routing!=null &&
              java.util.Arrays.equals(this.routing, other.getRouting())));
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
        if (getTimestamp() != null) {
            _hashCode += getTimestamp().hashCode();
        }
        if (getRouting() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getRouting());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getRouting(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(RouteCaseResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.processmaker.com", ">routeCaseResponse"));
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
        elemField.setFieldName("timestamp");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.processmaker.com", "timestamp"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("routing");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.processmaker.com", "routing"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.processmaker.com", "routeListStruct"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
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
