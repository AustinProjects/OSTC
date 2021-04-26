public class Start {
    public static void main(String[] args) {
        int[] array = { 1, 4, 3, 6 };
        int what    = 0;

        // scan the array
        for ( int index=0; index < array.length; index++ )
        {
            what = what + array[ index ] ;
        }
        System.out.println( what );
    }

}
