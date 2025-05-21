package Cliente_LuxeBags.ClienteLuxeBags.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Cliente_LuxeBags.ClienteLuxeBags.Model.Cliente;
import Cliente_LuxeBags.ClienteLuxeBags.Repository.ClienteRepository;
import jakarta.transaction.Transactional;

@Service
@Transactional
public class ClienteService {

    @Autowired

    private ClienteRepository clienterepository;

    public List<Cliente> listarClientes(){
        return clienterepository.findAll();
    }

    public String guardarClientes(Cliente cliente){
        clienterepository.save(cliente);
        return "El cliente con el siguiente ID: "+ cliente.getIdCliente()+ " fue guardado con exito";
    }

    public String actualizarCliente(Cliente cliente){
        clienterepository.save(cliente);
        return "Cliente: " + cliente.getIdCliente()+ " actualizado con exito";
    }

    public String eliminarCliente(Integer idCliente){
        clienterepository.deleteById(idCliente);
        return "Cliente: "+ idCliente + "eliminado con exito";
    }

    public Cliente buscarPorId (Integer idCliente){
        return clienterepository.findById(idCliente).orElse(null);
    }

<<<<<<< HEAD
    public Cliente buscarPorRut(String rut) {
        return clienterepository.findByRut(rut);
    }
    
=======
>>>>>>> 5d9fb2e6e04607f7c3ce9ead719ad250c012e431




}
