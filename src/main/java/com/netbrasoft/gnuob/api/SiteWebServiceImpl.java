package com.netbrasoft.gnuob.api;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;

/**
 * This class was generated by Apache CXF 2.7.11
 * 2014-08-07T14:31:52.771+02:00
 * Generated source version: 2.7.11
 * 
 */
@WebService(targetNamespace = "http://gnuob.netbrasoft.com/", name = "SiteWebServiceImpl")
@XmlSeeAlso({ObjectFactory.class})
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
public interface SiteWebServiceImpl {

    @WebResult(name = "mergeSiteResponse", targetNamespace = "http://gnuob.netbrasoft.com/", partName = "parameters")
    @WebMethod
    public MergeSiteResponse mergeSite(
        @WebParam(partName = "parameters", name = "mergeSite", targetNamespace = "http://gnuob.netbrasoft.com/")
        MergeSite parameters,
        @WebParam(partName = "metaData", name = "metaData", targetNamespace = "http://gnuob.netbrasoft.com/", header = true)
        MetaData metaData
    ) throws GNUOpenBusinessServiceException_Exception;

    @WebResult(name = "removeSiteResponse", targetNamespace = "http://gnuob.netbrasoft.com/", partName = "result")
    @WebMethod
    public RemoveSiteResponse removeSite(
        @WebParam(partName = "parameters", name = "removeSite", targetNamespace = "http://gnuob.netbrasoft.com/")
        RemoveSite parameters,
        @WebParam(partName = "metaData", name = "metaData", targetNamespace = "http://gnuob.netbrasoft.com/", header = true)
        MetaData metaData
    ) throws GNUOpenBusinessServiceException_Exception;

    @WebResult(name = "findSiteByIdResponse", targetNamespace = "http://gnuob.netbrasoft.com/", partName = "parameters")
    @WebMethod
    public FindSiteByIdResponse findSiteById(
        @WebParam(partName = "parameters", name = "findSiteById", targetNamespace = "http://gnuob.netbrasoft.com/")
        FindSiteById parameters,
        @WebParam(partName = "metaData", name = "metaData", targetNamespace = "http://gnuob.netbrasoft.com/", header = true)
        MetaData metaData
    ) throws GNUOpenBusinessServiceException_Exception;

    @WebResult(name = "findSiteResponse", targetNamespace = "http://gnuob.netbrasoft.com/", partName = "parameters")
    @WebMethod
    public FindSiteResponse findSite(
        @WebParam(partName = "parameters", name = "findSite", targetNamespace = "http://gnuob.netbrasoft.com/")
        FindSite parameters,
        @WebParam(partName = "metaData", name = "metaData", targetNamespace = "http://gnuob.netbrasoft.com/", header = true)
        MetaData metaData
    ) throws GNUOpenBusinessServiceException_Exception;

    @WebResult(name = "refreshSiteResponse", targetNamespace = "http://gnuob.netbrasoft.com/", partName = "parameters")
    @WebMethod
    public RefreshSiteResponse refreshSite(
        @WebParam(partName = "parameters", name = "refreshSite", targetNamespace = "http://gnuob.netbrasoft.com/")
        RefreshSite parameters,
        @WebParam(partName = "metaData", name = "metaData", targetNamespace = "http://gnuob.netbrasoft.com/", header = true)
        MetaData metaData
    ) throws GNUOpenBusinessServiceException_Exception;

    @WebResult(name = "persistSiteResponse", targetNamespace = "http://gnuob.netbrasoft.com/", partName = "parameters")
    @WebMethod
    public PersistSiteResponse persistSite(
        @WebParam(partName = "parameters", name = "persistSite", targetNamespace = "http://gnuob.netbrasoft.com/")
        PersistSite parameters,
        @WebParam(partName = "metaData", name = "metaData", targetNamespace = "http://gnuob.netbrasoft.com/", header = true)
        MetaData metaData
    ) throws GNUOpenBusinessServiceException_Exception;

    @WebResult(name = "countSiteResponse", targetNamespace = "http://gnuob.netbrasoft.com/", partName = "parameters")
    @WebMethod
    public CountSiteResponse countSite(
        @WebParam(partName = "parameters", name = "countSite", targetNamespace = "http://gnuob.netbrasoft.com/")
        CountSite parameters,
        @WebParam(partName = "metaData", name = "metaData", targetNamespace = "http://gnuob.netbrasoft.com/", header = true)
        MetaData metaData
    ) throws GNUOpenBusinessServiceException_Exception;
}
