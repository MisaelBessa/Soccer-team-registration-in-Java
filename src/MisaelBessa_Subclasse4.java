public class MisaelBessa_Subclasse4 extends MisaelBessa_Superclasse{
    public MisaelBessa_Subclasse4(){
    super();}
    
        @Override
        public void cadastro() {
            if(MisaelBessa_Testes.d==18){
                System.out.println("\nO time ja está completo.\n");
            }
            else{
            System.out.println("\nDigite as informações do Jogador da categoria Infantil:\n");
            System.out.println("\nNome: ");
           MisaelBessa_Testes.cad_infantil[MisaelBessa_Testes.d].setNome(MisaelBessa_Testes.scan.nextLine());
           System.out.println("\nCPF: ");
           MisaelBessa_Testes.cad_infantil[MisaelBessa_Testes.d].setCPF(MisaelBessa_Testes.scan.nextLong());
           System.out.println("\nIdade: ");
           MisaelBessa_Testes.cad_infantil[MisaelBessa_Testes.d].setIdade(MisaelBessa_Testes.atributos.nextInt());
           System.out.println("\nNumero do telefone dos responsáveis(com DDD): ");
           MisaelBessa_Testes.cad_infantil[MisaelBessa_Testes.d].setTelefone(MisaelBessa_Testes.atributos.nextLong());
           System.out.println("\nPosição: \n");
           MisaelBessa_Testes.cad_infantil[MisaelBessa_Testes.d].setPosicao(MisaelBessa_Testes.scan.nextLine());
            System.out.println("\nJogador ganhou algum campeonato?\n1-sim\n2-não\n");
            MisaelBessa_Testes.cad_infantil[MisaelBessa_Testes.d].setBonus(MisaelBessa_Testes.atributos.nextInt());
            System.out.println("\nCADASTRO REALIZADO COM SUCESSO!\n\n");
            }
        }

        public void cadastro_bolsista(){
            if(MisaelBessa_Testes.e==6){
                System.out.println("\nO time ja está completo.\n");
            }
            else{
            System.out.println("\nDigite as informações do Jogador da categoria Infantil:\n");
            System.out.println("\nNome: ");
           MisaelBessa_Testes.cad_infantilBolsa[MisaelBessa_Testes.e].setNome(MisaelBessa_Testes.scan.nextLine());
           System.out.println("\nCPF: ");
           MisaelBessa_Testes.cad_infantilBolsa[MisaelBessa_Testes.e].setCPF(MisaelBessa_Testes.scan.nextLong());
           System.out.println("\nIdade: ");
           MisaelBessa_Testes.cad_infantilBolsa[MisaelBessa_Testes.e].setIdade(MisaelBessa_Testes.atributos.nextInt());
           System.out.println("\nNumero do telefone dos responsáveis(com DDD): ");
           MisaelBessa_Testes.cad_infantilBolsa[MisaelBessa_Testes.e].setTelefone(MisaelBessa_Testes.atributos.nextLong());
           System.out.println("\nPosição: \n");
           MisaelBessa_Testes.cad_infantilBolsa[MisaelBessa_Testes.e].setPosicao(MisaelBessa_Testes.scan.nextLine());
           System.out.println("\nRenda: "); 
           MisaelBessa_Testes.cad_infantilBolsa[MisaelBessa_Testes.e].setRenda(MisaelBessa_Testes.atributos.nextFloat());
           System.out.println("\nMora em torno do set de treinamentos?\n1-sim\n2-não\n");
           MisaelBessa_Testes.cad_infantilBolsa[MisaelBessa_Testes.e].setMoradia(MisaelBessa_Testes.atributos.nextInt());
           System.out.println("\nJogador ganhou algum campeonato?\n1-sim\n2-não\n");
           MisaelBessa_Testes.cad_infantilBolsa[MisaelBessa_Testes.e].setBonus(MisaelBessa_Testes.atributos.nextInt());
           System.out.println("\nCADASTRO REALIZADO COM SUCESSO!\n\n"); 
        }  
        }


        @Override
        public void bonus(int a) {
            if(MisaelBessa_Testes.cad_infantil[a].getBonus()==1){
                System.out.println("\nJogador recebeu um bônus de +50 reais.\n");
                MisaelBessa_Testes.cad_infantil[a].setSalario(230);
            }
          
            
        }
        @Override
        public void pagamento() {
            Long cpf, conta;
            int a=0;
            System.out.println("\nRealização do Pagamento dos jogadores da categoria infantil!\n");
            System.out.println("Digite a conta para transferência:\n");
            conta = MisaelBessa_Testes.atributos.nextLong();
            System.out.println("\nDigite o CPF do jogador para buscarmos no banco de dados: \n");
            cpf=MisaelBessa_Testes.atributos.nextLong();
            for(a=0; a<18; a++){
                if(cpf==MisaelBessa_Testes.cad_infantil[a].getCPF()){
                    System.out.println("\nInformações do Jogador:\n");
                    System.out.println("\nNome: "+MisaelBessa_Testes.cad_infantil[a].getNome());
                    System.out.println("\nPosição: "+MisaelBessa_Testes.cad_infantil[a].getPosicao());
                    System.out.println("\nPagamento transferido para conta cadastrada.\n");
                    MisaelBessa_Testes.cad_infantil[a].setSalario(180);
                    bonus(a);
                }
                else{
                    System.out.println("\nJogador não encontrado! Realizar processo novamente!\n");
                    a=18;
                }
            }
        }
        public void pagamentoBOLSA() {
            Long cpf, conta;
            int a=0;
            System.out.println("\nRealização do Pagamento dos jogadores da categoria infantil!\n");
            System.out.println("Digite a conta para transferência:\n");
            conta = MisaelBessa_Testes.atributos.nextLong();
            System.out.println("\nDigite o CPF do jogador para buscarmos no banco de dados: \n");
            cpf=MisaelBessa_Testes.atributos.nextLong();
            for(a=0; a<6; a++){
                if(cpf==MisaelBessa_Testes.cad_infantilBolsa[a].getCPF()){
                    System.out.println("\nInformações do Jogador:\n");
                    System.out.println("\nNome: "+MisaelBessa_Testes.cad_infantilBolsa[a].getNome());
                    System.out.println("\nPosição: "+MisaelBessa_Testes.cad_infantilBolsa[a].getPosicao());
                    System.out.println("\nPagamento transferido para conta cadastrada.\n");
                    MisaelBessa_Testes.cad_infantilBolsa[a].setSalario(180);
                    bonus(a);
                }
                else{
                    System.out.println("\nJogador não encontrado! Realizar processo novamente!\n");
                    a=6;
                }
            }
        }
}
