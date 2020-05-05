/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package srvs;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author nuwan
 */
public class updmenuprice extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {

            String untprice = request.getParameter("untp");
            HttpSession se = request.getSession();
            pojo.Menu ee = (pojo.Menu) se.getAttribute("updatemenuid");
            
            System.out.println("servelet ekata awaaaaaa");
            Session hibses = util.NewHibernateUtil.getSessionFactory().openSession();
            Transaction tt = hibses.beginTransaction();
            System.out.println("food name"+ ee.getFoodName());
            ee.setPrice(Double.parseDouble(untprice));

            hibses.update(ee);
            tt.commit();
            PrintWriter wr = response.getWriter();
            wr.write("ok");

        } catch (Exception e) {
            e.printStackTrace();
        }
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
