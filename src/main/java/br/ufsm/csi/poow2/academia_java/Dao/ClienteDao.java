package br.ufsm.csi.poow2.academia_java.Dao;

import br.ufsm.csi.poow2.academia_java.Model.Cliente;

import java.util.ArrayList;

public class ClienteDao {

    public ArrayList<Cliente> getClientes(){
        ArrayList<Cliente> clientes = new ArrayList<>();

        clientes.add(new Cliente(1, "Pedro"));
        clientes.add(new Cliente(2, "Carlos"));
        clientes.add(new Cliente(3, "Angela"));
        clientes.add(new Cliente(4, "Teresa"));
        clientes.add(new Cliente(5, "Joaquim"));

        return clientes;
    }

    public Cliente getCliente(){
        return new Cliente(6, "Bruno");
    }

}
