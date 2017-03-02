package a.b.ccc;

/**
 * *******************************
 * Created by Irina.Petrovskaya on 1/16/2015.
 * Project: git_submodules_test1
 * *******************************
 */
public class SuperAAA1 {
    public long id;

    public SuperAAA1() {
    }

    public SuperAAA1(long id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof SuperAAA1)) return false;

        SuperAAA1 superAAA1 = (SuperAAA1) o;

        return id == superAAA1.id;

    }

    @Override
    public int hashCode() {
        return (int) (id ^ (id >>> 32));
    }
}
