package stub.service;

import org.springframework.stereotype.Service;
import stub.controller.XMLConverter;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


@Service
public class HandlerXmlService  {
    XMLConverter xmlConverter = new XMLConverter();
    public List<String> createXmlList() throws IOException {
        String mapXml = xmlConverter.convert1();

       List<String> list = new ArrayList();
       list.add(mapXml);
       // map.put("XML1", mapXml);

        return list;
    }

}
