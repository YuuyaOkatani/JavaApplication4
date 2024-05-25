package appjava4;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    Pessoa pessoa = new Pessoa(null, 0, null); 
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Scanner scanner = new Scanner(System.in); 
        ArrayList<Pessoa> data = new ArrayList<Pessoa>();
        ArrayList<Paciente> data_paciente= new ArrayList<Paciente>();
        ArrayList<Medico> data_medico = new ArrayList<Medico>();
        ArrayList<Enfermeiro> data_enfremeiro = new ArrayList<Enfermeiro>();
        ArrayList<EquipeLimpeza> data_limpeza = new ArrayList<EquipeLimpeza>();


        int activate = 0; 
        //------------------------------------------------------------------------------------------------

        while (activate > -1 && activate < 7) {
            switch (activate) {
                case 0:
                System.out.println("O que gostaria de fazer?: ");
                System.out.println("[1] cadastrar nova pessoa: ");
                System.out.println("[2] acessar uma pessoa: ");
                System.out.println("[3] listar todos os pacientes: ");   
                System.out.println("[4] listar todos os médicos: "); 
                System.out.println("[5] listar todos os enfermeiros: ");        
                System.out.println("[6] listar todos os membros da equipe de limpeza e manutenção: ");
                System.out.println("[7] Sair");
                activate = scanner.nextInt();
        
                
                break;
                //------------------------------------------------------------------------------------------------

                case 1:
                    System.out.println("Digite o nome: ");
                    String nome = scanner.next();
                    System.out.println("Digite a idade: ");
                    int idade = scanner.nextInt();
                    System.out.println("Digite o sexo: ");
                    String sexo = scanner.next();
                    Pessoa pessoa = new Pessoa(nome, idade, sexo);
                    data.add(pessoa);

                    System.out.println("================================");
                    System.out.println(pessoa.getNome());
                    System.out.println(pessoa.getIdade());
                    System.out.println(pessoa.getSexo());
                    System.out.println("================================");

                    System.out.println("Gostaria de cadastrar como (digite a tecla):");
                    System.out.println("[p] paciente");
                    System.out.println("[m] médico");
                    System.out.println("[e] enfermeiro:");
                    System.out.println("[l] membro da limpeza e manutenção");

                    String opcao = scanner.next(); 

                    char key = (char) opcao.charAt(0);

                    switch (key) {

                        // eu não sei se deveria colocar para pessoa escolher primeiro "pessoa" ou cargos como médicos e os restantes, então irei fazer dessa forma
                        case 'p':
                        Paciente paciente = new Paciente(nome, idade, sexo); 
                        paciente.setNome(pessoa.getNome());
                        paciente.setIdade(pessoa.getIdade());
                        paciente.setSexo(pessoa.getSexo());
                        paciente.setNumeroProntuario("" + (data.size() + 1));
                        System.out.print("Digite o diagnótico do paciente: ");
                        String diagnostico = scanner.next();
                        paciente.setDiagnostico(diagnostico);
                        data_paciente.add(paciente);

                        System.out.println("================================");
                        System.out.println("Numero do prontuário: " + paciente.getNumeroProntuario());
                        System.out.println("Nome do paciente: " + paciente.getNome());                        
                        System.out.println("Idade do paciente: " + paciente.getIdade());
                        System.out.println("Sexo do paciente: " + paciente.getSexo());
                        System.out.println("Diagnóstico do paciente: " + paciente.getDiagnostico());
                        System.out.println("================================");
                        activate = 0;

                        break;

                        case 'm':

                        System.out.print("Digite a especialidade do médico: ");
                        Medico medico = new Medico(nome, idade, sexo);
                        
                        String especialidade = scanner.next();
                        medico.setEspecialidade(especialidade);
                        System.out.print("Digite o CRM do médico: ");
                        String crm = scanner.next();
                        medico.setCRM(crm);
                        data_medico.add(medico);
                        System.out.println("================================");
                        System.out.println("Nome do médico: " + medico.getNome());
                        System.out.println("Idade do médico: " + medico.getIdade());
                        System.out.println("Sexo do médico: " + medico.getSexo());
                        System.out.println("Especialidade do médico: " + medico.getEspecialidade());
                        System.out.println("CRM do médico: " + medico.getCRM());
                        System.out.println("================================");
                        activate = 0;
                        break; 

                        case 'e':
                        System.out.print("Digite a área de atuação do enfermeiro: "); 
                        Enfermeiro enfermeiro = new Enfermeiro(nome, idade, sexo); 
                        
                        String areaAtuacao = scanner.next();
                        enfermeiro.setAreaAtuacao(areaAtuacao);
                        System.out.print("Digite o COREN do enfermeiro: ");
                        String coren = scanner.next();
                        enfermeiro.setCOREN(coren);
                        data_enfremeiro.add(enfermeiro);
                        System.out.println("================================");
                        System.out.println("Nome do enfermeiro: " + enfermeiro.getNome());
                        System.out.println("Idade do enfermeiro: " + enfermeiro.getIdade());
                        System.out.println("Sexo do enfermeiro: " + enfermeiro.getSexo());
                        System.out.println("Área de atuação do enfermeiro: " + enfermeiro.getAreaAtuacao());
                        System.out.println("COREN do enfermeiro: " + enfermeiro.getCOREN());
                        System.out.println("================================");
                        activate = 0;

                        break; 

                        case 'l':
                        System.out.print("Digite o setor do membro da equipe: ");
                        String setor = scanner.next();
                        System.out.print("Digite a função do membro da equipe: ");
                        String funcao = scanner.next();
                        EquipeLimpeza membro = new EquipeLimpeza(nome, idade, sexo);
                        membro.setSetor(setor);
                        membro.setFuncao(funcao);
                        data_limpeza.add(membro);
                        System.out.println("================================");
                        System.out.println("Nome do membro da equipe: " + membro.getNome());
                        System.out.println("Idade do membro da equipe: " + membro.getIdade());
                        System.out.println("Sexo do membro da equipe: " + membro.getSexo());
                        System.out.println("Setor do membro da equipe: " + membro.getSetor());
                        System.out.println("Função do membro da equipe: " + membro.getFuncao());
                        System.out.println("================================");
                        activate = 0;
                        

                        break; 

                        
                    
                    }
                    

                break;
                //------------------------------------------------------------------------------------------------

                case 2:
                System.out.print("Digite o nome: "); 
                nome = scanner.next();
                for(int i = 0; i < data.size(); i++){
                    if(data.get(i).getNome().toLowerCase().trim().equals(nome)){
                        System.out.println("================================");
                        System.out.println(data.get(i).getNome());
                        System.out.println(data.get(i).getIdade());
                        System.out.println(data.get(i).getSexo());
                        System.out.println("================================");
                    }
                }
                activate = 0;
                break; 
                //------------------------------------------------------------------------------------------------

                case 3:
                if(data.size() > 0)
                for(int i = 0; i < data_paciente.size() ; i++){
                    System.out.println("--------------------------------");
                    System.out.println(data_paciente.get(i).getNome());
                    System.out.println(data_paciente.get(i).getIdade());
                    System.out.println(data_paciente.get(i).getSexo());
                    System.out.println(data_paciente.get(i).getNumeroProntuario());
                    System.out.println(data_paciente.get(i).getDiagnostico());
                    System.out.println("--------------------------------");
                }
                else{
                    System.out.println("Nenhum paciente cadastrado");
                }
                activate = 0;
                break;
                //------------------------------------------------------------------------------------------------

                case 4:
                if(data_medico.size() > 0 ){
                    for(int i = 0; i < data_medico.size(); i++){
                        System.out.println("--------------------------------");
                        System.out.println(data_medico.get(i).getNome());
                        System.out.println(data_medico.get(i).getIdade());
                        System.out.println(data_medico.get(i).getSexo());
                        System.out.println(data_medico.get(i).getEspecialidade());
                        System.out.println(data_medico.get(i).getCRM());
                        System.out.println("--------------------------------");
                    }

                }
                else{
                    System.out.println("Nenhum médico cadastrado");
                }
                activate = 0;
                break; 
                //------------------------------------------------------------------------------------------------

                case 5:
                if(data_enfremeiro.size() > 0){
                    for(int i=0; i < data_enfremeiro.size() ; i++){
                        System.out.println("--------------------------------");
                        System.out.println(data_enfremeiro.get(i).getNome());
                        System.out.println(data_enfremeiro.get(i).getIdade());
                        System.out.println(data_enfremeiro.get(i).getSexo());
                        System.out.println(data_enfremeiro.get(i).getAreaAtuacao());
                        System.out.println(data_enfremeiro.get(i).getCOREN());
                        System.out.println("--------------------------------");
                    }
                }
                else{
                    System.out.println("Nenhum enfermeiro cadastrado"); 

                }
                activate = 0;
                break; 
                //------------------------------------------------------------------------------------------------

                case 6:
                if(data_limpeza.size() > 0){
                    for(int i = 0; i < data_limpeza.size(); i++){
                        System.out.println("--------------------------------");
                        System.out.println(data_limpeza.get(i).getNome());
                        System.out.println(data_limpeza.get(i).getIdade());
                        System.out.println(data_limpeza.get(i).getSexo());
                        System.out.println(data_limpeza.get(i).getSetor());
                        System.out.println(data_limpeza.get(i).getFuncao());
                        System.out.println("--------------------------------");
                    }
                }
                else{
                    System.out.println("Nenhum membro da equipe de limpeza cadastrado");
                }
                activate = 0;
                break; 

            
                
            }
            
        }



    }
    
}


