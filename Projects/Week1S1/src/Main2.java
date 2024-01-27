public class Main2 {

    public static void main(String[] args) {
        // ex2();

        String str = "Me llamo Luis";
        String str2 = str.toUpperCase();
        System.out.println(str);


    }


    public static void ex1() {
        System.out.println("other message");
        // Data types
        int var1 = 2147483647;
        double var2 = 5.5;
        String var3 = "Hello World";
        System.out.println(var1);
        System.out.println(var2);
        System.out.println(var3);
    }

    public static void ex2() {
        // Operators
        System.out.println(10 + 5);
        System.out.println(10 - 5);
        System.out.println(10 * 5);
        System.out.println(10 / 2);
        System.out.println(10 % 2);

        int var5 = 1;
        System.out.println(++var5); // Show differences between var5++ and ++var5
        System.out.println(var5);


        String str = 6 > 5 ? "mayor" : "menor";
        if (6>5) {
            str = "mayor";
        } else {
            str = "menor";
        }

    }
}
