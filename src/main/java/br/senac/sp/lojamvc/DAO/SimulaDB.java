/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.senac.sp.lojamvc.DAO;

import br.senac.sp.lojamvc.model.Cliente;
import br.senac.sp.lojamvc.model.Produto;
import java.util.ArrayList;

/**
 *
 * @author fernando.fernandes
 * Padrão Singleton
 */
public class SimulaDB {
    
    private static SimulaDB mockdb;
    
    private ArrayList<Cliente> listaClientes; //Simulo a tabela clientes
    private ArrayList<Produto> listaProdutos; //Simulo a tabela Produtos
    
    
    private SimulaDB(){
    
        listaClientes = new ArrayList<Cliente>();
        listaProdutos = new ArrayList<Produto>();
    }
    
    public static synchronized SimulaDB getInstance(){
        if(mockdb == null)
            mockdb = new SimulaDB();
        
        return mockdb;
    }
    
    public boolean SalvarCliente(Cliente c)
    {
        listaClientes.add(c);
        
        return true;
    }
    
    public ArrayList<Cliente> getClientes()
    {
        return this.listaClientes;
    }
    
    
    public boolean AtualizarCliente(Cliente p)
    {
        for(Cliente item: listaClientes)
        {
            if(item.getId() == p.getId())
            {
                item.setNome(p.getNome());
                item.setCPF(p.getCPF());
            }
        }
            
        return true;
    }
    
    public boolean ExcluirCliente(int i)
    {
        Cliente clienteExcluir = new Cliente();
        boolean existeNaLista = false;
        for (Cliente c : listaClientes) {
        
            if(c.getId()==i){
                clienteExcluir = c;
                existeNaLista = true;
            }
        }
        
        if(existeNaLista)
            listaClientes.remove(clienteExcluir);
        
        return true;
    }
    
    
}
