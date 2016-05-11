import java.util.*;
public class Main {
    public static void main(String[] args) {
    	Scanner cin = new Scanner(System.in);
        int val;

        while(cin.hasNext())
        {
        	val = cin.nextInt();
        	for(int i=0;i<val;i++)
        	{
        		long n=cin.nextInt();
        		long temp=0;
        		for(int j=0;j<n;j++)
        		{
        			temp+=cin.nextInt()+1;
        		}
                System.out.println(temp);
        	}
        }
    }
}
