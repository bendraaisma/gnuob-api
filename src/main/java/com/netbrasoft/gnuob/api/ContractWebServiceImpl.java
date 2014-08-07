package com.netbrasoft.gnuob.api;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;

/**
 * This class was generated by Apache CXF 2.7.11
 * 2014-08-07T21:04:48.179+02:00
 * Generated source version: 2.7.11
 * 
 */
@WebService(targetNamespace = "http://gnuob.netbrasoft.com/", name = "ContractWebServiceImpl")
@XmlSeeAlso({ObjectFactory.class})
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
public interface ContractWebServiceImpl {

    @WebResult(name = "findContractResponse", targetNamespace = "http://gnuob.netbrasoft.com/", partName = "parameters")
    @WebMethod
    public FindContractResponse findContract(
        @WebParam(partName = "parameters", name = "findContract", targetNamespace = "http://gnuob.netbrasoft.com/")
        FindContract parameters,
        @WebParam(partName = "metaData", name = "metaData", targetNamespace = "http://gnuob.netbrasoft.com/", header = true)
        MetaData metaData
    ) throws GNUOpenBusinessServiceException_Exception;

    @WebResult(name = "mergeContractResponse", targetNamespace = "http://gnuob.netbrasoft.com/", partName = "parameters")
    @WebMethod
    public MergeContractResponse mergeContract(
        @WebParam(partName = "parameters", name = "mergeContract", targetNamespace = "http://gnuob.netbrasoft.com/")
        MergeContract parameters,
        @WebParam(partName = "metaData", name = "metaData", targetNamespace = "http://gnuob.netbrasoft.com/", header = true)
        MetaData metaData
    ) throws GNUOpenBusinessServiceException_Exception;

    @WebResult(name = "refreshContractResponse", targetNamespace = "http://gnuob.netbrasoft.com/", partName = "parameters")
    @WebMethod
    public RefreshContractResponse refreshContract(
        @WebParam(partName = "parameters", name = "refreshContract", targetNamespace = "http://gnuob.netbrasoft.com/")
        RefreshContract parameters,
        @WebParam(partName = "metaData", name = "metaData", targetNamespace = "http://gnuob.netbrasoft.com/", header = true)
        MetaData metaData
    ) throws GNUOpenBusinessServiceException_Exception;

    @WebResult(name = "removeContractResponse", targetNamespace = "http://gnuob.netbrasoft.com/", partName = "result")
    @WebMethod
    public RemoveContractResponse removeContract(
        @WebParam(partName = "parameters", name = "removeContract", targetNamespace = "http://gnuob.netbrasoft.com/")
        RemoveContract parameters,
        @WebParam(partName = "metaData", name = "metaData", targetNamespace = "http://gnuob.netbrasoft.com/", header = true)
        MetaData metaData
    ) throws GNUOpenBusinessServiceException_Exception;

    @WebResult(name = "countContractResponse", targetNamespace = "http://gnuob.netbrasoft.com/", partName = "parameters")
    @WebMethod
    public CountContractResponse countContract(
        @WebParam(partName = "parameters", name = "countContract", targetNamespace = "http://gnuob.netbrasoft.com/")
        CountContract parameters,
        @WebParam(partName = "metaData", name = "metaData", targetNamespace = "http://gnuob.netbrasoft.com/", header = true)
        MetaData metaData
    ) throws GNUOpenBusinessServiceException_Exception;

    @WebResult(name = "findContractByIdResponse", targetNamespace = "http://gnuob.netbrasoft.com/", partName = "parameters")
    @WebMethod
    public FindContractByIdResponse findContractById(
        @WebParam(partName = "parameters", name = "findContractById", targetNamespace = "http://gnuob.netbrasoft.com/")
        FindContractById parameters,
        @WebParam(partName = "metaData", name = "metaData", targetNamespace = "http://gnuob.netbrasoft.com/", header = true)
        MetaData metaData
    ) throws GNUOpenBusinessServiceException_Exception;

    @WebResult(name = "persistContractResponse", targetNamespace = "http://gnuob.netbrasoft.com/", partName = "parameters")
    @WebMethod
    public PersistContractResponse persistContract(
        @WebParam(partName = "parameters", name = "persistContract", targetNamespace = "http://gnuob.netbrasoft.com/")
        PersistContract parameters,
        @WebParam(partName = "metaData", name = "metaData", targetNamespace = "http://gnuob.netbrasoft.com/", header = true)
        MetaData metaData
    ) throws GNUOpenBusinessServiceException_Exception;
}
