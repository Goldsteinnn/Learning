public class methods {
    public int addition(int x, int y){
        return x + y;
    }

    public int subtraction(int x, int y){
        return x - y;
    }
    public int multiplication(int x , int y){
        return x*y;
    }

    public int modu (int x, int y) {
        return x % y;
    }
    public int div (int x, int y){
        try{
            return x/y;
        }
        catch (ArithmeticException e){
            System.out.println("Cannot divide by zero");
            return 0;
        }
    }
}
