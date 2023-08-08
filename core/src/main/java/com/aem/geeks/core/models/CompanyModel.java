package com.aem.geeks.core.models;

import java.util.List;
import lombok.Getter;
import org.apache.sling.api.SlingHttpServletRequest;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.injectorspecific.ValueMapValue;

@Model(adaptables = SlingHttpServletRequest.class,
    defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL,
    resourceType = {CompanyModel.RESOURCE_TYPE}
)
@Getter
public class CompanyModel {

  protected static final String RESOURCE_TYPE = "aemgeeks/components/content/company";
  @ValueMapValue
  private String name;
  @ValueMapValue
  private String description;
  @ValueMapValue
  private List<String> employees;
}
