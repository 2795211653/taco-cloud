package com.cqm.pojo;

import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Date;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class Order {
    @NotBlank(message = "必须要填写名字")
    private String name;
    @NotBlank(message = "必须要填写街道")
    private String street;
    @NotBlank(message = "必须要填写名字")
    private String city;
    @NotBlank(message = "必须要填写名字")
    private String state;
    @NotBlank(message = "必须要填写名字")
    private String zip;
    @NotBlank(message = "必须要填写名字")
    private String ccNumber;
    @NotBlank(message = "必须要填写名字")
    private String ccExpiration;
    @NotBlank(message = "必须要填写名字")
    private String ccCVV;

    private Long id;
    private Date placedAt;
}
