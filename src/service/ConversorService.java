package service;

import model.Moneda;
import model.RespuestaApi;

public class ConversorService {

    private ApiService api = new ApiService();

    // Método para convertir
    public double convertir(int opcion, double monto) throws Exception {

        String base = "USD";
        String destino = "";

        switch (opcion) {
            case 1: destino = "ARS"; break;
            case 2: destino = "BRL"; break;
            case 3: destino = "CLP"; break;
            case 4: return -1; // salir
            default: throw new IllegalArgumentException("Opción inválida");
        }

        double tasa = api.obtenerTasa("af0c44143063d16d65c6df57", base, destino);

        return monto * tasa;
    }
}
