package APIS.enderecos;

import APIS.request.Request;

public class GoogleBooks extends Request {
    public GoogleBooks(String busca) {
        this.setEndereco("https://www.googleapis.com/books/v1/volumes?q=");
        this.setBusca(busca);
    }

}
