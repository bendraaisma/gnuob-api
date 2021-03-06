/*
 * Copyright 2016 Netbrasoft
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied. See the License for the specific language governing permissions and limitations under
 * the License.
 */

package br.com.netbrasoft.gnuob.api.generic;

import static br.com.netbrasoft.gnuob.api.OrderBy.NONE;
import static br.com.netbrasoft.gnuob.api.generic.NetbrasoftApiConstants.NONE_PROPERTY;
import static org.apache.wicket.extensions.markup.html.repeater.data.sort.SortOrder.ASCENDING;

import java.util.Iterator;

import javax.xml.ws.soap.SOAPFaultException;

import org.apache.wicket.extensions.markup.html.repeater.util.SortableDataProvider;
import org.apache.wicket.model.IModel;

import br.com.netbrasoft.gnuob.api.AbstractType;
import br.com.netbrasoft.gnuob.api.MetaData;
import br.com.netbrasoft.gnuob.api.OrderBy;
import br.com.netbrasoft.gnuob.api.Paging;

public abstract class AbstractGenericTypeDataProvider<T extends AbstractType> extends SortableDataProvider<T, String>
    implements IGenericTypeDataProvider<T> {

  private static final long serialVersionUID = -7323826275199384990L;

  private T type;
  private OrderBy orderingProperty;
  private MetaData credentials;
  private long itemsPerPage;
  private long currentPage;

  public AbstractGenericTypeDataProvider(final T type) {
    setType(type);
    setOrderingProperty(NONE);
    setCredentials(new MetaData());
    setSort(NONE_PROPERTY, ASCENDING);
  }

  public abstract IGenericTypeWebServiceRepository<T> getGenericTypeWebServiceRepository();

  @Override
  public long size() {
    try {
      return getGenericTypeWebServiceRepository().count(credentials, type);
    } catch (final SOAPFaultException e) {
      throw new GNUOpenBusinessApplicationException(e.getMessage(), e);
    }
  }

  @Override
  public Iterator<T> iterator(final long first, final long max) {
    try {
      return getGenericTypeWebServiceRepository()
          .find(credentials, type, getPagingProperty(first, max), getOrderingProperty()).iterator();
    } catch (final SOAPFaultException e) {
      throw new GNUOpenBusinessApplicationException(e.getMessage(), e);
    }
  }

  private Paging getPagingProperty(final long first, final long max) {
    final Paging paramPaging = new Paging();
    paramPaging.setFirst((int) first);
    paramPaging.setMax((int) max);
    return paramPaging;
  }

  private OrderBy getOrderingProperty() {
    return OrderByFactory.getOrderBy(getSort(), orderingProperty);
  }

  @Override
  public T findById(final T objectType) {
    try {
      return getGenericTypeWebServiceRepository().find(credentials, objectType);
    } catch (final SOAPFaultException e) {
      throw new GNUOpenBusinessApplicationException(e.getMessage(), e);
    }
  }

  @Override
  public T persist(final T objectType) {
    try {
      return getGenericTypeWebServiceRepository().persist(credentials, objectType);
    } catch (final SOAPFaultException e) {
      throw new GNUOpenBusinessApplicationException(e.getMessage(), e);
    }
  }

  @Override
  public T merge(final T objectType) {
    try {
      return getGenericTypeWebServiceRepository().merge(credentials, objectType);
    } catch (final SOAPFaultException e) {
      throw new GNUOpenBusinessApplicationException(e.getMessage(), e);
    }
  }

  @Override
  public T refresh(final T objectType) {
    try {
      return getGenericTypeWebServiceRepository().refresh(credentials, objectType);
    } catch (final SOAPFaultException e) {
      throw new GNUOpenBusinessApplicationException(e.getMessage(), e);
    }
  }

  @Override
  public void remove(final T objectType) {
    try {
      getGenericTypeWebServiceRepository().remove(credentials, objectType);
    } catch (final SOAPFaultException e) {
      throw new GNUOpenBusinessApplicationException(e.getMessage(), e);
    }
  }

  @Override
  public void setOrderBy(final OrderBy orderingProperty) {
    this.orderingProperty = orderingProperty;
  }

  @Override
  public T getType() {
    return this.type;
  }

  @Override
  public void setType(final T type) {
    this.type = type;
  }


  public MetaData getCredentials() {
    return credentials;
  }

  @Override
  public void setUser(final String userName) {
    this.credentials.setUser(userName);
  }

  @Override
  public void setPassword(final String userPassword) {
    this.credentials.setPassword(userPassword);
  }

  @Override
  public void setSite(final String userSite) {
    this.credentials.setSite(userSite);
  }

  @Override
  public IModel<T> model(final T objectType) {
    return new GenericTypeLoadableDetachableModel<>(objectType);
  }

  @Override
  public void detach() {
    return;
  }

  @Override
  public long getItemsPerPage() {
    return itemsPerPage;
  }

  @Override
  public void setItemsPerPage(long itemsPerPage) {
    this.itemsPerPage = itemsPerPage;
  }

  @Override
  public long getCurrentPage() {
    return currentPage;
  }

  @Override
  public void setCurrentPage(long currentPage) {
    this.currentPage = currentPage;
  }

  @Override
  public long getItemCount() {
    return size();
  }

  @Override
  public long getPageCount() {
    return getItemsPerPage();
  }

  public void setOrderingProperty(OrderBy orderingProperty) {
    this.orderingProperty = orderingProperty;
  }

  public void setCredentials(MetaData credentials) {
    this.credentials = credentials;
  }
}
