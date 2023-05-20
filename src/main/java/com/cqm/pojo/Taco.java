package com.cqm.pojo;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Data;


import java.sql.Date;
import java.util.List;

@Data
public class Taco {
    @NotNull
    @Size(min=5,message="名字的长度至少为5")
    private String name;
    @Size(min=1,message = "你至少选择一种配料")
    private List<String> ingredients;

    private Long id;
    private Date createAt;


}
