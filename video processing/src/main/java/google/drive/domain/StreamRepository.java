package google.drive.domain;

import google.drive.domain.*;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel="streams", path="streams")
public interface StreamRepository extends PagingAndSortingRepository<Stream, Long>{

}
