//Throwing Our Own Error Using Throw
//Throw Keyword
class NotJaganException extends Exception{
    public NotJaganException(String s){
      super(s);
    }
}
//Throws Keyword
class Throwkey{
    void disp() throws Exception{  //After an methods we should use throws exception
        int a = 10/0;
    }
}
public class ExceptionHandle {

    public static void main(String[] args){
//        If Some of the Statements Can Make Error That is known By us is known as Exception try and catch
        Throwkey tk = new Throwkey(); // object creation for throws keyword
        try{
            int i =10/2;
            System.out.println("Success");
            throw new NotJaganException("Naan Thaan Da Leo Error");
        }
        catch(Exception e){
            System.out.println("Something Has Happened" + e);
        }
//        Finally Keyword is Used to Print Whatever the try catch block executed it is just constant
        finally {
            System.out.println("Try Catch Executed Bro");
        }
        try{
           tk.disp();
        } catch (Exception e) {
            System.out.println("Kiki Error Bro");
        }
    }
}
