import java.util.*;

public class Q1{

    public static int strComp(String s1, String s2){
        for(int i = 0 ; i < s1.length() && i < s2.length() ; i++){
            if(s1.charAt(i) != s2.charAt(i)) return (int)s1.charAt(i) - (int)s2.charAt(i);
        }
        
        return s1.length()-s2.length();
    }
    public static void main(String []args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first string");
		String str1 = sc.nextLine(); 
		System.out.println("Enter second string");
        String str2 = sc.nextLine(); 
        
        System.out.println("String1 and String2 comparison: "+strComp(str1, str2));
    }
}