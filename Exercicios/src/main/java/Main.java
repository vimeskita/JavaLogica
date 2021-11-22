import java.util.Scanner;

public class Main {
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        
        System.out.println("Qual exercício deseja ver?");
        System.out.println("1- Soma.");
        System.out.println("2- Média");
        System.out.println("3- Área das figuras");
        System.out.println("4- IMC");
        int num = in.nextInt();
        
        switch (num){
            case 1:
                System.out.println("1- Soma");
                System.out.println("Digite os valores que deseja somar:");
        
                int A = in.nextInt();
                int B = in.nextInt();
                int SOMA = A + B;

                System.out.println("O resultado da Soma entre: " + A +" + "+ B +" é igual a:" + SOMA + ".");

                in.close();
                break;
                
            case 2:
               System.out.println("2- Média");
               System.out.println("Digite 3 valores para saber a média entre eles.");
               int V1 = in.nextInt();
               int V2 = in.nextInt();
               int V3 = in.nextInt();
               int MEDIA = (V1 + V2 + V3)/3;

               System.out.println("A média entre os valores digitados foi de: "+MEDIA+".");

               in.close();
               break;
                
            case 3:
                System.out.println("3- Área das figuras");
                System.out.println("Escolha uma opção:");
                System.out.println("1- Quero saber a área de um retângulo.");
                System.out.println("2- Quero saber a área de um triãngulo.");
                System.out.println("3- Quero saber a área de um quadrado.");
                System.out.println("4- Quero saber a área de um trapézio.");
                int RUM = in.nextInt();

                switch (RUM){
                    case 1:
                        System.out.println("Digite o valor da base e da altura do retângulo para saber sua área.");
                        int Br = in.nextInt();
                        int Hr = in.nextInt();
                        int AREAr = Br * Hr;

                        System.out.println("A área do retangulo segundo as dimensões digitadas foi de: "+AREAr+".");
                        break;

                    case 2:
                        System.out.println("Digite o valor da base e da altura do triângulo para saber sua área.");
                        int Bt = in.nextInt();
                        int Ht = in.nextInt();
                        int AREAt = (Bt*Ht)/2;

                        System.out.println("A área do triângulo segundo as dimensões digitadas foi de: "+AREAt+".");
                        break;

                    case 3:
                        System.out.println("Digite o valor do lado do quadrado.");
                        int L = in.nextInt();
                        int AREAq = L * L;

                        System.out.println("A área do quadrado segundo as dimensões digitadas foi de: "+AREAq+".");
                        break;

                    case 4:
                        System.out.println("Digite o valor da base maior e da base menor do trapézio.");
                        int BMaior = in.nextInt();
                        int BMenor = in.nextInt();
                        System.out.println("Digite o valor da altura do trapézio.");
                        int Htp = in.nextInt();
                        int AREAtp = ((BMaior + BMenor)*Htp)/2;

                        System.out.println("A área do trapézio segundo as dimensões digitadas foi de: "+AREAtp+".");
                        break;

                    default:
                        System.out.println("Opção Inválida!");
                        break;
                }
                in.close();
                break;
                
            case 4:
                System.out.println("4- IMC");
                String nome;
                System.out.println("Índice de Massa Corporal(IMC)");
                System.out.println("Digite o nome do paciente.");
                nome = in.nextLine();

                System.out.println("Digite o peso do paciente em quilogramas.");
                double P = in.nextDouble();
                System.out.println("Digite a altura do paciente em centimetros.");
                double H = in.nextDouble();
                double IMC = P / (H * H);

                System.out.println("O cálculo do IMC de "+nome+" é: "+IMC+".");
                System.out.println("Cálculos válidos apenas para pessoas adultas.");


                in.close();
                break;
                
            default:
                System.out.println("Opção Inválida!");
                break;
        }
        in.close();
    }
}