import java.io.FileOutputStream;
import java.io.IOException;

public class AdapterFileOutputStream implements AmigoStringWriter {
    private FileOutputStream fs;
    public AdapterFileOutputStream(FileOutputStream fs){
        this.fs=fs;
    }
    public void flush() throws IOException{
        this.fs.flush();
    }
    public void writeString(String s)throws IOException{
        this.fs.write(s.getBytes());
    }
    public void close()throws IOException{
        this.fs.close();
    }
}
