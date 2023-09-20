package com.example.eurekaclient.documents;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Document(value = "universities")
public class University {
    @Id
    private String id;

    private String name;
    private String type;
    private String region;
    private String city;
    private String phoneNumber;
    private String email;
    private String admCommEmail;
    private String website;
    private String address;
    private String post;
    private String director;
}