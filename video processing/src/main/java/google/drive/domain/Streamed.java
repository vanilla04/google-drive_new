package google.drive.domain;

import google.drive.domain.*;
import google.drive.infra.AbstractEvent;
import java.util.*;
import lombok.*;


@Data
@ToString
public class Streamed extends AbstractEvent {

    private Long id;
    private String fileid;
    private String videoUrl;
    private String uploader;

    public Streamed(Stream aggregate){
        super(aggregate);
    }
    public Streamed(){
        super();
    }
}
