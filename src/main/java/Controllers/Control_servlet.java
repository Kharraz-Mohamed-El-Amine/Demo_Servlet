package Controllers;

import Models.Etudiant;
import Models.ListeEtudiant;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "Control_servlet", urlPatterns = {"/Control_servlet"})
public class Control_servlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType("text/html;charset=UTF-8");
        String filiere = request.getParameter("filiere");
        ListeEtudiant le = new ListeEtudiant();
        List<Etudiant> l = le.getByFiliere(filiere);
        for (Etudiant e : l) {
            System.out.println(e);
        }

        request.setAttribute("filier", l);

        request.getRequestDispatcher("/Afficher.jsp?fi=" + filiere)
                .forward(request, response);
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        doPost(request, response);
    }
}