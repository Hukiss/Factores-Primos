
import java.util.List;
import java.util.Stack;

public class Composicao {

    Stack<Integer> stack = new Stack<>();

    private List<Integer> lista;
    private int valor;

    public List<Integer> getLista() {
        return lista;
    }

    public void setLista(List<Integer> lista) {
        this.lista = lista;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        if (valor <= 0)
            throw new IllegalArgumentException("valor não pode ser um número negativo, nem nulo\n");
        this.valor = valor;
    }

    public void decompondo() {
        int resultado = getValor();
        do {
            for (int i = 0; i < getLista().size(); i++) {
                if (resultado % lista.get(i) == 0) {
                    stack.push(lista.get(i));
                    resultado = resultado / lista.get(i);
                    i = 0;
                }
            }
        } while (resultado != 1);
        System.out.println(stack.toString());
    }
}
