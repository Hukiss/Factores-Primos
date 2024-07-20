import java.util.ArrayList;
import java.util.List;

public class NumerosPrimos
{
    List<Integer> list = new ArrayList<>();

    public final int DOIS = 2;
    private int limite;

    public void setLimite(int limite){
        if (limite <= 0)                                                                                  // Verifica se o valor a ser inserido no campo "limite"
            throw new IllegalArgumentException("limite não pode ser um número negativo, nem nulo");     // caso não cumpre a condisão então lança uma Exceção
        this.limite = limite;
    }

    public int getLimite(){
        return limite;
    }

    public List<Integer> primo()
    {
        for (int counter = DOIS; counter <= getLimite(); counter++)          // Os valores a serem adicionados ao ArrayList virão do "For"
            if (!(auxiliar(counter, list)))                    // e serão verificados no método "auxiliar", podendo retornar "false ou true"
                list.add(counter);                                      // caso seja false então ele adiciona ao ArrayList "list", caso não pila para outra iteraçÕ

        return list;
    }

    private boolean auxiliar(int counter,List<Integer> list)
    {
        boolean valor = false;
        for (Integer integer : list)
            if ((counter % integer == 0)) {                       // apenas se for false, e se for verdadeiro significa que tem
                valor = true;
                break;
            }
        return valor;                                                   // Retorna o valor "false ou true"
    }
}
