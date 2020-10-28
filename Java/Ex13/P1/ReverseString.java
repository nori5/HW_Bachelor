import java.io.*;

public class ReverseString{
    public static void main(String[] args) throws IOException{
	FileInputStream in = null;
	FileOutputStream out = null;
	byte arr[] = new byte[2048];
	int i;
	try{
	    in = new FileInputStream("input.txt");
	    out = new FileOutputStream("outagain.txt");
	    i = in.read(arr) - 1;
	    while(i >= 0){
		out.write(arr[i]);
		i--;
	    }
	}finally{
	    if(in != null){
		in.close();
	    }
	    if(out !=null){
		out.close();
	    }
	}
    }
}