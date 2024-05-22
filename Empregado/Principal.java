package Empregado;
import java.util.ArrayList;
import java.util.Scanner;


public class Principal {
   static ArrayList<Empregado> empregados = new ArrayList();
   static Scanner input = new Scanner(System.in);
    /**
     * @param args
     */
    public static void main(String[] args) {    
        boolean exec = true;    
        
        while (exec) {
            menu();
            int escolha = input.nextInt();
            input.nextLine();

            switch (escolha) {
                case 1:
                    criarNovoEmpregado();
                    break;
                case 2:
                    promoverEmpregado();
                    break;
                case 3:
                    aumentarSalario();
                    break;
                case 4:
                    demitirEmpregado();
                    break;
                case 5:
                    fazerAniversariodoEmpregado();
                    break;
                case 6:
                    informaçõesDoEmpregado();
                    break;
                case 7:
                    exec = false;
                    break;                        
                default:
                    System.out.println("Opção invalida. Por favor selecione outra.");            
                    break;
            }
        }
    }
    public static void menu(){
            System.out.println("\nMenu");
            System.out.println("1. Criar novo empregado");
            System.out.println("2. Promover empregado");
            System.out.println("3. Aumentar salário do empregado");
            System.out.println("4. Demitir empregado");
            System.out.println("5. Fazer aniversário do empregado");
            System.out.println("6. Mostrar detalhes dos empregados");
            System.out.println("7. Sair");
            System.out.print("Escolha uma opção: ");
        }
        
        private static void criarNovoEmpregado(){
            System.out.println("Nome: ");
            String nome = input.nextLine();
            System.out.println("Idade: ");
            int idade = input.nextInt();
            System.out.println("Salario: ");
            double salario = input.nextDouble();
       
            Empregado empregado = new Empregado(nome, idade, salario);
            empregados.add(empregado);
        }
        public static void promoverEmpregado(){
            // imprimindo a lista de empregados
            System.out.println("Lista de Empregados: ");
            for (int i = 0; i < empregados.size(); i++) {
                System.out.println((i + 1) + ". " + empregados.get(i).getNome());
            }
            
            //pedir para que o usuario escolha um empregado
            System.out.println("Digite o número do empregado que deseja promover:");
            Scanner scanner = new Scanner(System.in);
            int escolha = scanner.nextInt();
           
            // Verificar se a escolha é válida
            if (escolha >= 1 && escolha <= empregados.size()) {
                Empregado empregadoSelecionado = empregados.get(escolha - 1);
                System.out.println(empregadoSelecionado.getNome() + " foi promovido!");
            } 
            else {
                System.out.println("Escolha inválida!");
            }
        }
        
        
        public static void aumentarSalario(){
            //imprimindo a lista de empregados
            System.out.println("Lista de Empregados: ");
            for (int i = 0; i < empregados.size(); i++) {
                System.out.println((i + 1) + ". " + empregados.get(i).getNome());
            }
            
            //pedir para que o usuario escolha um empregado
            System.out.println("Digite o número do empregado que deseja aumentar salario:");
            Scanner scanner = new Scanner(System.in);
            int escolha = scanner.nextInt();
            
            
            if (escolha >= 1 && escolha <= empregados.size()) {
                Empregado empregadoSelecionado = empregados.get(escolha - 1);
                int aumento;
                System.out.println("Digite a porcentagem de aumento do empregado");
                aumento = input.nextInt();
                empregadoSelecionado.aumentarSalario(aumento);
                System.out.println("O novo salario de " + empregadoSelecionado.getNome()+ 
                                   " é: R$" + empregadoSelecionado.getSalario());
            }
            else{
                System.out.println("Escolha inválida!");
            }
        }
        
        
        public static void fazerAniversariodoEmpregado(){
           // imprimindo a lista de empregados
            System.out.println("Lista de Empregados: ");
            for (int i = 0; i < empregados.size(); i++) {
                System.out.println((i + 1) + ". " + empregados.get(i).getNome());
            }
            
            //pedir para que o usuario escolha um empregado
            System.out.println("Digite o número do empregado que esta fazendo aniversario:");
            Scanner scanner = new Scanner(System.in);
            int escolha = scanner.nextInt();
           
            // Verificar se a escolha é válida
            if (escolha >= 1 && escolha <= empregados.size()) {
                Empregado empregadoSelecionado = empregados.get(escolha - 1);
                empregadoSelecionado.aniversario();
            } 
            else {
                System.out.println("Escolha inválida!");
            } 
        }
        
        public static void demitirEmpregado(){
           // imprimindo a lista de empregados
           System.out.println("Lista de Empregados: ");
           for (int i = 0; i < empregados.size(); i++) {
               System.out.println((i + 1) + ". " + empregados.get(i).getNome());
           }
           
           //pedir para que o usuario escolha um empregado
           System.out.println("Digite o número do empregado que deseja demitir:");
           Scanner scanner = new Scanner(System.in);
           int escolha = scanner.nextInt();
          
           Empregado empregadoSelecionado = null;
           
           // Verificar se a escolha é válida
           if (escolha >= 1 && escolha <= empregados.size()) {
                empregadoSelecionado = empregados.get(escolha - 1);
                razao();
                int razao = input.nextInt();
                empregadoSelecionado.demitir(razao);
                empregados.remove(empregadoSelecionado);
           } 
           else {
                System.out.println("Escolha inválida!");
           }

           
        }
      
        public static void razao(){
        
            System.out.println("1. Justaca Causa.");
            System.out.println("2. Dimissão pelo empregador.");
            System.out.println("3. Aposentadoria.");
            System.out.println("Selecione a razao da demissão: ");
        }
        
        public static void informaçõesDoEmpregado(){
            // imprimindo a lista de empregados
            System.out.println("Lista de Empregados: ");
            for (int i = 0; i < empregados.size(); i++) {
                System.out.println((i + 1) + ". " + empregados.get(i).getNome());
            }
            
            //pedir para que o usuario escolha um empregado
            System.out.println("Digite o número do empregado que deseja saber as informações:");
            Scanner scanner = new Scanner(System.in);
            int escolha = scanner.nextInt();
           
            // Verificar se a escolha é válida
            if (escolha >= 1 && escolha <= empregados.size()) {
                Empregado empregadoSelecionado = empregados.get(escolha - 1);
                System.out.println("Nome: " + empregadoSelecionado.getNome() + 
                                   "\nIdade: " + empregadoSelecionado.getIdade() + 
                                   "\nSalario: " + empregadoSelecionado.getSalario());
            } 
            else {
                System.out.println("Escolha inválida!");
            }
        }
        scanner.close();
    }
