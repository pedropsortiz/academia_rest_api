package br.ufsm.csi.poow2.academia_java.Controller;

import br.ufsm.csi.poow2.academia_java.Dao.ClienteDao;
import br.ufsm.csi.poow2.academia_java.Model.Cliente;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
@RequestMapping("/cliente")
public class ClienteController {

    @GetMapping("/clientes")
    public ArrayList<Cliente> getClientes(){
        return new ClienteDao().getClientes();
    }

    @GetMapping
    public Cliente getCliente(){
        return new ClienteDao().getCliente();
    }

}
