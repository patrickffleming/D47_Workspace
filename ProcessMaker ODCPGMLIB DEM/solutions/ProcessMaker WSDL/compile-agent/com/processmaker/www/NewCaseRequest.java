/**
 * NewCaseRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Nov 19, 2006 (02:31:34 GMT+00:00) WSDL2Java emitter.
 */

package com.processmaker.www;

public class NewCaseRequest  implements java.io.Serializable {
    private java.lang.String sessionId;

    private java.lang.String processId;

    private java.lang.String taskId;

    private com.processmaker.www.VariableListStruct[] variables;

    private java.math.BigInteger[] executeTriggers;

    public NewCaseRequest() {
    }

    public NewCaseRequest(
           java.lang.String sessionId,
           java.lang.String processId,
           java.lang.String taskId,
           com.processmaker.www.VariableListStruct[] variables,
           java.math.BigInteger[] executeTriggers) {
           this.sessionId = sessionId;
           this.processId = processId;
           this.taskId = taskId;
           this.variables = variables;
           this.executeTriggers = executeTriggers;
    }


    /**
     * Gets the sessionId value for this NewCaseRequest.
     * 
     * @return sessionId
     */
    public java.lang.String getSessionId() {
        return sessionId;
    }


    /**
     * Sets the sessionId value for this NewCaseRequest.
     * 
     * @param sessionId
     */
    public void setSessionId(java.lang.String sessionId) {
        this.sessionId = sessionId;
    }


    /**
     * Gets the processId value for this NewCaseRequest.
     * 
     * @return processId
     */
    public java.lang.String getProcessId() {
        return processId;
    }


    /**
     * Sets the processId value for this NewCaseRequest.
     * 
     * @param processId
     */
    public void setProcessId(java.lang.String processId) {
        this.processId = processId;
    }


    /**
     * Gets the taskId value for this NewCaseRequest.
     * 
     * @return taskId
     */
    public java.lang.String getTaskId() {
        return taskId;
    }


    /**
     * Sets the taskId value for this NewCaseRequest.
     * 
     * @param taskId
     */
    public void setTaskId(java.lang.String taskId) {
        this.taskId = taskId;
    }


    /**
     * Gets the variables value for this NewCaseRequest.
     * 
     * @return variables
     */
    public com.processmaker.www.VariableListStruct[] getVariables() {
        return variables;
    }


    /**
     * Sets the variables value for this NewCaseRequest.
     * 
     * @param variables
     */
    public void setVariables(com.processmaker.www.VariableListStruct[] variables) {
        this.variables = variables;
    }

    public com.processmaker.www.VariableListStruct getVariables(int i) {
        return this.variables[i];
    }

    public void setVariables(int i, com.processmaker.www.VariableListStruct _value) {
        this.variables[i] = _value;
    }


    /**
     * Gets the executeTriggers value for this NewCaseRequest.
     * 
     * @return executeTriggers
     */
    public java.math.BigInteger[] getExecuteTriggers() {
        return executeTriggers;
    }


    /**
     * Sets the executeTriggers value for this NewCaseRequest.
     * 
     * @param executeTriggers
     */
    public void setExecuteTriggers(java.math.BigInteger[] executeTriggers) {
        this.executeTriggers = executeTriggers;
    }

    public java.math.BigInteger getExecuteTriggers(int i) {
        return this.executeTriggers[i];
    }

    public void setExecuteTriggers(int i, java.math.BigInteger _value) {
        this.executeTriggers[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof NewCaseRequest)) return false;
        NewCaseRequest other = (NewCaseRequest) obj;
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
            ((this.taskId==null && other.getTaskId()==null) || 
             (this.taskId!=null &&
              this.taskId.equals(other.getTaskId()))) &&
            ((this.variables==null && other.getVariables()==null) || 
             (this.variables!=null &&
              java.util.Arrays.equals(this.variables, other.getVariables()))) &&
            ((this.executeTriggers==null && other.getExecuteTriggers()==null) || 
             (this.executeTriggers!=null &&
              java.util.Arrays.equals(this.executeTriggers, other.getExecuteTriggers())));
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
        if (getTaskId() != null) {
            _hashCode += getTaskId().hashCode();
        }
        if (getVariables() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getVariables());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getVariables(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getExecuteTriggers() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getExecuteTriggers());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getExecuteTriggers(), i);
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
        new org.apache.axis.description.TypeDesc(NewCaseRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.processmaker.com", ">newCaseRequest"));
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
        elemField.setFieldName("taskId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.processmaker.com", "taskId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("variables");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.processmaker.com", "variables"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.processmaker.com", "variableListStruct"));
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("executeTriggers");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.processmaker.com", "executeTriggers"));
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
