public class Exercice1 {
    public  static  void afficheChars( char c , int n ){
        for ( int i = 0; i<=n ; i++ ){
            System.out.print(c);
        }
    }

    public static void afficheTriangle(int n) {
        for (int i=0; i<=n; i++) {
            afficheChars(' ', n-i );
            afficheChars('*', i);
            System.out.println();
        }
    }

     public static void main(String[] args ) {
        afficheTriangle(5);
    }
    
}
    
    

