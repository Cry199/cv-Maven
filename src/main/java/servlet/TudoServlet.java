package servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/cv")
public class TudoServlet extends HttpServlet
{
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException
    {
        // System.out.println("Requisição recebida em TudoServlet");

        req.setAttribute("title", "Currículo - Cauã Ribeiro");
        req.setAttribute("h11", "Cauã Ribeiro");
        req.setAttribute("subtitulo", "Estudante de Análise e Desenvolvimento de Sistemas");
        req.setAttribute("contato1", "(11) 964332-1334");
        req.setAttribute("contato2", "caualeu2016@gmail.com");
        req.setAttribute("contato3", "linkedin.com/in/cauaaraujo199");
        req.setAttribute("contato4", "github.com/Cry199");

        req.setAttribute("h12", "Resumo");
        req.setAttribute("resumo", "Sou um profissional dedicado na área de Tecnologia da Informação, formado como Técnico em Informática pelo Instituto Social Nossa Senhora de Fátima. Busco uma oportunidade de estágio que me permita aplicar meus conhecimentos e continuar desenvolvendo minhas habilidades. Sou uma pessoa calma e determinada, sempre em busca de aprimoramento profissional.");

        req.setAttribute("h13", "Formação Acadêmica");
        req.setAttribute("formacao1", "Tecnólogo em Análise e Desenvolvimento de Sistemas");
        req.setAttribute("formacao2", "Centro Universitário Senac (Cursando)");
        req.setAttribute("formacao3", "Técnico em Informática");
        req.setAttribute("formacao4", "Instituto Social Nossa Senhora de Fátima");

        req.setAttribute("h14", "Certificações");
        req.setAttribute("certificacao1", "AWS Academy Graduate - AWS Academy Cloud Foundations");

        req.setAttribute("h15", "Habilidades");
        req.setAttribute("habilidade1", "Conceitos e Fundamentos:");
        req.setAttribute("habilidade2", "Algoritmos e Programação");
        req.setAttribute("habilidade3", "Orientação a Objetos com Swift");

        req.setAttribute("h16", "Práticas de Cloud Services:");
        req.setAttribute("habilidade4", "AWS CloudFormation");
        req.setAttribute("habilidade5", "Amazon Web Services");
        req.setAttribute("habilidade6", "Microsoft Azure");
        req.setAttribute("habilidade7", "SwiftUI");

        req.setAttribute("h17", "Projetos");
        req.setAttribute("projeto1", "Você pode encontrar alguns dos meus projetos no GitHub, acessando o meu perfil em: <a href=\"https://github.com/Cry199\">https://github.com/Cry199</a>. Lá, você poderá conferir exemplos do meu trabalho e habilidades em ação.");

        req.getRequestDispatcher("cv.jsp").forward(req, resp);
    }
}
