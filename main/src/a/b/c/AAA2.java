package a.b.c;

/**
 * Created by user on 14/01/15.
 */
public class AAA2 extends SuperAAA1{
    //
    int i1;

    public int getI1() {
        return i1;
    }

    public void setI1(int i1) {
        this.i1 = i1;
    }

    @Override
    public boolean equals(Object o) {
       //addEqualsPrologue begin
        if (this == o) return true;
        if (!(o instanceof AAA2)) return false;
        if (!super.equals(o)) return false;
        //addEqualsPrologue end
        AAA2 aaa2 = (AAA2) o;

        return getI1() == aaa2.getI1();

    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + getI1();
        return result;
    }
}
