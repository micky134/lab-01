package com.example.petshop;

import java.util.Date;

public class Confused extends CurMood{
    public Confused()
    {
        super();
    }
    public Confused(Date curDate)
    {
        super(curDate);
    }
    @Override
    public String Speak()
    {
        return "huh";
    }

}
