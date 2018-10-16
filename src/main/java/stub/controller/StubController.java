package stub.controller;


import com.sun.xml.internal.bind.XmlAccessorFactory;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import stub.service.HandlerXmlService;

import java.io.IOException;
import java.util.List;

@Controller
public class StubController {

    private XMLConverter xmlConverter = new XMLConverter();
    private HandlerXmlService handlerXmlService;

    public StubController(HandlerXmlService handlerXmlService) {
        this.handlerXmlService = handlerXmlService;
    }

    @GetMapping("/home")
    @ResponseBody
    public String getXml1() throws IOException {
        return xmlConverter.convert1();
    }


    @GetMapping("/list")
    @ResponseBody
    public List<String> greeting() throws  IOException {
        return handlerXmlService.createXmlList();
    }

    @GetMapping("/string")
    @ResponseBody

    public String getString() throws IOException {
        return handlerXmlService.createXmlList().get(0);
    }

}
