package Week3.day2;



import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class LearnList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[] = {3,4,5,2,2,1};
		int arr1[] = {6,2,1,8};
		
		List<Integer> list1 = new ArrayList<Integer>(arr.length);
		for (int i : arr) {
			list1.add(i);
		}
		
		List<Integer> list2 = new ArrayList<Integer>(arr1.length);
		for (int i : arr1) {
			list2.add(i);
		}
		list1.removeAll(list2);
		System.out.println(list1);
		
		String str1[] = {"Mango", "Apple" , "Banana", "Kiwi", "Water Melon"};
		String Str2[] = {"Banana", "Musk Melon", "Apple", "Mango", "Tomato"};
		
		List<String> list3 = new ArrayList<String>(Arrays.asList(str1));
		List<String> list4 = new ArrayList<String>(Arrays.asList(Str2));
		
		list3.removeAll(list4);
		System.out.println(list3);
		
	}

}
