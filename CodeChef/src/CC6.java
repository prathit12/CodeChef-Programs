import java.util.Scanner;

public class CC6 {
    public static void main(String[] args) {
        int toatal_cases;long number ;
        Scanner sc = new Scanner(System.in);
        toatal_cases = sc.nextInt();
        while (toatal_cases >0){
            CC6 cc6 = new CC6();
            number = sc.nextLong();
            long l = 9,h=100000000000000000L;
            long mid , max = 0;
            while (l<h) {
                mid = (l + h) / 2;
                long steps = cc6.count(mid);
                if (steps == number){
                    max=Math.max(max,mid);
                    l=mid-1;
                }
                else if(steps>number){
                    h=mid-1;
                }
                else{
                    l=mid+1;
                }

            }
            System.out.println(max);
            toatal_cases--;
        }
    }
    long count(long n){
        long temp = n, last=0;
        int p=-1;
        while (temp>0){
            last=temp%10;
            temp=temp/10;
            p++;
        }
        if(n<10){
            return  2;
        }
        long rem = n-last*(long)Math.pow(10,p);
        long steps =2;
        while (true){
            steps+=rem/last+1;
            rem=rem%last;
            if (last > 0) {
                rem=(long)Math.pow(10,p)+rem-last;
            }
            last--;
            if (last==0){
                p--;
                last=9;
                rem = rem -last*(long)Math.pow(10,p);
            }
            if(rem==0)
                break;
        }
        return steps;
    }
}

