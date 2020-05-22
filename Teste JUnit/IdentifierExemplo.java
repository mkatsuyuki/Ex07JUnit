public class IdentifierExemplo{
    

    public String validacaoID (String id){
        int comprimento = id.length();
        int numcaract = comprimento;
        char[] letra = id.substring(0,1).toCharArray();
        String saidaval = "ID válido";
        String saidainval = "ID inválido";
        if(comprimento>=6 && comprimento<=12){          
            
            if(Character.isLetter(letra[0])){
                for (char c : id.toCharArray()) {
                    if( Character.isLetter(c) || Character.isDigit(c)){
                        numcaract --;
                    }
                    
                }
                if(numcaract==0){
                    return saidaval;
                }
                else{
                    return saidainval;
                }
                
            }
            else{
                return saidainval;
            }
        }
            return saidainval;
        
    }
}
