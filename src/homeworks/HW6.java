package homeworks;

public class HW6 {
    public static void main(String[] args) {

       /*Write an application, that will print the full latin alphabet
        (upper case letters) in alphabetical order. Each letter should be printed in new line
        */

        // for (int number = 65; number <91; number++){
        //
        //        }

        Integer[] fullAlphabet = new Integer[]{65, 66 ,67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90};



         for (int letter : fullAlphabet){
            System.out.println((char)letter);
        }

        }



    }

