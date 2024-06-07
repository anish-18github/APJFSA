package labs.lab8;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class ArrayListRemoveDuplicate {
    public static void main(String[] args) {
       ArrayList<String> list = new ArrayList<String>(); 

		list.add("Praful");
		list.add("Omkar");
		list.add("Pratik");
		list.add("Pratik");
		list.add("Praful");
		list.add("Anish");

		System.out.println("List Elemnts are : " + list);

		Set<String> set1= new HashSet<String>(list);

		ArrayList<String> list1 = new ArrayList<String>(set1);

		
		System.out.println("Unique List: " + list1);

        }
        }
        