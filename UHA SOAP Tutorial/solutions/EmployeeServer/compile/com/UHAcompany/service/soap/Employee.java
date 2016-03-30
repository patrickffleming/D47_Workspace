/**
 * Employee.java
 *
 * This file was generated by LANSA Integrator SOAP Server Wizard
 */
package com.UHAcompany.service.soap ;

public class Employee implements java.io.Serializable
{
    private String employeeID ;
    private String firstName ;
    private Double salary ;
    private String surname ;

    /**
     * Sets the employeeID value for this Employee.
     *
     * @param employeeID
     */
    public void setEmployeeID ( String employeeID )
    {
        this.employeeID = employeeID ;
    }

    /**
     * Gets the employeeID value for this Employee.
     *
     * @return employeeID
     */
    public String getEmployeeID ()
    {
        return employeeID ;
    }

    /**
     * Sets the firstName value for this Employee.
     *
     * @param firstName
     */
    public void setFirstName ( String firstName )
    {
        this.firstName = firstName ;
    }

    /**
     * Gets the firstName value for this Employee.
     *
     * @return firstName
     */
    public String getFirstName ()
    {
        return firstName ;
    }

    /**
     * Sets the salary value for this Employee.
     *
     * @param salary
     */
    public void setSalary ( Double salary )
    {
        this.salary = salary ;
    }

    /**
     * Gets the salary value for this Employee.
     *
     * @return salary
     */
    public Double getSalary ()
    {
        return salary ;
    }

    /**
     * Sets the surname value for this Employee.
     *
     * @param surname
     */
    public void setSurname ( String surname )
    {
        this.surname = surname ;
    }

    /**
     * Gets the surname value for this Employee.
     *
     * @return surname
     */
    public String getSurname ()
    {
        return surname ;
    }

    /*
        Apache Axis Meta-Data
    */

    private static org.apache.axis.description.TypeDesc typeDesc = new org.apache.axis.description.TypeDesc ( Employee.class, true ) ; 

    static
    {
        typeDesc.setXmlType ( new javax.xml.namespace.QName ( "http://soap.service.UHAcompany.com", "Employee" ) ) ;

        org.apache.axis.description.ElementDesc elemField = null ;

        elemField = new org.apache.axis.description.ElementDesc () ;
        elemField.setFieldName ( "employeeID" ) ;
        elemField.setXmlName ( new javax.xml.namespace.QName ( "http://soap.service.UHAcompany.com", "employeeID" ) ) ;
        elemField.setXmlType ( new javax.xml.namespace.QName ( "http://www.w3.org/2001/XMLSchema", "string" ) ) ;
        elemField.setNillable ( true ) ;
        typeDesc.addFieldDesc ( elemField ) ;

        elemField = new org.apache.axis.description.ElementDesc () ;
        elemField.setFieldName ( "firstName" ) ;
        elemField.setXmlName ( new javax.xml.namespace.QName ( "http://soap.service.UHAcompany.com", "firstName" ) ) ;
        elemField.setXmlType ( new javax.xml.namespace.QName ( "http://www.w3.org/2001/XMLSchema", "string" ) ) ;
        elemField.setNillable ( true ) ;
        typeDesc.addFieldDesc ( elemField ) ;

        elemField = new org.apache.axis.description.ElementDesc () ;
        elemField.setFieldName ( "salary" ) ;
        elemField.setXmlName ( new javax.xml.namespace.QName ( "http://soap.service.UHAcompany.com", "salary" ) ) ;
        elemField.setXmlType ( new javax.xml.namespace.QName ( "http://www.w3.org/2001/XMLSchema", "double" ) ) ;
        elemField.setMinOccurs ( 0 ) ;
        elemField.setNillable ( true ) ;
        typeDesc.addFieldDesc ( elemField ) ;

        elemField = new org.apache.axis.description.ElementDesc () ;
        elemField.setFieldName ( "surname" ) ;
        elemField.setXmlName ( new javax.xml.namespace.QName ( "http://soap.service.UHAcompany.com", "surname" ) ) ;
        elemField.setXmlType ( new javax.xml.namespace.QName ( "http://www.w3.org/2001/XMLSchema", "string" ) ) ;
        elemField.setNillable ( true ) ;
        typeDesc.addFieldDesc ( elemField ) ;
    }

    public static org.apache.axis.description.TypeDesc getTypeDesc ()
    {
        return typeDesc ;
    }

    public static org.apache.axis.encoding.Serializer getSerializer ( java.lang.String _mechType, java.lang.Class _javaType, javax.xml.namespace.QName _xmlType )
    {
        return new org.apache.axis.encoding.ser.BeanSerializer ( _javaType, _xmlType, typeDesc ) ;
    }

    public static org.apache.axis.encoding.Deserializer getDeserializer ( java.lang.String _mechType, java.lang.Class _javaType, javax.xml.namespace.QName _xmlType )
    {
        return new org.apache.axis.encoding.ser.BeanDeserializer ( _javaType, _xmlType, typeDesc ) ;
    }
}
