import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Q2
{
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter the para");
		String para = s.nextLine();
		
		System.out.println("Enter the number of words you want to enter: ");
		int n = s.nextInt();
		System.out.println("Enter words");
		String [] words = new String [n];
		for(int i = 0; i < n ;i++)
		{
			words[i] = s.nextLine();
		}
		List <String> wordsToReplace = Arrays.asList(words);
		for(String e : wordsToReplace){
		    Pattern p = Pattern.compile(e, Pattern.CASE_INSENSITIVE);
		    Matcher m = p.matcher(para);
		    StringBuilder sb = new StringBuilder();
		    if(m.find()){
		        for(int i = 0 ; i < e.length(); i++){
		            sb.append("*");
		        }
		    }
		    para = m.replaceAll(sb.toString());
		}
		
		System.out.println(para);
	}
}
