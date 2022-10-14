public class Main{
    public static void main(String[] args){
//  Assigning string type value to a variable
        String myName = "Eswar";
        System.out.println(myName);
//  Assigning Integer type value to a variable
        int myNum = 5;
        System.out.println(myNum);
//  Declaring a variable without value & assigning the value later
        int apple;
        apple = 15;
        System.out.println(apple);
//  Assigning new value to an existing variable will overwrite the previous value
        int ball = 7;
        ball = 11;  // here ball value changes to 11
        System.out.println(ball);
//  when  you don't want the previous value when tried to be overwritten
        final int cat = 50;
//  cat = 80; here variable is shown in error since the final value can have be overwritten
        System.out.println(cat);
//        declaring variables of other types
        int dog = 9;
        System.out.println(dog);
        float avgVal =9.5F;
        System.out.println(avgVal);
        char myDog = 'E';
        System.out.println(myDog);
        boolean dogIsGood =true;
        System.out.println(dogIsGood);
        String Greeting = "Hello";
        System.out.println(Greeting);
//  combining both text and a variable using + character
        System.out.println("Welcome " + myName);
//  using the + character to add a variable to another variable
        System.out.println(Greeting + " " + myName);
//        for integers + character is used to add the value mathematically
        System.out.println(apple + cat);
//  Assigning more than one variable of same type
//  int harry = 13;
//  int justin = 82;
//  int dominic = 58;
//  System.out.println(A + B + C);  // same code can also be written simple form
        int harry = 13, justin = 82, dominic = 58;
        System.out.println(harry + justin + dominic);
//  Integer Types -
//  byte data type can store whole numbers from -128 to 127
        byte oreo = 123;
        System.out.println(oreo);
//  short data type can store whole numbers from -32768 to 32767
        short jimjam = 9883;
        System.out.println(jimjam);
//  int data type can store whole numbers from -2147483648 to 2147483647
        int britannia = 898343;
        System.out.println(britannia);
//  long data type can store whole numbers from -9223372036854775808 to 9223372036854775807
        long darkFantasy = 98984525733L;
        System.out.println(darkFantasy);
//  float and double data types can store fractional numbers
        float Bounce = 6.45f;
        System.out.println(Bounce);
        double krack = 20.87d; //Doubt *** im unable to use any other letter other than d & f
        System.out.println(krack);
    }
}