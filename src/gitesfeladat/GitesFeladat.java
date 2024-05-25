
package gitesfeladat;


public class GitesFeladat {


    public static void main(String[] args) {
        osszegzesTetele();
    }

    private static void osszegzesTetele() {
        int[] tomb = {3, 5, 6, 7};
        int osszeg = 0;
        for (int i = 0; i < tomb.length; i++) {
            osszeg += tomb[i];
        }
        System.out.println("tomb elemeinek osszege: " + osszeg);
    }
    
}
