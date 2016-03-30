/**
 * GetCaseInfoResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Nov 19, 2006 (02:31:34 GMT+00:00) WSDL2Java emitter.
 */

package com.processmaker.www;

public class GetCaseInfoResponse  implements java.io.Serializable {
    private java.math.BigInteger status_code;

    private java.lang.String message;

    private java.lang.String caseId;

    private java.lang.String caseNumber;

    private java.lang.String caseName;

    private java.lang.String caseStatus;

    private java.lang.String caseParalell;

    private java.lang.String caseCreatorUser;

    private java.lang.String caseCreatorUserName;

    private java.lang.String processId;

    private java.lang.String processName;

    private java.lang.String createDate;

    private java.lang.String updateDate;

    private com.processmaker.www.GetCaseInfoStruct[] currentUsers;

    public GetCaseInfoResponse() {
    }

    public GetCaseInfoResponse(
           java.math.BigInteger status_code,
           java.lang.String message,
           java.lang.String caseId,
           java.lang.String caseNumber,
           java.lang.String caseName,
           java.lang.String caseStatus,
           java.lang.String caseParalell,
           java.lang.String caseCreatorUser,
           java.lang.String caseCreatorUserName,
           java.lang.String processId,
           java.lang.String processName,
           java.lang.String createDate,
           java.lang.String updateDate,
           com.processmaker.www.GetCaseInfoStruct[] currentUsers) {
           this.status_code = status_code;
           this.message = message;
           this.caseId = caseId;
           this.caseNumber = caseNumber;
           this.caseName = caseName;
           this.caseStatus = caseStatus;
           this.caseParalell = caseParalell;
           this.caseCreatorUser = caseCreatorUser;
           this.caseCreatorUserName = caseCreatorUserName;
           this.processId = processId;
           this.processName = processName;
           this.createDate = createDate;
           this.updateDate = updateDate;
           this.currentUsers = currentUsers;
    }


    /**
     * Gets the status_code value for this GetCaseInfoResponse.
     * 
     * @return status_code
     */
    public java.math.BigInteger getStatus_code() {
        return status_code;
    }


    /**
     * Sets the status_code value for this GetCaseInfoResponse.
     * 
     * @param status_code
     */
    public void setStatus_code(java.math.BigInteger status_code) {
        this.status_code = status_code;
    }


    /**
     * Gets the message value for this GetCaseInfoResponse.
     * 
     * @return message
     */
    public java.lang.String getMessage() {
        return message;
    }


    /**
     * Sets the message value for this GetCaseInfoResponse.
     * 
     * @param message
     */
    public void setMessage(java.lang.String message) {
        this.message = message;
    }


    /**
     * Gets the caseId value for this GetCaseInfoResponse.
     * 
     * @return caseId
     */
    public java.lang.String getCaseId() {
        return caseId;
    }


    /**
     * Sets the caseId value for this GetCaseInfoResponse.
     * 
     * @param caseId
     */
    public void setCaseId(java.lang.String caseId) {
        this.caseId = caseId;
    }


    /**
     * Gets the caseNumber value for this GetCaseInfoResponse.
     * 
     * @return caseNumber
     */
    public java.lang.String getCaseNumber() {
        return caseNumber;
    }


    /**
     * Sets the caseNumber value for this GetCaseInfoResponse.
     * 
     * @param caseNumber
     */
    public void setCaseNumber(java.lang.String caseNumber) {
        this.caseNumber = caseNumber;
    }


    /**
     * Gets the caseName value for this GetCaseInfoResponse.
     * 
     * @return caseName
     */
    public java.lang.String getCaseName() {
        return caseName;
    }


    /**
     * Sets the caseName value for this GetCaseInfoResponse.
     * 
     * @param caseName
     */
    public void setCaseName(java.lang.String caseName) {
        this.caseName = caseName;
    }


    /**
     * Gets the caseStatus value for this GetCaseInfoResponse.
     * 
     * @return caseStatus
     */
    public java.lang.String getCaseStatus() {
        return caseStatus;
    }


    /**
     * Sets the caseStatus value for this GetCaseInfoResponse.
     * 
     * @param caseStatus
     */
    public void setCaseStatus(java.lang.String caseStatus) {
        this.caseStatus = caseStatus;
    }


    /**
     * Gets the caseParalell value for this GetCaseInfoResponse.
     * 
     * @return caseParalell
     */
    public java.lang.String getCaseParalell() {
        return caseParalell;
    }


    /**
     * Sets the caseParalell value for this GetCaseInfoResponse.
     * 
     * @param caseParalell
     */
    public void setCaseParalell(java.lang.String caseParalell) {
        this.caseParalell = caseParalell;
    }


    /**
     * Gets the caseCreatorUser value for this GetCaseInfoResponse.
     * 
     * @return caseCreatorUser
     */
    public java.lang.String getCaseCreatorUser() {
        return caseCreatorUser;
    }


    /**
     * Sets the caseCreatorUser value for this GetCaseInfoResponse.
     * 
     * @param caseCreatorUser
     */
    public void setCaseCreatorUser(java.lang.String caseCreatorUser) {
        this.caseCreatorUser = caseCreatorUser;
    }


    /**
     * Gets the caseCreatorUserName value for this GetCaseInfoResponse.
     * 
     * @return caseCreatorUserName
     */
    public java.lang.String getCaseCreatorUserName() {
        return caseCreatorUserName;
    }


    /**
     * Sets the caseCreatorUserName value for this GetCaseInfoResponse.
     * 
     * @param caseCreatorUserName
     */
    public void setCaseCreatorUserName(java.lang.String caseCreatorUserName) {
        this.caseCreatorUserName = caseCreatorUserName;
    }


    /**
     * Gets the processId value for this GetCaseInfoResponse.
     * 
     * @return processId
     */
    public java.lang.String getProcessId() {
        return processId;
    }


    /**
     * Sets the processId value for this GetCaseInfoResponse.
     * 
     * @param processId
     */
    public void setProcessId(java.lang.String processId) {
        this.processId = processId;
    }


    /**
     * Gets the processName value for this GetCaseInfoResponse.
     * 
     * @return processName
     */
    public java.lang.String getProcessName() {
        return processName;
    }


    /**
     * Sets the processName value for this GetCaseInfoResponse.
     * 
     * @param processName
     */
    public void setProcessName(java.lang.String processName) {
        this.processName = processName;
    }


    /**
     * Gets the createDate value for this GetCaseInfoResponse.
     * 
     * @return createDate
     */
    public java.lang.String getCreateDate() {
        return createDate;
    }


    /**
     * Sets the createDate value for this GetCaseInfoResponse.
     * 
     * @param createDate
     */
    public void setCreateDate(java.lang.String createDate) {
        this.createDate = createDate;
    }


    /**
     * Gets the updateDate value for this GetCaseInfoResponse.
     * 
     * @return updateDate
     */
    public java.lang.String getUpdateDate() {
        return updateDate;
    }


    /**
     * Sets the updateDate value for this GetCaseInfoResponse.
     * 
     * @param updateDate
     */
    public void setUpdateDate(java.lang.String updateDate) {
        this.updateDate = updateDate;
    }


    /**
     * Gets the currentUsers value for this GetCaseInfoResponse.
     * 
     * @return currentUsers
     */
    public com.processmaker.www.GetCaseInfoStruct[] getCurrentUsers() {
        return currentUsers;
    }


    /**
     * Sets the currentUsers value for this GetCaseInfoResponse.
     * 
     * @param currentUsers
     */
    public void setCurrentUsers(com.processmaker.www.GetCaseInfoStruct[] currentUsers) {
        this.currentUsers = currentUsers;
    }

    public com.processmaker.www.GetCaseInfoStruct getCurrentUsers(int i) {
        return this.currentUsers[i];
    }

    public void setCurrentUsers(int i, com.processmaker.www.GetCaseInfoStruct _value) {
        this.currentUsers[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetCaseInfoResponse)) return false;
        GetCaseInfoResponse other = (GetCaseInfoResponse) obj;
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
            ((this.caseId==null && other.getCaseId()==null) || 
             (this.caseId!=null &&
              this.caseId.equals(other.getCaseId()))) &&
            ((this.caseNumber==null && other.getCaseNumber()==null) || 
             (this.caseNumber!=null &&
              this.caseNumber.equals(other.getCaseNumber()))) &&
            ((this.caseName==null && other.getCaseName()==null) || 
             (this.caseName!=null &&
              this.caseName.equals(other.getCaseName()))) &&
            ((this.caseStatus==null && other.getCaseStatus()==null) || 
             (this.caseStatus!=null &&
              this.caseStatus.equals(other.getCaseStatus()))) &&
            ((this.caseParalell==null && other.getCaseParalell()==null) || 
             (this.caseParalell!=null &&
              this.caseParalell.equals(other.getCaseParalell()))) &&
            ((this.caseCreatorUser==null && other.getCaseCreatorUser()==null) || 
             (this.caseCreatorUser!=null &&
              this.caseCreatorUser.equals(other.getCaseCreatorUser()))) &&
            ((this.caseCreatorUserName==null && other.getCaseCreatorUserName()==null) || 
             (this.caseCreatorUserName!=null &&
              this.caseCreatorUserName.equals(other.getCaseCreatorUserName()))) &&
            ((this.processId==null && other.getProcessId()==null) || 
             (this.processId!=null &&
              this.processId.equals(other.getProcessId()))) &&
            ((this.processName==null && other.getProcessName()==null) || 
             (this.processName!=null &&
              this.processName.equals(other.getProcessName()))) &&
            ((this.createDate==null && other.getCreateDate()==null) || 
             (this.createDate!=null &&
              this.createDate.equals(other.getCreateDate()))) &&
            ((this.updateDate==null && other.getUpdateDate()==null) || 
             (this.updateDate!=null &&
              this.updateDate.equals(other.getUpdateDate()))) &&
            ((this.currentUsers==null && other.getCurrentUsers()==null) || 
             (this.currentUsers!=null &&
              java.util.Arrays.equals(this.currentUsers, other.getCurrentUsers())));
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
        if (getCaseId() != null) {
            _hashCode += getCaseId().hashCode();
        }
        if (getCaseNumber() != null) {
            _hashCode += getCaseNumber().hashCode();
        }
        if (getCaseName() != null) {
            _hashCode += getCaseName().hashCode();
        }
        if (getCaseStatus() != null) {
            _hashCode += getCaseStatus().hashCode();
        }
        if (getCaseParalell() != null) {
            _hashCode += getCaseParalell().hashCode();
        }
        if (getCaseCreatorUser() != null) {
            _hashCode += getCaseCreatorUser().hashCode();
        }
        if (getCaseCreatorUserName() != null) {
            _hashCode += getCaseCreatorUserName().hashCode();
        }
        if (getProcessId() != null) {
            _hashCode += getProcessId().hashCode();
        }
        if (getProcessName() != null) {
            _hashCode += getProcessName().hashCode();
        }
        if (getCreateDate() != null) {
            _hashCode += getCreateDate().hashCode();
        }
        if (getUpdateDate() != null) {
            _hashCode += getUpdateDate().hashCode();
        }
        if (getCurrentUsers() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCurrentUsers());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCurrentUsers(), i);
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
        new org.apache.axis.description.TypeDesc(GetCaseInfoResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.processmaker.com", ">getCaseInfoResponse"));
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
        elemField.setFieldName("caseId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.processmaker.com", "caseId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("caseNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.processmaker.com", "caseNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("caseName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.processmaker.com", "caseName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("caseStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.processmaker.com", "caseStatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("caseParalell");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.processmaker.com", "caseParalell"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("caseCreatorUser");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.processmaker.com", "caseCreatorUser"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("caseCreatorUserName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.processmaker.com", "caseCreatorUserName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("processId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.processmaker.com", "processId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("processName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.processmaker.com", "processName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("createDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.processmaker.com", "createDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("updateDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.processmaker.com", "updateDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("currentUsers");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.processmaker.com", "currentUsers"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.processmaker.com", "getCaseInfoStruct"));
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
