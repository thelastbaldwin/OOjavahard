class InterfacePleaser3 implements ArbitraryInterface {
    public double getNumber(){
        return 80085.0;
    }

    public void doSomething(int n){
        for(int i = n; i > 0; i--){
            String b = i == 1 ? "bottle" : "bottles";
            System.out.println(i + " " + b + " of beer on the wall");
            System.out.println(i + " " + b + " of beer");
            System.out.println("take one down, pass it around");
            System.out.println(i + " " + b + " of beer on the wall");
        }
    }
}