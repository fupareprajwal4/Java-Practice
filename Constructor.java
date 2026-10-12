class Human {

    private int age ;
    private String name;
    private int regno;

    public Human()
    {
         regno = 512;
         name = "Prajwal";
         age = 19;
    }

    public Human(int age , int regno , String name ){
        this.age = age;
        this.name = name;
        this.regno = regno;
    }
    public void display(){
        System.out.println("Name : "+ name);
        System.out.println("Reg No : " + regno);
        System.out.println("Age : " + age);
    }
}

public class Constructor{
    public static void main(String args[]){

        Human obj = new Human();
        obj.display();

        Human obj1 = new Human(10 ,512, "Prajwal");
        obj1.display();
    }
}

