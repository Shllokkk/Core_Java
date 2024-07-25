public class TryCatch {

    public static void main(String[] args) {

         int num1=10, num2=0, result;

         try{
            System.out.println("Inside try....");

            result=num1/num2;  //this line generates exception

            System.out.println("Division = " + result);    //these lines do not get executed because when the above lines generates 
            System.out.println("Last line of try....");  //an exception the control is transfered to the catch clause 

        }catch(ArithmeticException e){

                // at TryCatch.main(TryCatch.java:10)
                                
        } //end of catch

        System.out.println("Exiting main....");

    }
    
}

//we use try catch to handle exceptions
//put the code to be monitored in try clause followed by a catch clause to handle the exception if it arises
//when an exception arises an object representing the exception is created by the JVM
//and thrown in the method that caused it 
//if the catch clause is unable to handle the exception then the default handler handles the exception by abrupt termination
