package pack2;
import pack1.Protection;

class OtherPackage {
    OtherPackage(){
        Protection P=new Protection();
        System.out.println("Inside SamePackage....");
        //System.out.println("Pri_n: " + P.pri_n);    
        //System.out.println("n: " + P.n);
        //System.out.println("Pro_n: " + P.pro_n);
        System.out.println("Pub_n: " + P.pub_n);
        System.out.println(("-----------------------"));
    }
}
