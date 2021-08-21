package com.digitalinnovation.experts.productcatalogo.model;


import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Document(indexName = "product")
public class Product {

    @Id
    private Integer    id;
    private String  name;
    private Integer amount;



}
