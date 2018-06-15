package a.b.ccc;

import java.util.ArrayList;
import java.util.List;

/**
 * *******************************
 * Created by irina on 1/16/2015.
 * Project: git_submodules_test1
 * *******************************
 */
public class Run {
    public static void main(String[] args) {
        Integer[][][] i = new Integer[][][]{new Integer[][]{new Integer[]{1,2,3}},new Integer[][]{new Integer[]{4,5,6}}};
        Integer[][][] i2 = new Integer[][][]{new Integer[][]{new Integer[]{1,2,3}},new Integer[][]{new Integer[]{4,5,6,7},new Integer[]{1,2,3} }};
        Integer[][][] i3 = new Integer[][][]{new Integer[][]{new Integer[]{1,2,3}},new Integer[][]{new Integer[]{4,5,6,7},new Integer[]{1,2,3} }}; // same contents as i2
        List<Integer[][]> l1 = new ArrayList<Integer[][]>();
        l1.add(new Integer[][]{new Integer[]{1,2,3,4},new Integer[]{5,6,7,8}});
        l1.add(new Integer[][]{new Integer[]{1,2,3,4},new Integer[]{5,6,7,8}});
        List<Integer[][]> l2 = new ArrayList<Integer[][]>();
        l2.add(new Integer[][]{new Integer[]{1,2,0,4},new Integer[]{5,6,7,8}});
        l2.add(new Integer[][]{new Integer[]{1,2,3,4},new Integer[]{5,6,7,8}});
        List<Integer[][]> l3 = new ArrayList<Integer[][]>(); // same content as l2
        l3.add(new Integer[][]{new Integer[]{1,2,0,4},new Integer[]{5,6,7,8}});
        l3.add(new Integer[][]{new Integer[]{1,2,3,4},new Integer[]{5,6,7,8}});
        AAA1 a1 = new AAA1(111,"aaa",2,2,true,i2,l2);
        AAA1 a2 = new AAA1(111,"aaa",2,2,true,i2,l2);
        AAA1 a3 = new AAA1(111,"aaa",2,2,true,i2,l1);
        AAA1 a4 = new AAA1(111,"aaa",2,2,true,i2,l3);
        System.out.println(a1.equals(a2));
        System.out.println(a1.hashCode()==a2.hashCode());
        System.out.println(a3.equals(a2));
        System.out.println(a3.hashCode()==a2.hashCode());
        System.out.println(a4.equals(a2));
        System.out.println(a4.hashCode()==a2.hashCode());
    }
}
