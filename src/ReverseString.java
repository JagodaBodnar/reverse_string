public class ReverseString {
    public static void main(String[] args) {
        System.out.printf("Version1: %s%n", reverse("cool"));
        System.out.printf("Version1 long string: %s%n", reverse("I love Java"));
        System.out.println("-----------------------------------------------------------");
        System.out.printf("Version2: %s%n", reverse2("cool"));
        System.out.printf("Version2 long string: %s%n", reverse2("I love Java"));
    }

    public static String reverse(String inputString) {
        String str = "";
        for (int i = inputString.length() - 1; i >= 0; i--) {
            str += inputString.charAt(i);
        }
        return str;
    }

    public static String reverse2(String inputString) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = inputString.length() - 1; i >= 0; i--) {
            stringBuilder.append(inputString.charAt(i));
        }
        return stringBuilder.toString();
    }
}
