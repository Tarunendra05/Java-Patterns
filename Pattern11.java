class Pattern11 {
    public static void main(String arg[]) {
        int n = 1;
        for(int i=5; i>=1; i--) {
            for(int j=1; j<=i; j++) {
                System.out.print(" ");
            }
            for(int j=1; j<=5-i+1; j++) {
                System.out.print(" "+n);
            }
            System.out.println();
            n++;
        }
    }
}