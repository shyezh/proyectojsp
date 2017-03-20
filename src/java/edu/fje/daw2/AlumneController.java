package edu.fje.daw2;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.ArrayList;

public class AlumneController extends HttpServlet {

    private ArrayList<Main> llistatAlumnes;
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        HttpSession sessio = request.getSession();
        if (sessio.getAttribute("llistatAlumnes")==null)
            llistatAlumnes= new ArrayList<>();
        else
            llistatAlumnes= (ArrayList<Main>) sessio.getAttribute("llistatAlumnes");

       String nom= request.getParameter("nom");
       int temps = Integer.parseInt(request.getParameter("temps"));
       String ntasque1= request.getParameter("ntasque1");
       int dutasque1 = Integer.parseInt(request.getParameter("dutasque1"));
       String ntasque2= request.getParameter("ntasque2");
       int dutasque2 = Integer.parseInt(request.getParameter("dutasque2"));
       String ntasque3= request.getParameter("ntasque3");
       int dutasque3= Integer.parseInt(request.getParameter("dutasque3"));
      
       /** 
       String dtasque1= request.getParameter("dtasque1");
       String rtasque1= request.getParameter("rtasque1");
       String dtasque2= request.getParameter("dtasque2");
       String rtasque2= request.getParameter("rtasque3");
       String dtasque3= request.getParameter("dtasque3");
       String rtasque3= request.getParameter("rtasque3");
       */
     
       Main Main = new Main(nom, temps, ntasque1, dutasque1, ntasque2, dutasque2, ntasque3, dutasque3 );

       llistatAlumnes.add(Main);
       //sessio.setAttribute("llistatAlumnes", llistatAlumnes);
       request.setAttribute("llistatAlumnes", llistatAlumnes);
       RequestDispatcher rd= request.getRequestDispatcher("vistaAlumnes.jsp");

       rd.forward(request, response);


    }
}