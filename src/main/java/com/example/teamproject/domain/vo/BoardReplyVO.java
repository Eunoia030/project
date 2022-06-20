<<<<<<< HEAD
package com.example.teamproject.domain.vo;

import lombok.Data;
import org.springframework.stereotype.Component;

@Component
@Data
public class BoardReplyVO {
    private Long rno;
    private Long bno;
    private String content;
    private String name;
    private String registerDate;
    private String updateDate;

}
=======
package com.example.teamproject.domain.vo;

public class BoardReplyVO {
    private int Rno;
    private int Bno;
    private String Content;
    private String Name;
    private String RegisterDate;
    private String UpdateDate;

}
>>>>>>> origin/master
