public class Poly_morphism {
    int num1(int a,int b){
        return a+b;
    }
    double num2(int a,int b){
        return a+b;
    }
   float num3(int a,int b){
        return a+b;
   }
    public static void main(String[] args){
        Poly_morphism pm = new Poly_morphism();
        System.out.println(pm.num1(10,20));
        System.out.println(pm.num2(20,30));
        System.out.println(pm.num3(20,30));
    }
}
