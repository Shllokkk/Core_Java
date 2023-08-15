public class FinallyDemo {
    
        static int timepass () throws ArithmeticException{
            try{
                int num1=90;
                int res=num1/0;
                return res;
            }catch (ArithmeticException e){
                System.out.println("Caught by timepass");
                throw e;
            }finally{
                System.out.println("inside finally of timepass");
            }
        }

        public static void main (String[] args){
            try{
                int result=timepass();
                System.out.println("Result= "+ result);
        
            }finally {
                System.out.println("inside finally of main");
            }
            System.out.println("Exiting main");
        }
 }

 // the block of code inside will be executed under any situation
 // whether an exception arises or not and whether its handled by the programmer or the JVM 
 // it is executed before a function returns or not 
 // a try can have only one finally block
 // finally will not be executed only if the program exits by calling System.exit() or there is a fatal error

