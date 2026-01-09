package com.example.petshop;

import java.util.Date;

public class Dog extends Pet implements Pettable
{
    @Override
    public void pet(){

    }
    @Override
    public String speak() {
        return "bark";
    }
    String name;
    Date birthDate;
    public Dog(String name)
    {
            super(name);
    }
    public Dog(String name, Date birthDate)
    {
        super(name, birthDate);
    }
}
