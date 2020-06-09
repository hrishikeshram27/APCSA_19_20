import java.util.*;
public class Proj2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int one = sc.nextInt();
        int two = sc.nextInt();
        double div = (double) one / two;

        List<Integer> digits = new ArrayList<>(1);
        digits.add((int)((div*10)%10));

        boolean stop = false;
        int counter = 2;
        while(!stop){
            int digit = (int)((div*Math.pow(10,counter))%10);
            if(!digits.contains(digit)){
                digits.add(digit);
                counter++;
            }else{
                stop = true;
            }
        }

        while(digits.contains(0)){
            digits.remove((Integer) 0);
        }

        System.out.println("# of digits: " + digits.size());
        System.out.print("Decimal Representation: 0.");
        for (Integer digit : digits) {
            System.out.print(digit);
        }
    }
}
