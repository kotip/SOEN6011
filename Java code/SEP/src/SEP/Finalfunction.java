/**
 * 
 */
package SEP;
import java.util.*;

/**
 * @author kotic
 *
 */
public class Finalfunction {
  
	 static double lognatural(double d) {
	   
		double result=0.0,term=d-1.0;
		double power=-1.0;
		double denominator=2.0;
		double temp=term;
		try {
		while(temp>1E-15 ||-temp >1E-15) {
			
			if(temp>1E-15) {
				result -=temp;
			}
			else {
				result +=temp;
			}
			term=term * (d-1.0);
			temp=term * power;
			temp /=denominator;
			power *=-1.0;
			denominator +=1.0; 			
			}
		result +=temp;
	 }
	 catch (ArithmeticException e) {
	   System.out.println("In the catch Block due to Exception = " + e);
	 }
    return result;
  
	   
		
		}
	 static double Lognatural1(double d) {
	      double result=0.0,term=(d-1)/d;
	      double denominator=2;
	      double temp=term;
	      try {
	      while(temp>1E-15) {
	        
	        result +=temp;
	        term *=(d-1)/d;
	        temp=term*(1.0/denominator);
	        denominator +=1;
	      }
	      
	      }
	      catch (ArithmeticException e) {
	        System.out.println("In the catch Block due to Exception = " + e);
	      }
	      
	      
	    return result;
	      
	      
	    }
	 
	 static double exponential( double id) {
			double result=1.0,term=id;
			int denominator=2;
			try {
			while(term>1E-16 || -term>1E-16) {
				result +=term;
				term *=id;
				term/=denominator;
				denominator +=1;
			}
			}
			catch (ArithmeticException e) {
		       System.out.println("In the catch Block due to Exception = " + e);
		     }
			return result;
			
		}
	public static void main(String [] args) {
		
		double d;
		double id;
		try {
		Scanner in = new Scanner(System. in);
		System.out.println("enter the value of x");
		id=in.nextDouble();
		System.out.println("enter the integer value of B");
		d=in.nextDouble();
		if(d>1.0) {
          double logValue = Lognatural1(d);
        //System.out.println("calculated result is" +logValue);
          double xyz=id*logValue;
          double expValue = exponential(xyz);
          
          System.out.println("calculated result is" +2*expValue);
          
        }
		else if(d>0.0) {
		  double logvalue1=lognatural(d);
		  
		  double res1=id*logvalue1;
		  double expvalue1= exponential(res1);
		  System.out.println("calculated result is" +2*expvalue1);
		  
		  
		}
		}
		catch (ArithmeticException e) {
	       System.out.println("In the catch Block due to Exception = " + e);
	     }
		
		
		
	}
		
	}


