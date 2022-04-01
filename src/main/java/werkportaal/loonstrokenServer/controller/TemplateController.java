package werkportaal.loonstrokenServer.controller;

import werkportaal.loonstrokenServer.model.Template;
import werkportaal.loonstrokenServer.repository.TemplateRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.*;

@RestController
public class TemplateController {

    TemplateRepository templateRepository;

    public TemplateController(TemplateRepository templateRepository){
        this.templateRepository = templateRepository;
    }


    @GetMapping("/set")
    public String set(){
        Template t = new Template();
        t.setValue("Time: " + new Date());
        templateRepository.save(t);
        return t.getValue();
    }

    @GetMapping("/get")
    public List<Template> get(){
        List<Template> found = templateRepository.findAll();
        return found;


    }
}
