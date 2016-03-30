/**
 * ProcessMakerServiceSoapStub.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Nov 19, 2006 (02:31:34 GMT+00:00) WSDL2Java emitter.
 */

package com.processmaker.www;

public class ProcessMakerServiceSoapStub extends org.apache.axis.client.Stub implements com.processmaker.www.ProcessMakerServiceSoap {
    private java.util.Vector cachedSerClasses = new java.util.Vector();
    private java.util.Vector cachedSerQNames = new java.util.Vector();
    private java.util.Vector cachedSerFactories = new java.util.Vector();
    private java.util.Vector cachedDeserFactories = new java.util.Vector();

    static org.apache.axis.description.OperationDesc [] _operations;

    static {
        _operations = new org.apache.axis.description.OperationDesc[41];
        _initOperationDesc1();
        _initOperationDesc2();
        _initOperationDesc3();
        _initOperationDesc4();
        _initOperationDesc5();
    }

    private static void _initOperationDesc1(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("login");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.processmaker.com", "login"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.processmaker.com", ">login"), com.processmaker.www.Login.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.processmaker.com", ">loginResponse"));
        oper.setReturnClass(com.processmaker.www.LoginResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.processmaker.com", "loginResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[0] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("processList");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.processmaker.com", "processListRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.processmaker.com", ">processListRequest"), com.processmaker.www.ProcessListRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.processmaker.com", ">processListResponse"));
        oper.setReturnClass(com.processmaker.www.ProcessListStruct[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.processmaker.com", "processListResponse"));
        param = oper.getReturnParamDesc();
        param.setItemQName(new javax.xml.namespace.QName("http://www.processmaker.com", "processes"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[1] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("roleList");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.processmaker.com", "roleListRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.processmaker.com", ">roleListRequest"), com.processmaker.www.RoleListRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.processmaker.com", ">roleListResponse"));
        oper.setReturnClass(com.processmaker.www.RoleListStruct[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.processmaker.com", "roleListResponse"));
        param = oper.getReturnParamDesc();
        param.setItemQName(new javax.xml.namespace.QName("http://www.processmaker.com", "roles"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[2] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("groupList");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.processmaker.com", "groupListRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.processmaker.com", ">groupListRequest"), com.processmaker.www.GroupListRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.processmaker.com", ">groupListResponse"));
        oper.setReturnClass(com.processmaker.www.GroupListStruct[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.processmaker.com", "groupListResponse"));
        param = oper.getReturnParamDesc();
        param.setItemQName(new javax.xml.namespace.QName("http://www.processmaker.com", "groups"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[3] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("departmentList");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.processmaker.com", "departmentListRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.processmaker.com", ">departmentListRequest"), com.processmaker.www.DepartmentListRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.processmaker.com", ">departmentListResponse"));
        oper.setReturnClass(com.processmaker.www.DepartmentListStruct[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.processmaker.com", "departmentListResponse"));
        param = oper.getReturnParamDesc();
        param.setItemQName(new javax.xml.namespace.QName("http://www.processmaker.com", "departments"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[4] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("userList");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.processmaker.com", "userListRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.processmaker.com", ">userListRequest"), com.processmaker.www.UserListRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.processmaker.com", ">userListResponse"));
        oper.setReturnClass(com.processmaker.www.UserListStruct[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.processmaker.com", "userListResponse"));
        param = oper.getReturnParamDesc();
        param.setItemQName(new javax.xml.namespace.QName("http://www.processmaker.com", "users"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[5] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("caseList");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.processmaker.com", "caseListRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.processmaker.com", ">caseListRequest"), com.processmaker.www.CaseListRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.processmaker.com", ">caseListResponse"));
        oper.setReturnClass(com.processmaker.www.CaseListStruct[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.processmaker.com", "caseListResponse"));
        param = oper.getReturnParamDesc();
        param.setItemQName(new javax.xml.namespace.QName("http://www.processmaker.com", "cases"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[6] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("unassignedCaseList");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.processmaker.com", "unassignedCaseListRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.processmaker.com", ">unassignedCaseListRequest"), com.processmaker.www.UnassignedCaseListRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.processmaker.com", ">unassignedCaseListResponse"));
        oper.setReturnClass(com.processmaker.www.UnassignedCaseListStruct[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.processmaker.com", "unassignedCaseListResponse"));
        param = oper.getReturnParamDesc();
        param.setItemQName(new javax.xml.namespace.QName("http://www.processmaker.com", "cases"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[7] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("createUser");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.processmaker.com", "createUserRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.processmaker.com", ">createUserRequest"), com.processmaker.www.CreateUserRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.processmaker.com", ">createUserResponse"));
        oper.setReturnClass(com.processmaker.www.CreateUserResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.processmaker.com", "createUserResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[8] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("updateUser");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.processmaker.com", "updateUserRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.processmaker.com", ">updateUserRequest"), com.processmaker.www.UpdateUserRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.processmaker.com", ">updateUserResponse"));
        oper.setReturnClass(com.processmaker.www.UpdateUserResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.processmaker.com", "updateUserResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[9] = oper;

    }

    private static void _initOperationDesc2(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("informationUser");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.processmaker.com", "informationUserRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.processmaker.com", ">informationUserRequest"), com.processmaker.www.InformationUserRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.processmaker.com", ">informationUserResponse"));
        oper.setReturnClass(com.processmaker.www.InformationUserResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.processmaker.com", "informationUserResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[10] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("createGroup");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.processmaker.com", "createGroupRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.processmaker.com", ">createGroupRequest"), com.processmaker.www.CreateGroupRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.processmaker.com", ">createGroupResponse"));
        oper.setReturnClass(com.processmaker.www.CreateGroupResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.processmaker.com", "createGroupResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[11] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("createDepartment");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.processmaker.com", "createDepartmentRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.processmaker.com", ">createDepartmentRequest"), com.processmaker.www.CreateDepartmentRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.processmaker.com", ">createDepartmentResponse"));
        oper.setReturnClass(com.processmaker.www.CreateDepartmentResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.processmaker.com", "createDepartmentResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[12] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("assignUserToGroup");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.processmaker.com", "assignUserToGroupRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.processmaker.com", ">assignUserToGroupRequest"), com.processmaker.www.AssignUserToGroupRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.processmaker.com", ">pmResponse"));
        oper.setReturnClass(com.processmaker.www.PmResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.processmaker.com", "pmResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[13] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("assignUserToDepartment");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.processmaker.com", "assignUserToDepartmentRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.processmaker.com", ">assignUserToDepartmentRequest"), com.processmaker.www.AssignUserToDepartmentRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.processmaker.com", ">pmResponse"));
        oper.setReturnClass(com.processmaker.www.PmResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.processmaker.com", "pmResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[14] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("newCase");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.processmaker.com", "newCaseRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.processmaker.com", ">newCaseRequest"), com.processmaker.www.NewCaseRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.processmaker.com", ">newCaseResponse"));
        oper.setReturnClass(com.processmaker.www.NewCaseResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.processmaker.com", "newCaseResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[15] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("reassignCase");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.processmaker.com", "reassignCaseRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.processmaker.com", ">reassignCaseRequest"), com.processmaker.www.ReassignCaseRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.processmaker.com", ">pmResponse"));
        oper.setReturnClass(com.processmaker.www.PmResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.processmaker.com", "pmResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[16] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("newCaseImpersonate");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.processmaker.com", "newCaseImpersonateRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.processmaker.com", ">newCaseImpersonateRequest"), com.processmaker.www.NewCaseImpersonateRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.processmaker.com", ">newCaseImpersonateResponse"));
        oper.setReturnClass(com.processmaker.www.NewCaseImpersonateResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.processmaker.com", "newCaseImpersonateResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[17] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("routeCase");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.processmaker.com", "routeCaseRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.processmaker.com", ">routeCaseRequest"), com.processmaker.www.RouteCaseRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.processmaker.com", ">routeCaseResponse"));
        oper.setReturnClass(com.processmaker.www.RouteCaseResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.processmaker.com", "routeCaseResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[18] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("executeTrigger");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.processmaker.com", "executeTriggerRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.processmaker.com", ">executeTriggerRequest"), com.processmaker.www.ExecuteTriggerRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.processmaker.com", ">pmResponse"));
        oper.setReturnClass(com.processmaker.www.PmResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.processmaker.com", "pmResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[19] = oper;

    }

    private static void _initOperationDesc3(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("sendVariables");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.processmaker.com", "sendVariablesRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.processmaker.com", ">sendVariablesRequest"), com.processmaker.www.SendVariablesRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.processmaker.com", ">pmResponse"));
        oper.setReturnClass(com.processmaker.www.PmResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.processmaker.com", "pmResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[20] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getVariables");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.processmaker.com", "getVariablesRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.processmaker.com", ">getVariablesRequest"), com.processmaker.www.GetVariablesRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.processmaker.com", ">getVariablesResponse"));
        oper.setReturnClass(com.processmaker.www.GetVariablesResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.processmaker.com", "getVariablesResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[21] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getVariablesNames");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.processmaker.com", "getVariablesNamesRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.processmaker.com", ">getVariablesNamesRequest"), com.processmaker.www.GetVariablesNamesRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.processmaker.com", ">getVariablesNamesResponse"));
        oper.setReturnClass(com.processmaker.www.GetVariablesNamesResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.processmaker.com", "getVariablesNamesResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[22] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("sendMessage");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.processmaker.com", "sendMessageRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.processmaker.com", ">sendMessageRequest"), com.processmaker.www.SendMessageRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.processmaker.com", ">pmResponse"));
        oper.setReturnClass(com.processmaker.www.PmResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.processmaker.com", "pmResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[23] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getCaseInfo");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.processmaker.com", "getCaseInfoRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.processmaker.com", ">getCaseInfoRequest"), com.processmaker.www.GetCaseInfoRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.processmaker.com", ">getCaseInfoResponse"));
        oper.setReturnClass(com.processmaker.www.GetCaseInfoResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.processmaker.com", "getCaseInfoResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[24] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("taskList");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.processmaker.com", "taskListRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.processmaker.com", ">taskListRequest"), com.processmaker.www.TaskListRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.processmaker.com", ">taskListResponse"));
        oper.setReturnClass(com.processmaker.www.TaskListStruct[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.processmaker.com", "taskListResponse"));
        param = oper.getReturnParamDesc();
        param.setItemQName(new javax.xml.namespace.QName("http://www.processmaker.com", "tasks"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[25] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("taskCase");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.processmaker.com", "taskCaseRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.processmaker.com", ">taskCaseRequest"), com.processmaker.www.TaskCaseRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.processmaker.com", ">taskCaseResponse"));
        oper.setReturnClass(com.processmaker.www.TaskCaseStruct[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.processmaker.com", "taskCaseResponse"));
        param = oper.getReturnParamDesc();
        param.setItemQName(new javax.xml.namespace.QName("http://www.processmaker.com", "taskCases"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[26] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("systemInformation");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.processmaker.com", "systemInformationRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.processmaker.com", ">systemInformationRequest"), com.processmaker.www.SystemInformationRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.processmaker.com", ">systemInformationResponse"));
        oper.setReturnClass(com.processmaker.www.SystemInformationResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.processmaker.com", "systemInformationResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[27] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("triggerList");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.processmaker.com", "triggerListRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.processmaker.com", ">triggerListRequest"), com.processmaker.www.TriggerListRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.processmaker.com", ">triggerListResponse"));
        oper.setReturnClass(com.processmaker.www.TriggerListStruct[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.processmaker.com", "triggerListResponse"));
        param = oper.getReturnParamDesc();
        param.setItemQName(new javax.xml.namespace.QName("http://www.processmaker.com", "triggers"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[28] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("outputDocumentList");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.processmaker.com", "outputDocumentListRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.processmaker.com", ">outputDocumentListRequest"), com.processmaker.www.OutputDocumentListRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.processmaker.com", ">outputDocumentListResponse"));
        oper.setReturnClass(com.processmaker.www.OutputDocumentListStruct[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.processmaker.com", "outputDocumentListResponse"));
        param = oper.getReturnParamDesc();
        param.setItemQName(new javax.xml.namespace.QName("http://www.processmaker.com", "documents"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[29] = oper;

    }

    private static void _initOperationDesc4(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("inputDocumentList");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.processmaker.com", "inputDocumentListRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.processmaker.com", ">inputDocumentListRequest"), com.processmaker.www.InputDocumentListRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.processmaker.com", ">inputDocumentListResponse"));
        oper.setReturnClass(com.processmaker.www.InputDocumentListStruct[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.processmaker.com", "inputDocumentListResponse"));
        param = oper.getReturnParamDesc();
        param.setItemQName(new javax.xml.namespace.QName("http://www.processmaker.com", "documents"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[30] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("inputDocumentProcessList");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.processmaker.com", "inputDocumentProcessListRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.processmaker.com", ">inputDocumentProcessListRequest"), com.processmaker.www.InputDocumentProcessListRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.processmaker.com", ">inputDocumentProcessListResponse"));
        oper.setReturnClass(com.processmaker.www.InputDocumentProcessListStruct[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.processmaker.com", "inputDocumentProcessListResponse"));
        param = oper.getReturnParamDesc();
        param.setItemQName(new javax.xml.namespace.QName("http://www.processmaker.com", "documents"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[31] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("removeDocument");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.processmaker.com", "removeDocumentRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.processmaker.com", ">removeDocumentRequest"), com.processmaker.www.RemoveDocumentRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.processmaker.com", ">removeDocumentResponse"));
        oper.setReturnClass(com.processmaker.www.RemoveDocumentResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.processmaker.com", "removeDocumentResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[32] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("importProcessFromLibrary");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.processmaker.com", "importProcessFromLibraryRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.processmaker.com", ">importProcessFromLibraryRequest"), com.processmaker.www.ImportProcessFromLibraryRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.processmaker.com", ">importProcessFromLibraryResponse"));
        oper.setReturnClass(com.processmaker.www.ImportProcessFromLibraryResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.processmaker.com", "importProcessFromLibraryResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[33] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getCaseNotes");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.processmaker.com", "getCaseNotesRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.processmaker.com", ">getCaseNotesRequest"), com.processmaker.www.GetCaseNotesRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.processmaker.com", ">getCaseNotesResponse"));
        oper.setReturnClass(com.processmaker.www.GetCaseNotesResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.processmaker.com", "getCaseNotesResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[34] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("removeUserFromGroup");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.processmaker.com", "removeUserFromGroupRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.processmaker.com", ">removeUserFromGroupRequest"), com.processmaker.www.RemoveUserFromGroupRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.processmaker.com", ">pmResponse"));
        oper.setReturnClass(com.processmaker.www.PmResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.processmaker.com", "pmResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[35] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("deleteCase");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.processmaker.com", "deleteCaseRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.processmaker.com", ">deleteCaseRequest"), com.processmaker.www.DeleteCaseRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.processmaker.com", ">deleteCaseResponse"));
        oper.setReturnClass(com.processmaker.www.DeleteCaseResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.processmaker.com", "deleteCaseResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[36] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("cancelCase");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.processmaker.com", "cancelCaseRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.processmaker.com", ">cancelCaseRequest"), com.processmaker.www.CancelCaseRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.processmaker.com", ">cancelCaseResponse"));
        oper.setReturnClass(com.processmaker.www.CancelCaseResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.processmaker.com", "cancelCaseResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[37] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("pauseCase");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.processmaker.com", "pauseCaseRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.processmaker.com", ">pauseCaseRequest"), com.processmaker.www.PauseCaseRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.processmaker.com", ">pauseCaseResponse"));
        oper.setReturnClass(com.processmaker.www.PauseCaseResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.processmaker.com", "pauseCaseResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[38] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("unpauseCase");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.processmaker.com", "unpauseCaseRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.processmaker.com", ">unpauseCaseRequest"), com.processmaker.www.UnpauseCaseRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.processmaker.com", ">unpauseCaseResponse"));
        oper.setReturnClass(com.processmaker.www.UnpauseCaseResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.processmaker.com", "unpauseCaseResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[39] = oper;

    }

    private static void _initOperationDesc5(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("addCaseNote");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.processmaker.com", "addCaseNoteRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.processmaker.com", ">addCaseNoteRequest"), com.processmaker.www.AddCaseNoteRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.processmaker.com", ">addCaseNoteResponse"));
        oper.setReturnClass(com.processmaker.www.AddCaseNoteResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.processmaker.com", "addCaseNoteResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[40] = oper;

    }

    public ProcessMakerServiceSoapStub() throws org.apache.axis.AxisFault {
         this(null);
    }

    public ProcessMakerServiceSoapStub(java.net.URL endpointURL, javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
         this(service);
         super.cachedEndpoint = endpointURL;
    }

    public ProcessMakerServiceSoapStub(javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
        if (service == null) {
            super.service = new org.apache.axis.client.Service();
        } else {
            super.service = service;
        }
        ((org.apache.axis.client.Service)super.service).setTypeMappingVersion("1.2");
            java.lang.Class cls;
            javax.xml.namespace.QName qName;
            javax.xml.namespace.QName qName2;
            java.lang.Class beansf = org.apache.axis.encoding.ser.BeanSerializerFactory.class;
            java.lang.Class beandf = org.apache.axis.encoding.ser.BeanDeserializerFactory.class;
            java.lang.Class enumsf = org.apache.axis.encoding.ser.EnumSerializerFactory.class;
            java.lang.Class enumdf = org.apache.axis.encoding.ser.EnumDeserializerFactory.class;
            java.lang.Class arraysf = org.apache.axis.encoding.ser.ArraySerializerFactory.class;
            java.lang.Class arraydf = org.apache.axis.encoding.ser.ArrayDeserializerFactory.class;
            java.lang.Class simplesf = org.apache.axis.encoding.ser.SimpleSerializerFactory.class;
            java.lang.Class simpledf = org.apache.axis.encoding.ser.SimpleDeserializerFactory.class;
            java.lang.Class simplelistsf = org.apache.axis.encoding.ser.SimpleListSerializerFactory.class;
            java.lang.Class simplelistdf = org.apache.axis.encoding.ser.SimpleListDeserializerFactory.class;
            qName = new javax.xml.namespace.QName("http://www.processmaker.com", ">addCaseNoteRequest");
            cachedSerQNames.add(qName);
            cls = com.processmaker.www.AddCaseNoteRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.processmaker.com", ">addCaseNoteResponse");
            cachedSerQNames.add(qName);
            cls = com.processmaker.www.AddCaseNoteResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.processmaker.com", ">assignUserToDepartmentRequest");
            cachedSerQNames.add(qName);
            cls = com.processmaker.www.AssignUserToDepartmentRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.processmaker.com", ">assignUserToGroupRequest");
            cachedSerQNames.add(qName);
            cls = com.processmaker.www.AssignUserToGroupRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.processmaker.com", ">cancelCaseRequest");
            cachedSerQNames.add(qName);
            cls = com.processmaker.www.CancelCaseRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.processmaker.com", ">cancelCaseResponse");
            cachedSerQNames.add(qName);
            cls = com.processmaker.www.CancelCaseResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.processmaker.com", ">caseListRequest");
            cachedSerQNames.add(qName);
            cls = com.processmaker.www.CaseListRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.processmaker.com", ">caseListResponse");
            cachedSerQNames.add(qName);
            cls = com.processmaker.www.CaseListStruct[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.processmaker.com", "caseListStruct");
            qName2 = new javax.xml.namespace.QName("http://www.processmaker.com", "cases");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.processmaker.com", ">createDepartmentRequest");
            cachedSerQNames.add(qName);
            cls = com.processmaker.www.CreateDepartmentRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.processmaker.com", ">createDepartmentResponse");
            cachedSerQNames.add(qName);
            cls = com.processmaker.www.CreateDepartmentResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.processmaker.com", ">createGroupRequest");
            cachedSerQNames.add(qName);
            cls = com.processmaker.www.CreateGroupRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.processmaker.com", ">createGroupResponse");
            cachedSerQNames.add(qName);
            cls = com.processmaker.www.CreateGroupResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.processmaker.com", ">createUserRequest");
            cachedSerQNames.add(qName);
            cls = com.processmaker.www.CreateUserRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.processmaker.com", ">createUserResponse");
            cachedSerQNames.add(qName);
            cls = com.processmaker.www.CreateUserResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.processmaker.com", ">deleteCaseRequest");
            cachedSerQNames.add(qName);
            cls = com.processmaker.www.DeleteCaseRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.processmaker.com", ">deleteCaseResponse");
            cachedSerQNames.add(qName);
            cls = com.processmaker.www.DeleteCaseResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.processmaker.com", ">departmentListRequest");
            cachedSerQNames.add(qName);
            cls = com.processmaker.www.DepartmentListRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.processmaker.com", ">departmentListResponse");
            cachedSerQNames.add(qName);
            cls = com.processmaker.www.DepartmentListStruct[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.processmaker.com", "departmentListStruct");
            qName2 = new javax.xml.namespace.QName("http://www.processmaker.com", "departments");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.processmaker.com", ">executeTriggerRequest");
            cachedSerQNames.add(qName);
            cls = com.processmaker.www.ExecuteTriggerRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.processmaker.com", ">getCaseInfoRequest");
            cachedSerQNames.add(qName);
            cls = com.processmaker.www.GetCaseInfoRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.processmaker.com", ">getCaseInfoResponse");
            cachedSerQNames.add(qName);
            cls = com.processmaker.www.GetCaseInfoResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.processmaker.com", ">getCaseNotesRequest");
            cachedSerQNames.add(qName);
            cls = com.processmaker.www.GetCaseNotesRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.processmaker.com", ">getCaseNotesResponse");
            cachedSerQNames.add(qName);
            cls = com.processmaker.www.GetCaseNotesResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.processmaker.com", ">getVariablesNamesRequest");
            cachedSerQNames.add(qName);
            cls = com.processmaker.www.GetVariablesNamesRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.processmaker.com", ">getVariablesNamesResponse");
            cachedSerQNames.add(qName);
            cls = com.processmaker.www.GetVariablesNamesResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.processmaker.com", ">getVariablesRequest");
            cachedSerQNames.add(qName);
            cls = com.processmaker.www.GetVariablesRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.processmaker.com", ">getVariablesResponse");
            cachedSerQNames.add(qName);
            cls = com.processmaker.www.GetVariablesResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.processmaker.com", ">groupListRequest");
            cachedSerQNames.add(qName);
            cls = com.processmaker.www.GroupListRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.processmaker.com", ">groupListResponse");
            cachedSerQNames.add(qName);
            cls = com.processmaker.www.GroupListStruct[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.processmaker.com", "groupListStruct");
            qName2 = new javax.xml.namespace.QName("http://www.processmaker.com", "groups");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.processmaker.com", ">importProcessFromLibraryRequest");
            cachedSerQNames.add(qName);
            cls = com.processmaker.www.ImportProcessFromLibraryRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.processmaker.com", ">importProcessFromLibraryResponse");
            cachedSerQNames.add(qName);
            cls = com.processmaker.www.ImportProcessFromLibraryResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.processmaker.com", ">informationUserRequest");
            cachedSerQNames.add(qName);
            cls = com.processmaker.www.InformationUserRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.processmaker.com", ">informationUserResponse");
            cachedSerQNames.add(qName);
            cls = com.processmaker.www.InformationUserResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.processmaker.com", ">inputDocumentListRequest");
            cachedSerQNames.add(qName);
            cls = com.processmaker.www.InputDocumentListRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.processmaker.com", ">inputDocumentListResponse");
            cachedSerQNames.add(qName);
            cls = com.processmaker.www.InputDocumentListStruct[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.processmaker.com", "inputDocumentListStruct");
            qName2 = new javax.xml.namespace.QName("http://www.processmaker.com", "documents");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.processmaker.com", ">inputDocumentProcessListRequest");
            cachedSerQNames.add(qName);
            cls = com.processmaker.www.InputDocumentProcessListRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.processmaker.com", ">inputDocumentProcessListResponse");
            cachedSerQNames.add(qName);
            cls = com.processmaker.www.InputDocumentProcessListStruct[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.processmaker.com", "inputDocumentProcessListStruct");
            qName2 = new javax.xml.namespace.QName("http://www.processmaker.com", "documents");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.processmaker.com", ">login");
            cachedSerQNames.add(qName);
            cls = com.processmaker.www.Login.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.processmaker.com", ">loginResponse");
            cachedSerQNames.add(qName);
            cls = com.processmaker.www.LoginResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.processmaker.com", ">newCaseImpersonateRequest");
            cachedSerQNames.add(qName);
            cls = com.processmaker.www.NewCaseImpersonateRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.processmaker.com", ">newCaseImpersonateResponse");
            cachedSerQNames.add(qName);
            cls = com.processmaker.www.NewCaseImpersonateResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.processmaker.com", ">newCaseRequest");
            cachedSerQNames.add(qName);
            cls = com.processmaker.www.NewCaseRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.processmaker.com", ">newCaseResponse");
            cachedSerQNames.add(qName);
            cls = com.processmaker.www.NewCaseResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.processmaker.com", ">outputDocumentListRequest");
            cachedSerQNames.add(qName);
            cls = com.processmaker.www.OutputDocumentListRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.processmaker.com", ">outputDocumentListResponse");
            cachedSerQNames.add(qName);
            cls = com.processmaker.www.OutputDocumentListStruct[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.processmaker.com", "outputDocumentListStruct");
            qName2 = new javax.xml.namespace.QName("http://www.processmaker.com", "documents");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.processmaker.com", ">pauseCaseRequest");
            cachedSerQNames.add(qName);
            cls = com.processmaker.www.PauseCaseRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.processmaker.com", ">pauseCaseResponse");
            cachedSerQNames.add(qName);
            cls = com.processmaker.www.PauseCaseResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.processmaker.com", ">pmResponse");
            cachedSerQNames.add(qName);
            cls = com.processmaker.www.PmResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.processmaker.com", ">processListRequest");
            cachedSerQNames.add(qName);
            cls = com.processmaker.www.ProcessListRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.processmaker.com", ">processListResponse");
            cachedSerQNames.add(qName);
            cls = com.processmaker.www.ProcessListStruct[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.processmaker.com", "processListStruct");
            qName2 = new javax.xml.namespace.QName("http://www.processmaker.com", "processes");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.processmaker.com", ">reassignCaseRequest");
            cachedSerQNames.add(qName);
            cls = com.processmaker.www.ReassignCaseRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.processmaker.com", ">removeDocumentRequest");
            cachedSerQNames.add(qName);
            cls = com.processmaker.www.RemoveDocumentRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.processmaker.com", ">removeDocumentResponse");
            cachedSerQNames.add(qName);
            cls = com.processmaker.www.RemoveDocumentResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.processmaker.com", ">removeUserFromGroupRequest");
            cachedSerQNames.add(qName);
            cls = com.processmaker.www.RemoveUserFromGroupRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.processmaker.com", ">roleListRequest");
            cachedSerQNames.add(qName);
            cls = com.processmaker.www.RoleListRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.processmaker.com", ">roleListResponse");
            cachedSerQNames.add(qName);
            cls = com.processmaker.www.RoleListStruct[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.processmaker.com", "roleListStruct");
            qName2 = new javax.xml.namespace.QName("http://www.processmaker.com", "roles");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.processmaker.com", ">routeCaseRequest");
            cachedSerQNames.add(qName);
            cls = com.processmaker.www.RouteCaseRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.processmaker.com", ">routeCaseResponse");
            cachedSerQNames.add(qName);
            cls = com.processmaker.www.RouteCaseResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.processmaker.com", ">sendMessageRequest");
            cachedSerQNames.add(qName);
            cls = com.processmaker.www.SendMessageRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.processmaker.com", ">sendVariablesRequest");
            cachedSerQNames.add(qName);
            cls = com.processmaker.www.SendVariablesRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.processmaker.com", ">systemInformationRequest");
            cachedSerQNames.add(qName);
            cls = com.processmaker.www.SystemInformationRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.processmaker.com", ">systemInformationResponse");
            cachedSerQNames.add(qName);
            cls = com.processmaker.www.SystemInformationResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.processmaker.com", ">taskCaseRequest");
            cachedSerQNames.add(qName);
            cls = com.processmaker.www.TaskCaseRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.processmaker.com", ">taskCaseResponse");
            cachedSerQNames.add(qName);
            cls = com.processmaker.www.TaskCaseStruct[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.processmaker.com", "taskCaseStruct");
            qName2 = new javax.xml.namespace.QName("http://www.processmaker.com", "taskCases");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.processmaker.com", ">taskListRequest");
            cachedSerQNames.add(qName);
            cls = com.processmaker.www.TaskListRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.processmaker.com", ">taskListResponse");
            cachedSerQNames.add(qName);
            cls = com.processmaker.www.TaskListStruct[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.processmaker.com", "taskListStruct");
            qName2 = new javax.xml.namespace.QName("http://www.processmaker.com", "tasks");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.processmaker.com", ">triggerListRequest");
            cachedSerQNames.add(qName);
            cls = com.processmaker.www.TriggerListRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.processmaker.com", ">triggerListResponse");
            cachedSerQNames.add(qName);
            cls = com.processmaker.www.TriggerListStruct[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.processmaker.com", "triggerListStruct");
            qName2 = new javax.xml.namespace.QName("http://www.processmaker.com", "triggers");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.processmaker.com", ">unassignedCaseListRequest");
            cachedSerQNames.add(qName);
            cls = com.processmaker.www.UnassignedCaseListRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.processmaker.com", ">unassignedCaseListResponse");
            cachedSerQNames.add(qName);
            cls = com.processmaker.www.UnassignedCaseListStruct[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.processmaker.com", "unassignedCaseListStruct");
            qName2 = new javax.xml.namespace.QName("http://www.processmaker.com", "cases");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.processmaker.com", ">unpauseCaseRequest");
            cachedSerQNames.add(qName);
            cls = com.processmaker.www.UnpauseCaseRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.processmaker.com", ">unpauseCaseResponse");
            cachedSerQNames.add(qName);
            cls = com.processmaker.www.UnpauseCaseResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.processmaker.com", ">updateUserRequest");
            cachedSerQNames.add(qName);
            cls = com.processmaker.www.UpdateUserRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.processmaker.com", ">updateUserResponse");
            cachedSerQNames.add(qName);
            cls = com.processmaker.www.UpdateUserResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.processmaker.com", ">userListRequest");
            cachedSerQNames.add(qName);
            cls = com.processmaker.www.UserListRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.processmaker.com", ">userListResponse");
            cachedSerQNames.add(qName);
            cls = com.processmaker.www.UserListStruct[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.processmaker.com", "userListStruct");
            qName2 = new javax.xml.namespace.QName("http://www.processmaker.com", "users");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.processmaker.com", "caseListStruct");
            cachedSerQNames.add(qName);
            cls = com.processmaker.www.CaseListStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.processmaker.com", "departmentListStruct");
            cachedSerQNames.add(qName);
            cls = com.processmaker.www.DepartmentListStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.processmaker.com", "getCaseInfoStruct");
            cachedSerQNames.add(qName);
            cls = com.processmaker.www.GetCaseInfoStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.processmaker.com", "getCaseNotesStruct");
            cachedSerQNames.add(qName);
            cls = com.processmaker.www.GetCaseNotesStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.processmaker.com", "groupListStruct");
            cachedSerQNames.add(qName);
            cls = com.processmaker.www.GroupListStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.processmaker.com", "informationUserStruct");
            cachedSerQNames.add(qName);
            cls = com.processmaker.www.InformationUserStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.processmaker.com", "inputDocumentListStruct");
            cachedSerQNames.add(qName);
            cls = com.processmaker.www.InputDocumentListStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.processmaker.com", "inputDocumentProcessListStruct");
            cachedSerQNames.add(qName);
            cls = com.processmaker.www.InputDocumentProcessListStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.processmaker.com", "outputDocumentListStruct");
            cachedSerQNames.add(qName);
            cls = com.processmaker.www.OutputDocumentListStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.processmaker.com", "processListStruct");
            cachedSerQNames.add(qName);
            cls = com.processmaker.www.ProcessListStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.processmaker.com", "roleListStruct");
            cachedSerQNames.add(qName);
            cls = com.processmaker.www.RoleListStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.processmaker.com", "routeListStruct");
            cachedSerQNames.add(qName);
            cls = com.processmaker.www.RouteListStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.processmaker.com", "taskCaseStruct");
            cachedSerQNames.add(qName);
            cls = com.processmaker.www.TaskCaseStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.processmaker.com", "taskListStruct");
            cachedSerQNames.add(qName);
            cls = com.processmaker.www.TaskListStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.processmaker.com", "triggerListStruct");
            cachedSerQNames.add(qName);
            cls = com.processmaker.www.TriggerListStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.processmaker.com", "unassignedCaseListStruct");
            cachedSerQNames.add(qName);
            cls = com.processmaker.www.UnassignedCaseListStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.processmaker.com", "userListStruct");
            cachedSerQNames.add(qName);
            cls = com.processmaker.www.UserListStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.processmaker.com", "variableListNameStruct");
            cachedSerQNames.add(qName);
            cls = com.processmaker.www.VariableListNameStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.processmaker.com", "variableListStruct");
            cachedSerQNames.add(qName);
            cls = com.processmaker.www.VariableListStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.processmaker.com", "variableStruct");
            cachedSerQNames.add(qName);
            cls = com.processmaker.www.VariableStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

    }

    protected org.apache.axis.client.Call createCall() throws java.rmi.RemoteException {
        try {
            org.apache.axis.client.Call _call = super._createCall();
            if (super.maintainSessionSet) {
                _call.setMaintainSession(super.maintainSession);
            }
            if (super.cachedUsername != null) {
                _call.setUsername(super.cachedUsername);
            }
            if (super.cachedPassword != null) {
                _call.setPassword(super.cachedPassword);
            }
            if (super.cachedEndpoint != null) {
                _call.setTargetEndpointAddress(super.cachedEndpoint);
            }
            if (super.cachedTimeout != null) {
                _call.setTimeout(super.cachedTimeout);
            }
            if (super.cachedPortName != null) {
                _call.setPortName(super.cachedPortName);
            }
            java.util.Enumeration keys = super.cachedProperties.keys();
            while (keys.hasMoreElements()) {
                java.lang.String key = (java.lang.String) keys.nextElement();
                _call.setProperty(key, super.cachedProperties.get(key));
            }
            // All the type mapping information is registered
            // when the first call is made.
            // The type mapping information is actually registered in
            // the TypeMappingRegistry of the service, which
            // is the reason why registration is only needed for the first call.
            synchronized (this) {
                if (firstCall()) {
                    // must set encoding style before registering serializers
                    _call.setEncodingStyle(null);
                    for (int i = 0; i < cachedSerFactories.size(); ++i) {
                        java.lang.Class cls = (java.lang.Class) cachedSerClasses.get(i);
                        javax.xml.namespace.QName qName =
                                (javax.xml.namespace.QName) cachedSerQNames.get(i);
                        java.lang.Object x = cachedSerFactories.get(i);
                        if (x instanceof Class) {
                            java.lang.Class sf = (java.lang.Class)
                                 cachedSerFactories.get(i);
                            java.lang.Class df = (java.lang.Class)
                                 cachedDeserFactories.get(i);
                            _call.registerTypeMapping(cls, qName, sf, df, false);
                        }
                        else if (x instanceof javax.xml.rpc.encoding.SerializerFactory) {
                            org.apache.axis.encoding.SerializerFactory sf = (org.apache.axis.encoding.SerializerFactory)
                                 cachedSerFactories.get(i);
                            org.apache.axis.encoding.DeserializerFactory df = (org.apache.axis.encoding.DeserializerFactory)
                                 cachedDeserFactories.get(i);
                            _call.registerTypeMapping(cls, qName, sf, df, false);
                        }
                    }
                }
            }
            return _call;
        }
        catch (java.lang.Exception _t) {
            throw new org.apache.axis.AxisFault("Failure trying to get the Call object", _t);
        }
    }

    public com.processmaker.www.LoginResponse login(com.processmaker.www.Login parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[0]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.processmaker.com/login");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "login"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.processmaker.www.LoginResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.processmaker.www.LoginResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.processmaker.www.LoginResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.processmaker.www.ProcessListStruct[] processList(com.processmaker.www.ProcessListRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[1]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:processList");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "processList"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.processmaker.www.ProcessListStruct[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.processmaker.www.ProcessListStruct[]) org.apache.axis.utils.JavaUtils.convert(_resp, com.processmaker.www.ProcessListStruct[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.processmaker.www.RoleListStruct[] roleList(com.processmaker.www.RoleListRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[2]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:roleList");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "roleList"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.processmaker.www.RoleListStruct[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.processmaker.www.RoleListStruct[]) org.apache.axis.utils.JavaUtils.convert(_resp, com.processmaker.www.RoleListStruct[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.processmaker.www.GroupListStruct[] groupList(com.processmaker.www.GroupListRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[3]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:groupList");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "groupList"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.processmaker.www.GroupListStruct[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.processmaker.www.GroupListStruct[]) org.apache.axis.utils.JavaUtils.convert(_resp, com.processmaker.www.GroupListStruct[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.processmaker.www.DepartmentListStruct[] departmentList(com.processmaker.www.DepartmentListRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[4]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:departmentList");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "departmentList"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.processmaker.www.DepartmentListStruct[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.processmaker.www.DepartmentListStruct[]) org.apache.axis.utils.JavaUtils.convert(_resp, com.processmaker.www.DepartmentListStruct[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.processmaker.www.UserListStruct[] userList(com.processmaker.www.UserListRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[5]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:userList");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "userList"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.processmaker.www.UserListStruct[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.processmaker.www.UserListStruct[]) org.apache.axis.utils.JavaUtils.convert(_resp, com.processmaker.www.UserListStruct[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.processmaker.www.CaseListStruct[] caseList(com.processmaker.www.CaseListRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[6]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:caseList");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "caseList"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.processmaker.www.CaseListStruct[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.processmaker.www.CaseListStruct[]) org.apache.axis.utils.JavaUtils.convert(_resp, com.processmaker.www.CaseListStruct[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.processmaker.www.UnassignedCaseListStruct[] unassignedCaseList(com.processmaker.www.UnassignedCaseListRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[7]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:unassignedCaseList");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "unassignedCaseList"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.processmaker.www.UnassignedCaseListStruct[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.processmaker.www.UnassignedCaseListStruct[]) org.apache.axis.utils.JavaUtils.convert(_resp, com.processmaker.www.UnassignedCaseListStruct[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.processmaker.www.CreateUserResponse createUser(com.processmaker.www.CreateUserRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[8]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:createUser");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "createUser"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.processmaker.www.CreateUserResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.processmaker.www.CreateUserResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.processmaker.www.CreateUserResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.processmaker.www.UpdateUserResponse updateUser(com.processmaker.www.UpdateUserRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[9]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:updateUser");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "updateUser"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.processmaker.www.UpdateUserResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.processmaker.www.UpdateUserResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.processmaker.www.UpdateUserResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.processmaker.www.InformationUserResponse informationUser(com.processmaker.www.InformationUserRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[10]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:informationUser");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "informationUser"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.processmaker.www.InformationUserResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.processmaker.www.InformationUserResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.processmaker.www.InformationUserResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.processmaker.www.CreateGroupResponse createGroup(com.processmaker.www.CreateGroupRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[11]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:createGroup");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "createGroup"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.processmaker.www.CreateGroupResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.processmaker.www.CreateGroupResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.processmaker.www.CreateGroupResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.processmaker.www.CreateDepartmentResponse createDepartment(com.processmaker.www.CreateDepartmentRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[12]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:createDepartment");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "createDepartment"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.processmaker.www.CreateDepartmentResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.processmaker.www.CreateDepartmentResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.processmaker.www.CreateDepartmentResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.processmaker.www.PmResponse assignUserToGroup(com.processmaker.www.AssignUserToGroupRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[13]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:assignUserToGroup");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "assignUserToGroup"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.processmaker.www.PmResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.processmaker.www.PmResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.processmaker.www.PmResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.processmaker.www.PmResponse assignUserToDepartment(com.processmaker.www.AssignUserToDepartmentRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[14]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:assignUserToDepartment");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "assignUserToDepartment"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.processmaker.www.PmResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.processmaker.www.PmResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.processmaker.www.PmResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.processmaker.www.NewCaseResponse newCase(com.processmaker.www.NewCaseRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[15]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:newCase");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "newCase"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.processmaker.www.NewCaseResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.processmaker.www.NewCaseResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.processmaker.www.NewCaseResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.processmaker.www.PmResponse reassignCase(com.processmaker.www.ReassignCaseRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[16]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:reassignCase");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "reassignCase"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.processmaker.www.PmResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.processmaker.www.PmResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.processmaker.www.PmResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.processmaker.www.NewCaseImpersonateResponse newCaseImpersonate(com.processmaker.www.NewCaseImpersonateRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[17]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:newCaseImpersonate");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "newCaseImpersonate"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.processmaker.www.NewCaseImpersonateResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.processmaker.www.NewCaseImpersonateResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.processmaker.www.NewCaseImpersonateResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.processmaker.www.RouteCaseResponse routeCase(com.processmaker.www.RouteCaseRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[18]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:routeCase");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "routeCase"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.processmaker.www.RouteCaseResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.processmaker.www.RouteCaseResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.processmaker.www.RouteCaseResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.processmaker.www.PmResponse executeTrigger(com.processmaker.www.ExecuteTriggerRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[19]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:executeTrigger");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "executeTrigger"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.processmaker.www.PmResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.processmaker.www.PmResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.processmaker.www.PmResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.processmaker.www.PmResponse sendVariables(com.processmaker.www.SendVariablesRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[20]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:sendVariables");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "sendVariables"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.processmaker.www.PmResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.processmaker.www.PmResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.processmaker.www.PmResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.processmaker.www.GetVariablesResponse getVariables(com.processmaker.www.GetVariablesRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[21]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:getVariables");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "getVariables"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.processmaker.www.GetVariablesResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.processmaker.www.GetVariablesResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.processmaker.www.GetVariablesResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.processmaker.www.GetVariablesNamesResponse getVariablesNames(com.processmaker.www.GetVariablesNamesRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[22]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:getVariablesNames");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "getVariablesNames"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.processmaker.www.GetVariablesNamesResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.processmaker.www.GetVariablesNamesResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.processmaker.www.GetVariablesNamesResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.processmaker.www.PmResponse sendMessage(com.processmaker.www.SendMessageRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[23]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:sendMessage");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "sendMessage"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.processmaker.www.PmResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.processmaker.www.PmResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.processmaker.www.PmResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.processmaker.www.GetCaseInfoResponse getCaseInfo(com.processmaker.www.GetCaseInfoRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[24]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:getCaseInfo");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "getCaseInfo"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.processmaker.www.GetCaseInfoResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.processmaker.www.GetCaseInfoResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.processmaker.www.GetCaseInfoResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.processmaker.www.TaskListStruct[] taskList(com.processmaker.www.TaskListRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[25]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:taskList");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "taskList"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.processmaker.www.TaskListStruct[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.processmaker.www.TaskListStruct[]) org.apache.axis.utils.JavaUtils.convert(_resp, com.processmaker.www.TaskListStruct[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.processmaker.www.TaskCaseStruct[] taskCase(com.processmaker.www.TaskCaseRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[26]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:taskCase");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "taskCase"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.processmaker.www.TaskCaseStruct[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.processmaker.www.TaskCaseStruct[]) org.apache.axis.utils.JavaUtils.convert(_resp, com.processmaker.www.TaskCaseStruct[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.processmaker.www.SystemInformationResponse systemInformation(com.processmaker.www.SystemInformationRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[27]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:systemInformation");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "systemInformation"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.processmaker.www.SystemInformationResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.processmaker.www.SystemInformationResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.processmaker.www.SystemInformationResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.processmaker.www.TriggerListStruct[] triggerList(com.processmaker.www.TriggerListRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[28]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:triggerList");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "triggerList"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.processmaker.www.TriggerListStruct[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.processmaker.www.TriggerListStruct[]) org.apache.axis.utils.JavaUtils.convert(_resp, com.processmaker.www.TriggerListStruct[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.processmaker.www.OutputDocumentListStruct[] outputDocumentList(com.processmaker.www.OutputDocumentListRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[29]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:outputDocumentList");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "outputDocumentList"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.processmaker.www.OutputDocumentListStruct[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.processmaker.www.OutputDocumentListStruct[]) org.apache.axis.utils.JavaUtils.convert(_resp, com.processmaker.www.OutputDocumentListStruct[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.processmaker.www.InputDocumentListStruct[] inputDocumentList(com.processmaker.www.InputDocumentListRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[30]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:inputDocumentList");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "inputDocumentList"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.processmaker.www.InputDocumentListStruct[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.processmaker.www.InputDocumentListStruct[]) org.apache.axis.utils.JavaUtils.convert(_resp, com.processmaker.www.InputDocumentListStruct[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.processmaker.www.InputDocumentProcessListStruct[] inputDocumentProcessList(com.processmaker.www.InputDocumentProcessListRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[31]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:inputDocumentProcessList");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "inputDocumentProcessList"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.processmaker.www.InputDocumentProcessListStruct[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.processmaker.www.InputDocumentProcessListStruct[]) org.apache.axis.utils.JavaUtils.convert(_resp, com.processmaker.www.InputDocumentProcessListStruct[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.processmaker.www.RemoveDocumentResponse removeDocument(com.processmaker.www.RemoveDocumentRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[32]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:removeDocument");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "removeDocument"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.processmaker.www.RemoveDocumentResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.processmaker.www.RemoveDocumentResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.processmaker.www.RemoveDocumentResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.processmaker.www.ImportProcessFromLibraryResponse importProcessFromLibrary(com.processmaker.www.ImportProcessFromLibraryRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[33]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:importProcessFromLibrary");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "importProcessFromLibrary"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.processmaker.www.ImportProcessFromLibraryResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.processmaker.www.ImportProcessFromLibraryResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.processmaker.www.ImportProcessFromLibraryResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.processmaker.www.GetCaseNotesResponse getCaseNotes(com.processmaker.www.GetCaseNotesRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[34]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:getCaseNotes");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "getCaseNotes"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.processmaker.www.GetCaseNotesResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.processmaker.www.GetCaseNotesResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.processmaker.www.GetCaseNotesResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.processmaker.www.PmResponse removeUserFromGroup(com.processmaker.www.RemoveUserFromGroupRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[35]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:removeUserFromGroup");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "removeUserFromGroup"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.processmaker.www.PmResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.processmaker.www.PmResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.processmaker.www.PmResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.processmaker.www.DeleteCaseResponse deleteCase(com.processmaker.www.DeleteCaseRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[36]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:deleteCase");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "deleteCase"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.processmaker.www.DeleteCaseResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.processmaker.www.DeleteCaseResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.processmaker.www.DeleteCaseResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.processmaker.www.CancelCaseResponse cancelCase(com.processmaker.www.CancelCaseRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[37]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:cancelCase");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "cancelCase"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.processmaker.www.CancelCaseResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.processmaker.www.CancelCaseResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.processmaker.www.CancelCaseResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.processmaker.www.PauseCaseResponse pauseCase(com.processmaker.www.PauseCaseRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[38]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:pauseCase");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "pauseCase"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.processmaker.www.PauseCaseResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.processmaker.www.PauseCaseResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.processmaker.www.PauseCaseResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.processmaker.www.UnpauseCaseResponse unpauseCase(com.processmaker.www.UnpauseCaseRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[39]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:unpauseCase");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "unpauseCase"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.processmaker.www.UnpauseCaseResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.processmaker.www.UnpauseCaseResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.processmaker.www.UnpauseCaseResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.processmaker.www.AddCaseNoteResponse addCaseNote(com.processmaker.www.AddCaseNoteRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[40]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:addCaseNote");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "addCaseNote"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.processmaker.www.AddCaseNoteResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.processmaker.www.AddCaseNoteResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.processmaker.www.AddCaseNoteResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

}
