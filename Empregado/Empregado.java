package Empregado;
 
public class Empregado {
    private String nome;
    private int idade;
    private double salario;
    
    //Construtor.
    public Empregado(String nome, int idade, double salario){
        //usa o "this" para diferenciar as variaveis dos atribustos que tem o mesmo nome.
        this.nome = nome;
        this.idade = idade;
        this.salario = salario;
    }
    
    public String getNome(){
        return this.nome;
    }
    
    public void setNome(String nome){
         this.nome =  nome;
    }
    
    public int getIdade(){
        return this.idade;
    }
    
    public void setIdade(int idade){
        this.idade = idade;
    }
    
    public double getSalario(){
        return this.salario;
    }
    
    public void setSalario(double salario){
        this.salario = salario;
    }

    //aumentar tem q ser void pois a auteração vai direto na variavel salario.
    public void aumentarSalario(double percentual){
        salario += salario*(percentual / 100);      
    }
    
    public void aniversario(){
        idade ++;
    }
    
    public boolean promover(){
        if(idade >= 18){
            aumentarSalario(25);
            return true;
        }
        else{
            return false;
        }   
    }
    
    public void demitir(int razao){
        switch(razao){
            case 1:
                System.out.println("A causa da demissão é justa causa! O empregado deve cumprir o aviso prévio");
                break;
            case 2:
                double multa = salario * 0.4; // Calcula o valor da multa
                System.out.printf("A demissão foi por opção do empregador. O empregado recebera uma multa de R$: %.2f%n", multa);
                break;
            case 3: 
                if (salario >= 1000 & salario <= 2000) {
                    salario = 1500;
                    System.out.println("Empregado se aposentou!! Seu salario sera de: R$" + salario);
                }
                else if (salario >= 2001 & salario <= 3000) {
                    salario = 2500;
                    System.out.println("Empregado se aposentou!! Seu salario sera de: R$" + salario);
                }
                else if (salario >= 3001 & salario <= 4000) {
                    salario = 3500;
                    System.out.println("Empregado se aposentou!! Seu salario sera de: R$" + salario);
                }
                else if (salario > 4000) {
                    salario = 4500;
                    System.out.println("Empregado se aposentou!! Seu salario sera de: R$" + salario);
                }
                else{
                    System.out.println("Empregado se aposentou!! Seu salario sera menor do que R$1500");
                }
                break;
            default:
                System.out.println("Motivo de demissão inválido");
                break;         
        }        
    }

    @Override
    public String toString(){
        return "nome: " + this.nome + "\n"
               + "idade: " + this.idade + "\n"
               + "salario: " + this.salario + "\n";
    }
}