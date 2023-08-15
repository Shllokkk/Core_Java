public class NestedTry {
    
    public static void main(String[] args) {

        int num1= 86;
        int num2= args.length;

        System.out.println("Attempting to divide....");

        try{                                                          // outer try
            System.out.println("Entering outer try....");

            int result= num1/num2;              // this line may throw exception if there is no command line arg

            System.out.println("Result = " + result);
            System.out.println("Entering inner try....");
                  
            try{                                                      // inner try
                System.out.println("Inside inner try....");

                if(num2==1){
                     result= 100/(num2-num2);    // this line may throw exception if there is one command line arg
                }else{
                    int array[]=new int[2];

                    array[5]=23;              // this line may throw exception if there is more than one command line arg          
                }
                System.out.println("Exiting inner try....");

            }catch(ArrayIndexOutOfBoundsException e){                // inner catch
                System.out.println("Inner catch handler....");
                System.out.println(e);
            }                                                        //end of inner catch
            System.out.println("Exiting outer try....");
  
        }catch(ArithmeticException e){                               // outer catch
            System.out.println("Outer catch handler....");
            System.out.println(e);
        }                                                            //end of outer catch

        System.out.println("Exiting main....");
    } //end of main
}

// in nested try if an exception arises in inner try block and it does not have a catch handler
// for the particular exception then the stack is unbound to the outer(parent's) try block's 
// catch handler for a match 
// this continues till one of the catch handler succeeds or all try blocks are exhausted
// in the end the JREhandles the exception
// the inner try has access to parent's catch handler but the reverse is not possible