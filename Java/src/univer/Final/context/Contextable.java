package univer.Final.context;

import java.io.IOException;

public interface Contextable {
    void write(Object obj) throws IOException;
    Object read() throws  IOException;
}
