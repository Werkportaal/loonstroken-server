package Werkportaal.loonstrokenserver.controller;

import Werkportaal.loonstrokenserver.model.Loonstroken;
import Werkportaal.loonstrokenserver.service.LoonstrokenService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/loonstroken")
public class LoonstrokenController {

    LoonstrokenService loonstrokenService;

    public LoonstrokenController(LoonstrokenService loonstrokenService) {this.loonstrokenService = loonstrokenService;}

    @GetMapping("/get")
    public List<Loonstroken> get(){
        List<Loonstroken> found = loonstrokenService.findAll();
        return found;
    }
}
