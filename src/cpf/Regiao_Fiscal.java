package cpf;


public class Regiao_Fiscal {
    
    private int regiao_fiscal;
    private String estado;
        
    //DE ACORDO COM O ESTADO DO USUARIO DEFINIR O 9 DIGITO
        public void Seletor_Regiao_Fiscal(){
            switch (estado) {
                case "DF","GO","MT","MS","TO":
                    setRegiao_fiscal(1);
                    break;
                
                case "AC","AP","AM","PA","RO","RR":
                    setRegiao_fiscal(2);
                    break;
                
                case "CE","MA","PI":
                    setRegiao_fiscal(3);
                    break;
                
                case "AL","PB","PE","RN":
                    setRegiao_fiscal(4);
                    break;
                    
                case "BA","SE":
                    setRegiao_fiscal(5);
                    break;
                    
                case "MG":
                    setRegiao_fiscal(6);
                    break;
                    
                case "RJ","ES":
                    setRegiao_fiscal(7);
                    break;
                
                case "SP":
                    setRegiao_fiscal(8);
                    break;
                    
                case "PR","SC":
                    setRegiao_fiscal(9);
                    break;
                    
                case "RS":
                    setRegiao_fiscal(0);
                    break;
            }
        
        }
    
    //PEGAR REGIAO FISCAL
    public int getRegiao_fiscal() {
        return regiao_fiscal;
    }

    //DEFINIR REGIAO FISCAL
    public void setRegiao_fiscal(int regiao_fiscal) {      
        this.regiao_fiscal = regiao_fiscal;
    }

    //PEGAR ESTADO DIGITO PELO USUARIO
    public String getEstado() {
        return estado;
    }

    //DEFINIR ESTADO DIGITADO PELO USUARIO
    public void setEstado(String estado) {
        this.estado = estado;
    }
}
