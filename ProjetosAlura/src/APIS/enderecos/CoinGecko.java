package APIS.enderecos;

import APIS.request.Request;

public class CoinGecko extends Request {
    private String moeda;
    public CoinGecko(String busca) {
        this.setEndereco("https://api.coingecko.com/api/v3/simple/price?vs_currencies=brl&ids=");
        this.setBusca(busca);
    }
}
