import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap so can chuyen sang chu:");
        int number = scanner.nextInt();
        int ones = number %10;
        int tens = (number /10) %10;
        int hunder = (number/ 100)%10;
        if (number < 0 || number >999) {
            System.out.println("so khong hop le");
        }else if(number == 0){
            System.out.println("zero");
        }else if(number<20){
            switch (number){
                case 11: System.out.print("eleven");break;
                case 12: System.out.print("twelve");break;
                case 13: System.out.print("thirteen");break;
                case 14: System.out.print("fourteen");break;
                case 15: System.out.print("fifteen");break;
                case 16: System.out.print("sixteen");break;
                case 17: System.out.print("seventeen");break;
                case 18: System.out.print("eightteen");break;
                case 19: System.out.print("nighteen");break;
            }
        }else if(number>=20){
            switch (hunder){
                case 1: System.out.print("one hunder");break;
                case 2: System.out.print("two hunder");break;
                case 3: System.out.print("three hunder");break;
                case 4: System.out.print("four hunder");break;
                case 5: System.out.print("five hunder");break;
                case 6: System.out.print("six hunder");break;
                case 7: System.out.print("seven hunder");break;
                case 8: System.out.print("eight hunder");break;
                case 9: System.out.print("night hunder");break;
            }
            switch (tens){
                case 2: System.out.print("twenty");break;
                case 3: System.out.print("thirty");break;
                case 4: System.out.print("fourty");break;
                case 5: System.out.print("fifty");break;
                case 6: System.out.print("sixty");break;
                case 7: System.out.print("seventy");break;
                case 8: System.out.print("eightty");break;
                case 9: System.out.print("nightty");break;
            }
            switch (ones){
                case 1: System.out.print(" one");break;
                case 2: System.out.print(" two");break;
                case 3: System.out.print(" three");break;
                case 4: System.out.print(" four");break;
                case 5: System.out.print(" five");break;
                case 6: System.out.print(" six");break;
                case 7: System.out.print(" seven");break;
                case 8: System.out.print(" eight");break;
                case 9: System.out.print(" night");break;
            }

        }
    }
}











//        String[] ones = {"one", "two", "three", "four", "five", "six", "seven", "eight", " night", "ten",
//                "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eightteen", "nightteen"};
//        String[] tens = {"twenty", "thirty", "forty", "fifty", "sixty", "seventy", "eightty", "nightty"};