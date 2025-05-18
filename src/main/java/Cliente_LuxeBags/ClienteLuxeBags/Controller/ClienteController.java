package Cliente_LuxeBags.ClienteLuxeBags.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import Cliente_LuxeBags.ClienteLuxeBags.Model.Cliente;
import Cliente_LuxeBags.ClienteLuxeBags.Service.ClienteService;
import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.PathVariable;




@RestController
@RequestMapping("/cliente")
public class ClienteController {

    @Autowired
    private ClienteService clienteservice;

    @GetMapping("/listar")
    public ResponseEntity<List<Cliente>> listarCliente() {
        List<Cliente> clientes = clienteservice.listarClientes();
        if (clientes.isEmpty()) {
            return ResponseEntity.noContent().build(); // 204 Content
        }
        return ResponseEntity.ok(clientes);
    }

    @PostMapping("/guardar")
    public ResponseEntity<String>guardarCliente(@RequestBody Cliente cliente) {

        Cliente clienteExistente= clienteservice.buscarPorId(cliente.getIdCliente());
        if (clienteExistente!=null) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST)
            .body("La notificacion con id"+ cliente.getIdCliente()+ "ya existe");
        }
        String mensaje= clienteservice.guardarClientes(cliente);
        return ResponseEntity.status(HttpStatus.CREATED).body(mensaje);
    }

    @PutMapping("/actualizar")
    public ResponseEntity<String> actualizarCliente(@RequestBody Cliente cliente) {
        Cliente clienteExtistente =  clienteservice.buscarPorId(cliente.getIdCliente());
        if (clienteExtistente == null) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Cliente con Id"+ cliente.getIdCliente()+ "no encontrado");
        }
        clienteExtistente.setme
        return entity;
    }






    
    
}
