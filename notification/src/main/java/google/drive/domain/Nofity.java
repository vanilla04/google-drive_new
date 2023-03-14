package google.drive.domain;

import google.drive.NotificationApplication;
import javax.persistence.*;
import java.util.List;
import lombok.Data;
import java.util.Date;


@Entity
@Table(name="Nofity_table")
@Data

public class Nofity  {


    
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    
    
    
    
    
    private Long id;
    
    
    
    
    
    private String uploader;
    
    
    
    
    
    private String telno;
    
    
    
    
    
    private String contexts;


    public static NofityRepository repository(){
        NofityRepository nofityRepository = NotificationApplication.applicationContext.getBean(NofityRepository.class);
        return nofityRepository;
    }




    public static void notify(Indexed indexed){

        /** Example 1:  new item 
        Nofity nofity = new Nofity();
        repository().save(nofity);

        */

        /** Example 2:  finding and process
        
        repository().findById(indexed.get???()).ifPresent(nofity->{
            
            nofity // do something
            repository().save(nofity);


         });
        */

        
    }
    public static void notify(FileUploaded fileUploaded){

        /** Example 1:  new item 
        Nofity nofity = new Nofity();
        repository().save(nofity);

        */

        /** Example 2:  finding and process
        
        repository().findById(fileUploaded.get???()).ifPresent(nofity->{
            
            nofity // do something
            repository().save(nofity);


         });
        */

        
    }


}
