import java.io.File;
import java.io.RandomAccessFile;
import java.util.Base64;

import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

public class Form {

	final static String ALGO =  "AES";
	final static byte[] CHAVE = "ChaveSecreta1234".getBytes();
	
	public static void main(String[] args) throws Exception {
		
		File file = new File("arquivo.txt");
		RandomAccessFile raf = new RandomAccessFile(file, "rw");
		byte[] dados = new byte[(int)raf.length()];
		raf.readFully(dados);
		
		SecretKeySpec key = new SecretKeySpec(CHAVE, ALGO);
		Cipher cifrador = Cipher.getInstance(ALGO);
		cifrador.init(Cipher.ENCRYPT_MODE, key);
		byte[] doFinal = cifrador.doFinal(dados);
		byte[] encode = Base64.getEncoder().encode(doFinal);
		String textoCifrado = new String(encode); 
		raf.seek(0);
		raf.writeUTF(textoCifrado);
		raf.close();
		System.out.println("cifrado: "+textoCifrado);
		
		cifrador.init(Cipher.DECRYPT_MODE, key);
		byte[] decode = Base64.getDecoder().decode(textoCifrado);
		byte[] doFinal2 = cifrador.doFinal(decode);
		System.out.println("nao cifrado: "+ new String(doFinal2));
		
	}

}
