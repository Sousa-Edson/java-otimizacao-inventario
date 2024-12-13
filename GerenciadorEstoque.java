import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class GerenciadorEstoque {

    // Map de produtos com suas quantidades
    private static final Map<String, Integer> produtosEstoque = new HashMap<>();

    static {
        // Inicializando o estoque com alguns produtos
        produtosEstoque.put("Switch", 10);
        produtosEstoque.put("Roteador", 0);
        produtosEstoque.put("Teclado", 25);
        produtosEstoque.put("Mouse", 10);
        produtosEstoque.put("Servidor", 5);
    }

    public static String consultarProduto(String nomeProduto) {
        // TODO: Verifique se o produto está no estoque:
        // 1. Cheque se o produto está presente no HashMap 'produtosEstoque'.
        // 2. Se estiver, verifique se a quantidade é maior que zero e retorne "Produto disponivel: X em estoque."
        // 3. Se a quantidade for zero, retorne "Produto indisponivel: X em estoque."
        // 4. Se o produto não estiver presente no HashMap, retorne "Produto nao encontrado."

for(String produto : produtosEstoque.keySet()){
    if(produto.equals(nomeProduto)){
        if(produtosEstoque.get(produto) > 0){
            return "Produto disponivel: " + produtosEstoque.get(produto) + " em estoque.";
        }else{
            return "Produto indisponivel: " + produtosEstoque.get(produto) + " em estoque.";
        }
    }

}
        return "Produto nao encontrado.";
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        String nomeProduto = scanner.nextLine().trim();

        // Consultando o produto e exibindo o resultado
        String resultado = consultarProduto(nomeProduto);
        System.out.println(resultado);

        scanner.close();
    }
}