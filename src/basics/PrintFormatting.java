package basics;

public class PrintFormatting {
    public static void main(String[] args) {

        //s- String
        //d- integer
        //f- float/double
        //c- char
        //b- boolean

        String name = "Bob";
        int age = 34;

        // \n- next line

        System.out.println("Hello " + name + " your age is " +age);
        System.out.printf("Hello %s your age is %d\n", name, age);

        // .2 means decimal places
        double height = 192.234253434d;
        System.out.printf("%s is %.2f cm tall\n", name, height);

        // Hello Bob your age is 34 and your height is 192.23. Good job Bob
        System.out.printf("Hello %1$s your age is %2$d and your height is %3$.2f cm.Good job %1$s", name, age, height);
    }
}
