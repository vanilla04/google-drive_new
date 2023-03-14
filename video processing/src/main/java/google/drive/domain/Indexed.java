package google.drive.domain;

import google.drive.domain.*;
import google.drive.infra.AbstractEvent;
import lombok.*;
import java.util.*;
@Data
@ToString
public class Indexed extends AbstractEvent {

    private Long id;
    private String fileid;
    private String indexid;
    private String uploader;
}


