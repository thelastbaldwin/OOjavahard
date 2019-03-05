public class SquareRootTester {
    public static void main( String[] args){
        SquareRootFinder sqrt = new SquareRootFinder();

        double max = 0, maxN = 0;
        double fakeroot, realroot, diff;

        System.out.print("Testing square root algorithm...");
        for(double n = 0; n <= 2000; n+= 0.01){
            sqrt.setNumber(n);
            fakeroot = sqrt.getRoot();
            realroot = Math.sqrt(n);
            diff = Math.abs(fakeroot - realroot);
            if(diff > max){
                max = diff;
                maxN = n;
            }
        }

        if (max > 0.000001){
            System.out.println("FAIL");
            System.out.println("Worst difference was " + max + " for " + maxN);
        } else {
            System.out.println("PASS");
        }
    }
}