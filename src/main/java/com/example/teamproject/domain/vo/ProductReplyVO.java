<<<<<<< HEAD
package com.example.teamproject.domain.vo;

import lombok.Data;
import org.springframework.stereotype.Component;

@Component
@Data
public class ProductReplyVO {
    private Long prno;
    private Long pno;
    private String content;
    private String name;
    private String registerDate;
    private String updateDate;
}
=======
package com.example.teamproject.domain.vo;

public class ProductReplyVO {
    private int Prno;
    private int Pno;
    private String Content;
    private String Name;
    private String RegisterDate;
    private String UpdateDate;
}
>>>>>>> origin/master
