package google.drive.infra;
import google.drive.domain.*;

import org.springframework.hateoas.Link;
import org.springframework.hateoas.server.RepresentationModelProcessor;
import org.springframework.stereotype.Component;
import org.springframework.hateoas.EntityModel;

@Component
public class NofityHateoasProcessor implements RepresentationModelProcessor<EntityModel<Nofity>>  {

    @Override
    public EntityModel<Nofity> process(EntityModel<Nofity> model) {

        
        return model;
    }
    
}
