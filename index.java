import java.io.*;
import java.util,*;

public class datatype{
	
	public  static void Main(String areg[]){
		
		Scanner in=new Scanner(System.in);
		int x=in.nextInt();
		for(int i=0 ;i<x ;i++){
			
			String value=in.next();
			
			try{
				long number=Long.parseLong(value);
				System.out.println(number+"can be fitted in :");
				
				if(number>=0 && number<=1){
					
					System.out.println("* Boolean");
					
					
				}
				if(number>=Byte.MIN.VALUE && number<=Byte.MAX_VALUE){
					
					System.out.println("* Byte");
					
				}
				if(number>=Short.MIN_VALUE && number<=Short.MAX_VALUE){
					
					
					System.out.println("* Short");
				}
				if(number>=Integer.MIN_VALUE && number<=Integer.MAX_VALUE){
					
					System.out.println("* int");
					
				}
				if(number>=Long.MIN_VALUE && number<=Long.MAX_VALUE){
					
					System.out.println("* long");
				}
				
				
				
			}(Exception e){
				System.out.println(value+"can't be fitted anywhere");
			}
			
			
		}
		
		
		
		
	}
	
}