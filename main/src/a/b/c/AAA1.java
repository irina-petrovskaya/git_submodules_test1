package a.b.c;

import java.util.Arrays;

/**
 * Created by user on 13/01/15.
 */
public class AAA1 extends SuperAAA1{
    String sss = null;
    double d = 0;
    float f = 0;
    boolean b;
    static long l;
    Integer[][][] int_array;

    public AAA1(long id, String sss, double d, float f, boolean b, Integer[][][] int_array) {
        super(id);
        this.sss = sss;
        this.d = d;
        this.f = f;
        this.b = b;
        this.int_array = int_array;
    }

    public AAA1(long id, String sss, double d, float f, boolean b) {
        super(id);
        this.sss = sss;
        this.d = d;
        this.f = f;
        this.b = b;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof AAA1)) return false;
        if (!super.equals(o)) return false;

        AAA1 aaa1 = (AAA1) o;

        if (Double.compare(aaa1.getD(), getD()) != 0) return false;
        if (Float.compare(aaa1.getF(), getF()) != 0) return false;
        if (b != aaa1.b) return false;
        if (getSss() != null ? !getSss().equals(aaa1.getSss()) : aaa1.getSss() != null) return false;
        return Arrays.deepEquals(getInt_array(), aaa1.getInt_array());

    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        long temp;
        result = 31 * result + (getSss() != null ? getSss().hashCode() : 0);
        temp = Double.doubleToLongBits(getD());
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + (getF() != +0.0f ? Float.floatToIntBits(getF()) : 0);
        result = 31 * result + (b ? 1 : 0);
        result = 31 * result + (getInt_array() != null ? // Probably incorrect - hashCode for high dimension arrays with Arrays.hashCode
                Arrays.hashCode(getInt_array()) : 0);
        return result;
    }

    public Integer[][][] getInt_array() {
        return int_array;
    }

    public void setInt_array(Integer[][][] int_array) {
        this.int_array = int_array;
    }

    public String getSss() {
        return sss;
    }

    public double getD() {
        return d;
    }

    public float getF() {
        return f;
    }

}
