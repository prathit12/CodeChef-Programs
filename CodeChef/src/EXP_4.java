import java.util.Scanner;
class EXP_4{
        public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);
            int number;
            number = sc.nextInt();
            int index=2;
            while((number/index)!= 1){
                if(number%index ==0){
                    System.out.println(index + ", ");
                    number/=index;
                }
                else{
                    index++;
                }
            }
            System.out.println(number +".");
        }

}
