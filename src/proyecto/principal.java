package proyecto;
import java.io.BufferedReader;
import java.io.FileReader;
import java.net.InetAddress;
import java.net.*;

//import org.joda.time.format.*;

public class principal {
	public static void main (String[] args) throws Exception {
		System.out.println("DATOS DE ESTUDIANTE");
		try {	
            System.out.println("=========================");
            System.out.println("0910-14-8526, Ricardo Humberto Cuc Salazar, C");
            System.out.println("" + InetAddress.getLocalHost());
            System.out.println("=========================");
            
		} catch (UnknownHostException ex) {
            //Logger.getLogger(App.class.getName()).log(Level.SEVERE, null, ex);
        }

        //
		HashTab PersonasL= new HashTab(80);
		
		int id=1;
				
			BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\Ricardo\\Downloads\\ProyectoFinal\\src\\proyecto\\ListaC.csv")); 
			String line;
			
			while ((line = br.readLine()) != null) { 
			    // use comma as separator 
			    String[] cols = line.split(";"); 
				Persona pers = new Persona(id++,Integer.parseInt(cols[0]), cols[1], cols[2]);
				PersonasL.add(pers);
				System.out.println("Elemento Agregado "+id); 
			} 
			//comentario
			/*
			System.out.println("C) El primer Nodo de la PersonasLinkList..");
			PersonasLinkList.eliminarPrincipio();
			System.out.println("D)Insertar nodo al final de la PersonasLinkList.");
			Persona personaf = new Persona(Long.parseLong("2170470920101"),"Ricardo Humberto Cuc Salazar", datetimeformat.parseDateTime("20/12/1992"));
			PersonasLinkList.insertarFinal(personaf);
			
			*/
			br.close();
			if(id>=1){
			PersonasL.list();
			}
	}	
}
