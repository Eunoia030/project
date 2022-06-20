<<<<<<< HEAD
package com.example.teamproject.domain.vo;

import lombok.Data;
import org.springframework.stereotype.Component;

@Component
@Data
public class FileVO {
    private String fileName;
    private String uploadPath;
    private String uuid;
    private boolean image;
    private Long bno;
}
=======
package com.example.teamproject.domain.vo;

public class FileVO {
    private String Uuid;
    private String Uploadpath;
    private String FileName;
    private String Image;
    private int Bno;
    private int FileSize;
}
>>>>>>> origin/master
