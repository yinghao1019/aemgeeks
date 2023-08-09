package com.aem.geeks.core.models;

import java.util.ArrayList;
import java.util.List;
import javax.inject.Inject;
import jdk.internal.org.jline.utils.Log;
import lombok.Getter;
import org.apache.commons.lang3.StringUtils;
import org.apache.sling.api.SlingHttpServletRequest;
import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.injectorspecific.ValueMapValue;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Model(adaptables = SlingHttpServletRequest.class,
    defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL,
    resourceType = {CompanyModel.RESOURCE_TYPE}
)
@Getter
public class CompanyModel {

  private static final Logger LOG = LoggerFactory.getLogger(CompanyModel.class);
  protected static final String RESOURCE_TYPE = "aemgeeks/components/content/company";
  @ValueMapValue
  private String name;
  @ValueMapValue
  private String description;
  @Inject
  Resource resource;

//  public String getEmployeeNames() {
//
//    Resource employees = resource.getChild("employees");
//    List<String> employeeNameList = new ArrayList<>();
//
//    try {
//      if (employees != null) {
//        for (Resource employee : employees.getChildren()) {
//          String employeeName = employee.getValueMap().get("name", String.class);
//          if (StringUtils.isNotEmpty(employeeName)) {
//            employeeNameList.add(employeeName);
//          }
//        }
//      }
//    } catch (Exception e) {
//      Log.error("Company Model error:", e);
//    }
//
//    return String.join(",", employeeNameList);
//  }
}