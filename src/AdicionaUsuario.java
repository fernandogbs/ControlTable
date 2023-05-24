import java.util.Scanner;

import DAO.UsuarioDAO;
import entity.Usuario;

public class AdicionaUsuario{
    
    public void adicionaUsuario(){
        Scanner sc = new Scanner(System.in);
        Usuario usuario = new Usuario();

        System.out.println("Digite o nome do usuário: ");
        String userName = sc.nextLine();

        System.out.println("Digite o email do usuário: ");
        String userMail = sc.nextLine();

        System.out.println("Digite o login do usuário: ");
        String userLogin = sc.nextLine();

        System.out.println("Digite a senha do usuário: ");
        String userPass = sc.nextLine();
        
        usuario.setNome(userName);
        usuario.setLogin(userLogin);
        usuario.setEmail(userMail);
        usuario.setSenha(userPass);
        sc.close();

        new UsuarioDAO().cadastrarUsuario(usuario);

        // if (alternativa == "y"){
        //     adicionaUsuario();
        // } else {
        //     System.out.println("Usuario(s) cadastrado no bando de dados com sucesso!");
        // }
        
    }
    
}