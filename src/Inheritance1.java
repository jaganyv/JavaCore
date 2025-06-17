public class Inheritance1 {
    class Vehicle{
        protected String modelName = "Ford";
        public void honk(){
            System.out.println("Tutt tutt");
        }
    }

    class Cars extends Vehicle{
        public String modelVariant = "Mustang";
    }
    public static void main(String[] args){
//        Cars myCar = new Cars();
//        myCar.honk();
        

    }
}
