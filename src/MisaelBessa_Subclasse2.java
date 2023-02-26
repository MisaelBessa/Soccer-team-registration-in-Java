
public class MisaelBessa_Subclasse2 extends MisaelBessa_Superclasse {
    public MisaelBessa_Subclasse2(){
    super();}

    @Override
    public void cadastro() {
        if(MisaelBessa_Testes.b==24){
            System.out.println("\nO time ja está completo.\n");
        }
        else{
            System.out.println("\nDigite as informações do Jogador da categoria Junior 2:\n");
            System.out.println("\nNome: ");
           MisaelBessa_Testes.cad_Junior2[MisaelBessa_Testes.b].setNome(MisaelBessa_Testes.scan.nextLine());
           System.out.println("\nCPF: ");
           MisaelBessa_Testes.cad_Junior2[MisaelBessa_Testes.b].setCPF(MisaelBessa_Testes.scan.nextLong());
           System.out.println("\nIdade: ");
           MisaelBessa_Testes.cad_Junior2[MisaelBessa_Testes.b].setIdade(MisaelBessa_Testes.atributos.nextInt());
           System.out.println("\nNumero do telefone(com DDD): ");
           MisaelBessa_Testes.cad_Junior2[MisaelBessa_Testes.b].setTelefone(MisaelBessa_Testes.atributos.nextLong());
           System.out.println("\nPosição: \n");
           MisaelBessa_Testes.cad_Junior2[MisaelBessa_Testes.b].setPosicao(MisaelBessa_Testes.scan.nextLine());
            System.out.println("\nJogador ganhou algum campeonato?\n1-sim\n2-não\n");
            MisaelBessa_Testes.cad_Junior2[MisaelBessa_Testes.b].setBonus(MisaelBessa_Testes.atributos.nextInt());
            System.out.println("\nCADASTRO REALIZADO COM SUCESSO!\n\n");
        }
        
    }
    @Override
    public void bonus(int a) {
        if(MisaelBessa_Testes.cad_Junior2[a].getBonus()==1){
            System.out.println("\nJogador recebeu um bônus de +5 mil reais.\n");
            MisaelBessa_Testes.cad_Junior2[a].setSalario(25000);
        }
      
        
    }
    @Override
    public void pagamento() {
        Long cpf, conta;
        int a=0;
        System.out.println("\nRealização do Pagamento dos jogadores da categoria Junior 2!\n");
        System.out.println("Digite a conta para transferência:\n");
        conta = MisaelBessa_Testes.atributos.nextLong();
        System.out.println("\nDigite o CPF do jogador para buscarmos no banco de dados: \n");
        cpf=MisaelBessa_Testes.atributos.nextLong();
        for(a=0; a<24; a++){
            if(cpf==MisaelBessa_Testes.cad_Junior2[a].getCPF()){
                System.out.println("\nInformações do Jogador:\n");
                System.out.println("\nNome: "+MisaelBessa_Testes.cad_Junior2[a].getNome());
                System.out.println("\nPosição: "+MisaelBessa_Testes.cad_Junior2[a].getPosicao());
                System.out.println("\nPagamento transferido para conta cadastrada.\n");
                MisaelBessa_Testes.cad_Junior2[a].setSalario(20000);
                bonus(a);
            }
            else{
                System.out.println("\nJogador não encontrado! Realizar processo novamente!\n");
                a=24;
            }
        }
    }




        

}
