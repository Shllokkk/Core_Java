public class CheckedException {
    
    static void throwing() throws ClassNotFoundException{

        throw new ClassNotFoundException("Exception is present");
    }

    public static void main(String[] args){
        
        try{
        throwing();
        }catch(ClassNotFoundException e){
            System.out.println(e);
        }

        System.out.println("Exiting main....");
    }
}

// the exceptions which are checked at compile time are called checked exception
// it is a must to declare a checked exeption in the method signature with throws and it must be handled with trycatch 
// if not then compile time error is generated

//when not handled with a trycatch : CheckedException.java:11: error: unreported exception ClassNotFoundException; must be caught or declared to be thrown
//                                           throwing();
//                                                   ^
//                                   1 error