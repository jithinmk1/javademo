public class PowerK {
    public static void main(String[] args){
        System.out.println(powerK(4,2));
    }
    public static boolean powerK(int k,int n){
        double result=Math.pow(n,n);
        if(result==k){
            return true;
        }
        return false;
    }
}
