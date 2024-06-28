package Classes;

import java.net.*;
import java.io.*;
import javax.swing.JOptionPane;

public class Cliente extends ClienteModelo {

	public Cliente(String ipDoServidor, int porta) {
		super(ipDoServidor, porta);
	}
        
	@Override
	public void enviaArquivo(String path){
	    File f = new File(path);
	    try {
	      Socket socket = new Socket(this.getIpDoServidor(), this.getPorta());
	      ObjectOutputStream out = new ObjectOutputStream(socket.getOutputStream());
	      JOptionPane.showMessageDialog(null, "Transferindo o arquivo: " + f.getName());
	      JOptionPane.showMessageDialog(null, "Aguarde um momento...");
	      out.writeUTF(f.getName());
	      out.writeLong(f.length());
	      FileInputStream in = new FileInputStream(f);
	      byte[] buf = new byte[4096];
	      
	      while(true) {
	        int len = in.read(buf);
	        if(len == -1) break;
	        out.write(buf, 0, len); 
	      }
	      out.close();
	      socket.close();
	      JOptionPane.showMessageDialog(null, "Tranferência concluída!");
	    } catch(Exception e) {
	      e.printStackTrace();
              JOptionPane.showMessageDialog(null, "O número do IP esta incorreto ou esta desconectado");
	    }
	}
}