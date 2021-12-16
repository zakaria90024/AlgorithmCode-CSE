package com.ZakariaAhnaf.algorithmcode_cse.Ques2OOP;

import androidx.annotation.NonNull;

public class Staff extends Employee{
    public String title;

    @Override
    public String toString() {
        return "Staff{" +
                "name='" + person.name  + '\'' +
                ", class_name='"+this.getClass().getSimpleName()+ '\'' +
                ", title='" + title + '\'' +
                "name='" + title + '\'' +
                '}';
    }
}
