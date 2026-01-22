import java.util.Scanner
class Problem3{


  static int add(int a,int b){
    return a+b;
  }

  static boolean iseven(int a){
    if(a%2==0){
      return True;
    }
    else{
      return False;}

  static int factorial(int a){
    fact=1;
    for(int i=1;i<=a;i++){
    fact=fact*i;
  }
    return fact;
  }
  
  
  public static void main(String[] args){
    Scanner a=new Scanner(system.in);
    Scanner b=new Scanner(system.in);
    System.out.println("enter a to add");
    int a1=a.nextInt();
    System.out.println("enter b to add");
    int a2=b.nextInt();
    int sum=add(a1,a2);
    System.out.println("sum is" sum);

    Scanner c=new Scanner(system.in);
    System.out.println("enter a number to check even or odd");
    int a3=c.nextInt();    
    eo=iseven(a3);
    System.out.println("given number is" + eo);


    Scanner d=new Scanner(system.in);
    System.out.println("enter a to add");
    int a4=d.nextInt();
    fact=factorial(a4);
    System.out.println(fact);

  }
  
      
