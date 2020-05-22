package br.newtonpaiva.us.teste;

import br.newtonpaiva.us.evento.Evento;
import br.newtonpaiva.us.interesse.Interesse;
import br.newtonpaiva.us.usuario.DonoEvento;
import br.newtonpaiva.us.usuario.ListaAmigos;
import br.newtonpaiva.us.usuario.Perfil;
import br.newtonpaiva.us.usuario.Usuario;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        //Teste Evento
       Date date = new Date();
       Evento evento = new Evento(1,1);
        System.out.println("Nome do evento");
        
        evento.setNomeEvento("LeoFesta");       
        System.out.println(evento.getNomeEvento());
        System.out.println(evento.getNomeEvento().equals("LeoFesta"));
        
        evento.setDesEndereco("Rua teste: ");
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
        System.out.println("Dono do Evento: ");
        donoEvento.setNom_estebalecimento("LeoLeo");
        System.out.println(donoEvento.getNom_estebalecimento());
        System.out.println(donoEvento.getNom_estebalecimento().equals ("LeoLeo"));
        
        donoEvento.setNum_cnpj("666");
        System.out.println(donoEvento.getNum_cnpj());
        System.out.println(donoEvento.getNum_cnpj().equals ("666"));
        
        //Teste Interesse
        Interesse interesse = new Interesse();
        System.out.println("-------------------------------------------");
        System.out.println("Teste Interesse");
        interesse.setId_interesse(10);
        interesse.setDes_interesso("pagode");
        System.out.println(interesse.getId_interesse());
        System.out.println(interesse.getDes_interesso());
        System.out.println(interesse.getId_interesse().equals(10));
        System.out.println(interesse.getDes_interesso().equals("pagode"));
        
        //Teste ListaAmigos
        ListaAmigos listaamigos = new ListaAmigos();
        System.out.println("-------------------------------------------");
        System.out.println("Teste ListaAmigos");
        listaamigos.setId_Lista_Amigos(5);
        listaamigos.setId_perfil(333);
        System.out.println(listaamigos.getId_Lista_Amigos());
        System.out.println(listaamigos.getId_perfil());
        System.out.println(listaamigos.getId_Lista_Amigos().equals(5));
        System.out.println(listaamigos.getId_perfil().equals(333));
        
        //Teste Perfil
        Perfil perfil = new Perfil ();
        System.out.println("----------------------------------------------");
        System.out.println("Teste Perfil");
        perfil.setId_perfil(39);
        perfil.setNom_nick("Roger federer");
        perfil.setDes_endereco("rua esmeralda");
        perfil.setId_Usuario(18);
        perfil.setId_lista_amigos(45);
        perfil.setDta_nascimento(date);
        
        
        System.out.println(perfil.getDes_endereco());
        System.out.println(perfil.getId_Usuario());
        System.out.println(perfil.getId_lista_amigos());
        System.out.println(perfil.getNom_nick());
        System.out.println(perfil.getDta_nascimento());
        System.out.println(perfil.getId_perfil());
        
        
        System.out.println(perfil.getDes_endereco().equals("rua esmeralda"));
        System.out.println(perfil.getId_Usuario().equals(18));
        System.out.println(perfil.getId_lista_amigos().equals(45));
        System.out.println(perfil.getNom_nick().equals("Roger federer"));
        System.out.println(perfil.getDta_nascimento().equals(date));
        System.out.println(perfil.getId_perfil().equals(39));
        
        // Usuario
        Usuario usuario = new Usuario();
        System.out.println("-------------------------------------------");
        System.out.println("Teste Usuario");
        usuario.setEmail("novakdjokovic@gmail.com");
        usuario.setId_usario(25);
        usuario.setLogin("rafaelnadal");
        usuario.setSenha("80028922");
        usuario.setTelefone("08003004");
        
        System.out.println(usuario.getEmail());
        System.out.println(usuario.getId_usario());
        System.out.println(usuario.getLogin());
        System.out.println(usuario.getSenha());
        System.out.println(usuario.getTelefone());
        
        System.out.println(usuario.getEmail().equals("novakdjokovic@gmail.com"));
        System.out.println(usuario.getId_usario().equals(25));
        System.out.println(usuario.getLogin().equals("rafaelnadal"));
        System.out.println(usuario.getSenha().equals("80028922"));
        System.out.println(usuario.getTelefone().equals("08003004"));
        
        
        
        
        
        
        }
    
}
