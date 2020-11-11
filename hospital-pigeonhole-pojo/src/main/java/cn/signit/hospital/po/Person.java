package cn.signit.hospital.po;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;
import org.springframework.stereotype.Repository;

/**
 * 人
 * person
 *
 * @author merlynr
 * @date 2020/11/11
 */
@Data
@Repository
public class Person implements Serializable {
    private Integer id;

    private String first;

    private String last;

    private Date dateofbirth;

    private String placeofbirth;

    private static final long serialVersionUID = 1L;
}