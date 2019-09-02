
public class A2_Q6 {

	public static void main(String[] args) {
		  long n=100,m,a,s,p ;

          a =(n * (n + 1) * (2*n + 1) )/ 6;  //Sum of Squares of 100 natural numbers
          m = (n * (n + 1)) / 2; //Sum of first 100 Natural Numbers
          s = m*m; //Square of Sum of first 100 natural numbers
          p = s-a;
          System.out.println(p);

	}

}
