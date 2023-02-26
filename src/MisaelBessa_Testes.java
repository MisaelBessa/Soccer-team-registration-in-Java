import java.util.Scanner;



public class MisaelBessa_Testes {
    //Definição das categorias com quantidade de vagas.
static MisaelBessa_Subclasse1[] cad_prof = new MisaelBessa_Subclasse1[24];
static MisaelBessa_Subclasse2[] cad_Junior2 = new MisaelBessa_Subclasse2[24];
static MisaelBessa_Subclasse3[] cad_Junior1 = new MisaelBessa_Subclasse3[24];
static MisaelBessa_Subclasse4[] cad_infantil = new MisaelBessa_Subclasse4[18];
static MisaelBessa_Subclasse4[] cad_infantilBolsa = new MisaelBessa_Subclasse4[6];

//Para controle de quantidade de vagas.
static int a=0, b=0, c=0, d=0, e=0, opcao=0, menu=0;

static Scanner atributos = new Scanner(System.in);
static Scanner scan = new Scanner(System.in);
static float renda;

    public static void main(String[] args) throws Exception {
        MisaelBessa_Subclasse1 sub1=new MisaelBessa_Subclasse1();
        MisaelBessa_Subclasse2 sub2=new MisaelBessa_Subclasse2();
        MisaelBessa_Subclasse3 sub3=new MisaelBessa_Subclasse3();
        MisaelBessa_Subclasse4 sub4=new MisaelBessa_Subclasse4();
        //definição dos objetos/vagas dos jogadores para cada categoria
        for(a=0;a<24;a++){
            cad_prof[a] = new MisaelBessa_Subclasse1();
            cad_Junior1[a] = new MisaelBessa_Subclasse3();
            cad_Junior2[a] = new MisaelBessa_Subclasse2();
        }
        for(a=0; a<18;a++){
            cad_infantil[a] = new MisaelBessa_Subclasse4(); 
        }
        for(a=0; a<6;a++){
            cad_infantilBolsa[a] = new MisaelBessa_Subclasse4();
        }
do{

    System.out.println("\nPROGRAMA DE GERENCIAMENTO DO TIME!\n");
    System.out.println("\n1-Cadastrar novos jogadores.\n2-Realizar pagamento de jogadores cadastrados.\n3-Sair\n");
    System.out.println("\nDigite a opção: ");
    menu = atributos.nextInt();
if(menu==1){
    do{
        System.out.println("\nMENU DE CADASTRO DOS JOGADORES!\n");
        System.out.println("\nSelecione a categoria: \n");
        System.out.println("\n1-Profissional\n2-Junior 2\n3-Junior 1\n4-Infantil\n5-Infantil(Bolsista)\n");
        System.out.println("\nDigite a opção: ");
        opcao = atributos.nextInt();

        if(opcao==1){
            sub1.cadastro();
        }
        if(opcao==2){
            sub2.cadastro();
        }
        if(opcao==3){
            sub3.cadastro();
        }
        if(opcao==4){
            sub4.cadastro();
        }
        if(opcao==5){
            int sel=0;
            System.out.print("\nDigite a renda familiar.\n");
            renda = atributos.nextFloat();
            System.out.println("\nMora nos arredores do centro de treinamento?\n1-SIMzn2-NÃO\n");
            sel = atributos.nextInt();
            if((renda<=1200)&&(sel==1)){
                sub4.cadastro_bolsista();
            }
            else{
                System.out.println("\nJogador sem atribuições necessárias para a bolsa.\n");
            }
        }


    }while(opcao!=6);
    }

    if(menu==2){
        int o=0;
        System.out.println("\nSelecione a categoria: \n");
        System.out.println("\n1-Profissional\n2-Junior 2\n3-Junior 1\n4-Infantil\n5-Infantil(Bolsista)\n6-Sair\n");
        System.out.println("\nDigite a opção: ");
        o = atributos.nextInt();
        if(o==1){
            sub1.pagamento();
        }
        if(o==2){
            sub2.pagamento();
        }
        if(o==3){
            sub3.pagamento();
        }
        if(o==4){
            sub4.pagamento();
        }
        if(o==5){
            sub4.pagamentoBOLSA();
        }
    }
}while(menu!=3);
}
   
        




        
    }

