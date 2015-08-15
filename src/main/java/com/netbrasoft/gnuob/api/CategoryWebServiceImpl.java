package com.netbrasoft.gnuob.api;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;

/**
 * This class was generated by Apache CXF 3.0.5
 * 2015-08-15T14:37:00.313+02:00
 * Generated source version: 3.0.5
 * 
 */
@WebService(targetNamespace = "http://gnuob.netbrasoft.com/", name = "CategoryWebServiceImpl")
@XmlSeeAlso({ObjectFactory.class})
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
public interface CategoryWebServiceImpl {

    @WebMethod
    @WebResult(name = "refreshCategoryResponse", targetNamespace = "http://gnuob.netbrasoft.com/", partName = "parameters")
    public RefreshCategoryResponse refreshCategory(
        @WebParam(partName = "parameters", name = "refreshCategory", targetNamespace = "http://gnuob.netbrasoft.com/")
        RefreshCategory parameters,
        @WebParam(partName = "metaData", name = "metaData", targetNamespace = "http://gnuob.netbrasoft.com/", header = true)
        MetaData metaData
    );

    @WebMethod
    @WebResult(name = "mergeCategoryResponse", targetNamespace = "http://gnuob.netbrasoft.com/", partName = "parameters")
    public MergeCategoryResponse mergeCategory(
        @WebParam(partName = "parameters", name = "mergeCategory", targetNamespace = "http://gnuob.netbrasoft.com/")
        MergeCategory parameters,
        @WebParam(partName = "metaData", name = "metaData", targetNamespace = "http://gnuob.netbrasoft.com/", header = true)
        MetaData metaData
    );

    @WebMethod
    @WebResult(name = "countCategoryResponse", targetNamespace = "http://gnuob.netbrasoft.com/", partName = "parameters")
    public CountCategoryResponse countCategory(
        @WebParam(partName = "parameters", name = "countCategory", targetNamespace = "http://gnuob.netbrasoft.com/")
        CountCategory parameters,
        @WebParam(partName = "metaData", name = "metaData", targetNamespace = "http://gnuob.netbrasoft.com/", header = true)
        MetaData metaData
    );

    @WebMethod
    @WebResult(name = "findCategoryByIdResponse", targetNamespace = "http://gnuob.netbrasoft.com/", partName = "parameters")
    public FindCategoryByIdResponse findCategoryById(
        @WebParam(partName = "parameters", name = "findCategoryById", targetNamespace = "http://gnuob.netbrasoft.com/")
        FindCategoryById parameters,
        @WebParam(partName = "metaData", name = "metaData", targetNamespace = "http://gnuob.netbrasoft.com/", header = true)
        MetaData metaData
    );

    @WebMethod
    @WebResult(name = "findCategoryResponse", targetNamespace = "http://gnuob.netbrasoft.com/", partName = "parameters")
    public FindCategoryResponse findCategory(
        @WebParam(partName = "parameters", name = "findCategory", targetNamespace = "http://gnuob.netbrasoft.com/")
        FindCategory parameters,
        @WebParam(partName = "metaData", name = "metaData", targetNamespace = "http://gnuob.netbrasoft.com/", header = true)
        MetaData metaData
    );

    @WebMethod
    @WebResult(name = "removeCategoryResponse", targetNamespace = "http://gnuob.netbrasoft.com/", partName = "result")
    public RemoveCategoryResponse removeCategory(
        @WebParam(partName = "parameters", name = "removeCategory", targetNamespace = "http://gnuob.netbrasoft.com/")
        RemoveCategory parameters,
        @WebParam(partName = "metaData", name = "metaData", targetNamespace = "http://gnuob.netbrasoft.com/", header = true)
        MetaData metaData
    );

    @WebMethod
    @WebResult(name = "persistCategoryResponse", targetNamespace = "http://gnuob.netbrasoft.com/", partName = "parameters")
    public PersistCategoryResponse persistCategory(
        @WebParam(partName = "parameters", name = "persistCategory", targetNamespace = "http://gnuob.netbrasoft.com/")
        PersistCategory parameters,
        @WebParam(partName = "metaData", name = "metaData", targetNamespace = "http://gnuob.netbrasoft.com/", header = true)
        MetaData metaData
    );
}
