<#ftl encoding="utf-8">

<body xmlns="http://www.w3.org/1999/html">

<ul>
    <#list gommettes as gommette>
        <li>${gommette.id} - id gommette : ${gommette.idGommette} /  id eleve : ${gommette.idStudent}  / id prof :  ${gommette.idTeacher} / raison : ${gommette.reason}</li>
    </#list>
</ul>

</body>

</html>
