public class Main {
    public static void main(String[] args) {

        Assalariado A = new Assalariado(" João", "Antunes", 256352);
        A.vencimento(5000);
        System.out.println("Assalariado: " + A);
         

        Comissionado B = new Comissionado(" Marcos", "Castro", 56864223);
        B.vencimento(1000, 5);
        System.out.println("Comissionado: "+ B);
        

        Horista C = new Horista(" Ana", "Maria", 96482432);
        C.vencimento(10, 50);
        System.out.println("Horista: " + C);
     

        
    }
}
