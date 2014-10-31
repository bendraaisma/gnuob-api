package com.netbrasoft.gnuob.api;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import javax.xml.ws.Service;

/**
 * This class was generated by Apache CXF 2.7.11 2014-11-01T18:53:47.986+01:00
 * Generated source version: 2.7.11
 * 
 */
@WebServiceClient(name = "CategoryWebServiceImplService", wsdlLocation = "http://localhost:8080/gnuob-soap/CategoryWebServiceImpl?wsdl", targetNamespace = "http://gnuob.netbrasoft.com/")
public class CategoryWebServiceImplService extends Service {

    public final static URL WSDL_LOCATION;

	public final static QName SERVICE = new QName("http://gnuob.netbrasoft.com/", "CategoryWebServiceImplService");
	public final static QName CategoryWebServiceImplPort = new QName("http://gnuob.netbrasoft.com/", "CategoryWebServiceImplPort");
	static {
		URL url = null;
		try {
			url = new URL(System.getProperty("gnuob.category.site", "http://localhost:8080/gnuob-soap/CategoryWebServiceImpl?wsdl"));
		} catch (MalformedURLException e) {
			java.util.logging.Logger.getLogger(CategoryWebServiceImplService.class.getName()).log(java.util.logging.Level.INFO, "Can not initialize the default wsdl from {0}", "http://localhost:8080/gnuob-soap/CategoryWebServiceImpl?wsdl");
		}
		WSDL_LOCATION = url;
	}

    public CategoryWebServiceImplService(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public CategoryWebServiceImplService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public CategoryWebServiceImplService() {
        super(WSDL_LOCATION, SERVICE);
    }

    // This constructor requires JAX-WS API 2.2. You will need to endorse the
    // 2.2
    // API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS
    // 2.1
    // compliant code instead.
    public CategoryWebServiceImplService(WebServiceFeature... features) {
        super(WSDL_LOCATION, SERVICE, features);
    }

    // This constructor requires JAX-WS API 2.2. You will need to endorse the
    // 2.2
    // API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS
    // 2.1
    // compliant code instead.
    public CategoryWebServiceImplService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, SERVICE, features);
    }

    // This constructor requires JAX-WS API 2.2. You will need to endorse the
    // 2.2
    // API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS
    // 2.1
    // compliant code instead.
    public CategoryWebServiceImplService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     *
     * @return returns CategoryWebServiceImpl
     */
    @WebEndpoint(name = "CategoryWebServiceImplPort")
    public CategoryWebServiceImpl getCategoryWebServiceImplPort() {
        return super.getPort(CategoryWebServiceImplPort, CategoryWebServiceImpl.class);
    }

    /**
     * 
     * @param features
     *            A list of {@link javax.xml.ws.WebServiceFeature} to configure
     *            on the proxy. Supported features not in the
     *            <code>features</code> parameter will have their default
     *            values.
     * @return returns CategoryWebServiceImpl
     */
    @WebEndpoint(name = "CategoryWebServiceImplPort")
    public CategoryWebServiceImpl getCategoryWebServiceImplPort(WebServiceFeature... features) {
        return super.getPort(CategoryWebServiceImplPort, CategoryWebServiceImpl.class, features);
    }

}
