public class ThrowDemo1 {

    static int divide(int num1, int num2){      //this function must always return a int value
        int result;

        try{
            result=num1/num2;       // this line generates exception
            return result;          // hence this line cannot get executed

        }catch(ArithmeticException e){
            System.out.println("ArithmeticException caught");
            throw e;                // this acts as a return statement instead of the original one 
        }
    }
    public static void main(String[] args) {

       int res= divide(12,0);         // this function call also causes exception and is shown in stacktrace

       System.out.println("Result = " + res);   //this line cannot get executed as the thrown exception is not dealt
                                                // with by a catch handler instead JVM handles it
    }
}

// throw is used to print custom exceptions
// ThrowableInstance is an object of the class Throwable or any child of class Throwable
// int, char, String and such datatypes cannot be used with throw
// the flow of execution stops immediately after throw and the nearest enclosing try block is inspected to check whether 
// it can handle the thrown exception

// the exceptions which are not checked by compiler at compile time are called unchecked exceptions
// it is not necessary to declare unchecked exceptions with throws in the method signature
// it is also not necessary to handle the thrown exception with a trycatch
// if trycatch is not used then default exception handler handles it by abrupt termination of the program