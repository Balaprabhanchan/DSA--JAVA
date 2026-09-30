
import java.util.Scanner;

public class Wealthycustomer {
    public int maximumWealth(int[][] accounts) {
        int max =0;
        
        for(int i = 0; i< accounts.length; i++) {
            int sum = 0;
            for(int j = 0; j< accounts[i].length; j++){
               sum += accounts[i][j]; 
            }
 
            if (sum>max){
                max = sum;
                
            }
            
        
        }
        return max;
    }
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Wealthycustomer o = new Wealthycustomer();
        int [][] customer_accounts= new int[3][3];
        for(int i = 0; i < customer_accounts.length; i++){
            for(int j = 0; j < customer_accounts[i].length; j++){
                customer_accounts[i][j]= input.nextInt();
            }
        }
        int output = o.maximumWealth(customer_accounts);
        System.out.println(output);
        input.close();
    }
}
