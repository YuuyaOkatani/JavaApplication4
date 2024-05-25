package appjava4;


public class Paciente extends Pessoa{
    private String numeroProntuario; 
    private String diagnostico; 

    

    public String getNumeroProntuario() {
        return numeroProntuario;
    }



    public void setNumeroProntuario(String numeroProntuario) {
        this.numeroProntuario = numeroProntuario;
    }



    public String getDiagnostico() {
        return diagnostico;
    }



    public void setDiagnostico(String diagnostico) {
        this.diagnostico = diagnostico;
    }



    public Paciente(String nome, int idade, String sexo){
        super(nome, idade, sexo);

    }

    public void mostrarData(){
        System.out.println("Nome: " + getNome());
        System.out.println("Idade: " + getIdade());
        System.out.println("Sexo: " + getSexo());
        System.out.println("Número do prontuário: " + getNumeroProntuario());
        System.out.println("Diagnóstico: " + getDiagnostico());
    }
    
}
