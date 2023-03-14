package google.drive.domain;

import google.drive.domain.*;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel="nofities", path="nofities")
public interface NofityRepository extends PagingAndSortingRepository<Nofity, Long>{

}
