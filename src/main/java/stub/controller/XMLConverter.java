package stub.controller;




import org.apache.commons.io.FileUtils;

import java.io.*;

//convert xml to string with relative paths
public class XMLConverter {

    public String convert1() throws IOException {
//        String content = new String(Files.readAllBytes(Paths.get("C:\\Users\\PLatchenkov\\Desktop\\IDEA projects\\StubServerT24\\src\\main\\resources\\XMLs\\Outgoing1.xml")));
//        return content;
//        Path p = Paths.get("C:\\Users\\PLatchenkov\\Desktop\\IDEA projects\\StubServerT24\\src\\main\\resources\\XMLs\\Outgoing1.xml");
//        String file = p.getFileName().toString();

//        InputStream is = new FileInputStream("C:\\Users\\PLatchenkov\\Desktop\\IDEA projects\\StubServerT24\\src\\main\\resources\\TXTs\\Outgoing1.txt");
//        BufferedReader buf = new BufferedReader(new InputStreamReader(is));
//        String line = buf.readLine();
//        StringBuilder sb = new StringBuilder();
//        while(line != null){
//            sb.append(line).append("\n");
//        line = buf.readLine();
//        }

//        File file = new File("C:\\Users\\PLatchenkov\\Desktop\\IDEA projects\\StubServerT24\\src\\main\\resources\\TXTs\\Outgoing1.txt");
//        FileInputStream fis = new FileInputStream(file);
//        byte[] data = new byte[(int) file.length()];
//        fis.read(data);
//        fis.close();

        File file = new File("C:\\Users\\PLatchenkov\\Desktop\\IDEA projects\\StubServerT24\\src\\main\\resources\\XMLs\\Outgoing1.xml");

        String str = FileUtils.readFileToString(file);

        return str;

    }
}
