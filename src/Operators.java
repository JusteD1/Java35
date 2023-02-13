public class Operators {
    public static void main(String[] args) {

        //Basic arithmetic operators -, +, *, /, %
        int x = 100;
        x = x % 3;
        System.out.println(x);

        //Assignment operator =, -=, +=, *=, /=
        int a = 10;
        a = 20;
        a += 20;
        System.out.println(a);

        //Incrementation operators and Decrementation operators

        int i = 10;
        i--;
        System.out.println(i);

        //Post-incrementation
        int num1 = 10;
        System.out.println(++num1);
        System.out.println(num1);

        //Pre-incrementation
        int num2 = 10;
        System.out.println(++num2);
        System.out.println(num2);

        // 4 ways to increment by one
        num1 = num1 +1;
        num1 +=1;
        num1++;
        ++num1;

        //Relational operators

        //Equality ==
        int p = 10;
        int k = 10;
        System.out.println("Equality" + (p==k));

        //Inequality !=
        System.out.println("Inequality" + (p!=k));

        //Greater than > and greater than or equal to >=
        System.out.println("Greater than" + (p>k));
        System.out.println("Greater than or equal to" + (p>=k));

        //Less than < and greater than or equal to <=
        System.out.println("Less than" + (p<k));
        System.out.println("Less than or equal to" + (p<k));

        //Logical operators
        //Logical AND - &&

        boolean sun = true;
        boolean dry = true;

        System.out.println("I will go outside" + (sun && dry));

        int bobsAge = 8;
        int johnAge = 11;
        int annaAge = 10;

        //Is John older than Bob and younger than Anna?
        System.out.println((johnAge > bobsAge) && (johnAge< annaAge));

        //Logical OR - ||

        boolean sale = true;
        boolean rich = true;

        System.out.println("I will buy iPhone" + (sale || rich));

        //Negation
        boolean example = true;
        System.out.println(!example);






    }
}
