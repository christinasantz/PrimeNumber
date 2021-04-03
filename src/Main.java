public class Main {
    public static void main(String[] args) {
        int i=1;
        while (i<100){
            int j;
            i++;
            for (j=2;j<=i;j++){
               if (i%j==0 && i!=j){
                   break;
               }
               System.out.println(i +" is prime!");
               break;
            }


        }
    }
}
