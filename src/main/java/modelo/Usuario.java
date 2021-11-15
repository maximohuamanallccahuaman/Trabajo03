
package modelo;

import lombok.Data;

@Data
public class Usuario {
    String NOMUSU;
    String PWUSU;
    int NIVUSU;
    String EMAUSU;
    
    Proveedor proveedor = new Proveedor(); 
}
