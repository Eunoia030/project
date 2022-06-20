<<<<<<< HEAD
package com.example.teamproject.domain.vo;

import lombok.Data;
import org.springframework.stereotype.Component;

@Component
@Data
public class RequestVO {
    private Long rno;
    private String name;
    private String title;
    private String content;
    private String registerDate;
    private String updateDate;
}
=======
package com.example.teamproject.domain.vo;

public class RequestVO {
    private int Rno;
    private String Name;
    private String Title;
    private String Content;
    private String RegisterDate;
    private String UpdateDate;
}
>>>>>>> origin/master
