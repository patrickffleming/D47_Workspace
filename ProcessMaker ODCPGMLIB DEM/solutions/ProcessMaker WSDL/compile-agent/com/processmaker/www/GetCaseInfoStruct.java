/**
 * GetCaseInfoStruct.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Nov 19, 2006 (02:31:34 GMT+00:00) WSDL2Java emitter.
 */

package com.processmaker.www;

public class GetCaseInfoStruct  implements java.io.Serializable {
    private java.lang.String userId;

    private java.lang.String userName;

    private java.lang.String taskId;

    private java.lang.String taskName;

    private java.math.BigInteger delIndex;

    private java.math.BigInteger delThread;

    private java.lang.String delThreadStatus;

    public GetCaseInfoStruct() {
    }

    public GetCaseInfoStruct(
           java.lang.String userId,
           java.lang.String userName,
           java.lang.String taskId,
           java.lang.String taskName,
           java.math.BigInteger delIndex,
           java.math.BigInteger delThread,
           java.lang.String delThreadStatus) {
           this.userId = userId;
           this.userName = userName;
           this.taskId = taskId;
           this.taskName = taskName;
           this.delIndex = delIndex;
           this.delThread = delThread;
           this.delThreadStatus = delThreadStatus;
    }


    /**
     * Gets the userId value for this GetCaseInfoStruct.
     * 
     * @return userId
     */
    public java.lang.String getUserId() {
        return userId;
    }


    /**
     * Sets the userId value for this GetCaseInfoStruct.
     * 
     * @param userId
     */
    public void setUserId(java.lang.String userId) {
        this.userId = userId;
    }


    /**
     * Gets the userName value for this GetCaseInfoStruct.
     * 
     * @return userName
     */
    public java.lang.String getUserName() {
        return userName;
    }


    /**
     * Sets the userName value for this GetCaseInfoStruct.
     * 
     * @param userName
     */
    public void setUserName(java.lang.String userName) {
        this.userName = userName;
    }


    /**
     * Gets the taskId value for this GetCaseInfoStruct.
     * 
     * @return taskId
     */
    public java.lang.String getTaskId() {
        return taskId;
    }


    /**
     * Sets the taskId value for this GetCaseInfoStruct.
     * 
     * @param taskId
     */
    public void setTaskId(java.lang.String taskId) {
        this.taskId = taskId;
    }


    /**
     * Gets the taskName value for this GetCaseInfoStruct.
     * 
     * @return taskName
     */
    public java.lang.String getTaskName() {
        return taskName;
    }


    /**
     * Sets the taskName value for this GetCaseInfoStruct.
     * 
     * @param taskName
     */
    public void setTaskName(java.lang.String taskName) {
        this.taskName = taskName;
    }


    /**
     * Gets the delIndex value for this GetCaseInfoStruct.
     * 
     * @return delIndex
     */
    public java.math.BigInteger getDelIndex() {
        return delIndex;
    }


    /**
     * Sets the delIndex value for this GetCaseInfoStruct.
     * 
     * @param delIndex
     */
    public void setDelIndex(java.math.BigInteger delIndex) {
        this.delIndex = delIndex;
    }


    /**
     * Gets the delThread value for this GetCaseInfoStruct.
     * 
     * @return delThread
     */
    public java.math.BigInteger getDelThread() {
        return delThread;
    }


    /**
     * Sets the delThread value for this GetCaseInfoStruct.
     * 
     * @param delThread
     */
    public void setDelThread(java.math.BigInteger delThread) {
        this.delThread = delThread;
    }


    /**
     * Gets the delThreadStatus value for this GetCaseInfoStruct.
     * 
     * @return delThreadStatus
     */
    public java.lang.String getDelThreadStatus() {
        return delThreadStatus;
    }


    /**
     * Sets the delThreadStatus value for this GetCaseInfoStruct.
     * 
     * @param delThreadStatus
     */
    public void setDelThreadStatus(java.lang.String delThreadStatus) {
        this.delThreadStatus = delThreadStatus;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetCaseInfoStruct)) return false;
        GetCaseInfoStruct other = (GetCaseInfoStruct) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.userId==null && other.getUserId()==null) || 
             (this.userId!=null &&
              this.userId.equals(other.getUserId()))) &&
            ((this.userName==null && other.getUserName()==null) || 
             (this.userName!=null &&
              this.userName.equals(other.getUserName()))) &&
            ((this.taskId==null && other.getTaskId()==null) || 
             (this.taskId!=null &&
              this.taskId.equals(other.getTaskId()))) &&
            ((this.taskName==null && other.getTaskName()==null) || 
             (this.taskName!=null &&
              this.taskName.equals(other.getTaskName()))) &&
            ((this.delIndex==null && other.getDelIndex()==null) || 
             (this.delIndex!=null &&
              this.delIndex.equals(other.getDelIndex()))) &&
            ((this.delThread==null && other.getDelThread()==null) || 
             (this.delThread!=null &&
              this.delThread.equals(other.getDelThread()))) &&
            ((this.delThreadStatus==null && other.getDelThreadStatus()==null) || 
             (this.delThreadStatus!=null &&
              this.delThreadStatus.equals(other.getDelThreadStatus())));
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
        if (getUserId() != null) {
            _hashCode += getUserId().hashCode();
        }
        if (getUserName() != null) {
            _hashCode += getUserName().hashCode();
        }
        if (getTaskId() != null) {
            _hashCode += getTaskId().hashCode();
        }
        if (getTaskName() != null) {
            _hashCode += getTaskName().hashCode();
        }
        if (getDelIndex() != null) {
            _hashCode += getDelIndex().hashCode();
        }
        if (getDelThread() != null) {
            _hashCode += getDelThread().hashCode();
        }
        if (getDelThreadStatus() != null) {
            _hashCode += getDelThreadStatus().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetCaseInfoStruct.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.processmaker.com", "getCaseInfoStruct"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.processmaker.com", "userId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.processmaker.com", "userName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("taskId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.processmaker.com", "taskId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("taskName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.processmaker.com", "taskName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("delIndex");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.processmaker.com", "delIndex"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "integer"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("delThread");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.processmaker.com", "delThread"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "integer"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("delThreadStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.processmaker.com", "delThreadStatus"));
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
