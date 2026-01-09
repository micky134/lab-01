package com.example.petshop;

import java.util.Date;

public class Angry extends CurMood{
    public Angry()
    {
        super();
    }
    public Angry(Date curDate)
    {
        super(curDate);
    }
    @Override
    public String Speak()
    {
        return "rahh";
    }
}
