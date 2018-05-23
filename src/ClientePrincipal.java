import br.feevale.*;
import sun.print.resources.serviceui;
/**
 *
 * @author 0138905
 */
public class ClientePrincipal {
    
    public static void main(String[] args){
        WService_Service service = new WService_Service();
        
        WService servicoSoma = service.getWServicePort();
        
        double valorResposta = servicoSoma.soma(20, 40);
        
        System.out.println("Resposta = " + valorResposta);
        
        System.out.println(servicoSoma.advinhar(3));
        System.out.println(servicoSoma.advinhar(3));
        System.out.println(servicoSoma.advinhar(3));
        System.out.println(servicoSoma.advinhar(3));
        
        
    }
    
}
