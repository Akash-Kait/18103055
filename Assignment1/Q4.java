import java.util.*;


public class Q4
{
    public static void main (String[]args)
    {
        Scanner myObj = new Scanner(System.in);
        
        System.out.println ("Enter first string: ");
        String str1 = myObj.nextLine();
        
        System.out.println ("Enter second string: ");
        String str2 = myObj.nextLine();
        
        if(str1.length() != str2.length()){
            System.out.println("No");
        }
        else{
            ArrayList<Integer> arr = new ArrayList<Integer>();
            for(int i = 0 ; i < 26 ; i++){
                arr.add(0);
            }
            for(char e : str1.toCharArray()){
                arr.set(e - 'a', arr.get(e - 'a') + 1);
            }
            for(char e : str2.toCharArray()){
                arr.set(e - 'a', arr.get(e - 'a') - 1);
            }
            
            boolean b = false;
            
            for(int i : arr){
                if(i != 0) b = true;
            }
            
            if(b) System.out.println("No");
            else System.out.println("Yes");
        }
    }
}