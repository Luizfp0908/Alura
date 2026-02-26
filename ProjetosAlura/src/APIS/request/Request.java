package APIS.Request;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public abstract class Request {
    protected String endereco;
    protected String busca;

    public Request() {
        this.endereco = endereco;
        this.busca = busca;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setBusca(String busca) {
        this.busca = busca;
    }

    public String getBusca() {
        return busca;
    }

    public void requesicao() throws IOException, InterruptedException {
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(endereco + getBusca()))
                .build();

        HttpResponse<String> response = client.send(request,HttpResponse.BodyHandlers.ofString());
        System.out.println(response.body());
    }

    @Override
    public String toString() {
        return "Busca realizada por: " + busca;
    }
}
