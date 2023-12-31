import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import br.com.system.Generate.GenerateFile;
import br.com.system.models.ConsultCep;
import br.com.system.record.Address;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner read = new Scanner(System.in);
        List<Address> allAddress = new ArrayList<>();

        int out = 1;
        while (out == 1) {
            System.out.println("Digite um CEP para busca " + " ou sair:");
            var cep = read.nextLine();

            if (cep.equalsIgnoreCase("sair")) {
                out = 0;
                break;
            }
            ConsultCep consultaCep = new ConsultCep();
            Address newAddress = consultaCep.findAddress(cep);
            GenerateFile generateJson = new GenerateFile();
            allAddress.add(newAddress);
            generateJson.saveJson(allAddress);
            System.out.println(newAddress);
        }

    }
}
