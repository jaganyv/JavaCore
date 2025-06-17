public class Encapsul {
    private String name;
    private int num;
    public Encapsul(String name,int num){
        this.name = name;
        this.num = num;
    }
    public String getName(){
        return name;
    }
    public void setNum(){
        this.num = num;
    }
    public int num(){
        return num;
    }
    public void accelerator(){
        num+=10;
        System.out.println(name + "is Acceleration speed:" + num);
    }
    public static void main(String[] args){
        Encapsul obj1 = new Encapsul("BMW",200);
        obj1.accelerator();
    }
}
