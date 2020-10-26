package finance;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.Writer;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Finance {

    public static void main(String[] args) {
        Map<Integer, Client> clientMap = Collections.synchronizedMap(new HashMap<>());
        Map<Integer, ContCurent> contcurMap = Collections.synchronizedMap(new HashMap<>());
        Map<Integer, ContEconomii> contecoMap = Collections.synchronizedMap(new HashMap<>());
        Scanner sc = new Scanner(System.in);
        Writer writer = null;
        String[] aux;
        String trans, tip;
        Transfer transfer;
        int i = 1, j = 1;
        float suma;

        try {
            Scanner scan = new Scanner(new File("test.txt"));
            while (scan.hasNextLine()) {
                aux = scan.nextLine().split(" ");
                clientMap.put(i, new Client(aux[0], aux[1], aux[2], Integer.parseInt(aux[3]), aux[4]));
                contcurMap.put(i, new ContCurent(aux[5], aux[6], Integer.parseInt(aux[7]), aux[8]));
                contecoMap.put(i, new ContEconomii(aux[9], aux[10], Integer.parseInt(aux[11]), aux[12], aux[13]));
                i++;
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Finance.class.getName()).log(Level.SEVERE, null, ex);
        }

        System.out.println("Ce clienti doresc sa efectueze transferuri? \n");
        aux = sc.nextLine().split(" ");
        System.out.println("Ce tip de transfer doriti? \n");
        trans = sc.nextLine();
        System.out.println("Ce suma doriti? \n");
        suma = Float.parseFloat(sc.nextLine());
        System.out.println("Ce tip de conturi folositi? \n");
        tip = sc.nextLine();
        switch (tip) {
            case "eco":
                transfer = new Transfer(trans, contecoMap.get(Integer.parseInt(aux[0])), contecoMap.get(Integer.parseInt(aux[1])), suma);
                break;
            case "curent":
                transfer = new Transfer(trans, contcurMap.get(Integer.parseInt(aux[0])), contcurMap.get(Integer.parseInt(aux[1])), suma);
                break;
            default:
                System.out.println("Puteti folosi doar conturi de economii sau conturi curente \n");
                break;
        }
        while (j != i) {
            System.out.println("Client " + clientMap.get(j).getNume() + " " + clientMap.get(j).getVarsta() + " Cont Curent: "
            + contcurMap.get(j).getSold()+ contcurMap.get(j).getMoneda() + " Cont Economii " + contecoMap.get(j).getSold() 
                    + contecoMap.get(j).getMoneda());
            j++;
        }

    }

}
