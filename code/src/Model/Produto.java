package Model;

import java.util.*;
import DAO.ProdutoDAO;
import java.sql.SQLException;

public class Produto {
    
    private int id;
    private String nome;
    private int quantidade;
    private String descricao;
    private double preco;
    private String data;
    private double total;
    private final ProdutoDAO dao;
    
    public Produto() {
        this.dao = new ProdutoDAO();
    }
    
    public Produto(
            int id,
            String nome,
            String descricao,
            int quantidade,
            double preco,
            String data
    ){
        this.id = id;
        this.nome = nome;
        this.quantidade = quantidade;
        this.descricao = descricao;
        this.preco = preco;
        this.data = data;
        this.dao = new ProdutoDAO();
    }

    public Produto(
            int id,
            String nome,
            String descricao,
            int quantidade,
            double preco,
            String data,
            double total
    ){
        this.id = id;
        this.nome = nome;
        this.quantidade = quantidade;
        this.descricao = descricao;
        this.preco = preco;
        this.data = data;
        this.total = total;
        this.dao = new ProdutoDAO();
    }
    
    public int getId() {
        return this.id;
    }
    
    public void setId(int id) {
        this.id = id;
    }
    
    public String getNome() {
        return this.nome;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }
    
     public String getDescricao() {
        return this.descricao;
    }
    
    public void setDescricao(String nome) {
        this.descricao = descricao;
    }

    public int getQuantidade() {
        return this.quantidade;
    }

    public void setQuantidade(int curso) {
        this.quantidade = quantidade;
    }

    public double getPreco() {
        return this.preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public String getData() {
        return this.data;
    }

    public void setData(String data) {
        this.data = data;
    }
    
    public double getTotal() {
        return this.total;
    }
    public void setTotal(){
        this.total = total;
    }

    public String toString() {
        return "\n ID: " + this.getId()
                + "\n Nome: " + this.getNome()
                + "\n descricao: " + this.getDescricao()
                + "\n quantidade: " + this.getQuantidade()
                + "\n preco:" + this.getPreco()
                + "\n data:" + this.getData()
                + "\n -----------";
    }

    public ArrayList getMinhaLista() {
        return dao.getMinhaLista();
    }
    
     public ArrayList getMinhaListaOrderBy(String orderBy) {
        return dao.getMinhaListaOrderBy(orderBy);
    }

    public boolean InsertAlunoBD(
            String nome,
            String descricao,
            int quantidade,
            double preco,
            String data
        ) throws SQLException {
        int newid = this.maiorID() + 1;
        Produto objeto = new Produto(newid, nome, descricao, quantidade, preco, data, total);
        dao.InsertAlunoBD(objeto);
        return true;
    }

    public boolean DeleteAlunoBD(int id) {
        dao.DeleteAlunoBD(id);
        return true;
    }

    public boolean UpdateAlunoBD(
            int id,
            String nome,
            String descricao,
            int quantidade, 
            double preco,
            String data
    ) {
        Produto objeto = new Produto(id, nome, descricao, quantidade, preco, data, total);
        dao.UpdateAlunoBD(objeto);
        return true;
    }

    public Produto carregaAluno(int id) {
        dao.carregaAluno(id);
        return null;
    }
    
        public int maiorID() throws SQLException{
        return dao.maiorID();
    }   
}
