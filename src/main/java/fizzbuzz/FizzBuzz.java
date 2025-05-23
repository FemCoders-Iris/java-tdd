package fizzbuzz;

public class FizzBuzz {
    public String convert(int integer) {
        if(integer % 5 == 0 && integer % 3 == 0){
            return "FizzBuzz";
        }
        if(integer % 3 == 0){
            return "Fizz";
        }
        if(integer % 5 == 0){
            return "Buzz";
        }
        return String.valueOf(integer);
    }
}
