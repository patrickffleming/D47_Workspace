/**
 * Employee.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Nov 19, 2006 (02:31:34 GMT+00:00) WSDL2Java emitter.
 */

package com.lansa.UHASOAPServer.Tutorial;

public class Employee  implements java.io.Serializable {
    private java.lang.String employee_ID;

    private java.lang.String firstname;

    private java.lang.Double salary;

    private java.lang.String surname;

    public Employee() {
    }

    public Employee(
           java.lang.String employee_ID,
           java.lang.String firstname,
           java.lang.Double salary,
           java.lang.String surname) {
           this.employee_ID = employee_ID;
           this.firstname = firstname;
           this.salary = salary;
           this.surname = surname;
    }


    /**
     * Gets the employee_ID value for this Employee.
     * 
     * @return employee_ID
     */
    public java.lang.String getEmployee_ID() {
        return employee_ID;
    }


    /**
     * Sets the employee_ID value for this Employee.
     * 
     * @param employee_ID
     */
    public void setEmployee_ID(java.lang.String employee_ID) {
        this.employee_ID = employee_ID;
    }


    /**
     * Gets the firstname value for this Employee.
     * 
     * @return firstname
     */
    public java.lang.String getFirstname() {
        return firstname;
    }


    /**
     * Sets the firstname value for this Employee.
     * 
     * @param firstname
     */
    public void setFirstname(java.lang.String firstname) {
        this.firstname = firstname;
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
     * Gets the surname value for this Employee.
     * 
     * @return surname
     */
    public java.lang.String getSurname() {
        return surname;
    }


    /**
     * Sets the surname value for this Employee.
     * 
     * @param surname
     */
    public void setSurname(java.lang.String surname) {
        this.surname = surname;
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
            ((this.employee_ID==null && other.getEmployee_ID()==null) || 
             (this.employee_ID!=null &&
              this.employee_ID.equals(other.getEmployee_ID()))) &&
            ((this.firstname==null && other.getFirstname()==null) || 
             (this.firstname!=null &&
              this.firstname.equals(other.getFirstname()))) &&
            ((this.salary==null && other.getSalary()==null) || 
             (this.salary!=null &&
              this.salary.equals(other.getSalary()))) &&
            ((this.surname==null && other.getSurname()==null) || 
             (this.surname!=null &&
              this.surname.equals(other.getSurname())));
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
        if (getEmployee_ID() != null) {
            _hashCode += getEmployee_ID().hashCode();
        }
        if (getFirstname() != null) {
            _hashCode += getFirstname().hashCode();
        }
        if (getSalary() != null) {
            _hashCode += getSalary().hashCode();
        }
        if (getSurname() != null) {
            _hashCode += getSurname().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Employee.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://Tutorial.UHASOAPServer.lansa.com", "Employee"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("employee_ID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://Tutorial.UHASOAPServer.lansa.com", "employee_ID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("firstname");
        elemField.setXmlName(new javax.xml.namespace.QName("http://Tutorial.UHASOAPServer.lansa.com", "firstname"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("salary");
        elemField.setXmlName(new javax.xml.namespace.QName("http://Tutorial.UHASOAPServer.lansa.com", "salary"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("surname");
        elemField.setXmlName(new javax.xml.namespace.QName("http://Tutorial.UHASOAPServer.lansa.com", "surname"));
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
