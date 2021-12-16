package com.ZakariaAhnaf.algorithmcode_cse.Ques2OOP;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public class Student extends Person{
    public String freshman, sophomore, junior, senior;
    Person person = new Person();

    @Override
    public String toString() {
        return "Student{" +
                "name='" + person.name  + '\'' +
                ", class_name='"+this.getClass().getSimpleName()+ '\'' +
                ", freshman='" + freshman + '\'' +
                ", sophomore='" + sophomore + '\'' +
                ", junior='" + junior + '\'' +
                ", senior='" + senior + '\'' +
                '}';
    }
}
