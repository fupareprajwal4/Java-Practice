
 class Sen extends AdvCal {
    public static void main(String args[]){

        AdvCal obj = new AdvCal();
        int a = obj.add(34,4 );
        int b = obj.sub(3,4);
        int c = obj.mul(4,2);
        int d = obj.div(4,2);

        System.out.println(a + " " + b + " " + c + " " + d);
    }
}
