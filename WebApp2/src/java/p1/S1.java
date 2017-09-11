package p1;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class S1 extends HttpServlet {
    
    int n1 = 0;
    int n2 = 0;

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
    
     response.setContentType("text/html");   
    //response.setContentType("text/plain;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet S1</title>");            
            out.println("</head>");
            out.println("<body>");
            
            String no1 = request.getParameter("no1");
            String no2 = request.getParameter("no2");
            String operation = request.getParameter("submit");
            
            out.println("<h2>Given Operation is "+operation+"</h2>");
            
            //String msg = request.getParameter("msg");
            if(no1!= null & no2 != null){
                
                int x = Integer.parseInt(no1);
                int y = Integer.parseInt(no2);
                
                int result = 0;
                float res = 0.0F;
                
                switch(operation){
                
                    case "ADD" : result = x + y;
                                out.println("<h3>Addition is "+result+"</h3>");
                                break;
                    
                    case "SUBTRACT" : result = x - y;
                                out.println("<h3>SUBTRACTION is "+result+"</h3>");
                                break;
                    case "MULTIPLY" : result = x * y;
                                out.println("<h3>MULTIPLICATION is "+result+"</h3>");
                                break;
                    case "DIVIDE" : res = x / y;
                                    out.println("<h3>DIVISION is "+res+"</h3>");
                                    break;
                    
                    default : out.println("invalid input");
                         
                }
           
            }
            
            
            out.println("<h3>Click <a href='Login'>here</a> to Register!</3>");
//            for(int i = 0; i < c; i++){
//                out.println("<h1></h1>"+msg);
//            }
            
            
            out.println("<h1>Servlet S1 at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
