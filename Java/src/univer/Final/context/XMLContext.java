package univer.Final.context;

import java.beans.XMLDecoder;
import java.beans.XMLEncoder;
import java.io.*;

public class XMLContext implements Contextable{
    private String path;

    public XMLContext(String path) {
        this.path = path;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    @Override
    public Object read() throws IOException {
        try(XMLDecoder in = new XMLDecoder(
                new ObjectInputStream(
                        new FileInputStream(path)
                )
        )){
            return in.readObject();
        }
    }

    @Override
    public void write(Object obj) throws IOException{
        try (XMLEncoder out = new XMLEncoder(
                new ObjectOutputStream(
                        new FileOutputStream(path)))) {
            out.writeObject(obj);
        }
    }
}
