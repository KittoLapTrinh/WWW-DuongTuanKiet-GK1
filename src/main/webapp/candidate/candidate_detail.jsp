<%@ page import="vn.edu.iuh.fit.wwwduongtuankietgk1.models.Candidate" %>
<%@ page import="vn.edu.iuh.fit.wwwduongtuankietgk1.models.CandidateSkill" %><%--
  Created by IntelliJ IDEA.
  User: Student
  Date: 10/19/2024
  Time: 8:00 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Detail</title>
</head>
<body>
    <h1>Detail</h1>
    <%
        Candidate candidate = (Candidate) request.getAttribute("candidates");
        StringBuilder listSkillLevel = new StringBuilder();
        for(CandidateSkill candidateSkill:
            candidate.getCandidateSkills()){
            listSkillLevel.append(candidateSkill);
        }
        System.out.println(listSkillLevel);
    %>
    <table>
        <tr>
            <td>ID</td>
            <td><%=candidate.getId()%></td>
        </tr>
        <tr>
            <td>LastName</td>
            <td><%=candidate.getLast_name()%></td>
        </tr>
        <tr>
            <td>Phone</td>
            <td><%=candidate.getPhone()%></td>
        </tr>
        <tr>
            <td>List CandidateSkill</td>
            <td><%=candidate.getCandidateSkills()%></td>
        </tr>
    </table>

</body>
</html>
