package clase7.fizzbuzz;

public class FizzBuzz {
    public static void main(String[] args) {
        int number = 100;

        for(int i = 1; i<=number; i++){
            if(i%3 == 0 && i%5 == 0){
                System.out.println("FizzBuzz");
            }else if(i%3 ==0){
                System.out.println("Fizz");
            }else if(i%5 == 0){
                System.out.println("Buzz");
            }else{
                System.out.print(i+" ");
            }
        }
    }
}
