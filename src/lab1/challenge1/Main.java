package lab1.challenge1;

public class Main {

     void fizzbuzz() {
    int  i=1,a=3,b=5;
    for(i=1;i<=100;i++) {
        if (i % 3 == 0) {
            System.out.println("Fizz");
        } else if (i % 5 == 0) {
            System.out.println("Buzz");
        } else if ((i % a == 0) && (i % b == 0)) {

            System.out.println("FizzBuzz");
        } else {
            System.out.println(i);
        }
    }
    }

    public static void main(String[] args)
    {
        System.out.println("Primul curs de Java");
        Main a = new Main();
       a.fizzbuzz();
    }
}
