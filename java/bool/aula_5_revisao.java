package bool;

public class aula_5_revisao {
    public static void main(String[] args) {
        int x = 10;
        double y = 2.2;
        double z = y+x;
        System.out.println("O resultado " + z);

        System.out.println(z >= x);
        if (x > z){
            System.out.println("x < z");
        }else{
            System.out.println("x > z");
        }
        if (x < z && x > y){
            System.out.println(x < z && x > y);
        }
        if (x < z || x < y ){
            System.out.println(x < z || x < y );
        }
        if (x < y || z < y ){
            System.out.println(x < y || z < y );
        }
    }
}
