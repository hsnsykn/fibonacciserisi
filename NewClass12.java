/**Fibonacci serisi
 * 1 1 2 3 5 8 13 21 34 55 89
 *
 * @author soyka
 */
public class NewClass12 {
    public static void main(String[] args) {
        long s1= 0 ,s2 =1;
        System.out.println(s1+ " | " + s2);
        for(int k=2;k<50;k++  ){
            long ys = s1 + s2;
            System.out.println("|" + ys);
            s1=s2;
            s2=ys;
        }
        
        
    }
    
}
