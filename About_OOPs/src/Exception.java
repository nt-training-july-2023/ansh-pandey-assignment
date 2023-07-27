public class Exception {
    public static void main(String[] args) {

        // using try catch
        try{
            int a =55;
            int b=55/0;
        }
        catch (NullPointerException e){
            System.out.println("Handled");
        }
        finally {
            System.out.println("It will always print");
        }
        System.out.println("it willl print or not");
    }
}
