package com.Portify.BackPortify.Models;

import com.Portify.BackPortify.Models.DataModels.ProjectsDataObject;
import lombok.Getter;
import lombok.Setter;

import java.util.Base64;
import java.util.List;

public class ProfessionalModel {
    @Getter @Setter
    private String type;
    @Getter @Setter
    private String name;
    @Getter @Setter
    private String place; //Place é o cargo da pessoa
    @Getter @Setter
    private String description;
    @Getter @Setter
    private String instagram;
    @Getter @Setter
    private String linkedin;
    @Getter @Setter
    private List<String> experiences; //Uma lista de experiencias
    @Getter @Setter
    private List<String> academic; //Uma lista de diplomas
    @Getter @Setter
    private String layout;
    @Getter @Setter
    private String color;
    @Getter @Setter
    private Base64 image;

    @Getter
    private List<ProjectsDataObject> projects;

    public void SetProject(List<ProjectsDataObject> proj){
        this.projects = proj;
    }
}

//Nota: Estou deixando as imagens nos models como base64 mas nao sei se e a forma correta de se colocar, no front a info da imagem esta sendo enviada como base64.
//necessário pesquisar isso