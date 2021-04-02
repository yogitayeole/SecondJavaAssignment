package com.example.payroll;


class Employee{

    String EmpName;
    int salary;

    Employee(String name,int salary)
    {
        this.EmpName = name;
        this.salary = salary;

    }

}

class Manager extends Employee{


    Manager(String name, int salary) {
        super(name, salary);

    }

    int getsalary(int incentive)
    {
        return salary+incentive;
    }
}

class Labour extends Employee{

    Labour(String name, int salary) {
        super(name, salary);
    }

    int getsalary(int overtime)

    {
        return salary+(overtime*100);
    }
}

public class OrgPayroll {

    public static void main(String args[]){

        Manager emp = new Manager("yogita" ,1000);

        System.out.println("Salary of employee:"+ emp.getsalary(2));

        Labour lab = new Labour("Swapnil",40000);
        System.out.println("Salary of labour:"+lab.getsalary(6));
    }


}

