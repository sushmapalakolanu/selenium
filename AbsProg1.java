package abstractclasses;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
abstract class Operations
{
	abstract void sum();
	
}
class IntSum extends Operations
{
	int a,b;
	void sum()
	{
		
		Scanner s = new Scanner(System.in);
		System.out.println("enter two values");
		int a = Integer.parseInt(s.nextLine());
		int b = Integer.parseInt(s.nextLine());
		System.out.println("sum="+(a+b));
		
		
	}
}
class StrSum extends Operations
{
	String a,b;
	void sum()
	{
		
		Scanner s = new Scanner(System.in);
		System.out.println("enter two strings");
		String a = s.nextLine();
		String b = s.nextLine();
		System.out.println("string sum="+(a+""+b));
		List<String> l = null;
	l.sort(	new Comparator<String>() {
			public int compare(String o1, String o2) {
				return o1.compareTo(o2);
			}
		}
		);
	}

public static String getSmallestAndLargest(String s, int k) {
    String smallest = "";
    String largest = "";
    java.util.List<String> strs =new java.util.ArrayList<String>();
    for(int i=0;i<s.length();i=i+k){
        strs.add(s.substring(i,k));
    }
    strs.sort(new java.util.Comparator<String>() {
        public int compare(String o1, String o2) {
            return o1.compareTo(o2);
        }
    }
    );
    smallest = strs.get(0);
    largest = strs.get(strs.size()-1);
    // Complete the function
    // 'smallest' must be the lexicographically smallest substring of length 'k'
    // 'largest' must be the lexicographically largest substring of length 'k'
    
    return smallest + "\n" + largest;
}

}
public class AbsProg1 {
	public static void main(String[] args)
	{
		/*Operations o1 = new Operations();
		o1.sum();*/
		Operations o1 = new IntSum();
		o1.sum();
		Operations o2 = new StrSum();
		o2.sum();
		
		
		
	}

}
