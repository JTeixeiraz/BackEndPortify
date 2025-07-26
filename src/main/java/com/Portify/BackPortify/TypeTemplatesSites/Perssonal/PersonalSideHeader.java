package com.Portify.BackPortify.TypeTemplatesSites.Perssonal;

import java.util.Base64;
import java.util.List;

public class PersonalSideHeader {
    public String html(String name, String description, String history, Base64 image, List<String>hobbies, String instagram, String tiktok){

        String ListaHobbies = hobbies.stream()
                .map(h -> STR."<li>\{h}</li>")
                .reduce("", (a,b)->a+b);

        String html = STR."""
                <!DOCTYPE html>
                <html lang="pt-br">
                <head>
                  <meta charset="UTF-8" />
                  <meta name="viewport" content="width=device-width, initial-scale=1.0"/>
                  <title>Portfólio - \{name}</title>
                  <link rel="stylesheet" href="style.css" />
                </head>
                <body>
                  <div class="container">
                    <aside class="sidebar">
                      <div class="name-container">
                        <span class="dot"></span>
                        <h1 class="name">\{name}</h1>
                      </div>
                      <nav>
                        <a href="#about">Sobre</a>
                        <a href="#hobbies">Hobbies</a>
                        <a href="#social">Redes</a>
                      </nav>
                    </aside>
                
                    <main class="content">
                      <section class="profile" id="about">
                        <img src="data:image/png;base64,\{image}" />
                        <h2>Sobre Mim</h2>
                        <p>
                          \{history}
                        </p>
                      </section>
                
                      <section id="hobbies">
                        <h2>Hobbies</h2>
                        <ul>
                          \{ListaHobbies}
                        </ul>
                      </section>
                
                      <section id="social">
                        <h2>Redes Sociais</h2>
                        <p><a href="https://instagram.com/\{instagram}/" target="_blank">Instagram</a></p>
                        <p><a href="https://tiktok.com/@\{tiktok}?lang=pt-br" target="_blank">TikTok</a></p>
                      </section>
                    </main>
                  </div>
                </body>
                </html>
                """;

        return html;
    }
    public String css(String cor){
        String css = STR."""
                  :root {
                    --primary-color: \{cor};
                    --text-dark: #222;
                    --text-medium: #444;
                    --text-light: #666;
                    --bg-color: #fafafa;
                    --card-bg: \{cor};
                    --border-color: \{cor};
                    --transition-speed: 0.3s;
                  }
                
                  * {
                    margin: 0;
                    padding: 0;
                    box-sizing: border-box;
                  }
                
                  html {
                    font-size: 16px;
                  }
                
                  body {
                    font-family: 'Inter', sans-serif;
                    background-color: var(--bg-color);
                    color: var(--text-medium);
                    display: flex;
                    min-height: 100vh;
                    line-height: 1.6;
                  }
                
                  .container {
                    display: flex;
                    width: 100%;
                  }
                
                  .sidebar {
                    width: 250px;
                    padding: 2.5rem 1.75rem;
                    background-color: var(--card-bg);
                    border-right: 1px solid var(--border-color);
                    display: flex;
                    flex-direction: column;
                    gap: 3rem;
                    position: sticky;
                    top: 0;
                    height: 100vh;
                    box-shadow: 0 0 10px rgba(0, 0, 0, 0.03);
                  }
                
                  .name-container {
                    display: flex;
                    align-items: center;
                    gap: 0.8rem;
                  }
                
                  .dot {
                    width: 12px;
                    height: 12px;
                    background-color: var(--primary-color);
                    border-radius: 50%;
                    transition: transform var(--transition-speed);
                  }
                
                  .name-container:hover .dot {
                    transform: scale(1.2);
                  }
                
                  .name {
                    font-size: 1.4rem;
                    font-weight: 600;
                    color: var(--text-dark);
                    letter-spacing: -0.01em;
                  }
                
                  nav {
                    display: flex;
                    flex-direction: column;
                    gap: 1.25rem;
                  }
                
                  nav a {
                    text-decoration: none;
                    color: var(--text-light);
                    font-size: 1rem;
                    transition: all var(--transition-speed);
                    position: relative;
                    padding: 0.5rem 0;
                  }
                
                  nav a::after {
                    content: '';
                    position: absolute;
                    bottom: 0;
                    left: 0;
                    width: 0;
                    height: 2px;
                    background-color: var(--primary-color);
                    transition: width var(--transition-speed);
                  }
                
                  nav a:hover {
                    color: var(--text-dark);
                    transform: translateX(4px);
                  }
                
                  nav a:hover::after {
                    width: 20px;
                  }
                
                  .content {
                    flex: 1;
                    padding: 3.5rem 5rem;
                    overflow-y: auto;
                    max-width: 1000px;
                  }
                
                  section {
                    margin-bottom: 4rem;
                    animation: fadeIn 0.5s ease-in-out;
                  }
                
                  @keyframes fadeIn {
                    from {
                      opacity: 0;
                      transform: translateY(10px);
                    }
                    to {
                      opacity: 1;
                      transform: translateY(0);
                    }
                  }
                
                  .profile-img {
                    width: 160px;
                    height: 160px;
                    object-fit: cover;
                    border-radius: 50%;
                    margin-bottom: 1.5rem;
                    box-shadow: 0 4px 15px rgba(0, 0, 0, 0.1);
                    border: 4px solid white;
                    transition: transform var(--transition-speed);
                  }
                
                  .profile-img:hover {
                    transform: scale(1.05);
                  }
                
                  h2 {
                    font-size: 1.25rem;
                    font-weight: 600;
                    margin-bottom: 1.2rem;
                    color: var(--text-dark);
                    position: relative;
                    padding-bottom: 0.6rem;
                  }
                
                  h2::after {
                    content: '';
                    position: absolute;
                    bottom: 0;
                    left: 0;
                    width: 40px;
                    height: 3px;
                    background-color: var(--primary-color);
                  }
                
                  p, li {
                    font-size: 1rem;
                    line-height: 1.8;
                    color: var(--text-medium);
                    margin-bottom: 1rem;
                  }
                
                  ul {
                    list-style: none;
                    padding-left: 0.5rem;
                    margin: 1rem 0;
                  }
                
                  li {
                    position: relative;
                    padding-left: 1.5rem;
                    margin-bottom: 0.7rem;
                  }
                
                  li::before {
                    content: '';
                    position: absolute;
                    left: 0;
                    top: 0.75rem;
                    width: 6px;
                    height: 6px;
                    border-radius: 50%;
                    background-color: var(--primary-color);
                  }
                
                  a {
                    color: var(--primary-color);
                    text-decoration: none;
                    font-weight: 500;
                    transition: color var(--transition-speed);
                  }
                
                  a:hover {
                    color: \{cor};
                    text-decoration: none;
                  }
                
                  /* Responsividade */
                  @media (max-width: 1200px) {
                    .content {
                      padding: 3rem 4rem;
                    }
                  }
                
                  @media (max-width: 900px) {
                    .container {
                      flex-direction: column;
                    }
                
                    .sidebar {
                      width: 100%;
                      height: auto;
                      position: relative;
                      padding: 2rem;
                      border-right: none;
                      border-bottom: 1px solid var(--border-color);
                    }
                
                    .content {
                      padding: 2rem;
                    }
                  }
                
                  @media (max-width: 600px) {
                    html {
                      font-size: 14px;
                    }
                
                    .content {
                      padding: 1.5rem;
                    }
                
                    .profile-img {
                      width: 120px;
                      height: 120px;
                    }
                  }
                
                """;
        return css;
    }
}
