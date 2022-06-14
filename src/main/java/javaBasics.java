public class javaBasics {

    int a=1;

    float b=1.5f;

    char d='s';

    String s1="naveen";
    String s2="America@342";


    public void add(){
        int a=1;
        int b=2;
        int c=a+b;
        System.out.println(c);
    }

    public  void addition(int a,int b){
        int c= a+b;
        System.out.println(c);
    }

    public static void sub(int a,int b){
        int c=a-b;
        System.out.println(c);
    }

    public void mul(int a,int b){
        int c=a*b;
        System.out.println(c);
    }

    public static void main(String[] args) {
        javaBasics obj=new javaBasics();
        obj.add();
        obj.addition(10,20);
        obj.addition(30,40);
        javaBasics.sub(30,20);
        obj.mul(10,20);
    }
}
