package Exception;

public class Test {
    public static void main(String[] args) {
        try{
         int a,b;
         a=10;
         b=10;
         int divide = a/b;
            System.out.println(divide);

         }
        catch(Exception e){
            System.out.println("This Error Showed");
            System.out.println(e.getMessage());
        }
        finally {
            System.out.println("The Final Way if run try or catch finally will always run");
        }
    }
}
