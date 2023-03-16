public class Add1 {
    public static void main(String[] args) {
        int n1 = 1;
        int n2 = 1;
        int n3 = 0;
        System.out.print(n1+" "+n2+" ");
        for(int i = 3; i <= 11; i++){
            n3=n1+n2;
            n1=n2;
            n2=n3;
            System.out.print(n3+" ");


    }
    }
}
