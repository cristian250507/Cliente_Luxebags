package Cliente_LuxeBags.ClienteLuxeBags.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import Cliente_LuxeBags.ClienteLuxeBags.Model.Cliente;

@Repository
//agrupa metodos
public interface ClienteRepository extends JpaRepository<Cliente ,Integer >{

}
