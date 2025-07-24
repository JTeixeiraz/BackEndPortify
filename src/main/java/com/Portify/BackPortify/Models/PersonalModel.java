package com.Portify.BackPortify.Models;

import lombok.Getter;
import lombok.Setter;

import java.util.Base64;
import java.util.List;

public class PersonalModel {
    @Getter @Setter private String type;
    @Getter @Setter private String name;
    @Getter @Setter private String description;
    @Getter @Setter private String history;
    @Getter @Setter private Base64 image;
    @Getter @Setter private List<String> hobbie;
    @Getter @Setter private String insta;
    @Getter @Setter private String tiktok;
    @Getter @Setter private String color;
    @Getter @Setter private String layout;

}
