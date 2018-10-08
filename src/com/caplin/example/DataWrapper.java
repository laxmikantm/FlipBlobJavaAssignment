package com.caplin.example;

public class DataWrapper {

    public String instruction;

    public String getInstruction() {
        return instruction;
    }

    public void setInstuction(final String instruction) {
        this.instruction= instruction;
    }

    /**
     * Equal if and ONLY if both objects contain the same string instruction
     */
    @Override
    public boolean equals(Object other){
        return this == other;
    }
}
