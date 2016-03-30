/**
 * NewSubmissionResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Nov 19, 2006 (02:31:34 GMT+00:00) WSDL2Java emitter.
 */

package org.tempuri;

public class NewSubmissionResponse  implements java.io.Serializable {
    private byte[] newSubmissionResult;

    public NewSubmissionResponse() {
    }

    public NewSubmissionResponse(
           byte[] newSubmissionResult) {
           this.newSubmissionResult = newSubmissionResult;
    }


    /**
     * Gets the newSubmissionResult value for this NewSubmissionResponse.
     * 
     * @return newSubmissionResult
     */
    public byte[] getNewSubmissionResult() {
        return newSubmissionResult;
    }


    /**
     * Sets the newSubmissionResult value for this NewSubmissionResponse.
     * 
     * @param newSubmissionResult
     */
    public void setNewSubmissionResult(byte[] newSubmissionResult) {
        this.newSubmissionResult = newSubmissionResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof NewSubmissionResponse)) return false;
        NewSubmissionResponse other = (NewSubmissionResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.newSubmissionResult==null && other.getNewSubmissionResult()==null) || 
             (this.newSubmissionResult!=null &&
              java.util.Arrays.equals(this.newSubmissionResult, other.getNewSubmissionResult())));
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
        if (getNewSubmissionResult() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getNewSubmissionResult());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getNewSubmissionResult(), i);
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
        new org.apache.axis.description.TypeDesc(NewSubmissionResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">NewSubmissionResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("newSubmissionResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "NewSubmissionResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "base64Binary"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
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
