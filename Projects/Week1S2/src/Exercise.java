import java.util.Arrays;


public class Exercise {

    public static void main(String[] args) {
        e5();
    }

    public static void e1() {
        // Declaración
        String[] arr;

        // Declaración + inicialización.
        String[] arr1 = {"valor1", "Valor2", "Valor3"};

        System.out.println(arr1[5]);
//        [0][1][2]

    }

    public static void e2() {
        int[] numbers = { 4, 2, 7 };

        numbers = new int[4];
        numbers[0] = 4;
        numbers[1] = 2;
        numbers[2] = 7;
        numbers[3] = 6;



        numbers[2] = 100;

        Arrays.sort(numbers);
        String result = Arrays.toString(numbers);
        System.out.println(result);

    }

    public static void e3() {
        String[] names = {"Cristina", "Paul", "Maria", "John"};
        System.out.println("==== For ====");
        for (int i = names.length-1; i >= 0; i--) {
            System.out.println(names[i]);
        }
    }


    public static void e4() {
        String[] names = {"Cristina", "Paul", "Maria", "John"};
        System.out.println("==== Foreach ====");
        for (String name : names) {
            System.out.println(name);
        }
    }
    public static void e5() {
        String[] names = {"Cristina", "Paul", "Maria", "John"};
        System.out.println("==== While ====");
        int i =0;
        while(i < names.length) {
            //i = i + 2;
            System.out.println(names[i]);
            i += 2;
        }
    }

    public static void e6() {
        String[] names = {"Cristina", "Paul", "Maria", "John"};
        System.out.println("==== Do while ====");
        int i = 0;
        do {
            System.out.println(names[i++]);
        } while(i < names.length);
    }
}
