public class Main {
    public static void main(String[] args) {

        /*ciklai:
        for
        foreach
        while
        do while
        (js kalboje)
        forin
        forout
         */

        for (int i = 0; i < 5; i++) {
            System.out.println("labas");
        }
        System.out.println("------------------");


        for (int i = 0; i < 5; i++) {
            System.out.println(i);
        }
        System.out.println("------------------");
        for (int i = 0; i < 5; i++) {
            if(i == 2){
                continue;
            }
            System.out.println(i);
        }
        System.out.println("------------------");
        for (int i = 0; i < 5; i++) {
            if(i == 3){
                break;
            }
            System.out.println(i);
        }
        System.out.println("-------extra-----");

        for (int i = 2; i < 5; i++) {
            System.out.println(i);
        }

        System.out.println("-------reverse-----");

        for (int i = 5 - 1; i >= 0; i--) {
            System.out.println(i);
        }
        System.out.println("-------a...-----");

        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }
        System.out.println("-------a...-----");

        System.out.println(7 / 4);// 1
        System.out.println(7 % 4);// 7 - 4 = 3;
        System.out.println(13 % 2);// 13 - 2 = 11;9;7;5;3;1
        System.out.println(5 % 2 == 0);//neporinis
        System.out.println(6 % 2 == 0);//porinis
        System.out.println("-------...-----");

        int i = 0;
        for (  ; i < 5 ; ) {
            System.out.println(i);
            i++;
        }

        System.out.println("-------...-----");

        int a = 0;
        for (  ; a < 5 ; ) {
            a++;
            System.out.println(a);
        }
        int b = 0;

        for (  ; true; ) {
            System.out.println(b);
            b++;
            if(b > 5){
                break;
            }
        }
        System.out.println("-------...-----");

        int counter = 0;
        while (true){
            counter++;
            System.out.println(counter);
            if (counter >= 5){
                break;
            }
        }
        long count = 0;
      //  for (int j = 0; j < 100000000; j++) {

        while (true){
            int dice = 1 + (int) Math.round(Math.random() * 5);
            int dice2 = 1 + (int) Math.round(Math.random() * 5);
            count++;
            if(dice == 1 && dice2 == 1){
       //         System.out.println("Snake eyes!");
                break;
            }
        }
     //   System.out.println(count);
       // }
        System.out.println(count / 100000000.0);


        do{
            System.out.println("Hallo");
        }while(false);

        int o = 0;
        boolean shouldContinue = true;
        while (shouldContinue){
            o++;
            if(o == 5 ){
               shouldContinue = false;
            }
            System.out.println(o);
        }

        System.out.println();
        System.out.println();
        System.out.println("--------------- daugybos lentele --------------");
        for (int y = 1; y < 11; y++) {
            for (int x = 1; x < 11; x++) {
                System.out.print(y * x + " ");
            }
            System.out.println();
        }

        System.out.println();
        System.out.println();
        System.out.println();

        int number = 18;
        int[] numbers = new int[5];
        System.out.println(numbers[0]);
        System.out.println(numbers[1]);

        numbers[0] = 26;
        numbers[1] = 14;
        System.out.println(numbers[0]);
        System.out.println(numbers[1]);

        int[] grades = {5,7,10,9,8,4,5,10,9};

        System.out.println(grades[0]);
        System.out.println(grades[1]);
                    // 012345
        String name = "Naglis";
        for (int j = 0; j < name.length(); j++) {
            System.out.println(j);
        }
        for (int j = 0; j < name.length(); j++) {
            System.out.println(name.charAt(j));
        }

        for (int j = 0; j < name.length(); j++) {
            System.out.println("name.charAt("+j+")");
        }

        for (int j = 0; j < grades.length; j++) {
            System.out.println(grades[j] + "<--- grades["+j+"]");
        }

        System.out.println(grades[4]);

        String[] students = new String[13];
        students[0] = "Aivaras";
        students[1] = "Egidijus";
        students[5] = "Eulalija";
        students[3] = "Simonas";
        students[4] = "Giedrius";

        for (int j = 0; j < students.length; j++) {
            System.out.println("labas " + students[j]);
        }
        System.out.println("------------------------------");
        for (int j = 0; j < students.length; j++) {
            if (students[j] == null){
                continue;
            }
            System.out.println("labas " + students[j]);
        }




    }
}