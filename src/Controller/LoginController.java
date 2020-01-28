
package Controller;

import View.Login;

public class LoginController {
    private final Login view;
    
    public LoginController(Login view){
        this.view = view;
    }
    
    public void fizTarefa(){        
        System.out.println("Message Dialog!");        
        this.view.exibeMensagem("Testando o Alert!");
    }
    
}
