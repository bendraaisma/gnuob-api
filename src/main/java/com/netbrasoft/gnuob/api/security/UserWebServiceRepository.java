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

package com.netbrasoft.gnuob.api.security;

import static com.netbrasoft.gnuob.api.generic.NetbrasoftApiConstants.UNCHECKED_VALUE;
import static com.netbrasoft.gnuob.api.generic.NetbrasoftApiConstants.USER_WEB_SERVICE_REPOSITORY_NAME;
import static com.netbrasoft.gnuob.api.security.UserWebServiceWrapperHelper.wrapToCountUser;
import static com.netbrasoft.gnuob.api.security.UserWebServiceWrapperHelper.wrapToFindUser;
import static com.netbrasoft.gnuob.api.security.UserWebServiceWrapperHelper.wrapToFindUserById;
import static com.netbrasoft.gnuob.api.security.UserWebServiceWrapperHelper.wrapToMergeUser;
import static com.netbrasoft.gnuob.api.security.UserWebServiceWrapperHelper.wrapToPersistUser;
import static com.netbrasoft.gnuob.api.security.UserWebServiceWrapperHelper.wrapToRefreshUser;
import static com.netbrasoft.gnuob.api.security.UserWebServiceWrapperHelper.wrapToRemoveUser;

import java.util.List;

import org.javasimon.aop.Monitored;
import org.springframework.stereotype.Repository;

import com.netbrasoft.gnuob.api.MetaData;
import com.netbrasoft.gnuob.api.OrderBy;
import com.netbrasoft.gnuob.api.Paging;
import com.netbrasoft.gnuob.api.User;
import com.netbrasoft.gnuob.api.UserWebServiceImpl;
import com.netbrasoft.gnuob.api.UserWebServiceImplService;
import com.netbrasoft.gnuob.api.generic.IGenericTypeWebServiceRepository;

@Monitored
@Repository(USER_WEB_SERVICE_REPOSITORY_NAME)
public class UserWebServiceRepository<U extends User> implements IGenericTypeWebServiceRepository<U> {

  private transient UserWebServiceImpl userWebServiceImpl;

  private UserWebServiceImpl getUserWebServiceImpl() {
    if (userWebServiceImpl == null) {
      userWebServiceImpl = new UserWebServiceImplService().getUserWebServiceImplPort();
    }
    return userWebServiceImpl;
  }

  @Override
  public long count(final MetaData credentials, final U userExample) {
    return getUserWebServiceImpl().countUser(wrapToCountUser(userExample), credentials).getReturn();
  }

  @SuppressWarnings(UNCHECKED_VALUE)
  @Override
  public List<U> find(final MetaData credentials, final U userExample, final Paging paging,
      final OrderBy orderingProperty) {
    return (List<U>) getUserWebServiceImpl()
        .findUser(wrapToFindUser(userExample, paging, orderingProperty), credentials).getReturn();
  }

  @SuppressWarnings(UNCHECKED_VALUE)
  @Override
  public U find(final MetaData credentials, final U userExample) {
    return (U) getUserWebServiceImpl().findUserById(wrapToFindUserById(userExample), credentials).getReturn();
  }

  @SuppressWarnings(UNCHECKED_VALUE)
  @Override
  public U persist(final MetaData credentials, final U user) {
    return (U) getUserWebServiceImpl().persistUser(wrapToPersistUser(user), credentials).getReturn();
  }

  @SuppressWarnings(UNCHECKED_VALUE)
  @Override
  public U merge(final MetaData credentials, final U user) {
    return (U) getUserWebServiceImpl().mergeUser(wrapToMergeUser(user), credentials).getReturn();
  }

  @SuppressWarnings(UNCHECKED_VALUE)
  @Override
  public U refresh(final MetaData credentials, final U user) {
    return (U) getUserWebServiceImpl().refreshUser(wrapToRefreshUser(user), credentials).getReturn();
  }

  @Override
  public void remove(final MetaData credentials, final U user) {
    getUserWebServiceImpl().removeUser(wrapToRemoveUser(user), credentials);
  }
}
