package klass;

public class aula_3_class_method {
    public static void main(String[] args) {
        Aula3 aula3 = new Aula3();
        aula3.m1("3.0");
        aula3.m1("Julio");
        aula3.m1("Marco");
        aula3.m2("farinha",4);
        aula3.m3(4,2);




        // farinha
        // | f | a | r | i | n | h | a
        // | 0 | 1 | 2 | 3 | 4 | 5 | 6
        // | 0 -> f | a | r | i | n | h | a
        // | 2 ->  r | i | n | h | a
        // | 6 -> a
        // | 10

        // String s1
        // s1.substring(s2)

    }


    //void nome(){
        //if(saldo > 0){
              // saldo--;
        //  }
    // }
    
    // void nome(tipo nome, tipo nome, tipo nome... )
    
}

class Aula3{

    void m1(String s){
        System.out.println(s);
    }
    
    void m2(String s1, int s2){
        System.out.println(s1.substring(s2));
    }
    void m3(int i1,int i2){
        System.out.println(i1 + i2);
    }
}

