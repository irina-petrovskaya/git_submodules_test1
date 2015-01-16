package a.b.c;

/**
 * *******************************
 * Created by Irina.Petrovskaya on 1/16/2015.
 * Project: git_submodules_test1
 * *******************************
 */
public class Run {
    public static void main(String[] args) {
        Integer[][][] i = new Integer[][][]{new Integer[][]{new Integer[]{1,2,3}},new Integer[][]{new Integer[]{4,5,6}}};
        Integer[][][] i2 = new Integer[][][]{new Integer[][]{new Integer[]{1,2,3}},new Integer[][]{new Integer[]{4,5,6}}};
        AAA1 a1 = new AAA1(123,"aaa",1,2,true,i);
        AAA1 a2 = new AAA1(111,"bbb",2,2,true,i);
        AAA1 a3 = new AAA1(111,"bbb",2,2,true,i2);
        System.out.println(a1.equals(a2));
        System.out.println(a3.equals(a2));


    }
}
