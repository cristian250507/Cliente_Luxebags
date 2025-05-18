package Cliente_LuxeBags.ClienteLuxeBags.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import Cliente_LuxeBags.ClienteLuxeBags.Model.Cliente;
import Cliente_LuxeBags.ClienteLuxeBags.Service.ClienteService;
import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;



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
        String mensaje= clienteservice.guardarClientes(cliente);
        
        return ResponseEntity.status(HttpStatus.CREATED).body(mensaje);
    }
    
    
}
