
import java.util.*;
public class vowel
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    char ch = sc.next().toLowerCase().charAt(0);
	    
	    
	    if(ch == 'a'||ch =='e'||ch =='i'||ch=='o'||ch=='u'){
	        System.out.println(ch+ "  ia a vowel");
	    
	    }else{
	        System.out.println(ch + " cosonant");
	    }
	        
		
	}
}
