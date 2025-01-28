import java.util.Scanner;
public class Prime{
   public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    sc.close();
    boolean isPrime= isPrime(n);
    if(isPrime){
      System.out.println("true (since "+ n + " is a prime number)" );
    } else{
      System.out.println("false (since "+ n + " is not a prime number)" );
    }
  }
public static boolean isPrime(int n){
  if(n<=1){
   return  false;
  }
   for(int i=2;i<n;i++){
    if(n%i==0){
      return false ;
     }
   }
    return true;
  }
}


  

