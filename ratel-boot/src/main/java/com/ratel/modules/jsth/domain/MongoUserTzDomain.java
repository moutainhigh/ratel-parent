package com.ratel.modules.jsth.domain;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Setter
@Getter
@Document(collection = "userTz")
public class MongoUserTzDomain extends BaseMongoDocument {

    @Field
    private Double tz;

    @Field
    private String date;

}
