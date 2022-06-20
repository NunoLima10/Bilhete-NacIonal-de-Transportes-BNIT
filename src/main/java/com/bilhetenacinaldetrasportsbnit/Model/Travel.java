package com.bilhetenacinaldetrasportsbnit.Model;

public abstract class Travel {
    private final String code;
    private String state;
    private Operator operator;


    public Travel(String state) {
        this.state = state;
        this.code = generateCode();
    }
    public Travel() {
        this.code = generateCode();
    }

    public String generateCode(){
        return "Code Generated";

    }

    public void setState(String state) {
        this.state = state;
    }

    public String getState() {
        return state;
    }

    public Operator getOperator() {
        return operator;
    }
}
