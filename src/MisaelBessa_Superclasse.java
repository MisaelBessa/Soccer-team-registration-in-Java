public abstract class MisaelBessa_Superclasse {
    private String nome=new String();
    private int Idade;
    private long CPF;
    private String cidade = new String();
    private long telefone;
    private String posicao = new String();
    private int bonus;
    private long salario;
    private float renda;
    private int moradia;

    public MisaelBessa_Superclasse(String nome, int Idade, long CPF, String cidade, long telefone, String posicao, int bonus, long salario, float renda, int moradia){
        this.nome = nome;
        this.CPF = CPF;
        this.Idade = Idade;
        this.cidade = cidade;
        this.telefone = telefone;
        this.posicao = posicao;
        this.bonus = bonus;
        this.salario = salario;
        this.renda = renda;
        this.moradia = moradia;
    } 

    
    


    public MisaelBessa_Superclasse() {
    }
    public int getMoradia(){
        return moradia;
    }
    public void setMoradia(int moradia) {
        this.moradia = moradia;
    }
    public float getRenda() {
        return renda;
    }


    public void setRenda(float renda) {
        this.renda = renda;
    }
    public long getSalario() {
        return salario;
    }
    public void setSalario(long salario) {
        this.salario = salario;
    }
    public int getBonus() {
        return bonus;
    }
 
    public void setBonus(int bonus) {
        this.bonus = bonus;
    }   
public String getPosicao() {
        return posicao;
    }

public void setPosicao(String posicao) {
        this.posicao = posicao;
    }  
public long getTelefone() {
    return telefone;
}

public void setTelefone(long telefone) {
    this.telefone = telefone;
}
public String getCidade() {
    return cidade;
}
public void setCidade(String cidade) {
    this.cidade = cidade;
}
public long getCPF() {
    return CPF;
}
public void setCPF(long cPF) {
    this.CPF = cPF;
}
public int getIdade() {
    return Idade;
}
public void setIdade(int idade) {
    this.Idade = idade;
}
public String getNome() {
    return nome;
}
public void setNome(String nome) {
    this.nome = nome;
}

public abstract void cadastro();
public abstract void pagamento();
public abstract void bonus(int a);

}
