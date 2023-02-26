public class MisaelBessa_Subclasse3 extends MisaelBessa_Subclasse2 {
    public MisaelBessa_Subclasse3(){
        super();}
    
        @Override
        public void cadastro() {
            if(MisaelBessa_Testes.c==24){
                System.out.println("\nO time ja está completo.\n");
            }
            else{
                System.out.println("\nDigite as informações do Jogador da categoria Junior 1:\n");
                System.out.println("\nNome: ");
               MisaelBessa_Testes.cad_Junior1[MisaelBessa_Testes.c].setNome(MisaelBessa_Testes.scan.nextLine());
               System.out.println("\nCPF: ");
               MisaelBessa_Testes.cad_Junior1[MisaelBessa_Testes.c].setCPF(MisaelBessa_Testes.scan.nextLong());
               System.out.println("\nIdade: ");
               MisaelBessa_Testes.cad_Junior1[MisaelBessa_Testes.c].setIdade(MisaelBessa_Testes.atributos.nextInt());
               System.out.println("\nNumero do telefone dos responsáveis(com DDD): ");
               MisaelBessa_Testes.cad_Junior1[MisaelBessa_Testes.c].setTelefone(MisaelBessa_Testes.atributos.nextLong());
               System.out.println("\nPosição: \n");
               MisaelBessa_Testes.cad_Junior1[MisaelBessa_Testes.c].setPosicao(MisaelBessa_Testes.scan.nextLine());
                System.out.println("Jogador ganhou algum campeonato?\n1-sim\n2-não\n");
                MisaelBessa_Testes.cad_Junior1[MisaelBessa_Testes.c].setBonus(MisaelBessa_Testes.atributos.nextInt());
                System.out.println("\nCADASTRO REALIZADO COM SUCESSO!\n\n");
            }
            
        }
        @Override
        public void bonus(int a) {
            if(MisaelBessa_Testes.cad_Junior1[a].getBonus()==1){
                System.out.println("\nJogador recebeu um bônus de +100 reais.\n");
                MisaelBessa_Testes.cad_Junior1[a].setSalario(1100);
            }
          
            
        }
        @Override
        public void pagamento() {
            Long cpf, conta;
            int a=0;
            System.out.println("\nRealização do Pagamento dos jogadores da categoria Junior 1!\n");
            System.out.println("Digite a conta para transferência:\n");
            conta = MisaelBessa_Testes.atributos.nextLong();
            System.out.println("\nDigite o CPF do jogador para buscarmos no banco de dados: \n");
            cpf=MisaelBessa_Testes.atributos.nextLong();
            for(a=0; a<24; a++){
                if(cpf==MisaelBessa_Testes.cad_Junior1[a].getCPF()){
                    System.out.println("\nInformações do Jogador:\n");
                    System.out.println("\nNome: "+MisaelBessa_Testes.cad_Junior1[a].getNome());
                    System.out.println("\nPosição: "+MisaelBessa_Testes.cad_Junior1[a].getPosicao());
                    System.out.println("\nPagamento transferido para conta cadastrada.\n");
                    MisaelBessa_Testes.cad_Junior1[a].setSalario(1000);
                    bonus(a);
                }
                else{
                    System.out.println("\nJogador não encontrado! Realizar processo novamente!\n");
                    a=24;
                }
            }
        }

   
}