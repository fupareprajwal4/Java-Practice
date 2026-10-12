class Human{

    private int age;
    private String name ;

    public void setAge(int a){
        age = a;
    }

    public void setName(String s){
        name = s;
    }

    public int getAge(){
        return age;
    }

    public String getName(){
        return name;
    }
}

public class Encapsulation{
    public static void main(String args[]){

        Human obj = new Human();
        obj.setAge(12);
        obj.setName("Prajwal");

        System.out.println("AGE : " + obj.getAge() + "NAME : " + obj.getName());
    }
}