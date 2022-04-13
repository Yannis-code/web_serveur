<#ftl encoding="utf-8">

<body xmlns="http://www.w3.org/1999/html">

<h1> Liste des gommettes de Tous les élève </h1>

<ul>
    <#list studentGommettes as studentGommette>
        <li> ID de la gommette de ${studentGommette.student.firstName} ${studentGommette.student.lastName}  : ${studentGommette.id}<br>
        ${studentGommette.gommette.name} - ${studentGommette.gommette.desc} - couleur : ${studentGommette.gommette.color}<br>
        mise par ${studentGommette.teacher.firstName} ${studentGommette.teacher.lastName}<br>
        raison : ${studentGommette.reason}<br>
        </li><br>
    </#list>
</ul>

</body>

</html>
