package com.pojo;

public class NeedlemanWunshDTO {
    private float[][] computedMatrix;
    private char[]  result1;
    private char[] result2;
    private String sequence1;
    private String sequence2;
    public float[][] getComputedMatrix() {
        return computedMatrix;
    }

    public void setComputedMatrix(float[][] computedMatrix) {
        this.computedMatrix = computedMatrix;
    }

    public char[] getResult1() {
        return result1;
    }

    public void setResult1(char[] result1) {
        this.result1 = result1;
    }

    public char[] getResult2() {
        return result2;
    }

    public void setResult2(char[] result2) {
        this.result2 = result2;
    }

    public char[] getSequence1() {
        return sequence1.toCharArray();
    }

    public void setSequence1(String sequence1) {
        this.sequence1 = sequence1;
    }

    public char[] getSequence2() {
        return sequence2.toCharArray();
    }

    public void setSequence2(String sequence2) {
        this.sequence2 = sequence2;
    }
}
