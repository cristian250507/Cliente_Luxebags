package Cliente_LuxeBags.ClienteLuxeBags.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import Cliente_LuxeBags.ClienteLuxeBags.Model.Cliente;

<<<<<<< HEAD


=======
>>>>>>> 5d9fb2e6e04607f7c3ce9ead719ad250c012e431
@Repository
//agrupa metodos
public interface ClienteRepository extends JpaRepository<Cliente ,Integer >{

<<<<<<< HEAD
    Cliente findByRut(String rut);

=======
>>>>>>> 5d9fb2e6e04607f7c3ce9ead719ad250c012e431
}
