/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package poop3;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Enumeration;
import java.util.Hashtable;

/**
 *
 * @author erics
 */
public class POOP3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         int nums1[];
        int[]nums2 = {1,2,3,4,5};
        int[] nums3 = new int[5];
        int[] nums4;
        nums4 = new int[5];
        
        System.out.println("########for each########");
        for( int temp : nums2 ){
            System.out.println("Cuenta:" + temp);
            
        }
        System.out.println("######### for #######");
        for (int i = 0; i < nums4.length; i++) {
            nums4[i] = i*10;
            
        }
        for (int i = 0; i < nums4.length; i++) {
            int j = nums4[i];
            System.out.println(j);
            
        }
        System.out.println("###### String #######");
        String cadena = new String("Hola mundo"); //-> Canonica
        System.out.println(cadena);
        String cadena1 = "Forma recomendada"; //->Recomendada
        System.out.println(cadena1);
        
        String nombre = "Eric ";
        String apellido = "Soto ";
        System.out.println(nombre);
        System.out.println(apellido);
        System.out.println(nombre+apellido);
        String nombreCompleto = nombre+apellido;
        System.out.println(nombreCompleto);
        
        System.out.println("####### Wrapper ######");
        int a = 4;
        Integer b = new Integer(4);
        System.out.println(b);
        Integer c = 4; 
        System.out.println(c);
        Integer d = a;
        String cadena3 = d.toString();
        String cadena4 = 4 + "";
        System.out.println(cadena3);
        System.out.println(cadena4);
        
        System.out.println("####### Colecciones ######");
        System.out.println("####### ArrayList ######");
         
        ArrayList<Integer> miArrayList = new ArrayList<Integer>();
        miArrayList.add(d);
        miArrayList.add(33);
        miArrayList.add(77);
        System.out.println(miArrayList.size());
        System.out.println(miArrayList.get(0));
        miArrayList.add(1, 10);
        System.out.println(miArrayList.size());
        System.out.println("////");
        for(Integer temp : miArrayList){
            System.out.println(temp);
        }
        miArrayList.add(77);
        System.out.println("////");
        for(Integer temp : miArrayList){
            System.out.println(temp);
        }
        System.out.println("Nuevo tamaño "+miArrayList.size());
        
        System.out.println("####### Hashtable ######");
        
        Hashtable<Integer,String> miTabla = new Hashtable<Integer,String>();
        miTabla.put(1,"uno");
        miTabla.put(555342123,"Antonio");
        miTabla.put(55678543, "Diana");
        System.out.println("Elementos de la tabla: "+miTabla.size());
        
        System.out.println("######### Enumerador #########");
        Integer llave;
        String valor;
        
        Enumeration<Integer> enumeradorLlaves =miTabla.keys();
        while(enumeradorLlaves.hasMoreElements()){
            llave = enumeradorLlaves.nextElement();
            valor = miTabla.get(llave);
            System.out.println(llave+" "+valor);
        }
        System.out.println(Math.PI);
        Date dia = new Date();
        System.out.println(dia);
        ///buscar calendar
        ///realizar una agenda con 5 registros
        
        /* código complementario */


System.out.println("************* Math **************");
System.out.println(Math.PI);
System.out.println(Math.abs(-5));
System.out.println(Math.pow(3, 2));
System.out.println(Math.sqrt(9));
System.out.println(Math.max(80, 7));

System.out.println("************* Date **************");
Date hoy = new Date();
System.out.println(hoy);

System.out.println("************* Calendario **************");
Calendar calendarioHoy = Calendar.getInstance();
System.out.println(calendarioHoy);

System.out.println("************* Formato de date **************");
SimpleDateFormat formatoFecha = new SimpleDateFormat("dd-MM-yyyy");
System.out.println(formatoFecha.format(hoy));

System.out.println("************* Formato de calendar **************");

String fechaActual = calendarioHoy.get(Calendar.DAY_OF_MONTH) + " de ";
fechaActual += (calendarioHoy.get(Calendar.MONTH)+1 + " de ");
fechaActual += calendarioHoy.get(Calendar.YEAR);
System.out.println(fechaActual);
     
       

   
    }
    
}

    
    

