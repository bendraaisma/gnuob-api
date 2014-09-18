package com.netbrasoft.gnuob.api;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import javax.xml.ws.Service;

/**
 * This class was generated by Apache CXF 2.7.11
 * 2014-08-31T16:53:22.270+02:00
 * Generated source version: 2.7.11
 * 
 */
@WebServiceClient(name = "SiteWebServiceImplService", 
                  wsdlLocation = "http://localhost:8080/gnuob-soap/SiteWebServiceImpl?wsdl",
                  targetNamespace = "http://gnuob.netbrasoft.com/") 
public class SiteWebServiceImplService extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("http://gnuob.netbrasoft.com/", "SiteWebServiceImplService");
    public final static QName SiteWebServiceImplPort = new QName("http://gnuob.netbrasoft.com/", "SiteWebServiceImplPort");
    static {
        URL url = null;
        try {
            url = new URL("http://localhost:8080/gnuob-soap/SiteWebServiceImpl?wsdl");
        } catch (MalformedURLException e) {
            java.util.logging.Logger.getLogger(SiteWebServiceImplService.class.getName())
                .log(java.util.logging.Level.INFO, 
                     "Can not initialize the default wsdl from {0}", "http://localhost:8080/gnuob-soap/SiteWebServiceImpl?wsdl");
        }
        WSDL_LOCATION = url;
    }

    public SiteWebServiceImplService(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public SiteWebServiceImplService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public SiteWebServiceImplService() {
        super(WSDL_LOCATION, SERVICE);
    }
    
    //This constructor requires JAX-WS API 2.2. You will need to endorse the 2.2
    //API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS 2.1
    //compliant code instead.
    public SiteWebServiceImplService(WebServiceFeature ... features) {
        super(WSDL_LOCATION, SERVICE, features);
    }

    //This constructor requires JAX-WS API 2.2. You will need to endorse the 2.2
    //API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS 2.1
    //compliant code instead.
    public SiteWebServiceImplService(URL wsdlLocation, WebServiceFeature ... features) {
        super(wsdlLocation, SERVICE, features);
    }

    //This constructor requires JAX-WS API 2.2. You will need to endorse the 2.2
    //API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS 2.1
    //compliant code instead.
    public SiteWebServiceImplService(URL wsdlLocation, QName serviceName, WebServiceFeature ... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     *
     * @return
     *     returns SiteWebServiceImpl
     */
    @WebEndpoint(name = "SiteWebServiceImplPort")
    public SiteWebServiceImpl getSiteWebServiceImplPort() {
        return super.getPort(SiteWebServiceImplPort, SiteWebServiceImpl.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns SiteWebServiceImpl
     */
    @WebEndpoint(name = "SiteWebServiceImplPort")
    public SiteWebServiceImpl getSiteWebServiceImplPort(WebServiceFeature... features) {
        return super.getPort(SiteWebServiceImplPort, SiteWebServiceImpl.class, features);
    }

}
