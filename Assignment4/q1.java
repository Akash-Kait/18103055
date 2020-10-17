package ass4;
import java.util.*;

public class q1 {

    public static boolean desired(String[] crops, int n, int m) {
        for(int i=0;i<n;i++) {
            for(int j=0;j<m;j++) {
                int C = crops[i].charAt(j);
                int R = j+1<m ? crops[i].charAt(j+1) : -1;
                int L = j-1>=0 ? crops[i].charAt(j-1) : -1;
                int D = i+1<n ? crops[i+1].charAt(j) : -1;
                int U = i-1>=0 ? crops[i-1].charAt(j) : -1;

                if((C == D && C!=(int)'#') || (C == R && C!=(int)'#') || (C == L&& C!=(int)'#') || (C == U&& C!=(int)'#')) {
                    return false;
                }
            }
        }
        return true;
    }

    @SuppressWarnings("unused")
	public static int replant(String[] crops, int n, int m, int x, int y) {
        for(int i=x;i<n;i++) {
            for(int j=y;j<m;j++) {

                int C = crops[i].charAt(j);
                int R = j+1<m ? crops[i].charAt(j+1) : -1;
                int L = j-1>=0 ? crops[i].charAt(j-1) : -1;
                int D = i+1<n ? crops[i+1].charAt(j) : -1;
                int U = i-1>=0 ? crops[i-1].charAt(j) : -1;

                if((C == D && C!=(int)'#') || (C == R && C!=(int)'#') || (C == L&& C!=(int)'#') || (C == U && C!=(int)'#')) {
                    String saved = crops[i];

                    crops[i] = crops[i].substring(0,j)+'#'+crops[i].substring(j+1, m);
                    int ans1 = 0;
                    if(j+1<m) ans1 = replant(crops, n, m, i, j+1)+1;
                    else ans1 = replant(crops, n, m, i+1, 0)+1;

                    crops[i] = saved;
                    int ans2 = 0;
                    if(j+1<m) ans2 = replant(crops, n, m, i, j + 1);
                    else ans2 = replant(crops, n, m, i+1, 0);

                    return Math.min(ans1, ans2);
                }
                else {
                    if(j+1<m)
                        return replant(crops, n, m, i, j+1);
                    else
                        return replant(crops, n, m, i+1, 0);
                }
            }
        }
        if(desired(crops, n, m)) {
            return 0;
        }
        // only the real author can give reason for choosing this number.
        return 9976189;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of rows: ");
        int n = Integer.parseInt(sc.nextLine());
        System.out.println("Enter number of columns: ");
        int m = Integer.parseInt(sc.nextLine());
        System.out.println("Enter line separated strings: ");
        String[] crops = new String[n];
        for (int i=0;i<n;i++){
            crops[i] = sc.nextLine().trim();
            if(crops[i].length() != m) {
                System.out.println("Incorrect Input");
                return;
            }
            for(int j=0;j<m;j++) {
                if(crops[i].charAt(j)<'a' || crops[i].charAt(j)>'z') {
                    System.out.println("Incorrect Input");
                    return;
                }
            }
        }
        sc.close();
        System.out.println(replant(crops, n, m, 0, 0));
    }
}