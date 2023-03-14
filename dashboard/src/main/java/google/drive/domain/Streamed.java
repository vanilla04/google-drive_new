package google.drive.domain;

import google.drive.infra.AbstractEvent;
import lombok.Data;
import java.util.*;


@Data
public class Streamed extends AbstractEvent {

    private Long id;
    private String fileid;
    private String videoUrl;
    private String uploader;
}
