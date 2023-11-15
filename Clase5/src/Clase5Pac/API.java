package Clase5Pac;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Scanner;

import org.json.JSONObject;

public class API {

	public static void main(String [] args)
	{
	try {
	//Bloque 1 se encarga de declarar la URL, abrir la conexion, establecer el metodo y conectarme.
	URL url = new URL("https://api.open-meteo.com/v1/forecast?latitude=41.3888&longitude=2.159&hourly=temperature_2m&forecast_days=1");
	HttpURLConnection conn = (HttpURLConnection) url.openConnection();
	conn.setRequestMethod("GET");
	conn.connect();
	//Finaliza bloque 1. 
	//int codigoRespuesta = conn.getResponseCode();
	//StrinbGuilder es el encargado de bajar la informacion de la API y almacenarla en un String. 
	StringBuilder informacion = new StringBuilder();
	Scanner sc = new Scanner (url.openStream());
	while(sc.hasNext())
	{
		informacion.append(sc.nextLine());
	}
	System.out.println(informacion);
	JSONObject objeto = new JSONObject(informacion.toString());
	System.out.println(objeto);
	double latitude = objeto.getDouble("latitude");
	double longitude = objeto.getDouble("longitude");
	double elevation = objeto.getDouble("elevation");
	String timezone = objeto.getString("timezone");
	System.out.println("La latidud es: " + latitude);
	System.out.println("La longitude es: " + longitude);
	System.out.println("La elevation es: " + elevation);
	System.out.println("El timezone es: " + timezone);	
	sc.close();
	}
	catch(IOException e)
	{
		e.printStackTrace();
	}
	}

}
