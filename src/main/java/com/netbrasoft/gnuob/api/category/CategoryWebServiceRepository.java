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

package com.netbrasoft.gnuob.api.category;

import static com.netbrasoft.gnuob.api.category.CategoryWebServiceWrapperHelper.wrapToCountCategory;
import static com.netbrasoft.gnuob.api.category.CategoryWebServiceWrapperHelper.wrapToFindCategory;
import static com.netbrasoft.gnuob.api.category.CategoryWebServiceWrapperHelper.wrapToFindCategoryById;
import static com.netbrasoft.gnuob.api.category.CategoryWebServiceWrapperHelper.wrapToMergeCategory;
import static com.netbrasoft.gnuob.api.category.CategoryWebServiceWrapperHelper.wrapToPersistCategory;
import static com.netbrasoft.gnuob.api.category.CategoryWebServiceWrapperHelper.wrapToRefreshCategory;
import static com.netbrasoft.gnuob.api.category.CategoryWebServiceWrapperHelper.wrapToRemoveCategory;
import static com.netbrasoft.gnuob.api.generic.NetbrasoftApiConstants.CATEGORY_WEB_SERVICE_REPOSITORY_NAME;
import static com.netbrasoft.gnuob.api.generic.NetbrasoftApiConstants.UNCHECKED_VALUE;

import java.util.List;

import org.javasimon.aop.Monitored;
import org.springframework.stereotype.Repository;

import com.netbrasoft.gnuob.api.Category;
import com.netbrasoft.gnuob.api.CategoryWebServiceImpl;
import com.netbrasoft.gnuob.api.CategoryWebServiceImplService;
import com.netbrasoft.gnuob.api.MetaData;
import com.netbrasoft.gnuob.api.OrderBy;
import com.netbrasoft.gnuob.api.Paging;
import com.netbrasoft.gnuob.api.generic.IGenericTypeWebServiceRepository;

@Monitored
@Repository(CATEGORY_WEB_SERVICE_REPOSITORY_NAME)
public class CategoryWebServiceRepository<C extends Category> implements IGenericTypeWebServiceRepository<C> {

  private transient CategoryWebServiceImpl categoryWebServiceImpl = null;

  private CategoryWebServiceImpl getCategoryWebServiceImpl() {
    if (categoryWebServiceImpl == null) {
      categoryWebServiceImpl = new CategoryWebServiceImplService().getCategoryWebServiceImplPort();
    }
    return categoryWebServiceImpl;
  }

  @Override
  public long count(final MetaData credentials, final C categoryExample) {
    return getCategoryWebServiceImpl().countCategory(wrapToCountCategory(categoryExample), credentials).getReturn();
  }

  @Override
  @SuppressWarnings(UNCHECKED_VALUE)
  public List<C> find(final MetaData credentials, final C categoryExample, final Paging paging,
      final OrderBy orderingProperty) {
    return (List<C>) getCategoryWebServiceImpl()
        .findCategory(wrapToFindCategory(categoryExample, paging, orderingProperty), credentials).getReturn();
  }

  @Override
  @SuppressWarnings(UNCHECKED_VALUE)
  public C find(final MetaData credentials, final C categoryExample) {
    return (C) getCategoryWebServiceImpl().findCategoryById(wrapToFindCategoryById(categoryExample), credentials)
        .getReturn();
  }

  @Override
  @SuppressWarnings(UNCHECKED_VALUE)
  public C persist(final MetaData credentials, final C category) {
    return (C) getCategoryWebServiceImpl().persistCategory(wrapToPersistCategory(category), credentials).getReturn();
  }

  @Override
  @SuppressWarnings(UNCHECKED_VALUE)
  public C merge(final MetaData credentials, final C category) {
    return (C) getCategoryWebServiceImpl().mergeCategory(wrapToMergeCategory(category), credentials).getReturn();
  }

  @Override
  @SuppressWarnings(UNCHECKED_VALUE)
  public C refresh(final MetaData credentials, final C category) {
    return (C) getCategoryWebServiceImpl().refreshCategory(wrapToRefreshCategory(category), credentials).getReturn();
  }

  @Override
  public void remove(final MetaData credentials, final C category) {
    getCategoryWebServiceImpl().removeCategory(wrapToRemoveCategory(category), credentials);
  }
}
