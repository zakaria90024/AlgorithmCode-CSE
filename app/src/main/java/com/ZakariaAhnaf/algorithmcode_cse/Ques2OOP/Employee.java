package com.ZakariaAhnaf.algorithmcode_cse.Ques2OOP;

public class Employee extends Person{
    public String office, salary, date;

    Person person = new Person();

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + person.name  + '\'' +
                ", class_name='"+this.getClass().getSimpleName()+ '\'' +
                ", office='" + office + '\'' +
                ", salary='" + salary + '\'' +
                ", date='" + date + '\'' +
                '}';
    }

}
