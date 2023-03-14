package google.drive.domain;

import google.drive.domain.Streamed;
import google.drive.VideoProcessingApplication;
import javax.persistence.*;
import java.util.List;
import lombok.Data;
import java.util.Date;


@Entity
@Table(name="Stream_table")
@Data

public class Stream  {


    
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    
    
    
    
    
    private Long id;
    
    
    
    
    
    private String fileid;
    
    
    
    
    
    private String videoUrl;
    
    
    
    
    
    private String uploader;

    @PostPersist
    public void onPostPersist(){


        Streamed streamed = new Streamed(this);
        streamed.publishAfterCommit();

    }

    public static StreamRepository repository(){
        StreamRepository streamRepository = VideoProcessingApplication.applicationContext.getBean(StreamRepository.class);
        return streamRepository;
    }




    public static void ifVideoStream(Indexed indexed){

        /** Example 1:  new item 
        Stream stream = new Stream();
        repository().save(stream);

        */

        /** Example 2:  finding and process
        
        repository().findById(indexed.get???()).ifPresent(stream->{
            
            stream // do something
            repository().save(stream);


         });
        */

        
    }


}
