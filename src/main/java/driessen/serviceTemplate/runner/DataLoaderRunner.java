package driessen.serviceTemplate.runner;

import driessen.serviceTemplate.model.Template;
import driessen.serviceTemplate.repository.TemplateRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.env.ConfigurableEnvironment;
import org.springframework.stereotype.Component;

@Component
public class DataLoaderRunner implements ApplicationRunner {

    @Value("${database.seed}")
    private boolean seedDatabase;


    Logger logger = LoggerFactory.getLogger(DataLoaderRunner.class);

    /* Add repos here and remove templateRepository */
    TemplateRepository templateRepository;


    public DataLoaderRunner(TemplateRepository templateRepository){
        this.templateRepository = templateRepository;
    }


    private boolean shouldSeed(){
        return templateRepository.findAll().size() <= 0;
    }


    @Override
    public void run(ApplicationArguments args)  {
        if(!seedDatabase || !shouldSeed())
        {
            logger.info("Won't seed database, .env property is false or already seeded!");
            return;
        }

        logger.info("Will seed database now!");

        Template newTemplate = new Template();
        newTemplate.setValue("setBySeed!");
        templateRepository.save(newTemplate);

    }

}
