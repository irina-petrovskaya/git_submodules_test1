package a.b.ccc;

import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;

import java.util.Arrays;

/**
 * *******************************
 * Created by irina on 1/16/2015.
 * Project: git_submodules_test1
 * *******************************
 */
public class NestedArrayTest0 {
 int[][] intArr;

    public int[][] getIntArr() {
        return intArr;
    }

    public void setIntArr(int[][] intArr) {
        this.intArr = intArr;
    }

    public NestedArrayTest0(int[][] intArr) {
        this.intArr = intArr;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof NestedArrayTest0)) return false;

        NestedArrayTest0 that = (NestedArrayTest0) o;

        return Arrays.deepEquals(getIntArr(), that.getIntArr());

    }

    @Override
    public int hashCode() {
        return getIntArr() != null ? // Probably incorrect - hashCode for high dimension arrays with Arrays.hashCode
                Arrays.hashCode(getIntArr()) : 0;
    }
}
