package com.Portify.BackPortify.TypeTemplatesSites.Professional;

import com.Portify.BackPortify.Models.DataModels.ProjectsDataObject;

import java.util.Base64;
import java.util.List;

public class ProfessionalTopHeader {
    public String html(String name, Base64 imagem, String cargo, String description, String intagram, String Linkedin, List<String> experiencias, List<String> academico, List<ProjectsDataObject>projetos){

        String ListaExperiencias = experiencias.stream()
                .map(h->STR."<li><span></span>\{h}</li>")
                .reduce("",(a,b)->a+b);

        String ListaAcademico = academico.stream()
                .map(h->STR."<li><span></span>\{h}</li>")
                .reduce("",(a,b)->a+b);

        String ListaProjeto = projetos.stream()
                .map(h->STR."""
                        <div class="card glass">
                          <h3>\{h.getTitle()}</h3>
                          <p>\{h.getDescription()}</p>
                          <a href="\{h.getLink()}" target="_blank">Ver Projeto</a>\s
                        </div>
                        """)
                .reduce("",(a,b)->a+b);

        String html = STR."""
                 <!DOCTYPE html>
                <html lang="pt-BR">
                <head>
                  <meta charset="UTF-8" />
                  <meta name="viewport" content="width=device-width, initial-scale=1.0"/>
                  <title>Portfólio - \{name}</title>
                  <link rel="stylesheet" href="style.css" />
                </head>
                <body>
                  <header>
                    <nav>
                      <ul>
                        <li><a href="#sobre">Sobre</a></li>
                        <li><a href="#experiencia">Experiência</a></li>
                        <li><a href="#formacao">Formação</a></li>
                        <li><a href="#projetos">Projetos</a></li>
                      </ul>
                    </nav>
                  </header>
                
                  <main>
                    <section id="sobre" class="section full-screen">
                      <div class="container">
                        <img src="data:image/png;base64,\{imagem}" alt="" class="profile-img" />
                        <h1>\{name}</h1>
                        <h2>\{cargo}</h2>
                        <p class="descricao">
                        \{description}
                        </p>
                        <div class="social">
                          <a href="https://www.linkedin.com/in/\{Linkedin}/">LinkedIn</a>
                          <a href="https://www.instagram.com/\{intagram}/">Instagram</a>
                        </div>
                      </div>
                    </section>
                
                   <!-- EXPERIÊNCIA -->
                <section id="experiencia" class="section full-screen light">
                    <div class="container">
                      <h2>Experiências Profissionais</h2>
                      <ul class="timeline">
                      \{ListaExperiencias}
                      </ul>
                    </div>
                  </section>
                
                  <!-- FORMAÇÃO -->
                  <section id="formacao" class="section full-screen">
                    <div class="container">
                      <h2>Formação e Competências Acadêmicas</h2>
                      <ul class="timeline">
                      \{ListaAcademico}
                      </ul>
                    </div>
                  </section>
                
                  <!-- PROJETOS -->
                  <section id="projetos" class="section full-screen light">
                    <div class="container">
                      <h2>Projetos</h2>
                      <div class="cards glass-grid">
                      \{ListaProjeto}
                      </div>
                    </div>
                  </section>
                  </main>
                </body>
                </html>
                
                """;

        return html;
    }

    public String css(String cor){
        String css = STR."""
                
                :root {
                    --cor-primaria: #0A192F;
                    --cor-secundaria: \{cor};
                    --cor-fundo: #F0F4F8;
                    --cor-fundo-clara: #ffffff;
                    --cor-texto: #111;
                    --cor-texto-claro: #fff;
                  }
                
                  * {
                    margin: 0;
                    padding: 0;
                    box-sizing: border-box;
                  }
                
                  body {
                    font-family: 'Segoe UI', sans-serif;
                    background-color: var(--cor-fundo);
                    color: var(--cor-texto);
                    scroll-behavior: smooth;
                  }
                
                  header {
                    background-color: var(--cor-primaria);
                    padding: 1rem 2rem;
                    position: sticky;
                    top: 0;
                    z-index: 999;
                  }
                
                  nav ul {
                    display: flex;
                    justify-content: center;
                    list-style: none;
                    gap: 2rem;
                  }
                
                  nav a {
                    color: var(--cor-secundaria);
                    text-decoration: none;
                    font-weight: 600;
                    transition: 0.3s ease;
                  }
                
                  nav a:hover {
                    color: white;
                  }
                
                  .section {
                    display: flex;
                    align-items: center;
                    justify-content: center;
                    padding: 3rem 2rem;
                    text-align: center;
                  }
                
                  .full-screen {
                    min-height: 100vh;
                  }
                
                  .section.light {
                    background-color: var(--cor-fundo-clara);
                  }
                
                  .container {
                    max-width: 800px;
                    width: 100%;
                  }
                
                  .profile-img {
                    width: 140px;
                    height: 140px;
                    border-radius: 50%;
                    margin-bottom: 1rem;
                    border: 3px solid var(--cor-secundaria);
                  }
                
                  h1 {
                    font-size: 2.5rem;
                    margin-bottom: 0.5rem;
                  }
                
                  h2 {
                    font-size: 1.5rem;
                    color: var(--cor-primaria);
                    margin-bottom: 1rem;
                  }
                
                  .descricao {
                    font-size: 1.1rem;
                    margin: 1rem auto;
                    max-width: 600px;
                  }
                
                  ul {
                    list-style: none;
                    padding-left: 0;
                    margin-top: 1rem;
                    text-align: left;
                  }
                
                  ul li {
                    margin-bottom: 0.5rem;
                    font-size: 1.1rem;
                  }
                
                  .social {
                    margin-top: 1rem;
                    display: flex;
                    justify-content: center;
                    gap: 1.5rem;
                  }
                
                  .social a {
                    color: var(--cor-primaria);
                    text-decoration: none;
                    font-weight: bold;
                    background-color: var(--cor-secundaria);
                    padding: 0.5rem 1rem;
                    border-radius: 5px;
                    transition: 0.3s ease;
                  }
                
                  .social a:hover {
                    opacity: 0.8;
                  }
                
                  /* --- Timeline para Experiência e Formação --- */
                .timeline {
                    list-style: none;
                    padding-left: 0;
                    margin-top: 2rem;
                    position: relative;
                  }
                
                  .timeline li {
                    position: relative;
                    padding-left: 2rem;
                    margin-bottom: 1.2rem;
                    font-size: 1.1rem;
                    line-height: 1.4;
                  }
                
                  .timeline li span {
                    position: absolute;
                    left: 0;
                    top: 0.4rem;
                    width: 10px;
                    height: 10px;
                    background-color: var(--cor-secundaria);
                    border-radius: 50%;
                  }
                
                  /* --- Cards para Projetos --- */
                  .cards {
                    display: grid;
                    grid-template-columns: repeat(auto-fit, minmax(260px, 1fr));
                    gap: 2rem;
                    margin-top: 2rem;
                  }
                
                  .card {
                    background-color: var(--cor-fundo);
                    padding: 1.5rem;
                    border-left: 5px solid var(--cor-secundaria);
                    box-shadow: 0 4px 8px rgba(0,0,0,0.05);
                    border-radius: 8px;
                    transition: transform 0.2s ease;
                  }
                
                  .card:hover {
                    transform: translateY(-5px);
                  }
                
                  .card h3 {
                    margin-bottom: 0.5rem;
                    color: var(--cor-primaria);
                  }
                
                  .card p {
                    font-size: 0.95rem;
                    margin-bottom: 1rem;
                  }
                
                  .card a {
                    background-color: var(--cor-secundaria);
                    color: var(--cor-primaria);
                    text-decoration: none;
                    padding: 0.4rem 0.8rem;
                    border-radius: 4px;
                    font-weight: bold;
                    display: inline-block;
                  }
                  /* --- Glassmorphism Cards em Grid Responsivo --- */
                .glass-grid {
                    display: grid;
                    grid-template-columns: repeat(auto-fit, minmax(280px, 1fr));
                    gap: 2rem;
                    margin-top: 2rem;
                  }
                
                  .card.glass {
                    background: rgba(45, 57, 59, 0.1);
                    border: 1px solid rgba(0, 0, 0, 0.2);
                    backdrop-filter: blur(12px);
                    -webkit-backdrop-filter: blur(12px);
                    border-radius: 12px;
                    padding: 1.5rem;
                    color: var(--cor-texto);
                    box-shadow: 0 8px 24px rgba(0, 0, 0, 0.08);
                    transition: transform 0.3s ease;
                  }
                
                  .card.glass:hover {
                    transform: translateY(-6px);
                  }
                
                  .card.glass h3 {
                    color: var(--cor-primaria);
                    margin-bottom: 0.5rem;
                  }
                
                  .card.glass p {
                    font-size: 1rem;
                    margin-bottom: 1rem;
                  }
                
                  .card.glass a {
                    display: inline-block;
                    text-decoration: none;
                    background-color: var(--cor-secundaria);
                    color: var(--cor-primaria);
                    font-weight: bold;
                    padding: 0.5rem 1rem;
                    border-radius: 6px;
                    transition: background-color 0.3s ease;
                  }
                
                  .card.glass a:hover {
                    background-color: #52e2c1;
                  }
                
                  /* Suporte a telas menores */
                  @media (max-width: 600px) {
                    .card.glass {
                      padding: 1rem;
                    }
                  }
                
                """;

        return css;
    }
}
