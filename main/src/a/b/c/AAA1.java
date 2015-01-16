package a.b.c;

/**
 * Created by user on 13/01/15.
 */
public class AAA1 extends SuperAAA1{
    String sss = null;
    double d = 0;
    float f = 0;
    boolean b;
    static long l;

   /* public AAA1(long id) {
        super(id);
    }*/

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
        return !(getSss() != null ? !getSss().equals(aaa1.getSss()) : aaa1.getSss() != null);

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
        return result;
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


    //
    // trunk ch1
}
