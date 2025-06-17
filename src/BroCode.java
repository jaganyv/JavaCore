//import javax.swing.JOptionPane;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Random;
public class BroCode {

    public static void main(String[] args){
//        String name = JOptionPane.showInputDialog("Enter Your Name");
//        JOptionPane.showMessageDialog(null,"Hello"+name);
//
//        int age = Integer.parseInt(JOptionPane.showInputDialog("Enter Your Age"));
//        JOptionPane.showMessageDialog(null,"You are" + age + "Years old");
//
//        double height = Double.parseDouble(JOptionPane.showInputDialog("Enter Your Height"));
//        JOptionPane.showMessageDialog(null,"Your Height is"+height +"cm");
//        double x;
//        double y;
//        double z;
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter the side z:");
//        x = scanner.nextInt();
//        System.out.println("Enter the side y:");
//        y = scanner.nextInt();
//        System.out.println("The Size of the Hypotensize is:");
//        x = Math.sqrt((x*x)+(y*y));
//        System.out.println(x);
//
//        Random random = new Random();
//        int l = random.nextInt(6)+1;
//        System.out.println(l);

        Scanner scan = new Scanner(System.in);
//        int rows;
//        int columns;
//        String symbol = "";
//        System.out.println("Enter the Number Of Rows:");
//        rows = scan.nextInt();
//        System.out.println("Enter the Number of columns");
//        columns = scan.nextInt();
//        System.out.println("Enter the symbol to Print");
//        symbol = scan.next();
//
//        for(int i=1;i<=rows;i++){
//            System.out.println();
//            for(int j=1;j<=columns;j++){
//                System.out.print(symbol);
//            }
//        }

//        String name = "";
//        while(name.isBlank()){
//            System.out.println("Enter Your Name:");
//            name = scan.nextLine();
//        }
//        System.out.println("Hello "+ name);

//        Arrays In Java Bro Code = Used to store multiple values to single variable
//          String[] cars = new String[5];
//          cars[0] = "BMW";
//          cars[1] = "BENZ";
//          cars[2] = "ROLLS";
//          cars[3] = "ROYCE";
//          cars[4] = "LAMBO";
//
//          for(int i=0;i<=cars.length;i++){
//              System.out.println(cars[i]);
//          }
//
//  2D Array
//        String[][] cars = {
//                {"BMW","ROLLS","LAMBO"},
//                {"TESLA","FERRARI","BENZ"},
//                {"AUDI","F-150","CAMERO"}
//        };
//
////        for(int i=0;i< cars.length;i++){
////            System.out.println();
////            for(int j=0;j<cars[i].length;j++){
////                System.out.println(cars[i][j]+""); i=rows j=columns of an array
//        ArrayList<String> animal = new ArrayList<String>();
//        animal.add("DOg");
//        animal.add("Cat");
//        animal.add("Bird");
//
//        for(String i:animal){
//            System.out.println(i);
//        }

//        System.out.printf("%d This is an Format String",123); //Run and change the %d to understand if forgot
//            }
//        }
//          int i=0;
//          do{
//              i++;
//              System.out.println("Do While Loop Excuted");
//
//          }while(i<=5);
//
//          int myNum = 120;
//          double myDouble = myNum;
//          System.out.println(myDouble);
//
//          double myDouble1 = 120.00;
//          int myNum1 = (int) myDouble1;
//          System.out.println(myNum1);

        //Loop Through an Array Using forEach Loop
//        int[] age = {10,20,30,40,50,60};
//        float avg,sum=0;
//        int length = age.length;
//        for(int ages:age){
//            sum += ages;
//        }
//        avg = sum/length;
//        System.out.println("The Average is: " + avg);
//        int[] age = {10,20,30,40,7,8,1,0};
//        int length = age.length;
//        int lowestAge = age[0];
//        for(int ages: age){
//            if(lowestAge>ages){
//                lowestAge = ages;
//            }
//        }
//       System.out.println("The Lowest Age is: "+ lowestAge);

        //MultiDimnesional Array for loop
        int[][] numbers = {{1,2,3,4},{5,6,7}};
//        for(int i=0;i<numbers.length;i++){
//            for(int j=0;j<numbers[i].length;i++){
//                System.out.println(numbers[i][j]);
//            }
        for(int[] row: numbers)
        for(int i : row){
            System.out.println(i);
        }
    }

}
