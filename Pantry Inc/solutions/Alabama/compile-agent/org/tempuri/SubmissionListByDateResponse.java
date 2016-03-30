/**
 * SubmissionListByDateResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Nov 19, 2006 (02:31:34 GMT+00:00) WSDL2Java emitter.
 */

package org.tempuri;

public class SubmissionListByDateResponse  implements java.io.Serializable {
    private java.lang.Object submissionListByDateResult;

    public SubmissionListByDateResponse() {
    }

    public SubmissionListByDateResponse(
           java.lang.Object submissionListByDateResult) {
           this.submissionListByDateResult = submissionListByDateResult;
    }


    /**
     * Gets the submissionListByDateResult value for this SubmissionListByDateResponse.
     * 
     * @return submissionListByDateResult
     */
    public java.lang.Object getSubmissionListByDateResult() {
        return submissionListByDateResult;
    }


    /**
     * Sets the submissionListByDateResult value for this SubmissionListByDateResponse.
     * 
     * @param submissionListByDateResult
     */
    public void setSubmissionListByDateResult(java.lang.Object submissionListByDateResult) {
        this.submissionListByDateResult = submissionListByDateResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SubmissionListByDateResponse)) return false;
        SubmissionListByDateResponse other = (SubmissionListByDateResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.submissionListByDateResult==null && other.getSubmissionListByDateResult()==null) || 
             (this.submissionListByDateResult!=null &&
              this.submissionListByDateResult.equals(other.getSubmissionListByDateResult())));
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
        if (getSubmissionListByDateResult() != null) {
            _hashCode += getSubmissionListByDateResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SubmissionListByDateResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">SubmissionListByDateResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("submissionListByDateResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "SubmissionListByDateResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
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
