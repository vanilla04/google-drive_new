package google.drive.domain;

import google.drive.domain.FileUploaded;
import google.drive.DriverApplication;
import javax.persistence.*;
import java.util.List;
import lombok.Data;
import java.util.Date;


@Entity
@Table(name="Drive_table")
@Data

public class Drive  {


    
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    
    
    
    
    
    private Long id;
    
    
    
    
    
    private String uploader;
    
    
    
    
    
    private String fileName;
    
    
    
    
    
    private String fileSize;
    
    
    
    
    
    private String fileType;

    @PostPersist
    public void onPostPersist(){


        FileUploaded fileUploaded = new FileUploaded(this);
        fileUploaded.publishAfterCommit();

    }

    public static DriveRepository repository(){
        DriveRepository driveRepository = DriverApplication.applicationContext.getBean(DriveRepository.class);
        return driveRepository;
    }






}
