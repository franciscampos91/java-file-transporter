package Classes;

public abstract class ClienteModelo {
	private String ipDoServidor;
	private int porta;
	
	public ClienteModelo(String ipDoServidor_, int porta_){
		this.ipDoServidor = ipDoServidor_;
		this.porta = porta_;
	}
	
	public String getIpDoServidor(){
		return this.ipDoServidor;
	}
	
	public int getPorta(){
		return this.porta;
	}
	
	public void setIpDoServidor(String ipDoServidor_){
		this.ipDoServidor = ipDoServidor_;
	}
	
	public void setPorta(int porta_){
		this.porta = porta_;
	}
        
	public abstract void enviaArquivo(String path);
}
