package pack1;

class SamePackage {
    SamePackage(){
        Protection P=new Protection();
        System.out.println("Inside SamePackage....");
        // System.out.println("Pri_n: " + new Protection().pri_n);      // this may call the variable but it creates a new object everytime
        System.out.println("n: " + P.n);
        System.out.println("Pro_n: " + P.pro_n);
        System.out.println("Pub_n: " + P.pub_n);
        System.out.println(("-----------------------"));
    }
}

