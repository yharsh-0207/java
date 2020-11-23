public class Exp_12_SumEven {
    public static void main(String[] args) {
        int i=0,sum=0,count=0;
        do{
            sum=sum+i;
            i=i+2;
            count=count+1;
        }while(count<=10);
        System.out.println("Sum of first 10 even numbers is "+sum);
    
    }
}