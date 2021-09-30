public class Principal {

    public static void main(String args []){

        Funcionario f=new Funcionario();
        f.setNome("Gaby");
        f.setCpf("40711036802");
        f.setSalario(3500);
        f.setDepartamento("Recursos Humanos");

        System.out.println("O nome do funcionario é "+f.getNome());
        System.out.println("Seu CPF corresponde ao número "+f.getCpf());
        System.out.println("Seu salário é R$ "+f.getSalario());
        System.out.println("A funcionária pertence ao setor " +f.getDepartamento());
        System.out.println("A funcionária tera uma bonificaçao de: " +f.bonificacao());

    }
    
}
