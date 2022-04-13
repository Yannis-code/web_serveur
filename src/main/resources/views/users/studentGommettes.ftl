<#ftl encoding="utf-8">

<body xmlns="http://www.w3.org/1999/html">

<ul>
    <#list studentGommettes as studentGommette>
        <li>${studentGommette.id} - ${studentGommette.idGommette} /  ${studentGommette.idStudent}  /  ${studentGommette.idTeacher}  / ${studentGommette.reason}</li>
    </#list>
</ul>

</body>

</html>
