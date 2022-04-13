package werkportaal.loonstrokenServer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import werkportaal.loonstrokenServer.model.Loonstroken;
import werkportaal.loonstrokenServer.repository.LoonstrokenRepository;

import java.util.List;

@RestController
@RequestMapping("/loonstroken")
public class LoonstrokenController {

    LoonstrokenRepository loonstrokenRepository;

    public LoonstrokenController(LoonstrokenRepository loonstrokenRepository) {this.loonstrokenRepository = loonstrokenRepository;}

    @GetMapping("/get")
    public List<Loonstroken> get(){
        List<Loonstroken> found = loonstrokenRepository.findAll();
        return found;
    }

}
