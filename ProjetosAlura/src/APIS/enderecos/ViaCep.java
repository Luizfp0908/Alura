package APIS.Enderecos;

import APIS.Excecao.ErroConsultaException;
import APIS.Request.Request;

public class ViaCep extends Request {
    public ViaCep(String busca) throws ErroConsultaException {
        this.setEndereco("https://viacep.com.br/ws/");
        this.setBusca(busca + "/json/");

        if (busca == null){
            throw new ErroConsultaException("Cep nao encontrado");
        }
    }
}
