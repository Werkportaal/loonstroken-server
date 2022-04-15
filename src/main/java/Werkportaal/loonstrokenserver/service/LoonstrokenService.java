package Werkportaal.loonstrokenserver.service;

import Werkportaal.loonstrokenserver.model.Loonstroken;
import Werkportaal.loonstrokenserver.repository.LoonstrokenRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LoonstrokenService {

    @Autowired
    private final LoonstrokenRepository loonstrokenRepository;

    public LoonstrokenService(LoonstrokenRepository loonstrokenRepository) {
        this.loonstrokenRepository = loonstrokenRepository;
    }

    public List<Loonstroken> findAll() { return loonstrokenRepository.findAll();}
}
