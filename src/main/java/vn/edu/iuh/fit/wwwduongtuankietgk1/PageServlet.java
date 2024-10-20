package vn.edu.iuh.fit.wwwduongtuankietgk1;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import vn.edu.iuh.fit.wwwduongtuankietgk1.models.Candidate;
import vn.edu.iuh.fit.wwwduongtuankietgk1.models.Job;
import vn.edu.iuh.fit.wwwduongtuankietgk1.models.Skill;
import vn.edu.iuh.fit.wwwduongtuankietgk1.services.CandidateService;
import vn.edu.iuh.fit.wwwduongtuankietgk1.services.JobService;
import vn.edu.iuh.fit.wwwduongtuankietgk1.services.SkillService;
import vn.edu.iuh.fit.wwwduongtuankietgk1.services.impl.CandidateServiceImpl;
import vn.edu.iuh.fit.wwwduongtuankietgk1.services.impl.JobServiceImpl;
import vn.edu.iuh.fit.wwwduongtuankietgk1.services.impl.SkillServiceImpl;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

@WebServlet(name = "pageServlet", value = "/page")
public class PageServlet extends HttpServlet {
    private String message;

    public void init() {
        message = "Hello World!";
    }
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        try{
            String action = req.getParameter("action");
            if(action == null){
                PrintWriter out = resp.getWriter();
                out.println("<html><body>");
                out.println("<h1>" + message + "</h1>");
                out.println("</body></html>");
                return;
            }
            switch (action){
                case "home":{
                    PrintWriter out = resp.getWriter();
                    out.println("<html><body>");
                    out.println("<h1> Home </h1>");
                    out.println("</body></html>");
                }
                case "candidate":
                    handleActionCandidate(req, resp);
                    break;
                case "job":
                    handleActionJob(req, resp);
                    break;
                case "skill":
                    handleActionSkill(req, resp);
                case "report1":
                    handleCandidateByLevel(req, resp);
                    break;
                case "report2":
                    handleCandidateHasEmail(req, resp);
                    break;
            }

        }catch (Exception e){
            e.printStackTrace();
        }
    }



    private void forwardToPage(String page, HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getRequestDispatcher(page).include(req, resp);
    }

    private void handleCandidateHasEmail(HttpServletRequest req, HttpServletResponse resp) {
    }

    private void handleCandidateByLevel(HttpServletRequest req, HttpServletResponse resp) {

    }

    private void handleActionCandidate(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        CandidateService service = new CandidateServiceImpl();
        List<Candidate> candidates = service.getAllCandidate();
        req.setAttribute("candidates", candidates);
        String page = "/candidate/candidate.jsp";
        forwardToPage(page, req, resp);
    }

    private void handleActionSkill(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        SkillService service = new SkillServiceImpl();
        List<Skill> skills = service.getAllSkill();
        req.setAttribute("skills", skills);
        String page = "/skill/skill.jsp";
        forwardToPage(page, req, resp);
    }

    private void handleActionJob(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        JobService service = new JobServiceImpl();
        List<Job> jobs = service.getAllJob();
        req.setAttribute("jobs", jobs);
        String page = "/job/job.jsp";
        forwardToPage(page, req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        try{
            String action = req.getParameter("action");
            if(action == null){
                PrintWriter out = resp.getWriter();
                out.println("<html><body>");
                out.println("<h1>" + message + "</h1>");
                out.println("</body></html>");
                return;
            }
            switch (action){
                case "report1":
                    handleReportFillerCandidateByLevel(req,resp);
                    break;
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    private void handleReportFillerCandidateByLevel(HttpServletRequest req, HttpServletResponse resp) {
    }
}
