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

package com.netbrasoft.gnuob.api.content;

import static com.netbrasoft.gnuob.api.generic.NetbrasoftApiConstants.CONTENT_DATA_PROVIDER_NAME;
import static com.netbrasoft.gnuob.api.generic.NetbrasoftApiConstants.CONTENT_WEB_SERVICE_REPOSITORY_NAME;
import static com.netbrasoft.gnuob.api.generic.NetbrasoftApiConstants.UNCHECKED_VALUE;

import javax.annotation.Resource;

import org.javasimon.aop.Monitored;
import org.springframework.stereotype.Controller;

import com.netbrasoft.gnuob.api.Content;
import com.netbrasoft.gnuob.api.generic.AbstractGenericTypeDataProvider;
import com.netbrasoft.gnuob.api.generic.IGenericTypeWebServiceRepository;

@Monitored
@Controller(CONTENT_DATA_PROVIDER_NAME)
public class ContentDataProvider<C extends Content> extends AbstractGenericTypeDataProvider<C> {

  private static final long serialVersionUID = -7147810111952342412L;

  @Resource(name = CONTENT_WEB_SERVICE_REPOSITORY_NAME)
  private transient IGenericTypeWebServiceRepository<C> contentWebServiceRepository;

  @SuppressWarnings(UNCHECKED_VALUE)
  public ContentDataProvider() {
    super((C) new Content());
  }

  @Override
  public IGenericTypeWebServiceRepository<C> getGenericTypeWebServiceRepository() {
    return contentWebServiceRepository;
  }
}
