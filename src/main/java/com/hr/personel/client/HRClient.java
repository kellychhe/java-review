package com.hr.personel.client;

import com.hr.personel.Employee;
import java.time.LocalDate;

public class HRClient {

  public static void main(String[] args) {
    Employee employee1 = new Employee();
    employee1.setName("kelly");
    employee1.setHireDate(LocalDate.of(20,3,10));
    System.out.println("employee1 info: " + employee1.getEmployeeInfo() );

    Employee employee2 = new Employee("mary", LocalDate.of(1900,03,05));
    System.out.println("employee2 info: " + employee2.getEmployeeInfo() );

  }
}