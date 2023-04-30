class Pattern9 {
    public static void main(String arg[]) {
        int m = 0;
        int n = 1;
        for(int i=1; i<=5; i++) {
            for(int j=1; j<=i; j++) {
                if((i+j) % 2 == 0) {
                    System.out.print(n+" ");
                }
                else {
                    System.out.print(m+" ");
                }
            }
            System.out.println();
        }
    }
}