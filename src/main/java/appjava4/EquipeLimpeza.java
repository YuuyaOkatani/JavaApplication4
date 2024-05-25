package appjava4;

public class EquipeLimpeza extends Pessoa{

    private String setor; 
    private String funcao; 

    

    public String getSetor() {
        return setor;
    }



    public void setSetor(String setor) {
        this.setor = setor;
    }



    public String getFuncao() {
        return funcao;
    }



    public void setFuncao(String funcao) {
        this.funcao = funcao;
    }



    public EquipeLimpeza(String nome, int idade, String sexo    ){
        super(nome, idade, sexo);

    }

    public void mostrarData(){
        System.out.println("Nome: " + getNome());
        System.out.println("Idade: " + getIdade());
        System.out.println("Sexo: " + getSexo());
        System.out.println("Setor: " + getSetor());
        System.out.println("Função: " + getFuncao());
    }

    
}
