package com.cg;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class EmployeeMain {

    public static void main(String args[]){
        AnnotationConfigApplicationContext context =new AnnotationConfigApplicationContext();
        context.register(JavaConfig.class);
        context.refresh();
        Employee employee= context.getBean(Employee.class);
        System.out.println("Id: "+employee.getEmployeeId()+"\tName: "+employee.getEmployeeName()+" \t Salary: "
				+employee.getSalary()+" \tAge: "+employee.getAge()+"\nSbuId: "+employee.getBusinessUnit().getSbuId()+
				"\t SbuHead: "+employee.getBusinessUnit().getSbuHead()+"\t SbuName: "+employee.getBusinessUnit().getSbuName());
        
        context.close();

    }

}