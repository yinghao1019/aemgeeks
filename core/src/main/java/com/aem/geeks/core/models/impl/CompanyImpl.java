package com.aem.geeks.core.models.impl;

import java.util.List;
import lombok.Getter;
import org.apache.sling.api.SlingHttpServletRequest;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.injectorspecific.ValueMapValue;

@Model(adaptables = SlingHttpServletRequest.class,
    resourceType = AuthorImpl.RESOURCE_TYPE,
    defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL
)
@Getter
public class CompanyImpl {

  @ValueMapValue
  private String name;
  @ValueMapValue
  private String description;
  @ValueMapValue
  private List<String> employees;
}
