public class printNumbers {
    public static void printNum(int n){
        for (int i = 0;i<n;i++){
           
            for (int j=0;j<n;j++){
                System.out.println(i+" "+j);
            }
        }
     
    }
    public static void main(String[] args) {
        printNum(10);
    }
}
