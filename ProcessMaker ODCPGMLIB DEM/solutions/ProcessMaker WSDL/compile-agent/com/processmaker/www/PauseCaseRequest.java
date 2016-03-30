/**
 * PauseCaseRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Nov 19, 2006 (02:31:34 GMT+00:00) WSDL2Java emitter.
 */

package com.processmaker.www;

public class PauseCaseRequest  implements java.io.Serializable {
    private java.lang.String sessionId;

    private java.lang.String caseUid;

    private java.lang.String delIndex;

    private java.lang.String userUid;

    private java.lang.String[] unpauseDate;

    public PauseCaseRequest() {
    }

    public PauseCaseRequest(
           java.lang.String sessionId,
           java.lang.String caseUid,
           java.lang.String delIndex,
           java.lang.String userUid,
           java.lang.String[] unpauseDate) {
           this.sessionId = sessionId;
           this.caseUid = caseUid;
           this.delIndex = delIndex;
           this.userUid = userUid;
           this.unpauseDate = unpauseDate;
    }


    /**
     * Gets the sessionId value for this PauseCaseRequest.
     * 
     * @return sessionId
     */
    public java.lang.String getSessionId() {
        return sessionId;
    }


    /**
     * Sets the sessionId value for this PauseCaseRequest.
     * 
     * @param sessionId
     */
    public void setSessionId(java.lang.String sessionId) {
        this.sessionId = sessionId;
    }


    /**
     * Gets the caseUid value for this PauseCaseRequest.
     * 
     * @return caseUid
     */
    public java.lang.String getCaseUid() {
        return caseUid;
    }


    /**
     * Sets the caseUid value for this PauseCaseRequest.
     * 
     * @param caseUid
     */
    public void setCaseUid(java.lang.String caseUid) {
        this.caseUid = caseUid;
    }


    /**
     * Gets the delIndex value for this PauseCaseRequest.
     * 
     * @return delIndex
     */
    public java.lang.String getDelIndex() {
        return delIndex;
    }


    /**
     * Sets the delIndex value for this PauseCaseRequest.
     * 
     * @param delIndex
     */
    public void setDelIndex(java.lang.String delIndex) {
        this.delIndex = delIndex;
    }


    /**
     * Gets the userUid value for this PauseCaseRequest.
     * 
     * @return userUid
     */
    public java.lang.String getUserUid() {
        return userUid;
    }


    /**
     * Sets the userUid value for this PauseCaseRequest.
     * 
     * @param userUid
     */
    public void setUserUid(java.lang.String userUid) {
        this.userUid = userUid;
    }


    /**
     * Gets the unpauseDate value for this PauseCaseRequest.
     * 
     * @return unpauseDate
     */
    public java.lang.String[] getUnpauseDate() {
        return unpauseDate;
    }


    /**
     * Sets the unpauseDate value for this PauseCaseRequest.
     * 
     * @param unpauseDate
     */
    public void setUnpauseDate(java.lang.String[] unpauseDate) {
        this.unpauseDate = unpauseDate;
    }

    public java.lang.String getUnpauseDate(int i) {
        return this.unpauseDate[i];
    }

    public void setUnpauseDate(int i, java.lang.String _value) {
        this.unpauseDate[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PauseCaseRequest)) return false;
        PauseCaseRequest other = (PauseCaseRequest) obj;
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
            ((this.caseUid==null && other.getCaseUid()==null) || 
             (this.caseUid!=null &&
              this.caseUid.equals(other.getCaseUid()))) &&
            ((this.delIndex==null && other.getDelIndex()==null) || 
             (this.delIndex!=null &&
              this.delIndex.equals(other.getDelIndex()))) &&
            ((this.userUid==null && other.getUserUid()==null) || 
             (this.userUid!=null &&
              this.userUid.equals(other.getUserUid()))) &&
            ((this.unpauseDate==null && other.getUnpauseDate()==null) || 
             (this.unpauseDate!=null &&
              java.util.Arrays.equals(this.unpauseDate, other.getUnpauseDate())));
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
        if (getCaseUid() != null) {
            _hashCode += getCaseUid().hashCode();
        }
        if (getDelIndex() != null) {
            _hashCode += getDelIndex().hashCode();
        }
        if (getUserUid() != null) {
            _hashCode += getUserUid().hashCode();
        }
        if (getUnpauseDate() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getUnpauseDate());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getUnpauseDate(), i);
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
        new org.apache.axis.description.TypeDesc(PauseCaseRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.processmaker.com", ">pauseCaseRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sessionId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.processmaker.com", "sessionId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("caseUid");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.processmaker.com", "caseUid"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("delIndex");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.processmaker.com", "delIndex"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userUid");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.processmaker.com", "userUid"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("unpauseDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.processmaker.com", "unpauseDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
