package lojarepository;


	import loja.model.Loja;

	public interface LojaRepository {

	    // Métodos CRUD 
	    public void procurarPorNumero(int numero);
	    public void listarTodos();
	    public void cadastrar(Loja loja);
	    public void atualizar(Loja loja);
	    public void deletar(int numero);
	}

	
	
	

