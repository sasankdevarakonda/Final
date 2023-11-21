public class phonePay extends Bank{
    void transfer(){
        System.out.println("phonepay transfer successfully");
    }
    public static void main(String[]args){
        phonePay ph = new phonePay();
        ph.transfer();
    }
}
