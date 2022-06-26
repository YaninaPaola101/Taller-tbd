
package model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
/// no usar !
//@Entity
public class UsuarioRol {
    
    @Id
    Long id;
    
    //@ManyToOne
    //@JoinColumn(name="id_usuario")
    UsuarioModel usuarioModels;
    
    //@ManyToOne
    //@JoinColumn(name="id_rol")
    RolModel rolModel;
}
