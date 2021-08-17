package com.codegym;

public class TriangleClassifier {

    private int a;
    private int b;
    private int c;

    public TriangleClassifier(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public int CheckTriangle() {
        boolean isTriangle = false;
        boolean laTamGiac = a < this.b + c && this.b < a + c && c < a + this.b;
        int tamGiacCan = 1;
        int notTamGiac = -1;

        if (laTamGiac)
            isTriangle = true;
        if (isTriangle) {
            boolean tamGiacDeu = a == this.b && this.b == c;
            if (tamGiacDeu)
                return 2;
            else {
                boolean tamGiacThuong = a != this.b && a != c && this.b != c;
                if (tamGiacThuong)
                    return 0;
                else
                    return tamGiacCan;
            }
        }
        return notTamGiac;
    }

}
