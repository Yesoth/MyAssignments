package Week1.Day2;

public class ArmstrongNumber {

	public static void main(String[] args) {
		int input, temp, remainder, result;
	      input = 13;
	      result = 0;
	      temp = input;
   	      while (temp > 0){
	         remainder = temp % 10;
	         result += (remainder*remainder*remainder);
	         temp /= 10;
	      }
	      if(result == input)
	         System.out.println(input + " is an Armstrong number");
	      else
	         System.out.println(input + " is not an Armstrong number");
	}
}
