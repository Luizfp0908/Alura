package Apis.Model.Enderecos;

import Apis.Excecao.ErroConsultaException;
import Apis.Model.Request.Request;

public class ViaCep extends Request {
    public ViaCep(String busca) throws ErroConsultaException {
        this.setEndereco("https://viacep.com.br/ws/");
        this.setBusca(busca + "/json/");

        if (busca == null){
            throw new ErroConsultaException("Cep nao encontrado");
        }
    }
}
