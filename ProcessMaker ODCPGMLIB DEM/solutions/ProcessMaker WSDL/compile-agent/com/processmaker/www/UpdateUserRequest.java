/**
 * UpdateUserRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Nov 19, 2006 (02:31:34 GMT+00:00) WSDL2Java emitter.
 */

package com.processmaker.www;

public class UpdateUserRequest  implements java.io.Serializable {
    private java.lang.String sessionId;

    private java.lang.String userUid;

    private java.lang.String userName;

    private java.lang.String[] firstName;

    private java.lang.String[] lastName;

    private java.lang.String[] email;

    private java.lang.String[] dueDate;

    private java.lang.String[] status;

    private java.lang.String[] role;

    private java.lang.String[] password;

    public UpdateUserRequest() {
    }

    public UpdateUserRequest(
           java.lang.String sessionId,
           java.lang.String userUid,
           java.lang.String userName,
           java.lang.String[] firstName,
           java.lang.String[] lastName,
           java.lang.String[] email,
           java.lang.String[] dueDate,
           java.lang.String[] status,
           java.lang.String[] role,
           java.lang.String[] password) {
           this.sessionId = sessionId;
           this.userUid = userUid;
           this.userName = userName;
           this.firstName = firstName;
           this.lastName = lastName;
           this.email = email;
           this.dueDate = dueDate;
           this.status = status;
           this.role = role;
           this.password = password;
    }


    /**
     * Gets the sessionId value for this UpdateUserRequest.
     * 
     * @return sessionId
     */
    public java.lang.String getSessionId() {
        return sessionId;
    }


    /**
     * Sets the sessionId value for this UpdateUserRequest.
     * 
     * @param sessionId
     */
    public void setSessionId(java.lang.String sessionId) {
        this.sessionId = sessionId;
    }


    /**
     * Gets the userUid value for this UpdateUserRequest.
     * 
     * @return userUid
     */
    public java.lang.String getUserUid() {
        return userUid;
    }


    /**
     * Sets the userUid value for this UpdateUserRequest.
     * 
     * @param userUid
     */
    public void setUserUid(java.lang.String userUid) {
        this.userUid = userUid;
    }


    /**
     * Gets the userName value for this UpdateUserRequest.
     * 
     * @return userName
     */
    public java.lang.String getUserName() {
        return userName;
    }


    /**
     * Sets the userName value for this UpdateUserRequest.
     * 
     * @param userName
     */
    public void setUserName(java.lang.String userName) {
        this.userName = userName;
    }


    /**
     * Gets the firstName value for this UpdateUserRequest.
     * 
     * @return firstName
     */
    public java.lang.String[] getFirstName() {
        return firstName;
    }


    /**
     * Sets the firstName value for this UpdateUserRequest.
     * 
     * @param firstName
     */
    public void setFirstName(java.lang.String[] firstName) {
        this.firstName = firstName;
    }

    public java.lang.String getFirstName(int i) {
        return this.firstName[i];
    }

    public void setFirstName(int i, java.lang.String _value) {
        this.firstName[i] = _value;
    }


    /**
     * Gets the lastName value for this UpdateUserRequest.
     * 
     * @return lastName
     */
    public java.lang.String[] getLastName() {
        return lastName;
    }


    /**
     * Sets the lastName value for this UpdateUserRequest.
     * 
     * @param lastName
     */
    public void setLastName(java.lang.String[] lastName) {
        this.lastName = lastName;
    }

    public java.lang.String getLastName(int i) {
        return this.lastName[i];
    }

    public void setLastName(int i, java.lang.String _value) {
        this.lastName[i] = _value;
    }


    /**
     * Gets the email value for this UpdateUserRequest.
     * 
     * @return email
     */
    public java.lang.String[] getEmail() {
        return email;
    }


    /**
     * Sets the email value for this UpdateUserRequest.
     * 
     * @param email
     */
    public void setEmail(java.lang.String[] email) {
        this.email = email;
    }

    public java.lang.String getEmail(int i) {
        return this.email[i];
    }

    public void setEmail(int i, java.lang.String _value) {
        this.email[i] = _value;
    }


    /**
     * Gets the dueDate value for this UpdateUserRequest.
     * 
     * @return dueDate
     */
    public java.lang.String[] getDueDate() {
        return dueDate;
    }


    /**
     * Sets the dueDate value for this UpdateUserRequest.
     * 
     * @param dueDate
     */
    public void setDueDate(java.lang.String[] dueDate) {
        this.dueDate = dueDate;
    }

    public java.lang.String getDueDate(int i) {
        return this.dueDate[i];
    }

    public void setDueDate(int i, java.lang.String _value) {
        this.dueDate[i] = _value;
    }


    /**
     * Gets the status value for this UpdateUserRequest.
     * 
     * @return status
     */
    public java.lang.String[] getStatus() {
        return status;
    }


    /**
     * Sets the status value for this UpdateUserRequest.
     * 
     * @param status
     */
    public void setStatus(java.lang.String[] status) {
        this.status = status;
    }

    public java.lang.String getStatus(int i) {
        return this.status[i];
    }

    public void setStatus(int i, java.lang.String _value) {
        this.status[i] = _value;
    }


    /**
     * Gets the role value for this UpdateUserRequest.
     * 
     * @return role
     */
    public java.lang.String[] getRole() {
        return role;
    }


    /**
     * Sets the role value for this UpdateUserRequest.
     * 
     * @param role
     */
    public void setRole(java.lang.String[] role) {
        this.role = role;
    }

    public java.lang.String getRole(int i) {
        return this.role[i];
    }

    public void setRole(int i, java.lang.String _value) {
        this.role[i] = _value;
    }


    /**
     * Gets the password value for this UpdateUserRequest.
     * 
     * @return password
     */
    public java.lang.String[] getPassword() {
        return password;
    }


    /**
     * Sets the password value for this UpdateUserRequest.
     * 
     * @param password
     */
    public void setPassword(java.lang.String[] password) {
        this.password = password;
    }

    public java.lang.String getPassword(int i) {
        return this.password[i];
    }

    public void setPassword(int i, java.lang.String _value) {
        this.password[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof UpdateUserRequest)) return false;
        UpdateUserRequest other = (UpdateUserRequest) obj;
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
            ((this.userUid==null && other.getUserUid()==null) || 
             (this.userUid!=null &&
              this.userUid.equals(other.getUserUid()))) &&
            ((this.userName==null && other.getUserName()==null) || 
             (this.userName!=null &&
              this.userName.equals(other.getUserName()))) &&
            ((this.firstName==null && other.getFirstName()==null) || 
             (this.firstName!=null &&
              java.util.Arrays.equals(this.firstName, other.getFirstName()))) &&
            ((this.lastName==null && other.getLastName()==null) || 
             (this.lastName!=null &&
              java.util.Arrays.equals(this.lastName, other.getLastName()))) &&
            ((this.email==null && other.getEmail()==null) || 
             (this.email!=null &&
              java.util.Arrays.equals(this.email, other.getEmail()))) &&
            ((this.dueDate==null && other.getDueDate()==null) || 
             (this.dueDate!=null &&
              java.util.Arrays.equals(this.dueDate, other.getDueDate()))) &&
            ((this.status==null && other.getStatus()==null) || 
             (this.status!=null &&
              java.util.Arrays.equals(this.status, other.getStatus()))) &&
            ((this.role==null && other.getRole()==null) || 
             (this.role!=null &&
              java.util.Arrays.equals(this.role, other.getRole()))) &&
            ((this.password==null && other.getPassword()==null) || 
             (this.password!=null &&
              java.util.Arrays.equals(this.password, other.getPassword())));
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
        if (getUserUid() != null) {
            _hashCode += getUserUid().hashCode();
        }
        if (getUserName() != null) {
            _hashCode += getUserName().hashCode();
        }
        if (getFirstName() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getFirstName());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getFirstName(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getLastName() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getLastName());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getLastName(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getEmail() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getEmail());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getEmail(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getDueDate() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getDueDate());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getDueDate(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getStatus() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getStatus());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getStatus(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getRole() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getRole());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getRole(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getPassword() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPassword());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPassword(), i);
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
        new org.apache.axis.description.TypeDesc(UpdateUserRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.processmaker.com", ">updateUserRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sessionId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.processmaker.com", "sessionId"));
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
        elemField.setFieldName("userName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.processmaker.com", "userName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("firstName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.processmaker.com", "firstName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lastName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.processmaker.com", "lastName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("email");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.processmaker.com", "email"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dueDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.processmaker.com", "dueDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("status");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.processmaker.com", "status"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("role");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.processmaker.com", "role"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("password");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.processmaker.com", "password"));
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
