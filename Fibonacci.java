class Fibonacci{

    public static int of(int num){
        if (num<=2) return 1;
        else return of(num-1)+of(num-2);
    } 
    public static void main(String[] args) {
        for(int num =1;num<=100;num++){
            System.out.println(Fibonacci.of(num));
        }
    }
}
