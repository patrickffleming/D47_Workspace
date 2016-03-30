/**
 * ImportProcessFromLibraryRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Nov 19, 2006 (02:31:34 GMT+00:00) WSDL2Java emitter.
 */

package com.processmaker.www;

public class ImportProcessFromLibraryRequest  implements java.io.Serializable {
    private java.lang.String sessionId;

    private java.lang.String processId;

    private java.lang.String version;

    private java.lang.String importOption;

    private java.lang.String usernameLibrary;

    private java.lang.String passwordLibrary;

    public ImportProcessFromLibraryRequest() {
    }

    public ImportProcessFromLibraryRequest(
           java.lang.String sessionId,
           java.lang.String processId,
           java.lang.String version,
           java.lang.String importOption,
           java.lang.String usernameLibrary,
           java.lang.String passwordLibrary) {
           this.sessionId = sessionId;
           this.processId = processId;
           this.version = version;
           this.importOption = importOption;
           this.usernameLibrary = usernameLibrary;
           this.passwordLibrary = passwordLibrary;
    }


    /**
     * Gets the sessionId value for this ImportProcessFromLibraryRequest.
     * 
     * @return sessionId
     */
    public java.lang.String getSessionId() {
        return sessionId;
    }


    /**
     * Sets the sessionId value for this ImportProcessFromLibraryRequest.
     * 
     * @param sessionId
     */
    public void setSessionId(java.lang.String sessionId) {
        this.sessionId = sessionId;
    }


    /**
     * Gets the processId value for this ImportProcessFromLibraryRequest.
     * 
     * @return processId
     */
    public java.lang.String getProcessId() {
        return processId;
    }


    /**
     * Sets the processId value for this ImportProcessFromLibraryRequest.
     * 
     * @param processId
     */
    public void setProcessId(java.lang.String processId) {
        this.processId = processId;
    }


    /**
     * Gets the version value for this ImportProcessFromLibraryRequest.
     * 
     * @return version
     */
    public java.lang.String getVersion() {
        return version;
    }


    /**
     * Sets the version value for this ImportProcessFromLibraryRequest.
     * 
     * @param version
     */
    public void setVersion(java.lang.String version) {
        this.version = version;
    }


    /**
     * Gets the importOption value for this ImportProcessFromLibraryRequest.
     * 
     * @return importOption
     */
    public java.lang.String getImportOption() {
        return importOption;
    }


    /**
     * Sets the importOption value for this ImportProcessFromLibraryRequest.
     * 
     * @param importOption
     */
    public void setImportOption(java.lang.String importOption) {
        this.importOption = importOption;
    }


    /**
     * Gets the usernameLibrary value for this ImportProcessFromLibraryRequest.
     * 
     * @return usernameLibrary
     */
    public java.lang.String getUsernameLibrary() {
        return usernameLibrary;
    }


    /**
     * Sets the usernameLibrary value for this ImportProcessFromLibraryRequest.
     * 
     * @param usernameLibrary
     */
    public void setUsernameLibrary(java.lang.String usernameLibrary) {
        this.usernameLibrary = usernameLibrary;
    }


    /**
     * Gets the passwordLibrary value for this ImportProcessFromLibraryRequest.
     * 
     * @return passwordLibrary
     */
    public java.lang.String getPasswordLibrary() {
        return passwordLibrary;
    }


    /**
     * Sets the passwordLibrary value for this ImportProcessFromLibraryRequest.
     * 
     * @param passwordLibrary
     */
    public void setPasswordLibrary(java.lang.String passwordLibrary) {
        this.passwordLibrary = passwordLibrary;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ImportProcessFromLibraryRequest)) return false;
        ImportProcessFromLibraryRequest other = (ImportProcessFromLibraryRequest) obj;
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
            ((this.processId==null && other.getProcessId()==null) || 
             (this.processId!=null &&
              this.processId.equals(other.getProcessId()))) &&
            ((this.version==null && other.getVersion()==null) || 
             (this.version!=null &&
              this.version.equals(other.getVersion()))) &&
            ((this.importOption==null && other.getImportOption()==null) || 
             (this.importOption!=null &&
              this.importOption.equals(other.getImportOption()))) &&
            ((this.usernameLibrary==null && other.getUsernameLibrary()==null) || 
             (this.usernameLibrary!=null &&
              this.usernameLibrary.equals(other.getUsernameLibrary()))) &&
            ((this.passwordLibrary==null && other.getPasswordLibrary()==null) || 
             (this.passwordLibrary!=null &&
              this.passwordLibrary.equals(other.getPasswordLibrary())));
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
        if (getProcessId() != null) {
            _hashCode += getProcessId().hashCode();
        }
        if (getVersion() != null) {
            _hashCode += getVersion().hashCode();
        }
        if (getImportOption() != null) {
            _hashCode += getImportOption().hashCode();
        }
        if (getUsernameLibrary() != null) {
            _hashCode += getUsernameLibrary().hashCode();
        }
        if (getPasswordLibrary() != null) {
            _hashCode += getPasswordLibrary().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ImportProcessFromLibraryRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.processmaker.com", ">importProcessFromLibraryRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sessionId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.processmaker.com", "sessionId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("processId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.processmaker.com", "processId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("version");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.processmaker.com", "version"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("importOption");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.processmaker.com", "importOption"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("usernameLibrary");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.processmaker.com", "usernameLibrary"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("passwordLibrary");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.processmaker.com", "passwordLibrary"));
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
