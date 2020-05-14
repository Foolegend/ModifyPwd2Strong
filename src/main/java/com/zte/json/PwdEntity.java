package com.zte.json;

import java.util.List;

public class PwdEntity {
    private List<String> P;
    private List<Integer> C;
    private int N;
    private int MS;

    public List<String> getP() {
        return P;
    }

    public void setP(List<String> p) {
        P = p;
    }

    public List<Integer> getC() {
        return C;
    }

    public void setC(List<Integer> c) {
        C = c;
    }

    public int getN() {
        return N;
    }

    public void setN(int n) {
        N = n;
    }

    public int getMS() {
        return MS;
    }

    public void setMS(int MS) {
        this.MS = MS;
    }
}
