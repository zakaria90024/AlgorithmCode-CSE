package com.ZakariaAhnaf.algorithmcode_cse.Ques2OOP;

public class MyDate {
    public String year,month,day;
    Person person = new Person();

    @Override
    public String toString() {
        return "MyDate{" +
                "name='" + person.name  + '\'' +
                ", year='" + year + '\'' +
                ", month='" + month + '\'' +
                ", day='" + day + '\'' +
                ", class_name='"+this.getClass().getSimpleName()+ '\'' +
                '}';
    }
}
