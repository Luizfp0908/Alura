package APIS.Excecao;

public class ErroConsultaException extends RuntimeException {
        private String name;

        public ErroConsultaException(String name){
            this.name = name;
        }

        public String getName() {
            return this.name;
        }

}
