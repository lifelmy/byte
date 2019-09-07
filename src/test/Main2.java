package test;


import java.util.Scanner;
import java.util.TreeMap;
import java.util.TreeSet;

public class Main2 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        TreeSet<Integer> set=new TreeSet<>();


        while (scanner.hasNextInt()){
            int count=scanner.nextInt();

            for (int i = 0; i <count ; i++) {
                int temp=scanner.nextInt();
                if(!set.contains(temp)){
                    set.add(temp);
                }
            }
            while (!set.isEmpty()){
                System.out.println( set.pollFirst());
            }
            set.clear();
        }


        
        
    }
}
