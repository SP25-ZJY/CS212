package lecture_note_8_9;

public class SeriesSum{

    public static int seriesSum(int n){
        int sum = 0;
        for(int i = 0; i<=n; i++){
            sum+=i;
        }

        return sum;
    }

    public static int seriesSumFaster(int n){
        int sum = (n*n+n)/2;
        return sum;
    }


    public static void main(String [] args){

        if(args.length != 1){
            return;
        }

        //Use CLI to get the value of N
        int n = Integer.parseInt(args[0]);
        System.out.println("n is: " + n);

        //time regular series sum
        long startTime_ns = System.nanoTime();
        seriesSum(n);
        long endTime_ns = System.nanoTime();
        
        System.out.println("seriesSum() took "+(endTime_ns - startTime_ns) + " ns");

        //time faster series sum
        startTime_ns = System.nanoTime();
        seriesSumFaster(n);
        endTime_ns = System.nanoTime();

        System.out.println("seriesSumFaster() took "+(endTime_ns - startTime_ns) + " ns");
        

    }
}

