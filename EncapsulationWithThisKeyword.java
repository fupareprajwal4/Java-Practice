class Demo{
    private int a ;
    private int b;

    public void  getData(int a , int b){
        this.a = a;
        this.b = b;
    }

    public int makeAdd(){
        return a+b;
    }

}


public class EncapsulationWithThisKeyword {
    public static void main(String a[]){
        Demo d = new Demo();

        d.getData(4,3);

        System.out.println("Output : " + d.makeAdd());
    }
}
