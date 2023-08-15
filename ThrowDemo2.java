public class ThrowDemo2 {
    
    static int divide(int a, int b){
        try{
        int result=a/b;
        return result;
        }catch(Exception e){
            System.out.println("Caught by catch of divide....");
            System.out.println(e);
            throw e;
        }
    }

    public static void main(String[] args){
        
        int num1=10;
        int num2=0;
        
        try{
        divide(num1,num2);
        }catch(ArithmeticException e){
            System.out.println("Caught by catch of main....");
            e.printStackTrace();
        }

        System.out.println("Exiting main....");
    }
}
