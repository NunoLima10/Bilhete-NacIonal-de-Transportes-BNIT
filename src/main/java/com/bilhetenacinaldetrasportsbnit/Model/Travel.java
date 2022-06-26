package com.bilhetenacinaldetrasportsbnit.Model;

public abstract class Travel {
    public String code;
    public String state;
    public Operator operator;

    public abstract String generateCode();


    public void setState(String state) {
        this.state = state;
    }

    public String getState() {
        return state;
    }

    public Operator getOperator() {
        return operator;
    }

    public String getCode() {
        return code;
    }
}
