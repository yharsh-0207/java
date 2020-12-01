//Java program to overload constructors  
public class Studentoc{  
    int id;  
    String name;  
    int age;  
    //creating two arg constructor  
    Studentoc(int i,String n){  
    id = i;  
    name = n;  
    }  
    //creating three arg constructor  
    Studentoc(int i,String n,int a){  
    id = i;  
    name = n;  
    age=a;  
    }  
   public void display(){System.out.println(id+" "+name+" "+age);}  
   
    public static void main(String args[]){  
    Studentoc s1 = new Studentoc(58,"Harsh");  
    Studentoc s2 = new Studentoc(59,"Yadav",18);  
    s1.display();  
    s2.display();  
   }  
}
