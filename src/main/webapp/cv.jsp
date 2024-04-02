<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="pt-br">
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>${title}</title>
    <link rel="stylesheet" href="cv.css">
</head>
<body>
<header>
    <h1>${h11}</h1>
    <p>${subtitulo}</p>
    <ul class="contato">
        <li><a href="tel:+551112223"><i class="fa fa-phone"></i>${contato1}</a></li>
        <li><a href="mailto:caualeu2016@gmail.com"><i class="fa fa-envelope"></i>${contato2}</a></li>
        <li><a href="https://www.linkedin.com/in/cauaaraujo199"><i class="fa fa-linkedin"></i>${contato3}</a></li>
        <li><a href="https://github.com/Cry199"><i class="fa fa-github"></i>${contato4}</a></li>
    </ul>
</header>

<main>
    <section class="resumo">
        <h2>${h12}</h2>
        <p>${resumo}</p>
    </section>

    <section class="formacao">
        <h2>${h13}</h2>
        <ul>
            <li>
                <strong>${formacao1}</strong>
                <p>${formacao2}</p>
            </li>
            <li>
                <strong>${formacao3}</strong>
                <p>${formacao4}</p>
            </li>
        </ul>
    </section>

    <section class="certificacoes">
        <h2>${h14}</h2>
        <ul>
            <li>${certificacao1}</li>
        </ul>
    </section>

    <section class="habilidades">
        <h2>${h15}</h2>
        <h3>${habilidade1}</h3>
        <ul>
            <li>${habilidade2}</li>
            <li>${habilidade3}</li>
        </ul>
        <h3>${h16}</h3>
        <ul>
            <li>${habilidade4}</li>
            <li>${habilidade5}</li>
            <li>${habilidade6}</li>
            <li>${habilidade7}</li>
        </ul>
    </section>

    <section class="projetos">
        <h2>${h17}</h2>
        <p>${projeto1}</p>
    </section>
</main>
</body>
</html>