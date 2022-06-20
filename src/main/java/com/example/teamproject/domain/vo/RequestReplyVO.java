<<<<<<< HEAD
package com.example.teamproject.domain.vo;

import lombok.Data;
import org.springframework.stereotype.Component;

@Component
@Data
public class RequestReplyVO {
    private Long rrno;
    private Long rno;
    private String content;
    private String name;
    private String registerDate;
    private String updateDate;
}
=======
package com.example.teamproject.domain.vo;

public class RequestReplyVO {
    private int Rrno;
    private int Rno;
    private String Content;
    private String Name;
    private String RegisterDate;
    private String UpdateDate;
}
>>>>>>> origin/master
