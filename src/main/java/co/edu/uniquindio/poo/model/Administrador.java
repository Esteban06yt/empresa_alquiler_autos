package co.edu.uniquindio.poo.model;

import java.util.LinkedList;

public class Administrador extends Persona{

    private LinkedList<Cliente> listaClientes;

    public Administrador(String nombre, String apellido, String cedula, String telefono, String correo){
        super(nombre, apellido, cedula, telefono, correo);
        this.listaClientes = listaClientes;
    }

    public String crearCliente(Cliente cliente){
        if (buscarCliente(cliente.getNombre(), cliente.getCedula()) != null){
            return "El cliente ya existe";
        }
        listaClientes.add(cliente);
        return "El cliente ha sido agregado";
    }
    public LinkedList<Cliente> obtenerClientes(){
        return listaClientes;
    }
    public Cliente buscarCliente(String nombre, String cedula){
        for (Cliente cliente : listaClientes){
            if (cliente.getNombre().equalsIgnoreCase(nombre) && cliente.getCedula().equals(cedula)){
                return cliente;
            }
        }
        return null;
    }
    public String actualizarCliente(String nombre, String apellido, String cedula, String telefono, String correo, String direccion){
        Cliente cliente = buscarCliente(nombre, cedula);
        if (cliente != null){
            cliente.setNombre(nombre);
            cliente.setApellido(apellido);
            cliente.setCedula(cedula);
            cliente.setTelefono(telefono);
            cliente.setCorreo(correo);
            cliente.setDireccion(direccion);
            return "EL cliente ha sido actualizado";
        }
        return "El cliente no fue encontrado";
    }
    public String eliminarCliente(String nombre, String cedula){
        Cliente
    }
}