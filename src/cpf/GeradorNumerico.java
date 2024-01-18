package cpf;

public class GeradorNumerico {
    
    protected int numero[] = new int[11];  
    
    
    //CALCULO DA FOTO
    
    //PRIMEIRO DIGITO VERIFICADOR
    public void Calculo_Final_Dig_1(){
        int soma = 0;
            for (int i = 0; i < 9; i++) {
                soma = numero[i] * (i + 1) + soma;
            }
            int resto = soma % 11;

                if (resto == 0 || resto == 1) {
                    numero[9] = 0;
                } else {
                    numero[9] = 11 - resto;
                }

        
            }

            //SEGUNDO DIGITO VERIFICADOR
            public void Calculo_Final_Dig_2(){
                int soma = 0;
                    for (int i = 0; i < 10; i++) {
                        soma = numero[i] * (i + 1) + soma;
            }
                int resto = soma % 11;

                    if (resto == 0 || resto == 1) {
                        numero[10] = 0;
                    } else {
                        numero[10] = 11 - resto;
                    }

            }

}
