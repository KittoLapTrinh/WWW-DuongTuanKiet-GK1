<%@ page import="vn.edu.iuh.fit.wwwduongtuankietgk1.models.Skill" %>
<%@ page import="java.util.List" %><%--
  Created by IntelliJ IDEA.
  User: 1
  Date: 10/21/2024
  Time: 3:27 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <h1>List Skill</h1>
    <table>
        <thead>
            <tr>
                <th>ID</th>
                <th>Field</th>
                <th>Skill Name</th>
                <th>Description</th>
            </tr>
        </thead>
        <tbody>
           <%
                List<Skill> skills = (List<Skill>) request.getAttribute("skills");
                int i = 0;
                for(Skill
                        s: skills){
           %>
           <tr>
               <td><%=s.getId()%></td>
               <td><%=s.getField()%></td>
               <td><%=s.getSkillName()%></td>
               <td><%=s.getDescription()%></td>

           </tr>

           <%
                }
           %>
        </tbody>
    </table>

</body>
</html>
