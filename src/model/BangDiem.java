
package model;

public class BangDiem {
   private int Ma;
   private String maSV;
   private float lapTrinhC, Python, Java;

    public BangDiem() {
    }

    public BangDiem(int Ma, String maSV, float lapTrinhC, float Python, float Java) {
        this.Ma = Ma;
        this.maSV = maSV;
        this.lapTrinhC = lapTrinhC;
        this.Python = Python;
        this.Java = Java;
    }

    public int getMa() {
        return Ma;
    }

    public void setMa(int Ma) {
        this.Ma = Ma;
    }

    public String getMaSV() {
        return maSV;
    }

    public void setMaSV(String maSV) {
        this.maSV = maSV;
    }

    public float getLapTrinhC() {
        return lapTrinhC;
    }

    public void setLapTrinhC(float lapTrinhC) {
        this.lapTrinhC = lapTrinhC;
    }

    public float getPython() {
        return Python;
    }

    public void setPython(float Python) {
        this.Python = Python;
    }

    public float getJava() {
        return Java;
    }

    public void setJava(float Java) {
        this.Java = Java;
    }
   
}
