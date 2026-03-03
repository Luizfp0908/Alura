package Apis.Controller.Enderecos;

import Apis.Controller.Excecao.ErroConsultaException;
import Apis.Controller.Request.Request;

public class GoogleBooks extends Request {
    public GoogleBooks(String busca) {
        this.setEndereco("https://www.googleapis.com/books/v1/volumes?q=");
        this.setBusca(busca);

        if (busca == null){
            throw new ErroConsultaException("Livro nao encontrado");
        }
    }

}
