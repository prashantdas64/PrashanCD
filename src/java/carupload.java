import com.cloudinary.Cloudinary;
import com.cloudinary.utils.ObjectUtils;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Map;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;
import carupload.cargettersetter;
import carupload.carinterImpl;
import javax.servlet.annotation.MultipartConfig;

@MultipartConfig(maxFileSize = 10*1024*1024,maxRequestSize = 20*1024*1024,fileSizeThreshold = 5*1024*10)

public class carupload extends HttpServlet {
       
protected void processRequest(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
     response.setContentType("text/html;charset=UTF-8");
      try (PrintWriter out = response.getWriter()) {
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet carupload</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("</body>");
            out.println("</html>");
            
            String name=request.getParameter("name");
            String price=request.getParameter("price");
            String username=request.getParameter("username");

            Part p = request.getPart("image");
            byte b[] =new byte [p.getInputStream().available()];
            p.getInputStream().read(b);
        
        System.out.println(this.getServletContext().getRealPath("/"));
        File f = new File(this.getServletContext().getRealPath("/")+"/image.jpg");
         try (FileOutputStream fos = new FileOutputStream(f)) {
             fos.write(b);
         }    
 
         //this is a cloudnery file
        Cloudinary cloudinary = new Cloudinary(ObjectUtils.asMap(
                "cloud_name","dkkvr9rmu",
                "api_key", "862438598469599",
                "api_secret","6oLNcyWD1vEsYcA6PZ6AgplwEI4"));

        Map uploadResult=cloudinary.uploader().upload(f,ObjectUtils.emptyMap());
        System.out.println(uploadResult.get("secure_url"));
        
        String image=uploadResult.get("secure_url").toString();
        cargettersetter cgs = new cargettersetter();
        cgs.setCarname(name);
        cgs.setCarprice(price);
        cgs.setCarimage(image);
        carinterImpl impl=new carinterImpl();
        impl.insert(cgs);
        
        response.sendRedirect("sale_products.jsp");
        }
    }
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }

}
