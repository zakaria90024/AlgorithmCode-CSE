package com.ZakariaAhnaf.algorithmcode_cse.Ques2OOP;

public class Faculty extends Employee{
    public String hours,rank;

    @Override
    public String toString() {
        return "Faculty{" +
                "name='" + person.name  + '\'' +
                ", class_name='"+this.getClass().getSimpleName()+ '\'' +
                ", hours='" + hours + '\'' +
                ", rank='" + rank + '\'' +
                '}';
    }
}
