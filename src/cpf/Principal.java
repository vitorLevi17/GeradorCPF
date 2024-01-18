package cpf;

import javax.swing.JOptionPane;

public class Principal { //ONDE O CODGIOP SERÁ EXECUTADO

    
    public static void main(String[] args) {
         

        //VARIAVEIS AUXILIARES
        String auxt;
        int aux = 0;
        

       //INSTANCIAR AS CLASSES QUE SERÃO USADAS
       Regiao_Fiscal rf = new Regiao_Fiscal();
       GeradorNumerico gn = new GeradorNumerico();
       Sorteio sort = new Sorteio();
       

//1)-8 PRIMEIROS DO CPF SAO ALEATORIOS (SORTEAR NUMEROS)
    for(int i = 0 ; i <=8 ;i++){        
        aux = sort.nextInt(10); //TRAZER O VALOR SORTEADO DA SUB-CLASSE PARA UMA VARIAVEL AUXILIAR
        gn.numero[i]=aux;            //INSERIR VALOR NO ARRAY
    }
            
//2)-DEFINIR REGIAO FISCAL DA PESSOA FISICA(NONO DIGITO) 
    auxt = JOptionPane.showInputDialog(null,"Digite a sigla de seu estado (Exemplo : BA)");
    rf.setEstado(auxt);           //RECEBER O ESTADO DO USUARIO      
    rf.Seletor_Regiao_Fiscal();   //SELECIONAR DIGITO DO ESTADO DO USUARIO
    gn.numero[8]=(rf.getRegiao_fiscal()); //ARMAZENAR DIGITO DO USUARIO
    
//3)-2 UTILIZAR FORMULA PARA CALCULAR O 10 E 11 DIGITO 
    gn.Calculo_Final_Dig_1(); //CALCULOS NA CLASSE GN
    gn.Calculo_Final_Dig_2();

//4)-Exibir CPF completo
    for(int i = 0; i<11 ; i++){    
        System.out.print(gn.numero[i]);
    }
       
      
}
}
