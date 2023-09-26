package pack2;

class OtherPackage {
    OtherPackage(){
        pack1.Protection P=new pack1.Protection();
        System.out.println("Inside SamePackage....");
        //System.out.println("Pri_n: " + P.pri_n);    
        //System.out.println("n: " + P.n);
        //System.out.println("Pro_n: " + P.pro_n);
        System.out.println("Pub_n: " + P.pub_n);
        System.out.println(("-----------------------"));
    }
}
