package homework1;

public class MaxNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=10;
		int b=20;
		int c= 5;
		
		int max= (a > b) ?  ((a > c) ? a :c) : ((b > c) ? b : c);
		
		System.out.println("The Maximum number is - "+ max);

	}

}
