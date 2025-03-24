public class UncheckedException {
    public static void main(String[] args) {

        int [] arr = {34,35,562,20,50};
        try{

        for (int i = 0 ; i <= arr.length; i++) {
            System.out.println("Element at index " + i + " " + arr[i]);
        }
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Invalid index, please check code" +e.getMessage());

        }
        UncheckedException exp = new UncheckedException();
        try {
            System.out.println(exp.divide(10, 2));
            System.out.println(exp.divide(10, 0));
            System.out.println(exp.divide(10, 1));
        }catch (ArithmeticException a){
            System.out.println("Nahi hoga Divide" +a.getMessage());
        }finally{
            //nested catch se exception handle ho jayega finally block.
            //direct method me try catch lagane se code me lagane ki jarurat nahi padta h.
            System.out.println("Hello from finally block");
        }
        System.out.println(exp.divide(10, 5));
    }

    public int divide(int num1, int num2){

        return num1/num2;
    }
}
