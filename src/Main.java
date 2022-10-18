public class Main {
    public static void main(String[] args) {
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
//        int ball = 7; * commented since the variable ball could be excluded since this value isn't used
        int ball = 11;  // here ball value changes to 11
        System.out.println(ball);
//  when  you don't want the previous value when tried to be overwritten
        final int cat = 50;
//  cat = 80; here variable is shown in error since the final value can't be overwritten
        System.out.println(cat);
//        declaring variables of other types
        int dog = 9;
        System.out.println(dog);
        float avgVal = 9.5F;
        System.out.println(avgVal);
        char myDog = 'E';
        System.out.println(myDog);
        boolean dogIsGood = true;
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
///  int justin = 82;
///  int dominic = 58;
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
//  combining both text and a variable, using the + character
        String buddy = "Kenny";
        System.out.println("Hello " + buddy);
//  using the + character to add a variable to another variable
        String n1 = "Kenny ";
        String n2 = "Sebastian";
        String fullName = n1 + n2;
        System.out.println(fullName);
//  For numeric values, the + character works as a mathematical operator
        int x = 12;
        int y = 13;
        System.out.println(x + y); // it Prints the value of x + y
//  Declaring many variables (Below is one of the way to add the numerical values)
//        int M = 15;
//        int N = 25;
//        int O = 35;
//        System.out.println(x + y + z); - but the easiest way is written below
        int M = 15, N = 25, O = 35;
        System.out.println(M + N + O);
//        if all the variables are with same values we could write it as
        int D, E, F;
        D = E = F = 20;
        System.out.println(D + E + F);
//  Boolean
        boolean isJavaEasy = true;
        boolean beingLazyHelps = false;
        System.out.println(isJavaEasy);
        System.out.println(beingLazyHelps);
//  Non-Primitive (created by programmer & not predefined in java except for String - Always starts with capital letter)
        String letters = "AbCdEfGhI";
        System.out.println("The length of the txt string is = " + letters.length());
//  Changing all characters in string from Upper case to lower case & vice-versa
        System.out.println(letters.toUpperCase());   // Output "ABCDEFGHI"
        System.out.println(letters.toLowerCase());   // Output "abcdefghi"
//  Finding a Character in a String
        System.out.println(letters.indexOf("g")); // ** doubt what would be the index of g here since index of "G" shows 6 but index of "g" is -1
//  Concatenation
        String firstName = "Mary";
        String lastName = "Stella";
        System.out.println(firstName + " " + lastName);
//  same can be printed using concat method
        System.out.println(firstName.concat(lastName)); // Doubt if we can't insert space here
//  String - Special characters
        String simpleStatement = "We are the \"Champions\" from Brazil.";
        System.out.println(simpleStatement);
//  using different escape sequences in string
//  using \n
        String simpleStatement1 = "We are\n the \"Champions\"\n from Brazil."; // \n breaks sequence & prints in new line - can be used multiple times
        System.out.println(simpleStatement1);
//  using \r
        String simpleStatement2 = "We are the \"Champions\"\r from\r Brazil."; // \r breaks sequence & prints the characters in string that are after \r - can be used multiple times
        System.out.println(simpleStatement2);
//  using \t
        String simpleStatement3 = "We are\t the \"Champions\"\t from Brazil."; // \r inserts Tab space between the characters where it is assigned - can be used multiple times
        System.out.println(simpleStatement3);
//  using \b
        String simpleStatement4 = "We\b are the \"Champions\" from\b Brazil."; // \b deletes the previous character from where it is assigned, which is usually called as backspace - can be used multiple times
        System.out.println(simpleStatement4);
//  using \f (form feed)
        String simpleStatement5 = "We are\f the \"Champions\" from Brazil."; // *doubt - not able to understand its function
        System.out.println(simpleStatement5);
//  Using Math methods
        System.out.println(Math.max(2, 7)); // outputs the maximum value
        System.out.println(Math.min(2, 7)); // outputs the minimum value
        System.out.println(Math.sqrt(81)); //outputs the squareroot
        System.out.println(Math.abs(-8.3)); //outputs the exact positive value
        System.out.println(Math.random()); // by default prints any value from 0.0 to 1.0
        System.out.println(Math.random() * 201); // now we have set the random value to be printed from 0.0 to 200
//  if, else, else if
        int day = 31;
        if (day < 10){
            System.out.println("Beginning of the month.");
        } else if (day < 29) {
            System.out.println("Mid of the month.");
        } else {
                System.out.println("End of the month");
            }
//  Switch
       int week = 2;
        switch(week){
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
            case 7:
                System.out.println("Weekend");
                break;
            default: //The default keyword specifies some code to run if there is no case match
                System.out.println("Not sure what day it is! try again");
        }
//  While loops
        int h = 0;
        while (h < 6) {
            System.out.println(h);
            h++; //increase the variable used in the condition, otherwise the loop will never end!
        }
//printing values with number multiple to it
        for (int i = 0; i <= 10; i = i + 3) {
            System.out.println(i);
        }
//  Continue - if the specified condition occurs the statement breaks one iteration & continues to next iteration
        for (int j = 0; j < 5; j++) {
            if (j == 3) {
                continue;
            }
            System.out.println(j);
        }
//  break - if the specified condition is met the statement breaks & would jump out of the loop
        for (int k = 0; k < 5; k++) {
            if (k == 2) { //here when value 2 is occurred the statement breaks
                break;
            }
            System.out.println(k);
        }
//  Arrays - Arrays are used to store multiple values in a single variable, instead of declaring separate variables for each value.
    String[] bikes = {"Yamaha", "Bajaj", "Husqvarna", "BMW"};
    int[] myFavNum = {3, 5 , 7};
        System.out.println(bikes[2]);
        bikes[2] = "Duke"; //change the value in array by mentioning the position in array
        System.out.println(bikes[2]);
        System.out.println(myFavNum[1]);
        myFavNum[1] = 2; //change the value in array by mentioning the position in array - same as in string
        System.out.println(myFavNum[1]);
//  Loop with Arrays
        for (int i = 1; i < bikes.length; i++) {
            System.out.println(bikes[i]);}
        }
    }