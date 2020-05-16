package br.newtonpaiva.us.teste;

import br.newtonpaiva.us.evento.Evento;
import br.newtonpaiva.us.usuario.DonoEvento;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        //Teste Evento
       Date date = new Date();
       Evento evento = new Evento(1,1);
        System.out.println("Digite o nome do evento");
        
        evento.setNomeEvento("LeoFesta");       
        System.out.println(evento.getNomeEvento());
        System.out.println(evento.getNomeEvento().equals("LeoFesta"));
        
        evento.setDesEndereco("Rua teste");
        System.out.println(evento.getDesEndereco());
        System.out.println(evento.getDesEndereco().equals("Rua teste"));
        
        evento.setDataEvento(date);
        System.out.println(evento.getDataEvento());
        System.out.println(evento.getDataEvento() == date);
        
        evento.setDesEvento("Evento top");
        System.out.println(evento.getDesEvento());
        System.out.println(evento.getDesEvento().equals("Evento top"));
        
        //Teste DonoEvento
        DonoEvento donoEvento = new DonoEvento(1,1);
        
        System.out.println("\n");
        
        donoEvento.setNom_estebalecimento("LeoLeo");
        System.out.println(donoEvento.getNom_estebalecimento());
        System.out.println(donoEvento.getNom_estebalecimento().equals ("LeoLeo"));
        
        donoEvento.setNum_cnpj("666");
        System.out.println(donoEvento.getNum_cnpj());
        System.out.println(donoEvento.getNum_cnpj().equals ("666"));
        }
    
}
