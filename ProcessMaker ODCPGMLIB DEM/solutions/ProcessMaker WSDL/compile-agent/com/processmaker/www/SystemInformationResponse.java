/**
 * SystemInformationResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Nov 19, 2006 (02:31:34 GMT+00:00) WSDL2Java emitter.
 */

package com.processmaker.www;

public class SystemInformationResponse  implements java.io.Serializable {
    private java.math.BigInteger status_code;

    private java.lang.String message;

    private java.lang.String timestamp;

    private java.lang.String version;

    private java.lang.String operatingSystem;

    private java.lang.String webServer;

    private java.lang.String serverName;

    private java.lang.String serverIp;

    private java.lang.String phpVersion;

    private java.lang.String databaseVersion;

    private java.lang.String databaseServerIp;

    private java.lang.String databaseName;

    private java.lang.String availableDatabases;

    private java.lang.String userBrowser;

    private java.lang.String userIp;

    public SystemInformationResponse() {
    }

    public SystemInformationResponse(
           java.math.BigInteger status_code,
           java.lang.String message,
           java.lang.String timestamp,
           java.lang.String version,
           java.lang.String operatingSystem,
           java.lang.String webServer,
           java.lang.String serverName,
           java.lang.String serverIp,
           java.lang.String phpVersion,
           java.lang.String databaseVersion,
           java.lang.String databaseServerIp,
           java.lang.String databaseName,
           java.lang.String availableDatabases,
           java.lang.String userBrowser,
           java.lang.String userIp) {
           this.status_code = status_code;
           this.message = message;
           this.timestamp = timestamp;
           this.version = version;
           this.operatingSystem = operatingSystem;
           this.webServer = webServer;
           this.serverName = serverName;
           this.serverIp = serverIp;
           this.phpVersion = phpVersion;
           this.databaseVersion = databaseVersion;
           this.databaseServerIp = databaseServerIp;
           this.databaseName = databaseName;
           this.availableDatabases = availableDatabases;
           this.userBrowser = userBrowser;
           this.userIp = userIp;
    }


    /**
     * Gets the status_code value for this SystemInformationResponse.
     * 
     * @return status_code
     */
    public java.math.BigInteger getStatus_code() {
        return status_code;
    }


    /**
     * Sets the status_code value for this SystemInformationResponse.
     * 
     * @param status_code
     */
    public void setStatus_code(java.math.BigInteger status_code) {
        this.status_code = status_code;
    }


    /**
     * Gets the message value for this SystemInformationResponse.
     * 
     * @return message
     */
    public java.lang.String getMessage() {
        return message;
    }


    /**
     * Sets the message value for this SystemInformationResponse.
     * 
     * @param message
     */
    public void setMessage(java.lang.String message) {
        this.message = message;
    }


    /**
     * Gets the timestamp value for this SystemInformationResponse.
     * 
     * @return timestamp
     */
    public java.lang.String getTimestamp() {
        return timestamp;
    }


    /**
     * Sets the timestamp value for this SystemInformationResponse.
     * 
     * @param timestamp
     */
    public void setTimestamp(java.lang.String timestamp) {
        this.timestamp = timestamp;
    }


    /**
     * Gets the version value for this SystemInformationResponse.
     * 
     * @return version
     */
    public java.lang.String getVersion() {
        return version;
    }


    /**
     * Sets the version value for this SystemInformationResponse.
     * 
     * @param version
     */
    public void setVersion(java.lang.String version) {
        this.version = version;
    }


    /**
     * Gets the operatingSystem value for this SystemInformationResponse.
     * 
     * @return operatingSystem
     */
    public java.lang.String getOperatingSystem() {
        return operatingSystem;
    }


    /**
     * Sets the operatingSystem value for this SystemInformationResponse.
     * 
     * @param operatingSystem
     */
    public void setOperatingSystem(java.lang.String operatingSystem) {
        this.operatingSystem = operatingSystem;
    }


    /**
     * Gets the webServer value for this SystemInformationResponse.
     * 
     * @return webServer
     */
    public java.lang.String getWebServer() {
        return webServer;
    }


    /**
     * Sets the webServer value for this SystemInformationResponse.
     * 
     * @param webServer
     */
    public void setWebServer(java.lang.String webServer) {
        this.webServer = webServer;
    }


    /**
     * Gets the serverName value for this SystemInformationResponse.
     * 
     * @return serverName
     */
    public java.lang.String getServerName() {
        return serverName;
    }


    /**
     * Sets the serverName value for this SystemInformationResponse.
     * 
     * @param serverName
     */
    public void setServerName(java.lang.String serverName) {
        this.serverName = serverName;
    }


    /**
     * Gets the serverIp value for this SystemInformationResponse.
     * 
     * @return serverIp
     */
    public java.lang.String getServerIp() {
        return serverIp;
    }


    /**
     * Sets the serverIp value for this SystemInformationResponse.
     * 
     * @param serverIp
     */
    public void setServerIp(java.lang.String serverIp) {
        this.serverIp = serverIp;
    }


    /**
     * Gets the phpVersion value for this SystemInformationResponse.
     * 
     * @return phpVersion
     */
    public java.lang.String getPhpVersion() {
        return phpVersion;
    }


    /**
     * Sets the phpVersion value for this SystemInformationResponse.
     * 
     * @param phpVersion
     */
    public void setPhpVersion(java.lang.String phpVersion) {
        this.phpVersion = phpVersion;
    }


    /**
     * Gets the databaseVersion value for this SystemInformationResponse.
     * 
     * @return databaseVersion
     */
    public java.lang.String getDatabaseVersion() {
        return databaseVersion;
    }


    /**
     * Sets the databaseVersion value for this SystemInformationResponse.
     * 
     * @param databaseVersion
     */
    public void setDatabaseVersion(java.lang.String databaseVersion) {
        this.databaseVersion = databaseVersion;
    }


    /**
     * Gets the databaseServerIp value for this SystemInformationResponse.
     * 
     * @return databaseServerIp
     */
    public java.lang.String getDatabaseServerIp() {
        return databaseServerIp;
    }


    /**
     * Sets the databaseServerIp value for this SystemInformationResponse.
     * 
     * @param databaseServerIp
     */
    public void setDatabaseServerIp(java.lang.String databaseServerIp) {
        this.databaseServerIp = databaseServerIp;
    }


    /**
     * Gets the databaseName value for this SystemInformationResponse.
     * 
     * @return databaseName
     */
    public java.lang.String getDatabaseName() {
        return databaseName;
    }


    /**
     * Sets the databaseName value for this SystemInformationResponse.
     * 
     * @param databaseName
     */
    public void setDatabaseName(java.lang.String databaseName) {
        this.databaseName = databaseName;
    }


    /**
     * Gets the availableDatabases value for this SystemInformationResponse.
     * 
     * @return availableDatabases
     */
    public java.lang.String getAvailableDatabases() {
        return availableDatabases;
    }


    /**
     * Sets the availableDatabases value for this SystemInformationResponse.
     * 
     * @param availableDatabases
     */
    public void setAvailableDatabases(java.lang.String availableDatabases) {
        this.availableDatabases = availableDatabases;
    }


    /**
     * Gets the userBrowser value for this SystemInformationResponse.
     * 
     * @return userBrowser
     */
    public java.lang.String getUserBrowser() {
        return userBrowser;
    }


    /**
     * Sets the userBrowser value for this SystemInformationResponse.
     * 
     * @param userBrowser
     */
    public void setUserBrowser(java.lang.String userBrowser) {
        this.userBrowser = userBrowser;
    }


    /**
     * Gets the userIp value for this SystemInformationResponse.
     * 
     * @return userIp
     */
    public java.lang.String getUserIp() {
        return userIp;
    }


    /**
     * Sets the userIp value for this SystemInformationResponse.
     * 
     * @param userIp
     */
    public void setUserIp(java.lang.String userIp) {
        this.userIp = userIp;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SystemInformationResponse)) return false;
        SystemInformationResponse other = (SystemInformationResponse) obj;
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
            ((this.version==null && other.getVersion()==null) || 
             (this.version!=null &&
              this.version.equals(other.getVersion()))) &&
            ((this.operatingSystem==null && other.getOperatingSystem()==null) || 
             (this.operatingSystem!=null &&
              this.operatingSystem.equals(other.getOperatingSystem()))) &&
            ((this.webServer==null && other.getWebServer()==null) || 
             (this.webServer!=null &&
              this.webServer.equals(other.getWebServer()))) &&
            ((this.serverName==null && other.getServerName()==null) || 
             (this.serverName!=null &&
              this.serverName.equals(other.getServerName()))) &&
            ((this.serverIp==null && other.getServerIp()==null) || 
             (this.serverIp!=null &&
              this.serverIp.equals(other.getServerIp()))) &&
            ((this.phpVersion==null && other.getPhpVersion()==null) || 
             (this.phpVersion!=null &&
              this.phpVersion.equals(other.getPhpVersion()))) &&
            ((this.databaseVersion==null && other.getDatabaseVersion()==null) || 
             (this.databaseVersion!=null &&
              this.databaseVersion.equals(other.getDatabaseVersion()))) &&
            ((this.databaseServerIp==null && other.getDatabaseServerIp()==null) || 
             (this.databaseServerIp!=null &&
              this.databaseServerIp.equals(other.getDatabaseServerIp()))) &&
            ((this.databaseName==null && other.getDatabaseName()==null) || 
             (this.databaseName!=null &&
              this.databaseName.equals(other.getDatabaseName()))) &&
            ((this.availableDatabases==null && other.getAvailableDatabases()==null) || 
             (this.availableDatabases!=null &&
              this.availableDatabases.equals(other.getAvailableDatabases()))) &&
            ((this.userBrowser==null && other.getUserBrowser()==null) || 
             (this.userBrowser!=null &&
              this.userBrowser.equals(other.getUserBrowser()))) &&
            ((this.userIp==null && other.getUserIp()==null) || 
             (this.userIp!=null &&
              this.userIp.equals(other.getUserIp())));
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
        if (getVersion() != null) {
            _hashCode += getVersion().hashCode();
        }
        if (getOperatingSystem() != null) {
            _hashCode += getOperatingSystem().hashCode();
        }
        if (getWebServer() != null) {
            _hashCode += getWebServer().hashCode();
        }
        if (getServerName() != null) {
            _hashCode += getServerName().hashCode();
        }
        if (getServerIp() != null) {
            _hashCode += getServerIp().hashCode();
        }
        if (getPhpVersion() != null) {
            _hashCode += getPhpVersion().hashCode();
        }
        if (getDatabaseVersion() != null) {
            _hashCode += getDatabaseVersion().hashCode();
        }
        if (getDatabaseServerIp() != null) {
            _hashCode += getDatabaseServerIp().hashCode();
        }
        if (getDatabaseName() != null) {
            _hashCode += getDatabaseName().hashCode();
        }
        if (getAvailableDatabases() != null) {
            _hashCode += getAvailableDatabases().hashCode();
        }
        if (getUserBrowser() != null) {
            _hashCode += getUserBrowser().hashCode();
        }
        if (getUserIp() != null) {
            _hashCode += getUserIp().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SystemInformationResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.processmaker.com", ">systemInformationResponse"));
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
        elemField.setFieldName("version");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.processmaker.com", "version"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("operatingSystem");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.processmaker.com", "operatingSystem"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("webServer");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.processmaker.com", "webServer"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("serverName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.processmaker.com", "serverName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("serverIp");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.processmaker.com", "serverIp"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("phpVersion");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.processmaker.com", "phpVersion"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("databaseVersion");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.processmaker.com", "databaseVersion"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("databaseServerIp");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.processmaker.com", "databaseServerIp"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("databaseName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.processmaker.com", "databaseName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("availableDatabases");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.processmaker.com", "availableDatabases"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userBrowser");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.processmaker.com", "userBrowser"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userIp");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.processmaker.com", "userIp"));
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
