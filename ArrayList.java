import java.io.*;
import java.util.ArrayList;
class ArrayListEx{
	public static void main(String []args){
		int[] a = new int[3];
		a[0] = 1;
		System.out.println(a[0]);
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(10);
		System.out.println(list.get(0));
	}
}