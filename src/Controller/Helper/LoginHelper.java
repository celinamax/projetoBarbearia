
package Controller.Helper;

import View.Login;
import model.Usuario;

public class LoginHelper {
    
    private final Login view;
    
    
    public LoginHelper(Login view){
        this.view = view;        
    }
    
    public Usuario obterUsuario(){        
        //pegar usuario da view
        String nome = view.getTextUsuario().getText();
        String senha = view.getTextSenha().getText();
        
        Usuario user = new Usuario(1, nome, senha);
        
        return user;
    }
    
    public void setarUser(Usuario user){
        String nome = user.getNome();
        String senha = user.getSenha();
        
        view.getTextUsuario().setText(nome);
        view.getTextSenha().setText(senha);
    }
    
    public void limparTela(){
        view.getTextUsuario().setText("");
        view.getTextSenha().setText("");
    }
    
}
