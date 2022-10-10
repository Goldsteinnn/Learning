public class Main {
    public static void main(String[] args){
        methods meth = new methods();
        int sum = meth.addition(1,2);
        System.out.println(sum);
        int sub = meth.subtraction(2,1);
        System.out.println(sub);
        int mult = meth.multiplication(2,0);
        System.out.println(mult);
    }
}