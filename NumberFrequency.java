import java.util.Scanner;
public class NumberFrequency {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] numbers={10, 20, 10, 30, 40, 10, 20, 50};
        System.out.print("Enter a number to search:");
        int search=sc.nextInt();
        int count=0;
        boolean found=false;
        for (int i=0;i<numbers.length;i++) {
            if (numbers[i]==search) {
                count++;
                found=true;
            }
        }
        if(found){
            System.out.println("Number appears "+count+" times.");
        } else {
            System.out.println("Number not found");
        }
        sc.close();
    }
}
