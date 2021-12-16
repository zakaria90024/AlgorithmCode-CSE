package com.ZakariaAhnaf.algorithmcode_cse.Ques2OOP;

public class Person {
    public String name = "Zakaria", address = "Dhaka",
            phone_number = "01766262029", email_address = "test@gmail.com";

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", class_name='"+this.getClass().getSimpleName()+ '\'' +
                ", address='" + address + '\'' +
                ", phone_number='" + phone_number + '\'' +
                ", email_address='" + email_address + '\'' +

                '}';
    }
}
