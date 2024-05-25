package appjava4;



public class Medico extends Pessoa {
    private String especialidade;
    private String CRM; 

    

    public String getEspecialidade() {
        return especialidade;
    }



    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }



    public String getCRM() {
        return CRM;
    }



    public void setCRM(String cRM) {
        CRM = cRM;
    }



    public Medico(String nome, int idade, String sexo ){
        super(nome, idade, sexo);
    }

    public void mostrarData(){
        System.out.println("Nome: " + getNome());
        System.out.println("Idade: " + getIdade());
        System.out.println("Sexo: " + getSexo());
        System.out.println("Especialidade: " + getEspecialidade());
        System.out.println("CRM: " + getCRM());
    }

    
}
