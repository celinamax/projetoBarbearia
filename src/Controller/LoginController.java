
package Controller;

import Controller.Helper.LoginHelper;
import View.Login;
import model.Usuario;

public class LoginController {
    private final Login view;
    private LoginHelper helper;
    
    public LoginController(Login view){
        this.view = view;
        this.helper = new LoginHelper(view);
    }
    
    public void botaoEntrar(){        
        System.out.println("Message Dialog!");        
        this.view.exibeMensagem("Acabei de entrar!");
    }
    
    public void entrarNoSistema(){  
        Usuario user = helper.obterUsuario();
        
    }
    
}
