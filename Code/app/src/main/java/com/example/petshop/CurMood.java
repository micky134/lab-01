package com.example.petshop;

import java.util.Date;

public abstract class CurMood {
    private Date curDate;

    public CurMood(){
        this.curDate = new Date();
    }
    public CurMood(Date curDate)
    {
        this.curDate = curDate;
    }
    public Date getCurDate() {
        return curDate;
    }

    public void setCurDate(Date curDate) {
        this.curDate = curDate;
    }
    public abstract String Speak();
}
