import java.util.Scanner;

public class b1 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("What is the limit do you want to print?");
        int limit=s.nextInt();
        int i=2;
        while(i<=limit){
            int temp=2;
            while(temp<i){
                if (i%temp!=0){
                    temp++;
                }else{
                    break;
                }
            }
            if (temp==i){
                System.out.println(i);
            }
            i++;

        }
    }
}