package a.b.c;

import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;

import java.util.Arrays;
import java.util.List;

/**
 * Created by user on 13/01/15.
 */
public class AAA1 extends SuperAAA1{
    static long l;
    String sss = null;
    double d = 0;
    float f = 0;
    boolean b;
    Integer[][][] int_array;
    List<Integer[][]> arr_list;

    public AAA1(long id, String sss, double d, float f, boolean b, Integer[][][] int_array, List<Integer[][]> arr_list) {
        super(id);
        this.sss = sss;
        this.d = d;
        this.f = f;
        this.b = b;
        this.int_array = int_array;
        this.arr_list = arr_list;
    }

    public AAA1(long id, String sss, double d, float f, boolean b) {
        super(id);
        this.sss = sss;
        this.d = d;
        this.f = f;
        this.b = b;
    }

    public static long getL() {
        return l;
    }

    public boolean isB() {
        return b;
    }

    public List<Integer[][]> getArr_list() {
        return arr_list;
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
