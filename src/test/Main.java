package test;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        while (scanner.hasNext()){
            int num=scanner.nextInt();
            if(num==0){
                return;
            }
            System.out.println(process(num));
        }
    }


    public static int process(int num){

        int left=num;
        int total=0;
        while (left>2){
            int temp=left/3;
            total+=temp;
            left=left-temp*3+temp;
        }

        if(left==2){
            total+=1;
        }
        return total;
    }


}
