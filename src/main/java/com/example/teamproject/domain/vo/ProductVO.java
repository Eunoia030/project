<<<<<<< HEAD
package com.example.teamproject.domain.vo;


import lombok.Data;
import org.springframework.stereotype.Component;

@Component
@Data
public class ProductVO {
    private Long pno;
    private String name;
    private String pname;
    private String pcate;
    private String title;
    private String content;
    private String price;
    private Long psold;
    private String registerDate;
    private String updateDate;
}
=======
package com.example.teamproject.domain.vo;

public class ProductVO {
    private int Pno;
    private String Name;
    private String Pname;
    private String Title;
    private String Pinfo;
    private String Price;
    private String Psold;
    private String RegisterDate;
    private String UpdateDate;
}
>>>>>>> origin/master
