package google.drive.infra;
import google.drive.domain.*;

import org.springframework.hateoas.Link;
import org.springframework.hateoas.server.RepresentationModelProcessor;
import org.springframework.stereotype.Component;
import org.springframework.hateoas.EntityModel;

@Component
public class StreamHateoasProcessor implements RepresentationModelProcessor<EntityModel<Stream>>  {

    @Override
    public EntityModel<Stream> process(EntityModel<Stream> model) {

        
        return model;
    }
    
}
