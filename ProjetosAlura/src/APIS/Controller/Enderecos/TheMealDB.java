package Apis.Controller.Enderecos;

import Apis.Controller.Excecao.ErroConsultaException;
import Apis.Controller.Request.Request;

public class TheMealDB extends Request {
    public TheMealDB(String busca) throws ErroConsultaException {
        this.setEndereco("https://www.themealdb.com/api/json/v1/1/search.php?s=");
        this.setBusca(busca);

        if (busca == null){
            throw new ErroConsultaException("Receita nao encontrada");
        }
    }
}
