<#ftl encoding="utf-8">

<body xmlns="http://www.w3.org/1999/html">

<ul>
    <#list teachers as teacher>
        <li>${teacher.id} - ${teacher.firstName} ${teacher.lastName} Username : ${teacher.username}  Mdp : ${teacher.password} </li>
    </#list>
</ul>

</body>

</html>
