import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //SCANNER
        Scanner sc = new Scanner(System.in);

        Banco b = new Banco();
        Pessoa p = new Pessoa();

        ArrayList<Banco> contas = new ArrayList<Banco>();
        ArrayList<Pessoa> clientes = new ArrayList<Pessoa>();

        boolean flag = true;

        while (flag) {
            System.out.println("Escolha uma das opções: ");
            System.out.println("1 - Cadastrar Cliente \n2 - Cadastrar Conta \n3 - Consultar Saldo \n4 - Exibir todas as contas cadastradas \n5 - Sacar Dinheiro \n6 - Depositar Dinheiro\n7 - Sair");
            int escolha = sc.nextInt();


            switch (escolha) {
                case 1:
                    //Pessoa cliente1 = new Pessoa();

                    //CRIAR CLIENTE
                    System.out.println("Insira o nome do cliente:");
                    String nome = sc.next();

                    //CRIAR CPF
                    System.out.println("Insira o CPF:");
                    String cpf = sc.next();


                    clientes.add(new Pessoa(nome, cpf));


                    //--------------------------------------------------------------------------------------------------------------------------

                    break;
                case 2:

                    //CADASTRANDO CONTA
                    System.out.println("Insira o numero da conta:");
                    b.numeroConta = sc.nextInt();

                    System.out.println("Insira o saldo inicial da conta:");
                    b.saldo = sc.nextInt();

                    System.out.println("Informe o CPF do titular da conta:");
                    p.cpf = sc.next();

                    Banco conta = new Banco(b.numeroConta,b.saldo,p.cpf);
                    contas.add(conta);


                    //Pessoa titular = null;
                    //Pessoa titular;

//                    for (Pessoa c : clientes) {         //clientes é o ARRAY QUE AINDA CRIAREMOS
//                        if (c.equals(cpfDeAlguem)) {
//                            titular = c;
//                            break;
//                        }
//                    }

                    break;
                case 3:
                    System.out.println("Informe o numero da conta: ");
                    System.out.println(b.saldo);

                    //int contaA1 = sc.nextInt();


                    //BUSCAMOS A CONTA
//                    for (Banco d : contas) {
//                        if (d.equals(contaA1)) {
//                            //ACHAMOS A CONTA
//                            System.out.println(d.saldo);
//                            System.out.println("Conta confirmada");
//                        } else {
//                            System.out.println("A conta informada não existe");
//                        }
//                    }


                    break;
                case 4:
                    for(Banco a : contas) {
                        System.out.println("");
                        System.out.println("Numero da Conta: " + a.numeroConta);
                        System.out.println("Voce Possuí de Saldo: R$" + a.saldo);
                        System.out.println("Cpf do Titular: " + a.cliente);
                        System.out.println("");
                    }
                    break;

                case 5:
                    System.out.println("Informe o numero da conta:");
                    int numDaConta = sc.nextInt();
                    if(b.numeroConta == numDaConta) {
                        System.out.println("Quer resgatar seu saldo?");
                        double qnt = sc.nextDouble();
                        System.out.println("Voce resgatou " + qnt + " resta " +b.sacar(qnt)+ " do seu saldo");
                        if(qnt > b.saldo){
                            System.out.println("Você não possui esse valor");
                            return;
                        }

                    } else {
                        System.out.println("Esta conta não existe");
                        return;
                    }
                    break;

                case 6:
                    System.out.println("Digite o número da conta");
                    int i2 = sc.nextInt();
                    if(b.numeroConta == i2) {
                        System.out.println("Quer depositar seu dinheiro?");
                        double qnt = sc.nextDouble();
                        System.out.println("Você depositou "+ qnt + " sobrou "+b.depositar(qnt)+ " no seu saldo");
                        if(qnt > b.saldo){
                            System.out.println("Você não possui esse valor");
                            return;
                        }
                    } else {
                        System.out.println("Esta conta não existe");
                        return;
                    }
                    break;
                case 7:
                    System.out.println("Obrigado por utilizar nosso sistema\n");
                    break;


            }
        }
    }
}