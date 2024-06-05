package labs.lab6;

import java.util.Scanner;

public class Vowels {
    public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		String str;

		int vol=0,spl=0,dig=0,word=0;

		System.out.println("Enter a string");
		str=sc.nextLine();

		str=" "+str;//to read the first word 
		str=str.toLowerCase();

		for(int i=0;i<str.length();i++)
		{
			char ch=str.charAt(i);
			if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')//check vowel
				vol++;
			if(ch>='0'&&ch<='9')//check digit
				dig++;
				if(ch==' ')//to check word
					word++;
			if(!Character.isLetterOrDigit(ch)&&!Character.isWhitespace(ch))//check special character
			spl++;	
			
		}

		System.out.println("The number vowels are "+vol);
		System.out.println("The number of digits are "+dig);
		System.out.println("The number of words are "+word);
		System.out.println("The number of special character are "+spl);
        sc.close();
		
	}

}
