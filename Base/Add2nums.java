package Base;

class Add2nums {
    int a ;
    int b ;
    int L  ;

    public Add2nums(int a, int b, int L) {
        this.a = a;
        this.b = b;
        this.L = L;
    }

    public static void main(String[] args) {

        Add2nums ADDED = new Add2nums(20,600,500);

        System.out.println(ADDED.a);
        System.out.println(ADDED.a+ ADDED.b+ ADDED.L);
    }
}