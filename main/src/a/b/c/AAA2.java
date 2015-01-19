package a.b.c;

import java.util.Objects;
import org.apache.commons.lang.builder.EqualsBuilder;
/**
 * Created by me on 14/01/15.
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
        if (this == o) return true;

        if (!(o instanceof AAA2)) return false;

        AAA2 aaa2 = (AAA2) o;

        return new org.apache.commons.lang.builder.EqualsBuilder()
                .appendSuper(super.equals(o))
                .append(getI1(), aaa2.getI1())
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new org.apache.commons.lang.builder.HashCodeBuilder(17, 37)
                .appendSuper(super.hashCode())
                .append(getI1())
                .toHashCode();
    }
    //
}
