/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.lojamvc.controller;

import br.lojamvc.DAO.ClienteDAO;
import br.lojamvc.model.Cliente;
import java.util.ArrayList;

/**
 *
 * @author fernando.fernandes
 */
public class ClienteController {
    
   
    /**Método Estático Salvar
     * Salvo os dados do cliente na memória ou no banco de dados
     * @param Id 
     * @param pNome
     * @param pCPF
     * @return 
     */
    public static boolean salvar(String pNome, String pCPF)
    {
        //Salvo na memória
        Cliente p =  new Cliente(pNome,pCPF);
        return ClienteDAO.salvar(p);
    }
    
    public static boolean excluir(int pID)
    {
        return ClienteDAO.excluir(pID);
    }
    
    public static boolean atualizar(int pId, String pNome, String pCPF)
    {
        Cliente p =  new Cliente(pId,pNome,pCPF);
        return ClienteDAO.atualizar(p);
        
    }
    
    /**
     * Transformo uma lista de objetos Cliente em uma lista de Strings
     * @return lista de string
     */
    public static ArrayList<String[]> getClientes()
    {
        ArrayList<Cliente> clientes = ClienteDAO.getClientes();
        ArrayList<String[]> listaClientes = new ArrayList<>();
        
        for(int i=0;i<clientes.size();i++)
        {
            listaClientes.add(new String[]{String.valueOf(clientes.get(i).getId()),clientes.get(i).getNome(),String.valueOf(clientes.get(i).getCPF())  });
        
        }
        
        return listaClientes;
        
    }
    
}
