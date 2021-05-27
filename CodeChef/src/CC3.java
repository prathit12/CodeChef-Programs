/* Create a super class named area has parameter L and B & R, craete two constructor and intialiaze as shown in figure
create 3 methods ,Circle and rectangle and square, will print
 */
/*create another class calc and extends super class , create another class main

 */
/*
Craete another class calculate1 , which extends calculate in main
 */
class Area{
    int L, B, R;
    Area(int Y, int Z) {
        L=Y;
        B=Z;
        }
    Area(int X)
    {
        R=X;
    }
    void Circle(){
        float A = (float) (3.14 * R * R);
        System.out.println("Area of circle is "+A);
    }
    void Rectangle(){
        float A = (float) (L*B);
        System.out.println("Area of Rectangle is "+A);
    }
    void Square() {
        float A = (float) (L * L);
        System.out.println("Area of Square is "+A);
    }
}
class Calculate extends Area {
    Calculate(int Y, int Z) {
        super(Y, Z);
    }
    Calculate(int X){
        super(X);
    }
}
class Calculate1 extends Calculate {
    Calculate1(int X,int Y, int Z) {
        super(Y,Z);
        super.R=X;

    }
}
public class CC3 {
        public static void main(String[] args) {
            Calculate1 ob = new Calculate1(20, 30, 50);
            ob.Circle();
            ob.Rectangle();
            ob.Square();
        }
    }

