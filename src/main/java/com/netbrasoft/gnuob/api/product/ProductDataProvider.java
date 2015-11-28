package com.netbrasoft.gnuob.api.product;

import javax.annotation.Resource;

import org.javasimon.aop.Monitored;
import org.springframework.stereotype.Controller;

import com.netbrasoft.gnuob.api.Product;
import com.netbrasoft.gnuob.api.generic.AbstractGenericTypeDataProvider;
import com.netbrasoft.gnuob.api.generic.GenericTypeWebServiceRepository;

@Monitored
@Controller(ProductDataProvider.PRODUCT_DATA_PROVIDER_NAME)
public class ProductDataProvider<P extends Product> extends AbstractGenericTypeDataProvider<P> {

  private static final long serialVersionUID = -8167982674192813819L;

  public static final String PRODUCT_DATA_PROVIDER_NAME = "ProductDataProvider";

  @Resource(name = ProductWebServiceRepository.PRODUCT_WEB_SERVICE_REPOSITORY_NAME)
  private transient GenericTypeWebServiceRepository<P> productWebServiceRepository;

  @SuppressWarnings("unchecked")
  public ProductDataProvider() {
    super((P) new Product());
  }

  @Override
  public GenericTypeWebServiceRepository<P> getGenericTypeWebServiceRepository() {
    return productWebServiceRepository;
  }
}
