/**
 * AddCaseNoteRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Nov 19, 2006 (02:31:34 GMT+00:00) WSDL2Java emitter.
 */

package com.processmaker.www;

public class AddCaseNoteRequest  implements java.io.Serializable {
    private java.lang.String sessionId;

    private java.lang.String caseUid;

    private java.lang.String processUid;

    private java.lang.String taskUid;

    private java.lang.String userUid;

    private java.lang.String note;

    private java.math.BigInteger[] sendMail;

    public AddCaseNoteRequest() {
    }

    public AddCaseNoteRequest(
           java.lang.String sessionId,
           java.lang.String caseUid,
           java.lang.String processUid,
           java.lang.String taskUid,
           java.lang.String userUid,
           java.lang.String note,
           java.math.BigInteger[] sendMail) {
           this.sessionId = sessionId;
           this.caseUid = caseUid;
           this.processUid = processUid;
           this.taskUid = taskUid;
           this.userUid = userUid;
           this.note = note;
           this.sendMail = sendMail;
    }


    /**
     * Gets the sessionId value for this AddCaseNoteRequest.
     * 
     * @return sessionId
     */
    public java.lang.String getSessionId() {
        return sessionId;
    }


    /**
     * Sets the sessionId value for this AddCaseNoteRequest.
     * 
     * @param sessionId
     */
    public void setSessionId(java.lang.String sessionId) {
        this.sessionId = sessionId;
    }


    /**
     * Gets the caseUid value for this AddCaseNoteRequest.
     * 
     * @return caseUid
     */
    public java.lang.String getCaseUid() {
        return caseUid;
    }


    /**
     * Sets the caseUid value for this AddCaseNoteRequest.
     * 
     * @param caseUid
     */
    public void setCaseUid(java.lang.String caseUid) {
        this.caseUid = caseUid;
    }


    /**
     * Gets the processUid value for this AddCaseNoteRequest.
     * 
     * @return processUid
     */
    public java.lang.String getProcessUid() {
        return processUid;
    }


    /**
     * Sets the processUid value for this AddCaseNoteRequest.
     * 
     * @param processUid
     */
    public void setProcessUid(java.lang.String processUid) {
        this.processUid = processUid;
    }


    /**
     * Gets the taskUid value for this AddCaseNoteRequest.
     * 
     * @return taskUid
     */
    public java.lang.String getTaskUid() {
        return taskUid;
    }


    /**
     * Sets the taskUid value for this AddCaseNoteRequest.
     * 
     * @param taskUid
     */
    public void setTaskUid(java.lang.String taskUid) {
        this.taskUid = taskUid;
    }


    /**
     * Gets the userUid value for this AddCaseNoteRequest.
     * 
     * @return userUid
     */
    public java.lang.String getUserUid() {
        return userUid;
    }


    /**
     * Sets the userUid value for this AddCaseNoteRequest.
     * 
     * @param userUid
     */
    public void setUserUid(java.lang.String userUid) {
        this.userUid = userUid;
    }


    /**
     * Gets the note value for this AddCaseNoteRequest.
     * 
     * @return note
     */
    public java.lang.String getNote() {
        return note;
    }


    /**
     * Sets the note value for this AddCaseNoteRequest.
     * 
     * @param note
     */
    public void setNote(java.lang.String note) {
        this.note = note;
    }


    /**
     * Gets the sendMail value for this AddCaseNoteRequest.
     * 
     * @return sendMail
     */
    public java.math.BigInteger[] getSendMail() {
        return sendMail;
    }


    /**
     * Sets the sendMail value for this AddCaseNoteRequest.
     * 
     * @param sendMail
     */
    public void setSendMail(java.math.BigInteger[] sendMail) {
        this.sendMail = sendMail;
    }

    public java.math.BigInteger getSendMail(int i) {
        return this.sendMail[i];
    }

    public void setSendMail(int i, java.math.BigInteger _value) {
        this.sendMail[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AddCaseNoteRequest)) return false;
        AddCaseNoteRequest other = (AddCaseNoteRequest) obj;
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
            ((this.processUid==null && other.getProcessUid()==null) || 
             (this.processUid!=null &&
              this.processUid.equals(other.getProcessUid()))) &&
            ((this.taskUid==null && other.getTaskUid()==null) || 
             (this.taskUid!=null &&
              this.taskUid.equals(other.getTaskUid()))) &&
            ((this.userUid==null && other.getUserUid()==null) || 
             (this.userUid!=null &&
              this.userUid.equals(other.getUserUid()))) &&
            ((this.note==null && other.getNote()==null) || 
             (this.note!=null &&
              this.note.equals(other.getNote()))) &&
            ((this.sendMail==null && other.getSendMail()==null) || 
             (this.sendMail!=null &&
              java.util.Arrays.equals(this.sendMail, other.getSendMail())));
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
        if (getProcessUid() != null) {
            _hashCode += getProcessUid().hashCode();
        }
        if (getTaskUid() != null) {
            _hashCode += getTaskUid().hashCode();
        }
        if (getUserUid() != null) {
            _hashCode += getUserUid().hashCode();
        }
        if (getNote() != null) {
            _hashCode += getNote().hashCode();
        }
        if (getSendMail() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSendMail());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getSendMail(), i);
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
        new org.apache.axis.description.TypeDesc(AddCaseNoteRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.processmaker.com", ">addCaseNoteRequest"));
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
        elemField.setFieldName("processUid");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.processmaker.com", "processUid"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("taskUid");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.processmaker.com", "taskUid"));
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
        elemField.setFieldName("note");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.processmaker.com", "note"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sendMail");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.processmaker.com", "sendMail"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "integer"));
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
