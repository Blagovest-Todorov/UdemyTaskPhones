public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");
        DeskPhone timsPhone;
        timsPhone = new DeskPhone(123456);
        timsPhone.powerOn();
        timsPhone.callPhone(123456);
        timsPhone.answer();

    }
}