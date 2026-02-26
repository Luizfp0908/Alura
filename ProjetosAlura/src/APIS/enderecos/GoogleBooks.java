package APIS.Enderecos;

import APIS.Excecao.ErroConsultaException;
import APIS.Request.Request;

public class GoogleBooks extends Request {
    public GoogleBooks(String busca) {
        this.setEndereco("https://www.googleapis.com/books/v1/volumes?q=");
        this.setBusca(busca);

        if (busca == null){
            throw new ErroConsultaException("Livro nao encontrado");
        }
    }

}
