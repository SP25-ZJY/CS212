package lecture_note_13_14;

public class Fibo{

    public static long fibo(int n){
        if(n==1 || n ==2){
            return 1;
        }
        else{
            return fibo(n-1) + fibo(n-2);
        }


    }


    public static void main(String[] args){


        System.out.println(fibo(50));


    }

}