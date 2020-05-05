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
import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;
import util.NewHibernateUtil;

/**
 *
 * @author nuwan
 */
public class savemenu extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String fooname = request.getParameter("foodName");
        String type = request.getParameter("menutype");
        String price = request.getParameter("unitprice");

        Session ss = NewHibernateUtil.getSessionFactory().openSession();
        Transaction tt = ss.beginTransaction();

        pojo.Foodrecipie nn = new pojo.Foodrecipie();

        nn.setFoodName(fooname);

        ss.save(nn);

        Query query = ss.createQuery("from Foodrecipie order by foodId DESC");
        query.setMaxResults(1);
        pojo.Foodrecipie lastitemz = (pojo.Foodrecipie) query.uniqueResult();

        pojo.Menu nnz = new pojo.Menu();       
        

        nnz.setFoodName(fooname);

        nnz.setMenuType(type);
        nnz.setFoodId(lastitemz.getFoodId());
        nnz.setPrice(Double.parseDouble(price));

        ss.save(nnz);
        tt.commit();

        PrintWriter out = response.getWriter();
        out.write("ok");
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
