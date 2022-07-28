
/*

Program to Real-Life Game description

FizzBuzz is a game where players count by 1, and if
it's a number divisible by 5, you say "Fizz!",
and if it's a number divisible by 7, you say "Buzz!"
If it's a number divisible by both, you say "FizzBuzz!"
If you mess up, you're out and the game continues until, 
everyone except one person is out.

*/
import java.util.stream.IntStream;
 
public class FizzBuzz 
{
  public static void main(String[] args) 
  {
    fizzBuzzBeforeJava8(100);
    fizzBuzzInJava8(100);
  }
 
  private static void fizzBuzzBeforeJava8(int num) 
  {
    for (int i = 1; i <= num; i++) 
    {
      if (((i % 5) == 0) && ((i % 7) == 0)) // Is it a multiple of 5 & 7?
        System.out.println("fizzbuzz");
      else if ((i % 5) == 0) // Is it a multiple of 5?
        System.out.println("fizz");
      else if ((i % 7) == 0) // Is it a multiple of 7?
        System.out.println("buzz");
      else
        System.out.println(i); // Not a multiple of 5 or 7
    }
  }
 
  private static void fizzBuzzInJava8(int num) {
    IntStream.rangeClosed(1, 100)
        .mapToObj(i -> i % 5 == 0 ? (i % 7 == 0 ? "FizzBuzz" : "Fizz") : (i % 7 == 0 ? "Buzz" : i))
        .forEach(System.out::println);
  }
}
