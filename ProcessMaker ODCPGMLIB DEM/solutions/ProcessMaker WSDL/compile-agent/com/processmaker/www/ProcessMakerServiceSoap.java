/**
 * ProcessMakerServiceSoap.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Nov 19, 2006 (02:31:34 GMT+00:00) WSDL2Java emitter.
 */

package com.processmaker.www;

public interface ProcessMakerServiceSoap extends java.rmi.Remote {
    public com.processmaker.www.LoginResponse login(com.processmaker.www.Login parameters) throws java.rmi.RemoteException;
    public com.processmaker.www.ProcessListStruct[] processList(com.processmaker.www.ProcessListRequest parameters) throws java.rmi.RemoteException;
    public com.processmaker.www.RoleListStruct[] roleList(com.processmaker.www.RoleListRequest parameters) throws java.rmi.RemoteException;
    public com.processmaker.www.GroupListStruct[] groupList(com.processmaker.www.GroupListRequest parameters) throws java.rmi.RemoteException;
    public com.processmaker.www.DepartmentListStruct[] departmentList(com.processmaker.www.DepartmentListRequest parameters) throws java.rmi.RemoteException;
    public com.processmaker.www.UserListStruct[] userList(com.processmaker.www.UserListRequest parameters) throws java.rmi.RemoteException;
    public com.processmaker.www.CaseListStruct[] caseList(com.processmaker.www.CaseListRequest parameters) throws java.rmi.RemoteException;
    public com.processmaker.www.UnassignedCaseListStruct[] unassignedCaseList(com.processmaker.www.UnassignedCaseListRequest parameters) throws java.rmi.RemoteException;
    public com.processmaker.www.CreateUserResponse createUser(com.processmaker.www.CreateUserRequest parameters) throws java.rmi.RemoteException;
    public com.processmaker.www.UpdateUserResponse updateUser(com.processmaker.www.UpdateUserRequest parameters) throws java.rmi.RemoteException;
    public com.processmaker.www.InformationUserResponse informationUser(com.processmaker.www.InformationUserRequest parameters) throws java.rmi.RemoteException;
    public com.processmaker.www.CreateGroupResponse createGroup(com.processmaker.www.CreateGroupRequest parameters) throws java.rmi.RemoteException;
    public com.processmaker.www.CreateDepartmentResponse createDepartment(com.processmaker.www.CreateDepartmentRequest parameters) throws java.rmi.RemoteException;
    public com.processmaker.www.PmResponse assignUserToGroup(com.processmaker.www.AssignUserToGroupRequest parameters) throws java.rmi.RemoteException;
    public com.processmaker.www.PmResponse assignUserToDepartment(com.processmaker.www.AssignUserToDepartmentRequest parameters) throws java.rmi.RemoteException;
    public com.processmaker.www.NewCaseResponse newCase(com.processmaker.www.NewCaseRequest parameters) throws java.rmi.RemoteException;
    public com.processmaker.www.PmResponse reassignCase(com.processmaker.www.ReassignCaseRequest parameters) throws java.rmi.RemoteException;
    public com.processmaker.www.NewCaseImpersonateResponse newCaseImpersonate(com.processmaker.www.NewCaseImpersonateRequest parameters) throws java.rmi.RemoteException;
    public com.processmaker.www.RouteCaseResponse routeCase(com.processmaker.www.RouteCaseRequest parameters) throws java.rmi.RemoteException;
    public com.processmaker.www.PmResponse executeTrigger(com.processmaker.www.ExecuteTriggerRequest parameters) throws java.rmi.RemoteException;
    public com.processmaker.www.PmResponse sendVariables(com.processmaker.www.SendVariablesRequest parameters) throws java.rmi.RemoteException;
    public com.processmaker.www.GetVariablesResponse getVariables(com.processmaker.www.GetVariablesRequest parameters) throws java.rmi.RemoteException;
    public com.processmaker.www.GetVariablesNamesResponse getVariablesNames(com.processmaker.www.GetVariablesNamesRequest parameters) throws java.rmi.RemoteException;
    public com.processmaker.www.PmResponse sendMessage(com.processmaker.www.SendMessageRequest parameters) throws java.rmi.RemoteException;
    public com.processmaker.www.GetCaseInfoResponse getCaseInfo(com.processmaker.www.GetCaseInfoRequest parameters) throws java.rmi.RemoteException;
    public com.processmaker.www.TaskListStruct[] taskList(com.processmaker.www.TaskListRequest parameters) throws java.rmi.RemoteException;
    public com.processmaker.www.TaskCaseStruct[] taskCase(com.processmaker.www.TaskCaseRequest parameters) throws java.rmi.RemoteException;
    public com.processmaker.www.SystemInformationResponse systemInformation(com.processmaker.www.SystemInformationRequest parameters) throws java.rmi.RemoteException;
    public com.processmaker.www.TriggerListStruct[] triggerList(com.processmaker.www.TriggerListRequest parameters) throws java.rmi.RemoteException;
    public com.processmaker.www.OutputDocumentListStruct[] outputDocumentList(com.processmaker.www.OutputDocumentListRequest parameters) throws java.rmi.RemoteException;
    public com.processmaker.www.InputDocumentListStruct[] inputDocumentList(com.processmaker.www.InputDocumentListRequest parameters) throws java.rmi.RemoteException;
    public com.processmaker.www.InputDocumentProcessListStruct[] inputDocumentProcessList(com.processmaker.www.InputDocumentProcessListRequest parameters) throws java.rmi.RemoteException;
    public com.processmaker.www.RemoveDocumentResponse removeDocument(com.processmaker.www.RemoveDocumentRequest parameters) throws java.rmi.RemoteException;
    public com.processmaker.www.ImportProcessFromLibraryResponse importProcessFromLibrary(com.processmaker.www.ImportProcessFromLibraryRequest parameters) throws java.rmi.RemoteException;
    public com.processmaker.www.GetCaseNotesResponse getCaseNotes(com.processmaker.www.GetCaseNotesRequest parameters) throws java.rmi.RemoteException;
    public com.processmaker.www.PmResponse removeUserFromGroup(com.processmaker.www.RemoveUserFromGroupRequest parameters) throws java.rmi.RemoteException;
    public com.processmaker.www.DeleteCaseResponse deleteCase(com.processmaker.www.DeleteCaseRequest parameters) throws java.rmi.RemoteException;
    public com.processmaker.www.CancelCaseResponse cancelCase(com.processmaker.www.CancelCaseRequest parameters) throws java.rmi.RemoteException;
    public com.processmaker.www.PauseCaseResponse pauseCase(com.processmaker.www.PauseCaseRequest parameters) throws java.rmi.RemoteException;
    public com.processmaker.www.UnpauseCaseResponse unpauseCase(com.processmaker.www.UnpauseCaseRequest parameters) throws java.rmi.RemoteException;
    public com.processmaker.www.AddCaseNoteResponse addCaseNote(com.processmaker.www.AddCaseNoteRequest parameters) throws java.rmi.RemoteException;
}
