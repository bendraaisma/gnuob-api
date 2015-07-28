package com.netbrasoft.gnuob.api;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;

/**
 * This class was generated by Apache CXF 3.0.5
 * 2015-07-28T13:47:52.631+02:00
 * Generated source version: 3.0.5
 * 
 */
@WebService(targetNamespace = "http://gnuob.netbrasoft.com/", name = "ProductWebServiceImpl")
@XmlSeeAlso({ObjectFactory.class})
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
public interface ProductWebServiceImpl {

    @WebResult(name = "refreshProductResponse", targetNamespace = "http://gnuob.netbrasoft.com/", partName = "parameters")
    @WebMethod
    public RefreshProductResponse refreshProduct(
        @WebParam(partName = "parameters", name = "refreshProduct", targetNamespace = "http://gnuob.netbrasoft.com/")
        RefreshProduct parameters,
        @WebParam(partName = "metaData", name = "metaData", targetNamespace = "http://gnuob.netbrasoft.com/", header = true)
        MetaData metaData
    );

    @WebResult(name = "findProductResponse", targetNamespace = "http://gnuob.netbrasoft.com/", partName = "parameters")
    @WebMethod
    public FindProductResponse findProduct(
        @WebParam(partName = "parameters", name = "findProduct", targetNamespace = "http://gnuob.netbrasoft.com/")
        FindProduct parameters,
        @WebParam(partName = "metaData", name = "metaData", targetNamespace = "http://gnuob.netbrasoft.com/", header = true)
        MetaData metaData
    );

    @WebResult(name = "persistProductResponse", targetNamespace = "http://gnuob.netbrasoft.com/", partName = "parameters")
    @WebMethod
    public PersistProductResponse persistProduct(
        @WebParam(partName = "parameters", name = "persistProduct", targetNamespace = "http://gnuob.netbrasoft.com/")
        PersistProduct parameters,
        @WebParam(partName = "metaData", name = "metaData", targetNamespace = "http://gnuob.netbrasoft.com/", header = true)
        MetaData metaData
    );

    @WebResult(name = "findProductByIdResponse", targetNamespace = "http://gnuob.netbrasoft.com/", partName = "parameters")
    @WebMethod
    public FindProductByIdResponse findProductById(
        @WebParam(partName = "parameters", name = "findProductById", targetNamespace = "http://gnuob.netbrasoft.com/")
        FindProductById parameters,
        @WebParam(partName = "metaData", name = "metaData", targetNamespace = "http://gnuob.netbrasoft.com/", header = true)
        MetaData metaData
    );

    @WebResult(name = "mergeProductResponse", targetNamespace = "http://gnuob.netbrasoft.com/", partName = "parameters")
    @WebMethod
    public MergeProductResponse mergeProduct(
        @WebParam(partName = "parameters", name = "mergeProduct", targetNamespace = "http://gnuob.netbrasoft.com/")
        MergeProduct parameters,
        @WebParam(partName = "metaData", name = "metaData", targetNamespace = "http://gnuob.netbrasoft.com/", header = true)
        MetaData metaData
    );

    @WebResult(name = "removeProductResponse", targetNamespace = "http://gnuob.netbrasoft.com/", partName = "result")
    @WebMethod
    public RemoveProductResponse removeProduct(
        @WebParam(partName = "parameters", name = "removeProduct", targetNamespace = "http://gnuob.netbrasoft.com/")
        RemoveProduct parameters,
        @WebParam(partName = "metaData", name = "metaData", targetNamespace = "http://gnuob.netbrasoft.com/", header = true)
        MetaData metaData
    );

    @WebResult(name = "countProductResponse", targetNamespace = "http://gnuob.netbrasoft.com/", partName = "parameters")
    @WebMethod
    public CountProductResponse countProduct(
        @WebParam(partName = "parameters", name = "countProduct", targetNamespace = "http://gnuob.netbrasoft.com/")
        CountProduct parameters,
        @WebParam(partName = "metaData", name = "metaData", targetNamespace = "http://gnuob.netbrasoft.com/", header = true)
        MetaData metaData
    );
}
