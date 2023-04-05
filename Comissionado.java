public class Comissionado extends Empregado {

    double totalDeVendas;
    double taxaComissao;
    double salario;

    public Comissionado(String nome, String sobrenome, int cpf) {
        super(nome, sobrenome, cpf);
    }
    public double vencimento(double totalDeVendas, double taxaComissao){
        this.totalDeVendas = totalDeVendas;
        this.taxaComissao = taxaComissao;
        double salario ;
        salario = (totalDeVendas -((100-taxaComissao)/100)*totalDeVendas);
        this.salario = salario;
        return salario;
    }

    public String toString(){
        return "Nome:" +nome + " " +"Sobrenome:" +sobrenome + " " +"Cpf:" +cpf + " " +"Salario:"+ salario;
    }
}
