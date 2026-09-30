import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListEg {
    public static void main(String[] args) {
        ArrayList<ArrayList <Integer>> l = new ArrayList<>();
        //input
        Scanner input = new Scanner(System.in);
        System.out.println("enter number for input : ");
        for(int i = 0;i < 3; i++){
            l.add(new ArrayList<>());
                for(int j = 0; j < 3; j++){
                l.get(i).add(input.nextInt());
            }
            
        }
        System.out.println(l);
        input.close(); 


    }
    
}
