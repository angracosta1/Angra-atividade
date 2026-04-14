/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.atividade06;

/**
 *
 * @author angra
 */
public class ContaBanco {
 //atributos
    public int numConta;
    protected String tipo;
    private String dono;
    private float saldo;
    private boolean status;
    //Metodos personalizados
    public void estadoAtual(){
        System.out.println("-------------");
          System.out.println("Conta:" + this.getNumConta());
           System.out.println("Tipo:" + this.getTipo());
            System.out.println("Dono:" + this.getDono());
             System.out.println("Saldo:" + this.getSaldo());
              System.out.println("Status:" + this.getStatus());
    }
    public void abrirConta(String t){
        this.setTipo(t);
        this.setStatus(true);
        if ("cc".equals(t)){
            this. setSaldo(50);
    }else if ("cp".equals(t)){
        this.setSaldo(150);
    }
        System.out.println("conta aberta com sucesso!");
    }
    public void feicharConta(){
       if (this.getSaldo() > 0){
           System.out.println("Conta nao pode ser fechada  porque ainda tem saldo");
       }else if (this.getSaldo() < 0){
           System.out.println("Conta nao pode se fechada pois tem débito");
       } else
           this.setStatus(false);
           System.out.println("Conta fechada com sucesso!");
    
    }
    public void depositar(float v){
      if (this.getStatus()) {
          //This.Saldo = this.Saldo + v;
          this.setSaldo(this.getSaldo() + v);
          System.out.println("Deposito realizado na conta de " + this.getDono());
      }else {
          System.out.println("Impossivel depositar em sua conta fechada!");
      } 
    }
    public void sacar(float v){
       if (this.getStatus()){
          if (this.getSaldo() >= v){
              this.setSaldo(this.getSaldo()- v);
              System.out.println("Saque realizado na conta de " + this.getDono());
          }else {
              System.out.println("Saldo insuficiente para saque");
              
          } 
       } else{
           System.out.println("Impossivel sacar de uma conta fechada!");
       }
    }
    public  void pagarMensalidade(){
        int v = 0;
        if ("cc".equals(this.getTipo())){
            v = 12;
        } else if ("cp".equals(this.getTipo())){
            v = 20;
        }
        if (this.getStatus()){
            this.setSaldo(this.getSaldo() - v);
            System.out.println("Mensalidade paga com sucesso por" + this.getDono());
        } else{
            System.out.println("impossivel pagar uma conta fechada!");
        }
    }
    //Metodos especiais
    public ContaBanco(){
    this.saldo = 0;
    this.status = false;
}

    public int getNumConta() {
        return numConta;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDono() {
        return dono;
    }

    public void setDono(String dono) {
        this.dono = dono;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public boolean getStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
}
