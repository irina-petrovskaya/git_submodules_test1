package a.b.c;

/**
 * *******************************
 * Created by Irina.Petrovskaya on 1/16/2015.
 * Project: git_submodules_test1
 * *******************************
 */
public class RunTest {
    public static void main(String[] args) {
        Integer[][][] arr1 = new Integer[][][]{new Integer[][]{new Integer[]{1,2,3}},new Integer[][]{new Integer[]{4,5,6}}};
        Integer[][][] arr2 = new Integer[][][]{new Integer[][]{new Integer[]{1,2,3}},new Integer[][]{new Integer[]{4,5,6}}};
        Integer[][][] arr3 = new Integer[][][]{new Integer[][]{new Integer[]{7,8,9}},new Integer[][]{new Integer[]{10,11,12}}};
        NestedArraysTest1 obj0 = new NestedArraysTest1(arr1);
        NestedArraysTest1 obj1 = new NestedArraysTest1(arr1);// same object used as contents
        NestedArraysTest1 obj2 = new NestedArraysTest1(arr2);// object with same contents used as contents
        NestedArraysTest1 obj3 = new NestedArraysTest1(arr3);// object with different contents
        System.out.println("obj0.equals(obj1): " + obj0.equals(obj1));
        System.out.println("obj0.hashCode()==obj1.hashCode()" + (obj0.hashCode()==obj1.hashCode()));
        System.out.println("obj0.equals(obj2): " + obj0.equals(obj2));
        System.out.println("obj0.hashCode()==obj2.hashCode()" + (obj0.hashCode()==obj2.hashCode()));
        System.out.println("obj0.equals(obj3): " + obj0.equals(obj3));
        System.out.println("obj0.hashCode()==obj3.hashCode()" + (obj0.hashCode()==obj3.hashCode()));
        System.out.println("--------------int[][]----------------");
        int[][] a1 = new int[][]{{1,2,3},{4,5,6}};
        int[][] a2 = new int[][]{{1,2,3},{4,5,6}};
        int[][] a3 = new int[][]{{11,12,13},{14,15,16}};
        NestedArrayTest0 o0 = new NestedArrayTest0(a1);
        NestedArrayTest0 o1 = new NestedArrayTest0(a1);// same object used as contents
        NestedArrayTest0 o2 = new NestedArrayTest0(a2);// object with same contents used as contents
        NestedArrayTest0 o3 = new NestedArrayTest0(a3);// object with different contents
        System.out.println("o0.equals(o1): " + o0.equals(o1));
        System.out.println("o0.hashCode()==o1.hashCode(): " + (o0.hashCode()==o1.hashCode()));
        System.out.println("o0.equals(o2): " + o0.equals(o2));
        System.out.println("o0.hashCode()==o2.hashCode(): " + (o0.hashCode()==o2.hashCode()));
        System.out.println(o0.hashCode());
        System.out.println(o2.hashCode());
        System.out.println("o0.equals(o3): " + o0.equals(o3));
        System.out.println("o0.hashCode()==o3.hashCode(): " + (o0.hashCode()==o3.hashCode()));
    }
}
