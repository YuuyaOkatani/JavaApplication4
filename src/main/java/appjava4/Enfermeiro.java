package appjava4;

public class Enfermeiro extends Pessoa{

    private String areaAtuacao; 
    private String COREN;

    

    public String getAreaAtuacao() {
        return areaAtuacao;
    }



    public void setAreaAtuacao(String areaAtuacao) {
        this.areaAtuacao = areaAtuacao;
    }



    public String getCOREN() {
        return COREN;
    }



    public void setCOREN(String cOREN) {
        COREN = cOREN;
    }



    public Enfermeiro(String nome, int idade, String sexo){
        super(nome, idade, sexo);
        
    }

    public void mostrarData(){
        System.out.println("Nome: " + getNome());
        System.out.println("Idade: " + getIdade());
        System.out.println("Sexo: " + getSexo());
        System.out.println("Area de atuação: " + getAreaAtuacao());
        System.out.println("COREN: " + getCOREN());
    }

    
}
