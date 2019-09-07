package test;


public class Main3 {
    public static void main(String[] args) {


        System.out.println(process("0xA"));



    }

    public static int process(String str){
        String input=str.substring(2);
        int total=0;

        for (int i = 0; i <input.length() ; i++) {
            char temp=input.charAt(i);
            if(temp>='0'&&temp<='9'){
                total=total*16+temp-'0';
            }else {
                total=total*16+temp-'A'+10;
            }
        }
        return total;
    }


}
