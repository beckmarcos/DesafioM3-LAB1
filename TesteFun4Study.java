
/**
 * Escreva a descrição da classe TesteFun4Study aqui.
 * 
 * @author (seu nome) 
 * @version (número de versão ou data)
 */

public class TesteFun4Study
{
   public static void main(String[] args) {
   
        System.out.println("Cadastrando a primeira Cidade");
    
        Cidade cid1 = new Cidade(Teclado.leInt("Informe o código da Cidade: "),
                       Teclado.leString("Informe o nome: "),
                       Teclado.leString("Informe a UF: "));
                       
    System.out.println("________________________________________________________________________");
                            
    System.out.println("Cadastrando o primeiro estudante");
    
    Estudante est1 = new Estudante(Teclado.leInt("Informe o código: "),
                             Teclado.leString("Informe o nome: "),
                             Teclado.leString("Informe a data de nascimento: "),
                             Teclado.leString("Informe o e-mail: "),
                             Teclado.leString("Informe a senha: "),
                             cid1);
                             
    System.out.println("________________________________________________________________________");                         
    // chamar metodo para alterar senha                        
           
    alterarSenha(est1);
    
    System.out.println("________________________________________________________________________");
                          
    System.out.println("Cadastrando o segundo estudante");
    
    Estudante est2 = new Estudante(Teclado.leInt("Informe seu código: "),
                             Teclado.leString("Informe seu nome: "),
                             Teclado.leString("Informe sua data de nascimento: "),
                             Teclado.leString("Informe o e-mail: "),
                             Teclado.leString("Informe a senha: "),
                             cid1);
                             
    System.out.println("________________________________________________________________________");
    
    alterarSenha(est2);
    
    System.out.println("________________________________________________________________________");
    
    cid1.exibeDados();
    
    System.out.println("________________________________________________________________________");

    est1.exibeDados();
    
    System.out.println("________________________________________________________________________");
    
    est2.exibeDados();
    
    System.out.println("________________________________________________________________________");
    
       System.out.println("Cadastrando a segunda Cidade");  
    
       Cidade cid2 = new Cidade(Teclado.leInt("Informe o código da Cidade: "),
                            Teclado.leString("Informe o nome: "),
                            Teclado.leString("Informe a UF: "));  
       System.out.println("________________________________________________________________________");
       
       Estudante est3 = new Estudante(Teclado.leInt("Informe seu código: "),
                             Teclado.leString("Informe seu nome: "),
                             Teclado.leString("Informe sua data de nascimento: "),
                             Teclado.leString("Informe o e-mail: "),
                             Teclado.leString("Informe a senha: "),
                             cid2);
       System.out.println("________________________________________________________________________");
                             
       alterarSenha(est3);
       
       System.out.println("________________________________________________________________________");
                             
       Estudante est4 = new Estudante(Teclado.leInt("Informe seu código: "),
                             Teclado.leString("Informe seu nome: "),
                             Teclado.leString("Informe sua data de nascimento: "),
                             Teclado.leString("Informe o e-mail: "),
                             Teclado.leString("Informe a senha: "),
                             cid2);  
       System.out.println("________________________________________________________________________");
       
       alterarSenha(est4);
       
       System.out.println("________________________________________________________________________");
   
       cid2.exibeDados();
       
       System.out.println("________________________________________________________________________");
       
       est3.exibeDados();
       
       System.out.println("________________________________________________________________________");
       
       est4.exibeDados();
    
    
    }
    
    // abaixo metodo para alterar senha
    
    public static void alterarSenha(Estudante est1){
      System.out.println("Alterando a Senha");  
      
      String senhaAnterior;
      String novaSenha;
      String confirmaSenha;
      
      do {
          
        senhaAnterior = Teclado.leString("Digite a senha do Estudante " + est1.getNome() + ":");
        
        if(!(est1.getSenha()).equals(senhaAnterior)){
              System.out.println("Não foi possível alterar a senha!\nA senha incorreta"); 
        }
     } while (!(est1.getSenha()).equals(senhaAnterior));
     do {
          novaSenha = Teclado.leString("Digite a nova senha: ");
          confirmaSenha = Teclado.leString("Confirme a nova senha: ");
            if(!novaSenha.equals(confirmaSenha)){
           
           System.out.println("Não foi possível alterar a senha!\nAs senhas digitadas não são iguais!");
           }
           
     }while(!novaSenha.equals(confirmaSenha)); 
        
           est1.setSenha(novaSenha);
           System.out.println("Senha alterada com sucesso!!");
      }
        
    }    
    

    
    


