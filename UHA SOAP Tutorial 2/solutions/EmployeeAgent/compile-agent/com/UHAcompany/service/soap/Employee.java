/**
 * Employee.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Nov 19, 2006 (02:31:34 GMT+00:00) WSDL2Java emitter.
 */

package com.UHAcompany.service.soap;

public class Employee  implements java.io.Serializable {
    private java.lang.String employeeID;

    private java.lang.String firstName;

    private java.lang.Double salary;

    private java.lang.String surName;

    public Employee() {
    }

    public Employee(
           java.lang.String employeeID,
           java.lang.String firstName,
           java.lang.Double salary,
           java.lang.String surName) {
           this.employeeID = employeeID;
           this.firstName = firstName;
           this.salary = salary;
           this.surName = surName;
    }


    /**
     * Gets the employeeID value for this Employee.
     * 
     * @return employeeID
     */
    public java.lang.String getEmployeeID() {
        return employeeID;
    }


    /**
     * Sets the employeeID value for this Employee.
     * 
     * @param employeeID
     */
    public void setEmployeeID(java.lang.String employeeID) {
        this.employeeID = employeeID;
    }


    /**
     * Gets the firstName value for this Employee.
     * 
     * @return firstName
     */
    public java.lang.String getFirstName() {
        return firstName;
    }


    /**
     * Sets the firstName value for this Employee.
     * 
     * @param firstName
     */
    public void setFirstName(java.lang.String firstName) {
        this.firstName = firstName;
    }


    /**
     * Gets the salary value for this Employee.
     * 
     * @return salary
     */
    public java.lang.Double getSalary() {
        return salary;
    }


    /**
     * Sets the salary value for this Employee.
     * 
     * @param salary
     */
    public void setSalary(java.lang.Double salary) {
        this.salary = salary;
    }


    /**
     * Gets the surName value for this Employee.
     * 
     * @return surName
     */
    public java.lang.String getSurName() {
        return surName;
    }


    /**
     * Sets the surName value for this Employee.
     * 
     * @param surName
     */
    public void setSurName(java.lang.String surName) {
        this.surName = surName;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Employee)) return false;
        Employee other = (Employee) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.employeeID==null && other.getEmployeeID()==null) || 
             (this.employeeID!=null &&
              this.employeeID.equals(other.getEmployeeID()))) &&
            ((this.firstName==null && other.getFirstName()==null) || 
             (this.firstName!=null &&
              this.firstName.equals(other.getFirstName()))) &&
            ((this.salary==null && other.getSalary()==null) || 
             (this.salary!=null &&
              this.salary.equals(other.getSalary()))) &&
            ((this.surName==null && other.getSurName()==null) || 
             (this.surName!=null &&
              this.surName.equals(other.getSurName())));
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
        if (getEmployeeID() != null) {
            _hashCode += getEmployeeID().hashCode();
        }
        if (getFirstName() != null) {
            _hashCode += getFirstName().hashCode();
        }
        if (getSalary() != null) {
            _hashCode += getSalary().hashCode();
        }
        if (getSurName() != null) {
            _hashCode += getSurName().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Employee.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://soap.service.UHAcompany.com", "Employee"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("employeeID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.service.UHAcompany.com", "employeeID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("firstName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.service.UHAcompany.com", "firstName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("salary");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.service.UHAcompany.com", "salary"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("surName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.service.UHAcompany.com", "surName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
