package uno;

//Programa en java que accede a la dirección MAC del dispositivo local

import java.net.InetAddress;
import java.net.NetworkInterface;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.util.Enumeration;
public class MACAddress {
 public static void main(String[] args) throws Exception
 {
     // instanciar la clase MACAddress2
     MACAddress obj = new MACAddress();
     
     // llamar al metodo getMAC(), pasando la direccion local como parametro
          
     obj.getMAC();
 }

 // metodo que retorna la MAC del dispositivo local
 void getMAC()
 {
     try {
         
         // crea una enumaracion por cada interfaz y va
    	// almacenando los valores que retorna el metodon
         // NetworkInterface.getNetworkInterfaces()
         // method
         Enumeration<NetworkInterface> networks
             = NetworkInterface.getNetworkInterfaces();
         
         // por cada red en la enumeracion de interfaces
         while (networks.hasMoreElements()) {
             NetworkInterface network
                 = networks.nextElement();
             
             // llama al metodo getHardwareAddress() por cada red
             // y almacena los valores en un array de bytes
             
             byte[] mac = network.getHardwareAddress();

             if (mac != null) {
                 System.out.print(
                     "Current MAC address : ");
                 
                 //convierte el array en un string imprimible
                 StringBuilder sb = new StringBuilder();
                 for (int i = 0; i < mac.length; i++) {
                     sb.append(String.format(
                         "%02X%s", mac[i],
                         (i < mac.length - 1) ? "-"
                                              : ""));
                 }
                 
                 // imprime el string que contiene la direccion MAC 
                 System.out.println(sb.toString());
             }
         }
     }
     catch (SocketException e) {
         e.printStackTrace();
     }
 }}
 
