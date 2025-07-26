package com.Portify.BackPortify.TypeTemplatesSites.Perssonal;


import java.util.Base64;
import java.util.List;

public class PersonalTopHeader {
    public String html(String name, String description, String history, Base64 image, List<String> hobbies, String instagram, String tiktok){

        String ListaHobbies = hobbies.stream()
                .map(h -> STR."<li>\{h}</li>")
                .reduce("",(a,b) -> a + b);

        String html = STR."""
                 <!DOCTYPE html>
                            <html lang="pt-br">
                            <head>
                            <meta charset="UTF-8" />
                            <meta name="viewport" content="width=device-width, initial-scale=1.0"/>
                            <title>Portfólio - \{name}</title>
                            <link rel="stylesheet" href="style.css">
                            </head>
                            <body>
                
                            <header>
                                <div class="logo">
                                <div class="dot"></div>
                                <h1>\{name}</h1>
                                </div>
                                <nav>
                                <a href="#home">Início</a>
                                <a href="#about">História</a>
                                <a href="#hobbies">Hobbies</a>
                                <a href="#social">Redes</a>
                                </nav>
                            </header>
                
                            <main>
                                <section class="hero" id="home">
                                <div class="profile-pic">
                                    <img src="data:image/png;base64,\{image}" />
                                </div>
                                <div class="bio">
                                    <h2>\{name}</h2>
                                    <p>
                                    \{description}
                                    </p>
                                </div>
                                </section>
                
                                <section class="about" id="about">
                                <h2>Minha História</h2>
                                <p>
                                \{history}
                                </p>
                                </section>
                
                                <section class="hobbies" id="hobbies">
                                <h2>Hobbies e Interesses</h2>
                                <ul>
                                   \{ListaHobbies}
                                </ul>
                                </section>
                
                                <section class="social" id="social">
                                <h2>Minhas Redes</h2>
                                <a href="https://instagram.com/\{instagram}/" target="_blank">Instagram</a>
                                <a href="https://tiktok.com/@\{tiktok}?lang=pt-br" target="_blank">TikTok</a>
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
                                --bg: #f8f8f8;
                                --text: #111;
                                --muted: #555;
                                --primary: \{cor}]};
                                --accent1: \{cor};
                                --accent2: \{cor};
                                --accent3: \{cor};
                            }

                            * {
                                margin: 0;
                                padding: 0;
                                box-sizing: border-box;
                                scroll-behavior: smooth;
                            }

                            body {
                                background: var(--bg);
                                color: var(--text);
                                font-family: 'Segoe UI', sans-serif;
                                line-height: 1.6;
                            }

                            header {
                                position: fixed;
                                width: 100%;
                                top: 0;
                                left: 0;
                                background: rgba(0, 0, 0, 0.096);
                                border-bottom: 1px solid #ddd;
                                z-index: 1000;
                                display: flex;
                                justify-content: space-between;
                                align-items: center;
                                padding: 20px 40px;
                            }

                            .logo {
                                display: flex;
                                align-items: center;
                                gap: 10px;
                            }

                            .logo .dot {
                                width: 12px;
                                height: 12px;
                                background: var(--primary);
                                border-radius: 50%;
                            }

                            .logo h1 {
                                font-size: 1.2rem;
                            }

                            nav a {
                                margin-left: 20px;
                                text-decoration: none;
                                color: var(--muted);
                                font-weight: 500;
                                transition: color 0.3s;
                            }

                            nav a:hover {
                                color: var(--text);
                            }

                            main {
                                padding-top: 100px;
                            }

                            section {
                                max-width: 1100px;
                                margin: 60px auto;
                                padding: 0 20px;
                            }

                            .hero {
                                display: flex;
                                flex-wrap: wrap;
                                gap: 40px;
                                align-items: center;
                                justify-content: center;
                            }

                            .profile-pic {
                                flex: 1 1 300px;
                                max-width: 300px;
                                border-radius: 50%;
                                overflow: hidden;
                                box-shadow: 0 0 12px rgba(0,0,0,0.1);
                            }

                            .profile-pic img {
                                width: 100%;
                                height: auto;
                                display: block;
                            }

                            .bio {
                                flex: 2 1 400px;
                            }

                            .bio h2 {
                                font-size: 2rem;
                                margin-bottom: 10px;
                            }

                            .bio h3 {
                                font-size: 1.1rem;
                                color: var(--muted);
                                margin-bottom: 20px;
                            }

                            .bio p {
                                font-size: 1rem;
                                color: #333;
                            }

                            .about, .hobbies, .social {
                                margin-top: 80px;
                            }

                            .about h2,
                            .hobbies h2,
                            .social h2 {
                                font-size: 1.8rem;
                                margin-bottom: 20px;
                                color: var(--text);
                            }

                            .about p {
                                font-size: 1rem;
                                color: #444;
                            }

                            .hobbies ul {
                                list-style: disc;
                                padding-left: 20px;
                            }

                            .hobbies li {
                                margin-bottom: 8px;
                                color: #333;
                            }

                            .social a {
                                display: inline-block;
                                margin-right: 20px;
                                font-size: 1rem;
                                text-decoration: none;
                                color: var(--text);
                                border: 2px solid var(--primary);
                                border-radius: 30px;
                                padding: 10px 20px;
                                transition: all 0.3s;
                            }

                            .social a:hover {
                                background: var(--primary);
                                color: #fff;
                            }

                            @media (max-width: 768px) {
                                .hero {
                                flex-direction: column;
                                text-align: center;
                                }

                                nav {
                                display: none;
                                }
                            }
                """;

        return css;
    }
}