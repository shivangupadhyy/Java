package string;

import java.util.Scanner;

import loops.loops;

public class MyString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // String name = sc.next();
        // String Fullname  = name +" upadhyay";
        // System.out.println(Fullname);

        //concatenation

        // String firstName = "tony";
        //  String lastName = "Upadhyay";
        //  String fullName = firstName + " " + lastName;
        //  System.out.println(fullName.length());

        //  //charAt 
        //  for(int i =0 ; i<fullName.length(); i++){
        //     System.out.println(fullName.charAt(i));
        //  }

        //compare(compareTo)
        String name1= "Tony";
        String name2 = "Tony";

        //1 s1> s2 : +ve value;
        //2 s1 == s2 : 0
        //3 s1 < s2 : -ve value

        // if(name1.compareTo(name2) == 0){
        //     System.out.println("string are equal");
        // }else{
        //     System.out.println("String are not equal");
        // }

        // if(name1 == name2){
        //     System.out.println("string are equal");
        // }else{
        //     System.out.println("String are not equal");
        // }
        
        //substring
        // String sentence = "My name is  Tony";
        // String name = sentence.substring(11, sentence.length());
        // System.out.println(name);

        // String str = "123";
        // int number = Integer.parseInt(str);
        // System.out.println(number);

        // int number = 123;
        // String str = Integer.toString(number);
        // System.out.println(str.length());
        // String email = sc.next();
        // String userName = "";

        // for(int i=0; i<email.length();i++){
        //     if(email.charAt(i) ==  '@'){
        //         break;
        //     }else{
        //         userName += email.charAt(i);
        //     }
        // }
        // System.out.println(userName);

        // StringBuilder  sb = new StringBuilder("Tony");
        // System.out.println(sb);

        // // char at index 0
        // // System.out.println(sb.charAt(0));

        // // sb.setCharAt(0, 'p');
        // // System.out.println(sb);

        // sb.insert(2,'n');
        // System.out.println(sb);

        // // sb.delete(2, 3);
        // // System.out.println(sb);
        // sb.delete(2, 4);
        // System.out.println(sb);

        StringBuilder sb = new StringBuilder("hello");
        for(int i=0; i<sb.length()/2; i++){
            int front = i;
            int back = sb.length() -1 -i;

            char frontChar = sb.charAt(front);
            char backChar = sb.charAt(back);

            sb.setCharAt(front, backChar);
            sb.setCharAt(back,frontChar);

        }

        System.out.println(sb);

    }
}
