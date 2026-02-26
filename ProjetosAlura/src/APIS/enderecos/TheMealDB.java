package APIS.enderecos;

import APIS.request.Request;

public class TheMealDB extends Request {
    public TheMealDB(String busca) {
        this.setEndereco("https://www.themealdb.com/api/json/v1/1/search.php?s=");
        this.setBusca(busca);
    }
}
