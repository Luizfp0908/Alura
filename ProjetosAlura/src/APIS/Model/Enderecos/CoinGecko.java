package Apis.Model.Enderecos;

import Apis.Excecao.ErroConsultaException;
import Apis.Model.Request.Request;

public class CoinGecko extends Request {
    private String moeda;
    public CoinGecko(String busca) throws ErroConsultaException {
        this.setEndereco("https://api.coingecko.com/api/v3/simple/price?vs_currencies=brl&ids=");
        this.setBusca(busca);

        if (busca == null){
            throw new ErroConsultaException("Moeda nao encontrado");
        }
    }
}
