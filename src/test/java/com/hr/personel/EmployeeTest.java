package com.hr.personel;

import java.time.LocalDate;
import org.assertj.core.api.Assertions;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class EmployeeTest {

  private Employee employee;

  @Before
  public void setUp() throws Exception {
    employee = new Employee("kelly", LocalDate.of(2020, 01, 03));
  }

  @Test
  public void getEmployeeInfo_should_return_name_and_hireDate() {
    // arrange// act
    String employeeInfo = employee.getEmployeeInfo();
    // assert
    Assert.assertEquals("name = kelly, hireDate = 2020-01-03", employeeInfo);
    //    Assertions.assertThat(employeeInfo).isEqualTo("name = kelly, hireDate = 2020-01-03");
  }

  @Test
  public void work_should_return_worked_string() {
    String work = employee.work();
//    Assert.assertEquals("kelly worked", work);
    Assertions.assertThat(work).isEqualTo("kelly worked");
  }
}