public class MultiCatch {

    public static void main(String[] args) {

        int num1=23;
        int num2= args.length; //args.length is a variable that comes with the String args

        System.out.println("Entering try...");

        try{
            System.out.println("Inside try....");

            int result=num1/num2; //this line may throw exception if there is no command line argument

            System.out.println("Division = " + result);
            int array[]={10,20,30}; //a way of creating an array

            array[num2]= 2323; //this line may throw exception if there are more than two command line args

            System.out.println("Exiting try....");

        }catch(ArithmeticException e){
            System.out.println("ArithmeticException caught");
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("ArrayIndexOutOfBoundsException caught");
        }

        System.out.println("Exiting main....");
    } 
}

//this program will not throw exception if there is one or two command line args
//we can use  ultiple catch clauses with a try block
//a try block must have atleast one catch or finally
//if we use the parent Exception class then we may not need multiple catch
