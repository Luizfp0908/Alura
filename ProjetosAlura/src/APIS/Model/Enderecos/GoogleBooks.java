package Apis.Model.Enderecos;

import Apis.Excecao.ErroConsultaException;
import Apis.Model.Request.Request;

public class GoogleBooks extends Request {
    public GoogleBooks(String busca) {
        this.setEndereco("https://www.googleapis.com/books/v1/volumes?q=");
        this.setBusca(busca);

        if (busca == null){
            throw new ErroConsultaException("Livro nao encontrado");
        }
    }

}
