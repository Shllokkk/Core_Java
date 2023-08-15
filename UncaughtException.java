public class UncaughtException {

    public static void main(String[] args) {

       int num1, num2;
        int result;

        num1=10;
        num2=0;

        result=num1/num2; //this line throws ArithmeticException: / by zero

        System.out.println("Division of " + num1 + " and " + num2 + " is " + result); //this does not get printed due to exception
    }
    
}
 //the default exception handler of JVM handles it by:
 //1. abruptly terminating the execution of program
 //2. throwing the exception with its description
 //3. printing the stacktrace
 
 // default handler: Exception in thread "main" java.lang.ArithmeticException: / by zero
 // at UncaughtException.main(UncaughtException.java:11)